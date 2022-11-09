/*
This file represents the following content: 
1. Understanding Java Class Structure
	1.4 - Writing a main() Method
*/


/* ------------- 1.4 - Writing a main() Method ---------- */
 
/*
Execution begins in the main() method. 
Is the gateway between the startup of a Java process and the beginning of the code.
*/


/*
Rules to follow: 
	1) Each file contains only one class
	2) Filename must match the class name, including case and have .java extension

To compile: 
	1) javac Zoo.java => generates a bytecode Zoo.class, the JVM knows how to read it
	2) java Zoo
*/
public class Zoo {
	/*
		If a main() method is not present (or it is not static) in the .java 
			--> we will have process error

		public: access modifier, declares method level of exposure
		static: Binds method to its class. It can be by just the class name
				for example, Zoo.main(). Java does not need to create an object to call main()
		void: return type. We use voids for method that change an object's state. main() changes the program
			  state from started to finished. 
		parameter list: it is allowed to write String[] args, String args[] and String... args.
						[] represent an Array. It is a fixed-size list of items of the same type
						... represent varargs (Variable argument lists).

		We compile with:
			- javac Zoo.java
		We execute: 
			- java Zoo Zoo Bronx 	--> Zoo 
										Bronx

			- java "San Diego" Zoo	--> San Diego 
										Zoo

			- java Zoo 2 			--> Zoo
										2 (it treates numbers as Strings)

			- java Zoo				--> java.lang.ArrayIndexOutOfBoundsException: 1
										(no element in args[1])

	*/
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
	}

	/* 
	------IMPORTANT----
	You need a JDK to compile (it includes a compiler)
	You dont need a JDK to run a Java code, with a JRE its enough
	*/
}