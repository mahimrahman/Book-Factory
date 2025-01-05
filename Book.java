import java.io.Serializable;

public class Book implements Serializable {
    private String title;
    private String serialNumber;
    private String author;
    private int year;
    private Boolean isAvailable;

    public Book() {

    }

    public Book(String title, String author, int year, String serialNumber, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.serialNumber = serialNumber;
        this.isAvailable = isAvailable;

    }

    public String toString() {
        return "Book Details: \n" + " Title: " + title + "\n" + " Author: " + author + "\n Year: " + year + "\n Serial No: " + serialNumber + "\n Availability: " + isAvailable;
    }

    //tostring modification
    public String reFormat() {
        return "Book Details: \n" + " Availability: " + isAvailable + "\n Title: " + title + "\n Author: " + author + "\n Year: " + year + "\n Serial No: " + serialNumber;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }
}

