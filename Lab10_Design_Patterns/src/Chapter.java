import java.util.ArrayList;
import java.util.List;

public class Chapter 
{
	public String title;
	public Chapter(String title) 
	{
		this.subChapters = new ArrayList<subChapter>();
		this.title=title;
	}
	
	public List<subChapter> subChapters;
	public Book book;
	
	public int createSubChapterList(String subChapterName) 
	{
		subChapter schp = new subChapter(subChapterName);
		subChapters.add(schp);
		return subChapters.indexOf(schp);
	}
	
	public subChapter getSubChapter(int index)
	{
		return subChapters.get(index);
	}
	
	public String toString() 
	{
		return "Chapter " + title; 
	}
	
	public void print()
	{
		System.out.println("Chapter" + title);
		
		for(subChapter subChapter : subChapters)
		{
			subChapter.print();
		}
	}

	public String getTitle() 
	{
		return title;
	}

	public void setTitle(String title) 
	{
		this.title = title;
	}
	
}
