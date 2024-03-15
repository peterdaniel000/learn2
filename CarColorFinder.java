public class CarColorFinder {
    public static void main(String[] args) {

        String[] carData = new String[7];
        carData[0] = "RED";
        carData[1] = "BLUE";
        carData[2] = "YELLOW";
        carData[3] = "BLACK";
        carData[4] = "WHITE";
        carData[5] = "PINK";
        carData[6] = "GREY";

        for (int i = 0; i < carData.length; i++) {
            if (carData[i].equals("RED")) {
                System.out.println("Our car color is red");
            }
            else if (carData[i].equals("BLUE")) {
                System.out.println("Our car color is blue");
            }
            else if (carData[i].equals("YELLOW")) {
                System.out.println("Our car color is yellow");
            }
            else if (carData[i].equals("BLACK")) {
                System.out.println("Our car color is Black");
            }
            else if (carData[i].equals("WHITE")) {
                System.out.println("Our car color is white");
            }
            else if (carData[i].equals("PURPLE")) {
                System.out.println("Our car color is pink");
            }
            else if (carData[i].equals("GREY")) {
                System.out.println("Our car color is grey");
            }
            else {
                System.out.println("We do  not have this type of color");
            }
        }
    }
}
