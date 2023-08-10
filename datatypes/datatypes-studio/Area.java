public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius");
        double radius = input.nextDouble();
    }
    public static double getArea(double radius){
        return 3.14 * radius * radius;
    }
}
