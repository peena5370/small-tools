		/******** Java Comments(Java 注释) ********/
		/* many lines  
		 * line 1
		 * line 2
		 * line 3
		 * line 4
		 * comments */
		// this is single line comment
		/*
		 * <-- Java Annotation -->
		 * @Override						--> use for tell compiler to check error for rewrite code syntax
		 * @Deprecated						--> use for check class, method, interface wether it is expired and throw error 
		 * @SuppressWarnings({"keywords"})	--> suppress warning that trigger with keywords(all,boxing,cast,dep-ann,deprecation,fallthrough,finally,hiding....)
		 * @SafeVarargs
		 * @FunctionalInterface
		 * */
		/********VARIABLE DECLARATION********/
		/*
		 * String textString = "string here";
		 * int iValue = 1000, iValue2 = 200, iValue3 = 4000;
		 * float fValue = 1000.00, fValue2, fValue3 = 19.99;
		 * char cChar = 'A', cChar2 = 'B';
		 * boolean x = true, y = false;	---> boolean = true / false
		 *
		 *Others datatype = byte, short, int, long, float, double, boolean, char
		 *String, Arrays(new Arrays), Classes(declare class),Interface(interface class)
		 * */
		/******** INPUT ********/
		/*
		 * import java.util.Scanner
		 * int iValue = new Scanner(System.in).nextInt();	--> declare datatype variableName = new Scanner(System.in).read value type();
		 * --> nextInt() = read int value, nextFloat() = read float value, nextDouble() = read double value
		 * --> next() = read string before whitespace, nextLine() = read entire string
		 * --> nextBoolean = read true or false value
		 * */
		/******** OUTPUT ********/
		/*
		 * System.out.println(textString + iValue + fValue + x + y);
		 * System.out.printf("%2.2f\n",x);		--> new type for output value or strings(same with C)
		 * */
		/******** OPERATORS(calculation) ********/
		/*
		 * <-- Calculation symbol -->
		 * Value = x + y;
		 * Value = x - y:
		 * Value = x * y;
		 * Value = x / y;
		 * Value = x % y;
		 * x++ / ++x / x-- /--x;
		 * x = 5;
		 * x += 5 / x = x + 5;
		 * x -= 5 / x = x - 5;
		 * x *= 5 / x = x * 5;
		 * x /= 5 / x = x / 5;
		 * x %= 5 / x = x % 5;
		 * x &= 5 / x = x & 5;
		 * x |= 5 / x = x | 5;
		 * x ^= 5 / x = x ^ 5;
		 * x >>= 5 / x = x >> 5;
		 * x <<= 5 / x = x << 5;
		 * 
		 * <-- Comparison symbol -->
		 * x == y;	--> equal to 
		 * x != y;	--> not equal to
		 * x > y;	--> bigger than
		 * x < y;	--> smaller than 
		 * x >= y;	--> bigger or equal to 
		 * x <= y;	--> smaller or equal to
		 * 
		 * <-- Logical symbol -->
		 * x = 5 && x = 10	--> logical and
		 * x = 5 || x <9	--> logical or
		 * !(x <5 && x <10)	--> logical not(return false if result true)
		 * 
		 * <-- Bitwise symbol(for binary calculation use) -->
		 * &	--> AND
		 * |	--> OR
		 * ~	--> NOT
		 * ^	--> XOR
		 * <<	--> zero-fill left shift
		 * >>	--> signed right shift
		 * >>>	--> zero-fill right shift
		 * */
		/******** String conversion ********/
		/*
		 * String newStr = "Test string for output";
		 * System.out.println(newStr.toUpperCase());	--> string to upper case
		 * System.out.println(newStr.toLowerCase());	--> string to lower case
		 * System.out.println(newStr.indexOf("string"));	--> return string location value(first string output first) output = 5
		 * <-- input symbol -->
		 * \'	--> single quote
		 * \"	--> double quote
		 * \\	--> backslash
		 * <-- escape tag -->
		 * \n	--> newline
		 * \r	--> carriage return
		 * \t	--> tab
		 * \b	--> backspace
		 * \f	-->form feed
		 * */
		/******** Math class ********/
		/*
		 * Math.max(val1, val2)		--> find highest value between val1 and val2
		 * Math.mix(val1, val2)		--> find smallest value between val1 and val2
		 * Math.sqrt(val)			--> square root of val
		 * Math.abs(-4.7)			--> return positive value of value
		 * Math.random()			--> return random number between a range 0 to max number
		 * */
		/******** Condition statements ********/
		/*
		 * <-- if...else -->
		 * if( x == 1) {
		 * 	code statements
		 * }
		 * else {
		 * 	code statements
		 * }
		 * <-- if...else if...else -->
		 * if ( x == 1) {
		 * 	code statements
		 * }
		 * else if ( x == 2) {
		 * 	code statements 
		 * }
		 * else {
		 * 	code statements
		 * }
		 * <-- short form if...else -->
		 * variable = ( x == 1) ? expressionTrue : expressionFalse;	
		 * --> variable = String output, expressionTrue = functionName1()/"output 1", expressionFalse = functionName2()/"output2";
		 * <-- switch...case -->
		 * int iValue = 4;
		 * switch(iValue) {
		 * 	case 1:
		 * 		code statements;
		 * 	break;
		 * 	case 2:
		 * 		code statements;
		 * 	break;
		 * 	case 3:
		 * 		code statements;
		 * 	break;
		 * 	case 4:
		 * 		code statements;
		 * 	break;
		 * 	case 5:
		 * 		code statements;
		 * 	break;
		 * 	default:
		 * 		code statements;
		 * }
		 * <-- while loop -->
		 * while ( x < 6 ) {
		 * 	code statements;
		 * 	value ++;
		 * }
		 * <-- do...while -->
		 * do {
		 * 	code statements
		 * }while ( x < 6 );
		 * <-- for loop -->
		 * for( x = 0; x < 5; x++) {
		 * 		code statements
		 * }
		 * <-- nested for loop -->
		 * for( x = 0; x < 5; x++) {
		 * 	for( y = 0; y < 5; y++) {
		 * 		code statements
		 * 	}
		 * }
		 * <-- For-Each loop -->(use to loop elements through array)
		 * String[] text = {"Str1","Str2","Str3"};
		 * for(String newVar : text) {		--> for( datatype variableName : arrayName) {}
		 * 	code statements(output newVar);
		 * }
		 * <-- break / continue -->
		 * for(x=0; x<10; x++){
		 * 	if(x==4){
		 * 		break;		--> break entire loop if condition = true
		 * 	}
		 * }
		 * for(x=0; x<10; x++){
		 * 	if(x==4){
		 * 		continue;		--> break only one loop based on the condition 
		 * 	}
		 * }
		 * */
		/******** Arrays ********/
		/*
		 * String[] cars;		--> array declaration(datatype[] arrayName)
		 * String[] cars = {"Str1","Str2","Str3"};		--> 1D array
		 * int[][] newArr = { {1,2,3,4},{5,6,7,8}};		--> 2D array
		 * cars.length 		--> output length of cars array
		 * <-- for loop array -->
		 * for( int i = 0; i < newArr.length; i++ {
		 * 	for( int j = 0; j < newArr[i].length; j++ {
		 * 		code statements
		 * 	}
		 * }
		 * */
		/******** Call function method ********/
		/*
		 * <-- declaring new function -->
		 * static void newFunc() {		--> declare new function in same class
		 * 		code statements;
		 * }
		 * 
		 *  public static void main(String[] args) {
		 *  	newFunc();				--> execute function in main() function
		 *  }
		 *  <-- declare function with parameters -->
		 *  static void funcText( String newTxt) {
		 *  	System.out.println(newTxt + " newStr");
		 *  }
		 *  
		 *  public static void main(String[] args) {
		 *  	funcText("Str1");		--> declare value for function(output = Str1 newStr)
		 *  	funcText("Str2");		--> output = Str2 newStr
		 *  <-- return function value -->
		 *  static void newFunc( int x, y) {
		 *  	return x + y;
		 *  
		 *  public static void main(String[] args) {
		 *  	int z = newFunc(5,3);
		 *  	System.out.println(z);		-->output 8(5 + 3)
		 *  }
		 *  <-- if else return statement -->
		 *  static void diffFunc(int x) {
		 *  	if (x == 5) {
		 *  		code statement 1;
		 *  	}
		 *  	else {
		 *  		code statement 2;
		 *  	}
		 *  }
		 *  
		 *  public static void main(String[] args) {
		 *  	diffFunc(10);				-->execute code statement 2
		 * */
		
		/******** Java OOP ********/
		/******** 
		 * make new class file is similar like declare universal variable, the reuse in other .java file,
		 * declare public class to make it usable at other places,
		 * then use pointer to access the items we need such as (newObj.x --> object.other class variables) 
		 * before use at other .java file, need to declare as new class( otherClass newObj = new otherClass();  newObj.otherClassFunc();
		 *********/
		/*
		 * <-- Create class -->
		 * public class NewClass {		-->declaring a class with name NewClass
		 * 	int i = 5;
		 * 		public static void main(String[] args){
		 * 			NewClass newObj = new NewClass();		-->declaring object call newObj
		 * 			System.out.println(newObj.i);		--> output value of i
		 * }
		 * 
		 * <-- create class with other .java folder -->
		 * subClass.java
		 * public class subClass {
		 * 	final int i = 10;		--> final use to declare fixed value to prevent override
		 * 	int j = 5;
		 * }
		 * 
		 * mainClass.java 
		 * class mainClass {
		 * 	public static void main(String[] args) {
		 * 		subClass newObj = new subClass();
		 * 		System.out.println(newObj.j);		--> output 5
		 * 		}
		 * }
		 * 
		 * <-- class and object modifier -->
		 * public = can be access by all classes
		 * private = only can access in own class
		 * default/empty declaration = only accessible in same package
		 * protected = accessible in same package and subclasses
		 * final = class cannot be override by other classes 
		 * abstract = cannot be used to create objects from an abstract class,need to inherit abstract class to use
		 * 
		 * <-- variable modifier -->
		 * final = declared variable or methods cannot be override
		 * static = fixed for the class,cannot used outside
		 * abstract = can used in an abstract class and abstract methods,
		 * 			  dont have body(need to create class <new class name> extends <abstract class name>) 
		 * transient = skip attributes and methos when serializing
		 * synchronized = methods can be use only by one thread at same time
		 * volatile = value not cached thread-locally, always read from the "main memory"
		 * 
		 * <-- Encapsulation - private modifier -->
		 * public class Person {
		 * 	private String name;		--> restricted access variable
		 * }
		 * <-- get method -->
		 * public String getName() {
		 * 	return name;				-->read restricted variable and return to public by using getName(),value read-only
		 * }
		 * <-- set method -->
		 * public void setName(String newName) {
		 * 	this.name = newName;		-->write new variable to restricted variable,value can get by setName(),value write-only
		 * }
		 * */
		/******** Java Packages and API ********/
		/*
		 * import package.name.Class;	-->import single class
		 * import java.util.Scanner;
		 * import package.name.*;		-->import whole package
		 * import java.util.*;
		 * 
		 * <-- structure direction of package -->
		 * _____>root		-->root folder ie. java
		 * 	 _____>mypack		--> package folder ie. util
		 * 	   _____>MyPackageClass.java		-->class folder ie.Scanner
		 * output	-->import root.mypack.MyPackageClass
		 * <-- package keyword -->
		 * package mypack		-->declare package name(must in lower case)
		 * class MyPackageClass {		-->declare class name
		 * 		public static void main(String[] args) {
		 * 			code statements;
		 * 		}
		 * }  
		 * */
		/******** Java Inheritance (Java ç»­æ‰¿ï¼‰ ********/
		/*
		 * **** sublass(å­�ç±»/child) ****		**** superclass(çˆ¶ç±»/è¶…ç±»/parent) ****
		 * (public/default) class class_name extends extend_class { code statements; }
		 * --> public class this_class.java extends new_class { ... } 
		 * 
		 * class Vehicle {			-->superclass(create new parent class)
		 * 	protected String brand = "Ford";
		 * 	public void honk() {
		 * 		System.out.println("honk honk");
		 * 	}
		 * }
		 * 
		 * class hellotest extends Vehicle {		-->subclass(inherit own class.java from superclass)
		 * 	private String modelName = "Mustang";
		 * 	public void main(String[] args) {
		 * 		hellotest myCar = new hellotest();	-->create object
		 * 		myCar.honk();
		 * 		System.out.println(myCar.brand + " " + myCar.modelName):
		 * 	}
		 * }
		 * */
		/******** Java Polmorphism (Java å¤šæ€�ï¼‰ ********/
		/*
		 * <-- 1 superclass being used by many subclasses --> 
		 * 
		 *class Animal {					-->superclass
		 *	public void animalSound() {
		 *		System.out.println("Animal sound");
		 *	}
		 *}
		 *class Pig extends Animal {		-->subclass 1
		 *	public void animalSound() {
		 *		System.out.println("Pig sound");
		 *	}
		 *}
		 *class Dog extends Animal {		-->subclass 2
		 *	public void animalSound() {
		 *		System.out.println("Dog sound");
		 *	}
		 *}
		 *	
		 *class hellotest {					-->main class
		 *	public static void main(String[] args ) {
		 *		Animal myAnimal = new Animal();		-->declare object
		 *		Animal myPig = new Pig();			-->declare object
		 *		Animal myDog = new Dog();			-->declare object
		 *		myAnimal.animalSound();				-->execute
		 *		myPig.animalSound();				-->execute
		 *		myDog.animalSound();				-->execute
		 *	}
		 *}
		 * */
		/******** Java Inner Class/Nested Class (Java å†…éƒ¨ç±»ï¼‰ ********/
		/*
		 * <-- to access inner class, need to create an outer class, then access inner class through outer class -->
		 * <-- declare inner class -->
		 * 		OuterClass{			-->outer layer part 
		 * 			...
		 * 			InnerClass{...}		-->nested layer inner class
		 * 		}
		 * 	**** for loop structure example(nested loop) ****
		 * 	for(...) {			-->outer layer
		 * 		for(...) {		-->inner layer
		 * 		}	
		 * 	}
		 * 
		 * 	<-- to run -->
		 * 		public class hellotest {
		 * 			OuterClass myOuter = new OuterClass();		-->declare object for outer class
		 * 			OuterClass.InnerClass myInner = myOuter.InnerClass();		-->declare object for inner class
		 * 			System.out.println(myInner.myInnerMethod());		--> output object
		 * 
		 * class OuterClass {
		 * 		int x = 10;
		 * 		
		 * 		class InnerClass {
		 * 			public int myInnerMethod() {
		 * 				return x;
		 * 			}
		 * 		}
		 * }
		 * 
		 * public class hellotest {
		 * 		public static void main(String[] args) {
		 * 			OuterClass myOuter = new OuterClass();
		 * 			OuterClass.InnerClass myInner = myOuter.InnerClass();
		 * 			System.out.println(myInner.myInnerMethod());
		 * 		}
		 * }
		 * */
		/******** Java Abstract (Java æŠ½è±¡ç±»ï¼‰ ********/
		/*
		 * <-- to improve security by hiding certain details and show only important details by using abstract 
		 * 		classes and methods -->
		 * 
		 *abstract class Animal {			-->restricted class
		 *	public abstract void animalSound();
		 *	public void sleep() {
		 *		System.out.println("sleep");
		 *	}
		 *}
		 *	
		 *class Pig extends Animal {		-->inherit restricted class using extends
		 *	public void animalSound() {
		 *		System.out.println("Pig sound");
		 *	}
		 *}
		 *
		 *class hellotest {					-->main class execute abstract class using inherited class name
		 *	public static void main(String[] args) {
		 *		Pig myPig = new Pig();		-->create object using inherited class 
		 *		myPig.animalSound();
		 *		myPig.sleep();
		 *	}
		 *}
		 * */
		/******** Java Interface (Java æŽ¥å�£ï¼‰ ********/
		/*
		 *interface Animal {		-->dont like abstract class,interface dont have body
		 *	public void animalSound();		-->cannot define structure for interface class function,will throw error
		 *	public void sleep() ;
		 *}
		 *
		 *class Pig implements Animal {		-->use implements keyword to create body for interface class
		 *	public void animalSound() {
		 *		System.out.println("Pig sound");
		 *	}
		 *	public void sleep() {
		 *		System.out.println("sleep");
		 *	}
		 *}
		 * 
		 *class hellotest {					-->execute implemented class into main class
		 *	public static void main(String[] args) {
		 *		Pig myPig = new Pig();
		 *		myPig.animalSound();
		 *		myPig.sleep();
		 *	}
		 *}
		 *
		 *interface FirstInterface {
		 * 	public void myMethod();
		 *}
		 *	
		 *interface SecondInterface {
		 *	public void oOtherMethod();
		 *}
		 *
		 *<-- interface class can be implement in many interfaces class in one time,
		 *	  to create structure in one class -->
		 *
		 *class testClass implements FirstInterface,SecondInterface {
		 *	public void myMethod() {			--> interface 1 method
		 *		System.out.println("first sound");
		 *	}
		 *	public void oOtherMethod() {		-->interface 2 method
		 *		System.out.println("second sound");
		 *	}
		 *}
		 *	
		 *class hellotest {
		 *	public static void main(String[] args) {
		 *		testClass myTest = new testClass();
		 *		myTest.myMethod();
		 *		myTest.oOtherMethod();
		 *	}
		 *}
		 * */
		/******** Java Enums ********/
		/*
		 * <-- enum = special "class"(variable unchangeable like final variable),
		 * 	   usually use for to values/variables that not going to change for future, 
		 * 	   use pointer to point the variables in other class ( LEVEL.MEDIUM),
		 * 	   cannot use to create object,but can implement for interfaces -->
		 * 
		 * enum LEVEL {
			LOW,MEDIUM,HIGH
		 *}
		 *
		 *public class hellotest {
		 *	public static void main(String[] args) {
		 *		LEVEL myVar = LEVEL.MEDIUM;				--> declare variable
		 *		
		 *		switch(myVar) {							--> switch between LEVEL variable
		 *		case LOW:
		 *			System.out.println("Low level");
		 *			break;
		 *		case MEDIUM:
		 *			System.out.println("Medium level");
		 *			break;
		 *		case HIGH:
		 *			System.out.println("High level");
		 *			break;
		 *		}
		 *	}
		 *}
		 *public class hellotest {
		 *	public static void main(String[] args) {
		 *		for(LEVEL myVar : LEVEL.values()) {			--> loop through LEVEL variables
		 *			System.out.println(myVar);
		 *		}
		 *	}
		 *}
		 * */
		/******** Java DateTime ********/
		/*
		 * import java.time.*;
		 * <-- classes -->
		 * LocalDate = yyyy-MM-dd
		 * LocalTime = HH-mm-ss-ns
		 * LocalDateTime = yyyy-MM-dd-HH-mm-ss-ns
		 * DateTimeFormatter = display and parse date-time objects
		 * 
		 * <-- date time formatter(.ofPattern("values") -->
		 * yyyy-MM-dd = 1920-12-31
		 * dd/MM/yyyy = 31/12/2020
		 * dd-MMM-yyyy = 31-Dis-1920
		 * E,MMM dd yyyy = Thu, Dis 31 1920
		 * 
		 * import java.time.LocalDateTime;				-->import localdatetime class
		 * import java.time.format.DateTimeFormatter;	-->import datetimeformatter
		 *
		 * public class hellotest {
		 *	 public static void main(String[] args) {
		 *		 	LocalDateTime myDateObj = LocalDateTime.now();		-->declare object for current date time
		 *			System.out.println("Before change " + myDateObj);
		 *			DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MMM-yyyy");	-->declare format
		 *		
		 *			String formattedDate = myDateObj.format(myFormatObj);	-->convert to string
		 *			System.out.println("After change " + formattedDate);	-->output string
		 *	 }
		 *}
		 * */
		/******** Java List ********/
		/*
		 * <-- ArrayList -->
		 * <-- packages -->
		 * import java.util.ArrayList;			-->add(),get(),set(),remove(),clear(),size()
		 * import java.util.Collections;		-->sort()
		 * <-- syntax -->
		 * ArrayList<datatype> variable_name = new ArrayList<datatype>();		-->declare arraylist as object
		 * ArrayList variable_name = new ArrayList();		--> declare raw type arraylist(no datatype,can store multiple items)
		 * variable_name.add("values1");					-->add items to arraylist
		 * variable_name.add("values2");
		 * variable_name.add("values3");
		 * variable_name.add("values4");
		 * variable_name.get(arr_position);					-->get arr_position value
		 * variable_name.set(arr_position, new_value);		-->set arr_position with new value
		 * variable_name.remove(arr_position);				-->remove arr_position value
		 * variable_name.clear();							-->clear all array elements
		 * variable_name.size();							-->to determine the actual array size
		 * Collections.sort(variable_name);					-->sort value in ascending order
		 * 
		 * import java.util.ArrayList;
		 * import java.util.Collections;
		 *
		 * public class hellotest {
		 *	 public static void main(String[] args) {
		 *		 ArrayList<String> cars = new ArrayList<String>();		-->declare arraylist object
		 *		 cars.add("Volvo");
		 *		 cars.add("BMW");
		 *		 cars.add("Ford");
		 *		 cars.add("Mazda");
		 *		 for(int i = 0; i < cars.size(); i++) {			--> loop through arraylist
		 *			 System.out.println(cars.get(i));
		 *		 }
		 * 		 Collections.sort(cars);						--> sort arraylist
		 *		 for (String i : cars) {
		 *			 System.out.println(i);
		 *		 }
		 *	 }
		 *}
		 *
		 * <-- LinkedList --> 
		 * <-- packages -->
		 * import java.util.LinkedList;
		 * import java.util.Collections;
		 * <--Syntax -->
		 * LinkedList<dataype> variable_name = new LinkedList<datatype>();		--> declare linkedlist
		 * variable_name.addFirst();											--> add value to first element
		 * variable_name.addLast();												--> add value to last element
		 * variable_name.get(index);											--> get value for (index) element
		 * variable_name.getFirst();											--> get value from first element
		 * variable_name.getLast();												--> get value from last element
		 * variable_name.removeFirst();											--> remove first element value
		 * variable_name.removeLast();											--> remove last element value
		 *
		 * import java.util.LinkedList;
		 * import java.util.Collections;
		 *	
		 *	public class hellotest {
		 *		public static void main(String[] args) {
		 *			LinkedList<String> products = new LinkedList<String>();
		 *			String p1 = new String("Volvo");
		 *			String p2 = new String("BMW");
		 *			String p3 = new String("Ford");
		 *			String p4 = new String("Mazda");
		 *			products.add(p1);
		 *			products.add(p2);
		 *			products.add(p3);
		 *			products.add(p4);
		 *			String p5 = new String("Benz");
		 *			products.addLast(p5);
		 *			for(int i = 0; i < products.size(); i++) {
		 *				System.out.println(products.get(i));
		 *			}
		 *			System.out.println("**********");
		 *			System.out.println("The first product is : "+ products.getFirst());
		 *			System.out.println("The last product is : " + products.getLast());
		 *			products.removeLast();
		 *			System.out.println("After deleted the product remaining : ");
		 *			for( int i = 0; i < products.size(); i ++) {
		 *				System.out.print(products.get(i) + "\t");
		 *			}
		 *			System.out.println("\n**********");
		 *			Collections.sort(products);
		 *			for (String i : products) {
		 *				System.out.println(i);
		 *			}
		 *		}
		 *	}
		 * */
		/******** Java Map(HashMap and TreeMap) ********/
		/*
		 * <-- HashMap -->
		 * <-- HashMap is element with pair of key + value, key is unique, value can be same -->
		 * <-- packages -->
		 * import java.util.HashMap;		-->hashmap package
		 * <-- Syntax -->
		 * HashMap<datatype> variable_name = new HashMap<datatype>();
		 * variable_name.clear();									-->clear all key-value
		 * variable_name.containsKey(Object value); 				-->find Map object value
		 * variable_name.get(Object key);							-->return object value
		 * variable_name.put("key","value");						-->add key-value to Map,if key exists, replace old key-value
		 * variable_name.putAll(Map);								-->copy other Map to selected Map
		 * variable_name.remove(Object key);						-->remove selected key-value,if not exist,return null
		 * variable_name.remove(Object key, Object value)			-->Java 8 new delete key-value method
		 * variable_name.entrySet();								-->return all Map key-value to a Set
		 * variable_name.keySet();									-->return Map key
		 * variable_name.isEmpty();									-->check Map is empty(no key-value), if empty return true
		 * variable_name.size();									-->return size of Map
		 * variable_name.values();									-->return Map values
		 * 
		 *  import java.util.HashMap;
		 *	import java.util.Iterator;
		 *	import java.util.Scanner;
		 *	
		 *	public class hellotest {
		 *		public static void main(String[] args) {
		 *			HashMap users = new HashMap();
		 *			users.put("11", "User1");
		 *			users.put("22", "User2");
		 *			users.put("33", "User3");
		 *			users.put("44", "User4");
		 *			users.put("55", "User5");
		 *			System.out.println("**********");
		 *			Iterator it = users.keySet().iterator();
		 *				while(it.hasNext()) {
		 *					Object key = it.next();
		 *					Object val = users.get(key);
		 *					
		 *					System.out.println("User ID : " + key + " User Name : " + val);
		 *				}
		 *				Scanner input = new Scanner(System.in);
		 *				System.out.println("Please input deleted ID : ");
		 *				int num = input.nextInt();
		 *					if(users.containsKey(String.valueOf(num))) {
		 *						users.remove(String.valueOf(num));
		 *					}
		 *					else {
		 *						System.out.println("This user is not exists! ");
		 *					}
		 *					
		 *				System.out.println("*****Users List*****");
		 *				it = users.keySet().iterator();
		 *					while(it.hasNext()) {
		 *						Object key = it.next();
		 *						Object val = users.get(key);
		 *						
		 *						System.out.println("User ID : " + key + " User Name : " + val);
		 *					}
		 *						
		 *		}
		 *	}
		 * */
		/******** Java Sets(HashSet and TreeSet) ********/
		/*
		 * <-- HashSet -->
		 * <-- items is Sets is unique and wont appears twice although have same items -->
		 * <-- packages -->
		 * import java.util.HashSet;
		 * 
		 * <-- Syntax -->
		 * HashSet<datatype> variable_name = new HashSet<datatype>();
		 * 
		 * 
		 * 
		 *  import java.util.HashSet;
		 *
		 *	public class hellotest {
		 *		public static void main(String[] args) {
		 *			HashSet<Integer> numbers = new HashSet<Integer>();
		 *				numbers.add(4);
		 *				numbers.add(7);
		 *				numbers.add(8);
		 *				
		 *				for(int i = 1; i <= 10; i++) {
		 *					if(numbers.contains(i)) {
		 *						System.out.println(i + " was found in the set.");
		 *					}
		 *					else {
		 *						System.out.println(i + " was not found is the set.");
		 *					}
		 *				}
		 *		}
		 *	}
		 *
		 * import java.util.HashSet;
		 *	import java.util.Iterator;
		 *	
		 *	public class hellotest {
		 *		public static void main(String[] args) {
		 *			HashSet<String> courseSet = new HashSet<String>();
		 *				String course1 = new String("Java");
		 *				String course2 = new String("Python");
		 *				String course3 = new String("HTML");
		 *				String course4 = new String("PHP");
		 *				courseSet.add(course1);
		 *				courseSet.add(course2);
		 *				courseSet.add(course3);
		 *				courseSet.add(course4);
		 *				System.out.println("All courses : ");
		 *				Iterator<String> it = courseSet.iterator();
		 *					while(it.hasNext()) {
		 *						System.out.println(" <" + (String)it.next() + "> ");
		 *					}
		 *					System.out.println("There are " + courseSet.size() + " course.");
		 *		}
		 *	}
		 *
		 *<-- TreeSet -->
		 *<-- TreeSet different with HashSet is becuase have SortedSet interface,
		 *	  can implement using SortedSet to sort value in ASCENDING ORDER, only can arrange and compare with same object type -->
		 *<-- packages -->
		 *import java.util.TreeSet;
		 *import java.util.SortedSet;
		 *<-- Syntax -->
		 *variable_name.first();							-->return first set element
		 *SortedSet >>> variable_name.headSet();
		 *variable_name.last();								-->return last set element
		 *SortedSet >>> variable_name.tailSet();
		 *
		 *  import java.util.TreeSet;
		 *	import java.util.Iterator;
		 *	import java.util.Scanner;
		 *	import java.util.SortedSet;
		 *	
		 *	public class hellotest {
		 *		public static void main(String[] args) {
		 *			TreeSet<Double> scores = new TreeSet<Double>();
		 *			Scanner input = new Scanner(System.in);
		 *			System.out.println("********* Student Result System *********");
		 *			for(int i =0; i < 5; i++) {
		 *				System.out.println("No: " + (i + 1) + " student's result : ");
		 *				double score = input.nextDouble();
		 *				
		 *				scores.add(Double.valueOf(score));
		 *			}
		 *			
		 *			Iterator<Double> it = scores.iterator();
		 *			System.out.println("Student result in ascending order: ");
		 *				while(it.hasNext()) {
		 *					System.out.print(it.next() + "\t");
		 *				}
		 *	 			System.out.println("\nPlease input searching result: ");
		 *				double searchScore = input.nextDouble();
		 *					if(scores.contains(searchScore)) {
		 *						System.out.println("The result's: " + searchScore + " student is exists! ");
		 *					}
		 *					else {
		 *						System.out.println("The result's: " + searchScore + " students is not exists.");
		 *					}
		 *					
		 *					SortedSet<Double> score1 = scores.headSet(60.0);
		 *					System.out.println("\nFailed results are: ");
		 *						for(int i = 0; i< score1.toArray().length; i++) {
		 *							System.out.print(score1.toArray()[i] + "\t");
		 *						}
		 *					SortedSet<Double> score2 = scores.tailSet(90.0);
		 *					System.out.println("\n90% and above score are: ");
		 *						for(int i = 0; i < score2.toArray().length; i++) {
		 *							System.out.print(score2.toArray()[i] + "\t");
		 *						}
		 *		}
		 *	}
		 *
		 * */
		/******** Java Iterator(Java è¿­ä»£å™¨) ********/
		/*
		 * <-- use iterator to loop through collection,such as ArrayList and HashSet, -->
		 * <-- packages -->
		 * import java.util.Iterator;
		 * import java.util.Collection;
		 * <-- Syntax -->
		 * Iterator<datatype> it(variable_name) = arrObj.iterator();
		 * variable_name.next(); 
		 * variable_name.hasNext();
		 * variable_name.remove();						-->remove targeted element
		 * variable_name.forEachRemaining()
		 * 
		 *  import java.util.HashSet;
		 *	import java.util.Iterator;
		 *	import java.util.Collection;
		 *	
		 *	public class hellotest {
		 *		public static void main(String[] args) {
		 *			Collection objs = new HashSet();
		 *			objs.add("Java");
		 *			objs.add("HTML");
		 *			objs.add("PHP");
		 *			
		 *			Iterator it= objs.iterator();
		 *				while(it.hasNext()) {
		 *					String obj = (String) it.next();
		 *					System.out.println(obj);
		 *						if(obj.contentEquals("HTML")) {
		 *							it.remove();
		 *						}
		 *						obj = "Python";
		 *				}
		 *				System.out.println(objs);
		 *		}
		 *	}
		 * */
		/******** Java Wrapper Classes(Java åŒ…è£…ç±»,è£…ç®±,æ‹†ç®±) ********/
		/*
		 * <-- use for working with objects declaration such as ArrayList -->
		 * <-- keywords -->
		 * Byte 											--> byte,byteValue()
		 * Short											--> short,shortValue()
		 * Integer 											--> int,intValue()
		 * Long												--> long,longValue()
		 * Float											--> float,floatValue()
		 * Double											--> double,doubleValue()
		 * Boolean											--> boolean,booleanValue()
		 * Character										--> char,charValue()
		 * toString()										--> convert objects to string(Integet to String)
		 * obj.equals(Object o)								--> equals to ( == )
		 * obj.getClass().getName()							--> return class name
		 * obj.getClass().getSuperClass().getName()			--> get parent class name
		 * obj.getClass().getInterfaces()[i]
		 * */
		/******** Java Exceptions (try...catch) ********/
		/*
		 * <-- use for debugging the program and troubleshoot errors for the code -->
		 * try {
		 * 	code need to try
		 * }
		 * catch(Exception e) {
		 * 	e.printStackTrace();				-->output exception type
		 * 	block of code to handel error(error message)
		 * }
		 * finally {
		 * 	code to execute after try...catch(message after error code) 
		 * }
		 * throw new (Exception type) ("text here");
		 * 
		 * <-- exception type -->
		 * ArithmeticException(Access denied,access granted)
		 * FileNotFoundException
		 * ArrayIndexOutOfBoundsException
		 * SecurityException
		 * 
		 * */
		/******** Java Regular Expression (Java æ­£åˆ™è¡¨è¾¾å¼�) ********/
		/*
		 * <-- can use to perform text search and text replace operations -->
		 * <-- packages -->
		 * import java.util.regex.*;
		 * import java.util.regex.Pattern;
		 * import java.util.regex.Matcher;
		 * import java.util.regex.PatternSyntaxException;
		 * 
		 *  import java.util.regex.Matcher;
		 *	import java.util.regex.Pattern;
		 *	
		 * <-- Range of expression to find(Pattern.compile("Expression",Flag) -->
		 * [abc]				--> find 1 character between bracket
		 * [^abc]				--> find 1 character not between bracket
		 * [0-9]				--> find 1 character from range 0 to 9
		 * |					--> fint a | b
		 * .					--> just one instance of any character
		 * ^					--> find a match beginning of a string as in : ^Hello
		 * $					--> find a match at the end of string as in : World$
		 * \d					--> find a digit
		 * \s					--> find a whitespace character
		 * \b					--> find a word like \bWORD or WORD\b
		 * \\uxxxx 				--> find the Unicode character with hexadecimal number xxxx
		 * n+,n*,n?,n{x},n{x,y},-->quantifiers define quantities to match
		 * n{x,}
		 * 
		 * 	public class hellotest {
		 *		public static void main(String[] args) {
		 *			Pattern pattern = Pattern.compile("patternTxt", Pattern.CASE_INSENSITIVE);			--> pattern need to find,pattern flag(CASE_INSENSITIVE,LITERAL,UNICODE_CASE)
		 *			Matcher matcher = pattern.matcher("Match the patternTxt.");							--> text need to match with pattern
		 *			boolean matchFound = matcher.find();												--> find through matcher
		 *				if(matchFound) {
		 *					System.out.println("Match found");											--> if true, throw code
		 *				}
		 *				else {
		 *					System.out.println("Match not found");										--> if false, throw code
		 *				}
		 *		}
		 *	}
		 * */
		/******** Java Threads (Java å¤šçº¿ç¨‹) ********/
		/*
		 * <-- Java é«˜çº§æ•™ç¨‹ -->
		 * <-- Thread life cycle -->
		 * 							æ–°å»ºçŠ¶æ€�
		 * 							   |
		 * 							   | ( execute start() )
		 * 							   |
		 * 							å°±ç»ªçŠ¶æ€� <--------------------------|
		 * 							   |	   						   |
		 * ç³»ç»Ÿè°ƒåº¦,èŽ·å�–CPUèµ„æº� --------> | ( execute run() )			é˜»å¡žçŠ¶æ€� <-----çº¿ç¨‹é˜»å¡ž,è®©å‡ºCPUèµ„æº�
		 * 							   |							   |	( execute sleep(),suspend(),wait() )
		 * 							è¿�è¡ŒçŠ¶æ€� >--------------------------|		 
		 * 							   |
		 * 							   | ( run() execute complete )
		 * 							   |
		 * 							æ­»äº¡çŠ¶æ€� <---- can use stop and destroy to terminate thread
		 * 
		 * <-- thread priority -->
		 * Range from 1 - 10
		 * Thread.MIN_PRIORITY(1) - Thread.NORM_PRIORITY(5) - 10 Thread.MAX_PRIORITY(10)
		 * 
		 * <-- Creating thread -->
		 * public class class_name implements Runnable {}
		 * public class class_name extends Thread {}
		 * public class class_name implements Callable {}
		 * 
		 * 
		 *  public class hellotest extends Thread {		--> class extends thread
		 *	public static int amount = 0;
		 *	
		 *	public static void main(String[] args) {
		 *		hellotest thread = new hellotest();		-->	create object
		 *		thread.start();							--> start thread
		 *		while(thread.isAlive()) {				--> check thread is still alive
		 *			System.out.println("Waiting...");
		 *		}
		 *		System.out.println("Main: " + amount);
		 *		amount++;
		 * 		System.out.println("Main: " + amount);
		 *	}
		 *	public void run() {
		 *		amount++;
		 *	}
		 *}
		 *
		 *
		 *<-- hellotest.java -->
		 *
		 *  public class hellotest extends Thread {
		 *	private int number; 
		 *	public hellotest(int number) {
		 *		this.number = number;
		 *	}
		 *	
		 *	public void run() {
		 *		int counter = 0;
		 *		int guess = 0;
		 *		do {
		 *			guess = (int) (Math.random() * 100 + 1);
		 *			System.out.println(this.getName() + " guesses " + guess);
		 *			counter++;
		 *		}while( guess != number);
		 *		System.out.println("** Correct! " + this.getName() + " in " + counter + " guesses.**");
		 *	}
		 *}
		 *
		 *<-- OtherClass.java -->
		 *  public class OtherClass implements Runnable {
		 *	private String message;
		 *	public OtherClass(String message) {
		 *		this.message = message;
		 *	}
		 *	
		 *	public void run() {
		 *		while(true) {
		 *			System.out.println(message);
		 *		}
		 *	}
		 *}
		 *
		 *<-- ThreadClass.java -->
		 *  public class ThreadClass {
		 *	public static void main(String[] args) {
		 *		Runnable hello = new OtherClass("Hello");
		 *		Thread thread1 = new Thread(hello);
		 *		thread1.setDaemon(true);
		 *		thread1.setName("hello");
		 *		System.out.println("Starting hello thread...");
		 *		
		 *		Runnable bye = new OtherClass("Goodbye");
		 *		Thread thread2 = new Thread(bye);
		 *		thread2.setPriority(Thread.MIN_PRIORITY);
		 *		thread2.setDaemon(true);
		 *		System.out.println("Starting goodbye thread...");
		 *		thread2.start();
		 *		
		 *		System.out.println("Starting thread3...");
		 *		Thread thread3 = new hellotest(27);
		 *		thread3.start();
		 *		try {
		 *			thread3.join();
		 *		}catch(InterruptedException e) {
		 *			System.out.println("Thread interrupted.");
		 *		}
		 *		
		 *		System.out.println("Starting thread4...");
		 *		Thread thread4 = new hellotest(75);
		 *		thread4.start();
		 *		System.out.println("main() is ending...");
		 *	}
		 *}
		 * */
		/******** Java Lambda Expression (Java Lambda è¡¨è¾¾å¼�(Java é—­åŒ…(Closure)) ********/
		/*
		 * <-- supported by amy languages, c++,c#,Java,Python,Javascript,use to shorten the time to write code -->
		 * <-- Syntax Lambda -->
		 * (parameter) -> {
		 * 				   Lambda code 
		 * 				}
		 * result = (int a,int b) -> {return a + b}; 
		 * 
		 *<-- OtherClass.java --> 
		 * public interface OtherClass {
		 *		int calculateInt(int a, int b);
		 *	}
		 *
		 *<-- hellotest.java -->
		 *  public class hellotest {
		 *	public static OtherClass calculate(char opr) {
		 *		OtherClass result;
		 *			if(opr == '+') {
		 *				result = (int a, int b) -> { 	-->Regular Expression (result = new OtherClass() {public int calculateInt(int a, int b) {
		 *					return a + b;											return a + b;
		 *				};															};
		 *			}
		 *			else {
		 *				result = (int a, int b) -> {	--> Regular Expression(result = new OtherClass() {public int calculateInt(int a, int b) {
		 *					return a - b;											return a - b;
		 *				};															};
		 *			}
		 *			return result;
		 *	}
		 *	
		 *	public static void main(String[] args) {
		 *		int n1 = 10;
		 *		int n2 = 5;
		 *		
		 *		OtherClass f1 = calculate('+');
		 *		OtherClass f2 = calculate('-');
		 *		System.out.println(n1 + " + " + n2 + " = " + f1.calculateInt(n1, n2));
		 *		System.out.println(n1 + " - " + n2 + " = " + f1.calculateInt(n1, n2));
		 *	}
		 *}
		 *
		 * */

/*import java.io.*;

public class hellotest {
	public static void main(String args[]) {
		try {
			byte[] bWrite = { 11, 21, 3, 40, 5 };
			OutputStream os = new FileOutputStream("D:\\Temp\\AOI+AXI\\newfile.bar");
				for(int x = 0; x < bWrite.length; x++) {
					os.write(bWrite[x]);
				}
				os.close();
				
				InputStream is = new FileInputStream("D:\\Temp\\AOI+AXI\\newfile.bar");
				int size = is.available();
					for(int i = 0; i < size; i++) {
						System.out.print((char) is.read() + " ");
					}
					is.close();
		}catch (IOException e) {
			System.out.print("Exception");
		}
	}
}*/

package learning.tutorialpoints;
import java.io.File;

public class hellotest {
	public static void main(String[] args) {
		File obj = new File("D:\\Temp\\AOI+AXI\\newfile.txt");
		if(obj.delete()) {
			System.out.println("Deleted file: " + obj);
		}
		else {
			System.out.println("Failed to delete file.");
		}
	}
}
	



	
