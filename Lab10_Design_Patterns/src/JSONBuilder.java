import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONBuilder implements Builder 
{

	private Element document = null;
	private String filename;

	public JSONBuilder(String filename) 
	{
		this.filename = filename;
	}

	public Element getResult() 
	{
		return document;
	}

	public void build() 
	{
		try 
		{
			ObjectMapper mapper = new ObjectMapper();
			HashMap<String, Object> map = mapper.readValue(new File(filename),
					HashMap.class);
			document = processMap(map);
		}
		catch (JsonParseException e)
		{
			e.printStackTrace();
		}
		catch (JsonMappingException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public Element buildSection(HashMap<String, Object> map) 
	{
		Section section = new Section((String)map.get("title"));
		Collection<HashMap<String, Object>> children = (Collection)map.get("children");
		children.forEach((childMap) -> {

			Element e = this.processMap(childMap);
			if (e != null) {
				try {
					section.add(e);
				} catch (Exception var5) {
					var5.printStackTrace();
				}
			}
		});
		return section;
	}

	public Element buildImageProxy(HashMap<String, Object> map) 
	{
		Element imageProxy = new ImageProxy((String) map.get("url"));
		return imageProxy;
	}


	public Element buildImage(HashMap<String, Object> map) 
	{
		Element image = new Image((String) map.get("url"));
		return image;
	}


	public Element buildTable(HashMap<String, Object> map) 
	{
		Element table = new Table((String) map.get("url"));
		return table;
	}


	public Element buildParagraph(HashMap<String, Object> map) 
	{
		Element para = new Paragraph((String) map.get("text"));
		return para;
	}

	private Element processMap(HashMap<String, Object> map) 
	{
		String elementClass = (String) map.get("class");
		Element readElement = null;

		if ("Section".equals(elementClass)) 
		{
			readElement = buildSection(map);
		} 
		else if ("Paragraph".equals(elementClass)) 
		{
			readElement = buildParagraph(map);
		} 
		else if ("Image".equals(elementClass)) 
		{
			readElement = buildImage(map);
		} 
		else if ("ImageProxy".equals(elementClass)) 
		{
			readElement = buildImageProxy(map);
		}
		return readElement;
	}
}