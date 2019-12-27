import java.util.Scanner;

public class bank {
        static void calcultingAccountBalance(Client client,int clientChoice){
            Scanner scanner = new Scanner(System.in);
            int clientAmount = scanner.nextInt();
            if (clientChoice == 2) {
                client.setBalance(clientAmount + client.getBalance());
            } else {
                if (client.getBalance() > clientAmount) {
                    client.setBalance(client.getBalance() - clientAmount);
                } else {
                    System.out.println("Your amount isn't enough, please recharge your account");
                }
            }
        }
    public static void main(String[] args) {
        Client client = new Client(20, "Abderrahmen", "Belalem", "01/03/1999", "Oran");
        Scanner scan = new Scanner(System.in);
        int clientChoice = 0;
        System.out.println("Welcome to "+ client.getFirstName() + "'s Bank");
        do {
            System.out.println("Enter your choice : ");
            System.out.println("(1) widthraw");
            System.out.println("(2) deposite");
            System.out.println("(3) display account balance");
            System.out.println("(4) exit");
            System.out.println("Enter a number : ");
            clientChoice = scan.nextInt();
            switch (clientChoice) {
                case 1:
                    System.out.println("How much do you want to widthraw?");
                    calcultingAccountBalance(client, 1);
                    break;
                case 2:
                    System.out.println("How much do you want to deposite?");
                    calcultingAccountBalance(client, 2);
                    break;
                case 3:
                    System.out.println("Your account balance is : " + client.getBalance()+ "\n");
                    break;
                case 4 :
                    System.out.println("Thanks for your visit!");
                    break;
                default:
                    System.out.println("Enter a valid number");
            }
        }
        while(clientChoice!=4);
    }
}

