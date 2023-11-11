
public class Main {
    public static void main(String[] args) {
        Alik a1 = new Alik();
        Maxsim m1 = new Maxsim();
        a1.setAge(-45);
        m1.setAge(25);
        a1.getAge();
        System.out.println("Maxim age; " + m1.getAge());


        System.out.println("Alik: statistic");
        a1.eat();
        a1.game();
        a1.surfing();

        System.out.println("Maxim: statistic");
        m1.eat();
        m1.sleeap();
        m1.flu();
        m1.summer();


    }
}