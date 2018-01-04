package golovach;

public class ArrExample {
    public static void main(String[] args) {
        Object [] objects = new Integer[2];
        objects[0] = 1;
        objects[1] =2;

        Experem exp = new Experem(1);
        String a = (String)exp.getT();
        System.out.println(a);
    }
}
