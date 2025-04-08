package TRJava.JaClas;

public class Vlass {

    String name;
    String surname;
    int age;


    public void details() {
        System.out.println("Name: " + name + "Suranme: " + surname + "Age: " + age);
    }


}

class Car{

    String name;
    public void start(int hours){
        System.out.println("I am starting for "+hours);
    }
    public void stop(){
        System.out.println("I am stopping ");
    }
    public String Model(){
        return "Mers";
    }

}
