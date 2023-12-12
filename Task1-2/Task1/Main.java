import java.util.Scanner;

/*Создайте систему управления геометрическими фигурами (круги, треугольники, прямоугольники).
        Используйте фабричный метод для создания объектов каждой фигуры.
*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Choice figure: CIRCLE, TRIANGLE, RECTANGLE");
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        Fabric fabric = new Fabric();
        fabric.build(Figure.FigureType.valueOf(figure));
        System.out.println(fabric.figure.getName());
    }
}