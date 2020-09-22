class Person{
    private int age;
    private String name;

    Person(){
        age = 18;
        name = "Pratham"
    }

    Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    void display(){
        System.out.println("Age = "+age+" "+"Name = "+name);
    }
}

class Assignment37{
    public static void main(String args[]){
        Person p1  =new Person();
        Person p2  =new Person(24,"Dipesh");
        p1.display();
        p2.display();
    }
}