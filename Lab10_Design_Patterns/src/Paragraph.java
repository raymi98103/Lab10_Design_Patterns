import java.util.ArrayList;

public class Paragraph implements Element
{
	private String paragraph_title;
	private AlignStrategy align;
	private String oldValue;
    private ArrayList<Observer> obsList = new ArrayList<Observer>();
	
	public Paragraph() 
	{
		
	}

	@Override
	public String toString() 
	{
		return "Paragraph" + paragraph_title;
	}

	public String getparagraph_title() 
	{
		return paragraph_title;
	}

	public void setparagraph_title(String paragraph_title) 
	{
		this.paragraph_title = paragraph_title;
	}

	public Paragraph(String paragraph_title) 
	{
		super();
		this.paragraph_title = paragraph_title;
		obsList.add(DocumentManager.getInstance().getFirstObserver());
	}
	
//	public void print() 
//	{
//		System.out.println("Paragraph: " + paragraph_title);
//	}

	public AlignStrategy getAlignStrategy() {
		return align;
	}

	public void setAlignStrategy(AlignStrategy alignStrategy) {
		this.align = alignStrategy;
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

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public void print() 
	{
		if (align != null) 
		{
			align.print(paragraph_title);
		} 
		else 
		{
			System.out.println(paragraph_title);
		}
	}
	
	public void setNewValue(String newValue) {
    	this.oldValue = paragraph_title;
    	this.paragraph_title = newValue;
    	this.notifyObservers();
    }
    
    public void addObserver(Observer ob) {
    	this.obsList.add(ob);
    }
    
    public void removeObserver(Observer ob) {
    	int indexObs = this.obsList.indexOf(ob);
    	this.obsList.remove(indexObs);
    }
    
    public void notifyObservers() {
    	for(Observer obs : this.obsList) {
    		obs.update(this.oldValue,this.paragraph_title);
    	}
    }
	
}