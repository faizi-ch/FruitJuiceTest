import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class FruitJuiceTest
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner in = new Scanner(System.in);

		System.out.print("1. Bottle\n2. Tetra Pack\nSelect the packing: ");
		int n1, n2 = 0;
		n1 = in.nextInt();
		if (n1 == 1)
		{
			System.out.print("1. Small\n2. Medium\n3. Large\nSelect the pack: ");
			n2 = in.nextInt();
		}
		else if (n1 == 2)
		{
			System.out.print("1. 200ml\n2. 400ml\nSelect the pack: ");
			n2 = in.nextInt();
		}
		else
			System.err.println("INVALID ENTRY!");

		System.out.print(
				"1. Banana Juice\n2. Mango Juice\n3. Peach Juice\nSelect your juice: ");
		int j = in.nextInt();
		if (j == 1)
		{
			BananaJuice bananaJuice = new BananaJuice(n1, n2);
			bananaJuice.setPrice();
			System.out.print("Calculating price");
			TimeUnit.MILLISECONDS.sleep(500);
			System.out.print(".");
			TimeUnit.MILLISECONDS.sleep(500);
			System.out.print(".");
			TimeUnit.MILLISECONDS.sleep(500);
			System.out.print(".");
			TimeUnit.MILLISECONDS.sleep(500);
			System.out.print(".");
			TimeUnit.MILLISECONDS.sleep(500);
			System.out.println(".");
			System.out.println("Price of your juice is " + bananaJuice.getPrice());
		}
		else if (j == 2)
		{
			MangoJuice mangoJuice = new MangoJuice(n1, n2);
			mangoJuice.setPrice();
			System.out.print("Calculating price");
			TimeUnit.MILLISECONDS.sleep(500);
			System.out.print(".");
			TimeUnit.MILLISECONDS.sleep(500);
			System.out.print(".");
			TimeUnit.MILLISECONDS.sleep(500);
			System.out.print(".");
			TimeUnit.MILLISECONDS.sleep(500);
			System.out.print(".");
			TimeUnit.MILLISECONDS.sleep(500);
			System.out.println(".");
			System.out.println("Price of your juice is " + mangoJuice.getPrice());
		}
		else if (j == 3)
		{
			PeachJuice peachJuice = new PeachJuice(n1, n2);
			peachJuice.setPrice();
			System.out.print("Calculating price");
			TimeUnit.MILLISECONDS.sleep(500);
			System.out.print(".");
			TimeUnit.MILLISECONDS.sleep(500);
			System.out.print(".");
			TimeUnit.MILLISECONDS.sleep(500);
			System.out.print(".");
			TimeUnit.MILLISECONDS.sleep(500);
			System.out.print(".");
			TimeUnit.MILLISECONDS.sleep(500);
			System.out.println(".");
			System.out.println("Price of your juice is " + peachJuice.getPrice());
		}
	}
}

abstract class FruitJuice
{
	int packing;
	int price = 0;
	int quantity;

	FruitJuice(int pack,int quantity)
	{
		packing = pack;
		this.quantity = quantity;
	}

	abstract void setPrice();
}

class BananaJuice extends FruitJuice
{
	BananaJuice(int p,int q)
	{
		super(p, q);
	}

	@Override void setPrice()
	{
		if (packing == 1)
		{
			if (quantity == 1)
				price = 30;
			else if (quantity == 2)
				price = 50;
			else if (quantity == 3)
				price = 75;
		}
		else if (packing == 2)
		{
			if (quantity == 1)
				price = 125;
			else if (quantity == 2)
				price = 200;
		}
	}

	int getPrice()
	{
		return price;
	}
}

class MangoJuice extends FruitJuice
{
	MangoJuice(int p,int q)
	{
		super(p, q);
	}

	@Override void setPrice()
	{
		if (packing == 1)
		{
			if (quantity == 1)
				price = 50;
			else if (quantity == 2)
				price = 70;
			else if (quantity == 3)
				price = 90;
		}
		else if (packing == 2)
		{
			if (quantity == 1)
				price = 250;
			else if (quantity == 2)
				price = 370;
		}
	}

	int getPrice()
	{
		return price;
	}
}

class PeachJuice extends FruitJuice
{
	PeachJuice(int p,int q)
	{
		super(p, q);
	}

	@Override void setPrice()
	{
		if (packing == 1)
		{
			if (quantity == 1)
				price = 60;
			else if (quantity == 2)
				price = 80;
			else if (quantity == 3)
				price = 100;
		}
		else if (packing == 2)
		{
			if (quantity == 1)
				price = 270;
			else if (quantity == 2)
				price = 390;
		}
	}

	int getPrice()
	{
		return price;
	}
}
