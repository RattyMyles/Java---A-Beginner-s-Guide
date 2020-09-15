/*
    Author: RattyMyles
    Chapter 1 Fundamentals of Java - A Beginner's Guide 6th Edition.
    The purpose of this project will breakdown each line of code and help fellow students and readers.
    This project will demonstrate how to output strings and variables.
    Any feedback or comments, please email my address as m.pucknell@gmail.com.

*/

public class Example1 {

    // A Java program begins with a call to main()
    // The public is a type of Access Specifier in java, can be accessed by any class
    // static keyword in Java is used for memory management 
    // main() method is always static because jvm will consider it is a starting point to start program execution.
    // The void means that it would not return a value
    // String args[] declares a variable with the data type of a string


    public static void main(String args[])

    // "System" is a predefined class that provides access to the system
    // "out" is the output stream that is connected to the console

    {
        int VariableOne; // This declares a variable with the data type "int" which is an integer(Number)
        int VariableTwo; // This also declares another variable with the same data type

        VariableOne = 1000; // You can also assign a value before the main() program starts. The value is 1000.

        System.out.println("Hello world!"); // This is a simple string that will output "Hello world!"

        System.out.println("VariableOne contains:" + VariableOne); // As you can see a variable does not need quotation marks.

        System.out.println(VariableOne); // this will only output VariableOne value

        VariableTwo = VariableOne / 10; // Variable will contain the value of VariableOne that is divided by 10.

        System.out.println("VariableTwo contains:" + VariableTwo); // this will output a string and the VariableOne value.



    }
}


