package Module7;

class Student {
	    String name;
	    int marks;

	    Student(String name, int marks) {
	        this.name = name;
	        this.marks = marks;
	    }
	}

	public class StableUnstableSortDemo {

	    // Utility function to print array
	    static void printArray(Student arr[]) {
	        for (Student s : arr)
	            System.out.print("(" + s.name + "," + s.marks + ") ");
	        System.out.println();
	    }

	    // ---------------- BUBBLE SORT (Stable) ----------------
	    static void bubbleSort(Student arr[]) {
	        int n = arr.length;

	        for (int i = 0; i < n - 1; i++)
	            for (int j = 0; j < n - i - 1; j++)
	                if (arr[j].marks > arr[j + 1].marks) {
	                    Student temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	    }

	    // ---------------- INSERTION SORT (Stable) ----------------
	    static void insertionSort(Student arr[]) {
	        for (int i = 1; i < arr.length; i++) {
	            Student key = arr[i];
	            int j = i - 1;

	            while (j >= 0 && arr[j].marks > key.marks) {
	                arr[j + 1] = arr[j];
	                j--;
	            }

	            arr[j + 1] = key;
	        }
	    }

	    // ---------------- SELECTION SORT (Unstable) ----------------
	    static void selectionSort(Student arr[]) {
	        int n = arr.length;

	        for (int i = 0; i < n - 1; i++) {
	            int min = i;

	            for (int j = i + 1; j < n; j++)
	                if (arr[j].marks < arr[min].marks)
	                    min = j;

	            Student temp = arr[min];
	            arr[min] = arr[i];
	            arr[i] = temp;
	        }
	    }

	    // ---------------- MERGE SORT (Stable) ----------------
	    static void merge(Student arr[], int l, int m, int r) {
	        int n1 = m - l + 1;
	        int n2 = r - m;

	        Student L[] = new Student[n1];
	        Student R[] = new Student[n2];

	        for (int i = 0; i < n1; i++)
	            L[i] = arr[l + i];

	        for (int j = 0; j < n2; j++)
	            R[j] = arr[m + 1 + j];

	        int i = 0, j = 0, k = l;

	        while (i < n1 && j < n2) {
	            if (L[i].marks <= R[j].marks)
	                arr[k++] = L[i++];
	            else
	                arr[k++] = R[j++];
	        }

	        while (i < n1)
	            arr[k++] = L[i++];

	        while (j < n2)
	            arr[k++] = R[j++];
	    }

	    static void mergeSort(Student arr[], int l, int r) {
	        if (l < r) {
	            int m = (l + r) / 2;

	            mergeSort(arr, l, m);
	            mergeSort(arr, m + 1, r);

	            merge(arr, l, m, r);
	        }
	    }

	    // ---------------- QUICK SORT (Unstable) ----------------
	    static int partition(Student arr[], int low, int high) {

	        int pivot = arr[high].marks;
	        int i = low - 1;

	        for (int j = low; j < high; j++) {
	            if (arr[j].marks < pivot) {
	                i++;

	                Student temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }

	        Student temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;

	        return i + 1;
	    }

	    static void quickSort(Student arr[], int low, int high) {
	        if (low < high) {

	            int pi = partition(arr, low, high);

	            quickSort(arr, low, pi - 1);
	            quickSort(arr, pi + 1, high);
	        }
	    }

	    // Utility function to copy arrays
	    static Student[] copy(Student arr[]) {
	        Student newArr[] = new Student[arr.length];

	        for (int i = 0; i < arr.length; i++)
	            newArr[i] = new Student(arr[i].name, arr[i].marks);

	        return newArr;
	    }

	    public static void main(String args[]) {

	        Student students[] = {
	                new Student("John", 85),
	                new Student("Alice", 90),
	                new Student("Bob", 85),
	                new Student("David", 70)
	        };

	        System.out.println("Original Array:");
	        printArray(students);

	        Student arr1[] = copy(students);
	        bubbleSort(arr1);
	        System.out.println("\nBubble Sort (Stable):");
	        printArray(arr1);

	        Student arr2[] = copy(students);
	        insertionSort(arr2);
	        System.out.println("\nInsertion Sort (Stable):");
	        printArray(arr2);

	        Student arr3[] = copy(students);
	        selectionSort(arr3);
	        System.out.println("\nSelection Sort (Unstable):");
	        printArray(arr3);

	        Student arr4[] = copy(students);
	        mergeSort(arr4, 0, arr4.length - 1);
	        System.out.println("\nMerge Sort (Stable):");
	        printArray(arr4);

	        Student arr5[] = copy(students);
	        quickSort(arr5, 0, arr5.length - 1);
	        System.out.println("\nQuick Sort (Unstable):");
	        printArray(arr5);
	    }
	}

