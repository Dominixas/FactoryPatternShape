public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        IShape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();

        IShape shape2 = shapeFactory.getShape("Square");
        shape2.draw();

        IShape shape3 = shapeFactory.getShape("Rectangle");
        shape3.draw();

    }
}
