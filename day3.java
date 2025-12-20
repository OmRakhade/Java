// Variables 
// variable is container that holds a value while the java program is executed, the variable is assigned with the datatype, it is name of reserved area locate in memory or name of memory location.
// variable is combination or "vary"+"able" which means its value can change.
// Type of variables: local, instance, static variable
// Local variable declared inside a body of the method, you can use this within a method and other methods arent aware of this variable.

class day3{
public static void main(String [] args){
    int test = 10;

    System.out.println(test);
    student s1 = new student();
    System.out.println(s1.name+" "+s1.age);
    student s2 = new student();
    s2.age = 30;
    System.out.println(s2.age);
    System.out.println(s1.age);

    department d1 = new department();
    System.out.println(d1.name+" "+d1.scount);
    department d2 = new department();
    d2.name = "cs";
    System.out.println(d2.name);
    System.out.println(d1.name);
}
}

//Instance variable
// instance variable declare inside a class but outside the method, is called as instance variable, it is not declared as static.
// it is called as instance variable beacuse its value is instance specific and not shared among the instances.

class student {
    int age = 20;
    String name = "Om";
}


// Static Variable
//A variable that is declared as static is called a static variableda. It cannot be local. You can create a single copy of the static variable and share it among all the instances of the class. Memory allocation for static variables happens only once when the class is loaded in the memory.

class department {
    static String name = "information technology";
    int scount = 40;
}