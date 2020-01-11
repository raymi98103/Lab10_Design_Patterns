import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Image implements Element 
{
	private String title_image;
	private String imageName;
    private String oldValue;
    ArrayList<Observer> obsList = new ArrayList<Observer>();
    
	@Override
	public String toString() 
	{
		return "Image" + title_image;
	}
	
	public String getNameI() {
		return title_image;
	}
	
	public void setNameI(String title_image) 
	{
		this.title_image = title_image;
	}
	
	public Image(String title_image) 
	{
		super();
		this.title_image = title_image;
		this.obsList.add(DocumentManager.getInstance().getFirstObserver());
		try
		{
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public Image() 
	{
		
	}

	@Override
	public void add(Element element) {
		System.out.println("ERORR");
	}

	@Override
	public void remove(Element element) {
		System.out.println("ERORR");
	}

	@Override
	public Element getElement(int index) {
		System.out.println("ERORR");
		return null;
	}
	
	public void accept(Visitor visitor) 
	{
		visitor.visit(this);
	}
	
	public void print() 
	{
	    System.out.println("Image title: " + title_image);
	}
	
	public void setNewValue(String newValue)
	{
    	this.oldValue = imageName;
    	this.imageName = newValue;
    	this.notifyObservers();
    }
    
    public void addObserver(Observer ob) 
    {
    	this.obsList.add(ob);
    }
    
    public void removeObserver(Observer ob) 
    {
    	int indexObs = this.obsList.indexOf(ob);
    	this.obsList.remove(indexObs);
    }
    
    public void notifyObservers() 
    {
    	for(Observer ob : obsList) 
    	{
    		ob.update(this.oldValue, this.imageName);
    	}
    }

}