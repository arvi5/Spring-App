package co.edureka.autowiring;

public class Hostel {
	private String hostelName;
	private String city;

	public Hostel() {

	}

	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public String toString(){
		return "Hostel [name: " + hostelName + ", city: " + city + "]";

	}


}
