import Calculator.Calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("netice="+(int) Calculate.calculates());
      double a = 4;
      double b = 2;
      double c =a/b ;
      int d = (int) c;
      System.out.println(d);

      double count1 = 53;
      double count2 = 41;
      double result = count1/count2;
      int resultInt = (int)result;
      System.out.println(resultInt);

       double module = count1 % 2 ;
       int resultModule = (int) module;
        System.out.println("tek="+resultModule);

       if ( module == 1 ){
           System.out.println("tek");
       }else {
           System.out.println("cut");
       }

       double count4 =28;
       double countResult =count4%5;
        System.out.println((int)countResult);

        Scanner skan= new Scanner(System.in);
        System.out.println("1ci reqemi daxil et");
        double reqem1=skan.nextDouble();
        System.out.println("2ci reqemi daxil et");
        double reqem2=skan.nextDouble();
        System.out.println("emeliyyati daxil et");
        double operator=skan.nextDouble();
        double netice=0;
        if (reqem1 !=reqem2 ){
            netice=reqem1+reqem2;
        }else if (operator==2){
            netice=reqem1-reqem2;
        }
        System.out.println("result:"+(int)netice);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 1; i < 8; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


        for (int i = 1; i < 8; i++) {
            for (int j = 0; j < 7-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 0; i <6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("=");
                if (j==2){
                    System.out.print("  ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }


        for (int i = 0; i <10 ; i++) {
            if (i == 2){
                break;
            }
            System.out.println(i+"==");
        }

        int i =0;

        while (i<10){
            System.out.println(i+"a");
            i++;
        }

        int battery=100;
        do {

          battery--;
          if (battery == 90) break;
            System.out.println("battery"+battery);
        }while (battery>80);

        for (int j = 1; j < 10; j++) {
            for (int k = 0; k < 9-j; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k <j ; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

       Methods.info();
        String g=Methods.info();
        System.out.println("String="+g);
    }
}