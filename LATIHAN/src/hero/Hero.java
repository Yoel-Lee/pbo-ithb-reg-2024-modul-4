package hero;
class Hero {
    String name;
    int attackPow;
    int health;
    Status status;

    public Hero(String name, int attackPow, int health, Status status) {
        this.name = name;
        this.attackPow = attackPow;
        this.health = health;
        this.status= status;
    }

        void attacks(Hero victim){
            System.out.println("\n"+this.name+" attacks "+victim.name);
            takedamage(victim);
        }

        void takedamage(Hero victim){
            victim.health-=this.attackPow;
            if (victim.health <= 0) {
                victim.health = 0;
                victim.status = Status.DEAD;  
            }
            System.out.println(victim.name + " takes " + this.attackPow + " damage, remaining health: " + victim.health);
            System.out.println(victim.name + " status: " + victim.status);

        }







        void display() {
            System.out.println("Name : " + this.name + "\nAttack Power : " + this.attackPow + "\nHealth : " + this.health + "\nStatus : " + this.status);
        }
}

