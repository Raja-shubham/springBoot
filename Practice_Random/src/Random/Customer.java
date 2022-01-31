package Random;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Customer implements Comparator {
	String name;
	String mobile;
	int age;
	int  id;
	
	public Customer(String name, String mobile, int age, int id) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.age = age;
		this.id = id;
	}


	public Customer() {
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer("ss","nokia",21,1);
		Customer c2=new Customer("kk","samsung",25,2);
		Customer c3=new Customer("rr","zen",24,3);
		Customer c4=new Customer("jj","oppo",26,4);
		Customer c5=new Customer("jj","oppo",26,4);
		ArrayList<Customer> al=new ArrayList<>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		al.add(c4);
		al.add(c5);
		ArrayList<Customer> al2=new ArrayList<>();
		for(Customer c:al) {
			if(al2!=null) {
				al2.add(c);
			}
		}
		System.out.println(al2);
//		for(Customer c:al) {
//			System.out.println(c.id);
//		}
		//Customer c=new Customer();
//		for(int i=0;i<al.size()-1;i++) {
//			for(int j=i;j<al.size()-1-i;j++) {
//				if(al.get(j).name.compareTo(al.get(j+1).name)>0) {
//					c=al.get(j);
//					al.add(j,al.get(j+1));
//					al.add(j,c);
//				}
//			}
//		}
	}


	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Customer c1=(Customer)o1;
		Customer c2=(Customer)o2;
		int id1=c1.id;
		int id2=c2.id;
		if(id1<id2)
			return -1;
		else
			return 1;	
	}
	

}
