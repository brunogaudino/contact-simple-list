package com.gaudino.simplecontact;

public class LabTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contact contact = new Contact();
		contact.setName("My Name");
				
		//Create address object
		Address address = new Address();
		address.setStreetName("Dom Pedro II");
		address.setHouseNumber("02");
		address.setComplement("near São Bento Street");
		address.setZip("1234-123");
		address.setCity("Guarulhos");
		address.setState("São Paulo");
	
		contact.setAddress(address);
	
		//Create telephone object
		Telephone telephone = new Telephone();
		telephone.setType("Cellphone");
		telephone.setDdd("11");
		telephone.setPhoneNumber("91234-1234");
		
		Telephone telephone2 = new Telephone();
		telephone2.setType("House");
		telephone2.setDdd("11");
		telephone2.setPhoneNumber("4321-4321");
		
		Telephone[] telefones = new Telephone[2];
		telefones[0] = telephone;
		telefones[1] = telephone2;
		contact.setTelephones(telefones);		
		
		//Show return in console
		System.out.println("Name: " + contact.getName());
		
		if (contact != null && contact.getAddress() != null) {			
			System.out.println("Street name: " + contact.getAddress().getStreetName());
			System.out.println("House number: " + contact.getAddress().getHouseNumber());
			System.out.println("Complement: " + contact.getAddress().getComplement());
			System.out.println("Zip: " + contact.getAddress().getZip());
			System.out.println("City: " + contact.getAddress().getCity());
			System.out.println("State: " + contact.getAddress().getState());
		}
		
		if (contact != null && contact.getTelephones() != null) {			
			for(Telephone t : contact.getTelephones()) {		
				System.out.println(t.getType() + ": (" + t.getDdd() + ")" + t.getPhoneNumber());
			}
		}

	}

}

