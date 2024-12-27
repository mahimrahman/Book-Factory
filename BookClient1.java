public class BookClient1 {

    public static void main(String[] args) {
        BookFactory factory = new BookFactory();
        System.out.println("Total Elements: " + factory.getSize());
        System.out.println("Total DB size: " + factory.getdbCapacity());
        System.out.println("Remaining Size: " + factory.remaining());

        Book newBook = new Book("Life in Montreal", "Mahim", 2023, "#11235" , true);
        try{

            System.out.println(factory.add(newBook));
            Book newBook1 = new Book("Healthy Living Guide", "Linda Adams", 2023, "#11245", false);
            Book newBook2 = new Book("Secrets of the Universe", "James Thompson", 2017, "#11246", true);
            Book newBook3 = new Book("Adventures in Space", "Nancy Drew", 2024, "#11247", true);

            System.out.println(factory.add(newBook1));
            System.out.println(factory.add(newBook2));
            System.out.println(factory.add(newBook3));



            System.out.println("Total Elements: " + factory.getSize());
            System.out.println("Total DB size: " + factory.getdbCapacity());
            System.out.println("Remaining Size: " + factory.remaining());

        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }



}
