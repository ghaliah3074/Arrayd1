
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
//        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);

//
//        int[] number = new int[10];
//        System.out.println(Arrays.toString(number));
//
//        number[0] = 30;
//        number[1] = 23;
//        number[2] = 4;
//        number[3] = 10;
//        number[4] = 6;
//        number[5] = 33;
//        number[6] = 67;
//        number[7] = 8;
//        number[8] = 8;
//        number[9] = 9;
//
//       for (int i =number.length-1;  i>=0 ; i--) {
//           System.out.println(number[i]);
//        }


//        String[] namess = {"sara ", "ghada ", "fahad", "ali"};
//        for (int i = 0; i <=3; i++) {
//            System.out.println(namess[i]);
//
//        }

//        for (String n : namess) {
//            if (n.contains("a")) {
//                System.out.println(n);
//
//
//            }
//        }


//        int[] numbers={21,20,10,15};
//        for ( int n:numbers) {
//
//            if (n %2==0){
//                System.out.println("even"+n);
//            }
//             else {
//                System.out.println("odd"+n);
//            }
//        }
//

// String[] namess={"majd", "raghad","sara"};
//        for (String n:namess) {
//            if (n.endsWith("d"))
//                System.out.println(n);
//
//        }
//    }
//
//        int [] number={-1,2,-2,3,10};
//        for ( int n: number) {
//            if (n<0) {
//                System.out.println("negative " + n);
//            }
//              else if (n>0){
//                   System.out.println("positive "+n);
//                }
//               else System.out.println("zero");
//
//            }

//
//        ArrayList<String>names2=new ArrayList<String>();
//        System.out.println(names2);
//        names2.add("Ghaliah");
//        names2.add("sara");
//        names2.add("nuha");
//
//
//        names2.set(1,"maha");
//        names2.remove("ghaliah");
//        names2.remove(1);
//        System.out.println(names2);
//        System.out.println(names2.size());
//
//        for (int i = 0; i<names2.size() ; i++) {
//            System.out.println(names2.get(i));
//
//        }

//        ArrayList<String> color=new ArrayList<String>();
//        color.add("blue");
//        color.add("green");
//        color.add("black");
//        color.add("red");
//        color.set(2,"white");
//        color.remove(1);
//        System.out.println(color);

        Scanner s = new Scanner(System.in);

        System.out.println(" Enter the length array: ");
        int l= s.nextInt();

        int [] Array1=new int[l];
        ArrayList negative = new ArrayList<>();
        ArrayList positive = new ArrayList<>();


        for (int i = 0; i < Array1.length ; i++) {


        System.out.println(" pls enter number");
        int num=s.nextInt();

                if (num < 0) {

                    negative.add(num);

                } else if (num > 0) {
                    positive.add(num);

                }
            }

        System.out.println(negative);

        System.out.println(positive);
        }

    }






//        int[] numbers = new int[5];
//
//        numbers[0] = 30;
//        numbers[1] = 23;
//        numbers[2] = 4;
//        numbers[3] = 10;
//        numbers[4] = 6;
//
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]-10);
//        }
//




