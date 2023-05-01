public class Hufflepuf extends HogwartsStudent{
    private  int hardwork;
    private int loyalty;
    private int integrity;
    public Hufflepuf(String name, int magicPower, int trangressionDistance,int hardwork,int loyalty,int integrity) {
        super(name, magicPower, trangressionDistance);
        this.hardwork = hardwork;
        this.loyalty = loyalty;
        this.integrity = integrity;
    }

    public int getHardwork() {
        return hardwork;
    }

    public void setHardwork(int hardwork) {
        this.hardwork = hardwork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getIntegrity() {
        return integrity;
    }

    public void setIntegrity(int integrity) {
        this.integrity = integrity;
    }

    @Override
    public String toString() {
        return "Hufflepuf{" + super.toString() + "hardwork=" + hardwork + ", loyalty=" + loyalty + ", integrity=" + integrity + '}';
    }
}
