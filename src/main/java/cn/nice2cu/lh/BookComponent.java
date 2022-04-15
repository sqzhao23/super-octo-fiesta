package cn.nice2cu.lh;

/**
 * TODO
 *
 * @author：zhaosq
 * @date: 2022/3/11
 */
public abstract class BookComponent {
    String title;
    int id;

    public abstract void printTo(Printer printer, String value);

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
