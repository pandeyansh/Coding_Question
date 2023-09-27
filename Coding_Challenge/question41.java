public class question41 {
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        return distance;
    }
    public static void main(String[] args) {
        double x1 = 2.0;
        double y1 = 3.0;
        double x2 = 5.0;
        double y2 = 7.0;
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Distance: " + distance);
    }
}