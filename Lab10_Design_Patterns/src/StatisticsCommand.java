
public class StatisticsCommand implements Command {

	public StatisticsCommand() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		BookStatistics book_statistics = new BookStatistics();
		book_statistics.printStatistics();
		
		DocumentManager.getInstance().getBook().accept(book_statistics);
	}

}
