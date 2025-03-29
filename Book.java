/* Create a Book class for a library system.
   • Instance variables: title, author, isbn.
   • Static variable: totalBooks, a counter for the total number of book instances.
   • Instance methods: borrowBook(), returnBook().
   • Static method: getTotalBooks(), to get the total number of books in the library */

class Book{
    private String title, author, isbn;
    private boolean isBorrowed;
    private static int totalBooks = 0;

    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
        totalBooks++;
    }

    public void borrowBook() {
        if(!isBorrowed) {
            isBorrowed = true;
            System.out.println(title + " has borrowed");
        } else {
            System.out.println(title + " has already borrowed");
        }
    }

    public void returnBook() {
        if(isBorrowed) {
            isBorrowed = false;
            System.out.println(title + " has returned");
        } else {
            System.out.println(title + " has not returned");
        }
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public static void main(String[] args) {
        Book book1 = new Book("White Nights", "Fyodor Doetoevsky", "1235484");
        Book book2 = new Book("Metamorphosis", "Franz Kafka", "6252659");

        book1.borrowBook();
        book1.returnBook();
        book2.borrowBook();

        System.out.println("Total books in library :" +Book.getTotalBooks());
    }
}

