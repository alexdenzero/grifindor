public abstract class HogwartsStudent {

    private String name;
    private  int magicPower;
    private  int trangressionDistance;

    public HogwartsStudent(String name, int magicPower, int trangressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.trangressionDistance = trangressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTrangressionDistance() {
        return trangressionDistance;
    }

    public void setTrangressionDistance(int trangressionDistance) {
        this.trangressionDistance = trangressionDistance;
    }

    @Override
    public String toString() {
        return "name='" + name + ", magicPower=" + magicPower + ", trangressionDistance=" + trangressionDistance;
    }
}
