/*
This file represents the following content: 
1. Understanding Java Class Structure
	1.1 - Fields and methods
	1.2 - Comments
	1.3 - Classes vs Files
*/

/* ------------- 1.1 - Fields and methods ---------- */

/*
	-Classes are the basic Java building blocks.
	-Objects are runtime instances of a Class in memory. 
	-State of a program => various objects of all different classes
*/


/*
Classes have two primary elements: 
	1) Methods: functions. Operate on the state of the program
	2) Fields:  variables. Hold the state of the program
Those two things together are called Members of the class
*/


/*
Keywords:
	1) public: Class can be used by other classes
	2) class: Indicates you're defining a class
	3) Animal: Gives the name of the class
*/
public class Animal {
	String name; // String: value that we can put text into. Class supplied with Java

	// Full declaration of a method => method signature
	/*
	public: method may be called from other classes
	type: String => method returns a String
	*/
	public String getName() { 
		return name;
	}

	/*
	type: Void => no value is returned
	newName: Parameter. 
	Caller passes a String and expects nothing to be returned
	*/
	public void setName(String newName) {
		name = newName;
	}
}


/* ------------- 1.2 - Comments ---------- */

// This is a single-line comment

/*
	This is a multiple line comment
*/


/**
	This is a Javadoc multiple-line comment
	@author Max Tiessler Aguirre
*/


/* ------------- 1.3 - Classes vs Files ---------- */

/*
	Each java class is defined by its own *.java file.

	It is usually public --> Java does not require it. You can just
*/

	class Animal {
		String name; 
	}

/*
	You can put two classes in the same file. 
	At most, one of the classes in the file is allowed to be public.
*/

	public class Animal {
		String name; 
	}
	class Animal2 {
		String name; 
	}

/*
	If you have a PUBLIC class => it must match the filename
		- public class Animal2 would not compile in a file named Animal.java
*/