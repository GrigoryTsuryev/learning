package Masa.Previous;

public class AdrressBook {
    public static void main(String[] args) {
        String[] fullName = new String[2];
        String[] getNumber = new String[1];
        AdressElement[] book = new AdressElement[15];
        AdressElement element = new AdressElement("George", "Bush", "0934444455");

        for (int i = 0; i < book.length; i++) {
            book[i] = new AdressElement("George" + i, "Bush" + i, "0934444455" + i);

        }

        fullName = getFullName(book, "09344444550");
        for (int i = 0; i < fullName.length; i++) {
            System.out.println(fullName[i]);
        }
        getNumber = getNumber(book, "George0", "Bush0");
        for (int i = 0; i < getNumber.length; i++) {
            System.out.println(getNumber[i]);

        }
    }
    public static String[] getFullName(AdressElement[] book, String pnumber) {
        String[] result = new String[2];
        for (int i = 0; i < book.length; i++) {
            if (pnumber.equals(book[i].pnumber)) {
                result = new String[]{book[i].name, book[i].fname};
                break;
            } else System.out.println("No matches");
            break;
        }
        return result;
    }


    public static String[] getNumber(AdressElement[] book,String name,String fname ) {
        String[] result = new String[1];
        for (int i = 0; i < book.length; i++) {
            if (name.equals(book[i].name) && fname.equals(book[i].fname)) {
                result = new String[]{book[i].pnumber};
                break;
            }
            else System.out.println("No matches");
            break;
        }
        return result;

    }
}
