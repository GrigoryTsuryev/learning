package Udemy.ListedItem;

public abstract class ListedItem {
    protected ListedItem rightLink = null;
    protected ListedItem leftLink = null;

    protected Object value;

    public ListedItem(Object value) {
        this.value = value;
    }

    abstract ListedItem next();
    abstract ListedItem setNext(ListedItem item);
    abstract ListedItem previous();
    abstract ListedItem setPrevious(ListedItem item);

    abstract int compareTo(ListedItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }



}
