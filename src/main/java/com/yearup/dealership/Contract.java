package com.yearup.dealership;

public class Contract {
    private String dateOfContract;
    private String customerName;
    private String email;
    private boolean vehicleSold;


    public Contract(String dateOfContract, String customerName, String email, boolean vehicleSold) {
        this.dateOfContract = dateOfContract;
        this.customerName = customerName;
        this.email = email;
        this.vehicleSold = false;
    }

    public String getDateOfContract() {
        return dateOfContract;
    }

    public void setDateOfContract(String dateOfContract) {
        this.dateOfContract = dateOfContract;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isVehicleSold() {
        return vehicleSold;
    }

    public void setVehicleSold(boolean vehicleSold) {
        this.vehicleSold = vehicleSold;
    }

    public double getTotalPrice() {
        return getTotalPrice();
    }

    public double getMonthlyPayment(){
        return getMonthlyPayment();
    }
}
