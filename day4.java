public class day4 {
    public static void main(String[] args) {
        // double d = 0.1 + 0.2;
        // System.out.println(d);
        // System.out.println(d == 0.3);
        // ans = false beacuse the value of d is 0.30000000000000004

        // byte b = 127;
        // b++;
        // System.out.println(b);
        // ans :- -128

        // float f = 3.14;
        // ans :- error: incompatible types: possible lossy conversion from double to
        // float

        // int x;
        // System.out.println(x);
        // ans :- error: variable x might not have been initialized

        // test t = new test();
        // t.show();
        // ans :- 0, beacuse the instance variable can be uninitalized and deafult value
        // of int variable is 0.

        // char c = 65;
        // System.out.println(c);
        // ans :- A, beacuse the 65 is unicode value and its conversion is A.

        // boolean b = 1;
        // ans :- error: incompatible types: int cannot be converted to boolean

        // Integer a = 128;
        // Integer b = 128;

        // System.out.println(a == b);
        // ans :- false
        // == checks the memory value and equals() checks the values of variables.

    }
}

class test {
    int x;

    public void show() {
        System.out.println(x);
    }
}