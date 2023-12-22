package Homework_31;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape square = new Square(4);
        Shape circle = new Circle(3);

        printShapeInfo("Прямоугольник", rectangle);
        printShapeInfo("Квадрат", square);
        printShapeInfo("Окружность", circle);

        double totalArea = calculateTotalArea(rectangle, square, circle);
        System.out.println("Общая площадь всех фигур: " + totalArea);
    }

    private static void printShapeInfo(String shapeName, Shape shape) {
        System.out.println("Фигура: " + shapeName);
        System.out.println("Площадь: " + shape.calculateArea());
        System.out.println("Периметр: " + shape.calculatePerimeter());
        System.out.println();
    }

    private static double calculateTotalArea(Shape... shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}

