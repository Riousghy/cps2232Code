public class TwoDshape {
    private double len;
    private double wid;
    public TwoDshape(double l,double w){
        len =l;
        wid = w;
    }
    public double getLen(){
        return len;
    }
    public double getWid(){
        return wid;
    }
    public double area(){
        return wid*len;
    }
    public String toString(){
        return "Length is: "+len+"cm"+"\n Width is: "+wid+"cm";
    }


}