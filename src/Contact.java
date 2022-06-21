


public class Contact {
	String name;
	long number;
	int pinCode;

	Contact(String name, int pinCode,long number) {
		this.name = name;
		this.pinCode = pinCode;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Contact{" + "name='" + name + '\'' + ", pinCode=" + pinCode + "Number" + number +  '}';
	}
}

