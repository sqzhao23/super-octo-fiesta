package cn.nice2cu.lh;

/**
 * TODO
 *
 * @author：zhaosq
 * @date: 2022/3/11
 */
public class TestDemo {

    public static void main(String[] args) {

        Printer1 printer1 = new Printer1();

        Book book = new Book();
        book.setTitle("狗屎");
        book.printTo(printer1, book.getTitle());
    }
}
