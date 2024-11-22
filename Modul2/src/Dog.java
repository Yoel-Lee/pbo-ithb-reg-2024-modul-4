public class Dog extends Hewan {
    @Override
    public String printSound() {
        return "woof";
    }

    @Override
    public boolean isAlive() {
        return this.getAlive() == Alive.ALIVE;
    }
}
