import java.util.Scanner;
class Book{
	String name;
	String author;
	double price;
	int num_pages;
	
	public Book(String name,String author,double price,int num_pages){
	this.name  =  name;
	this.author = author;
	this.price = price;
	this.num_pages = num_pages;
	}
	public Book()
	{
	System.out.println("use setDetails method ..");
	}
	public void setDetails()
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the name of the book:");
		this.name  = sc.nextLine();
		System.out.println("enter the author name :");
		this.author = sc.nextLine();
		System.out.println("enter the price of the book:");
		this.price = sc.nextDouble();
		System.out.println("enter the number of pages present:");
		this.num_pages = sc.nextInt();	
	}
	public void getDetails()
	{
		System.out.println("Name:"+this.name);
		System.out.println("Author:"+this.author);
		System.out.println("Price:"+this.price);
		System.out.println("No of pages:"+this.num_pages);
	}
	public String toString(){
			return "Name:"+this.name+"\nAuthor:"+this.author+"\nPrice:"+this.price+"\nNumber of pages:"+this.num_pages+"\n";
	}
}

public class BookDetails{
	public static void main(String args[]){
		Book b[] = new Book[1];
		for(int i=0;i<1;i++){
				b[i] = new Book();
				b[i] .setDetails();
		}
		for(int i=0;i<1;i++){
			b[i].getDetails();
			//System.out.println(b[i]);
		}
	}
}
