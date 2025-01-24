package javaAdvance;

public class celsius {
    public static void main(String[] args){
        int fahr, celcuis;
        int lower, upper, step;

        lower = 0;
        upper = 300;
        step = 20;

        fahr = lower;
        while(fahr <= upper){
            celcuis = 5 * (fahr-32) / 9;
            System.out.println(fahr+ "\t" + celcuis);
            fahr = fahr + step;
        }
    }
}
