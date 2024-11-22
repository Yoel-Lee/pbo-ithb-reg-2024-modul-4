public class Horse extends Hewan {
    @Override
    public String printSound() {
        return "uu aa";
    }
    @Override
    public boolean isAlive() {
        return this.getAlive() == Alive.ALIVE;
    }
}
