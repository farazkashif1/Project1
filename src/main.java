import java.util.Scanner;
public class main {
    public static void main(String[] args) {
//        int i=1;
//        System.out.println(i);
//        System.out.print("program \nin java");
//        System.out.printf("\n%s\n%s","hello","world");
//        Scanner input_number = new Scanner(System.in);
//        int number1,number2,sum;
//        System.out.println("\n enter first no.");
//        number1 = input_number.nextInt();
//        System.out.println("enter second no.");
//        number2 = input_number.nextInt();
//        sum = number1 + number2;
//        System.out.printf("Sum is %d\n",sum);
//        if ( number1 == number2 )
//            System.out.printf( "%d == %d\n", number1, number2 );
//        if ( number1 != number2 )
//            System.out.printf( "%d != %d\n", number1, number2 );
//        if ( number1 < number2 )
//            System.out.printf( "%d < %d\n", number1, number2 );
//        if ( number1 > number2 )
//            System.out.printf( "%d > %d\n", number1, number2 );
//        if ( number1 <= number2 )
//            System.out.printf( "%d <= %d\n", number1, number2 );
//        if ( number1 >= number2 )
//            System.out.printf( "%d >= %d\n", number1, number2 );

        Scanner input = new Scanner(System.in);
//        System.out.println("enter your name");
//        String name = input.nextLine();
//        anotherclass ac = new anotherclass(name);
//        ac.setName(name);
//        ac.display();
//          anotherclass ac1 = new anotherclass("hamza");
//          anotherclass ac2 = new anotherclass("sheraz");
//          System.out.printf("person 1 name is %s\n",ac1.getName());
//          System.out.printf("person 2 name is %s",ac2.getName());
//          int product = 3;
//          System.out.println(product);
//          System.out.println(++product);
//          System.out.println(product);
//          while (product <= 100){
//              System.out.println(product);
//              product = 3 * product;
//          }
//         for(int count=1; count<=10;count++){
//             System.out.println(count);
//         }
//        int n1=30,n2=8,min;
//        min = (n1 < n2 ) ? n1 : n2;
//        System.out.println(min);
//        int count=10;
//        while(count >0){
//            System.out.println(count);
//            count--;
//        }
//        int count =1;
//        do{
//            System.out.printf("%d",count);
//            ++count;
//        }while (count <= 10);
//        int num =5;
//        switch(num){
//            case 9:
//            case 8:
//                num++;
//                break;
//            default:
//                num--;
//                break;
//        }
//        System.out.printf("%d",num);
//     MethodOverload m = new MethodOverload();
//     m.testOverload();
        int[] c =new int[]{1,2,3,4,5,6,7,8,9,10,11,12};
        int v[]={};
        int d[];
        d = new int[12];
//        int total=0;
//        for(int counter : c){
//            c[counter] *= 2;
//            System.out.println(c[counter]);
//            total += c[counter];
//        }
//        System.out.println(total);
        display(c);
        int[][] arr = { { 1, 2 }, { 3, 4, 8 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
                System.out.println(
                        arr[i][j]);
        }
        }
    }
    public static void display(int[] b){
        for(int i : b){
            System.out.println(i);
        }
    }
    }

//one line comment

/* multiple line comment
 */