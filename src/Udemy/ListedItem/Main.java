package Udemy.ListedItem;

public class Main {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());
        String stringData= "5 7 6 7 3 2 1";

        String[] data = stringData.split(" ");
        for (String s : data){
            list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());
    }
}
