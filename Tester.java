public class Tester {
    int number = 10;
    static int age = 10;
    public static void main (String[] args) {
        Tester num1 = new Tester();
        Tester num2 = new Tester();
        static int gotNum = 10;
        int gotNum2 = 10;
        num2.number = 20;
        System.out.println(Tester.age);

        System.out.println(num1.number);
        System.out.println(num2.number);
        Tester.age = 30;
        num1.age = 10;
        num2.age = 1000;
        System.out.println(Tester.age);
    }
}
