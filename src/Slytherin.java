public class Slytherin extends HogwartsStudent{
    private int cunning;
    private int resolve;
    private int ambition;

    public Slytherin(String name, int magicPower, int trangressionDistance,int cunning,int resolve,int ambition) {
        super(name, magicPower, trangressionDistance);
        this.cunning = cunning;
        this.resolve = resolve;
        this.ambition = ambition;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getResolve() {
        return resolve;
    }

    public void setResolve(int resolve) {
        this.resolve = resolve;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    @Override
    public String toString() {
        return "Slytherin{" + super.toString() + "cunning=" + cunning + ", resolve=" + resolve + ", ambition=" + ambition + '}';
    }
}
