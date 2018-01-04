package shildt;

public class BoundsDemo {
    public static void main(String[] args) {
        Integer inums [] = {1,2,3,4,5};
        Stats<Integer> iob = new Stats<Integer>(inums);
        double v= iob.average();
        System.out.println("Aver. iob is equal " + v);

        Double dnums[] = {1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dob= new Stats<Double>(dnums);
        double w = dob.average();
        System.out.println("Aver. dob is equal " + w);

        //String strs [] = {"1","2","3", "4"};
        //Stats<String> strob = new Stats<String>();
        //...
    }
}
