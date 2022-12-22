import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        int balance = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pin");
        String name = sc.nextLine();
        String welcome = "To to Java Bank.";
        System.out.println("Welcome "+ welcome);

    //enter your acount number to take you to your acount
    System.out.println("Enter the account number");
    int acc = sc.nextInt();
    int choice = 1;
    while(choice==1){// List of options to choose from after entering the account number
       System.out.println("1 Deposit");
       System.out.println("2 Withdraw");
       System.out.println("3 Check Balance");
       System.out.println("4 EXIT");
       System.out.println("Enter Choice:");
       int ch = sc.nextInt();// Line to enter option choice
       if(ch==1){
        System.out.println("Enter The amount of deposite");
        int deposite = sc.nextInt();
        balance = balance+deposite;

        System.out.println("Your deposite was succesfull");
       }
       else if(ch==2){
        System.out.println("Enter amount to withdraw");
        int withdraw = sc.nextInt();
        if(withdraw>balance){
            System.out.println("Withdraw failure, Please check your amount");
        }
        else{
            balance = balance-withdraw;
            System.out.println("withdraw succesfully");
        }
       }
       else if(ch==3){
        System.out.println("Your balance is R" +  balance);
       }
       else if(ch==4){
        System.out.println("Thank You "+ name);
        break;

       }
    }

    }

}
