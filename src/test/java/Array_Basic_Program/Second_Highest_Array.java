package Array_Basic_Program;

public class Second_Highest_Array {
    public static void main(String[] args) {
        int a[] = {1, 4, 7, 3, 10, 6, 9, 8};
        int max1, max2;

        if (a[0] > a[1]) {
            max1 = a[0];
            max2 = a[1];
        } else {
            max1 = a[1];
            max2 = a[0];
        }

        for (int i = 2; i < a.length; i++) {
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            } else if (a[i] > max2) { // Fixed 'elseif' issue
                max2 = a[i];
            }
        }

        System.out.println("Second highest number is: " + max2);
    }
}