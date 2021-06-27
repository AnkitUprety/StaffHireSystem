import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class INGNepal implements ActionListener
{
    JFrame sfrm, ffrm, pfrm;
    JLabel lblSTitle, lblSVacancyNum, lblSDesignation, lblSJobType, lblFTitle, lblPTitle, lblFVacancyNum, lblFStaffName, lblFQualification,
           lblSSalary, lblSWorkingHour, lblSWagesPerHour, lblSShift, lblFjoiningDate, lblFappointedBy, lblPVacancyNum, lblPStaffName, lblPQualification,
           lblPjoiningDate, lblPappointedBy;
    JTextField txtSVacancyNum, txtSDesignation, txtFVacancyNum, txtFStaffName, txtFQualification,txtSSalary, txtSWorkingHour, txtFjoiningDate, 
            txtSWagesPerHour, txtSShift, txtFappointedBy, txtPVacancyNum, txtPStaffName, txtPQualification, txtPjoiningDate, txtPappointedBy;
    JButton btnSNew, btnAddVacancyF, btnAddVacancyP, btnFAppoint, btnPAppoint, btnFClear, btnPClear, btnFDisplay, btnPDisplay, btnFHome, btnPTerminate,
            btnPHome;
    JComboBox cmbSJobType;
    ArrayList<StaffHire> list=new ArrayList<StaffHire>();
    public INGNepal(){
        ffrm=new JFrame("Full Time Staff Hire");
        ffrm.setSize(640,500);
        ffrm.setLayout(null);
        ffrm.setVisible(false);
        
        lblFTitle=new JLabel("Full Time Staff Hire");
        lblFTitle.setBounds(350,10,500,30);
        ffrm.add(lblFTitle);
        
        lblFVacancyNum=new JLabel("Vacancy Number:");
        lblFVacancyNum.setBounds(20,60,100,30);
        ffrm.add(lblFVacancyNum);
        
        txtFVacancyNum=new JTextField();
        txtFVacancyNum.setBounds(130,60,130,30);
        ffrm.add(txtFVacancyNum);
        
        lblFStaffName=new JLabel("Staff Name:");
        lblFStaffName.setBounds(50,100,100,30);
        ffrm.add(lblFStaffName);
        
        txtFStaffName=new JTextField();
        txtFStaffName.setBounds(130,100,200,30);
        ffrm.add(txtFStaffName);
        
        lblFQualification=new JLabel("Qualification:");
        lblFQualification.setBounds(40,140,100,30);
        ffrm.add(lblFQualification);
        
        txtFQualification=new JTextField();
        txtFQualification.setBounds(130,140,130,30);
        ffrm.add(txtFQualification);
        
        lblFjoiningDate=new JLabel("Joining Date:");
        lblFjoiningDate.setBounds(40,180,100,30);
        ffrm.add(lblFjoiningDate);
        
        txtFjoiningDate=new JTextField();
        txtFjoiningDate.setBounds(130,180,130,30);
        ffrm.add(txtFjoiningDate);
        
        lblFappointedBy=new JLabel("Appointed By:");
        lblFappointedBy.setBounds(40,220,100,30);
        ffrm.add(lblFappointedBy); 
        
        txtFappointedBy=new JTextField();
        txtFappointedBy.setBounds(130,220,130,30);
        ffrm.add(txtFappointedBy);
        
        btnFAppoint=new JButton("Appoint");
        btnFAppoint.setBounds(450,60,130,40);
        ffrm.add(btnFAppoint);
        btnFAppoint.addActionListener(this);
        
        btnFClear=new JButton("Clear");
        btnFClear.setBounds(450,120,130,40);
        ffrm.add(btnFClear);
        btnFClear.addActionListener(this);
        
        btnFDisplay=new JButton("Display");
        btnFDisplay.setBounds(450,180,130,40);
        ffrm.add(btnFDisplay);
        btnFDisplay.addActionListener(this);
        
        btnFHome=new JButton("Home");
        btnFHome.setBounds(450,240,130,40);
        ffrm.add(btnFHome);
        btnFHome.addActionListener(this);
        
        pfrm=new JFrame("Part Time Staff Hire");
        pfrm.setSize(640,500);
        pfrm.setLayout(null);
        pfrm.setVisible(false);
        
        lblPTitle=new JLabel("Part Time Staff Hire");
        lblPTitle.setBounds(350,10,500,30);
        pfrm.add(lblPTitle);
        
        lblPVacancyNum=new JLabel("Vacancy Number:");
        lblPVacancyNum.setBounds(20,60,100,30);
        pfrm.add(lblPVacancyNum);
        
        txtPVacancyNum=new JTextField();
        txtPVacancyNum.setBounds(130,60,130,30);
        pfrm.add(txtPVacancyNum);
        
        lblPStaffName=new JLabel("Staff Name:");
        lblPStaffName.setBounds(50,100,100,30);
        pfrm.add(lblPStaffName);
        
        txtPStaffName=new JTextField();
        txtPStaffName.setBounds(130,100,200,30);
        pfrm.add(txtPStaffName);
        
        lblPQualification=new JLabel("Qualification:");
        lblPQualification.setBounds(40,140,100,30);
        pfrm.add(lblPQualification);
        
        txtPQualification=new JTextField();
        txtPQualification.setBounds(130,140,130,30);
        pfrm.add(txtPQualification);
        
        lblPjoiningDate=new JLabel("Joining Date:");
        lblPjoiningDate.setBounds(40,180,100,30);
        pfrm.add(lblPjoiningDate);
        
        txtPjoiningDate=new JTextField();
        txtPjoiningDate.setBounds(130,180,130,30);
        pfrm.add(txtPjoiningDate);
        
        lblPappointedBy=new JLabel("Appointed By:");
        lblPappointedBy.setBounds(40,220,100,30);
        pfrm.add(lblPappointedBy); 
        
        txtPappointedBy=new JTextField();
        txtPappointedBy.setBounds(130,220,130,30);
        pfrm.add(txtPappointedBy);
        
        btnPAppoint=new JButton("Appoint");
        btnPAppoint.setBounds(450,60,130,40);
        pfrm.add(btnPAppoint);
        btnPAppoint.addActionListener(this);
               
        btnPClear=new JButton("Clear");
        btnPClear.setBounds(450,120,130,40);
        pfrm.add(btnPClear);
        btnPClear.addActionListener(this);
        
        btnPDisplay=new JButton("Display");
        btnPDisplay.setBounds(450,180,130,40);
        pfrm.add(btnPDisplay);
        btnPDisplay.addActionListener(this);
        
        btnPTerminate=new JButton("Terminate");
        btnPTerminate.setBounds(450,220,130,40);
        pfrm.add(btnPTerminate);
        
        btnPHome=new JButton("Home");
        btnPHome.setBounds(450,260,130,40);
        pfrm.add(btnPHome);
        btnPHome.addActionListener(this);
   }
   public static void main(String []args){
       new INGNepal().StaffHireForm();
   }
   public void StaffHireForm(){
       sfrm=new JFrame("Staff Hire");
       sfrm.setSize(640,500);
       sfrm.setLayout(null);
       sfrm.setVisible(true);
       sfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       lblSTitle=new JLabel("Staff Hire");
       lblSTitle.setBounds(280,10,400,30);
       sfrm.add(lblSTitle);
       
       lblSVacancyNum=new JLabel("Vacancy Number:");
       lblSVacancyNum.setBounds(40,80,100,30);
       sfrm.add(lblSVacancyNum);
       
       txtSVacancyNum=new JTextField();
       txtSVacancyNum.setBounds(150,80,130,30);
       sfrm.add(txtSVacancyNum);
       
       lblSDesignation=new JLabel("Designation:");
       lblSDesignation.setBounds(70,120,80,30);
       sfrm.add(lblSDesignation);
       
       txtSDesignation=new JTextField();
       txtSDesignation.setBounds(150,120,130,30);
       sfrm.add(txtSDesignation);
       
       lblSWorkingHour=new JLabel("Working hours per day:");
       lblSWorkingHour.setBounds(10,160,135,30);
       sfrm.add(lblSWorkingHour);
       
       txtSWorkingHour=new JTextField();
       txtSWorkingHour.setBounds(150,160,130,30);
       sfrm.add(txtSWorkingHour);
      
       lblSJobType=new JLabel("Job Type:");
       lblSJobType.setBounds(420,80,100,30);
       sfrm.add(lblSJobType);
       
       String jobType[]={"Full Time","Part Time"};
       cmbSJobType=new JComboBox(jobType);
       cmbSJobType.setBounds(490,80,100,30);
       sfrm.add(cmbSJobType);
       cmbSJobType.addActionListener(this);
       
       lblSSalary=new JLabel("Salary:");
       lblSSalary.setBounds(100,200,80,30);
       sfrm.add(lblSSalary);
       
       txtSSalary=new JTextField();
       txtSSalary.setBounds(150,200,130,30);
       sfrm.add(txtSSalary);
       
       lblSWagesPerHour=new JLabel("Wages Per Hour:");
       lblSWagesPerHour.setBounds(45,200,120,30);
       sfrm.add(lblSWagesPerHour);
       
       
       txtSWagesPerHour=new JTextField();
       txtSWagesPerHour.setBounds(150,200,130,30);
       sfrm.add(txtSWagesPerHour);
       
       lblSShift=new JLabel("Shift:");
       lblSShift.setBounds(110,240,80,30);
       sfrm.add(lblSShift);
       
       txtSShift=new JTextField();
       txtSShift.setBounds(150,240,130,30);
       sfrm.add(txtSShift);
       
       btnSNew=new JButton("New");
       btnSNew.setBounds(450,150,80,30);
       sfrm.add(btnSNew);
       btnSNew.addActionListener(this);
       
       btnAddVacancyF=new JButton("Add vacancy for Full Time Staff");
       btnAddVacancyF.setBounds(375,195,215,30);
       sfrm.add(btnAddVacancyF);
       btnAddVacancyF.addActionListener(this);
       
       btnAddVacancyP=new JButton("Add vacancy for Part Time Staff");
       btnAddVacancyP.setBounds(375,230,215,30);
       sfrm.add(btnAddVacancyP);
       btnAddVacancyP.addActionListener(this);
    }
   public void actionPerformed(ActionEvent clicked){
       if(clicked.getSource()==btnSNew){
         txtSVacancyNum.setText("");
         txtSDesignation.setText("");
         txtSWorkingHour.setText("");
         txtSSalary.setText("");
         txtSWagesPerHour.setText("");
         txtSShift.setText("");
        }
       if(clicked.getSource()==btnAddVacancyF){
           int vno=0, salary=0, workingHour=0;
           String jobType="", desgination="";
           try{
                vno=Integer.parseInt(txtSVacancyNum.getText()); 
                desgination=txtSDesignation.getText();
                salary=Integer.parseInt(txtSSalary.getText());
                workingHour=Integer.parseInt(txtSWorkingHour.getText());
                jobType=(cmbSJobType.getSelectedItem()).toString();
            
                 boolean isDuplicateVno=false;
               for(StaffHire var:list){
                    if(var.getvacancyNum()==vno){
                        isDuplicateVno=true;
                        break;
                    }
               }
            if(isDuplicateVno==false){
                FullTimeStaffHire obj=new FullTimeStaffHire(vno, desgination,jobType,salary,workingHour);
                list.add(obj);
                JOptionPane.showMessageDialog(sfrm,"vacancy added "+list.size());
                ffrm.setVisible(true);
                sfrm.setVisible(false);
          
            }else{
                 JOptionPane.showMessageDialog(sfrm,"Input Vacancy no is already in the list. "+list.size()); 
                 ffrm.setVisible(true);
                 sfrm.setVisible(false);
            }
        }catch(Exception exp){
             JOptionPane.showMessageDialog(sfrm,"Input is invalid. "); 
            }
            
       } 
       if(clicked.getSource()==btnFAppoint){
          try{
            int vno=Integer.parseInt(txtFVacancyNum.getText()); 
            String staffName=txtFStaffName.getText();
            String joinDate=txtFjoiningDate.getText();
            String qualification=txtFQualification.getText();
            String appointedBy=txtFappointedBy.getText();
            
            boolean vnoFound=false;
            for(StaffHire obj:list){
                if(obj.getvacancyNum()==vno){
                    vnoFound=true;
                    if(obj instanceof FullTimeStaffHire){
                        FullTimeStaffHire h=(FullTimeStaffHire)obj;
                        if(h.getjoined()==true){
                            JOptionPane.showMessageDialog(ffrm,"Staff already hired!");
                        }else{
                           h.hireFullTimeStaff(staffName,joinDate,qualification,appointedBy);
                          JOptionPane.showMessageDialog(ffrm,"Staff has been hired!");
                          break;
                        }
                    }else{
                        JOptionPane.showMessageDialog(ffrm,"not for fulltime staff Hire");
                        break;
                    }
                }             
            }
            if(!vnoFound){
                    JOptionPane.showMessageDialog(ffrm,"invalid vacancy");
                    
            }   
          }catch(Exception exp){
              JOptionPane.showMessageDialog(ffrm,"Please enter the text field!");
            }
        }
       if(clicked.getSource()==btnFClear){
         txtFVacancyNum.setText("");
         txtFStaffName.setText("");
         txtFQualification.setText("");
         txtFjoiningDate.setText("");
         txtFappointedBy.setText("");
        
        }
        if(clicked.getSource()==btnFDisplay){
             for(StaffHire obj:list){
               if(obj instanceof FullTimeStaffHire){          
                
                    System.out.println("--------------------------");
                    System.out.println("Full Time Staff Hire Details:");
                    System.out.println("--------------------------");               
                    ((FullTimeStaffHire)obj).display();
                }
           }
        }
        if(clicked.getSource()==btnFHome){
            sfrm.setVisible(true);
            ffrm.setVisible(false);
        }
       if(clicked.getSource()==btnAddVacancyP){
              int vno=0, workingHour=0, wagesPerHour=0;
           String jobType="", desgination="", shift="";
           try{
                vno=Integer.parseInt(txtSVacancyNum.getText()); 
                desgination=txtSDesignation.getText();
                wagesPerHour=Integer.parseInt(txtSWagesPerHour.getText());
                workingHour=Integer.parseInt(txtSWorkingHour.getText());
                jobType=(cmbSJobType.getSelectedItem()).toString();
                shift=txtSShift.getText();
            
                 boolean isDuplicateVno=false;
               for(StaffHire var:list){
                    if(var.getvacancyNum()==vno){
                        isDuplicateVno=true;
                        break;
                    }
               }
            if(isDuplicateVno==false){
                PartTimeStaffHire obj=new PartTimeStaffHire(vno,desgination,jobType,wagesPerHour,workingHour,shift);
                list.add(obj);
                JOptionPane.showMessageDialog(sfrm,"vacancy added "+list.size());
                pfrm.setVisible(true);
                sfrm.setVisible(false);
            }else{
                 JOptionPane.showMessageDialog(sfrm,"Input Vacancy no is already in the list. "+list.size()); 
                 pfrm.setVisible(true);
                 sfrm.setVisible(false);
            }
        }catch(Exception exp){
             JOptionPane.showMessageDialog(sfrm,"Input is invalid. "); 
            } 
       }
       if(clicked.getSource()==btnPAppoint){
          try{
            int vno=Integer.parseInt(txtPVacancyNum.getText()); 
            String staffName=txtPStaffName.getText();
            String joinDate=txtPjoiningDate.getText();
            String qualification=txtPQualification.getText();
            String appointedBy=txtPappointedBy.getText();
            
            boolean vnoFound=false;
            for(StaffHire obj:list){
                if(obj.getvacancyNum()==vno){
                    vnoFound=true;
                    if(obj instanceof PartTimeStaffHire){
                        PartTimeStaffHire h=(PartTimeStaffHire)obj;
                        if(h.getjoined()==true){
                            JOptionPane.showMessageDialog(ffrm,"Staff already hired!");
                        }else{
                           h.hirePartTimeStaff(staffName,joinDate,qualification,appointedBy);
                          JOptionPane.showMessageDialog(pfrm,"Staff has been hired!");
                          break;
                        }
                    }else{
                        JOptionPane.showMessageDialog(pfrm,"not for fulltime staff Hire");
                        break;
                    }
                }             
            }
            if(!vnoFound){
                    JOptionPane.showMessageDialog(pfrm,"invalid vacancy");
                    
            }   
          }catch(Exception exp){
              JOptionPane.showMessageDialog(pfrm,"Please enter the text field!");
            }
        }
        if(clicked.getSource()==btnPClear){
         txtPVacancyNum.setText("");
         txtPStaffName.setText("");
         txtPQualification.setText("");
         txtPjoiningDate.setText("");
         txtPappointedBy.setText("");
        
        }
        if(clicked.getSource()==btnPDisplay){
             for(StaffHire obj:list){
            if(obj instanceof PartTimeStaffHire){
               
                
                    System.out.println("--------------------------");
                    System.out.println("Part Time Staff Hire Details:");
                    System.out.println("--------------------------");
               
                    ((PartTimeStaffHire)obj).display();
                }
           }
        }
        if(clicked.getSource()==btnPHome){
            sfrm.setVisible(true);
            pfrm.setVisible(false);
        }
       if(clicked.getSource()==cmbSJobType){
           String jobType=(cmbSJobType.getSelectedItem()).toString();
            if(jobType.equals("Part Time")){             
               lblSSalary.setVisible(false);
               txtSSalary.setVisible(false);
               lblSWagesPerHour.setVisible(true);
               txtSWagesPerHour.setVisible(true);
               lblSShift.setVisible(true);
               txtSShift.setVisible(true);
            }else{
                lblSSalary.setVisible(true);
               txtSSalary.setVisible(true);
               lblSWagesPerHour.setVisible(false);
               txtSWagesPerHour.setVisible(false);
               lblSShift.setVisible(false);
               txtSShift.setVisible(false);
            }
        }
  }
}