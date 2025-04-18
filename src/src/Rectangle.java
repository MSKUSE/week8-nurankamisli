public class Rectangle extends Shape{
    private int sideA=0;
    private int sideB=0;

    public Rectangle() {

    }

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Side A is " + sideA+" Side B is " + sideB);
    }

    @Override
    public boolean equals(Object obj) {
        Rectangle rectangle=(Rectangle) obj;
        if(this.getSideA()==rectangle.getSideA() &&this.getSideB()==rectangle.getSideB() && this.getColor().equals(rectangle.getColor()){
            return true;
        }else{
            return false;
        }
    }


}
