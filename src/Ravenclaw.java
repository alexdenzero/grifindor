public class Ravenclaw extends HogwartsStudent{
    private int smart;
    private int wit;
    private int creative;

    public Ravenclaw(String name, int magicPower, int trangressionDistance,int smart,int wit,int creative) {
        super(name, magicPower, trangressionDistance);
        this.smart = smart;
        this.wit = wit;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" + super.toString() + "smart=" + smart + ", wit=" + wit + ", creative=" + creative + '}';
    }
}
