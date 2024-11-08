package IntroductionInc;

public class Rectangle {
    private double width;
    private double height;
    public Rectangle(){}

//    public IntroductionInc.Rectangle(double width, double height) {
//        this.width = width;
//        this.height = height;
//    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return height;
    }

    public void setHeigth(double height) {
        this.height = height;
    }

    public double findArea(){
        return width * height;
    }
}
