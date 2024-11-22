public class Main {
    
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Jordi");
        cat1.setAge(12);
        cat1.setFood("Udang");
        cat1.setGender(Gender.MALE);
        cat1.setAlive(Alive.DEAD);
        Dog dog1= new Dog();
        dog1.setName("jaysen");
        dog1.setAge(11);
        dog1.setFood("jigong");
        dog1.setGender(Gender.FEMALE);
        dog1.setAlive(Alive.ALIVE);
        
        System.out.println(cat1.printData());
        System.out.println(cat1.printSound());
        System.out.println(dog1.printData());


    }
}
