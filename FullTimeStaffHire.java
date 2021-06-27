
public class FullTimeStaffHire extends StaffHire
{
    //declare private variable
   private float salary;
   private int workingHour;
   private String staffName;
   private String joiningDate;
   private String qualification;
   private String appointedBy;
   private boolean joined;
  public FullTimeStaffHire(int vacancyNumber,String designation,String jobType,float salary,int workingHour){
       super(vacancyNumber,designation,jobType);
       this.salary=salary;
       this.workingHour=workingHour;
       staffName="";
       joiningDate="";
       qualification="";
       appointedBy="";
       joined=false;
  }
  //accesor method for each attribute
  public float getSalary(){
      return salary;
     }
  public void setSalary(float salary){
      this.salary=salary;
  }
  public int getWorkingHour(){
    return workingHour;
  }
  public void setWorkingHour(int workingHour){
      this.workingHour=workingHour;
  }
  public String getStaffName(){
    return staffName;
  }
  public void setStaffName(String staffName){
      this.staffName=staffName;  
  }
  public String getJoiningDate(){
      return joiningDate;
  }
  public void setJoiningDate(String joiningDate){
      this.joiningDate=joiningDate;
     }
  public String getQualification(){
      return qualification;
    }
   public void setQualification(String qualification){
        this.qualification=qualification;
  }
  public String getAppointedBy(){
      return appointedBy;
  }
  public void setAppointedBy(String appointedBy){
      this.appointedBy=appointedBy;
  }
  
  public void hireFullTimeStaff(String staffName,String joiningDate,String qualification,String appointedBy)
  {
      
      if(joined==true){
            System.out.println(this.staffName+' '+"has already joined from" + this.joiningDate+".");
        }else{
         this.staffName=staffName;
         this.joiningDate=joiningDate;
         this.qualification=qualification;
         this.appointedBy=appointedBy;
         joined=true;
      }  
  }
  public void display(){
      super.display();//calling the method from the StaffHire class 
      System.out.println("The salary of fulltime stsff is Rs."+this.salary );
      System.out.println("Total workinghour="+this.workingHour +"hours");
      System.out.println("The name of the new staff is "+staffName);
      System.out.println("The Joining date of new staff is from "+joiningDate);
      System.out.println("The Qualification is "+qualification);
      System.out.println("He/She is Appointed by "+appointedBy);
    }
}
