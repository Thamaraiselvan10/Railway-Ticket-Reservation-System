import java.util.Scanner;

// handling passengers
class passenger{
    int id;
    String name;
    int age;
    String berth;
    passenger(int id, String name, int age, String berth){
        this.id=id;
        this.name=name;
        this.age=age;
        this.berth=berth;
    }
}
// ticket booking system
class TicketBookingSystem{
    public static void cancelingTickets(){

    }
    static int seatc=1;
    static int racc=2;
    static int waitingc=1;
    static passenger[] seats = new passenger[seatc];
   static passenger[] rac= new passenger[racc];
    static passenger[] waitingList= new passenger[waitingc];
    static int seatCount=0;
    static int racCount=0;
    static int waitingCount=0;

    public static void bookTickets(int id, String name, int age, String berth) {
    if (seatCount<seatc) {
        seats[seatCount]= new passenger(id, name, age, berth);
        seatCount++;
    } else if (racCount<racc) {
        rac[racCount]= new passenger(id, name, age, berth);
        racCount++;
    } else if (waitingCount<waitingc) {
        waitingList[waitingCount]= new passenger(id, name, age, berth);
        waitingCount++;
    } else {
        System.out.println("No Tickets Available");    
    }
   
    
} 
public static void cancelTickets(int id) {
    for(int i=0;i<seatCount;i++){
        if(seats[i].id==id){
            for(int j=i;j<seatCount-1;j++){
                seats[j]=seats[j+1];
            }
            seatCount--;
            System.out.println("Ticket Cancelled");
            cascadingTickets();
            return;
        }
        }
        for(int i=0;i<racCount;i++){
        if(rac[i].id==id){          
            for(int j=i;j<racCount-1;j++){
                rac[j]=rac[j+1];
            }
            racCount--;
            System.out.println("Ticket Cancelled");
            cascadingTickets();
            return;
        }
        }
        for(int i=0;i<waitingCount;i++){
        if(waitingList[i].id==id){          
            for(int j=i;j<waitingCount-1;j++){
                waitingList[j]=waitingList[j+1];
            }
            waitingCount--;
            System.out.println("Ticket Cancelled");
            cascadingTickets();
            
            return;
        }   }
    

}   
public static void cascadingTickets(){
   if(seatCount<seatc && racCount>0){


    for(int i=0;i<racCount;i++){
        if(rac[i].berth.equals("l")){
            seats[seatCount]=rac[i];
            seatCount++;
            for(int j=i;j<racCount-1;j++){
                rac[j]=rac[j+1];
            }
            racCount--;
            break;
        }
        }
        if(seatCount<seatc && racCount>0){
            for(int i=0;i<racCount;i++){
            if(rac[i].berth.equals("m")){
                seats[seatCount]=rac[i];
                seatCount++;
                for(int j=i;j<racCount-1;j++){
                    rac[j]=rac[j+1];
                }
                racCount--;
                break;
            }
            }
        }
        if(seatCount<seatc && racCount>0){
            for(int i=0;i<racCount;i++){
            if(rac[i].berth.equals("u")){
                seats[seatCount]=rac[i];
                seatCount++;
                for(int j=i;j<racCount-1;j++){
                    rac[j]=rac[j+1];
                }
                racCount--;
                break;
            }
            }
            }
        if(seatCount<seatc && racCount>0){
            for(int i=0;i<racCount;i++){
            if(rac[i].berth.equals("sl")){
                seats[seatCount]=rac[i];
                seatCount++;
                for(int j=i;j<racCount-1;j++){
                    rac[j]=rac[j+1];
                }
                racCount--;
                break;
            }
            }
        
        
        
        }
        if(seatCount<seatc && racCount>0){
            for(int i=0;i<racCount;i++){
            if(rac[i].berth.equals("su")){
                seats[seatCount]=rac[i];
                seatCount++;
                for(int j=i;j<racCount-1;j++){
                    rac[j]=rac[j+1];
                }
                racCount--;
                break;
            }
            }
        

        }


    }

   else if(racCount<racc && waitingCount>0){

            for(int i=0;i<waitingCount;i++){
                if(waitingList[i].berth.equals("l")){
                    rac[racCount]=waitingList[i];
                    racCount++;
                    for(int j=i;j<waitingCount-1;j++){
                        waitingList[j]=waitingList[j+1];
                    }
                    waitingCount--;
                    break;
                }
            }
            if(racCount<racc && waitingCount>0){
                for(int i=0;i<waitingCount;i++){
                    if(waitingList[i].berth.equals("m")){
                        rac[racCount]=waitingList[i];
                        racCount++;
                        for(int j=i;j<waitingCount-1;j++){
                            waitingList[j]=waitingList[j+1];
                        }
                        waitingCount--;
                        break;
                    }
                }
            }
            if(racCount<racc && waitingCount>0){
                for(int i=0;i<waitingCount;i++){
                    if(waitingList[i].berth.equals("u")){
                        rac[racCount]=waitingList[i];
                        racCount++;
                        for(int j=i;j<waitingCount-1;j++){
                            waitingList[j]=waitingList[j+1];
                        }
                        waitingCount--;
                        break;
                    }
                }
            }
            if(racCount<racc && waitingCount>0){
                for(int i=0;i<waitingCount;i++){
                    if(waitingList[i].berth.equals("sl")){
                        rac[racCount]=waitingList[i];
                        racCount++;
                        for(int j=i;j<waitingCount-1;j++){
                            waitingList[j]=waitingList[j+1];
                        }
                        waitingCount--;
                        break;
                    }
                }
            }
            if(racCount<racc && waitingCount>0){
                for(int i=0;i<waitingCount;i++){
                    if(waitingList[i].berth.equals("su")){
                        rac[racCount]=waitingList[i];
                        racCount++;
                        for(int j=i;j<waitingCount-1;j++){
                            waitingList[j]=waitingList[j+1];
                        }
                        waitingCount--;
                        break;
                    }
                }
            }
}}


public static void availableTickets() {
    System.out.println("Available Tickets");
    System.out.println("Seats: " + (seatc - seatCount));
    System.out.println("RAC: " + (racc - racCount));
    System.out.println("Waiting List: " + (waitingc - waitingCount));
    System.out.println("/n");
}
public static void bookedTickets() {
    if(seatCount!=0) {
             System.out.println("Booked Tickets");
             for(int i=0;i<seatCount;i++){
                System.out.println("Seat Ticket - ID: " + seats[i].id + ", Name: " + seats[i].name + ", Age: " + seats[i].age + ", Berth: " + seats[i].berth);
                System.out.println("\n");
             }}
    if(racCount!=0) {
             System.out.println("RAC Tickets:");
             for(int i=0;i<racCount;i++){
                System.out.println("RAC Ticket - ID: " + rac[i].id + ", Name: " + rac[i].name + ", Age: " + rac[i].age + ", Berth: " + rac[i].berth);
                System.out.println("\n");
             }}
    if(waitingCount!=0) {
                System.out.println("Waiting List Tickets:");
                for(int i=0;i<waitingCount;i++){
                System.out.println("Waiting List Ticket - ID: " + waitingList[i].id + ", Name: " + waitingList[i].name + ", Age: " + waitingList[i].age + ", Berth: " + waitingList[i].berth);
                System.out.println("\n");
             }}
             if(seatCount==0 && racCount==0 && waitingCount==0){
                System.out.println("No Booked Tickets");
             }


}}
class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      while (true) {
        System.out.println("1. Book Tickets \n2.Cancel Tickets \n3.Available Tickets \n4.Booked Tickets \n5. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        System.out.println("\n");
        switch (choice) {
    
        case 1:
            System.out.println("Enter the details");
            System.out.println("Enter the id");
            int id=sc.nextInt();
            System.out.println("Enter the name");
            String name=sc.next();
            System.out.println("Enter the age");
            int age=sc.nextInt();
            System.out.println("Enter the berth");
            String berth=sc.next();
            if(berth.equals("l")||berth.equals("m")||berth.equals("u")||berth.equals("sl")||berth.equals("su")){
            TicketBookingSystem.bookTickets(id, name, age, berth);
            break;
            } else {
                System.out.println("Invalid Berth Type");
                System.out.println("Use l for lower, m for middle, u for upper, sl for side lower, su for side upper");
                System.out.println("Try Again");
                System.out.println("\n");
                break;
            }
        case 2:
            System.out.println("Enter the id to cancel the ticket");
            id=sc.nextInt();
            TicketBookingSystem.cancelTickets(id);
            break;
        case 3:
            TicketBookingSystem.availableTickets();
            break;
        case 4:
            TicketBookingSystem.bookedTickets();
            break;
        case 5:
            System.out.println("Exit");
            return;
      
        default:
            System.out.println("Invalid Choice");
            break;
      }
    }
}}
