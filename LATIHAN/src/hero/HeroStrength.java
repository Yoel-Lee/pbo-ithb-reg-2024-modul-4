package hero;

class HeroStrength extends Hero {
    String type = "Strength-Type";

    public HeroStrength(String name, int attackPow, int health ,Status status) {
        super(name, attackPow, health , status);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Type : "+ this.type);
    }

    
}
