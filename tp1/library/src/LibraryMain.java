public class LibraryMain {
    public static void main(String[] args) {
        Author author = new Author("Tolkien","JRR", 1892);
        Book myBook1 = new Book("Le seigneur des anneaux", author, 1954, 1600);
        //System.out.println(myBook1.toString());
        Book myBook2 = new Book("Bilbo le Hobbit", author, 1937);

        Author anotheAuthor = new Author("Herbert", "Frank", 1920);
        Book myBook3 = new Book("Dune", anotheAuthor, 1965);

        Library myLibrary = new Library();

        myLibrary.addBook(myBook1);
        myLibrary.addBook(myBook2);
        myLibrary.addBook(myBook3);
        
        myLibrary.displayBooks();
        int compt = 0;
        for(int i=0; i< myLibrary.getNbBooks(); i++){
            if(myLibrary.getBook(i).getNbPages() > 0){
               compt ++;
            }  
            
        }   
        System.out.println("the library contains " + compt + " book(s) with the known number of pages ");      
    }
}
