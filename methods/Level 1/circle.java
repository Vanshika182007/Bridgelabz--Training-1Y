class Circle {
    double radius;

    // Method to calculate area
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    // Method to calculate circumference
    void calculateCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of Circle: " + circumference);
    }

    public static void main(String[] args) {
        Circle c = new Circle();

        c.radius = 5;
        c.calculateArea();
        c.calculateCircumference();
    }
}
