package hero;


public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Yoel", 125, 100, Status.ALIVE);
        HeroStrength hero2 = new HeroStrength("Jordan", 15, 100 , Status.ALIVE);
        
        System.out.println("\nhero 1");
        hero1.display();
        System.out.println("\nhero 2");
        hero2.display();
        
        hero1.attacks(hero2);









    }
}
