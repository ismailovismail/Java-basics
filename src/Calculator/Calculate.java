package Calculator;

import java.util.Scanner;

public class Calculate {

     public static double calculates(){
         Scanner s=new Scanner(System.in);
         System.out.println("a-ni daxil et");
         double a= s.nextDouble();
         System.out.println("b-ni daxil et");
         double b = s.nextDouble();
         System.out.println("operatoru daxil et");
         double operator=s.nextDouble();
         double result=0;
         if (operator==1){
             result=CalculateMethods.topla(a,b);
         }else if (operator==2){
             result=CalculateMethods.cixma(a,b);
         }else if (operator==3){
             result=CalculateMethods.vurma(a,b);
         }else if (operator==4){
             result=CalculateMethods.bolme(a,b);
         }else{
             System.out.println("oops,error");
         }
         return result;
     }



}
