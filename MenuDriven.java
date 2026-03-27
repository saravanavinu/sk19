import java.util.Scanner;
class MenuDriven
{
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		MenuDriven m=new MenuDriven();
		m.menu();
	}
	void menu()
	{
		System.out.print("Enter the size of an array :");
		int size=sc.nextInt();
		int ar[]=new int[size];
		for(int i=0;i<ar.length;i++)
		{
			System.out.print("Enter the "+(i+1)+" value :");
			ar[i]=sc.nextInt();
		}
		int arr[]=new int[ar.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ar[i];
		}
		boolean exit=true;
		do
		{
			System.out.println(" MENU ");
			System.out.println("1.Bubble Sort");
			System.out.println("2.Largest Element");
			System.out.println("3.Display Original Array");
			System.out.println("4.Exit");
			System.out.println("Enter your option :");
			int opt=sc.nextInt();
			switch(opt)
			{
				case 1:
				{
					ar=sort(ar);
					break;
				}
				case 2:
				{
					int a=largest(ar);
					System.out.println("The largest element in an array is "+a);
					break;
				}
				case 3:
				{
					display(arr);
					break;
				}
				case 4:
				{
					exit=false;
					break;
				}
			
			
			}
		}while(exit);
	}
	int[] sort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		return arr;
	}
	int largest(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>sum)
			{
				sum=arr[i];
			}
		}
		return sum;
	}
	void display(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}