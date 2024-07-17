import java.util.*;
public class BookData {
	private int bookid;
	private String bookname;
	private String bookAuthor;
	private double bookPrice;
	BookData(int bookid,String bookname,String bookAuthor,double bookPrice){
		this.bookid=bookid;
		this.bookname=bookname;
		this.bookAuthor=bookAuthor;
		this.bookPrice=bookPrice;
	}
	@Override
	public String toString() {
		return "BookData [bookid=" + bookid + ", bookname=" + bookname + ", bookAuthor=" + bookAuthor + ", bookPrice="
				+ bookPrice + ", getBookid()=" + getBookid() + ", getBookname()=" + getBookname() + ", getBookAuthor()="
				+ getBookAuthor() + ", getBookPrice()=" + getBookPrice() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
}
class MainBooks{
	public static void main(String[] args) {
		ArrayList<BookData>books=new ArrayList();
		books.add(new BookData(5456,"CoreJava","James Goshtling",650.98));
		books.add(new BookData(5345,"Python","Guido Van Rossum",500.78));
		System.out.println("bofore Sorting");
		for(BookData bookData:books)
		{
			System.out.println(bookData);
		}
	}
}
