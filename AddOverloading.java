class Addition{

public void add(int a, int b){
    System.out.println(a+b);
}

public void add(int a, int b, int c){
    System.out.println(a+b+c);
}

public void add(double a, double b){
    System.out.println(a+b);
}

public void add(int a, double b){
    System.out.println(a+b);
}

public void add(double a, int b){
    System.out.println(a+b);
}
}

public class AddOverloading {
    public static void main(String[] args) {
        Addition obj = new Addition();
        
        obj.add(2.3, 3);
        obj.add(8, 9.1);
        obj.add(6.2, 1.1);
        obj.add(4, 7);
        obj.add(8, 6, 8);
    }
}
