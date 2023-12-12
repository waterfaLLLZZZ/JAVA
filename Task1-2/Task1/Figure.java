public class Figure {
    private String name;
    public Figure(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public enum FigureType{
        CIRCLE,
        TRIANGLE,
        RECTANGLE;
    }
}
