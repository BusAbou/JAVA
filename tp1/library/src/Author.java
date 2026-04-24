
/**
 * Define author of books
 */

public class Author {
   /**
    * an Author is defined by its lastname, firstname, and birth year
    * 
    * @param lastname  author's lastname
    * @param firstname author's firstname
    * @param birhtyear author's birth year
    */
   public Author(String lastname, String firstname, int birthYear) {
      this.lastname = lastname;
      this.firstname = firstname;
      this.birthYear = birthYear;
   }

   private String lastname;
   private String firstname;
   private int birthYear;

   /**
    * this author's lastname
    * 
    * @return this author's lastname
    */
   public String getLastname() {
      return this.lastname;
   }

   /**
    * this author's firstname
    *
    * @return this author's firstname
    */
    public String getFirstname(){
      return this.firstname;
    }

    /**
     * this author's birth
     * 
     * @return his birthday
     */
    public int getBirt(){
      return this.birthYear;
    }

    /**
     * display this author's name complete
     */
    public void completeName(){
      System.out.println("his complete name is: " + this.lastname + " " + this.firstname);
    }

   /**
    * get author information as a String
    * 
    * @return description for this author
    */
   public String toString() {
      return this.firstname + " " + this.lastname + " born in " + this.birthYear;
   }

}
