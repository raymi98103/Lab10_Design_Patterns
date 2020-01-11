
public class ImageProxy implements Element {

	private String title_image;
	//private String realImage;
	
	Image image = null;
	
	public ImageProxy(String title_image) 
	{
		// TODO Auto-generated constructor stub
		super();
		this.title_image = title_image;
		//this.realImage = realImage;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void add(Element element) {
		System.out.println("ERORR - IMG PROXY");
	}

	@Override
	public void remove(Element element) {
		System.out.println("ERORR - IMG PROXY");
	}

	@Override
	public Element getElement(int index) {
		System.out.println("ERORR - IMG PROXY");
		return null;
	}
	
	public void accept(Visitor visitor) 
	{
		visitor.visit(this);
	}
	
	@Override
	public void print() 
	{
	    if(this.image == null)
	    {
	    	this.image = new Image(this.title_image);
	    }
	    this.image.print();
	}

}
