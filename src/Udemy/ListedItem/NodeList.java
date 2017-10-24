package Udemy.ListedItem;

import java.util.List;

public interface NodeList {
    ListedItem getRoot();
    boolean addItem(ListedItem item);
    boolean removeItem(ListedItem item);

    void traverse(ListedItem root);


}
