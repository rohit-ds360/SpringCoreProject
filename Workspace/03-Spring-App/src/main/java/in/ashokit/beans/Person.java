package in.ashokit.beans;

public class Person {

	private Integer personId;
	private String personName;
	
	private Address addr;

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Address getAddress() {
		return addr;
	}

	public void setAddress(Address address) {
		this.addr = address;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", address=" + addr + "]";
	}
	
	
	
	
	

}
