import java.util.*;
public class VehicleManagement {
   public static void main(String[] args) {
      ArrayList<VEHICLE> VehicleLists = new ArrayList<>();
      Scanner key = new Scanner(System.in);
   
      int choice;
      do {
         System.out.println("Menu:");
         System.out.println("1. Add a vehicle");
         System.out.println("2. Display a list of vehicle details");
         System.out.println("3. Delete a vehicle");
         System.out.println("4. Sort vehicle list by age");
         System.out.println("5. Quit");
         System.out.print("Enter your choice: ");
         choice = key.nextInt();
         key.nextLine(); 
      
         switch (choice) {
            case 1:
               System.out.print("Enter registration number: ");
               String regNo = key.nextLine();  
               System.out.print("Enter make: ");
               String make = key.nextLine();
               System.out.print("Enter year of manufacture: "); 
               int yearofManufacture = key.nextInt();
               System.out.print("Enter value: "); 
               double value = key.nextDouble();
               VEHICLE vehicle = new VEHICLE(regNo, make, yearofManufacture, value);
               System.out.println("Vehicle added successfully! \n");
               VehicleLists.add(new VEHICLE(regNo, make, yearofManufacture, value));
            
               break;
            case 2:
               for(int i = 0; i < VehicleLists.size(); i++){
                  System.out.println(VehicleLists.get(i));
               }       
               break;
            case 3:
               System.out.print("Enter the index of the vehicle to delete: ");
               int index = key.nextInt();
               VehicleLists.remove(index);
               System.out.println("Vehicle deleted successfully!\n\n");
               break;
            case 4:
               while(true) {
                  System.out.println("\n\nSort Menu:");
                  System.out.println("1. Sort by age (ascending)");
                  System.out.println("2. Sort by age (descending)");
                  System.out.println("3. Back to main menu");
                  System.out.print("Enter your choice: ");
                  int sort = key.nextInt();
                  if(sort == 1){
                     System.out.println("List of vehicle details sorted by age (ascending):");
                     Collections.sort(VehicleLists, Comparator.comparingInt(VEHICLE::getyearofManufacture));
                     for(int i = 0; i < VehicleLists.size(); i++){
                        System.out.println(VehicleLists.get(i));
                     }
                  }
                  else if(sort == 2){
                     System.out.println("List of vehicle details sorted by age (descending):");
                     Collections.sort(VehicleLists, Comparator.comparingInt(VEHICLE::getyearofManufacture).reversed());
                     for(int i = 0; i < VehicleLists.size(); i++){
                        System.out.println(VehicleLists.get(i));
                     }
                  }
                  else if(sort == 3){
                     System.out.println("Returning to main menu...\n\n");
                     break;
                  }
               }
               break;
            case 5:
               System.out.println("Exiting program...");
               break;
            default:
               System.out.println("Invalid choice. Please try again.");
         }
      } while (choice != 5);
   
      key.close();
   }

}