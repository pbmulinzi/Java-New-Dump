public class Studentt {
    String name;
    int age;
    int year;

    public Studentt(String name, int age, int year){
        this.name = name;
        this.age = age;
        this.year = year;
    }
    public static void main(String[] args) {
        Studentt x1 = new Studentt("Peter", 21, 1);  
        Studentt x2 = new Studentt("Jane", 25, 5);
        
        System.out.println(x1.name);
    }
}
