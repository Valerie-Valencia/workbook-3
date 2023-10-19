package org.example;

public class Employee {
    //attributes
    private int employeeId;
    private String name;
    private double hoursWorked;
    private double payRate;

    //methods
    public void constructor(int employeeId, String name, int hoursWorked, double payRate){
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    //setters
    public String setName(String name){
        return this.name = name;
    }

    public double setHoursWorked(double hoursWorked){
        return this.hoursWorked = hoursWorked ;
    }
    public double setPayRate(double payRate){
        return this.payRate = payRate;
    }

    //getters
    public int getId(){

        return this.employeeId = employeeId;
    }

    public String getName(){

        return this.name = name;
    }

    public double getHoursWorked(){

        return this.hoursWorked = hoursWorked;
    }

    public double getPayRate(){

        return this.payRate = payRate;
    }

    public double getGrossPay(){

        return hoursWorked / payRate;
    }

    @Override
    public String toString(){
        return "\n Employee ID: " + this.employeeId +
                        "\n Employee Name: " + this.name +
                        "\n Hours Worked: " + hoursWorked +
                        "\n Pay Rate: " + payRate;
    }
}
