public class Student{
    String name;
    int year;
    int yob;
    int age(){
        return 2024-yob;
    }

// public class Car{
//     String name;
//     int year;
//     int mileage;
// }
// public class Book{
//     String name;
//     String author;
//     int price;
// } 
public static void main(String[] args){
  Student x = new Student();
    // Car y = new Car();
    // Book z = new Book();

    x.name = "Peter";
    x.year = 1;
    x.yob = 2003;
    x.age();
    // y.name = "Subaru";
    // y.year = 2022;
    // y.mileage = 20000;
    // z.name = "Big Little Lies";
    // z.author = "Liane Moriarty";
    // z.price = 50000;

    System.out.println(x.age() + " year old "+ x.name + ", is in his year "+ x.year);
    // System.out.println("My "+ y.name +" "+ y.year + " model has so far covered "+ y.mileage + "km");
    // System.out.println("The book "+ z.name + ", by "+ z.author + " is sold at " + "UGX."+ z.price);

}

}