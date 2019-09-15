package com.wp;
import java.util.HashMap;
public class DriveHashmap {
	
	public static void main(String[] args) {
		HashMap<Employee,Project> hm = new HashMap<Employee,Project>();
		Employee e1 = new Employee(1,"Money",50000,"CA");
		Employee e2 = new Employee(2,"Honey",70000,"CEO");
		Employee e3 = new Employee(4,"Raj",30000,"BDA");
		Employee e4 = new Employee(1,"Demon",40000,"PD");
		
		Project p1 = new Project(100,"Ecommerce",365,"Vemon");
		Project p2 = new Project(200,"ebank",70,"Beella");
		Project p3 = new Project(100,"Army",109,"lily");
		Project p4 = new Project(400,"Food",65,"ana");
		
		hm.put(e1,p1);
		hm.put(e2,p2);
		hm.put(e3,p3);
		hm.put(e4,p4);
		
		System.out.println(hm);

	}


}
