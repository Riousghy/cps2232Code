public class GeometricObject {
    private String color;
    private boolean filled;

    private java.util.Date dateCreated;

    public void GeometricObject(String color , boolean filled){
        this.color=color;
        this.filled=filled;

    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    public java.util.Date getDateCreated(){
        return this.dateCreated;
    }
    public String toString(){
        return "The geometricObject is "+this.color+" and it is "+ this.filled+" filled";
    }
    public double getArea(){
        return getArea();
    }

}
