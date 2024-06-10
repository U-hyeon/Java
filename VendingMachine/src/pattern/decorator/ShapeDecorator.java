package pattern.decorator;

public abstract class ShapeDecorator extends Shape{
    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    public void draw() {
        decoratorShape.draw();
    }
}
