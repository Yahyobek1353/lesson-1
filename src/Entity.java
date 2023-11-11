public abstract class Entity {

    private String eat;
    private String sleeap;
    private  int age;

    public int getAge() {
        if (age <= 0 ){
            System.out.println("not correct age");
        }else {
            return age;
        }
        return age;
    }

    public void setAge(int age) {
        if (age <= 0){
            System.out.println("Возраст неможет быть минусовым !");
        }else {
            this.age = age;
        }

    }



    @Override
    public String toString() {
        return "Animal{" +
                "eat='" + eat + '\'' +
                ", sleeap='" + sleeap + '\'' +
                '}';
    }
}

