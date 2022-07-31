import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<String> studentlist = new ArrayList<String>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    String name=sc.next();
		    studentlist.add(name);
		}
		TreeSet<String> tree_set = new TreeSet<String>(studentlist);
		System.out.print(tree_set);
	}
}