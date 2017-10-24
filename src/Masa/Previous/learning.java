package Masa.Previous;

public class learning {

    static void changeFirst(int[] array, int number) {
        array[0] = number;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 3, 8, 0, 5, 300};
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] % 2 == 0 && arr[i] != 0) summ = summ + 1;
        }
        System.out.println("\n" + summ);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) arr[i] = 0;
            System.out.print(arr[i] + " ");
        }


        int[] arr1 = {1, 3, 4, 5, 2};
        int[] arr2 = {2, 3, 2, 1, 5};
        int summ1 = 0;
        int summ2 = 0;
        int avrg1 = 0;
        int avrg2 = 0;
        for (int i = 1; i < arr1.length; i++) {
            summ1 = summ1 + arr1[i];
            summ2 = summ2 + arr1[i];
            avrg1 = summ1 / arr1.length;
            avrg2 = summ2 / arr1.length;
        }
        if (avrg1 > avrg2) {
            System.out.println("\n" + "avrg1");
        } else if (avrg2 < avrg1) {
            System.out.println("\n" + "avrg2");
        } else {
            System.out.println("\n" + "avrg1=avrg2");
        }

        int[] arr4 = {70, 32, 43, 55};
        boolean num = true;
        for (int i = 0; i < arr4.length - 1; i++) {
            if (arr4[i] < arr4[i + 1]) {
                num = true;
            } else num = false;
            {
                break;
            }
        }
        System.out.println(num);

        int[] fib = new int[20];
        int nfib = 0;
        for (int i = 0; i < fib.length; i++) {
            fib[0] = 0;
            fib[1] = 1;
            fib[2] = 1;
            if (i >= 3) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
            System.out.print(fib[i] + " ");
        }

        int[] arr5 = {2, 3, -15, 3, -20, 5, 7, -2, 5, 8};
        int maxn = 0;
        int in = 0;
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] > maxn) maxn = arr5[i];
            in = i;
        }
        System.out.println("\n" + maxn + " index- " + in);

        double[] arr6 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double[] arr7 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        double[] an = new double[9];
        int count = 0;
        for (int i = 0; i < arr6.length; i++) {
            an[i] = arr7[i] / arr6[i];
            System.out.print(" " + an[i]);
            if (an[i] % 1 == 0) {
                count++;
            }
        }
        System.out.println("\n" + count);

        int[] arr8 = {1, 0, -1, 1, 1, -1, 0, -1, 0};
        int counter0 = 0;
        int counter1 = 0;
        int counter2 = 0;
        for (int i = 0; i < arr8.length; i++) {
            if (arr8[i] == 0) {
                counter0++;
            } else if (arr8[i] == 1) {
                counter1++;
            } else {
                counter2++;
            }
        }
        System.out.println("(0)" + counter0 + "   (1)" + counter1 + "    (-1)" + counter2);

        int[][] matrix = {{1, 0, 2, 4, 6, 3, 2}, {0, 1, 5, 3, 9, 6, 5}, {1, 3, 5, 8, 4, 3, 6}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[] someArray = {5, 4, 3, 2, 1};
        changeFirst(someArray, 15);
        for (int i = 0; i < someArray.length; i++) {
            System.out.print(someArray[i] + " ");
        }
        System.out.println("");

        int[][] darray = new int[4][5];
        for (int i = 0; i < darray.length; i++) {
            for (int j = 0; j < darray[i].length; j++) {
                darray[i][j] = 1;
                System.out.print(darray[i][j] + " ");
            }
            System.out.println(" ");
        }

        int[][] darray1 = {{3, 2, 2, 3, 2, 3, 5, 6, 4, 2}, {2, 3, 3, 4, 2, 1, 3, 4}, {3, 3, 4, 3, 2, 3, 2, 5}};

        int x = 0;
        int summax = 0;
        int tempSumm = 0;
        int tempj = 0;
        while (x < darray1.length) {
            for (int i = 0; i < darray1[x].length; i++) {
                summax += darray1[x][i];
            }
            x++;
            System.out.println("summ string " + x + " = " + summax);
            if (summax > tempSumm) {
                tempSumm = summax;
                tempj = x;
            }
            summax = 0;
        }
        System.out.println("max sum string is " + tempSumm + " in line " + tempj);

        int[][] darray3 = new int[5][5];
        for (int i = 0; i < darray3.length; i++) {
            for (int j = 0; j < darray3.length; j++) {
                if (j == i) {
                    darray3[i][j] = 1;
                    System.out.print(darray3[i][j] + " ");
                } else System.out.print("0 ");
            }
            System.out.println(" ");
        }

        int min = 0, tempChoice = 0;
        int[] arrForSort = {2, 4, 3, 2, 4, 5, 6, 4, 2, 6, 8, 3, 9};
        System.out.println("new array  ");
        for (int i = 0; i < arrForSort.length; i++) {
            System.out.print(arrForSort[i] + " ");
        }
        System.out.println();
        System.out.println("sorted array choice method  ");
        for (int i = 0; i < arrForSort.length; i++) {
            min = i;
            for (int j = i + 1; j < arrForSort.length; j++) {
                if (arrForSort[j] < arrForSort[min]) {
                    min = j;
                }
            }
            tempChoice = arrForSort[min];
            arrForSort[min] = arrForSort[i];
            arrForSort[i] = tempChoice;
            System.out.print(arrForSort[i] + " ");
        }
        System.out.println();
        System.out.println("sorted array bubble method  ");
        int tempBubble = 0;
        for (int i = arrForSort.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrForSort[j] > arrForSort[j + 1]) {
                    tempBubble = arrForSort[j];
                    arrForSort[j] = arrForSort[j + 1];
                    arrForSort[j + 1] = tempBubble;
                }
            }
        }
        for (int i = 0; i < arrForSort.length; i++) {
            System.out.print(arrForSort[i] + " ");
        }

        System.out.println();
        System.out.println("sorted array insert method  ");
        int tempInsert = 0;
        int j = 0;
        for (int i = 0; i < arrForSort.length - 1; i++) {
            if (arrForSort[i] > arrForSort[i + 1]) {
                tempInsert = arrForSort[i + 1];
                arrForSort[i + 1] = arrForSort[i];
                j = i;
                while (j > 0 && tempInsert < arrForSort[j - 1]) {
                    arrForSort[j] = arrForSort[j - 1];
                    j--;
                }
                arrForSort[j] = tempInsert;
            }
        }
        for (j = 0; j < arrForSort.length; j++) {
            System.out.print(arrForSort[j] + " ");
        }
        System.out.println();

        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 22, 33, 44, 55, 66};
        System.out.println("Sorted Array is");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
        System.out.println();
        int value = 55;
        System.out.print("Value " + value + " has index " + findIndex(sortedArray, 0, sortedArray.length, value));

        System.out.println();
        PrintNumberSeveralTimes(56, 6);

        System.out.println();
        System.out.println(getPower(34,2));

        System.out.print(" ");
        function(1,3,2);

        System.out.println();
        discriminant(1,-8,15);



    }
    private static int findIndex(int[] a, int fromIndex, int toIndex, int key) {
        int low = fromIndex;
        int high = toIndex - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];
            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid;
        }
        return -(low + 1);
    }
    private static void PrintNumberSeveralTimes(int number, int length) {
        System.out.println("Method Print Number 1 time " + number);
        System.out.println("Method Print Number 2 Times " + number +" " + number);
        System.out.println("Method Print Number 3 Times" + number + " " + number + " "+ number);
        int i=0;
        System.out.println("Method PrintNumberSeveralTimes Extract " +length + " Times "+ "Number " + number);
        while(i<length){
            System.out.print(number+" ");
            i++;
        }
    }

    private static int getPower(int number, int power){
        int result = 1;
        for (int i = 0; i < power; i++){
            result=number*result;
        }
        System.out.print("The Power of " +power + " of "+ number + " is ");
        return result;
    }

    private static int function(int k, int x, int b) {
        int result = k*x+b;
        System.out.print("For Function result is  " + result);
        return result;
    }

    private static int discriminant(int a, int b, int c) {
        int result;
        result = b * b - 4 * a * c;
        if (result > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(result)) / (2 * a);
            x2 = (-b + Math.sqrt(result)) / (2 * a);
            double[] twoRoots = {x1,x2};
            for (int z = 0;z<twoRoots.length; z++);
            System.out.println("Roots are: x1 = " + twoRoots[0] + ", x2 = " + twoRoots[1]);
        }
        else if (result == 0) {
            double x;
            x = -b / (2 * a);
            double[] twoRoots = {x};
            for (int z = 0;z<twoRoots.length; z++);
            System.out.println("One root is: x = " + twoRoots[0]);
        }
        else {
            System.out.println("No roots!");
        }
        return result;
    }
}








