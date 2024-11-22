public class Cat extends Hewan {
    @Override
    public String printSound() {
        return "miao";
    }

    @Override
    public boolean isAlive() {
        return this.getAlive() == Alive.ALIVE;
    }

    


}
