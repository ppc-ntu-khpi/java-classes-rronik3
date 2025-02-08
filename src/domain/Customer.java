package domain;

public class Customer {
    private int ID;           
    private boolean isNew;  
    private double total; 

    public Customer() {
        this.ID = 1;        
        this.isNew = true;
        this.total = 1000.0; 
    }

    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + ID);
        System.out.println("New customer: " + isNew);
        System.out.println("Total purchases are: " + total);
    }
    public boolean setID(int ID) {
        if (ID > 0) {
            this.ID = ID;
            return true;
        }
            return false;
        }

        public void setStatus(boolean isNew) {
            this.isNew = isNew;
        }

        public boolean setTotal(double total) {
            if (total >= 0) {
                this.total = total;
                return true;
            }
               return false;
            }

 }
    
