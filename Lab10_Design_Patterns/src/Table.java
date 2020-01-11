import java.util.ArrayList;

public class Table implements Element
{
	private String table_name;
	private String oldValue;
    ArrayList<Observer> obsList = new ArrayList<Observer>();
	
	public Table() {

	}

	@Override
	public String toString() {
		return "Table" + table_name;
	}

	public String gettable_name() 
	{
		return table_name;
	}

	public void settable_name(String table_name) 
	{
		this.table_name = table_name;
	}

	public Table(String table_name)
	{
		super();
		this.table_name = table_name;
		obsList.add(DocumentManager.getInstance().getFirstObserver());
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
		System.out.println("Table: " + table_name);
	}
	
	public void setNewValue (String newValue) 
	{
    	this.oldValue = this.table_name;
    	this.table_name = newValue;
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
    		obs.update(this.oldValue,this.table_name);
    	}
    }

}