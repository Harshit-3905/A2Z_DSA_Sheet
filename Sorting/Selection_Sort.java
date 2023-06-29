import java.util.*;

class Selection_Sort {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();
        SelectionSort(a, n);
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        in.close();
    }

    // Time Complexity : O(n^2)
    static void SelectionSort(int a[], int n) {
        for (int i = 0; i < n; i++) {
            int p = i;
            for (int j = i + 1; j < n; j++) {
                if (a[p] > a[j])
                    p = j;
            }
            int temp = a[p];
            a[p] = a[i];
            a[i] = temp;
        }
    }
}