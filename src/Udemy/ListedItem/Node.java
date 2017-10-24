package Udemy.ListedItem;

public class Node extends ListedItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    ListedItem next() {
        return this.rightLink;
    }

    @Override
    ListedItem setNext(ListedItem item) {
        this.rightLink = item;
        return this.rightLink = item;
    }

    @Override
    ListedItem previous() {
        return this.leftLink;
    }

    @Override
    ListedItem setPrevious(ListedItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int compareTo(ListedItem item) {
        if (item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}