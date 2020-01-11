
public class DocumentManager {

	public DocumentManager() {
		// TODO Auto-generated constructor stub
		
	}
	
	private static DocumentManager instance= null;
	private  Book book = null;
	private FirstObserver firstObserver = new FirstObserver();
	private SecondObserver secondObserver = new SecondObserver();
	
	public static DocumentManager getInstance() 
	{
		if (instance == null) 
		{
			instance = new DocumentManager();
		}
		return instance;
	}
	
	public void setBook(Book set_book)
	{
		this.book = set_book;
	}
	
	public static Book getBook()
	{
		return instance.book;
	}

	public FirstObserver getFirstObserver() {
		return this.firstObserver;
	}

	public SecondObserver getSecondObserver() {
		return this.secondObserver;
	}
}
