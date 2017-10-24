package Masa.Previous;

public class AddressBook1 {
    public static void main(String[] args) {

        AddressElement1[] book = new AddressElement1[15];
        AddressElement1 element = new AddressElement1("Grigory","Tsuryev", "89107671793");

        for (int i = 0; i < book.length; i++) {
            book[i] = new AddressElement1("Grigory" + i, "Tsuryev" + i, "89107671793" + i);
        }



    }
}
