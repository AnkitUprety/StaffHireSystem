
public class PartTimeStaffHire extends StaffHire
{
    //making private variable
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;
    public PartTimeStaffHire(int vacancyNumber,String designation, String jobType, int workingHour, int wagesPerHour, String shifts){
        super(vacancyNumber,designation,jobType);
        // update the  workingHour,wagesPerHour,shifts to the instance variable using this keyword
        this.workingHour=workingHour;
        this.wagesPerHour=wagesPerHour;
        this.shifts=shifts;
        staffName="";
        joiningDate="";
        qualification="";
        appointedBy="";
        joined=false;
        terminated=false;
    }
    //access method for each attributes merntioned in the Questions
    //getter method for all the variables.
    public int getWorkingHour(){
        return this.workingHour;
    }

    public int getWagesPerHour(){
        return this.wagesPerHour;
    }

    public String getShifts(){
        return this.shifts;
    }

    public String getStaffName(){
        return staffName;
    }

    public String getJoiningDate(){
        return joiningDate;
    }

    public String getQualification(){
        return qualification;
    }

    public String getAppointedBy(){
        return appointedBy;
    }

    public boolean getJoined(){
        return joined;
    }

    public boolean getTerminated(){
        return terminated;
    }

    public void setWorkingHour(int WorkingHour){
        this.workingHour=workingHour;

    }

    public void setWagesperHour(int WagesPerHour){
        this.wagesPerHour=wagesPerHour;

    }

    public void setStaffName(String StaffName){
        this.workingHour=workingHour;

    }

    public void setJoiningDate(String JoiningDate){
        this.joiningDate=joiningDate;

    }

    public void setQualification(String Qualification){
        this.qualification=qualification;

    }

    public void setAppointedBy(String AppointedBy){
        this.appointedBy=appointedBy;

    }
   //It is method to change the new shift of the staff
    public void setShifts(String shifts){
        if(getJoined()==true){
            System.out.println("It is not allowed to change shift");
        }else{
            this.shifts=shifts;
        }
    }

    public void setJoined(boolean Joined){
        this.joined=joined; 

    }

    public void setTerminated(boolean terminated){
        this.terminated=terminated;

    }

    public void hirePartTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy)
    {//checking whether the staff is hired or not.
        if(joined==true){
            System.out.println(getStaffName()+ "has joined from"+this.getJoiningDate()+"."); 
        }else{
            //update the parameter values to corresponding varaiable
            //update joined variable to true
            //update terminated variable to false
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            joined=true;
            terminated=false;
        }
    }

    public void terminateTheStaff(String staffName, String joiningDate, String qualification, String appointedBy)
    {//checking the termination status of the staff 
        if(terminated==true){
            System.out.println(staffName+"has already been terminated!");
        }else{
            //update the empty and zero variable 
            //update the terminated status true
            //update the joined status  false
            this.staffName="";
            this.joiningDate="";
            this.qualification="";
            this.appointedBy="";
            terminated=true;
            joined=false;
        }
    }
    //defining  the same method that was declared in super class
    //display method 	
    public void display(){
        super.display(); //calling the method from the StaffHire class which is The parent class
        this.staffName=staffName;
        this.joiningDate=joiningDate;
        this.qualification=qualification;
        this.appointedBy=appointedBy;
        joined=true; 
        if(joined==true)
        {
            System.out.println("The name of the new Parttime staff is"+this.staffName);
            System.out.println("WagesPerHour="+this.wagesPerHour);
            System.out.println("Total working hour of parttime staff is "+this.workingHour+"hours.");
            System.out.println("The joining date of parttime Staff is "+this.joiningDate+".");
            System.out.println("The qualification ot parttime Staff is "+this.qualification+".");
            System.out.println("The parttime staff is appointed by "+this.appointedBy+".");
            System.out.println("Income per day=Rs."+(this.wagesPerHour * this.workingHour)+".00");
        }
    }
}

 
