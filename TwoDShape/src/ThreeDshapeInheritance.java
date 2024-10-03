public class ThreeDshapeInheritance extends TwoDshape{
    public ThreeDshapeInheritance(double l,double w){
        super(l,w);
    }
    //Inviting the superclass inside the current class constructor
    private double height;
    public ThreeDshapeInheritance(double l,double w, double h){
        this(l,w);
        height =h;
    }
    //no need for thr setter method
    public double getHeight(){
        return height;
    }
    public String toString(){
        return super.toString()+"\n Height is: "+height +"cm"
                +"\n Area is: "+super.area()*height+"cm sq.";
    }
    public double getValue(){
        return area()*height;
    }
}
