abstract class Hewan {
    String name;
    int age;
    String food;
    Gender gender;
    Alive alive;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getFood() {
        return food;
    }
    public void setFood(String food) {
        this.food = food;
    }
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public Alive getAlive() {
        return alive;
    }
    public void setAlive(Alive alive) {
        this.alive = alive;
    }   


    public String printSound (){
        return "default animal sound";
    }


    public boolean isAlive(){
return alive == Alive.ALIVE;
    }
    

    public String printData(){
        return "name: " + name + ", age: " + age + ", Food: " + food + ",gender: " + gender + ", alive: " + alive;
    }

}

