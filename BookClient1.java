import java.io.*;

public class BookClient1 {

    public static void main(String[] args) {
        bookFactory();
    }

    public static void bookFactory() {
        BookFactory factory = new BookFactory();
        System.out.println("Total Elements: " + factory.getSize());
        System.out.println("Total DB size: " + factory.getdbCapacity());
        System.out.println("Remaining Size: " + factory.remaining());
        System.out.println();

        try {

//            File file = new File("bookData.txt");
//            Scanner sc = new Scanner(file);
//            String var;
//             while (sc.hasNextLine()){
//                 var = sc.nextLine();
//                 String[] dataBase = var.split(",");
//                 Book book = new Book(
//                         dataBase[0],
//                         dataBase[1],
//                         Integer.parseInt(dataBase[2].trim()),
//                         dataBase[3],
//                         Boolean.parseBoolean(dataBase[4])
//                 );
//                 System.out.println(factory.add(book));
//                 System.out.println();
//
//
//             }


//            Book newBook = new Book("Life in Montreal", "Mahim", 2023, "#11235" , true);
//            Book newBook1 = new Book("Healthy Living Guide", "Linda Adams", 2023, "#11245", false);
//            Book newBook2 = new Book("Secrets of the Universe", "James Thompson", 2017, "#11246", true);
//            Book newBook3 = new Book("Adventures in Space", "Nancy Drew", 2024, "#11247", true);
//            System.out.println(factory.add(newBook));
//            System.out.println(factory.add(newBook1));
//            System.out.println(factory.add(newBook2));
//            System.out.println(factory.add(newBook3));

            FileReader file = new FileReader("bookData.txt");
            BufferedReader br = new BufferedReader(file);
            String var;
            int count = 0;
            while ((var = br.readLine()) != null) {
                String[] dataBase = var.split(",");
                Book book = new Book(
                        dataBase[0],
                        dataBase[1],
                        Integer.parseInt(dataBase[2].trim()),
                        dataBase[3],
                        Boolean.parseBoolean(dataBase[4])
                );
                System.out.println(factory.add(book));
                count++;
                System.out.println();
            }
            System.out.println("\n" + count + " Book Successfully added");


            System.out.println();
            System.out.println("Total Elements: " + factory.getSize());
            System.out.println("Total DB size: " + factory.getdbCapacity());
            System.out.println("Remaining Size: " + factory.remaining());
            System.out.println();

            System.out.println(factory.peekDb());

            factory.add(4, new Book("Mahim", "Sanjana", 2025, "#123345", true));
            System.out.println(factory.getBook(4));
            System.out.println();

            System.out.println("Total Elements: " + factory.getSize());
            System.out.println("Total DB size: " + factory.getdbCapacity());
            System.out.println("Remaining Size: " + factory.remaining());
            System.out.println();
            System.out.println(factory.peekDb());

            System.out.println(factory.remove());
            System.out.println(factory.remove(0));
            //factory.removeall();

            System.out.println("Total Elements: " + factory.getSize());
            System.out.println("Total DB size: " + factory.getdbCapacity());
            System.out.println("Remaining Size: " + factory.remaining());
            System.out.println();

            factory.add(0, new Book("Mahim", "Sanjana", 2025, "#123345", true));
            factory.display(factory.compressDb());
            System.out.println("Total Elements: " + factory.getSize());
            System.out.println("Total DB size: " + factory.getdbCapacity());
            System.out.println("Remaining Size: " + factory.remaining());
//            System.out.println("Total Elements: " + factory.getSize());
//            System.out.println("Total DB size: " + factory.getdbCapacity());
//            System.out.println("Remaining Size: " + factory.remaining());
//            System.out.println(factory.peekDb());

//           System.out.println(factory.removeall());

//factory.saveFile();
//factory.readSavedFile();
            System.out.println();


        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
