package Masa.Previous;

public class Aeroflot {
    private String departure;
    private int flightNumber;
    private String planeType;

    Aeroflot(String departure, int flightNumber,  String planeType) {
        this.departure = departure;
        this.flightNumber = flightNumber;
        this.planeType = planeType;
    }

    static void setFlightNumber(Aeroflot aeroflot, int flightNumber){
            aeroflot.flightNumber = flightNumber;
    }
    static void sortDown(Aeroflot[] aeroflot) {
        int temp;
        for (int i = 0; i < aeroflot.length; i++)
            for (int j = 0; j < aeroflot.length - 1; j++) {
                if (aeroflot[j].flightNumber < aeroflot[j + 1].flightNumber) {
                    temp = aeroflot[j].flightNumber;
                    aeroflot[j].flightNumber = aeroflot[j + 1].flightNumber;
                    aeroflot[j + 1].flightNumber = temp;
                }
            }
    }
    static void printOne(Aeroflot aeroflot){
        System.out.println(aeroflot.departure+" "+aeroflot.flightNumber);
    }
}
