package cn.nice2cu.test;

/**
 * TODO
 *
 * @author：zhaosq
 * @date: 2022/3/11
 */
public class LhTest {

    /**
     * 抽象功能接口
     */
    interface Printer {
        void print(String val);
    }

    /**
     * 通过参数传递功能接口
     */
    public void printSomething(String something, Printer printer) {
        printer.print(something);
    }

    public static void main(String[] args) {
        LhTest testDemo = new LhTest();
        String something = "I am using a Functional interface";
        // 实现Printer接口
        Printer printer = new Printer() {
            @Override
            public void print(String val) {
                //控制台打印
                System.out.println(val);
            }
        };
        testDemo.printSomething(something, printer);
    }

}
