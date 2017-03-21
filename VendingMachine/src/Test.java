import java.util.Scanner;

public class Test{
	public static void main(String[] args){

		VendingMachine vm = new VendingMachine();
		int result;

		while(true){
			
			printMenu();	
			
			Scanner sc = new Scanner(System.in);
			char number = sc.next().charAt(0);

			switch(number){
				case '0':
					System.out.println("A quarter is inserted!");
					result = vm.coin();
					System.out.println("The value returned by the method is: " + result + "\n");
					break;
				case '1':
					System.out.println("Small cup is selected!");
					result = vm.small_cup();
					System.out.println("The value returned by the method is: " + result + "\n");
					break;
				case '2':
					System.out.println("Large cup is selected!");
					result = vm.large_cup();
					System.out.println("The value returned by the method is: " + result + "\n");
					break;
				case '3':
					System.out.println("Sugar button is pressed!");
					result = vm.sugar();
					System.out.println("The value returned by the method is: " + result + "\n");
					break;
				case '4':
					System.out.println("Tea button is pressed!");
					result = vm.tea();
					System.out.println("The value returned by the method is: " + result + "\n");
					break;
				case '5':
					System.out.println("Insert large cups into the vending machine!");
					System.out.println("Enter the number of cups");
					int lp = sc.nextInt();
					result = vm.insert_large_cups(lp);
					System.out.println("The value returned by the method is: " + result + "\n");
					break;
				case '6':
					System.out.println("Insert small cups into the vending machine!");
					System.out.println("Enter the number of cups");
					int sp = sc.nextInt();
					result = vm.insert_small_cups(sp);
					System.out.println("The value returned by the method is: " + result + "\n");
					break;
				case '7':
					System.out.println("Set the new price of a cup of tea!");
					System.out.println("Enter the price(in cents)!");
					int p = sc.nextInt();
					result = vm.set_price(p);
					System.out.println("The value returned by the method is: " + result + "\n");				
					break;
				case '8':
					System.out.println("Cancel selection for a cup of tea!");
					result = vm.cancel();
					System.out.println("The value returned by the method is: " + result + "\n");		
					break;
				case '9':
					System.out.println("Terminate the operation of the vending machine!");
					result = vm.dispose();
					System.out.println("The value returned by the method is: " + result + "\n");
					break;
				case 'a':
					System.out.println("Shoe Value");
					vm.showValue();
					break;
				case 'b':
					System.out.println("Show State");
					vm.showState();
					break;
				case 'q':
					System.exit(0);
				default:
					break;
			}

		}
	}

	public static void printMenu(){
		System.out.println("==========Vending Machine Menu==========");

		System.out.println("0.  coins()");
		System.out.println("1.  small_cup()");
		System.out.println("2.  large_cup()");
		System.out.println("3.  sugar()");
		System.out.println("4.  tea()");
		System.out.println("5.  insert_large_cups(int n)");
		System.out.println("6.  insert_small_cups(int)");
		System.out.println("7.  set_price(int p)");
		System.out.println("8.  cancel()");
		System.out.println("9.  dispose()");

		System.out.print("\n\n");
		System.out.println("Testing-related methods");
		System.out.println("a.  show_variables()");
		System.out.println("b.  show_states()");
		System.out.println("q.  Quit\n");	

	}




}
