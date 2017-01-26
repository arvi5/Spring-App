package co.edureka.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private String name;
	private String id;
	@Autowired
	@Qualifier("hostel2")
	private Hostel hostel;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	/*
	 * public Student(String name, String id, Hostel hostel) { super();
	 * this.name = name; this.id = id; this.hostel = hostel; }
	 */

	public void setId(String id) {
		this.id = id;
	}

	public Hostel getHostel() {
		return hostel;
	}

	public void setHostel(Hostel hostel) {
		this.hostel = hostel;
	}

	public String toString() {
		return "student [Name: " + name + ", Id: " + id + ", Hostel: " + hostel + "]";

	}

}
