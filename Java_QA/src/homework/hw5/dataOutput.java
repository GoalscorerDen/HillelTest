package homework.hw5;

public class dataOutput {
    public static void main(String[] args) {
        Cat kitten1=new Cat(false, "eats",4,"white");
        System.out.println(kitten1.getColor()); //shows entered color - white
        Cat kitten2=new Cat(false, "eats",4);
        System.out.println(kitten2.getColor()); //shows default for Cat color - orange
        Cat kitten3=new Cat();
        System.out.println(kitten3.getNoOfLegs()); //shows default for Animal noOflegs - 7
    }
}
