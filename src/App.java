import java.util.Scanner;

public class App {
    public static    void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int  agency, account, password, option;
        System.out.println(".......... WELCOME! .......... ");
        try{
            User u = mock.getUser();
            
            
			System.out.print("\nInsert your agency: ");
		        agency = sc.nextInt();
			
            System.out.print("Insert your account: ");
				account = sc.nextInt();

			System.out.print("Insert your password: ");
				password = sc.nextInt();

                if(u.AccountVerify(agency, account, password) == true) {
                    do{
                        System.out.println("\n\n WELCOME" + u.getName());

                        System.out.println("\n.......... MENU ........... ");
						System.out.println("1- Verify amount");
						System.out.println("2- Deposit");
						System.out.println("3- Withdraw");
                        System.out.println("4- Loan");
						System.out.println("5- Exit");
						System.out.print("Choose an option: ");
						option = sc.nextInt();
                    switch(option){
                        case 1:
                            System.out.println("Saldo atual: " + u.getTotal());
                            break;

                        case 2:
                            System.out.println("insert a deposit value" );
                            double depositValue = sc.nextDouble();
                            u.deposit(depositValue);
                            break;
                    
                        case 3:
                            System.out.println("Withdraw value");
                            double withdrawValor = sc.nextDouble();
                            u.withdraw(withdrawValor);
                        case 4:
                        System.out.println("inset a loan Value: ");
                        double loanValue = sc.nextDouble();
                        double taxValue = (loanValue * (0.15));
                        System.out.println("You will pay U$ " + (loanValue + taxValue) + ", do you want to continue? (1 to Yes / 2 to No)");
                        int optionXY = sc.nextInt();
                      
                        if (optionXY == 1){
                            System.out.println("Thank you, your amount is: " + (loanValue + u.total));
                        } else{
                            System.out.println("Thanks!");
                            break;
                        }

                        case 5:
                        System.out.println("Thanks for using!");
                        break;

                }     

        } while(option != 4); 
        
        }
       
        }

    catch (Exception e) {
        System.out.println("ERROR.");
        System.out.println("ERRO"+e);
    };

}}


