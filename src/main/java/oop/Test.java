package oop;

public class Test {
    public static void main(String[] args) {
        Cat tiger = new Cat();
        Address catAddress = new Address();
        catAddress.setCity("Sofia");
        catAddress.setPostalCode(1000);
        catAddress.setStreetName("some street name");
        tiger.printData();

        tiger.setAge(2);
        tiger.setBreed(new Breed("Tiger"));
        tiger.setHasTail(true);
        tiger.setName("Molly");
        tiger.setAddress(catAddress);
        tiger.printData();

        tiger.run();
        tiger.jump();
    }
}
