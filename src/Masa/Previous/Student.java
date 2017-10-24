package Masa.Previous;

public class Student {
    private String name;
    private String initials;
    private int gnumber;
    private int progress;
    Student(String name, String initials,  int gnumber, int progress){
        this.name=name;
        this.initials=initials;
        this.gnumber=gnumber;
        this.progress=progress;
    }
    static void sort(Student[] allstudents){
        for (int i=allstudents.length-1; i>=0; i--){
            for (int j=0; j<i; j++){
                if (allstudents[j].gnumber > allstudents[j+1].gnumber){
                    int tmp = allstudents[j].gnumber;
                    allstudents[j].gnumber = allstudents[j+1].gnumber;
                    allstudents[j+1].gnumber = tmp;
                }
            }
        }
    }
    static void printMore67(Student[] allstudents){
        for (int i = 0; i < allstudents.length-1; i++) {
            if (allstudents[i].progress>67){
                System.out.println(allstudents[i].name +" "+ allstudents[i].initials +" "+ allstudents[i].gnumber+" "+allstudents[i].progress);
            }

        }
    }
    static void fillarray(Student[] allstudents){

        allstudents[0]=new Student("Grigory","TA", 8, 76);
        allstudents[1]=new Student("Grigory","TA", 6, 56);
        allstudents[2]=new Student("Grigory","TA", 7, 78);
        allstudents[3]=new Student("Grigory","TA", 8, 98);
        allstudents[4]=new Student("Grigory","TA", 4, 67);
        allstudents[5]=new Student("Grigory","TA", 9, 54);
        allstudents[6]=new Student("Grigory","TA", 5, 76);
        allstudents[7]=new Student("Grigory","TA", 3, 87);
        allstudents[8]=new Student("Grigory","TA", 5, 65);
        allstudents[9]=new Student("Grigory","TA", 4, 52);
        allstudents[10]=new Student("Grigory","TA", 3, 34);
        allstudents[11]=new Student("Grigory","TA", 8, 65);
        allstudents[12]=new Student("Grigory","TA", 4, 73);
        allstudents[13]=new Student("Grigory","TA", 5, 84);
        allstudents[14]=new Student("Grigory","TA", 5, 54);
    }

}
