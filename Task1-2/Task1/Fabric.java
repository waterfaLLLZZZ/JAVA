
public class Fabric {
    Figure figure;
    public Fabric build(Figure.FigureType type) {
        switch (type) {
            case CIRCLE -> figure = new Figure("It is circle!");
            case TRIANGLE -> figure = new Figure("It is triangle!");
            case RECTANGLE -> figure = new Figure("It is rectangle!");
        }
        return null;
    }
}
