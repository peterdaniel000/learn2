public class array{
    public static void main(String[] args) {
        double[] Data = new double[4];
        Data[0] = 1;
        Data[1] = 3;
        Data[2] = 7;
        Data[3] = 8;

        if (Data[0] > Data[2]) {
            System.out.println(Data[0] + " is greater than " + Data[2]);
        }
        else {
            System.out.println(Data[0] + " is lesser than " + Data[2]);
        }
        double sum = 0;

        while (Data[0] <= 1) {
            sum = sum + Data[0] + Data[1] +  Data[2] +  Data[3];
            Data[0]++;
        }
        System.out.println(sum);
    }

}
