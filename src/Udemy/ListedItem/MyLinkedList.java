package Udemy.ListedItem;

public class MyLinkedList implements NodeList {

    private ListedItem root = null;

    public MyLinkedList(ListedItem root){
        this.root=root;
    }

    @Override
    public ListedItem getRoot() {
        return null;
    }

    @Override
    public boolean addItem(ListedItem newItem) {
        if(this.root==null){
            this.root=newItem;
            return true;
        }

        ListedItem currentItem=this.root;
        while (currentItem!=null){
            int comparison =(currentItem.compareTo(newItem));
            if(comparison<0){
                    if(currentItem.next()!=null){
                        currentItem=currentItem.next();
                     }else {
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
               }
            }else if (comparison>0){
                if (currentItem.previous()!=null){
                    currentItem.previous().setNext(newItem).setPrevious(currentItem);
                    newItem.setNext(currentItem).setPrevious(newItem);
                }else{
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
            }else{
                System.out.println(newItem.getValue()+ " is already present, not added");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListedItem item) {
        if(item!=null){
            System.out.println("Deleting item" + item.getValue());
        }

        ListedItem currentItem = this.root;
        while (currentItem!=null){
            int comparison = currentItem.compareTo(item);
            if (comparison==0){
                if(currentItem==this.root){
                    this.root = currentItem.next();
                }else{
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next()!=null){
                        currentItem.setPrevious(currentItem.previous());
                    }
                }
                return true;
            }else if(comparison<0){
                currentItem=currentItem.next();
            }else {
                return false;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListedItem root) {
        if (root==null){
            System.out.println("The list is empty");
        }
        while (root!=null){
            System.out.println(root.getValue());
            root=root.next();
        }
    }
}
