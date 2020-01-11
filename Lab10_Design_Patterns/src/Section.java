import java.util.ArrayList;

public class Section implements Element {

	private String title;

	private ArrayList<Element> content = new ArrayList<Element>();
	private String oldValue;
	private ArrayList<Observer> obsList = new ArrayList<Observer>();
    private String sectionTitle;

	public String getName() 
	{
		return title;
	}

	public void setName(String name) 
	{
		this.title = name;
	}

	public Section(String name) 
	{
		this.title = name;
		content = new ArrayList<Element>();
		obsList.add(DocumentManager.getInstance().getFirstObserver());
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		for (Element element : content) {
			element.accept(visitor);
		}
	}

	public void add(Element element)
	{
		this.content.add(element);
	}


	public void remove(Element element) 
	{
		this.content.remove(element);
	}


	public Element getElement(int index)
	{
		return this.content.get(index);
	}


	public void print() 
	{
		System.out.println(title);

		for (Element e : content)
		{
			e.print();
		}
	}
	
	public void setNewValue (String newValue) 
	{
    	this.oldValue = this.sectionTitle;
    	this.sectionTitle = newValue;
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
    	for(Observer obs : obsList) 
    	{
    		obs.update(this.oldValue,this.sectionTitle);
    	}
    }
}