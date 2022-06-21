

public class Main {

	public static void main(String[] args) {
		Contact contact = new Contact("Roshan", 79, 45645645);
		Contact contact1 = new Contact("Ram", 77, 46465688);
		Contact contact2 = new Contact("Geeta", 16, 35435723);
		Contact contact3 = new Contact("Reena", 75, 4565466);

		Addressbook addressBook = new Addressbook();
		addressBook.contactList.add(contact);
		addressBook.contactList.add(contact1);
		addressBook.contactList.add(contact2);
		addressBook.contactList.add(contact3);

		System.out.println(addressBook.contactList);
	}

}
