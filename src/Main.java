
public class Main {
    public static void main(String[] args) {
        //task1,2
        int [] arr = new int [] {1,2,3};
        double [] doubleArr = {1.57, 7.654, 9.986};
        int[] arr2 = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(",");
            }
            else {
                System.out.println();
            }
        }
        for (int i1 = 0; i1 < doubleArr.length; i1++) {
            System.out.print(doubleArr[i1]);
            if (i1 != doubleArr.length -1) {
                System.out.print(",");
            }
            else {
                System.out.println();
            }
        }
        for (int i3 = 0; i3 < arr2.length; i3++) {
            System.out.print(arr2[i3]);
            if (i3 != arr2.length - 1) {
                System.out.print(",");
            }
            else {
                System.out.println();
            }
        }
        //task3
        for (int i = arr.length -1; i > -1 ; i--) {
            System.out.print(arr[i]);
            if (i != 0) {
                System.out.print(",");
            }
            else {
                System.out.println();
            }
        }
        for (int i1 = doubleArr.length -1; i1 > -1; i1--) {
            System.out.print(doubleArr[i1]);
            if (i1 != 0) {
                System.out.print(",");
            }
            else {
                System.out.println();
            }
        }
        for (int i3 = arr2.length -1; i3 > -1; i3--) {
            System.out.print(arr2[i3]);
            if (i3 != 0) {
                System.out.print(",");
            }
            else {
                System.out.println();
            }
        }

        //task4
        for (int i3 = 0; i3 < arr2.length; i3++) {
            if (i3 != arr2.length & i3 != 0){
                System.out.print(",");
            }
            if (arr2[i3] % 2 == 0) {
                arr2[i3] ++;
                System.out.print(arr2[i3]);
            }
            else {
                System.out.print(arr2[i3]);
            }
        }
    }
}