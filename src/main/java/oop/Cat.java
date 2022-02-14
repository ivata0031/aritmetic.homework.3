package oop;

public class Cat extends Pet{

    public Cat(boolean hasTail, String name, int age, Breed breed, Address address) {
        super(hasTail, name, age, breed, address);
    }
    public Cat(){
        super(true,"",0,new Breed("") ,null);

    }

    public void barf(){
        System.out.println("Mqu mqu");
    }


}
