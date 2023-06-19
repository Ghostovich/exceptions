
public class hw1 {

    public static void main(String[] args) {
        String[][] arr = new String[][] {
            {"1", "1", "1", "1", "1"},
            {"1", "1", "1", "1", "1"},
            {"1", "1", "1", "1", "1"},
            {"1", "0", "0", "1", "1"},
            {"1", "1", "1", "1", "1"}
        };

        int[] arr1 = new int[] {1,2,3};
        int[] arr2 = new int[] {1,2,3};
        // System.out.println(sum2d(arr));
        // firstMethod();
        //secondMethod();
        //thirdMethod();
        difference(arr1, arr2);
    }


    // 1 Реализуйте 3 метода, чтобы в каждом из них получить разные стандартные для Java исключения;

    public static void firstMethod() {
        for (int i = 2; i<10000; i++){
            i=i*i;
            firstMethod();
        }
    }

    public static void secondMethod() {
       int a =1;
       int b =0;
       int c = a/b;
       System.out.println(c);
    }

    public static void thirdMethod() {
       int a =null;
       int b =1;
       int c = a/b;
       System.out.println(c);
    }

    // 2 Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить? 

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    //method sum2d in the type hw1 is not applicable for the arguments(string, string)
    //method parseInt in the type hw1 is not applicable for the arguments

    // 3 Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
    // и возвращает новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
    // Если длины массивов не равны, необходимо как-то оповестить пользователя.

    public static void difference(int[] arr1, int[] arr2) {
        int[] arr3 = new int[]{};
        try {
        for (int i = 0; i < arr1.length; i++) {
                int num = arr2[i]-arr1[i];
                arr3[i]=num;
            }
        System.out.println(arr3); 
        } catch (Exception e) {
            System.out.println("Error");
        }       
                
    }
}




