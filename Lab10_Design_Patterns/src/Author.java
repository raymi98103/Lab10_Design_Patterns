
public class Author {
	
	public String author_name;
	
	public Author(String author_name) 
	{
		this.author_name = author_name;
	}

	@Override
	public String toString() {
		return "Author " + author_name;
	}
	public String getAuthorName() 
	{
		return author_name;
	}
	public void setAuthorName(String author_name) 
	{
		this.author_name = author_name;
	}

	public void print() 
	{
		System.out.println("Author: " + author_name);
	}

}
