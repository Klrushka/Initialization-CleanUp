public class Dog {

    public void bark (int i) {
        System.out.println("fuf, int value = " + i);
    }

    public void bark (int i, String s) {
        System.out.println("fuf, int value = " + i + " " + "My string: " + s);
    }

    public void bark (String s, int i) {
        System.out.println("fuf, int value = " + i + " " + "My string: " + s);
    }

    public void bark (double i){
        System.out.println("fuf, double value = " + i);
    }

    public void bark (char i){
        System.out.println("fuf, char value = " + i);
    }

}
