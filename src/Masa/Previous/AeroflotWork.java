package Masa.Previous;

public class AeroflotWork {
    public static void main(String[] args) {
        int n = 10;
        Aeroflot[] aeroflot = new Aeroflot[n];

        for (int i = 0; i <aeroflot.length ; i++) {
            aeroflot[i] = new Aeroflot(" ",100+i," ");
            //Masa.Previous.Aeroflot.setFlightNumber(aeroflot[i], 100);
        }

        Aeroflot.sortDown(aeroflot);
        for (int i = 0; i < aeroflot.length; i++) {
            Aeroflot.printOne(aeroflot[i]);
        }
    }
}
