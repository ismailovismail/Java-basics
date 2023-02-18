public class Methods {
    public static void main(String[] args) {
        getInfo();
        info();
        String b = info();
        System.out.println("String="+b);
        double total=increment(4,5);
        System.out.println((int)total);
    }
    public static void getInfo(){
        System.out.println("Hello World");
    }

    public static String info(){
        System.out.println("info is called");

        return "task is completed";
    }
    public static double increment(double a, double b){
        return a+b;
    }



}
