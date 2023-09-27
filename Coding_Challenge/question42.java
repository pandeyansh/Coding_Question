public class question42 {
    public static boolean checkCircleIntersection(double x1, double y1, double r1, double x2, double y2, double r2) {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        if (distance <= r1 + r2) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        double x1 = 2.0;
        double y1 = 3.0;
        double r1 = 5.0;
        double x2 = 5.0;
        double y2 = 7.0;
        double r2 = 3.0;
        boolean isIntersecting = checkCircleIntersection(x1, y1, r1, x2, y2, r2);
        System.out.println("Are the circles intersecting? " + isIntersecting);
    }
}