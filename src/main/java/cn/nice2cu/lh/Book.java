package cn.nice2cu.lh;

import java.util.Date;

/**
 * TODO
 *
 * @author：zhaosq
 * @date: 2022/3/11
 */
public class Book extends BookComponent {


    private String publisher;
    private Date publicationDate;
    private int version;
    private String ISBN;

    @Override
    public void printTo(Printer printer, String value) {
        printer.printSomething(value);
    }

    public static class BookChapter extends BookComponent {
        @Override
        public void printTo(Printer printer, String value) {
            printer.printSomething(value);
        }
    }

    public static class BookSection extends BookComponent {
        @Override
        public void printTo(Printer printer, String value) {
            printer.printSomething(value);
        }
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
