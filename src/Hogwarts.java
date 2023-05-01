public class Hogwarts {
    public void compareGrifindor(Griffindor first, Griffindor second){
        int firstPoints = first.getBravery()+ first.getHonor()+ first.getNobility();
        int secondPoints = second.getBravery()+ second.getHonor()+ second.getNobility();
        if (firstPoints > secondPoints){
            System.out.println("Студент " + first.getName()+ " лучше чем " + second.getName());
        } else if (firstPoints < secondPoints) {
            System.out.println("Студент " + second.getName()+ " лучше чем " + first.getName());
        }else {
            System.out.println("Студенты " + second.getName()+ " и " + first.getName() + "равны");
        }
    }
    public void compareSlytherin(Slytherin first, Slytherin second){
        int firstPoints = first.getCunning()+ first.getResolve()+ first.getAmbition();
        int secondPoints = second.getCunning()+ second.getResolve()+ second.getAmbition();
        if (firstPoints > secondPoints){
            System.out.println("Студент " + first.getName()+ " лучше чем " + second.getName());
        } else if (firstPoints < secondPoints) {
            System.out.println("Студент " + second.getName()+ " лучше чем " + first.getName());
        }else {
            System.out.println("Студенты " + second.getName()+ " и " + first.getName() + "равны");
        }
    }
    public void compareHufflepuf(Hufflepuf first, Hufflepuf second){
        int firstPoints = first.getHardwork()+ first.getLoyalty()+ first.getIntegrity();
        int secondPoints = second.getHardwork()+ second.getLoyalty()+ second.getIntegrity();
        if (firstPoints > secondPoints){
            System.out.println("Студент " + first.getName()+ " лучше чем " + second.getName());
        } else if (firstPoints < secondPoints) {
            System.out.println("Студент " + second.getName()+ " лучше чем " + first.getName());
        }else {
            System.out.println("Студенты " + second.getName()+ " и " + first.getName() + "равны");
        }
    }
    public void compareRavenclaw(Ravenclaw first, Ravenclaw second){
        int firstPoints = first.getSmart()+ first.getWit()+ first.getCreative();
        int secondPoints = second.getSmart()+ second.getWit()+ second.getCreative();
        if (firstPoints > secondPoints){
            System.out.println("Студент " + first.getName()+ " лучше чем " + second.getName());
        } else if (firstPoints < secondPoints) {
            System.out.println("Студент " + second.getName()+ " лучше чем " + first.getName());
        }else {
            System.out.println("Студенты " + second.getName()+ " и " + first.getName() + "равны");
        }
    }
    public void compareHogwartsStudents(Ravenclaw first, Hufflepuf second){
        int firstPoints = first.getMagicPower()+ first.getTrangressionDistance();
        int secondPoints = second.getMagicPower()+ second.getTrangressionDistance();
        if (firstPoints > secondPoints){
            System.out.println("Студент " + first.getName()+ " лучше чем " + second.getName());
        } else if (firstPoints < secondPoints) {
            System.out.println("Студент " + second.getName()+ " лучше чем " + first.getName());
        }else {
            System.out.println("Студенты " + second.getName()+ " и " + first.getName() + "равны");
        }
    }
}
