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

        public Book add(Book obj) throws Exception {
            if (size >= db.length){
                throw new Exception("Out of Space");
            }
            db[size] = obj;
            size++;
           // System.out.println("New data successfully added");
            return db[size-1];
        }

        public Book add(int index, Book obj){

            System.out.println("New data successfully added");
            return null;
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

        public Book getBook(int index){
            return null;
        }

        public Book getBook(String search){
            return null;
        }

        public int remaining(){
            return (db.length - size);
        }
}
