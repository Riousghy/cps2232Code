public class student extends people{

    private int Id;

    private String major;

    private double gpa;

    public student(){

    }
    public student(int Id,String major,double gpa){
        this.major=major;
        this.gpa=gpa;
        this.Id=Id;
    }
    //set the name of the student
    @Override
    public void setName(String name){
        super.name=name;
    }
    //get the name of the student from the people class


    public String getName() {
        return this.name;
    }
}
