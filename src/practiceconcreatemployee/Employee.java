/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceconcreatemployee;

import javax.swing.JOptionPane;

/**
 *
 * @author Corbin
 */
public class Employee {
    
    String lastName;
    String firstName;
    int age;
    

    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

        public static void main(String[] args) {
        // TODO code application logic here
            
            
            HourlyEmployee hour = new HourlyEmployee();
            SaleryEmployee salery = new SaleryEmployee(); 
            SaleryPlusBonusEmployee employ = new SaleryPlusBonusEmployee();
            
            String wadge = JOptionPane.showInputDialog("Whats the employee wadge?");
            double wa = Double.parseDouble(wadge);
            String hours = JOptionPane.showInputDialog("how many hours were worked?");
            double ho = Double.parseDouble(hours);
            
            hour.setWadge(wa);
            hour.setHoursWorked(ho);
            hour.setOvertime((ho - 40) * 1.5);
            hour.setPay(hour.getHoursWorked() * hour.getWadge() + hour.getOvertime() * hour.getWadge());
            System.out.println("The hourly employees pay is $" + hour.getPay());
            
            salery.setAnnualPay(65000);
            employ.setBonus(15000);
            System.out.println("The Salery employees anual pay is $" + salery.getAnnualPay());
            System.out.println("and a bonus of $" + employ.getBonus());
            
            
    }
    
}
