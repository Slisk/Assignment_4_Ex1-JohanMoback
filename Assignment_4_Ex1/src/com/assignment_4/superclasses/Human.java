package com.assignment_4.superclasses;

/**
 * @ En klass Human med en String name och int age. 
 *
 */
public class Human {
	
	private String name = ""; 
	private int age = 0; 
	
	/**
	 * @return name, vi retunerar namnet som vi har anget. 
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name vi instansierar vårt namn. 
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return age, vi hämtar vår age som vi har anget. 
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age, vi instansierar vår age däefter hämtar vi det värdet. 
	 */
	public void setAge(int age) {
		this.age = age;
	} 
	
	/**
	 * @param putName
	 * @param putAge
	 * En konstruktor Human, med parameter putName och putAge. 
	 */
	public Human(String putName, int putAge) {
		name = putName;
		age = putAge; 
	}
	
	
	

}
