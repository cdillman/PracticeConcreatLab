/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceconcreatemployee;

/**
 *
 * @author Corbin
 */
public class HourlyEmployee extends Employee{
    double wadge;
    double hoursWorked;
    double overtime;
    double pay;
    

    public double getWadge() {
        return wadge;
    }

    public void setWadge(double wadge) {
        this.wadge = wadge;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
      if (hoursWorked > 40){
         this.hoursWorked = 40;
      }
      else{
        this.hoursWorked = hoursWorked;
      }
    }
    
    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }
    
     public double getPay() {
        return pay;
    }  

    public void setPay(double pay) {
        this.pay = pay;
    }
    
 
    
    
}
