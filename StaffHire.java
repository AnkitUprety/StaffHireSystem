
 public class StaffHire
 {
     //declarring the private variables as metioned in the questions
  private int vacancyNumber;
  private String designation;
  private String jobType;
  public StaffHire (int vacancyNumber,String designation,String jobType){
      this.vacancyNumber=vacancyNumber;
      this.designation=designation;
      this.jobType=jobType;
  }
  // this is getter and setter methods
    public int getVacancyNumber(){
    return vacancyNumber;
  }
  public void setVacancyNumber(int vacancyNumber){
      this.vacancyNumber=vacancyNumber;
    }
       public String getDesignation(){
    return designation;
  }
  public void setDesignation(String designation){
      this.designation=designation;
    }
       public String getJobType(){
    return jobType;
  }
  public void setJobType(String jobType){
      this.jobType=jobType;
    }
  public void display(){// this is methods to display the details 
      System.out.println("Vacancy Number="+getVacancyNumber());
      System.out.println("Designation="+getDesignation());
      System.out.println("Job Type="+ getJobType());
    }
}
