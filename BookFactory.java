import java.util.Arrays;

public class BookFactory {
        private int size;
        private Book[] db;

        public BookFactory(){
            size = 0;
            db = new Book[3];
        }

        public int getSize(){
            return size;
        }

        public int getdbCapacity(){
            return db.length;
        }

        private void resizeDb() {
            Book[] newDb = new Book[db.length + 15];
            for (int i= 0; i<db.length; i++){
                newDb[i] = db[i];
            }
            db = newDb;
        }

        public Book add(Book obj) {
            if (size >= db.length){
                //throw new Exception("Out of Space");
                resizeDb();
            }
            db[size] = obj;
            size++;
           // System.out.println("New data successfully added");
            return db[size-1];
        }

        public Book add(int index, Book obj) throws Exception {
            if (index < 0 && index >= size) throw new Exception ("Index not within constraint");

            for (int i = size; i >= index; i--){
                db[i] = db[i-1];
            }
            db[index] = obj;
            //System.out.println("New data successfully added");
            size++;
            return obj;
        }



        public Book remove(){
            System.out.println("New data successfully removed");
            return null;
        }

        public Book remove(Book obj){
            System.out.println("New data successfully removed");
            return null;
        }

        public Book update(int index, Book obj) {
            System.out.println("New data successfully updated");
            return null;
        }

        public Book[] getBook() {
            return db;
        }

        public Book getBook(int index) throws Exception {
            if (index < 0 && index >= size) throw new Exception ("Index not within constraint");
            System.out.println("Value from Index: " + index);
            return db[index];
        }

        public Book getBook(String search){
            return null;
        }

        public int remaining(){
            return (db.length - size);
        }

        public String peekDb() {
            int count = 0;
            String s = "";
//            for (int i = 0; i < db.length; i++) {
//                if (db[i] != null) {
//                    System.out.println(i + " 1");
//                } else {
//                    System.out.println(i + " 0");
//                }
                for (int i = 0; i < db.length; i++) {
                    if (db[i] != null) {
                        s += i + "(1) ";
                    }
                    else {
                        s += i + "(0) ";
                    }

                    count++;
                    if (count > 10){count =0;
                        s += "\n";}
            } return s;
        }}
