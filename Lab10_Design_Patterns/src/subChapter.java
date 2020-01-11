import java.util.ArrayList;
import java.util.List;

public class subChapter {
	public String title;

	public subChapter(String title)
	{
		super();	
		this.title = title;
	}
	
	public List<Paragraph> paragraphs;
	public List<Image> images;
	public List<Table> tables;
	public Chapter chapter;
	private List<Element> elements = new ArrayList<Element>() ; 
	
	public int createParagraphList(String paragraphName)
	{
		Paragraph paragraph = new Paragraph(paragraphName);
		elements.add(paragraph);
		return elements.indexOf(paragraph);
	}
	
	public int createImageList(String imageName)
	{
		Image image = new Image(imageName);
		elements.add(image);
		return elements.indexOf(image);
	}
	
	public int createTableList(String tableName) {
		Table table = new Table(tableName);
		elements.add(table);
		return elements.indexOf(table);
	}	
	
	@Override
	public String toString() {
		return "SubChapter"+ title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void print() 
	{
		System.out.println("Subchapter: " + title);
		for (Element e : elements) 
		{
			e.print();
		}
	}
}
	
