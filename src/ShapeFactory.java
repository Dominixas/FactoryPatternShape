public class ShapeFactory {

    public IShape getShape(String typeOfShape){
        if(typeOfShape == null){
            return null;
        }
        if(typeOfShape.equals("Circle")){
            return new Circle();
        }
        else if(typeOfShape.equals("Square")){
            return new Square();
        }
        else if(typeOfShape.equals("Rectangle")){
            return new Rectangle();
        }
        return null;
    }
}
