# TeachMeSkills_C26_Lesson_13_HW
Homework for the thirteenth lesson:

A class is created in which there will be a static method.  
This method takes three parameters as input:  
	Login  
	Password  
	confirmPassword  
 
All fields have the data type String.  
The length of login must be less than 20 characters and must not contain spaces.  
spaces. If login does not meet these requirements, a WrongLoginException must be thrown.  
Password must be less than 20 characters long, password must not contain spaces and must contain at least one digit.  
Also password and confirmPassword must be equal.  
If password does not meet these requirements, a WrongPasswordException must be thrown.  

The WrongPasswordException and WrongLoginException exception classes are custom exception classes with two constructors - one default, the second accepts the exception message and passes it to the Exception class constructor.  

The method returns true if the values are valid or false otherwise.  
Classes are placed in packages: the class for validating values should be in its own separate package, classes for exceptions - in its own package.  
The Runner class is created to test this class.  

The task is solved in two ways:  
1. using methods of the String class "out of the box", e.g. the contains method  
2. by breaking the string into an array of char's (string toCharArray()) and make a traversal and check the array.  
