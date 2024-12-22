public class BookClient {
    public static void main(String[] arg){
        Book newBook = new Book();
        newBook.setTitle("Lord of the Rings");
        newBook.setAuthor("Mahim");
        newBook.setYear(1996);
        newBook.setSerialNumber("#11233");
        newBook.setAvailable(true);

        System.out.println(newBook);

        System.out.println();
        Book newBook1 = new Book();
        newBook1.setTitle("One Sided Love");
        newBook1.setAuthor("Iktisad");
        newBook1.setYear(2023);
        newBook1.setSerialNumber("#11234");
        newBook1.setAvailable(false);

        System.out.println(newBook1.reFormat());

        System.out.println();
        Book newBook2 = new Book("Life in Montreal", "Mahim", 2023, "#11235" , true);
        System.out.println(newBook2);

    }




}
