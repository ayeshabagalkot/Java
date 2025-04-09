class Animal{
    public void type(){
        System.out.print("Animal belongs to Mammal class. ");
    }
}

class Mammal extends Animal{
    public void feature(){
        System.out.print("Mammals have hair all over their body.");
    }
}

public class Dog {
    
    public static void main(String[] args) {
        Mammal dog1 = new Mammal();
        dog1.type();
        dog1.feature();
    }
}
