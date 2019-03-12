public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeStype) {
        if (shapeStype.equalsIgnoreCase("RECTANGLE")) {
            return new RoundedRectangle();
        }
        else if (shapeStype.equalsIgnoreCase("SQUARE")) {
            return new RoundedSquare();
        }
        return null;
    }
}
