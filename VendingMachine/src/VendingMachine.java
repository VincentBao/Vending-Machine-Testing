public class VendingMachine
{
	private int x;
	private int price;
	private int k;
	private int k1;
	private int t;
	private int s;

	public VendingMachine()
	{
		k1 = 0;
		k = 0;
		t = 0;
		price = 0;
		x = 1;
	}
	public final int coin()
	{
		if (x == 1)
		{
			if ((t + 25 >= price) && (price > 0))
			{
				s = 0;
				t = 0;
				x = 2;
				return 1;
			}
			else if (t + 25 < price)
			{
				t = t + 25;
				return 1;
			}
		}
		else if ((x > 1) && (x < 6))
		{
			System.out.print("RETURN COIN");
			System.out.print("\n");
			return 1;
		}
		return 0;
	}
	public final int small_cup()
	{
		if ((x == 2) || (x == 3))
		{
			s = 2;
			return 1;
		}
		return 0;
	}
	public final int large_cup()
	{
		if ((x == 2) || (x == 3))
		{
			s = 1;
			return 1;
		}
		return 0;
	}
	public final int sugar()
	{
		if ((x == 2) || (x == 3))
		{
			if (x == 2)
			{
				x = 3;
			}
			else
			{
				x = 2;
			}
			return 1;
		}
		return 0;
	}
	public final int tea()
	{
		if ((x == 2) || (x == 3))
		{
			if ((x == 2) && (k1 > 1) && (s == 2))
			{
				System.out.print("DISPOSE SMALL CUP OF TEA");
				System.out.print("\n");
				k1 = k1 - 1;
				x = 1;
				return 1;
			}
			else if ((x == 2) && (k > 1) && (s == 1))
			{
				System.out.print("DISPOSE LARGE CUP OF TEA");
				System.out.print("\n");
				k = k - 1;
				x = 1;
				return 1;
			}
			else if ((x == 2) && (k == 1) && (s == 1))
			{
				System.out.print("DISPOSE LARGE CUP OF TEA");
				System.out.print("\n");
				k = k - 1;
				x = 5;
				return 1;
			}
			else if ((x == 2) && (k1 == 1) && (s == 2))
			{
				System.out.print("DISPOSE SMALL CUP OF TEA");
				System.out.print("\n");
				k1 = k1 - 1;
				x = 4;
				return 1;
			}
			else if ((x == 3) && (k1 == 1) && (s == 2))
			{
				System.out.print("DISPOSE SMALL CUP OF TEA WITH SUGAR");
				System.out.print("\n");
				k1 = k1 - 1;
				x = 4;
				return 1;
			}
			else if ((x == 3) && (k == 1) && (s == 1))
			{
				System.out.print("DISPOSE LARGE CUP OF TEA WITH SUGAR");
				System.out.print("\n");
				k = k - 1;
				x = 5;
				return 1;
			}
			if ((x == 3) && (k1 > 1) && (s == 2))
			{
				System.out.print("DISPOSE SMALL CUP OF TEA WITH SUGAR");
				System.out.print("\n");
				k1 = k1 - 1;
				x = 1;
				return 1;
			}
			else if ((x == 3) && (k > 1) && (s == 1))
			{
				System.out.print("DISPOSE LARGE CUP OF TEA WITH SUGAR");
				System.out.print("\n");
				k = k - 1;
				x = 1;
				return 1;
			}
			return 0;
		}
		return 0;
	}
	public final int insert_large_cups(int n)
	{
		if ((x == 1) && (n > 0))
		{
			k = k + n;
			return 1;
		}
		else if ((x == 5) && (n > 0))
		{
			k = n;
			x = 1;
			return 1;
		}
		return 0;
	}
	public final int insert_small_cups(int n)
	{
		if ((x == 1) && (n > 0))
		{
			k1 = k1 + n;
			return 1;
		}
		else if ((x == 4) && (n > 0))
		{
			k1 = n;
			x = 1;
			return 1;
		}
		return 0;
	}
	public final int set_price(int p)
	{
		if ((x == 1) && (p > 0))
		{
			price = p;
			return 1;
		}
		return 0;
	}
	public final int cancel()
	{
		if ((x == 2) || (x == 3))
		{
			System.out.print("RETURN COINS");
			System.out.print("\n");
			x = 1;
			return 1;
		}
		return 0;
	}
	public final int dispose()
	{
		if ((x == 1))
		{
			System.out.print("SHUT DOWN");
			System.out.print("\n");
			x = 6;
			return 1;
		}
		return 0;
	}

//================================================
//Testing Oriented Method
//================================================

	public void showValue(){
		System.out.println("x = " + x);
		System.out.println("price = " + price);
		System.out.println("k = " + k);
		System.out.println("k1 = " + k1);
		System.out.println("t = " + t);
		System.out.println("s = " + s);
	}

	public void showState(){
		switch(x){
			case 1:
				System.out.println("idle");
				break;
			case 2:
				System.out.println("coins inserted");
				break;
			case 3:
				System.out.println("sugar");
				break;
			case 4:
				System.out.println("no small cups");
				break;
			case 5:
				System.out.println("no large cups");
				break;
			case 6:
				System.out.println("System Terminated");
				break;
			default:
				break;
		}
	}


}






