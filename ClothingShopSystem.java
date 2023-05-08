import java.util.Scanner;
public class ClothingShopSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int price[] = {150,200,250,300,350};
        boolean transaction = true;
        
        System.out.print("Press enter to start : ");
        String pressEnter = input.nextLine();
        
        System.out.print("1.) Buy clothes\n");
        System.out.print("2.) About\n");
        System.out.print("3.) Exit\n");
        
        System.out.print("Enter your choice here : ");
        int choice = input.nextInt();
        
        switch(choice){
            case 1:
                while(transaction){
                    
                System.out.print("\tAVAILABLE CLOTHES\n\n");
                System.out.print("CLOTHES\t\t\tPRICE\n\n");
                System.out.print("1.) Kaayo\t\tP 150\n\n");
                System.out.print("2.) Rags2Riches\t\tP 200\n\n");
                System.out.print("3.) Anthill    \t\tP 250\n\n");
                System.out.print("4.) Tela       \t\tP 300\n\n");
                System.out.print("5.) Sunki      \t\tP 350\n\n");
                
                System.out.print("Enter your choice here : ");
                int userChoice = input.nextInt();
                
                System.out.print("Enter quantity here : ");
                int quantity = input.nextInt();
                
                total += price[userChoice - 1] *  quantity;
                
                System.out.print("Do you want to buy more clothes? (y/n): ");
                input.nextLine();
                String buyMore = input.nextLine();
                
                if(buyMore.equalsIgnoreCase("n")){
                    transaction = false;
                    System.out.print("The total price is: P " + total + "\n");
                    
                    System.out.print("Enter your payment : P ");
                    int payment = input.nextInt();
                    
                    int change = payment - total;
                    
                    System.out.print("Change : P " + change + "\n");
                    System.out.print("\n\nTHANK YOU FOR BUYING OUR CLOTHES ^_^\n");
                    
                    
                }
                
                
                }
                break;
                
            case 2:
                System.out.print("Welcome to our clothing shop system! We are dedicated to providing you with the latest\nfashion trends and high-quality clothing at affordable prices. Our team of fashion experts\nhandpicks each item in our collection to ensure that you receive only the best.\n");
                break;
                
            case 3:
                System.out.print("\n\n---EXITING---\n");
                break;
                
            default:
                System.out.print("\n\nINVALID CHOICE!\n");
            
        }
        
    }
}
