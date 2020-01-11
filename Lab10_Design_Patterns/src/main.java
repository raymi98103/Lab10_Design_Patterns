import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.TransformerFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class main {
	
	public String Author;
	public String Book;
	public String Chapter;
	public String subChapter;
	public int Paragraph;
	public String Image;
	public String Table;
	
	public main(String A, String B, String C, String sC, int P, String I, String T)
	{
		this.Author = A;
		this.Book = B;
		this.Chapter = C;
		this.subChapter = sC;
		this.Image = I;
		this.Table = T;
	}
	
	public static void main(String [] args) throws Exception 
	{
//		Book onEarth = new Book ("On Earth");
//		Author bRaymond = new Author ("Borbely Raymond");
//		onEarth.addAuthor(bRaymond);
//		int indexOfChapter = onEarth.createChapter("Chapter One");
//		Chapter chOne = onEarth.getChapter(indexOfChapter);
//		int indexOfSubChapter = chOne.createSubChapterList("Chapter One One");
//		subChapter chOneOne = chOne.getSubChapter(indexOfSubChapter);
//		int indexOfParagraph = chOneOne.createParagraphList("Paragraph 1");
//		int indexOfImage = chOneOne.createImageList("Image 1");
//		int indexOfParagraph2 = chOneOne.createParagraphList("Paragraph 2");
//		int indexOfParagraph3 = chOneOne.createParagraphList("Paragraph 3");
//		int indexOfTable = chOneOne.createTableList("Table 1");
//		onEarth.print();
		
//		Book bunaZiua = new Book("Buna ziua,oameni buni!");
//		Author bdRaj = new Author("Raj Dominique Borbely");
//		bunaZiua.addAuthor(bdRaj);
//		
//		Section cap1 = new Section("Capitolul 1");
//		Section cap11 = new Section("Capitolul 1.1");
//		Section cap111 = new Section("Capitolul 1.1.1");
//		Section cap1111 = new Section("Capitolul 1.1.1.1");
//		bunaZiua.addContent(new Paragraph("Multumesc celor prezenti!"));
//		bunaZiua.addContent(cap1);
//		cap1.add(new Paragraph("Moto capitol"));
//		cap1.add(cap11);
//		cap11.add(new Paragraph("Text from subchapter 1.1"));
//		cap11.add(cap111);
//		cap111.add(new Paragraph("Text from subchapter 1.1.1"));
//		cap111.add(cap1111);
//		cap1111.add(new Paragraph("Image from subchapter 1.1.1.1"));
//		bunaZiua.print();
		
//		long startTime = System.currentTimeMillis();
//		Image img1 = new Image("Pamela Anderson");
//		Image img2 = new Image("Kim Kardashian");
//		Image img3 = new Image("Kirby Griffin");
//		Section playboyS1 = new Section("Front Cover");
//		playboyS1.add(img1);
//		Section playboyS2 = new Section("Summer Girls");
//		playboyS2.add(img2);
//		playboyS2.add(img3);
//		Book playboy = new Book("Playboy");
//		playboy.addContent(playboyS1);
//		playboy.addContent(playboyS2);
//		long endTime = System.currentTimeMillis();
//		System.out.println("Creation of the content took " + (endTime -
//		startTime) + " milliseconds");
//		startTime = System.currentTimeMillis();
//		playboyS1.print();
//		endTime = System.currentTimeMillis();
//		System.out.println("Printing of the section 1 took " + (endTime -
//		startTime) + " milliseconds");
//		startTime = System.currentTimeMillis();
//		playboyS1.print();
//		endTime = System.currentTimeMillis();
//		System.out.println("Printing again the section 1 took " + (endTime -
//		startTime) + " milliseconds");
		
//		long startTime = System.currentTimeMillis();
//		ImageProxy img1 = new ImageProxy("Pamela Anderson");
//		ImageProxy img2 = new ImageProxy("Kim Kardashian");
//		ImageProxy img3 = new ImageProxy("Kirby Griffin");
//		Section playboyS1 = new Section("Front Cover");
//		playboyS1.add(img1);
//		Section playboyS2 = new Section("Summer Girls");
//		playboyS2.add(img2);
//		playboyS2.add(img3);
//		Book playboy = new Book("Playboy");
//		playboy.addContent(playboyS1);
//		playboy.addContent(playboyS2);
//		long endTime = System.currentTimeMillis();
//		System.out.println("Creation of the content took " + (endTime -
//		startTime) + " milliseconds");
//		startTime = System.currentTimeMillis();
//		playboyS1.print();
//		endTime = System.currentTimeMillis();
//		System.out.println("Printing of the section 1 took " + (endTime -
//		startTime) + " milliseconds");
//		startTime = System.currentTimeMillis();
//		playboyS1.print();
//		endTime = System.currentTimeMillis();
//		System.out.println("Printing again the section 1 took " + (endTime -
//		startTime) + " milliseconds");
		
//		Section cap1 = new Section("Capitolul 1");
//		Paragraph p1 = new Paragraph("Paragraph 1");
//		cap1.add(p1);
//		Paragraph p2 = new Paragraph("Paragraph 2");
//		cap1.add(p2);
//		Paragraph p3 = new Paragraph("Paragraph 3");
//		cap1.add(p3);
//		Paragraph p4 = new Paragraph("Paragraph 4");
//		cap1.add(p4);
//		System.out.println("Printing without Alignment");
//		System.out.println();
//		cap1.print();
//		p1.setAlignStrategy(new CenterStrategy());
//		p2.setAlignStrategy(new RightStrategy());
//		p3.setAlignStrategy(new LeftStrategy());
//		System.out.println();
//		System.out.println("Printing with Alignment");
//		System.out.println();
//		cap1.print();
		
//		Section cap1 = new Section("Capitolul 1");
//		Paragraph p1 = new Paragraph("Paragraph 1");
//		cap1.add(p1);
//		Paragraph p2 = new Paragraph("Paragraph 2");
//		cap1.add(p2);
//		Paragraph p3 = new Paragraph("Paragraph 3");
//		cap1.add(p3);
//		Paragraph p4 = new Paragraph("Paragraph 4");
//		cap1.add(p4);
//		cap1.add(new ImageProxy("ImageOne"));
//		cap1.add(new Image("ImageTwo"));
//		cap1.add(new Paragraph("Some text"));
//		cap1.add(new Table("Table 1"));
//		BookStatistics stats = new BookStatistics();
//		cap1.accept(stats);
//		stats.printStatistics();
//		FinancialBook fin_stats = new FinancialBook();
//		fin_stats.print_price();
//		
		// Isn't good
//		try {
//			FileOutputStream fos = new FileOutputStream(new File("./book.xml"));
//			XMLEncoder encoder = new XMLEncoder(fos);
//			encoder.writeObject(cap1);
//			encoder.writeObject(p1);
//			encoder.writeObject(p2);
//			encoder.writeObject(p3);
//			encoder.writeObject(p4);
//			encoder.close();
//			fos.close();
//		}
//		catch(IOException ex)
//		{
//			ex.printStackTrace();
//		}
		
//		Builder jsonBuilder = new JSONBuilder("book.json");
//		jsonBuilder.build();
//		Element myBook = jsonBuilder.getResult();
//		myBook.print();
		
//		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
//		DocumentBuilder documentBuilder = DocumentBuilderFactory.newDocumentBuilder();
//		
//		Document document = documentBuilder.newDocument();
//		
//		Element element = document.createElement("Book");
//		document.appendChild(element);
//		
//		Element capitol = document.createElement("Capitolul");
//		capitol.appendChild(document.createTextNode("Capitolul 1"));
//		element.appendChild(capitol);
//		
//		Element paragraph = document.createElement("Paragraf");
//		paragraph.appendChild(document.createTextNode("Paragraful 1"));
//		paragraph.appendChild(document.createTextNode("Paragraful 2"));
//		paragraph.appendChild(document.createTextNode("Paragraful 3"));
//		paragraph.appendChild(document.createTextNode("Paragraful 4"));
//		element.appendChild(paragraph);
//		
//		TransformerFactory transformerFactory = new StreamResult(new File("D:\\Staff\\FMI\\Anul III\\SP\\Book_XML.xml"));
		
//		Command cmd1 = new OpenCommand("book.json");
//		cmd1.execute();
//		Command cmd2 = new StatisticsCommand();
//		cmd2.execute();
//		DocumentManager.getBook().print();
		
		Section cap1 = new Section("Capitolul 1");
		Paragraph p1 = new Paragraph("Paragraph 1");
		cap1.add(p1);
		Paragraph p2 = new Paragraph("Paragraph 2");
		cap1.add(p2);
		Paragraph p3 = new Paragraph("Paragraph 3");
		cap1.add(p3);
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p4);
		cap1.add(new ImageProxy("ImageOne"));
		cap1.add(new Image("ImageTwo"));
		cap1.add(new Paragraph("Some text"));
		cap1.add(new Table("Table 1"));
//		FirstObserver firstObserver = new FirstObserver();
//		SecondObserver secondObserver = new SecondObserver();
//		cap1.addObserver(firstObserver);
//		cap1.addObserver(secondObserver);
//		p1.addObserver(firstObserver);
//		p1.addObserver(secondObserver);
//		p2.addObserver(firstObserver);
		cap1.setNewValue("CHAPTER 1");
		p1.setNewValue("PARAGRAPH 2");
		p2.setNewValue("PARAGRAPH 3");
		//cap1.removeObserver(firstObserver);
		cap1.setNewValue("CHAPTER 1.1");
	}

	public String getAuthor()
	{
		return Author;
	}

	public void setAuthor(String author)
	{
		Author = author;
	}

	public String getBook()
	{
		return Book;
	}

	public void setBook(String book)
	{
		Book = book;
	}

//	public String getChapter()
//	{
//		return Chapter;
//	}
//
//	public void setChapter(String chapter)
//	{
//		Chapter = chapter;
//	}
//
//	public String getSubChapter()
//	{
//		return subChapter;
//	}
//
//	public void setSubChapter(String subChapter)
//	{
//		this.subChapter = subChapter;
//	}

	public int getParagraph()
	{
		return Paragraph;
	}

	public void setParagraph(int paragraph)
	{
		Paragraph = paragraph;
	}

	public String getImage()
	{
		return Image;
	}

	public void setImage(String image)
	{
		Image = image;
	}

	public String getTable()
	{
		return Table;
	}

	public void setTable(String table)
	{
		Table = table;
	}
	
	
}
