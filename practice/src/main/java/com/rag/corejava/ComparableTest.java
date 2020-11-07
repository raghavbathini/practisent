package com.rag.corejava;

import java.util.ArrayList;
import java.util.List;

public class ComparableTest {

	public static void main(String[] args) {
		Empl e1 = new Empl("A", 1, 10);
		Empl e2 = new Empl("B", 2, 15);
		Empl e3 = new Empl("C", 3, 9);
		Empl e4 = new Empl("D", 4, 11);
		
		List<Empl> emplist = new ArrayList<Empl>();
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		
		int max_sal = Integer.MIN_VALUE;
		Empl max_sal_emp = e1;
		for(Empl e: emplist) {
			if(e.sal > max_sal) {
				max_sal_emp = e;
				max_sal = e.sal;
			}
		}
		
		System.out.println("Max sal emp is---->"+ max_sal_emp.sal);

	}

}

class Empl implements Comparable<Empl>{
	String name;
	int eid;
	int sal;
	
	public Empl(String name, int eid, int sal) {
		super();
		this.name = name;
		this.eid = eid;
		this.sal = sal;
	}

	public int compareTo(Empl o) {
		// TODO Auto-generated method stub
		if(this.sal > o.sal) {
			return 1;
		}else if(this.sal < o.sal) {
			return -1;
		}else {
			return 0;
		}
		
	}
	
	
	
	
}
