import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;


public class BookClient {
    public static void main(String[] arg) {
//        Book newBook = new Book();
//        newBook.setTitle("Lord of the Rings");
//        newBook.setAuthor("Mahim");
//        newBook.setYear(1996);
//        newBook.setSerialNumber("#11233");
//        newBook.setAvailable(true);
//
//        System.out.println(newBook);
//
//        System.out.println();
//        Book newBook1 = new Book();
//        newBook1.setTitle("One Sided Love");
//        newBook1.setAuthor("Iktisad");
//        newBook1.setYear(2023);
//        newBook1.setSerialNumber("#11234");
//        newBook1.setAvailable(false);
//
//        System.out.println(newBook1.reFormat());
//
//        System.out.println();
//        Book newBook2 = new Book("Life in Montreal", "Mahim", 2023, "#11235" , true);
//        System.out.println(newBook2);
        try {
            File file = new File("bookData.txt");
            Scanner sc = new Scanner(file);
            //System.out.println(sc.hasNextLine());

//            if (file.exists()) {
//                System.out.println("File name: " + file.getName());
//                System.out.println("Absolute path: " + file.getAbsolutePath());
//                System.out.println("Writeable: " + file.canWrite());
//                System.out.println("Readable " + file.canRead());
//                System.out.println("File size in bytes " + file.length());
//            } else {
//                System.out.println("The file does not exist.");
//            }
            // System.out.println(file.length());
            int count = 0;
            while (sc.hasNextLine()) {
                count = count + 1;
                sc.nextLine();
                // System.out.println(sc.nextLine());
            }


            // System.out.println("count " + count);

            sc.close();

            Book[] array = new Book[count];
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            int i = 0;
            String line;

            while ((line = br.readLine()) != null) {
                // System.out.println(line);
                String[] inputs = line.split(",");
                Book book = new Book(
                        inputs[0],
                        inputs[1],
                        Integer.parseInt(inputs[2].trim()),
                        inputs[3],
                        Boolean.parseBoolean(inputs[4]));

                array[i] = book;
                i++;
            }

            for (i = 0; i < array.length; i++) {
                System.out.println(array[i]);
                System.out.println();
            }

        } catch (
                Exception e
        ) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

}





