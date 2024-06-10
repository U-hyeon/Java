package pattern.decorator;

public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }


    @Override
    public void draw() {
//        decoratorShape.draw();
        setRedBorder(decoratorShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Red ============== START");
        decoratedShape.draw();
        System.out.println("Red ============== END");
    }
}
