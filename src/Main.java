import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1(){
        System.out.println("Задача № 1");
        int []arr=new int [3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        double []doubleArr={1.57,7.654,9.986};
        int [] intArr= {3,5,9,2,6};
    }
    public static void task2(){
        System.out.println("Задача № 2");
        int []arr=new int [3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        System.out.print(arr[0]+ ", ");
        System.out.print(arr[1]+ ", ");
        System.out.print(arr[2]);
        System.out.println();
        double []doubleArr={1.57,7.654,9.986};
        System.out.print(doubleArr[0]+", ");
        System.out.print(doubleArr[1]+", ");
        System.out.print(doubleArr[2]);
        System.out.println();
        int [] intArr= {3,5,9,2,6};
        System.out.print(intArr[0]+", ");
        System.out.print(intArr[1]+", ");
        System.out.print(intArr[2]+", ");
        System.out.print(intArr[3]+", ");
        System.out.print(intArr[4]);
        System.out.println();
    }
    public static void task3(){
        System.out.println("Задача № 3");
        int []arr=new int [3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        System.out.print(arr[2]+ ", ");
        System.out.print(arr[1]+ ", ");
        System.out.print(arr[0]);
        System.out.println();
        double []doubleArr={1.57,7.654,9.986};
        System.out.print(doubleArr[2]+", ");
        System.out.print(doubleArr[1]+", ");
        System.out.print(doubleArr[0]);
        System.out.println();
        int [] intArr= {3,5,9,2,6};
        System.out.print(intArr[4]+", ");
        System.out.print(intArr[3]+", ");
        System.out.print(intArr[2]+", ");
        System.out.print(intArr[1]+", ");
        System.out.print(intArr[0]);
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача № 4");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0) {
               arr[i]++;
            }
            }
        System.out.println(Arrays.toString(arr));
        }
    }

