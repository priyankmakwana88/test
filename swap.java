import java.util.scanner;

class swap{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		int a=sc.nextInt();			
		int b=sc.nextInt();

		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a + " " + b);
}

}
