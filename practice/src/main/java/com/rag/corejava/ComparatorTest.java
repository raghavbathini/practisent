package com.rag.corejava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {
		Emp e1 = new Emp("A", 1, 10);
		Emp e2 = new Emp("B", 2, 15);
		Emp e3 = new Emp("C", 3, 9);
		Emp e4 = new Emp("D", 4, 11);
		
		List<Emp> emplist = new ArrayList<Emp>();
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		
		int max_sal = Integer.MIN_VALUE;
		Emp max_sal_emp = e1;
		for(Emp e: emplist) {
			if(e.sal > max_sal) {
				max_sal_emp = e;
				max_sal = e.sal;
			}
		}
		
		System.out.println("Max sal emp is---->"+ max_sal_emp.sal);

	}

}

class SalComparator implements Comparator<Emp>{

	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		if(o1.sal > o2.sal) {
			return 1;
		}else if(o1.sal < o2.sal) {
			return -1;
		}else {
			return 0;
		}
		
	}
	
}

class Emp{
	String name;
	int eid;
	int sal;
	
	public Emp(String name, int eid, int sal) {
		super();
		this.name = name;
		this.eid = eid;
		this.sal = sal;
	}
	
	
	
	
}
