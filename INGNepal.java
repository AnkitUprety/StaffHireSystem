
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.UIManager;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.io.IOException;

import java.awt.Font;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class INGNepal
{
    private JFrame  frame, frame1, frame2;
    private JPanel p;
    private JLabel lble,lble1,lble2,lble3,lble4,lble5,lble6,lble7,lble8,lble9,lble10,lble11;
    private JButton dis,dis1,clr,addfulltime,appin,bck,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
    private Font f;
    private JTextField text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11;
    
    ArrayList <StaffHire> k = new ArrayList <StaffHire>();
    
    public INGNepal(){
        frame = new JFrame("INGNepal");
        frame.setLayout(null);
        lble = new JLabel(" Staff Hire System");
        lble.setBounds(105,100,300,50);
        frame.add(lble);
        frame.setSize(500,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.YELLOW);

        btn1 = new JButton("Full Time");
        btn1.setBounds(75,200,100,40);

        btn2 = new JButton("Part Time");
        btn2.setBounds(300,200,100,40);

        f = new Font("TIMESROMAN", Font.BOLD|Font.ITALIC, 30);
        lble.setFont(f);

        frame.add(btn1);
        frame.add(btn2);
        frame.setResizable(false);

        btn1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    frame.setVisible(false);
                    fullTimeStaffHire();
                    frame1.setVisible(true);
                }
            });

        btn2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    frame.setVisible(false);
                    partTimeStaffHire();
                    frame2.setVisible(true);
                }
            });  
    }


    public void fullTimeStaffHire(){
        frame1 = new JFrame("FullTime StaffHire");
        frame1.setLayout(null);
        frame1.setSize(880,530);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(false);
        frame1.setResizable(false);
        frame1.getContentPane().setBackground(Color.PINK);

        lble1 = new JLabel("VacancyNumber ");
        text1 = new JTextField();
        lble1.setBounds(30,50,130,50);
        text1.setBounds(130,63,300,30);
        frame1.add(lble1);
        frame1.add(text1);

        lble2 = new JLabel("Job Type : ");
        text2 = new JTextField();
        lble2.setBounds(30,90,100,50);
        text2.setBounds(130,103,300,30);
        frame1.add(lble2);
        frame1.add(text2);

        lble3 = new JLabel("Designation : ");
        text3 = new JTextField();
        lble3.setBounds(30,130,100,50);
        text3.setBounds(130,143,300,30);
        frame1.add(lble3);
        frame1.add(text3);

        lble4 = new JLabel("Working Hour : ");
        text4 = new JTextField();
        lble4.setBounds(30,170,100,50);
        text4.setBounds(130,183,300,30);
        frame1.add(lble4);
        frame1.add(text4);

        lble5 = new JLabel("Salary : ");
        text5 = new JTextField();
        lble5.setBounds(30,220,100,50);
        text5.setBounds(130,233,300,30);
        frame1.add(lble5);
        frame1.add(text5);
        
        lble10 = new JLabel("VacancyNumber : ");
        text10 = new JTextField();
        lble10.setBounds(440,50,100,50);
        text10.setBounds(535,63,300,30);
        frame1.add(lble10);
        frame1.add(text10);

        lble6 = new JLabel("Staff Name : ");
        text6 = new JTextField();
        lble6.setBounds(450,90,100,50);
        text6.setBounds(535,103,300,30);
        frame1.add(lble6);
        frame1.add(text6);

        lble7 = new JLabel("Qualification : ");
        text7 = new JTextField();
        lble7.setBounds(450,130,100,50);
        text7.setBounds(535,143,300,30);
        frame1.add(lble7);
        frame1.add(text7);

        lble8 = new JLabel("Joining Date : ");
        text8 = new JTextField();
        lble8.setBounds(450,170,100,50);
        text8.setBounds(535,183,300,30);
        frame1.add(lble8);
        frame1.add(text8);

        lble9 = new JLabel("Appointed By : ");
        text9 = new JTextField();
        lble9.setBounds(450,220,100,50);
        text9.setBounds(535,233,300,30);
        frame1.add(lble9);
        frame1.add(text9);      

        addfulltime = new JButton("Add ");//creating add button
        addfulltime.setBounds(150,350,95,60);
        frame1.add(addfulltime);
        addfulltime.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    fulltimeadd();

                }
            });
        appin = new JButton("Appoint");//creating appoint button
        appin.setBounds(350,350,95,60);
        frame1.add(appin);
        appin.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                   fulltimeappoint();
                }
            });
            
         dis1 = new JButton("Display");//creating disply button
        dis1.setBounds(500,350,95,60);
        frame1.add(dis1);
        dis1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    if (ae.getActionCommand() == "Display"){
                        JOptionPane.showMessageDialog(frame1,
                            "Vacancy Number: "+ text1.getText()+
                            "\n Job Type : "+ text2.getText()+
                            "\n Designation : "+ text3.getText()+
                            "\n Working Hour : "+ text4.getText()+
                            "\n Salary : "+ text5.getText()+
                            "\n Staff Name : "+ text6.getText()+
                            "\n Qualification : "+ text7.getText()+
                            "\n Joining Date: "+ text8.getText()+
                            "\n Appointed By: "+ text9.getText()
                        );
                        JOptionPane.showMessageDialog(frame1, "Thank You");
                        
                    }
                }
            });

        clr = new JButton("Clear");
        clr.setBounds(700,350,95,60);
        frame1.add(clr);
        clr.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    fulltimeclear();
                }
            });    
        
        bck = new JButton("Back");
        bck.setBounds(10,25,75,20);
        frame1.add(bck);
        bck.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    if (ae.getActionCommand() == "Back"){
                        frame1.setVisible(false);
                        frame.setVisible(true);
                    }
                }
            });
    }
    
    public void fulltimeadd()
    {
        int vacancyNumber, salary, workingHourPerDay;
                    String jobType, designation;
                    String VacancyNumber = text1.getText();
                    String Designation = text3.getText();
                    String JobType = text2.getText();
                    String Salary = text5.getText();
                    String WorkingHourPerDay = text4.getText();
                    if(VacancyNumber.trim().equals("") || Designation.trim().equals("") || JobType.trim().equals("") || Salary.trim().equals("") || WorkingHourPerDay.trim().equals("")){
                        JOptionPane.showMessageDialog(frame, "Please fill up all the required fields.");
                    } else {
                        try{
                            vacancyNumber = Integer.parseInt(VacancyNumber);
                            designation = Designation;
                            jobType = JobType;
                            salary = Integer.parseInt(Salary); 
                            workingHourPerDay = Integer.parseInt(WorkingHourPerDay);
                        } catch(NumberFormatException NOE){
                            JOptionPane.showMessageDialog(frame, NOE.getMessage(), "ERROR!!", JOptionPane.ERROR_MESSAGE);
                            return;   
                        }

                        for(StaffHire staff : k) {
                            if(staff instanceof FullTimeStaffHire) {
                                FullTimeStaffHire ftsh1 = (FullTimeStaffHire) staff;
                                if(staff.getVacancyNumber() == vacancyNumber){
                                    JOptionPane.showMessageDialog(frame, " Staff with this vacancy Number already exists", "ERROR", 0);
                                    return;
                                }
                            }
                        }
                        FullTimeStaffHire fullTimeStaffObj = new FullTimeStaffHire(vacancyNumber, designation, jobType, salary, workingHourPerDay);
                        k.add(fullTimeStaffObj);
                        JOptionPane.showMessageDialog(frame, "Datas are sucessfully added!!", "SUCCESS", 1);
                    }
    }
    
    public void fulltimeappoint()
    {
        String vacancyNumber= text1.getText();
                    String staffName=text6.getText();
                    String joiningDate=text8.getText();
                    String qualification=text7.getText();
                    String appointedBy=text9.getText();
                    int vacancy;

                    if (vacancyNumber.trim().equals("") || staffName.trim().equals("") || joiningDate.trim().equals("") || qualification.trim().equals("") || appointedBy.trim().equals("")){
                        JOptionPane.showMessageDialog(frame, "Enter All The Field", "Error", 0);
                    }
                    else{
                        try{
                            vacancy = Integer.parseInt(vacancyNumber);
                        }
                        catch (NumberFormatException nfe){
                            JOptionPane.showMessageDialog(frame, "Please Enter  datas In A Correct Format", "Error", 0);
                            return;
                        }
                        for (StaffHire s : k){
                            if (s instanceof FullTimeStaffHire){
                                FullTimeStaffHire full = (FullTimeStaffHire) s;
                                if (full.getVacancyNumber() == vacancy){
                                    full.hireFullTimeStaff(staffName, joiningDate, qualification, appointedBy);
                                    JOptionPane.showMessageDialog(frame, "Staff is  Hired", "Detail", 1);
                                    break;
                                }
                                else
                                    JOptionPane.showMessageDialog(frame, "Vacancy not found", "Error", 0);
                            }
                        }
                    }
    }
    
    public void fulltimeclear()
    {
        int x = JOptionPane.showConfirmDialog(frame1,"Do you want to clear the information", "info", JOptionPane.YES_NO_OPTION);
                    if (x == JOptionPane.YES_OPTION){
                        text1.setText(null);
                        text2.setText(null);
                        text3.setText(null);
                        text4.setText(null); 
                        text5.setText(null);
                        text10.setText(null);
                        text6.setText(null);
                        text7.setText(null);
                        text8.setText(null);
                        text9.setText(null);
                        JOptionPane.showMessageDialog(frame1, "Data is Cleared");
                    }

                    if (x == JOptionPane.NO_OPTION){
                    }  
    }
    
    

    public void partTimeStaffHire(){
        frame2 = new JFrame("PartTime StaffHire");
        frame2.setLayout(null);
        frame2.setSize(650,650);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(false);
        frame2.setResizable(false);
        frame2.getContentPane().setBackground(Color.PINK);

        lble1 = new JLabel("VacancyNumber : ");
        text1 = new JTextField();
        lble1.setBounds(30,50,130,50);
        text1.setBounds(130,63,300,30);
        frame2.add(lble1);
        frame2.add(text1);

        lble2 = new JLabel("Designation : ");
        text2 = new JTextField();
        lble2.setBounds(30,90,100,50);
        text2.setBounds(130,103,300,30);
        frame2.add(lble2);
        frame2.add(text2);

        lble3 = new JLabel("Job Type : ");
        text3 = new JTextField();
        lble3.setBounds(30,130,100,50);
        text3.setBounds(130,143,300,30);
        frame2.add(lble3);
        frame2.add(text3);

        lble4 = new JLabel("WagesPerHour : ");
        text4 = new JTextField();
        lble4.setBounds(30,170,100,50);
        text4.setBounds(130,183,300,30);
        frame2.add(lble4);
        frame2.add(text4);

        lble5 = new JLabel("Working Hour : ");
        text5 = new JTextField();
        lble5.setBounds(30,220,100,50);
        text5.setBounds(130,233,300,30);
        frame2.add(lble5);
        frame2.add(text5);

        lble6 = new JLabel("Shifts : ");
        text6 = new JTextField();
        lble6.setBounds(30,270,100,50);
        text6.setBounds(130,283,300,30);
        frame2.add(lble6);
        frame2.add(text6);
        
        lble11 = new JLabel("VacancyNumber : ");
        text11 = new JTextField();
        lble11.setBounds(180,360,100,50);
        text11.setBounds(280,373,300,30);
        frame2.add(lble11);
        frame2.add(text11);

        lble7 = new JLabel("Staff Name : ");
        text7 = new JTextField();
        lble7.setBounds(180,410,100,50);
        text7.setBounds(280,423,300,30);
        frame2.add(lble7);
        frame2.add(text7);

        lble8 = new JLabel(" Qualification: ");
        text8 = new JTextField();
        lble8.setBounds(180,460,100,50);
        text8.setBounds(280,473,300,30);
        frame2.add(lble8);
        frame2.add(text8);

        lble9 = new JLabel("Appointed By : ");
        text9 = new JTextField();
        lble9.setBounds(180,510,100,50);
        text9.setBounds(280,523,300,30);
        frame2.add(lble9);
        frame2.add(text9);

        lble10 = new JLabel("Joining Date : ");
        text10 = new JTextField();
        lble10.setBounds(180,560,100,50);
        text10.setBounds(280,573,300,30);
        frame2.add(lble10);
        frame2.add(text10);
               
        btn7 = new JButton("Add");
        btn7.setBounds(500,160,95,33);
        frame2.add(btn7);
        btn7.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    parttimeadd();
                }
            });

        btn5 = new JButton("Appoint");
        btn5.setBounds(20,370,95,33);
        frame2.add(btn5);
        btn5.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae) // method for appointing staff for part time
                {
                    parttimeappoint();
                }
            });

                    
        btn8 = new JButton("Terminate PartTime");
        btn8.setBounds(20,423,95,33);
        frame2.add(btn8);
        btn8.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae) // method for terminating staff
                {
                    parttimeterminate();      
                }
            });
            
          dis = new JButton("Display");
        dis.setBounds(20,470,95,33);
        frame2.add(dis);
        dis.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    if (ae.getActionCommand() == "Display"){
                        JOptionPane.showMessageDialog(frame1,
                            "\nVacancy Number: "+ text1.getText()+
                            "\n Designation: "+ text2.getText()+
                            "\n Job Type: "+ text3.getText()+
                            "\n Wages Per Hour: "+ text4.getText()+
                            "\n Working Hour: "+ text5.getText()+
                            "\n Shifts: "+ text6.getText()+
                            "\n Staff Name: "+ text7.getText()+
                            "\n Qualificaion: "+ text8.getText()+
                            "\n Appointed By: "+ text9.getText()+
                            "\n Joining Date: "+ text10.getText()
                        );
                        JOptionPane.showMessageDialog(frame2, "Thank You");
                        
                    }
                }
            });

        btn3 = new JButton("Clear");
        btn3.setBounds(20,523,95,33);
        frame2.add(btn3);
        btn3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    parttimeclear();
                }
            });

        btn4 = new JButton("Back");
        btn4.setBounds(10,25,75,20);
        frame2.add(btn4);
        btn4.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    if (ae.getActionCommand() == "Back"){
                        frame2.setVisible(false);
                        frame.setVisible(true);
                    }
                }
            });
    }
    
      public void parttimeadd()
    {
        int vacancyNumber, workingHour, wagesPerHour;
                    String designation, jobType, shift;
                    String VacancyNumber = text1.getText();
                    String Designation = text2.getText();
                    String JobType = text3.getText();
                    String WorkingHour = text5.getText();
                    String WagesPerHour = text4.getText();
                    String Shift = text6.getText();
                    if (VacancyNumber.trim().equals("") || Designation.trim().equals("") || JobType.trim().equals("") || WorkingHour.trim().equals("") || Shift.trim().equals("") || WagesPerHour.trim().equals("")){
                        JOptionPane.showMessageDialog(frame, "Please fill up all the  fields.");
                    } else{
                        try{
                            designation = Designation;
                            jobType = JobType; 
                            vacancyNumber = Integer.parseInt(VacancyNumber);
                            workingHour = Integer.parseInt(WorkingHour);
                            wagesPerHour = Integer.parseInt(WagesPerHour);
                            shift = Shift;
                        } catch(NumberFormatException NOE){
                            JOptionPane.showMessageDialog(frame, NOE.getMessage(), "ERROR!!", JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                        for(StaffHire sh3 : k){
                            if (sh3 instanceof PartTimeStaffHire){
                                PartTimeStaffHire ptsh1 = (PartTimeStaffHire) sh3;
                                if(ptsh1.getVacancyNumber() == vacancyNumber){
                                    JOptionPane.showMessageDialog(frame, " Staff with this vacancy Number already exists");
                                    return;
                                }
                            }
                        }
                        PartTimeStaffHire partTimeStaffObj = new PartTimeStaffHire(vacancyNumber, designation, jobType, workingHour, wagesPerHour, shift);
                        k.add(partTimeStaffObj);
                        JOptionPane.showMessageDialog(frame, "PartTime Staff is added!!");
                    }
    }
    
    
    public void parttimeappoint()
    {
        try
                    {
                        String vacancyNumber = text1.getText();
                        String staffName = text7.getText();
                        String joiningDate = text10.getText();
                        String qualification = text8.getText();
                        String appointedBy  = text9.getText();

                        if(vacancyNumber.equals("") || staffName.equals("") || joiningDate.equals("") ||
                        qualification.equals("") || appointedBy.equals(""))
                        {
                            JOptionPane.showMessageDialog(frame,"Please fill up all the empty fields!!","Error",
                                JOptionPane.ERROR_MESSAGE);
                            //showing error message in dialog box
                        }
                        else
                        {  
                            int vacancyNumberInt = Integer.parseInt(vacancyNumber);
                            boolean found=false;
                            int position=0;
                            if(k.size()==0)
                            {
                                JOptionPane.showMessageDialog(frame,"staff is not added","Error",JOptionPane.ERROR_MESSAGE);
                                // showing error message in dialog box
                            }
                            for (StaffHire a:k)
                            {
                                if (a.getVacancyNumber()==vacancyNumberInt) 
                                {
                                    found=true;
                                    position=k.indexOf(a);
                                    break;  
                                }
                                else
                                {
                                    found=false;

                                }

                            }

                            if(found==true)
                            {   

                                PartTimeStaffHire object = (PartTimeStaffHire)k.get(position);
                                if(object.getJoined()==true)
                                {
                                    JOptionPane.showMessageDialog(frame,"Staff with this vacancy Number is already added!",
                                        "Information",JOptionPane.INFORMATION_MESSAGE);
                                    // showing information message in dialog box
                                }
                                else
                                {

                                    object.hirePartTimeStaff( staffName, joiningDate,  qualification,  appointedBy);
                                    JOptionPane.showMessageDialog(frame,"Part time staff is hired!","Information",
                                        JOptionPane.INFORMATION_MESSAGE);                                    
                                    // showing information message in dialog box
                                }

                            }
                            else if (found==false && k.size()!=0) 
                            {
                                JOptionPane.showMessageDialog(frame,"Staff has not been added in this vacancy number",
                                    "Error",JOptionPane.ERROR_MESSAGE);
                                // showing error message in dialog box
                            }

                        }
                    }
                    catch(NumberFormatException e)
                    {
                        JOptionPane.showMessageDialog(frame,"Input data are not valid","Error",JOptionPane.ERROR_MESSAGE);
                        // showing message in dialog box
                    }
                    catch(ClassCastException e)
                    {
                        JOptionPane.showMessageDialog(frame,"Part time staff is not availabel in this vacany Number",
                            "Error",JOptionPane.ERROR_MESSAGE);
                        // showing error message in dialog box
                    }
    }
    
    
    public void parttimeterminate()
    {
        String vacancyNumber=JOptionPane.showInputDialog(frame,"Vacancy Number: ");;
                    try{
                        if(vacancyNumber.trim().equals(null));
                    }catch(NullPointerException e){
                        return;
                    }
                    int number=0;
                    if(!vacancyNumber.trim().equals("")){
                        try{
                            number= Integer.parseInt(vacancyNumber.trim());
                        }catch(NumberFormatException e){
                            JOptionPane.showMessageDialog(frame,"Enter datas in correct format","Error",0);
                            return;
                            // shoeing error message in dialog box
                        }
                        boolean found=false;
                        for(StaffHire staff : k){
                            if(staff instanceof PartTimeStaffHire){
                                PartTimeStaffHire staffs = (PartTimeStaffHire) staff;
                                if(staff.getVacancyNumber()== number){
                                    found=true;
                                    JOptionPane.showMessageDialog(frame,"Staff  is Terminated.","error",1);
                                    // showing error message in dialog box
                                    break;
                                }
                            }
                        } 
                        if(!found){
                            JOptionPane.showMessageDialog(frame,"Invalid. Enter  a new Vacancy Number","Error",1);
                        }
                    }else{    
                        JOptionPane.showMessageDialog(frame,"Invalid. The  Field Empty","Error",1);
                    }
    }
    
    public void parttimeclear()
    {
        int x = JOptionPane.showConfirmDialog(frame,"Do you want to clear the information", "info", JOptionPane.YES_NO_OPTION);
                    if (x == JOptionPane.YES_OPTION){
                        text1.setText(null);
                        text2.setText(null);
                        text3.setText(null);
                        text4.setText(null); 
                        text5.setText(null);
                        text6.setText(null);
                        text11.setText(null);
                        text7.setText(null);
                        text8.setText(null);
                        text9.setText(null);
                        text10.setText(null);
                        JOptionPane.showMessageDialog(frame, "Data Cleared");
                    }

                    if (x == JOptionPane.NO_OPTION){
                    }  
    }

    
    public static void main(String[] args){
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            EventQueue.invokeLater(new Runnable()
            {
                @Override
                public void run() {
                    // TODO Auto-generated method stub
                    new INGNepal().frame.setVisible(true);;
                }
            });
            
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

