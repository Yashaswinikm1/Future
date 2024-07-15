package com.oops.abstraction;

import java.util.*;
import java.util.List;

class Person {
	    private String name;
	    private int age;
	    private String address;
	    private String state;
	    private String city;

	    public Person(String name, int age, String address, String state, String city) {
	        this.name = name;
	        this.age = age;
	        this.address = address;
	        this.state = state;
	        this.city = city;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public String getState() {
	        return state;
	    }

	    public String getCity() {
	        return city;
	    }

	    @Override
	    public String toString() {
	        return "Name: " + name + ", Age: " + age + ", Address: " + address + ", State: " + state + ", City: " + city;
	    }
	}

	public class ArrayListProgram {
	    public static void main(String[] args) {
	    	ArrayList<Person> people = new ArrayList<Person>();

	        people.add(new Person("John Doe", 30, "123 Main St", "Karnataka", "Bangalore"));
	        people.add(new Person("Jane Smith", 25, "456 Elm St", "Tamil Nadu", "Chennai"));
	        people.add(new Person("Bob Johnson", 40, "789 Oak St", "Karnataka", "Mysore"));
	        people.add(new Person("Alice Brown", 28, "321 Pine St", "Karnataka", "Hubli"));
	        people.add(new Person("Mike Davis", 35, "901 Maple St", "Maharashtra", "Mumbai"));
	        people.add(new Person("Emily Taylor", 22, "234 Cedar St", "Andhra Pradesh", "Hyderabad"));
	        people.add(new Person("Sarah Lee", 32, "567 Spruce St", "Telangana", "Secunderabad"));
	        people.add(new Person("David Kim", 45, "890 Fir St", "Kerala", "Thiruvananthapuram"));
	        people.add(new Person("Lisa Nguyen", 29, "678 Cypress St", "Karnataka", "Belgaum"));
	        people.add(new Person("Kevin White", 38, "345 Walnut St", "Gujarat", "Ahmedabad"));

	        System.out.println("People from Karnataka:");
	        for (Person person : people) {
	            if (person.getState().equals("Karnataka")) {
	                System.out.println(person.toString());
	            }
	        }
	    }
	

}
