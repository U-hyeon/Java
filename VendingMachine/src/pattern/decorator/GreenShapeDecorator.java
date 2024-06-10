package pattern.decorator;

public class GreenShapeDecorator extends ShapeDecorator{
    public GreenShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }


    @Override
    public void draw() {
//        decoratorShape.draw();
        setRedBorder(decoratorShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Green ============== START");
        decoratedShape.draw();
        System.out.println("Green ============== END");
    }
}
