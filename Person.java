/**
 Represents a student using mySTARS
 Parent class for Student and Admin
 @author 
 @version 1.0
 @since 2016-04-31
*/

public class Person{
	/**
	* Enum for person genders
	*/
	public enum GENDER{FEMALE, MALE}
	/**
	* Name of the person
	*/
	protected String name;
	/**
	* ID of the person
	*/
	protected int ID;
	/**
	* Person's password
	*/
	protected String password;
	/**
	* Gender variable of the person
	*/

	protected GENDER gender;
	/**
	* Nationality of the person
	*/
	protected String nationality;
	/**
	* Constructor for person class
	* @param name Person's name
	* @param ID Person's ID
	* @param gender Person's gender
	* @param nationality Person's nationality
	*/
	public person(String name, int ID, GENDER gender, String nationality){
		this.name = name;
		this.ID = ID;
		this.gender = gender;
		this.nationality = nationality;
	}
	/**
	* Get person's name
	* @return this person's name
	*/
	public String getName(){
		return this.name;
	}
	/**
	* Get person's ID
	* @return this person's ID
	*/
	public int getID(){
		return this.ID;
	}

}