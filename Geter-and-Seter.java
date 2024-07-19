public class GeterandSetter 
{  
      //PARAMETERS//
    private int id;
    private String Name;
    private int Salary;
    private String Job;
    //PARAMETERS//

    //Constructor//
    public GeterandSetter(int id,String Name,int Salary,String Job)
    {
      this.id=10;
      this.Name="Shreyash";
      this.Salary=7700;
      this.Job="Avinash Arghode";
      //Constructor//
    } 
    //Geter AND Setters//
    public int getid()
    {
      return id; 
    }
    public void setid(int id)
    {
        this.id=id;
    }
    public String getName()
    {
        return Name;
    }
    public void setName(String Name)
    {
        this.Name=Name;
    }
    public int getSalary()
    {
        return Salary;
    }
    public void setSalary(int Salary)
    {
        this.Salary=Salary;
    }
    public String getJob()
    {
        return Job;
    }
    public void setJob(String Job)
    {
        this.Job=Job;
        //Geter AND Setters//
    }
    //Main method//
    public static void main(String[] args) 
    //Main method//
    {   
        //Object// 
    GeterandSetter Shreyash =new GeterandSetter(10,"Shreyash",20,"Avinash Sharmraoji Arghode");
    //Object//

    //Set method Called//
    Shreyash.setid(2000);
    Shreyash.setName("Avinash");
    Shreyash.setSalary(1000000);
    Shreyash.setJob("Engineer");
      //Set method Called//

      //Get Method print//
    System.out.println("ID "+Shreyash.getid());
    System.out.println("Name "+Shreyash.getName());
    System.out.println("Salary "+Shreyash.getSalary());
    System.out.println("Job "+Shreyash.getJob());
     //Get Method print//
    }
}

