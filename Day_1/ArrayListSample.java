package Day_1;


import java.util.*;

public class ArrayListSample<T> {
	private static final int initialcap = 10;
	private T arr[];
	private int size;
	private int cap;
	

	@SuppressWarnings("unchecked")
	ArrayListSample(){
		size = 0;
		arr = (T[]) new Object[initialcap];
		cap = initialcap;
	}
	
	public void add(T val) {
		if(size==cap) {
			expandArr();
		}
		arr[size++] = val;
	}
	
	public void expandArr() {
		cap *=cap;
		arr = java.util.Arrays.copyOf(arr, cap);
	}
	public void display() {
		System.out.println("Elements are ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i] + " \t");
		}
	}
	public void shrinkArr() {
		cap /=cap;
		arr = java.util.Arrays.copyOf(arr, cap);
	}
	
	public void deleteAtpos(int pos) {
		for(int i=pos+1;i<size-1;i++) {
			arr[i-1]=arr[i];
		}
		size--;
		if(cap > initialcap && cap > 3*size) {
			shrinkArr();
		}
	}
	
	public void insertAtpos(int pos,T val) {
		if(size==cap) expandArr();
		for(int i=size-1;i>=pos;i--) {
			arr[i+1] = arr[i];
		}
		arr[pos]=val;
		size++;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayListSample<Integer> list = new ArrayListSample<>();
		
		int val,pos;
		
		while(true) {
			System.out.println("\n ----------List Menu---------- ");
			System.out.println("1. Insert At The End\n");
			System.out.println("2. Display The List\n");
			System.out.println("3. Insert At Specified Position\n");
			System.out.println("4. Delete From Specified Position\n");
			System.out.println("5. Exit \n");
			System.out.println("\n -------------------------------\n");
			System.out.println("Enter Your Choice : \t");
			int choice = scan.nextInt();
			switch(choice){
			case 1:System.out.println("Enter The Data : ");
				   val = scan.nextInt();
				   list.add(val);
				   break;
			case 2:list.display();
				   break;
			case 3:System.out.println("Enter the pos (Starts at 0)");
				   pos=scan.nextInt();
				   if(pos<0) {
					   System.out.println("Invalid Position");
					   break;
				   }
				   System.out.println("Enter The Data : ");
				   val = scan.nextInt();
				   list.insertAtpos(pos,val);
				   break;
			case 4:System.out.println("Enter the pos (Starts at 0)");
			       pos=scan.nextInt();
			       if(pos<0) {
				   System.out.println("Invalid Position");
				   break;
			       }
			       list.deleteAtpos(pos);
			       break;
			case 5:System.exit(0);
			
			default : System.out.println("Wrong Choice");
					  break;
			}
		}
	}
}
