public class Duck extends Hewan {
    @Override
    public String printSound() {
        return "pok pok";
    }

    @Override
    public boolean isAlive() {
        return this.getAlive() == Alive.ALIVE;
    }
}
