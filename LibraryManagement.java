import java.util.ArrayList;
import java.util.Scanner;

class Book{
int id;
String title;
String author;

Book(int id,String title,String author){
this.id=id;
this.title=title;
this.author=author;
}
void display(){
System.out.println("ID:"+id);
System.out.println("Title:"+title);
System.out.println("author:"+author);
System.out.println("----------");
}
}
public class LibraryManagement{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
ArrayList<Book>books=new ArrayList<>();

while(true){
System.out.println("\n===DIGITAL LIBRARY===");
System.out.println("1.Add books");
System.out.println("2.View books");
System.out.println("3.Search book");
System.out.println("4.Exit");
System.out.println("Enter choice:");
int choice=sc.nextInt();

switch(choice){
case 1:
System.out.println("Enter Book ID");
int id=sc.nextInt();
sc.nextLine();

System.out.println("Enter Book Title:");
String title=sc.nextLine();

System.out.println("Enter Author name:");
String author=sc.nextLine();

books.add(new Book(id,title,author));
System.out.println("Book Added Successfully!😊");
break;

case 2:
if(books.isEmpty()){
System.out.println("No books Available");
}else{
for(Book b : books){
b.display();
}
}
break;

case 3:
sc.nextLine();
System.out.println("Enter Book title");
String search=sc.nextLine();

boolean found=false;
for(Book b:books){
if(b.title.equalsIgnoreCase(search)){
b.display();
found=true;
}
}
if(!found){
System.out.println("Book Not Found");
}
break;

case 4:
System.out.println("Thank you");
System.exit(0);

default:
System.out.println("Invalid choice");
}
}
}
}
