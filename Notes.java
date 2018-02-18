import java.util.*;

public class Notes {
    /*
    Java Program -> Byte Codes run by Comp with Jvm software
    Variables
    -NonStatic
    -Static
    -Local
    -Parameters

    Static Variables
    When a variable is declared with the keyword static,
    its called a class variable. All instances share the
    same copy of the variable.
    A class variable can be accessed directly with the class, without the need to create a instance.

    Instance Variable
    an instance variable is a variable defined in a class (i.e. a member variable ), for which each instantiated object of the class has a separate copy, or instance.

    Primitive Type
    (int,float, double ,long , char, short,byte,boolean)
    A primitive type is predefined by the language and is named by
    a reserved keyword.
    In addition to the eight primitive data types listed above, the
    Java programming language also provides special support for
    character strings via the java.lang.String class.

    Arrays
    int[] is declared as a variable of reference to an array (of int)

    Array list vs Arrays
    An array is basic functionality provided by Java.
    ArrayList is part of collection framework in Java.
    Therefore array members are accessed using [], while
    ArrayList has a set of methods to access elements and modify them.
    Array is a fixed size data structure while ArrayList is not.
    One need not to mention the size of Arraylist while creating
    its object. Even if we specify some initial capacity,
    we can add more elements.
    Array can contain both primitive data types as well as objects of
     a class depending on the definition of the array.
     However, ArrayList only supports object entries,
     not the primitive data types.

    Array List vs Linked List
    They all implement List interface.
    LinkedList is implemented as a double linked list. Its performance on add and remove is better than Arraylist, but worse on get and set methods.
    ArrayList is implemented as a resizable array.

    Static typing vs Dynamic Typing
    Static typed programming languages are those in which variables need not be defined before they’re used. This implies that static typing has to do with the explicit declaration (or initialization) of variables before they’re employed.
    Dynamic typed programming languages are those languages in which variables must necessarily be defined before they are used. This implies that dynamic typed languages do not require the explicit declaration of the variables before they’re used.

    Final 
	When u set an int to final it will only be able to be initialised once: 
	private final int Number=2;
	cannot change Number= 18(will not longer be able to change to another number eg:18)
	
	Generics
    Generics is a programming language design to use type as parameter. Detecting error at compile time rather than run time.
    We can define our own classes with generics type. A generic type is a class or interface that is parameterized over types. We use angle brackets (<>) to specify the type parameter.

    Object-oriented programming (OOP) is a programming language model organized around objects rather than "actions" and data rather than logic.
    In object-oriented programming, a class is an extensible program-code-template for creating objects, providing initial values for state (member variables) and implementations of behavior (member functions or methods).

    Constructors
    no-arg constructor Classname(){}-Always need one when you have a constructor , without any constructor automatically gets created
    constructor with unique inputs Classname(double newRadius){}

    Method Overloading vs Method
    Overloading occurs when two or more methods in one class have the same method name but different parameters.
    Overriding means having two methods with the same method name and parameters (i.e., method signature). One of the methods is in the parent class and the other is in the child class. Overriding allows a child class to provide a specific implementation of a method that is already provided its parent class.
    -Polymorphism applies to overriding, not to overloading
    -The real object type in the run-time, not the reference variable's type, determines which overridden method is used at runtime. In contrast, reference type determines which overloaded method will be used at compile time.
    -Overriding is a run-time concept while overloading is a compile-time concept.

    Inheritance (Extends from)
    Inheritance is when an object or class is based on another object (prototypal inheritance) or class (class-based inheritance), using the same implementation.
    In the relationship between two objects, a superclass is the name given to the class that is being inherited from.

    Constructor chaining
    Constructing an instance of a class invokes all the superclasses’ constructors along the inheritance chain

    Polymorphism
    Polymorphism is the ability of an object to take on many forms. The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.
    eg. Deer extends Animal implements Vegetarian
    Deer d = new Deer();
    Animal a=d
    Vegetarian v=d
    Object o =d;  --All refers to the same deer Object d.

    Binding
    Association of method definition to the method call is known as binding.

    Static Binding vs Dynamic Binding
    The binding which can be resolved at compile time by compiler is known as static or early binding. The binding of static, private and final methods is compile-time. Why? The reason is that the these method cannot be overridden and the type of the class is determined at the compile time. Overloading is a static binding.
    When compiler is not able to resolve the call/binding at compile time, such binding is known as Dynamic or late Binding. Method Overriding is a example of Dynamic binding.

    Casting
    Type casting in Java is to cast one type, a class or interface, into another type.
    Since Java is an Object oriented programming language and supports both Inheritance and Polymorphism, It’s easy that Super class reference variable is pointing to SubClass object but the catch here is that there is no way for Java compiler to know that a Superclass variable is pointing to SubClass object.
    you can not call a method which is declared in the subclass. In order to do that, you first need to cast the Object back into its original type.
    Object o=new Deer();
    Deer d=(deer) o; (Down casting to original type, so we can access the deer methods etc.)

    instanceof Operator (Test if the object is an instance of a class
    if(d instanceof Object) //true

    Access level modifiers determine whether other classes can use a particular field or invoke a particular method. There are two levels of access control:
        At the top level—public, or package-private (no explicit modifier).
        At the member level—public, private, protected, or package-private (no explicit modifier
    The protected modifier can be applied on data and methods in a class. A protected data or a protected method in a public class can be accessed by any class in the same package or its subclasses, even if the subclasses are in a different package

    public, in which case that class is visible to all classes everywhere.
    private modifier specifies that the member can only be accessed in its own class.
    protected modifier is similar to private buy also allows access by a subclass of its class in another package.

    MultiDimensional Arrays
    int [][]=new int[4][6];
    ArrayList<ArrayList<String>> array = new ArrayList<ArrayList<String>>();

    Abstract Class & Interface
    class Chicken extends GeometricObject implements Eatable{}

    Abstract Class
    Public abstract class GeometricObject{ <-Abstract class
        Public abstract double getArea(); <- Abstract method do not have to be present
        }
    -Cannot create instance of abstract class using the new operator
    -An abstract method is defined without implementation
    -Implementation provided by subclass
    -A class that contains abstract methods must be defined as an abstract class
    -Practical advantage of abstract class: generic programming

    Interface
    Interface is a class-like programming construct that contains only constants and abstract methods
    But its intent is to specify common behavior / characteristics of objects of related classes or unrelated classes, e.g., comparable, eatable, etc
    Public interface Eatable{
        public abstract String howToEat();
        }
    -In interface, since all data fields are public static final and all methods are public abstract
    -all methods specified must be declared in classes that implements the interface.

    Comparable Interface (allow sorting of objects, Compares itself with another object)
    -Classes that implement the comparable interface become comparable
    class extends GeometricObject implements Comparable<Circle>{ <--Comparable<Object> interface being implemented
        private double radius=1;
        public int compareTo(Circle c){         <-- compareTO(object o) method that must be present with Comparable interface
            if(this.radius>c.radius)            //Return 1 if this.radius>c.radius
                return1;
            else if(this.radius==c.radius)      //Return 0 if this.radius==c.radius
                return 0;
            else
                return -1;                      //Return -1 if this.radius<c.radius

    Comparator Interface( Compares two objects)
    public class EmpSortByName implements Comparator<Deer> {
	public int compare(Deer o1,Deer o2) {
        return o1.getName().compareTo(o2.getName());

    }
    -use Collection.sort(List,Comparator) - example (List,EmpSortByName)

    Comparable vs Comparator Interface
    Comparable<E>.compareTo() defines the “natural” ordering for E
    Comparator<E>.compare() defines additional, alternative ordering for E
    -allows Collections.sort(List)   [Comparable,compareTo] -use for single comparision
    vs
    -Collection.sort(List, Comparator) [Comparator,compare] -use for multiple comparaision

	Exceptions
	Checked exceptions− A checked exception is an exception that occurs at the compile time, 
	these are also called as compile time exceptions. These exceptions cannot simply be 
	ignored at the time of compilation, the programmer should take care of (handle) these exceptions.
	
	Unchecked exceptions− An unchecked exception is an exception that occurs at the time of execution. 
	These are also called as Runtime Exceptions. These include programming bugs, such as 
	array index out of bounds, or divide by zero. Runtime exceptions are ignored at the time of compilation. 
	
	Handling Exception locally through try and catch. Codes are placed in the try block and catch acts as exception handler
	
	Recursion
	Recursion in computer science is a method where the solution to a problem depends on solutions to smaller instances of the same problem
	•Base case – no recursion 
	•Divide and conquer – frame the problem in terms of the solution of a smaller, but identical sub-problem 
	•Complete the recursive invocation 
	
	Tail-recursive functions
	The significance of tail recursion is that when making a tail-recursive call, the caller's return position need not be saved on the call stack; when the recursive call returns, it will branch directly on the previously saved return position. Therefore, in languages that recognize this property of tail calls, tail recursion saves both space and time.

	Design pattern=========================================================================================
	-Creational
	-Structural
	-Behavioral
	
	Singleton
	Observer & Subject
	visit & visitable (eg.tax & car)
	abstract factory**
	proxy pattern
	flyweight pattern
	state pattern
	
	Data Structure=========================================================================================
	stack qeue etc 
	
	enumeration
	for(tuna people:EnumSet.range(tuna.kelsey, tuna.candy)
	
	public enum tuna {
		kelsey(10,1);
		candy(2,22);
		tuna(int i,intj){};
	}
	
	Vector 
	vector<integer> j=new  vector<>();
	j.capacity();
    */
    private static int a=0;
    public String j="234r";


    public static void main(String[] args) {
        String output="";

        // Integers====================================================================== =================================================================
        int i=0;
        i=Integer.MAX_VALUE; //2^31-1
        i=Integer.MIN_VALUE; //-2^31

        Integer.compare(1,2);
        Integer.toString(1);

        Integer.bitCount(7); //  return the number of one bits in the two's complement
        Integer.toBinaryString(2);
        Integer.toOctalString(8);// base8
        Integer.toHexString(16);

        // Float & Double =================================================================
        float f=3.0f;
        double d=3.000d;

        f=Float.MAX_VALUE;
        f=Float.MIN_VALUE;
        i=(int) f;

        // Character =================================================================
        char c='c';
        char c_1=99; // int Value Follows the ASCII Table eg. 99 is 'c' (DownCasting to switch)
        i=Character.getNumericValue('z');// return int for 0-9, [A|a to Z|z]as [10 to 35]

        c=Character.toUpperCase('c');
        i=Character.toUpperCase(99);    //99 is ACSII of 'c'
        c=Character.toLowerCase('C');
        i=Character.toLowerCase(67);    //67 is ACSII of 'C'

        boolean b;
        b=Character.isLetter('c');
        b=Character.isDigit('1');
        b=Character.isLetterOrDigit('c');
        b=Character.isWhitespace(' ');

        //String =================================================================
        String s="aaabcdefg"+"h";

        char[] ch=s.toCharArray();
        String s_1=new String(ch); // does not reference to ch array anymore
        s_1= String.valueOf(ch);

        c=s.charAt(1);
        i=s.indexOf("s"); //return the first occurrence of index position of the char or int specified //return -1 if not found
        i=s.lastIndexOf("s"); //return the last occurrence .. return -1 if not found   **Becareful of -1
        s=s.replace('a','b');       //replace single Char
        s=s.replaceAll("bbb","a");  //replace regular expressions||Strings

        //Array ================================================================= =================================================================
        int[] anArray= new int[10];
        int[] anArray_1=new int[]{1,2,34,4}; //faster way
        anArray[0]=1;
        anArray[1]=2;

        Arrays.sort(anArray);   //Sorting by reverse order for primitive types (*-1) then Sort then (*-1)
                                //Arrays.sort(anArray, Collections.reverseOrder()); only works with objects array.
        s=Arrays.toString(anArray_1);
        i=anArray.length;

        //Array List =================================================================
        ArrayList<Integer> anArrayList=new ArrayList<>(); //Creates an Empty ArrayList
        ArrayList<Integer> anArrayList_1=new ArrayList<Integer>();
        ArrayList anArrayList_2=new ArrayList();
        anArrayList.add(0);
        anArrayList.add(2);
        anArrayList.add(1);
        anArrayList.add(1,1); //creates [0,1,2,3]
        Collections.addAll(anArrayList_2, "a1", "str", "mystr");

		anArrayList.set(2,0);//changing index pos 2 to 0
        i=anArrayList.size();	//get the size of the array
        anArrayList.remove(new Integer(1));//can remove strings
        anArrayList.remove(0);
        anArrayList_2.clear(); // remove all elements
        i=anArrayList.get(1);// return the element at the specified position
        anArrayList.clone(); //Creates a shallow Copy
		
		for (String temp : list) {		//for loop in Array List
			System.out.println(temp);
		}


        Object[] i_arraylist=anArrayList.toArray(); //only can convert to Object Array
        //--- to convert Array List to int array-----------
        int[] arr = new int[anArrayList.size()];

        for(int j = 0; j < anArrayList.size(); j++) {
            if (anArrayList.get(j) != null) {
                arr[j] = anArrayList.get(j);
            }
        }
        //-------------------------------------------
         //Iterator
        Iterator iter=anArrayList.iterator();
        while(iter.hasNext()){                      //return true if it has more element
            String obj=(iter.next()).toString();    //return the nextElement
            iter.remove();                          //remove the underlying collection previously return element
            System.out.println(obj);
        }

        //Linked List =================================================================
        LinkedList<String> aLinkedList=new LinkedList<String>();
        Collections.addAll(aLinkedList, "a1", "str", "mystr");

        //HashMap ================================================================= =================================================================
        HashMap<String, Integer> dict= new HashMap<String,Integer>();
        dict.put("A",1); // (key,value)
        dict.get("A");   //  (key) return Value
        dict.keySet();   //return an Set of keys.
        dict.values();   //return a Collection of values
        dict.size();
        dict.clear();
        dict.containsKey("A");
        dict.containsValue(1);
        dict.isEmpty(); //return true if the map has no key-value mapping
        Iterator<String> keysetIterator = dict.keySet().iterator();

        //Regular Expression ========================================================== ================================================================
        /*		2 to 20 characters in length
		[A-za-z]{2,20} or \\w{2,20

		\\s is space ....  [A-Za-z].. all words ... \\w... any character
		\\s{A-Za-z]{2,20}\\s

		\\d ... digits or number
		\\D.... not digits or number
		{5}... 5 times
		{5,}... min 5 times and nor max
		+... any amount that precedes 1{+ will find 1, 11 , 111 ....
		//.^*+?{}[]\|()... if its one if this character you need to \\ to escape. eg.\\{{1}
		A[KLRZ]|C[AOT] ....  A[will find K,..Z] or C[A,..T]

		Regular Expressions
		https://www.youtube.com/watch?v=s_PfopWcMwI&t=635s
		*/

        //Scanner -Reading inputs from screen
        Scanner reader = new Scanner(System.in);
        double a = reader.nextDouble();

        output=Arrays.toString(anArrayList.toArray());

        //output=Integer.toString(i);
        //System.out.println(i);
        System.out.println(output);
		
		//Exception=================================================================================================
		//try and catch locally to handle exception.-----------------------------------------------------------
		try{               
		File file = new File("e:\\ubunturef.pdf");              
		FileReader fr= new FileReader(file);
		} 
		catch (FileNotFoundException ex) {
		System.out.println("In exception handler.");
		System.out.println(ex);}
		finally{
			System.out.println("In Finally");
			}
		
		//try and catch block in parent. child method throws exception allow parent method to handle it.--------
		/* This throws exception in a different class. Need to do a try and catch and call the following method
		•we don't know how to deal with an error within the method that can generate it 
		•In this case we will pass the buck to the method that called us 
		
		public static void checkEx() throws FileNotFoundException{   
		File file = new File("e:\\ubunturef.pdf");          
		FileReader fr= new FileReader(file);
		*/
		
		//User Defined exception--------------------------------------------------------------------------------
		public class Account{	
			public void withdraw(double amount)  throws ExceedLimitException{ //throw vs throws
				if(amount <= balance) {
					balance -= amount; 
				} else {
					double needs = amount – balance;
					throw new ExceedLimitException(needs); //create user defined exception object
				}
			}
		}
		public class ExceedLimitException extends Exception {
			private double amount; 
			public ExceedLimitException(double amount) {
				this.amount = amount;
			}    
			public double getAmount() {
				return amount;
			}
		}
		//Junit Testing
		public class TestFindSmaller extends TestCase { 
		// constructor 
		public TestFindSmaller (String name) { super(name); } 
		
		@org.junit.Test 
		public void testFindingSmaller () {
			FindSmaller f = new FindSmaller();
			int[] a = {1, 2, 7, 6, 2}; 
			assertEquals("Failed Assertion for FindX", 3, f.findSmaller(4,a));
			assertEquals("Failed Assertion for FindX", 5, f.findSmaller(8,a));
			assertEquals("Failed Assertion for FindX", 0, f.findSmaller(-1,a)); } 
			// method create a test suite 
			public static Test suite() { return new TestSuite(TestFindSmaller.class);} 
			// the main method 
			public static void main(String args[]) {         
			junit.textui.TestRunner.run(suite());
			} 
		}
    }
}
