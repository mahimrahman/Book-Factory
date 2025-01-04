import java.util.Arrays;

public class BookFactory {
    private int size;
    private Book[] db;

    public BookFactory() {
        size = 0;
        db = new Book[3];
    }

    public int getSize() {
        return size;
    }

    public int getdbCapacity() {
        return db.length;
    }

    private void resizeDb() {
        Book[] newDb = new Book[db.length + 15];
        for (int i = 0; i < db.length; i++) {
            newDb[i] = db[i];
        }
        db = newDb;
    }

    public Book[] compressDb() {
        System.out.println("size " + size);
        Book[] newDb = new Book[size];
        for (int i = 0; i <= size - 1; i++) {
            newDb[i] = db[i];
            System.out.println(newDb[i]);
        }
        db = newDb;
        return db;
    }

    public Book add(Book obj) {
        if (size >= db.length) {
            //throw new Exception("Out of Space");
            resizeDb();
        }
        db[size] = obj;
        size++;
        // System.out.println("New data successfully added");
        return db[size - 1];
    }

    public Book add(int index, Book obj) throws Exception {
        if (index < 0 && index >= size) throw new Exception("Index not within constraint");
        for (int i = size - 1 ; i >= index; i--) {
            db[i+1] = db[i];
        }
        db[index] = obj;
        //System.out.println("New data successfully added");
        size++;
        return obj;
    }


    public Book remove() {
        size = size - 1;
        Book temp = db[size];
        db[size] = null;
        System.out.println(size + "th element successfully removed");
        return temp;
    }

    public Book remove(Book obj) {
        System.out.println("New data successfully removed");
        return null;
    }

    public Book remove(int index) {
        Book temp = db[index];
        db[index] = null;
        for (int i = index + 1; i <= size - 1; i++) {
            db[i - 1] = db[i];
        }
        System.out.println(index + "th element successfully removed");
        return temp;
    }

    public void removeall() {
        for (int i = size - 1; i >= 0; i--) {
            db[i] = null;
        }
        size = 0;
        System.out.println("All data successfully removed");
    }

    public Book update(int index, Book obj) {
        System.out.println("New data successfully updated");
        return null;
    }

    public Book[] getBook() {
        return db;
    }

    public Book getBook(int index) throws Exception {
        if (index < 0 && index >= size) throw new Exception("Index not within constraint");
        System.out.println("Value from Index: " + index);
        return db[index];
    }

    public Book getBook(String search) {
        return null;
    }

    public int remaining() {
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
            } else {
                s += i + "(0) ";
            }

            count++;
            if (count > 10) {
                count = 0;
                s += "\n";
            }
        }
        return s;
    }

    public void display(Book[] db) {
        for (int i = 0; i < db.length; i++) {
            System.out.println(db[i]);
        }
    }
}
