class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {

}


public class Sample {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Poppy");
        System.out.println(dog.name);

    }
}