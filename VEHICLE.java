class VEHICLE{
   private String regNo;
   private String make;
   private int yearofManufacture; 
   private double value;
   
   public VEHICLE(String regNo, String make, int yearofManufacture, double value) {
      this.regNo = regNo;
      this.make = make;
      this.yearofManufacture = yearofManufacture; 
      this.value = value;
   }

    public String getregNo(){
    return this.regNo;
    }
           
    public String getmake(){
    return this.make; 
    }
           
    public int getyearofManufacture(){
    return this.yearofManufacture;
    }
           
    public double getvalue(){
    return this.value;
    }
    public void setvalue(){
    this.value = value;
    }

   public int calculateAge(int currentYear) {
        return currentYear - yearofManufacture;
   }

   @Override
    public String toString() {
      return "Reg No: " + regNo + ", Make: " + make + ", Year of Manufacture: " + yearofManufacture + ", Value: Php" + value;
   }
}