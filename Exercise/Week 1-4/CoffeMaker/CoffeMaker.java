package CoffeMaker;

class CoffeeMaker {
    private static final int tooCold= 55;
    private static final int tooHot= 85;
    public static void makeCoffee(int temperature) throws TooCold, TooHot {
        if(temperature <= tooCold) throw new TooCold();
        if(temperature >= tooHot) throw new TooHot();
        System.out.println("Mmm!");
    }
    public static void tasteCoffe(int tempCoffee){
        try {
            makeCoffee(tempCoffee);
        } catch (TooCold tooCold1) {
            System.out.println("yuck");;
        } catch (TooHot tooHot1) {
            System.out.println("Ouch");;
        }
    }

    public static void main(String[] args) {
        tasteCoffe(54);
        tasteCoffe(86);
        tasteCoffe(77);
    }
}
class TooCold extends Exception{}
class TooHot extends Exception{}
