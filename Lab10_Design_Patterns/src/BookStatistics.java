public class BookStatistics implements Visitor 
{
  protected int numberOfImageProxy = 0;
  protected int numberOfParagraphs = 0;
  protected int numberOfImages = 0;
  protected int numberOfSections = 0;
  @SuppressWarnings("unused")
  protected int numberOfBooks = 0;
  protected int numberOfTables = 0;
  
  public void visit(Image image) 
  {
    numberOfImages++;
  }

  public void visit(ImageProxy imageProxy)
  {
	  numberOfImages++;
  }

  public void visit(Paragraph paragraph)
  {
    numberOfParagraphs++;
  }

  public void visit(Table table)
  {
    numberOfTables++;
  }

  public void visit(Book book)
  {
    numberOfBooks++;
  }
  
  public void visit(Section section)
  {
	  numberOfSections++;
  }
  
  public void printStatistics()
  {
	  System.out.println("Book Statistics:");
	  System.out.println("*** Number of images: " + numberOfImages);
	  System.out.println("*** Number of tables: " + numberOfTables);
	  System.out.println("*** Number of paragraphs: " + numberOfParagraphs);
	  System.out.println("*** Number of sections: " + numberOfSections);
	  System.out.println("*** Number of tables: " + numberOfTables);
  }

  
}