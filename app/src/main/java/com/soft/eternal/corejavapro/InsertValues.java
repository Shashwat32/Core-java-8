package com.soft.eternal.corejavapro;

/**
 * Created by singhsha on 7/14/2016.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class InsertValues {


    SQLiteDatabase db ;
    DBActivity dbActivity;
    public void databaseSetup(Context context){
        dbActivity = new DBActivity(context);
        db= dbActivity.getWritableDatabase();
        dbActivity.onDrop(db);
        Table temp = new Table();
        temp.setID("1");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("public class Ocjp{\n" +
                "\tpublic static void main(String[ ] args){\n" +
                "\t\tint m = Integer.parseInt(args[2]);\n" +
                "\t\tSystem.out.println(args[m]);\n" +
                "\t} \n" +
                "} \n\n" +
                "What will be the output using the following command line :- \n\n" +
                "java Ocjp 1 2 3");

        temp.setOPT_ONE("Throw ArrayIndexOutOfBoundsException.");
        temp.setOPT_TWO("Throw RuntimeException.");
        temp.setOPT_THREE("Print 1");
        temp.setOPT_FOUR("Print 2");
        temp.setOPT_FIVE("Print 3");
        temp.setOPT_SIX("None of the above");
        temp.setNo_Opt("6");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("1. args[0] is 1 , args[1] is 2, args[2] is 3\n" +
                "2. int m = Integer.parseInt(args[2]);\n" +
                "i.e m = 3\n" +
                "3. System.out.println(args[m]);\n" +
                "i.e  System.out.println(args[3]);\n" +
                "4. Because array indexing start from 0 , so there is no args[3].So, it will throw ArrayIndexOutOfBoundsException.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("2");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("public class Ocjp{\n" +
                "\tpublic static void main( String[ ] args){\n" +
                "\t\ttry{\n" +
                "\t\t\tint m = Integer.parseInt( args[0] );\n" +
                "\t\t}\n" +
                "\t\tcatch(NumberFormatException e){\n" +
                "\t\t\tSystem.out.println(\"Number Format Exception as \" + m +\" is String.\" );\n" +
                "\t\t}\n" +
                "\t}\n" +
                "}\n\n" +
                "What will be the output using the following command line :-\n\n" +
                "java Ocjp zero");

        temp.setOPT_ONE("Print Number Format Exception as zero is String.");
        temp.setOPT_TWO("Print Number Format Exception as 0 is String.");
        temp.setOPT_THREE("It will not print anything.");
        temp.setOPT_FOUR("It will not compile.");
        temp.setOPT_FIVE("It will throw RuntimeException.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("2");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("It will not even compile as m is defined in try block , which is in case local with only try block. So, catch block can not access m.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("3");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Give:\n\n" +
                "public class Test {\n" +
                "}\n\n" +
                "Which two packages are automatically imported into the java source file by the java compiler?");

        temp.setOPT_ONE("Java.lang");
        temp.setOPT_TWO("Java.awt");
        temp.setOPT_THREE("Javax.net");
        temp.setOPT_FOUR("Java.*");
        temp.setOPT_FIVE("The package with no name");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("2");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("A E");
        temp.setEXPLANATION("For convenience, the Java compiler automatically imports three entire packages for each source " +
                "file: (1) the package with no name, (2) the java.lang package, and (3) the current package (the package for the " +
                "current file).");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("4");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Consider the below code :-\n\n" +
                "public class Ocjp {\n" +
                "//// INSERT CODE HERE\n" +
                "{\n" +
                "\tSystem.out.println(\"Hello World\");\n" +
                "}\n" +
                "}\n\n" +
                "Select the following options, when inserted at ////INSERT CODE HERE, will print Hello World ?");

        temp.setOPT_ONE("public void main (String args[ ])");
        temp.setOPT_TWO("public void main (String[ ] args)");
        temp.setOPT_THREE("public static void main (String args)");
        temp.setOPT_FOUR("static public void main (String[ ] args)");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("1. static is required for main method.\n" +
                "2. main method accepts array of String.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("5");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Consider the following class Ocjp,\n\n" +
                "package com.oracle.exp;\n" +
                "class Ocjp {\n" +
                "\tpublic int no;\n" +
                "}\n\n" +
                "What will be the output of the following code ?\n\n" +
                "package com.oracle;\n" +
                "import com.oracle.exp.Ocjp;\n" +
                "class Oracle {\n" +
                "\tpublic static void main(String args[ ]) {\n" +
                "\t\tOcjp m = new Ocjp();\n" +
                "\t\tm.no = 7;\n" +
                "\t\tSystem.out.println(m.no);\n" +
                "\t}\n" +
                "}");

        temp.setOPT_ONE("It will not even compile.");
        temp.setOPT_TWO("It will print 7.");
        temp.setOPT_THREE("It will throw RuntimeException.");
        temp.setOPT_FOUR("It will print null.");
        temp.setOPT_FIVE("It will print seven.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("It will not even compile as a non-public class Ocjp is inaccessible outside a package in which it is defined.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("6");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Complete the following sentence,\n\n" +
                "Instance member ___\n\n" +
                "Select two options");

        temp.setOPT_ONE("belongs to an instance of the class.");
        temp.setOPT_TWO("is a variable.");
        temp.setOPT_THREE("can be a variable, a constant or a method.");
        temp.setOPT_FOUR("is same as a local variable.");
        temp.setOPT_FIVE("is a constant.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("A C");
        temp.setEXPLANATION("Instance member can be a variable, a constant or a method.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);









        temp.setID("7");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Consider the below classes :\n\n" +
                "class A{\n" +
                "\tpublic A(){ }\n" +
                "\tpublic A(int m) {   System.out.println(m);    }\n" +
                "}\n\n" +
                "class B{\n" +
                "\tstatic A s1 = new A(1);\n" +
                "\tA a = new A(2);\n" +
                "\tpublic static void main(String[ ] args){\n" +
                "\t\tB b = new B();\n" +
                "\t\tA a = new A(3);\n" +
                "\t}\n" +
                "\tstatic A s2 = new A(4);\n" +
                "}\n\n" +
                "What will be the output when B is run ?");

        temp.setOPT_ONE("1, 2, 3, 4");
        temp.setOPT_TWO("3, 2, 1, 4");
        temp.setOPT_THREE("1, 4, 2, 3");
        temp.setOPT_FOUR("2, 1, 4, 3");
        temp.setOPT_FIVE("1, 4, 3, 2");
        temp.setOPT_SIX("2, 3, 4, 1");
        temp.setNo_Opt("6");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("2");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Order of initialization of a class:(If same order level, then the order is in which they appear.)\n" +
                "1. All static variables, constants and blocks.\n" +
                "2. All non static variables, constants and blocks.\n" +
                "3. Constructor.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("8");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the code fragment:\n\n" +
                "int [ ] [ ] array2D = {{0, 1, 2}, {3, 4, 5, 6}};\n" +
                "System.out.print (array2D[0].length + \"\" );\n" +
                "System.out.print(array2D[1].getClass(). isArray() + \"\");\n" +
                "System.out.println (array2D[0][1]);\n" +
                "What is the result?");

        temp.setOPT_ONE("3false1");
        temp.setOPT_TWO("2true3");
        temp.setOPT_THREE("2false3");
        temp.setOPT_FOUR("3true1");
        temp.setOPT_FIVE("3false3");
        temp.setOPT_SIX("2true1");
        temp.setNo_Opt("6");
        temp.setCHAPTER("4");   // 4 : Arrays
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("1.The length of the element with index 0, {0, 1, 2}, is 3. Output: 3\n" +
                "2.The element with index 1, {3, 4, 5,6}, is of type array. Output: true\n" +
                "3.The element with index 0, {0, 1, 2} has the element with index 1: 1. Output: 1");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("9");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("View the exhibit:\n" +
                "public class Student {\n" +
                "\tpublic String name = \"\";\n" +
                "\tpublic int age = 0;\n" +
                "\tpublic String major = \"Undeclared\";\n" +
                "\tpublic boolean fulltime = true;\n" +
                "\tpublic void display() {\n" +
                "\tSystem.out.println(\"Name: \" + name + \" Major: \" + major); }\n" +
                "\tpublic boolean isFullTime() {\n" +
                "\t\treturn fulltime;\n" +
                "\t}\n" +
                "}\n\n" +
                "public class TestStudent {\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tStudent bob = new Student ();\n" +
                "\t\tStudent jian = new Student();\n" +
                "\t\tbob.name = \"Bob\";\n" +
                "\t\tbob.age = 19;\n" +
                "\t\tjian = bob;\n" +
                "\t\tjian.name = \"Jian\";\n" +
                "\t\tSystem.out.println(\"Bob's Name: \" + bob.name);\n" +
                "\t}\n" +
                "}\n\n" +
                "What is the result when this program is executed?");

        temp.setOPT_ONE("Bob's Name: Bob");
        temp.setOPT_TWO("Bob's Name: Jian");
        temp.setOPT_THREE("Nothing prints");
        temp.setOPT_FOUR("Bob's name");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("2");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("After the statement jian = bob; the jian will reference the same object as bob.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("10");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the code fragment:\n\n" +
                "String valid = \"true\";\n" +
                "if (valid)\n" +
                "{\n" +
                "\tSystem.out.println (\"valid\");\n" +
                "}\n" +
                "else\n" +
                "{\n" +
                "\tSystem.out.println (\"not valid\");\n" +
                "}\n\n" +
                "What is the result?");

        temp.setOPT_ONE("Valid");
        temp.setOPT_TWO("not valid");
        temp.setOPT_THREE("Compilation fails");
        temp.setOPT_FOUR("An IllegalArgumentException is thrown at run time");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");   // 2 : Data types
        temp.setDIFFICULTY("2");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("In segment 'if (valid)' valid must be of type boolean, but it is a string.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("11");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "public class ScopeTest{\n" +
                "\tint z;\n" +
                "\tpublic static void main(String[ ] args){\n" +
                "\t\tScopeTest myScope = new ScopeTest();\n" +
                "\t\tint z = 6;\n" +
                "\t\tSystem.out.println(z);\n" +
                "\t\tmyScope.doStuff();\n" +
                "\t\tSystem.out.println(z);\n" +
                "\t\tSystem.out.println(myScope.z);\n" +
                "\t}\n" +
                "\tvoid doStuff() {\n" +
                "\t\tint z = 5;\n" +
                "\t\tdoStuff2();\n" +
                "\t\tSystem.out.println(z);\n" +
                "\t}\n" +
                "\tvoid doStuff2(){\n" +
                "\t\tz = 4;\n" +
                "\t}\n" +
                "}\n\n" +
                "What is the result?");

        temp.setOPT_ONE("6 5 6 4");
        temp.setOPT_TWO("6 5 5 4");
        temp.setOPT_THREE("6 5 6 6");
        temp.setOPT_FOUR("6 5 6 5");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("2");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("1.Within main z is assigned 6. z is printed. Output: 6\n" +
                "2.Within doStuff z is assigned 5.DoStuff2 locally sets z to 4 (but MyScope.z is set to 4), but in Dostuff z is still 5. z is printed. Output: 5\n" +
                "3.Again z is printed within main (with local z set to 6). Output: 6\n" +
                "4.Finally MyScope.z is printed. MyScope.z has been set to 4 within doStuff2(). Output: 4");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);







        temp.setID("12");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("An unchecked exception occurs in a method dosomething()\n" +
                "Should other code be added in the dosomething() method for it to compile and execute?");
        temp.setOPT_ONE("The Exception must be caught");
        temp.setOPT_TWO("The Exception must be declared to be thrown.");
        temp.setOPT_THREE("The Exception must be caught or declared to be thrown.");
        temp.setOPT_FOUR("No other code needs to be added.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");   // 8 : Handling Exceptions
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Because the Java programming language does not require methods to catch or to specify" +
                " unchecked exceptions (RuntimeException, Error, and their subclasses), programmers may be tempted to write" +
                " code that throws only unchecked exceptions or to make all their exception subclasses inherit from" +
                " RuntimeException. Both of these shortcuts allow programmers to write code without bothering with compiler" +
                " errors and without bothering to specify or to catch any exceptions. Although this may seem convenient to the" +
                " programmer, it sidesteps the intent of the catch or specify requirement and can cause problems for others" +
                " using your classes.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("13");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the code fragment:\n\n" +
                "int b = 4;\n" +
                "b - - ;\n" +
                "System.out.println (- - b);\n" +
                "System.out.println(b);\n\n" +
                "What is the result?");
        temp.setOPT_ONE("2 2");
        temp.setOPT_TWO("1 2");
        temp.setOPT_THREE("3 2");
        temp.setOPT_FOUR("3 3");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("3");   // 3 : Operators
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("Variable b is set to 4.\n" +
                "Variable b is decreased to 3.\n" +
                "Variable b is decreased to 2 and then printed. Output: 2 Variable b is printed. Output: 2");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("14");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the code fragment:\n\n" +
                "interface SampleClosables{\n" +
                "\tpublic void close () throws java.io.IOException;\n" +
                "}\n\n" +
                "Which three implementations are valid?");
        temp.setOPT_ONE("public class Test implements SampleCloseable {\n" +
                "public void close() throws java.io.IOException {\n" +
                "// do something\n" +
                "}\n" +
                "}");
        temp.setOPT_TWO("public class Test implements SampleCloseable {\n" +
                "public void close() throws Exception {\n" +
                "// do something\n" +
                "}\n" +
                "}");
        temp.setOPT_THREE("public class Test implements SampleCloseable {\n" +
                "public void close() throws java.io.FileNotFoundException {\n" +
                "// do something\n" +
                "}\n" +
                "}");
        temp.setOPT_FOUR("public class Test extends SampleCloseable {\n" +
                "public void close() throws java.IO.IOException {\n" +
                "// do something\n" +
                "}\n" +
                "}");
        temp.setOPT_FIVE("public class Test implements SampleCloseable {\n" +
                "public void close()\n" +
                "// do something\n" +
                "}\n" +
                "}");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("8");   // 8 : Handling Exceptions
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("A C E");
        temp.setEXPLANATION("A: Throwing the same exception is fine.\n" +
                "C: Using a subclass of java.io.IOException (here java.io.FileNotFoundException) is fine\n" +
                "E: Not using a throw clause is fine.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("15");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the code fragment:\n\n" +
                "int [ ] [ ] array = {{0}, {0, 1}, {0, 2, 4}, {0, 3, 6, 9}, {0, 4, 8, 12, 16}};\n" +
                "System.out.println(array [4][1]);\n" +
                "System.out.println (array [1][4]);\n" +
                "What is the result ?");
        temp.setOPT_ONE("4 Null");
        temp.setOPT_TWO("Null 4");
        temp.setOPT_THREE("An IllegalArgumentException is thrown at run time");
        temp.setOPT_FOUR("4 An ArrayIndexOutOfBoundException is thrown at run time");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("4");   // 4 : Arrays
        temp.setDIFFICULTY("2");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("The first println statement, System.out.println(array [4][1]);, works fine. It selects the element/array" +
                " with index 4, {0, 4, 8, 12, 16}, and from this array it selects the element with index 1,4. Output: 4\n" +
                "The second println statement, System.out.println(array [1][4]);, fails. It selects the array/element with index 1," +
                " {0, 1}, and from this array it try to select the element with index 4. This causes an exception." +
                " Output:Exception in thread \"main\" java.lang.ArrayIndexOutOfBoundsException: 4");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("16");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "public class DoCompare {\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tString[ ] table = {\"aa\", \"bb\", \"cc\"};\n" +
                "\t\tfor (String ss: table) {\n" +
                "\t\t\tint ii = 0;\n" +
                "\t\t\twhile (ii < table.length) {\n" +
                "\t\t\t\tSystem.out.println(ss + \", \" + ii);\n" +
                "\t\t\t\tii++;\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\t}\n" +
                "}\n\n" +
                "How many times is 2 printed as a part of the output?");
        temp.setOPT_ONE("Zero");
        temp.setOPT_TWO("Once");
        temp.setOPT_THREE("Twice");
        temp.setOPT_FOUR("Thrice");
        temp.setOPT_FIVE("Compilation fails.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("5");   // 5 : Loop
        temp.setDIFFICULTY("2");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("The for statement, for (String ss: table), is executed one time for each of the three elements in" +
                "table. The while loop will print a 2 once for each element.\n" +
                "Output:\n" +
                "aa, 0\n" +
                "aa, 1\n" +
                "aa, 2\n" +
                "bb, 0\n" +
                "bb, 1\n" +
                "bb, 2\n" +
                "cc, 0\n" +
                "cc, 1\n" +
                "cc, 2");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("17");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "import java.io.IOException;\n" +
                "public class Y{\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\ttry {\n" +
                "\t\t\tdoSomething();\n" +
                "\t\t}\n" +
                "\t\tcatch (RuntimeException e) {\n" +
                "\t\t\tSystem.out.println(e);\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\tstatic void doSomething(){\n" +
                "\t\tif (Math.random() > 0.5){\n" +
                "\t\t\tthrow new IOException();\n" +
                "\t\t}\n" +
                "\t\tthrow new RuntimeException();\n" +
                "\t}\n" +
                "}\n\n" +
                "Which two actions, used independently, will permit this class to compile?");
        temp.setOPT_ONE("Adding throws IOException to the main() method signature");
        temp.setOPT_TWO("Adding throws IOException to the doSomething() method signature");
        temp.setOPT_THREE("Adding throws IOException to the main() method signature and to the doSomething() method");
        temp.setOPT_FOUR("Adding throws IOException to the doSomething() method signature and changing the catch argument to IOException");
        temp.setOPT_FIVE("Adding throws IOException to the main() method signature and changing the catch argument to IOException");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("8");   // 8 : Handling Exception
        temp.setDIFFICULTY("2");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("C D");
        temp.setEXPLANATION("The IOException must be caught or be declared to be thrown. We must add a throws exception to" +
                " the doSomething () method signature (static void doSomething() throws IOException).\n" +
                "Then we can either add the same throws IOException to the main method (public static void main(String[ ] args)" +
                " throws IOException), or change the catch statement in main to IOException.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("18");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "class X {\n" +
                "\tString str = \"default\";\n" +
                "\tX(String s) {\n" +
                "\t\tstr = s;\n" +
                "\t}\n" +
                "\tvoid print () {\n" +
                "\t\tSystem.out.println(str);\n" +
                "\t}\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tnew X(\"hello\").print();\n" +
                "\t}\n" +
                "}\n" +
                "What is the result?");
        temp.setOPT_ONE("hello");
        temp.setOPT_TWO("default");
        temp.setOPT_THREE("Compilation fails");
        temp.setOPT_FOUR("The program prints nothing");
        temp.setOPT_FIVE("An exception is thrown at run time");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("6");   // 6 : Constructor
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("The program compiles & runs fine.The output is: hello");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("19");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "public class SampleClass\n" +
                "{\n" +
                "\tpublic static void main(String[ ] args)\n" +
                "\t{\n" +
                "\t\tAnotherSampleClass asc = new AnotherSampleClass();\n" +
                "\t\tSampleClass sc = new SampleClass();\n" +
                "\t\t// INSERT CODE HERE\n" +
                "\t}\n" +
                "}\n\n" +
                "class AnotherSampleClass extends SampleClass\n" +
                "{\n" +
                "}\n\n" +
                "Which statement, when inserted into line //INSERT CODE HERE, is valid change?");
        temp.setOPT_ONE("asc = sc;");
        temp.setOPT_TWO("sc = asc;");
        temp.setOPT_THREE("asc = (object) sc;");
        temp.setOPT_FOUR("asc = sc.clone ()");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("7");   // 7 : Inheritance
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("sc = asc; Works Fine.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("20");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the code fragment:\n\n" +
                "System.out.println(\"Result: \" + 2 + 3 + 5);\n" +
                "System.out.println(\"Result: \" + 2 + 3 * 5);\n\n" +
                "What is the result?");
        temp.setOPT_ONE("Result: 10\n" +
                "Result: 30");
        temp.setOPT_TWO("Result: 10\n" +
                "Result: 25");
        temp.setOPT_THREE("Result: 235\n" +
                "Result: 215");
        temp.setOPT_FOUR("Result: 215\n" +
                "Result: 215");
        temp.setOPT_FIVE("Compilation fails");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("3");   // 3 : Operators
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("First line:\n" +
                "System.out.println(\"Result: \" + 2 + 3 + 5);\n" +
                "String concatenation is produced.\n" +
                "Second line:\n" +
                "System.out.println(\"Result: \" + 2 + 3 * 5);\n" +
                "3*5 is calculated to 15 and is appended to string 2. Result 215.\n" +
                "The output is:\n" +
                "Result: 235\n" +
                "Result: 215");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("21");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which code fragment is illegal?");
        temp.setOPT_ONE("class Base1 {\n" +
                "abstract class Abs1 { }}");
        temp.setOPT_TWO("abstract class Abs1 {\n" +
                "void doit () { }}");
        temp.setOPT_THREE("class Basel {\n" +
                "abstract class Abs1 extends Basel {");
        temp.setOPT_FOUR("abstract int var1 = 89;");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");   // 2 : Data Types
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("The abstract keyword cannot be used to declare an int variable." +
                "The abstract keyword is used to declare a class or method to be abstract[3]. An abstract method has no " +
                "implementation; all classes containing abstract methods must themselves be abstract, although not all abstract " +
                "classes have abstract methods.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("22");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the code fragment:\n\n" +
                "int a = 0;\n" +
                "a++;\n" +
                "System.out.println(a++);\n" +
                "System.out.println(a);\n\n" +
                "What is the result?");
        temp.setOPT_ONE("1\n" +
                "2");
        temp.setOPT_TWO("0\n" +
                "1");
        temp.setOPT_THREE("1\n" +
                "1");
        temp.setOPT_FOUR("2\n" +
                "2");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("3");   // 3 : Operators
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("The first println prints variable a with value 1 and then increases the variable to 2.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("23");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the code fragment:\n\n" +
                "public class X{\n" +
                "\tpublic static void main (String [ ] args){\n" +
                "\t\tString theString = \"Hello World\";\n" +
                "\t\tSystem.out.println(theString.charAt(11));\n" +
                "\t}\n" +
                "}\n\n" +
                "What is the result?");
        temp.setOPT_ONE("There is no output");
        temp.setOPT_TWO("d is output");
        temp.setOPT_THREE("A StringIndexOutOfBoundsException is thrown at runtime");
        temp.setOPT_FOUR("An ArrayIndexOutOfBoundsException is thrown at runtime");
        temp.setOPT_FIVE("A NullPointException is thrown at runtime");
        temp.setOPT_SIX("A StringArrayIndexOutOfBoundsException is thrown at runtime");
        temp.setNo_Opt("6");
        temp.setCHAPTER("8");   // 8 : Handling Exceptions
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("There are only 11 characters in the string \"Hello World\". The code theString.charAt(11) retrieves" +
                "the 12th character, which does not exist. A StringIndexOutOfBoundsException is thrown.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("24");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given a java source file:\n\n" +
                "class X{\n" +
                "\tX (){}\n" +
                "\tprivate void one (){}\n" +
                "}\n\n" +
                "public class Y extends X{\n" +
                "\tY (){}\n" +
                "\tprivate void two (){\n" +
                "\t\tone();\n" +
                "\t}\n" +
                "\tpublic static void main (String [ ] args){\n" +
                "\t\tnew Y().two();\n" +
                "\t}\n" +
                "}\n\n" +
                "What changes will make this code compile?");
        temp.setOPT_ONE("adding the public modifier to the declaration of class X");
        temp.setOPT_TWO("adding the protected modifier to the X() constructor");
        temp.setOPT_THREE("changing the private modifier on the declaration of the one() method to protected");
        temp.setOPT_FOUR("removing the Y () constructor");
        temp.setOPT_FIVE("removing the private modifier from the two () method");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("7");   // 7 : Inheritance
        temp.setDIFFICULTY("2");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Using the private protected, instead of the private modifier, for the declaration of the one() method, " +
                "would enable the two() method to access the one() method.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("25");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "#1\n" +
                "package handy.dandy;\n" +
                "public class KeyStroke {\n" +
                "\tpublic void typeExclamation() {\n" +
                "\tSystem.out.println(\"!\")\n" +
                "\t}\n" +
                "}\n" +
                "#2\n" +
                "1. package handy; \n" +
                "2. public class Greet { \n" +
                "3. \tpublic static void main(String[ ] args) { \n" +
                "4. \t\tString greeting = \"Hello\"; \n" +
                "5. \t\tSystem.out.print(greeting); \n" +
                "6. \t\tKeystroke stroke = new Keystroke(); \n" +
                "7. \t\tstroke.typeExclamation(); \n" +
                "8. \t}\n" +
                "9. }\n\n" +
                "What three modifications, made independently, made to class greet, enable the code to compile and run?");
        temp.setOPT_ONE("Line 6 replaced with handy.dandy.Keystroke stroke = new KeyStroke ( );");
        temp.setOPT_TWO("Line 6 replaced with handy.dandy.KeyStroke stroke = new handy.dandy.KeyStroke();");
        temp.setOPT_THREE("import handy.*; added before line 1");
        temp.setOPT_FOUR("import handy.dandy.*; added after line 1");
        temp.setOPT_FIVE("import handy.dandy.KeyStroke; added after line 1");
        temp.setOPT_SIX("import handy.dandy.KeyStroke.typeException(); added before line 1");
        temp.setNo_Opt("6");
        temp.setCHAPTER("1");   // 1 : Java Basics
        temp.setDIFFICULTY("2");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("B D E");
        temp.setEXPLANATION("Three separate solutions:\n" +
                "B: The full class path to the method must be stated (when we have not imported the package)\n" +
                "D: We can import the hold dandy class\n" +
                "E: We can import the specific class");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("26");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "String message1 = \"Wham bam!\";\n" +
                "String message2 = new String(\"Wham bam!\");\n" +
                "if (message1 == message2)\n" +
                "\tSystem.out.println(\"They match\");\n" +
                "if (message1.equals(message2))\n" +
                "\tSystem.out.println(\"They really match\");\n\n" +
                "What is the result?");
        temp.setOPT_ONE("They match\n" +
                "They really match");
        temp.setOPT_TWO("They really match");
        temp.setOPT_THREE("They match");
        temp.setOPT_FOUR("Nothing Prints");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("3");   // 3 : Operators
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("The strings are not the same objects so the == comparison fails. See note #1 below. As the value " +
                "of the strings are the same equals is true. The equals method compares values for equality.\n" +
                "Note: #1 ==\n" +
                "Compares references, not values. The use of == with object references is generally limited to the following:\n" +
                "Comparing to see if a reference is null.\n" +
                "Comparing two enum values. This works because there is only one object for each enum constant.\n" +
                "You want to know if two references are to the same object.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("27");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n\n" +
                "1. public class Speak { \n" +
                "2. \tpublic static void main(String[ ] args) { \n" +
                "3. \t\tSpeak speakIT = new Tell(); \n" +
                "4. \t\tTell tellIt = new Tell();\n" +
                "5. \t\tspeakIT.tellItLikeItIs(); \n" +
                "6. \t\t(Truth) speakIT.tellItLikeItIs(); \n" +
                "7. \t\t((Truth) speakIT).tellItLikeItIs(); \n" +
                "8. \t\ttellIt.tellItLikeItIs();\n" +
                "9. \t\t(Truth) tellIt.tellItLikeItIs();\n" +
                "10. \t\t((Truth) tellIt).tellItLikeItIs();\n" +
                "   \t}\n" +
                "   }\n" +
                "class Tell extends Speak implements Truth {\n" +
                "\tpublic void tellItLikeItIs() {\n" +
                "\t\tSystem.out.println(\"Right on!\");\n" +
                "\t}\n" +
                "}\n" +
                "interface Truth {\n" +
                "\tpublic void tellItLikeItIs()\n" +
                "}\n\n" +
                "Which three lines will compile and output \"right on!\"?");
        temp.setOPT_ONE("Line 5");
        temp.setOPT_TWO("Line 6");
        temp.setOPT_THREE("Line 7");
        temp.setOPT_FOUR("Line 8");
        temp.setOPT_FIVE("Line 9");
        temp.setOPT_SIX("Line 10");
        temp.setNo_Opt("6");
        temp.setCHAPTER("7");   // 7 : Inheritance
        temp.setDIFFICULTY("3");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("C D F");
        temp.setEXPLANATION("(Truth) tellIt.tellItLikeItIs()\n" +
                "calls tellItLikeItIs() on the tellIt object, and casts the value returned by this method to Truth.\n" +
                "((Truth) tellIt).tellItLikeItIs()\n" +
                "casts tellIt to Truth, and then calls tellItLikeItIs() on the object.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("28");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the code fragment:\n\n" +
                "String h1 = \"Bob\";\n" +
                "String h2 = new String (\"Bob\");\n" +
                "What is the best way to test that the values of h1 and h2 are the same?");
        temp.setOPT_ONE("if (h1 == h2)");
        temp.setOPT_TWO("if (h1.equals(h2))");
        temp.setOPT_THREE("if (h1 = = h2)");
        temp.setOPT_FOUR("if (h1.same(h2))");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("3");   // 3 : Operators
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("The equals method compares values for equality.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("29");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which two are valid declarations of a two-dimensional array?");
        temp.setOPT_ONE("int[ ][ ] array2D;");
        temp.setOPT_TWO("int[2][2] array2D;");
        temp.setOPT_THREE("int array2D[ ];");
        temp.setOPT_FOUR("int[ ] array2D[ ];");
        temp.setOPT_FIVE("int[ ][ ] array2D[ ];");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("4");   // 4 : Arrays
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("A D");
        temp.setEXPLANATION("int[ ][ ] array2D; is the standard convention to declare a 2-dimensional integer array.\n" +
                "int[ ] array2D[ ]; works as well, but it is not recommended.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("30");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the code fragment:\n\n" +
                "System.out.println (\"Result:\" +3+5);\n" +
                "System.out.println (\"Result:\" + (3+5));\n\n" +
                "What is the result?");
        temp.setOPT_ONE("Result: 8\n" +
                "Result: 8");
        temp.setOPT_TWO("Result: 35\n" +
                "Result: 8");
        temp.setOPT_THREE("Result: 8\n" +
                "Result: 35");
        temp.setOPT_FOUR("Result: 35\n" +
                "Result: 35");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("3");   // 3 : Operators
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("In the first statement 3 and 5 are treated as strings and are simply concatenated. In the first " +
                "statement 3 and 5 are treated as integers and their sum is calculated.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("31");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "public class Main {\n" +
                "\tpublic static void main(String[ ] args) throws Exception{\n" +
                "\t\tdoSomething();\n" +
                "\t}\n" +
                "\tprivate static void doSomething() throws Exception{\n" +
                "\t\tSystem.out.println(\"Before if clause\");\n" +
                "\t\tif (Math.random() > 0.5){\n" +
                "\t\t\tthrow new Exception();\n" +
                "\t\t}\n" +
                "\t\tSystem.out.println (\"After if clause\");\n" +
                "\t}\n" +
                "}\n\n" +
                "Which two are possible outputs?");
        temp.setOPT_ONE("Before if clause\n" +
                "Exception in thread \"main\" java.lang.Exception\n" +
                "At Main.doSomething (Main.java:8)\n" +
                "At Main.main (Main.java:3)");
        temp.setOPT_TWO("Before if clause\n" +
                "Exception in thread \"main\" java.lang.Exception\n" +
                "At Main.doSomething (Main.java:8)\n" +
                "At Main.main (Main.java:3)\n" +
                "After if clause");
        temp.setOPT_THREE("Exception in thread \"main\" java.lang.Exception\n" +
                "At Main.doSomething (Main.java:8)\n" +
                "At Main.main (Main.java:3)");
        temp.setOPT_FOUR("Before if clause\n" +
                "After if clause");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");   // 8 : Handling Exceptions
        temp.setDIFFICULTY("2");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("A D");
        temp.setEXPLANATION("The first println statement, System.out.println(\"Before if clause\");, will always run. If Math.Random" +
                "() > 0.5 then there is an exception. The exception message is displayed and the program terminates." +
                " If Math.Random() > 0.5 is false, then the second println statement runs as well.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("32");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("A method doSomething () that has no exception handling code is modified to trail a method that throws a " +
                "checked exception. Which two modifications, made independently, will allow the program to compile?");
        temp.setOPT_ONE("Catch the exception in the method doSomething().");
        temp.setOPT_TWO("Declare the exception to be thrown in the doSomething() method signature.");
        temp.setOPT_THREE("Cast the exception to a RunTimeException in the doSomething() method.");
        temp.setOPT_FOUR("Catch the exception in the method that calls doSomething().");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");   // 8 : Handling Exceptions
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("A B");
        temp.setEXPLANATION("Valid Java programming language code must honor the Catch or Specify Requirement. This " +
                "means that code that might throw certain exceptions must be enclosed by either of the following:\n" +
                "* A try statement that catches the exception. The try must provide a handler for the exception, as described in " +
                "Catching and Handling Exceptions.\n" +
                "* A method that specifies that it can throw the exception. The method must provide a throws clause that lists " +
                "the exception, as described in Specifying the Exceptions Thrown by a Method. " +
                "Code that fails to honor the Catch or Specify Requirement will not compile.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("33");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the code fragment:\n\n" +
                "String color = \"Red\";\n" +
                "switch(color)\n" +
                "{\n" +
                "\tcase \"Red\":\n" +
                "\t\tSystem.out.println(\"Found Red\");\n" +
                "\tcase \"Blue\":\n" +
                "\t\tSystem.out.println(\"Found Blue\");\n" +
                "\t\tbreak;\n" +
                "\tcase \"White\":\n" +
                "\t\tSystem.out.println(\"Found White\");\n" +
                "\t\tbreak;\n" +
                "\tdefault:\n" +
                "\t\tSystem.out.println(\"Found Default\");\n" +
                "}\n\n" +
                "What is the result?");
        temp.setOPT_ONE("Found Red");
        temp.setOPT_TWO("Found Red\n" +
                "Found Blue");
        temp.setOPT_THREE("Found Red\n" +
                "Found Blue\n" +
                "Found White");
        temp.setOPT_FOUR("Found Red\n" +
                "Found Blue\n" +
                "Found White\n" +
                "Found Default");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("3");   // 3 : Decision Construct
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("As there is no break statement after the case \"Red\" statement the case Blue statement will run as well.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("34");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which two may precede the word \"class\" in a class declaration?");
        temp.setOPT_ONE("local");
        temp.setOPT_TWO("public");
        temp.setOPT_THREE("static");
        temp.setOPT_FOUR("volatile");
        temp.setOPT_FIVE("synchronized");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("B C");
        temp.setEXPLANATION("B : A class can be declared as public or private.\n" +
                "C: we can have static class in java. A static class cannot be instantiated.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("35");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which three are bad practices?");
        temp.setOPT_ONE("Checking for ArrayIndexOutOfBoundException when iterating through an array to determine when all elements have been visited");
        temp.setOPT_TWO("Checking for Error and. If necessary, restarting the program to ensure that users are unaware problems");
        temp.setOPT_THREE("Checking for FileNotFoundException to inform a user that a filename entered is not valid");
        temp.setOPT_FOUR("Checking for ArrayIndexoutofBoundsExcepcion and ensuring that the program can recover if one occur");
        temp.setOPT_FIVE("Checking for an IOException and ensuring that the program can recover if one occurs");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("A B D");
        temp.setEXPLANATION("A, D: Better to check if the index is within bounds.\n" +
                "B: Restarting the program would not be a good practice. It should be done as a last possibility only.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("36");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "public class Bark {\n" +
                "\t// Insert code here - Line 5\n" +
                "\tpublic abstract void bark(); // Line 6\n" +
                "} // Line 7\n" +
                "// Line 8\n" +
                "// Insert code here - Line 9\n" +
                "public void bark() {\n" +
                "\tSystem.out.println(\"woof\");\n" +
                "}\n" +
                "}\n" +
                "What code should be inserted?");
        temp.setOPT_ONE("5.class Dog {\n" +
                "9. public class Poodle extends Dog {");
        temp.setOPT_TWO("5. abstract Dog {\n" +
                "9. public class Poodle extends Dog {");
        temp.setOPT_THREE("5. abstract class Dog {\n" +
                "9. public class Poodle extends Dog {");
        temp.setOPT_FOUR("5.class Dog {\n" +
                "9. public class Poodle implements Dog {");
        temp.setOPT_FIVE("5. abstract class Dog {\n" +
                "9. public class Poodle implements Dog {");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("2");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Dog should be an abstract class. The correct syntax for this is: abstract class Dog { Poodle should extend Dog (not implement).");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("37");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "class X {}\n" +
                "class Y {Y () {}}\n" +
                "class Z {z(int i ) {} }\n" +
                "Which class has a default constructor?");
        temp.setOPT_ONE("X only");
        temp.setOPT_TWO("Y only");
        temp.setOPT_THREE("Z only");
        temp.setOPT_FOUR("X and Y");
        temp.setOPT_FIVE("Y and Z");
        temp.setOPT_SIX("X and Z");
        temp.setNo_Opt("6");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("F");
        temp.setEXPLANATION("X an Z classes do not define constructors explicitly.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("38");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("public static void main (String [ ] args) {\n" +
                "int a, b, c = 0;\n" +
                "int a, b, c;\n" +
                "int g, int h, int i = 0;\n" +
                "int d, e, F;\n" +
                "int k, l, m; = 0;\n\n" +
                "Which three declarations will compile?");
        temp.setOPT_ONE("int a, b, c = 0;");
        temp.setOPT_TWO("int a, b, c;");
        temp.setOPT_THREE("int g, int h, int i = 0;");
        temp.setOPT_FOUR("int d, e, F;");
        temp.setOPT_FIVE("int k, l, m; = 0;");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("A B D");
        temp.setEXPLANATION("1.You can not declare like int A, int B;\n" +
                "2.You can not declare like int A, int B; =0;");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("39");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the code fragment:\n\n" +
                "int j=0, k =0;\n" +
                "for (int i=0; i < x; i++)\n" +
                "{\n" +
                "\tdo\n" +
                "\t{\n" +
                "\t\tk=0;\n" +
                "\t\twhile (k < z)\n" +
                "\t\t{\n" +
                "\t\t\tk++;\n" +
                "\t\t\tSystem.out.print(k + \" \");\n" +
                "\t\t}\n" +
                "\t\tSystem.out.println(\" \");\n" +
                "\t\tj++;\n" +
                "\t} while (j < y);\n" +
                "\tSystem.out.println(\"----\");\n" +
                "}\n\n" +
                "What values of x, y, z will produce the following result?\n" +
                "1 2 3 4\n" +
                "1 2 3 4\n" +
                "1 2 3 4\n" +
                "------\n" +
                "1 2 3 4\n" +
                "------");
        temp.setOPT_ONE("X = 4, Y = 3, Z = 2");
        temp.setOPT_TWO("X = 3, Y = 2, Z = 3");
        temp.setOPT_THREE("X = 2, Y = 3, Z = 3");
        temp.setOPT_FOUR("X = 4, Y = 2, Z = 3");
        temp.setOPT_FIVE("X = 2, Y = 3, Z = 4");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("2");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("E");
        temp.setEXPLANATION("Z is for the innermost loop. Should print 1 2 3 4. So Z must be 4. Y is for the middle loop. Should " +
                "print three lines of 1 2 3 4. So Y must be set 3. X is for the outmost loop. Should print 2 lines of ----. So X " +
                "should be 2.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("40");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which statement initializes a stringBuilder to a capacity of 128?");
        temp.setOPT_ONE("StringBuilder sb = new String(\"128\");");
        temp.setOPT_TWO("StringBuilder sb = StringBuilder.setCapacity(128);");
        temp.setOPT_THREE("StringBuilder sb = StringBuilder.getInstance(128);");
        temp.setOPT_FOUR("StringBuilder sb = new StringBuilder(128);");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("2");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("StringBuilder(int capacity) Constructs a string builder with no characters in it and an initial capacity " +
                "specified by the capacity argument. Note: An instance of a StringBuilder is a mutable sequence of characters. " +
                "The principal operations on a StringBuilder are the append and insert methods, which are overloaded so as to " +
                "accept data of any type. Each effectively converts a given datum to a string and then appends or inserts the " +
                "characters of that string to the string builder. The append method always adds these characters at the end of " +
                "the builder; the insert method adds the characters at a specified point.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);


        temp.setID("41");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "public class DoCompare {\n" +
                "\tpublic static void main(String[ ] args){\n" +
                "\t\tString[ ] table = {\"aa\", \"bb\", \"cc\"};\n" +
                "\t\tint ii =0;\n" +
                "\t\tdo {\n" +
                "\t\t\twhile (ii < table.length)\n" +
                "\t\t\t\tSystem.out.println(ii++);\n" +
                "\t\t}while (ii < table.length);\n" +
                "\t}\n" +
                "}\n\n" +
                "What is the result?");
        temp.setOPT_ONE("0\n1");
        temp.setOPT_TWO("0\n1\n2");
        temp.setOPT_THREE("0\n1\n2\n3");
        temp.setOPT_FOUR("Compilation fails");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("table.length is 3. So the inside while loop will run 3 times with ii=0, ii=1 and ii=2. The second while " +
                "statement will break the do-loop when ii = 3. ");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("42");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("A method is declared to take three arguments. A program calls this method and passes only two arguments.\n" +
                "What is the result?");
        temp.setOPT_ONE("Compilation fails.");
        temp.setOPT_TWO("The third argument is given the value null.");
        temp.setOPT_THREE("The third argument is given the value void.");
        temp.setOPT_FOUR("The third argument is given the value zero.");
        temp.setOPT_FIVE("The third argument is given the appropriate false value for its declared type.");
        temp.setOPT_SIX("An exception occurs when the method attempts to access the third argument.");
        temp.setNo_Opt("6");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("The problem is noticed at build/compile time. At build you would receive an error message like:\n" +
                "required: int,int,int\n" +
                "found: int,int");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("43");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("int [ ] array = {1, 2, 3, 4, 5};\n" +
                "System.arraycopy (array, 2, array, 1, 2);\n" +
                "System.out.print (array [1]);\n" +
                "System.out.print (array[4]);\n\n" +
                "What is the result?");
        temp.setOPT_ONE("14");
        temp.setOPT_TWO("15");
        temp.setOPT_THREE("24");
        temp.setOPT_FOUR("25");
        temp.setOPT_FIVE("34");
        temp.setOPT_SIX("35");
        temp.setNo_Opt("6");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("2");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("F");
        temp.setEXPLANATION("The two elements 3 and 4 (starting from position with index 2) are copied into position index 1 and 2 in the same array.\n" +
                "After the arraycopy command the array looks like:\n" +
                "{1, 3, 4, 4, 5};\n" +
                "Then element with index 1 is printed: 3\n" +
                "Then element with index 4 is printed: 5");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("44");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the following code fragment:\n\n" +
                "if (value >= 0) {\n" +
                "\tif (value != 0)\n" +
                "\t\tSystem.out.print(\"the \");\n" +
                "\telse\n" +
                "\t\tSystem.out.print(\"quick \");\n" +
                "\tif (value < 10)\n" +
                "\t\tSystem.out.print(\"brown \");\n" +
                "\tif (value > 30)\n" +
                "\t\tSystem.out.print(\"fox \");\n" +
                "\telse if (value < 50)\n" +
                "\t\tSystem.out.print(\"jumps \");\n" +
                "\telse if (value < 10)\n" +
                "\t\tSystem.out.print(\"over \");\n" +
                "\telse\n" +
                "\t\tSystem.out.print(\"the \");\n" +
                "\tif (value > 10)\n" +
                "\t\tSystem.out.print(\"lazy \");\n" +
                "\t} else {\n" +
                "\t\tSystem.out.print(\"dog \");\n" +
                "\t}\n" +
                "\tSystem.out.print(\"... \");\n" +
                "}\n\n" +
                "What is the result if the integer value is 33?");
        temp.setOPT_ONE("The fox jump lazy ...");
        temp.setOPT_TWO("The fox lazy ...");
        temp.setOPT_THREE("Quick fox over lazy ...");
        temp.setOPT_FOUR("Quick fox the ....");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("3");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("33 is greater than 0.\n " +
                "33 is not equal to 0." +
                "the is printed." +
                "33 is greater than 30" +
                "fox is printed" +
                "33 is greater then 10 (the two else if are skipped)" +
                "lazy is printed" +
                "finally ... is printed.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("45");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which three are advantages of the Java exception mechanism?");
        temp.setOPT_ONE("Improves the program structure because the error handling code is separated from the normal program function");
        temp.setOPT_TWO("Provides a set of standard exceptions that covers all the possible errors");
        temp.setOPT_THREE("Improves the program structure because the programmer can choose where to handle exceptions");
        temp.setOPT_FOUR("Improves the program structure because exceptions must be handled in the method in which they occurred");
        temp.setOPT_FIVE("allows the creation of new exceptions that are tailored to the particular program being");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("2");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("A C E");
        temp.setEXPLANATION("A: The error handling is separated from the normal program logic.\n" +
                "C: You have some choice where to handle the exceptions.\n" +
                "E: You can create your own exceptions.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("46");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "public class MyFor3\n" +
                "{\n" +
                "\tpublic static void main(String[ ] args)\n" +
                "\t{\n" +
                "\t\tint [ ] xx = null;\n" +
                "\t\tSystem.out.println(xx);\n" +
                "\t}\n" +
                "}\n\n" +
                "What is the result?");
        temp.setOPT_ONE("null");
        temp.setOPT_TWO("compilation fails");
        temp.setOPT_THREE("Java.lang.NullPointerException");
        temp.setOPT_FOUR("0");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("An array variable (here xx) can very well have the null value.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("47");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "public class Main\n" +
                "{\n" +
                "\tpublic static void main(String[ ] args)\n" +
                "\t{\n" +
                "\t\tdoSomething();\n" +
                "\t}\n" +
                "\tprivate static void doSomething()\n" +
                "\t{\n" +
                "\t\tdoSomeThingElse();\n" +
                "\t}\n" +
                "\tprivate static void doSomeThingElse()\n" +
                "\t{\n" +
                "\t\tthrow new Exception();\n" +
                "\t}\n" +
                "}\n" +
                "Which approach ensures that the class can be compiled and run?");
        temp.setOPT_ONE("Put the throw new Exception() statement in the try block of try catch");
        temp.setOPT_TWO("Put the doSomethingElse() method in the try block of a try catch");
        temp.setOPT_THREE("Put the doSomething() method in the try block of a try catch");
        temp.setOPT_FOUR("Put the doSomething() method and the doSomethingElse() method in the try block of a try catch");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("We need to catch the exception in the doSomethingElse() method.\n" +
                "Such as:\n" +
                "private static void doSomeThingElse() {\n" +
                "try {\n" +
                "throw new Exception();}\n" +
                "catch (Exception e)\n" +
                "{}\n" +
                "}");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("48");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n" +
                "public class ScopeTest1{\n" +
                "\tpublic static void main(String[ ] args){\n" +
                "\t\tdoStuff(); // line x1\n" +
                "\t\tint x1 = x2; // line x2\n" +
                "\t\tint x2 = j; // line x3\n" +
                "\t}\n" +
                "\tstatic void doStuff() {\n" +
                "\t\tSystem.out.println(j); // line x4\n" +
                "\t}\n" +
                "\tstatic int j;\n" +
                "}\n\n" +
                "Which line causes a compilation error ?");
        temp.setOPT_ONE("line x1");
        temp.setOPT_TWO("line x2");
        temp.setOPT_THREE("line x3");
        temp.setOPT_FOUR("line x4");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("The variable x2 is used before it has been declared.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("49");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "class Overloading {\n" +
                "\tvoid x (int i) {\n" +
                "\t\tSystem.out.println(\"one\");\n" +
                "\t}\n" +
                "\tvoid x (String s) {\n" +
                "\t\tSystem.out.println(\"two\");\n" +
                "\t}\n" +
                "\tvoid x (double d) {\n" +
                "\t\tSystem.out.println(\"three\");\n" +
                "\t}\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tnew Overloading().x (4.0);\n" +
                "\t}\n" +
                "}\n\n" +
                "What is the result?");
        temp.setOPT_ONE("one");
        temp.setOPT_TWO("two");
        temp.setOPT_THREE("three");
        temp.setOPT_FOUR("Compilation Error");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("In this scenario the overloading method is called with a double/float value, 4.0. This makes the third overload method to run.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("50");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which declaration initializes a boolean variable?");
        temp.setOPT_ONE("boolean h = 1;");
        temp.setOPT_TWO("boolean k = 0;");
        temp.setOPT_THREE("boolean m = null;");
        temp.setOPT_FOUR("boolean j = (1 < 5);");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("The primitive type boolean has only two possible values: true and false. Here j is set to (1 <5), which evaluates to true.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("51");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("public class Basic {\n" +
                "\tprivate static int letter;\n" +
                "\tpublic static int getLetter();\n" +
                "\tpublic static void Main(String[ ] args) {\n" +
                "\t\tSystem.out.println(getLetter());\n" +
                "\t}\n" +
                "}\n" +
                "Why will the code not compile?");
        temp.setOPT_ONE("A static field cannot be private.");
        temp.setOPT_TWO("The getLetter method has no body.");
        temp.setOPT_THREE("There is no setletter method.");
        temp.setOPT_FOUR("The letter field is uninitialized.");
        temp.setOPT_FIVE("It contains a method named Main instead of main");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("The getLetter() method needs a body public static int getLetter() { }; .");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("52");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("public class Circle\n" +
                "{\n" +
                "\tdouble radius;\n" +
                "\tpublic double area:\n" +
                "\tpublic Circle (double r) { radius = r;}\n" +
                "\tpublic double getRadius() {return radius;}\n" +
                "\tpublic void setRadius(double r) { radius = r;}\n" +
                "\tpublic double getArea() { return *///* ??? *///*;}\n" +
                "}\n\n" +
                "class App\n" +
                "{\n" +
                "\tpublic static void main(String[ ] args)\n" +
                "\t{\n" +
                "\t\tCircle c1 = new Circle(17.4);\n" +
                "\t\tc1.area = Math.PI * c1.getRadius() * c1.getRadius();\n" +
                "\t}\n" +
                "}\n\n" +
                "This class is poorly encapsulated. You need to change the circle class to compute and return the area instead.\n" +
                "What three modifications are necessary to ensure that the class is being properly encapsulated?");
        temp.setOPT_ONE("Change the access modifier of the setRadius() method to private");
        temp.setOPT_TWO("Change the getArea() method\n" +
                "public double getArea() { return area; }");
        temp.setOPT_THREE("When the radius is set in the Circle constructor and the setRadius() method, recomputed the area and store it into the area field");
        temp.setOPT_FOUR("Change the getRadius () method:\n" +
                "public double getRadius() {\n" +
                "area = Math.PI * radius * radius;\n" +
                "return radius;}");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("2");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("A B C");
        temp.setEXPLANATION("A: There is no need to have SetRadius as public as the radius can be set through the Circle method.\n" +
                "B: We need to return the area in the GetArea method.\n" +
                "C: When the radius changes the Area must change as well.\n" +
                "Incorrect answer:\n" +
                "D: the GetRadius() method does not change the radius, so there is no need to recomputed the area.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("53");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given a code fragment:\n\n" +
                "StringBuilder sb = new StringBuilder ();\n" +
                "String h1 = \"HelloWorld\";\n" +
                "sb.append(\"Hello\").append (\"world\");\n" +
                "if (h1 == sb.toString()) {\n" +
                "\tSystem.out.println(\"They match\");\n" +
                "}\n" +
                "if (h1.equals(sb.toString())) {\n" +
                "\tSystem.out.println(\"They really match\");\n" +
                "}\n" +
                "What is the result?");
        temp.setOPT_ONE("They match\n" +
                "They really match");
        temp.setOPT_TWO("They match");
        temp.setOPT_THREE("They really match");
        temp.setOPT_FOUR("Nothing is printed to the screen");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("3");
        temp.setDIFFICULTY("2");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("Strings can not be compared with the usual <, <=, >, or >= operators, and the == and != operators " +
                "don't compare the characters in the strings. So the first if statement fails.\n" +
                "Equals works fine on strings. But it does not work here.The second if-statement also fails. The StringBuffer " +
                "class does not override the equals method so it uses the equals method of Object. If a and b are two objects " +
                "from a class which doesn't override equals, then a.equals(b) is the same as a == b");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("54");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the following code:\n\n" +
                "1. public class Simple { \n" +
                "2. \tpublic float price; \n" +
                "3. \t\tpublic static void main (String[ ] args) { \n" +
                "4. \t\tSimple price = new Simple (); \n" +
                "5. \t\tprice = 4; \n" +
                "6. \t} \n" +
                "7. } \n" +
                "What will make this code compile and run?");
        temp.setOPT_ONE("Change line 2 to the following:\n" +
                "public int price");
        temp.setOPT_TWO("Change line 4 to the following:\n" +
                "int price = new simple ();");
        temp.setOPT_THREE("Change line 4 to the following:\n" +
                "Float price = new simple ();");
        temp.setOPT_FOUR("Change line 5 to the following:\n" +
                "price.price = 4;");
        temp.setOPT_FIVE("Change line 5 to the following:\n" +
                "Price = (float) 4:");
        temp.setOPT_SIX("The code compiles and runs properly; no changes are necessary");
        temp.setNo_Opt("6");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("price.price =4; is correct, not price=4; The attribute price of the instance must be set, not the instance itself.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("55");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "public class DoWhile {\n" +
                "\tpublic static void main (String [ ] args) {\n" +
                "\t\tint ii = 2;\n" +
                "\t\tdo {\n" +
                "\t\t\tSystem.out.println (ii);\n" +
                "\t\t} while (--ii);\n" +
                "\t}\n" +
                "}\n" +
                "What is the result?");
        temp.setOPT_ONE("1");
        temp.setOPT_TWO("2");
        temp.setOPT_THREE("null");
        temp.setOPT_FOUR("an infinite loop");
        temp.setOPT_FIVE("compilation fails");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("E");
        temp.setEXPLANATION("The line while (--ii); will cause the compilation to fail.\n" +
                "--ii is not a boolean value.\n" +
                "A correct line would be while (--ii>0);");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);


        temp.setID("56");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("You are writing a method that is declared not to return a value. Which two are permitted in the method body?");
        temp.setOPT_ONE("omission of the return statement");
        temp.setOPT_TWO("return null;");
        temp.setOPT_THREE("return void;");
        temp.setOPT_FOUR("return;");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("A D");
        temp.setEXPLANATION("Any method declared void doesn't return a value. It does not need to contain a return statement, " +
                "but it may do so. In such a case, a return statement can be used to branch out of a control flow block and exit " +
                "the method and is simply used like this:\n" +
                "return;");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);


        temp.setID("57");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Identify two benefits of using ArrayList over array in software development.");
        temp.setOPT_ONE("reduces memory footprint");
        temp.setOPT_TWO("implements the Collection API");
        temp.setOPT_THREE("is multi thread safe");
        temp.setOPT_FOUR("dynamically resizes based on the number of elements in the list");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("2");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("A D");
        temp.setEXPLANATION("ArrayList supports dynamic arrays that can grow as needed. In Java, standard arrays are of a" +
                " fixed length. After arrays are created, they cannot grow or shrink, which means that you must know in advance" +
                " how many elements an array will hold. But, sometimes, you may not know until run time precisely how large of" +
                " an array you need. To handle this situation, the collections framework defines ArrayList. In essence, an" +
                " ArrayList is a variable-length array of object references. That is, an ArrayList can dynamically increase or" +
                " decrease in size. Array lists are created with an initial size. When this size is exceeded, the collection is automatically enlarged. When" +
                " objects are removed, the array may be shrunk.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("58");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which three are valid types for switch?");
        temp.setOPT_ONE("int");
        temp.setOPT_TWO("float");
        temp.setOPT_THREE("double");
        temp.setOPT_FOUR("Integer");
        temp.setOPT_FIVE("String");
        temp.setOPT_SIX("Float");
        temp.setNo_Opt("6");
        temp.setCHAPTER("3");
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("A D E");
        temp.setEXPLANATION("A switch works with the byte, short, char, and int primitive data types. It also works with " +
                "enumerated types the String class, and a few special classes that wrap certain primitive types: Character, Byte, " +
                "Short, and Integer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("59");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Give:\n\n" +
                "public class MyFive {\n" +
                "\tstatic void main(String[ ] args) {\n" +
                "\t\tshort ii;\n" +
                "\t\tshort jj = 0;\n" +
                "\t\tfor (ii = KK;ii > 6; ii -= 1) { // line x //\n" +
                "\t\t\tjj++;\n" +
                "\t\t}\n" +
                "\t\tSystem.out.println(\"jj = \" + jj);\n" +
                "\t}\n" +
                "}\n\n" +
                "What value should replace KK in line x to cause jj = 5 to be output?");
        temp.setOPT_ONE("-1");
        temp.setOPT_TWO("1");
        temp.setOPT_THREE("5");
        temp.setOPT_FOUR("8");
        temp.setOPT_FIVE("11");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("2");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("E");
        temp.setEXPLANATION("We need to get jj to 5. It is initially set to 0. So we need to go through the for loop 5 times. The for\n" +
                "loops ends when ii > 6 and ii decreases for every loop. So we need to initially set ii to 11. We set KK to 11.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("60");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the code fragment:\n\n" +
                "Boolean b1 = true;\n" +
                "Boolean b2 = false;\n" +
                "int i = 0;\n" +
                "while (foo) {}\n\n" +
                "Which one is valid as a replacement for foo?");
        temp.setOPT_ONE("b1.compareTo(b2)");
        temp.setOPT_TWO("i = 1");
        temp.setOPT_THREE("i == 2? -1:0");
        temp.setOPT_FOUR("\"foo\".equals(\"bar\")");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("equals works fine on strings. equals produces a Boolean value.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("61");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "public class SuperTest {\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tstatement1\n" +
                "\t\tstatement2\n" +
                "\t\tstatement3\n" +
                "\t}\n" +
                "}\n" +
                "class Shape {\n" +
                "\tpublic Shape() {\n" +
                "\t\tSystem.out.println(\"Shape: constructor\");\n" +
                "\t}\n" +
                "\tpublic void foo() {\n" +
                "\t\tSystem.out.println(\"Shape: foo\");\n" +
                "\t}\n" +
                "}\n" +
                "class Square extends Shape {\n" +
                "\tpublic Square() {\n" +
                "\t\tsuper();\n" +
                "\t}\n" +
                "\tpublic Square(String label) {\n" +
                "\t\tSystem.out.println(\"Square: constructor\");\n" +
                "\t}\n" +
                "\tpublic void foo() {\n" +
                "\t\tsuper.foo();\n" +
                "\t}\n" +
                "\tpublic void foo(String label) {\n" +
                "\t\tSystem.out.println(\"Square: foo\");\n" +
                "\t}\n" +
                "}\n\n" +
                "What should statement1, statement2, and statement3, be respectively, in order to produce the result:\n" +
                "Shape: constructor\n" +
                "Square: foo\n" +
                "Shape: foo");
        temp.setOPT_ONE("Square square = new Square (\"bar\");\n" +
                "square.foo (\"bar\");\n" +
                "square.foo();");
        temp.setOPT_TWO("Square square = new Square (\"bar\");\n" +
                "square.foo (\"bar\");\n" +
                "square.foo (\"bar\");");
        temp.setOPT_THREE("Square square = new Square ();\n" +
                "square.foo ();\n" +
                "square.foo(bar);");
        temp.setOPT_FOUR("Square square = new Square ();\n" +
                "square.foo ();\n" +
                "square.foo(\"bar\");");
        temp.setOPT_FIVE("Square square = new Square ();\n" +
                "square.foo ();\n" +
                "square.foo ();");
        temp.setOPT_SIX("Square square = new Square ();\n" +
                "square.foo(\"bar\");\n" +
                "square.foo ();");
        temp.setNo_Opt("6");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("2");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("F");
        temp.setEXPLANATION("\"Shape: constructor\" is printed when statement 1 is replaced by \"Square square = new Square ();\" " +
                "as default constructor of square will be called, which in this case will call super class constructor.\n" +
                "\"Square: foo\" is printed when statement 2 is replaced by square.foo(\"bar\"); " +
                "as function \"public void foo(String label)\"  of square will be called.\n" +
                "\"Shape: foo\" is printed when statement 2 is replaced by square.foo (); " +
                "as function \"public void foo()\" of square will be called, which in this case will call super class function \"foo()\". ");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("62");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "public class X implements Z\n" +
                "{\n" +
                "\tpublic String toString()\n" +
                "\t{\n" +
                "\t\treturn \"I am X\";\n" +
                "\t}\n" +
                "\tpublic static void main(String[ ] args)\n" +
                "\t{\n" +
                "\t\tY myY = new Y();\n" +
                "\t\tX myX = myY;\n" +
                "\t\tZ myZ = myX;\n" +
                "\t\tSystem.out.println(myZ);\n" +
                "\t}\n" +
                "}\n" +
                "class Y extends X\n" +
                "{\n" +
                "\tpublic String toString()\n" +
                "\t{\n" +
                "\t\treturn \"I am Y\";\n" +
                "\t}\n" +
                "}\n" +
                "interface Z { }\n\n" +
                "What is the reference type of myZ and what is the type of the object it references?");

        temp.setOPT_ONE("Reference type is Z; object type is Z.");
        temp.setOPT_TWO("Reference type is Y; object type is Y.");
        temp.setOPT_THREE("Reference type is Z; object type is Y.");
        temp.setOPT_FOUR("Reference type is X; object type is Z.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("2");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Because Java handles objects and arrays by reference, classes and array types are known " +
                "as reference types.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("63");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "class SampleClass\n" +
                "{\n" +
                "}\n" +
                "class AnotherSampleClass extends SampleClass\n" +
                "{\n" +
                "}\n" +
                "class Test\n" +
                "{\n" +
                "\tpublic static void main(String[ ] args)\n" +
                "\t{\n" +
                "\t\tSampleClass sc = new SampleClass();\n" +
                "\t\tAnotherSampleClass asc = new AnotherSampleClass();\n" +
                "\t\tsc = asc;\n" +
                "\t\tSystem.out.println(\"sc: \" + sc.getClass());\n" +
                "\t\tSystem.out.println(\"asc: \" + asc.getClass());\n" +
                "\t}\n" +
                "}\n\n" +
                "What is the result?");
        temp.setOPT_ONE("sc: class.Object\n" +
                "asc: class.AnotherSampleClass");
        temp.setOPT_TWO("sc: class.SampleClass\n" +
                "asc: class.AnotherSampleClass");
        temp.setOPT_THREE("sc: class.AnotherSampleClass\n" +
                "asc: class.SampleClass");
        temp.setOPT_FOUR("sc: class.AnotherSampleClass\n" +
                "asc: class.AnotherSampleClass");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("2");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("Note: The getClass method Returns the runtime class of an object. That Class object is the object " +
                "that is locked by static synchronized methods of the represented class.\n" +
                "Note: Because Java handles objects and arrays by reference, classes and array types are known as reference " +
                "types.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("64");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the code fragment:\n\n" +
                "public static void main(String[ ] args)\n" +
                "{\n" +
                "\tString [ ] table = {\"aa\", \"bb\", \"cc\"};\n" +
                "\tint ii = 0;\n" +
                "\tfor (String ss:table)\n" +
                "\t{\n" +
                "\t\twhile (ii < table.length)\n" +
                "\t\t{\n" +
                "\t\t\tSystem.out.println (ii);\n" +
                "\t\t\tii++;\n" +
                "\t\t\tbreak;\n" +
                "\t\t}\n" +
                "\t}\n" +
                "}\n\n" +
                "How many times is 2 printed?");

        temp.setOPT_ONE("zero");
        temp.setOPT_TWO("once");
        temp.setOPT_THREE("twice");
        temp.setOPT_FOUR("thrice");
        temp.setOPT_FIVE("It is not printed because compilation fails");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("The outer loop will run three times, one time each for the elements in table. The break statement " +
                "breaks the inner loop immediately each time. 2 will be printed once only.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("65");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "public class SampleClass{\n" +
                "\tpublic static void main(String[ ] args){\n" +
                "\t\tSampleClass sc, scA, scB;\n" +
                "\t\tsc = new SampleClass();\n" +
                "\t\tscA = new SampleClassA();\n" +
                "\t\tscB = new SampleClassB();\n" +
                "\t\tSystem.out.println(\"Hash is : \" + sc.getHash() + \", \" + scA.getHash() + \", \" + scB.getHash());\n" +
                "\t}\n" +
                "\tpublic int getHash(){\n" +
                "\t\treturn 111111;\n" +
                "\t}\n" +
                "}\n" +
                "class SampleClassA extends SampleClass{\n" +
                "\tpublic long getHash(){\n" +
                "\t\treturn 44444444;\n" +
                "\t}\n" +
                "}\n" +
                "class SampleClassB extends SampleClass{\n" +
                "\tpublic long getHash(){\n" +
                "\t\treturn 999999999;\n" +
                "\t}\n" +
                "}\n\n" +
                "What is the result?");
        temp.setOPT_ONE("Compilation fails");
        temp.setOPT_TWO("An exception is thrown at runtime");
        temp.setOPT_THREE("There is no result because this is not correct way to determine the hash code");
        temp.setOPT_FOUR("Hash is: 111111, 44444444, 999999999");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("3");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("The compilation fails as SampleClassA and SampleClassB cannot override SampleClass because " +
                "the return type of SampleClass is int, while the return type of SampleClassA and SampleClassB is long.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("66");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which two will compile, and can be run successfully using the command:\n" +
                "Java fred1 hello walls");
        temp.setOPT_ONE("class Fred1{\n" +
                "\tpublic static void main (String args) {\n" +
                "\t\tSystem.out.println(args[1]);\n" +
                "\t}\n" +
                "}");
        temp.setOPT_TWO("class Fred1{\n" +
                "\tpublic static void main (String [ ] args) {\n" +
                "\t\tSystem.out.println(args[2]);\n" +
                "\t}\n" +
                "}");
        temp.setOPT_THREE("class Fred1 {\n" +
                "\tpublic static void main (String [ ] args) {\n" +
                "\t\tSystem.out.println (args);\n" +
                "\t}\n" +
                "}");
        temp.setOPT_FOUR("class Fred1 {\n" +
                "\tpublic static void main (String [ ] args) {\n" +
                "\t\tSystem.out.println(args [1]);\n" +
                "\t}\n" +
                "}");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("C D");
        temp.setEXPLANATION("A. main syntax is wrong\n" +
                "B. Throws java.lang.ArrayIndexOutOfBoundsException: 2 \n" +
                "C. Prints out: [java.lang.String;@39341183\n" +
                "D. Prints out: walls");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("67");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "public abstract class Wow {\n" +
                "\tprivate int wow;\n" +
                "\tpublic Wow (int wow) {\n" +
                "\t\tthis.wow = wow;\n" +
                "\t}\n" +
                "\tpublic void wow () {}\n" +
                "\tprivate void wowza () {}\n" +
                "}\n\n" +
                "What is true about the class Wow?");
        temp.setOPT_ONE("It compiles without error.");
        temp.setOPT_TWO("It does NOT compile because an abstract class CANNOT have private methods.");
        temp.setOPT_THREE("It does NOT compile because an abstract class CANNOT have instance variables.");
        temp.setOPT_FOUR("It does NOT compile because an abstract class must have at least one abstract method.");
        temp.setOPT_FIVE("It does NOT compile because an abstract class must have a constructor with no arguments.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("A class that is declared with abstract keyword, is known as abstract class in java. " +
                "It can have abstract and non-abstract methods (method with body).");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("68");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "class X{\n" +
                "\tstatic void m(int i){\n" +
                "\t}\n" +
                "\tpublic static void main(String[ ] args){\n" +
                "\t\tint j = 12;\n" +
                "\t\tm (j);\n" +
                "\t\tSystem.out.println(j);\n" +
                "\t}\n" +
                "}\n\n" +
                "What is the result?");
        temp.setOPT_ONE("7");
        temp.setOPT_TWO("12");
        temp.setOPT_THREE("19");
        temp.setOPT_FOUR("Compilation fails");
        temp.setOPT_FIVE("An exception is thrown at run time");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("No compilation error and no exception will be thrown. As \"j\" is initialized with 12 so it will print 12. ");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("69");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which two statements are true?");
        temp.setOPT_ONE("An abstract class can implement an interface.");
        temp.setOPT_TWO("An abstract class can be extended by an interface.");
        temp.setOPT_THREE("An interface CANNOT be extended by another interface.");
        temp.setOPT_FOUR("An interface can be extended by an abstract class.");
        temp.setOPT_FIVE("An abstract class can be extended by a concrete class.");
        temp.setOPT_SIX("An abstract class CANNOT be extended by an abstract class.");
        temp.setNo_Opt("6");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("A E");
        temp.setEXPLANATION("In Java, an abstract class can implement an interface, and not provide" +
                " implementations of all of the interface's methods. It is the responsibility" +
                " of the first concrete class that has that abstract class as an ancestor to implement all of the methods in the interface.\n" +
                "A class may implement a number of Interfaces, but can extend only one abstract class.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("70");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "class Overloading {\n" +
                "\tint x(double d) {\n" +
                "\t\tSystem.out.println(\"one\");\n" +
                "\t\treturn 0;\n" +
                "\t}\n" +
                "\tString x(double d) {\n" +
                "\t\tSystem.out.println(\"two\");\n" +
                "\t\treturn null;\n" +
                "\t}\n" +
                "\tdouble x(double d) {\n" +
                "\t\tSystem.out.println(\"three\");\n" +
                "\t\treturn 0.0;\n" +
                "\t}\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tnew Overloading().x(4.0)\n" +
                "\t}\n" +
                "}\n\n" +
                "What is the result?");
        temp.setOPT_ONE("One");
        temp.setOPT_TWO("Two");
        temp.setOPT_THREE("Three");
        temp.setOPT_FOUR("Compilation fails");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("overloading of the x method fails as the input argument in all three cases are double. To use\n" +
                "overloading of methods the argument types must be different.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("71");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("The catch clause argument is always of type___________.");
        temp.setOPT_ONE("Exception");
        temp.setOPT_TWO("Exception but NOT including RuntimeException");
        temp.setOPT_THREE("Throwable");
        temp.setOPT_FOUR("RuntimeException");
        temp.setOPT_FIVE("CheckedException");
        temp.setOPT_SIX("Error");
        temp.setNo_Opt("6");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Because all exceptions in Java are the sub-class of java.lang.Exception class, you can have a " +
                "single catch block that catches an exception of type Exception only. Hence the compiler is fooled into thinking " +
                "that this block can handle any exception.\n" +
                "Since Throwable is the parent class for the application specific " +
                "Exception classes. However, this is discouraged in Java programming circles. This is because " +
                "Throwable happens to also be the parent class for the non-application specific Error classes which are not " +
                "meant to be handled explicitly as they are catered for by the JVM itself.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("72");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the code fragment:\n\n" +
                "1. ArrayList<Integer> list = new ArrayList<>(1);\n" +
                "2. list.add(1001);\n" +
                "3. list.add(1002);\n" +
                "4. System.out.println(list.get(list.size()));\n\n" +
                "What is the result?");
        temp.setOPT_ONE("Compilation fails due to an error on line 1.");
        temp.setOPT_TWO("An exception is thrown at run time due to error on line 3");
        temp.setOPT_THREE("An exception is thrown at run time due to error on line 4");
        temp.setOPT_FOUR("1002");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("At runtime an IndexOutOfBoundsException is thrown when the third list item is tried to be accessed.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("73");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("View the Exhibit.\n\n" +
                "public class Hat {\n" +
                "\tpublic int ID =0;\n" +
                "\tpublic String name = \"hat\";\n" +
                "\tpublic String size = \"One Size Fit All\";\n" +
                "\tpublic String color=\"\";\n" +
                "\tpublic String getName() { return name; }\n" +
                "\tpublic void setName(String name) {\n" +
                "\t\tthis.name = name;\n" +
                "\t}\n" +
                "}\n" +
                "Given\n" +
                "public class TestHat {\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tHat blackCowboyHat = new Hat();\n" +
                "\t}\n" +
                "}\n\n" +
                "Which statement sets the name of the Hat instance?");
        temp.setOPT_ONE("blackCowboyHat.setName = \"Cowboy Hat\";");
        temp.setOPT_TWO("setName(\"Cowboy Hat\");");
        temp.setOPT_THREE("Hat.setName(\"Cowboy Hat\");");
        temp.setOPT_FOUR("blackCowboyHat.setName(\"Cowboy Hat\");");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("blackCowboyHat.setName(\"Cowboy Hat\"); will call setName function of class hat.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("74");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "public class Two{\n" +
                "\tpublic static void main(String[ ] args){\n" +
                "\t\ttry{\n" +
                "\t\t\tdoStuff();\n" +
                "\t\t\tSystem.out.println(\"1\");\n" +
                "\t\t}\n" +
                "\t\tcatch{\n" +
                "\t\t\tSystem.out.println(\"2\");\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\tpublic static void do Stuff(){\n" +
                "\t\tif (Math.random() > 0.5) throw new RunTimeException();\n" +
                "\t\tdoMoreStuff();\n" +
                "\t\tSystem.out.println(\"3 \");\n" +
                "\t}\n" +
                "\tpublic static void doMoreStuff(){\n" +
                "\tSystem.out.println(\"4\");\n" +
                "\t}\n" +
                "}\n\n" +
                "Which two are possible outputs?");
        temp.setOPT_ONE("2");
        temp.setOPT_TWO("4 3 1");
        temp.setOPT_THREE("1 2 3");
        temp.setOPT_FOUR("1 3 4");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("2");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("A B");
        temp.setEXPLANATION("If Math.random() is greater than 0.5 then it will throw RunTimeException which will call " +
                "catch block, therfore 2 will be printed.\n" +
                "If Math.random() is less than 0.5 , it will call doMorestuff() which will print 4, " +
                "then System.out.println(\"3 \"); will print 3 & in last it will go back to try block which will print 1. " +
                "Therefore 4 3 1 will be printed.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("75");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "public class MyFor{\n" +
                "\tpublic static void main(String[ ] args){\n" +
                "\t\tfor (int ii = 0; ii < 4; ii++){\n" +
                "\t\t\tSystem.out.println(\"ii = \"+ ii);\n" +
                "\t\t\tii = ii +1;\n" +
                "\t\t}\n" +
                "\t}\n" +
                "}\n\n" +
                "What is the result?");
        temp.setOPT_ONE("ii = 0\n" +
                "ii = 2");
        temp.setOPT_TWO("ii = 0\n" +
                "ii = 1\n" +
                "ii = 2\n" +
                "ii = 3");
        temp.setOPT_THREE("ii =");
        temp.setOPT_FOUR("Compilation fails.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("Note :- In for loop ii is incremented by 1.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);








        temp.setID("76");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "public class DoBreak1{\n" +
                "\tpublic static void main(String[ ] args){\n" +
                "\t\tString[ ] table = {\"aa\", \"bb\", \"cc\", \"dd\"};\n" +
                "\t\tfor (String ss: table){\n" +
                "\t\t\tif ( \"bb\".equals(ss)){\n" +
                "\t\t\t\tcontinue;\n" +
                "\t\t\t}\n" +
                "\t\t\tSystem.out.println(ss);\n" +
                "\t\t\tif ( \"cc\".equals(ss)){\n" +
                "\t\t\t\tbreak;\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\t}\n" +
                "}\n\n" +
                "What is the result?");
        temp.setOPT_ONE("aa\n" +
                "cc");
        temp.setOPT_TWO("aa\n" +
                "bb\n" +
                "cc");
        temp.setOPT_THREE(" cc\n" +
                "dd");
        temp.setOPT_FOUR("cc");
        temp.setOPT_FIVE("Compilation fails.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("1. for \"aa\" it will print \"aa\"\n" +
                "2. for \"bb\" it will continue so it will not print anything.\n" +
                "3. for \"cc\" it will print \"cc\" and then loop will break");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);







        temp.setID("77");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which is a valid abstract class?");
        temp.setOPT_ONE("public abstract class Car {\n" +
                "protected void accelerate();\n" +
                "}");
        temp.setOPT_TWO("public interface Car {\n" +
                "protected abstract void accelerate();\n" +
                "}");
        temp.setOPT_THREE("public abstract class Car {\n" +
                "protected final void accelerate();\n" +
                "}");
        temp.setOPT_FOUR("public abstract class Car {\n" +
                "protected abstract void accelerate();\n" +
                "}");
        temp.setOPT_FIVE("public abstract class Car {\n" +
                "protected abstract void accelerate() {\n" +
                "//more car can do\n" +
                "}}");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("Abstract classes are classes that contain one or more abstract methods. " +
                "An abstract method is a method that is declared, but contains no implementation. " +
                "Abstract classes may not be instantiated, and require subclasses to provide implementations for the abstract methods.\n " +
                "Note : Option A is incorrect as accelerate method does not have body nor abstract keyword.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);







        temp.setID("78");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("public class Main {\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\ttry {\n" +
                "\t\t\tdoSomething();\n" +
                "\t\t}\n" +
                "\t\tcatch (SpecialException e) {\n" +
                "\t\t\tSystem.out.println(e);\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\tstatic void doSomething() {\n" +
                "\t\tint [ ] ages = new int[4];\n" +
                "\t\tages[4] = 17;\n" +
                "\t\tdoSomethingElse();\n" +
                "\t}\n" +
                "\tstatic void doSomethingElse() {\n" +
                "\t\tthrow new SpecialException(\"Thrown at end of doSomething() method\");\n" +
                "\t}\n" +
                "}\n\n" +
                "What is the output?");
        temp.setOPT_ONE("SpecialException: Thrown at end of doSomething() method");
        temp.setOPT_TWO("Error in thread \"main\" java.lang.\n" +
                "ArrayIndexOutOfBoundserror");
        temp.setOPT_THREE("Exception in thread \"main\" java.lang.ArrayIndexOutOfBoundsException: 4\n" +
                "at Main.doSomething(Main.java:12)\n" +
                "at Main.main(Main.java:4)");
        temp.setOPT_FOUR("SpecialException: Thrown at end of doSomething() method at Main.doSomethingElse(Main.java:16)\n" +
                "at Main.doSomething(Main.java:13)\n" +
                "at Main.main(Main.java:4)");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("The following line causes a runtime exception (as the index is out of bounds): ages[4] = 17; " +
                "A runtime exception is thrown as an ArrayIndexOutOfBoundsException.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("79");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("View the exhibit:\n\n" +
                "public class Student {\n" +
                "\tpublic String name = \"\";\n" +
                "\tpublic int age = 0;\n" +
                "\tpublic String major = \"Undeclared\";\n" +
                "\tpublic boolean fulltime = true;\n" +
                "\tpublic void display() {\n" +
                "\t\tSystem.out.println(\"Name: \" + name + \" Major: \" + major);\n" +
                "\t}\n" +
                "\tpublic boolean isFullTime() {\n" +
                "\t\treturn fulltime;\n" +
                "\t}\n" +
                "}\n\n" +
                "Which line of code initializes a student instance?");
        temp.setOPT_ONE("Student student1;");
        temp.setOPT_TWO("Student student1 = Student.new();");
        temp.setOPT_THREE("Student student1 = new Student();");
        temp.setOPT_FOUR("Student student1 = Student();");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Student student1 = new Student(); initializes a student instance.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);







        temp.setID("80");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("int [ ] array = {1,2,3,4,5};\n" +
                "for (int i: array) {\n" +
                "\tif ( i < 2) {\n" +
                "\t\tkeyword1 ;\n" +
                "\t}\n" +
                "\tSystem.out.println(i);\n" +
                "\tif ( i == 3) {\n" +
                "\t\tkeyword2 ;\n" +
                "\t}\n" +
                "}\n\n" +
                "What should keyword1 and keyword2 be respectively, in order to produce output 2345?");
        temp.setOPT_ONE("continue, break");
        temp.setOPT_TWO("break, break");
        temp.setOPT_THREE("break, continue");
        temp.setOPT_FOUR("continue, continue");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("3");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("If you replace keyword1 with break;, it will not print anything. " +
                "If you replace keyword2 with break;, it will not print \"45\"");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("81");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("int i, j=0;\n" +
                "i = (3* 2 + 4 +5 ) ;\n" +
                "j = (3 * ((2 + 4) + 5));\n" +
                "System.out.println(\"i:\"+ i + \"\\nj\": + j);\n\n" +
                "What is the result?");
        temp.setOPT_ONE("i:16\n" +
                "j:16");
        temp.setOPT_TWO("16");
        temp.setOPT_THREE("i:15\n" +
                "j:33");
        temp.setOPT_FOUR("33");
        temp.setOPT_FIVE("i:16\n" +
                "j:33");
        temp.setOPT_SIX("i:15\n" +
                "j:16");
        temp.setNo_Opt("5");
        temp.setCHAPTER("3");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("It is obvious!");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);


        temp.setID("82");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which two are valid instantiations and initializations of a multi dimensional array ?");

        temp.setOPT_ONE("int [ ] [ ] array 2D = { { 0, 1, 2, 4} {5, 6}};");
        temp.setOPT_TWO("int [ ] [ ] array2D = new int [2] [2];\n" +
                "array2D[0] [0] = 1;\n" +
                "array2D[0] [1] = 2;\n" +
                "array2D[1] [0] = 3;\n" +
                "array2D[1] [1] = 4;");
        temp.setOPT_THREE("int [ ] [ ] [ ] array3D = {{0, 1}, {2, 3}, {4, 5}};");
        temp.setOPT_FOUR("int [ ] [ ] [ ] array3D = new int [2] [2] [2];\n" +
                "array3D [0] [0] = array;\n" +
                "array3D [0] [1] = array;\n" +
                "array3D [1] [0] = array;\n" +
                "array3D [0] [1] = array;");
        temp.setOPT_FIVE("int [ ] [ ] array2D = {0, 1};");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("4");   // 4 : Arrays
        temp.setDIFFICULTY("2");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("B D");
        temp.setEXPLANATION("In the Java programming language, a multidimensional array is simply an array whose components are themselves arrays.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);


        temp.setID("83");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("boolean log3 = ( 5.0 != 6.0) && ( 4 != 5);\n" +
                "boolean log4 = (4 != 4) || (4 == 4);\n" +
                "System.out.println(\"log3:\"+ log3 + \\nlog4\" + log4);\n" +
                "What is the result?");
        temp.setOPT_ONE("log3:false\n" +
                "log4:true");
        temp.setOPT_TWO("log3:true\n" +
                "log4:true");
        temp.setOPT_THREE("log3:true\n" +
                "log4:false");
        temp.setOPT_FOUR("log3:false\n" +
                "log4:false");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("( 5.0 != 6.0) is true & ( 4 != 5) is also true, so and of ( 5.0 != 6.0) && ( 4 != 5) is true.\n" +
                "(4 != 4) is false and (4 == 4) is true, so or of (false || true ) is true.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("84");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which statement will empty the contents of a StringBuilder variable named sb?");
        temp.setOPT_ONE("sb.deleteAll();");
        temp.setOPT_TWO("sb.delete(0, sb.size());");
        temp.setOPT_THREE("sb.delete(0, sb.length());");
        temp.setOPT_FOUR("sb.removeAll();");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("The java.lang.StringBuilder.delete() method removes the characters in a substring of this sequence.\n" +
                "The substring begins at the specified start and extends to the character at index end - 1 " +
                "or to the end of the sequence if no such character exists. If start is equal to end, no changes are made.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("85");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("class StaticField {\n" +
                "\tstatic int i = 7;\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tStaticField obj = new StaticField();\n" +
                "\t\tobj.i++;\n" +
                "\t\tStaticField.i++;\n" +
                "\t\tobj.i++;\n" +
                "\t\tSystem.out.println(StaticField.i + \" \"+ obj.i);\n" +
                "\t}\n" +
                "}\n\n" +
                "What is the result?");
        temp.setOPT_ONE("10 10");
        temp.setOPT_TWO("8 9");
        temp.setOPT_THREE("9 8");
        temp.setOPT_FOUR("7 10");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("Static variable’s value is same for all the object(or instances) " +
                "of the class or in other words you can say that all instances(objects) of the same " +
                "class share a single copy of static variables.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("86");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which two are valid array declaration?");
        temp.setOPT_ONE("Object array[ ];");
        temp.setOPT_TWO("Boolean array[3];");
        temp.setOPT_THREE("int[ ] array;");
        temp.setOPT_FOUR("Float[2] array;");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("A C");
        temp.setEXPLANATION("The following code snippets are examples of this syntax:\n" +
                "double[ ] myList;  // preferred way.\n" +
                "or\n" +
                "double myList[ ];  //  works but not preferred way.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("87");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("public class MainMethod {\n" +
                "\tvoid main() {\n" +
                "\t\tSystem.out.println(\"one\");\n" +
                "\t}\n" +
                "\tstatic void main(String args) {\n" +
                "\t\tSystem.out.println(\"two\");\n" +
                "\t}\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tSystem.out.println(\"three\");\n" +
                "\t}\n" +
                "\tvoid main(Object[ ] args) {\n" +
                "\t\tSystem.out.println(\"four\");\n" +
                "\t}\n" +
                "}\n\n" +
                "What is printed out when the program is executed?");
        temp.setOPT_ONE("one");
        temp.setOPT_TWO("two");
        temp.setOPT_THREE("three");
        temp.setOPT_FOUR("four");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("By default always \"public static void main(String[ ] args)\" is executed." +
                " All other are normal functions,  they will be executed when called.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("88");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("A method is declared to take three arguments. A program calls this method and passes only two arguments.\n" +
                "What is the results?");
        temp.setOPT_ONE("Compilation fails.");
        temp.setOPT_TWO("The third argument is given the value null.");
        temp.setOPT_THREE("The third argument is given the value void.");
        temp.setOPT_FOUR("The third argument is given the value zero.");
        temp.setOPT_FIVE("The third argument is given the appropriate false value for its declared type.");
        temp.setOPT_SIX("An exception occurs when the method attempts to access the third argument.");
        temp.setNo_Opt("6");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("There will be compilation fail as compiler will not be able to find a function with two arguments.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);


        temp.setID("89");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("public class ForTest {\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tint[ ] array = {1,2,3};\n" +
                "\t\tfor ( foo ) {\n" +
                "\t\t}\n" +
                "\t}\n" +
                "}\n\n" +
                "Which three are valid replacements for foo so that the program will compiled and run?");
        temp.setOPT_ONE("int i: array");
        temp.setOPT_TWO("int i = 0; i < 1; i++");
        temp.setOPT_THREE(";;");
        temp.setOPT_FOUR("; i < 1; i++");
        temp.setOPT_FIVE("; i < 1;");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("2");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("A B C");
        temp.setEXPLANATION("In option 4 & 5 , 'i' is not initialized .Therefore not a valid replacement.\n" +
                "Option 1 is Enhanced For loop and Option 3 is Infinite For loop");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("90");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "public class Case {\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tString product = \"Pen\";\n" +
                "\t\tproduct.toLowerCase();\n" +
                "\t\tproduct.concat(\" BOX\".toLowerCase());\n" +
                "\t\tSystem.out.print(product.substring(4,6));\n" +
                "\t}\n" +
                "}\n\n" +
                "What is the result?\n");
        temp.setOPT_ONE("box");
        temp.setOPT_TWO("cbo");
        temp.setOPT_THREE("bo");
        temp.setOPT_FOUR("nb");
        temp.setOPT_FIVE("An exception is thrown at runtime");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("2");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("E");
        temp.setEXPLANATION("Exception in thread \"main\" java.lang.StringIndexOutOfBoundsException: " +
                "String index out of range: 6 at " +
                "java.lang.String.substring.\n" +
                "As String product is still storing value Pen.");
        temp.setDuplicate("true");
        dbActivity.insertData(temp, db);


/*
        temp.setID("90");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which two are valid instantiations and initializations of a multi dimensional array ?");

        temp.setOPT_ONE("int [ ] [ ] array 2D = { { 0, 1, 2, 4} {5, 6}};");
        temp.setOPT_TWO("int [ ] [ ] array2D = new int [2] [2];\n"+
                "array2D[0] [0] = 1;\n"+
                "array2D[0] [1] = 2;\n"+
                "array2D[1] [0] = 3;\n"+
                "array2D[1] [1] = 4;");
        temp.setOPT_THREE("int [ ] [ ] [ ] array3D = {{0, 1}, {2, 3}, {4, 5}};");
        temp.setOPT_FOUR("int [ ] [ ] [ ] array3D = new int [2] [2] [2];\n"+
                "array3D [0] [0] = array;\n"+
                "array3D [0] [1] = array;\n"+
                "array3D [1] [0] = array;\n"+
                "array3D [0] [1] = array;");
        temp.setOPT_FIVE("int [ ] [ ] array2D = {0, 1};");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("4");   // 4 : Arrays
        temp.setDIFFICULTY("2");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("B D");
        temp.setEXPLANATION("In the Java programming language, a multidimensional array is simply an array whose components are themselves arrays.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp ,db);*/


        temp.setID("91");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What will be the output ?\n\n" +
                "class Base{\n" +
                "int x = 10;\n" +
                "static int y = 20;\n" +
                "}\n" +
                "class Derived extends Base{\n" +
                "int x = 30;\n" +
                "static int y = 40;\n" +
                "}\n" +
                "\n" +
                "public class TestClass {\n" +
                "public static void main(String[ ] args) {\n" +
                "System.out.println(new Derived().x+\", \"+new Derived().y);\n" +
                "}\n" +
                "}");
        temp.setOPT_ONE("30,20");
        temp.setOPT_TWO("20,30");
        temp.setOPT_THREE("30,40");
        temp.setOPT_FOUR("40,30");
        temp.setOPT_FIVE("Compilation Fails");
        temp.setOPT_SIX("None of these");
        temp.setNo_Opt("6");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Access to static and instance fields and static methods depends on the class of " +
                "reference variable and not the actual object to which the variable points to. " +
                "Observe that this is opposite of what happens in the case of instance methods.  " +
                "In case of instance methods the method of the actual class of the object is called.\n" +
                "Therefore, in case of System.out.println(new Derived().x); the reference is of type Derived and so Derived's x will be accessed.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);


        temp.setID("92");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the code fragment:\n" +
                "int b = 3;\n" +
                "if ( !(b > 3)) {\n" +
                "\tSystem.out.println(\"square \");\n" +
                "}{\n" +
                "\tSystem.out.println(\"circle \");\n" +
                "}\n" +
                "System.out.println(\"...\");\n" +
                "What is the result?");
        temp.setOPT_ONE("square...");
        temp.setOPT_TWO("circle...");
        temp.setOPT_THREE("square circle...");
        temp.setOPT_FOUR("Compilation fails.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("2");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("There are mainly three rules for the instance initializer block. They are as follows:\n" +
                "The instance initializer block is created when instance of the class is created.\n" +
                "The instance initializer block is invoked after the parent class constructor is invoked (i.e. after super() constructor call).\n" +
                "The instance initializer block comes in the order in which they appear.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("93");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which two are Java Exception classes?");
        temp.setOPT_ONE("SecurityException");
        temp.setOPT_TWO("DuplicatePathException");
        temp.setOPT_THREE("IllegalArgumentException");
        temp.setOPT_FOUR("TooManyArgumentsException");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("A C");
        temp.setEXPLANATION("Exceptions in Java are ArithmeticException, ArrayIndexOutOfBoundsException, ClassCastException," +
                " SecurityException, IllegalArgumentException, NullPointerException, ClassNotFoundException etc");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("94");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the for loop construct:\n" +
                "for ( expr1 ; expr2 ; expr3 ) {\n" +
                "\tstatement;\n" +
                "}\n\n" +
                "Which two statements are true?");
        temp.setOPT_ONE("This is not the only valid for loop construct; there exits another form of for loop constructor.");
        temp.setOPT_TWO("The expression expr1 is optional. it initializes the loop and is evaluated once, as the loop begin.");
        temp.setOPT_THREE("When expr2 evaluates to false, the loop terminates. It is evaluated only after each iteration through the loop.");
        temp.setOPT_FOUR("The expression expr3 must be present. It is evaluated after each iteration through the loop.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("B C");
        temp.setEXPLANATION("The for statement have this forms:\n" +
                "for (init-stmt; condition; next-stmt) {\n" +
                "body\n" +
                "}\n" +
                "There are three clauses in the for statement.\n" +
                "The init-stmt statement is done before the loop is started, usually to initialize an iteration variable. The condition " +
                "expression is tested before each time the loop is done. The loop isn't executed if the boolean expression is " +
                "false (the same as the while loop). The next-stmt statement is done after the body is executed. It typically " +
                "increments an iteration variable.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("95");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("public class StringReplace {\n" +
                "public static void main(String[ ] args) {\n" +
                "String message = \"Hi everyone!\";\n" +
                "System.out.println(\"message = \" + message.replace(\"e\", \"X\")); }\n" +
                "}\n\n" +
                "What is the result?");
        temp.setOPT_ONE("message = Hi everyone!");
        temp.setOPT_TWO("message = Hi XvXryonX!");
        temp.setOPT_THREE("A compile time error is produced.");
        temp.setOPT_FOUR("A runtime error is produced.");
        temp.setOPT_FIVE("message =");
        temp.setOPT_SIX("message = Hi Xveryone!");
        temp.setNo_Opt("6");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("The replace() method searches a string" +
                " for a specified value, or a regular expression, and " +
                "returns a new string where the specified values are replaced.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("96");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which two statements are true for a two-dimensional array?");
        temp.setOPT_ONE("It is implemented as an array of the specified element type.");
        temp.setOPT_TWO("Using a row by column convention, each row of a two-dimensional array must be of the same size.");
        temp.setOPT_THREE("At declaration time, the number of elements of the array in each dimension must be specified.");
        temp.setOPT_FOUR("All methods of the class Object may be invoked on the two-dimensional array.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("A D");
        temp.setEXPLANATION("Options explains everything !");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("97");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which three statements are benefits of encapsulation?");
        temp.setOPT_ONE("allows a class implementation to change without changing the clients");
        temp.setOPT_TWO("protects confidential data from leaking out of the objects");
        temp.setOPT_THREE("prevents code from causing exceptions");
        temp.setOPT_FOUR("enables the class implementation to protect its invariants");
        temp.setOPT_FIVE("permits classes to be combined into the same package");
        temp.setOPT_SIX("enables multiple instances of the same class to be created safely");
        temp.setNo_Opt("6");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("2");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("A B D");
        temp.setEXPLANATION("Options explains everything !");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("98");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which code fragment cause a compilation error?");
        temp.setOPT_ONE("float flt = 100F;");
        temp.setOPT_TWO("float flt = (float) 1_11.00;");
        temp.setOPT_THREE("float flt = 100;");
        temp.setOPT_FOUR("double y1 = 203.22;\n" +
                "float flt = y1;");
        temp.setOPT_FIVE("int y2 = 100;\n" +
                "float flt = (float) y2;");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("2");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("Exception in thread \"main\" java.lang.Error: Unresolved compilation problem:\n" +
                "Type mismatch: cannot convert from double to float");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("99");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n" +
                "class X {\n" +
                "\tstatic void m (int[ ] i) {\n" +
                "\t\ti[0] += 7;\n" +
                "\t}\n" +
                "\tpublic static void main (String[ ] args) {\n" +
                "\t\tint[ ] j = new int[1];\n" +
                "\t\tj[0] = 12;\n" +
                "\t\tm( j );\n" +
                "\t\tSystem.out.println(j[0]);\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("7");
        temp.setOPT_TWO("12");
        temp.setOPT_THREE("19");
        temp.setOPT_FOUR("Compilation fails.");
        temp.setOPT_FIVE("An exception is thrown at runtime.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("i[0] += 7; ie 12 + 7 = 19");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("100");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Select the correct option:");
        temp.setOPT_ONE("Only an abstract class can be used as a base class to implement polymorphism " +
                "with classes.");
        temp.setOPT_TWO("Polymorphic methods are also called overridden methods.");
        temp.setOPT_THREE("In polymorphism, depending on the exact type of object, the JVM executes the\n" +
                "appropriate method at compile time.");
        temp.setOPT_FOUR("None of the above.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("2");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("Option (a) is incorrect. To implement polymorphism with classes, either an abstract " +
                "class or a concrete class can be used as a base class.\n" +
                "Option (c) is incorrect. First of all, no code execution takes place at compile time. " +
                "Code can only execute at runtime. In polymorphism, the determination of the exact " +
                "method to execute is deferred until runtime and is determined by the exact type of " +
                "the object on which a method needs to be called.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);







        temp.setID("101");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Consider the below code :-\n\n" +
                "package ocjp;\n" +
                "////INSERT CODE HERE\n\n" +
                "public class A{\n" +
                "\tpublic A(){\n" +
                "\t\tout.println(SIZE);\n" +
                "\t}\n" +
                "}\n\n" +
                "Select two options, which should be inserted at ////INSERT CODE HERE, will compile without any errors?\n\n" +
                "(Note : java.lang.Integer has a static field named SIZE)");

        temp.setOPT_ONE("import static java.lang.System.*;");
        temp.setOPT_TWO("static import java.lang.System.*;");
        temp.setOPT_THREE("import static java.lang.Integer;");
        temp.setOPT_FOUR("import static java.lang.Integer.SIZE;");
        temp.setOPT_FIVE("static import java.lang.Integer.*;");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("A D");
        temp.setEXPLANATION("1.Correct way of importing is import static ....\n" +
                "2.\"out\" is the \"standard\" output stream in java.lang.System\n" +
                "3.You can import a specific member using java.lang.Integer.SIZE or all the static members java.lang.Integer.*");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("102");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("class A { static String temp = \"In A\"; }\n" +
                "\n" +
                "class B extends A{\n" +
                "\tstatic { System.out.print(\"In B\"); }\n" +
                "}\n" +
                "public class OCJP{\n" +
                "\tpublic static void main(String[ ] args){\n" +
                "\t\tSystem.out.println(B.temp);\n" +
                "\t}\n" +
                "}\n" +
                "What will be the output ?");
        temp.setOPT_ONE("Depends on the implementation of JVM. ");
        temp.setOPT_TWO("Compilation Fail");
        temp.setOPT_THREE("It will print In A.");
        temp.setOPT_FOUR("It will print In B and In A.");
        temp.setOPT_FIVE("None of the above.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("3");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("When Initialization Occurs A class or interface type T will be initialized immediately before the first occurrence of any one of the following:\n" +
                "\n" +
                "• T is a class and an instance of T is created.\n" +
                "• T is a class and a static method declared by T is invoked.\n" +
                "• A static field declared by T is assigned.\n" +
                "• A static field declared by T is used and the field is not a constant variable.\n" +
                "• T is a top level class , and an assert statement  lexically nested within T is executed.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("103");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n" +
                "class A {}   \n" +
                "class B extends A {}   \n" +
                "class C extends B {} \n" +
                "class D extends C {} \n" +
                "D d = new D();  \n" +
                "The expression (d instanceof A) will return true.");
        temp.setOPT_ONE("True");
        temp.setOPT_TWO("False");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("2");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("D extends C, which extends B, which extends A. " +
                "This means, D is-a C, C is-a B, and B is-a A. Therefore, D is-a A. " +
                "Hence, d instanceof A will return true.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("104");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n" +
                "class A{\n" +
                "\tpublic void print() {   }\n" +
                "}\n" +
                "class B extends A{\n" +
                "\tpublic void print() {   }\n" +
                "}\n" +
                "class C extends B{\n" +
                "\tpublic void print(){   }\n" +
                "}\n\n" +
                "Select the two correct options.");
        temp.setOPT_ONE("You can access class B's print() using super.print() from class C. ");
        temp.setOPT_TWO("You can access class A's print() using ( (A) this ).print() from class C.");
        temp.setOPT_THREE("You cannot access class A's print() from class C for the same object ( i.e. this). ");
        temp.setOPT_FOUR("You can access class A's print() using super.super.print() from class C.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("3");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("A C");
        temp.setEXPLANATION("You can't access A's print() from class C in any case as there is no such construct super.super");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("105");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("\n" +
                "public class SampleClass {\n" +
                "\tpublic static void main(String[ ] args) {  \n" +
                "\t\tList<String> l = new ArrayList<>();\n" +
                "\t\tStringBuilder sb = new StringBuilder(\"OCJP\");  \n" +
                "\t\tString s = sb.toString();\n" +
                "\t\tl.add(s); \n" +
                "\t\tSystem.out.println(l.getClass()); \n" +
                "\t\tSystem.out.println(s.getClass()); \n" +
                "\t}\n" +
                "}\n\n" +
                "What will be the output ?");
        temp.setOPT_ONE("class java.lang.Object\n" +
                "class java.util.ArrayList");
        temp.setOPT_TWO("class java.lang.String\n" +
                "class java.util.List");
        temp.setOPT_THREE("class java.lang.String\n" +
                "class java.util.Object");
        temp.setOPT_FOUR("class java.util.ArrayList\n" +
                "class java.lang.String");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("2");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("The java.lang.Object.getClass() method returns the runtime class of an object.\n" +
                "Therefore s.getClass() will return class java.lang.String as s refers to an object of class String " +
                "and l.getClass() will return class java.lang.ArrayList as l refers to an object of class ArrayList.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("106");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n" +
                "\n" +
                "//Line 1\n" +
                "\n" +
                "\tpublic abstract void draw();\n" +
                "}\n" +
                "\n" +
                "//Line 2\n" +
                "\n" +
                "\tpublic void draw(){  System.out.println(\"in draw...\"); }\n" +
                "}\n\n" +
                "Select two options which can be replaced at line 1 & line 2 to complete the code.");
        temp.setOPT_ONE("class Shape { \nand \nclass Circle extends Shape {");
        temp.setOPT_TWO("public class Shape {  \n" +
                "and \nclass Circle extends Shape {");
        temp.setOPT_THREE("abstract Shape {  \n" +
                "and \npublic class Circle extends Shape {");
        temp.setOPT_FOUR("public abstract class Shape {  \n" +
                "and \nclass Circle extends Shape {");
        temp.setOPT_FIVE("public abstract class Shape {  \n" +
                "and \nclass Circle implements Shape {");
        temp.setOPT_SIX("public interface Shape {  \n" +
                "and \nclass Circle implements Shape {");
        temp.setNo_Opt("6");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("3");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("D F");
        temp.setEXPLANATION("Option A & B: Since there is an abstract method in the first class, the class must be declared abstract.\n" +
                "Option C: class keyword is missing from the first declaration.\n" +
                "Option E: You can only implement an interface not a class. So Circle implements shape is wrong.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);







        temp.setID("107");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n\n" +
                "class Sample{    \n" +
                "\tpublic static void main(String[ ] args){       \n" +
                "\t\tA a = new A();       \n" +
                "\t\tB b = new B();    \n" +
                "\t}\n" +
                "}\n" +
                "class A implements M1, M2{}\n" +
                "class B extends A implements M1{}\n" +
                "interface M1 { }\n" +
                "interface M2 { }\n\n" +
                "Select 4 options which are correct.");
        temp.setOPT_ONE("(b instanceof T1) will return true.");
        temp.setOPT_TWO("(a instanceof T1) will return true.");
        temp.setOPT_THREE("(a instanceof T2) will return true.");
        temp.setOPT_FOUR("(b instanceof T2) will return true.");
        temp.setOPT_FIVE("(b instanceof A) will return false.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("A B C D");
        temp.setEXPLANATION("Option E: It will return true because B extends A and 'b' is referring to an object of class B.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("108");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "public class Sample {\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tint m=0, n=10;\n" +
                "\t\twhile (m <= n) {\n" +
                "\t\t\tm++;\n" +
                "\t\t\tn--;\n" +
                "\t\t}\n" +
                "\t\tSystem.out.println(m+\" \"+n);     \n" +
                "\t}\n" +
                "}\n\n" +
                "What is the result?");
        temp.setOPT_ONE("6 4");
        temp.setOPT_TWO("6 5");
        temp.setOPT_THREE("6 6");
        temp.setOPT_FOUR("5 4");
        temp.setOPT_FIVE("5 3");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("3");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("Initially m=0, n=10\n" +
                "Iteration 1: m<=n is true, m becomes 1 and n becomes 9\n" +
                "Iteration 2: m<=n is true, m becomes 2 and n becomes 8\n" +
                "Iteration 3: m<=n is true, m becomes 3 and n becomes 7\n" +
                "Iteration 4: m<=n is true, m becomes 4 and n becomes 6\n" +
                "Iteration 5: m<=n is true, m becomes 5 and n becomes 5\n" +
                "Iteration 6: m<=n is true, m becomes 6 and n becomes 4\n" +
                "Iteration 7: m<=n is false so the while loop is not entered.\n" +
                "Print 6 and 4.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("109");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n" +
                "\n" +
                "int count = 0, sum = 0;\n" +
                "do{\n" +
                "\tif(count % 3 == 0) continue;\n" +
                "\tsum+=count;\n" +
                "}\n" +
                "while(count++ < 11);\n" +
                "System.out.println(sum);\n" +
                "\n" +
                "What will be the output ?");
        temp.setOPT_ONE("36");
        temp.setOPT_TWO("37");
        temp.setOPT_THREE("38");
        temp.setOPT_FOUR("46");
        temp.setOPT_FIVE("48");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("2");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("E");
        temp.setEXPLANATION("When count is divisible by 3 then sum+=count dosen't execute " +
                "& do while will continue till count is less than 11.\n" +
                "Therefore, result is 1+2+4+5+7+8+10+11");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("110");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n" +
                "\n" +
                "public class SampleClass{\n" +
                "\tpublic static void main(String[ ] args){\n" +
                "\t\tint[ ] arr = { 1, 2, 3, 4, 5, 6 };\n" +
                "\t\tint counter = 0;\n" +
                "\t\tfor (int value : arr){\n" +
                "\t\t\tif (counter >= 5) {\n" +
                "\t\t\t\tbreak;\n" +
                "\t\t\t} else {\n" +
                "\t\t\t\tcontinue;\n" +
                "\t\t\t}\n" +
                "\t\t\tif (value > 4) {\n" +
                "\t\t\t\tarr[counter] = value + 1;\n" +
                "\t\t\t}\n" +
                "\t\t\tcounter++;\n" +
                "\t\t}\n" +
                "\t\tSystem.out.println(arr[counter]);\n" +
                "\t}\n" +
                "}\n" +
                "\n" +
                "What will be the output ?");
        temp.setOPT_ONE("It will throw exception");
        temp.setOPT_TWO("It will not even compile");
        temp.setOPT_THREE("5");
        temp.setOPT_FOUR("6");
        temp.setOPT_FIVE("7");
        temp.setOPT_SIX("8");
        temp.setNo_Opt("6");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("3");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("Check the if-else condition having break & continue. The rest of the code below is unreachable.\n" +
                "Therefore, it will not even compile.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("111");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Consider the following code snippet :\n\n" +
                "public static void main(String[ ] args) throws Exception{\n" +
                "int i = 1, j = 10;\n" +
                "do {\n" +
                "\tif (i++ < --j) continue;\n" +
                "} while (i < 5);\n" +
                "\tSystem.out.println(\"i=\" + i + \" j=\" + j);\n" +
                "}\n\n" +
                "What will be the output ?");
        temp.setOPT_ONE("i=6 j=6");
        temp.setOPT_TWO("i=5 j=6");
        temp.setOPT_THREE("i=6 j=5");
        temp.setOPT_FOUR("i=5 j=5");
        temp.setOPT_FIVE("None of these");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("2");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("To understand the flow let's see the first iteration:\n" +
                "if (1++ < --10) i.e true , so it will continue. Likewise," +
                "Iteration 2 : if(2++ < --9)\n" +
                "Iteration 3 : if(3++ < --8)\n" +
                "Iteration 4 : if(4++ < --7)\n" +
                "After Iteration 4 , i = 5 & j =6. At this stage, the do-while condition will become false. " +
                "Therefore, it will print i=5 j=6.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("112");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "public class SampleClass {\n" +
                "\tpublic static void main(String[ ] args) throws Exception {\n" +
                "\t\tString[ ] sa = {\"a\", \"b\", \"c\"};\n" +
                "\t\tfor(String s :  sa){\n" +
                "\t\t\tif(\"b\".equals(s)) continue;\n" +
                "\t\t\tSystem.out.println(s);\n" +
                "\t\t\tif(\"b\".equals(s)) break;\n" +
                "\t\t\tSystem.out.println(s+\" again\");\n" +
                "\t\t}\n" +
                "\t} \n" +
                "}\n\n" +
                "What will be the output ?");
        temp.setOPT_ONE("a\n" +
                "a again\n" +
                "c\n" +
                "c again");
        temp.setOPT_TWO("a\n" +
                "a again\n" +
                "b");
        temp.setOPT_THREE("a\n" +
                "a again\n" +
                "b\n" +
                "b again");
        temp.setOPT_FOUR("c\n" +
                "c again");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("Iteration 1: s is \"a\". It is not equal to \"b\" so, it will print \"a\", and then \"a again\".\n" +
                "Iteration 2: s is \"b\". It is equal to \"b\", so the first if will execute \"continue\", which mean the rest of " +
                "the code in the loop will not be executed (thus b and b again will not be printed), and the next iteration will start. " +
                "Note that the second if is not executed at all because of the continue in the first if.\n" +
                "Iteration 3: s is \"c\", both the if conditions are not satisfied. So \"c\" and \"c again\" will be printed.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("113");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "public class SampleClass{\n" +
                "\tpublic void loopTest(int x){\n" +
                "\t\tloop: for (int i = 1; i < 5; i++){\n" +
                "\t\t\tfor (int j = 1; j < 5; j++){\n" +
                "\t\t\t\tSystem.out.println(i);\n" +
                "\t\t\t\tif (x == 0) {  continue loop;  }\n" +
                "\t\t\t\tSystem.out.println(j);\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\t}\n" +
                "}\n\n" +
                "What will be the output if 0 is passed to loopTest.");
        temp.setOPT_ONE("Produces no output");
        temp.setOPT_TWO("The program will not compile.");
        temp.setOPT_THREE("It will print 1 2 3 4");
        temp.setOPT_FOUR("It will print 1 1 2 3 4");
        temp.setOPT_FIVE("It will print 1 1 2 2 3 3 4 4");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("In every iteration x = 0 , so it will continue again from the outer loop. " +
                "Therefore, i will be printed for each iteration & j will never be printed.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("114");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n\n" +
                "String hello = \"\";\n" +
                "hello.concat(\"Hello \");\n" +
                "hello.concat(\"World\");\n" +
                "System.out.print(hello);\n\n" +
                "What will be the output ?");
        temp.setOPT_ONE("Hello ");
        temp.setOPT_TWO("World");
        temp.setOPT_THREE("Hello World");
        temp.setOPT_FOUR("It will not print anything i.e empty string");
        temp.setOPT_FIVE("It will not compile as there is no concat() method in String class.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("In java, string objects are immutable. Immutable simply means unmodifiable or unchangeable. " +
                "Therefore, doing hello.concat(\"Hello\") will create a new string \"hello\" " +
                "but will not affect the original string \"\". ");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("115");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("public class SampleClass{\n" +
                "\tstatic boolean b;\n" +
                "\tstatic int[ ] m = new int[1];\n" +
                "\tstatic int ch;\n" +
                "\tstatic boolean[ ] n = new boolean[1];\n" +
                "\tpublic static void main(String args[ ]) throws Exception{\n" +
                "\t\tboolean x = false;\n" +
                "\t\tif( b ){\n" +
                "\t\t\tx = ( ch == m[ch]);\n" +
                "\t\t}\n" +
                "\t\telse x = ( n[ch] = b );\n" +
                "\t\t\tSystem.out.println(x+\" \"+n[ch]);\n" +
                "\t}\n" +
                "}\n\n" +
                "What will be the output");
        temp.setOPT_ONE("true false");
        temp.setOPT_TWO("true true");
        temp.setOPT_THREE("false false");
        temp.setOPT_FOUR("false true");
        temp.setOPT_FIVE("It will not even compile");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("3");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Note : Booleans are initialized to false, numeric types to 0 and object references to null.\n" +
                "Firstly, b is false so else part will be executed. " +
                "ch is a numeric type so its value is 0. In else part n[ch] = false i.e n[0] = false & x is also assigned to false.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("116");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of these lines will compile?\n" +
                "Select 3 options");
        temp.setOPT_ONE("short s = 12 ;");
        temp.setOPT_TWO("long g = 012 ;");
        temp.setOPT_THREE("int i = (int) false;");
        temp.setOPT_FOUR("float f = -123;");
        temp.setOPT_FIVE("float d = 0 * 1.5;");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("A B D");
        temp.setEXPLANATION("Option A : 12 can fit in short.\n" +
                "Option B : 012 is a valid octal number.\n" +
                "Option C : Boolean cannot be converted into other data types.\n" +
                "Option D : Implicit widening conversion will occur in this case.\n" +
                "Option E : Double cannot be implicitly narrowed to a float even though the value is representable by a float.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("117");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Select two valid declarations of an integer variable?");
        temp.setOPT_ONE("final int x = 10;");
        temp.setOPT_TWO("global int x = 10;");
        temp.setOPT_THREE("Int x = 10;");
        temp.setOPT_FOUR("static int x = 10;");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("A D");
        temp.setEXPLANATION("Option B : Global is not a valid modifier.\n" +
                "Option C : capital I is invalid");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("118");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the following code snippet:\n\n" +
                "int rate = 10;\n" +
                "int t = 5;\n" +
                "XXX amount = 1000.0;\n" +
                "for(int i=0; i<t; i++){\n" +
                "\tamount = amount*(1 - rate/100);\n" +
                "}\n\n" +
                "What can XXX be?");
        temp.setOPT_ONE("int");
        temp.setOPT_TWO("long");
        temp.setOPT_THREE("only double");
        temp.setOPT_FOUR("double or float");
        temp.setOPT_FIVE("float");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("2");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("1000.0 is of type double.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("119");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n\n" +
                "class MyString extends String{\n" +
                "\tMyString(){ super(); }\n" +
                "}\n\n" +
                "The above code will not compile.");
        temp.setOPT_ONE("True");
        temp.setOPT_TWO("False");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("2");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("This will not compile because String is a final class and final classes cannot be extended.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("120");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Consider:\n" +
                "o1 and o2 denote two object references to two different objects of the same class.\n" +
                "Which of the following statements are true?");
        temp.setOPT_ONE("o1.equals(o2) will always be false.");
        temp.setOPT_TWO("o1.hashCode() == o2.hashCode() will always be false.");
        temp.setOPT_THREE("o1 == o2 will always be false.");
        temp.setOPT_FOUR("Nothing can be said about o1.equals(o2) regarding what it will return based on the given information.");
        temp.setOPT_FIVE("Nothing can be said about o1 == o2.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("3");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("C D");
        temp.setEXPLANATION("Option A : It depends on how the equals method is overridden. If it is not overridden, then it will return false.\n" +
                "Option B : hashCode() can be overridden and so the given statements is not true.\n" +
                "Option C : The == operator compares whether the two references are pointing to the same object or not. Here, they are not, so it returns false.\n" +
                "Option D : It depends on how the class implements this method.\n" +
                "Option E : It will always return false if references are to two different objects.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("121");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :" +
                "class SampleClass{\n" +
                "\tstatic boolean a;\n" +
                "\tstatic boolean b;\n" +
                "\tstatic boolean c;\n" +
                "\tpublic static void main (String[ ] args){\n" +
                "\t\tboolean bool = (a = true) || (b = true) && (c = true);\n" +
                "\t\tSystem.out.print(a + \", \" + b + \", \" + c);\n" +
                "\t}\n" +
                "}\n\n" +
                "What will be the output ?");
        temp.setOPT_ONE("true, true, false");
        temp.setOPT_TWO("true, false, true");
        temp.setOPT_THREE("true, false, false");
        temp.setOPT_FOUR("true, true, true");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("3");
        temp.setDIFFICULTY("3");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Variable a,b,c is static so it will be initialized false.\n" +
                "boolean bool = (a = true) || (b = true) && (c = true); , " +
                "it will try to evaluate the expression from left to right. " +
                "As (a = true) will evaluate as true." +
                " So java will not try to execute the right hand expression because of \"or\" operator.\n");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);


        temp.setID("122");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n\n" +
                "public class SampleClass {\n" +
                "\tpublic static int increment(int i){\n" +
                "\t\treturn ++i;\n" +
                "\t}\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tint m = increment(args.length);\n" +
                "\t\tm += 3 + ++m;\n" +
                "\t\tSystem.out.println(m);\n" +
                "\t}\n" +
                "}\n\n" +
                "What will the following code print when run without any arguments ...");
        temp.setOPT_ONE("5");
        temp.setOPT_TWO("6");
        temp.setOPT_THREE("7");
        temp.setOPT_FOUR("It will throw NullPointerException.");
        temp.setOPT_FIVE("It will throw ArrayIndexOutOfBoundsException.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("3");
        temp.setDIFFICULTY("3");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("int m = increment(args.length); i.e m = 1 as the length is 0 & increment will return 1." +
                "Now expand m += 3 + ++m; i.e m = m + 3 + ++m; . It will evaluate as m = 1 + 3 + 2");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("123");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n" +
                "\n" +
                "boolean m = false;\n" +
                "boolean n = false;\n" +
                "if (n != m = !n){\n" +
                "\tSystem.out.println(\"true\");\n" +
                "}\n" +
                "else{\n" +
                "\tSystem.out.println(\"false\"); \n" +
                "}\n" +
                "\n" +
                "What will be the output ?");
        temp.setOPT_ONE("It will print nothing");
        temp.setOPT_TWO("Runtime error");
        temp.setOPT_THREE("It will print true");
        temp.setOPT_FOUR("It will print false");
        temp.setOPT_FIVE("Compile time error");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("3");
        temp.setDIFFICULTY("3");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("E");
        temp.setEXPLANATION("Boolean operators have more precedence than =.\n" +
                "So, in (n != m = !n)  first n != m is evaluated which returns a value 'false'. " +
                "So the expression becomes false = !n. And this is illegal because false is a value and not a variable!");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("124");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following is valid operator in Java?");
        temp.setOPT_ONE("sizeof");
        temp.setOPT_TWO("<<<");
        temp.setOPT_THREE("instanceof");
        temp.setOPT_FOUR("mod");
        temp.setOPT_FIVE("equals");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("3");
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Note : Boolean equals(Object o) is a method in java.lang.Object. It is not an operator.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("125");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n" +
                "\n" +
                "public class Sample{\n" +
                "\tpublic void test(){\n" +
                "\t\ttest1(10, 20);  //1\n" +
                "\t}\n" +
                "\n" +
                "\tpublic void test1(int i, int... j){\n" +
                "\t\tSystem.out.println(\"1\");\n" +
                "\t}\n" +
                "\tpublic void test1(int... i ){\n " +
                "\t\tSystem.out.println(\"2\");\n" +
                "\t}\n" +
                "\tpublic void test1(int i, int j){\n" +
                "\t\tSystem.out.println(\"3\");\n" +
                "\t}\n" +
                "\n" +
                "\tpublic static void main(String[ ] args){\n" +
                "\t\tnew Sample().test();\n" +
                "\t} \n" +
                "}\n" +
                "What will be the output ?");
        temp.setOPT_ONE("1");
        temp.setOPT_TWO("2");
        temp.setOPT_THREE("3");
        temp.setOPT_FOUR("It will not compile.");
        temp.setOPT_FIVE("None of these");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("3");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("In cases where multiple methods are applicable, the compiler always calls the most specific one." +
                " In this case, the third one is the most specific one. \n" +
                "If no method is more specific than the other, then the compilation fails. ");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("126");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n" +
                "\n" +
                "public class SampleClass{\n" +
                "\tpublic void test(Object o){\n" +
                "\t\tSystem.out.println(\"Object Version\");\n" +
                "\t}\n" +
                "\tpublic void test(java.io.FileNotFoundException s){\n" +
                "\t\tSystem.out.println(\"java.io.FileNotFoundException Version\");\n" +
                "\t}\n" +
                "\tpublic void test(java.io.IOException s){\n" +
                "\t\tSystem.out.println(\"IOException Version\");\n" +
                "\t}\n" +
                "\tpublic static void main(String args[ ]){\n" +
                "\t\tSampleClass tc = new SampleClass();\n" +
                "\t\ttc.test(null);\n" +
                "\t}\n" +
                "}\n" +
                "\n" +
                "What would be the output when the above program is compiled and run? \n" +
                "(Assume that FileNotFoundException is a subclass of IOException, which in turn is a subclass of Exception)");
        temp.setOPT_ONE("It will print Object Version");
        temp.setOPT_TWO("It will print java.io.IOException Version");
        temp.setOPT_THREE("It will print java.io.FileNotFoundException Version");
        temp.setOPT_FOUR("It will not compile.");
        temp.setOPT_FIVE("None of these");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("3");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Here, null can be passed to all the 3 methods but FileNotFoundException class" +
                " is the subclass of IOException which in turn is the subclass of Object." +
                " So, FileNotFoundException class is the most specific class. So, this method is called.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("127");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("public class SampleClass{\n" +
                "\tpublic static void main(String[ ] args) throws Exception {\n" +
                "\t\tSampleClass m = new SampleClass();\n" +
                "\t\tint i = m.call();\n" +
                "\t\tdouble d = m.call();\n" +
                "\t\tSystem.out.println( i + d );\n" +
                "\t}\n" +
                "\tpublic int call() {\n" +
                "\t\treturn 1;\n" +
                "\t}\n" +
                "\tpublic double call(){ \n" +
                "\t\treturn 3.0;\n" +
                "\t}\n" +
                "}\n" +
                "\n" +
                "What will be the output ?");
        temp.setOPT_ONE("13.0");
        temp.setOPT_TWO("4.0");
        temp.setOPT_THREE("4");
        temp.setOPT_FOUR("The code will not compile.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("2");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("You cannot have more than one method in a class with the same signature.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("128");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("public class OCJP{\n" +
                "\tlong l;\n" +
                "\tpublic void OCJP(long varLong) { //(1)\n" +
                "\t\tl = varLong ;\n" +
                "\t}\n" +
                "\tpublic static void main(String args[ ]){\n" +
                "\t\tOCJP a, b ;\n" +
                "\t\ta = new OCJP();  //(2)\n" +
                "\t\tb = new OCJP(8);  //(3)\n" +
                "\t}\n" +
                "}\n" +
                "\n" +
                "What will be the result of attempting to compile the following program?");
        temp.setOPT_ONE("A compilation error will be encountered at (1), since constructors should not specify a return value.");
        temp.setOPT_TWO("A compilation error will be encountered at (2), since the class does not have a default constructor.");
        temp.setOPT_THREE("A compilation error will be encountered at (3).");
        temp.setOPT_FOUR("The program will compile correctly.");
        temp.setOPT_FIVE("It will not compile because parameter type of the constructor is different than the type of value passed to it.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("2");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Because (1) is a method and not a constructor. So there is no constructor that take a parameter.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("129");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("public class Test {\n" +
                "\tpublic int height;\n" +
                "\tpublic void setHeight(int newHeight) {\n" +
                "\t\tif (newHeight <= 300)\n" +
                "\t\t\theight = newHeight;\n" +
                "\t}\n" +
                "}\n" +
                "\n" +
                "Select the correct option ?");
        temp.setOPT_ONE("The height of a Person can never be set to more than 300.");
        temp.setOPT_TWO("The previous code is an example of a well-encapsulated class.");
        temp.setOPT_THREE("The class would be better encapsulated if the height validation weren’t set to 300.");
        temp.setOPT_FOUR("Even though the class isn’t well encapsulated, it can be inherited by other classes.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("This class isn’t well encapsulated because its instance variable height is " +
                "defined as a public member. Because the instance variable can be directly accessed " +
                "by other classes, the variable doesn’t always use the method setHeight to set its " +
                "height. The class Person can’t control the values that can be assigned to its public " +
                "variable height.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("130");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("How can you include encapsulation in your class design?");
        temp.setOPT_ONE("Define instance variables as private members.");
        temp.setOPT_TWO("Define public methods to access and modify the instance variables.");
        temp.setOPT_THREE("Define some of the instance variables as public members.");
        temp.setOPT_FOUR("All of the previous.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("2");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("A B");
        temp.setEXPLANATION("A well-encapsulated class should be like a capsule, hiding its instance " +
                "variables from the outside world. The only way you should access and modify " +
                "instance variables is through the public methods of a class to ensure that the outside " +
                "world can access only the variables the class allows it to. By defining methods to " +
                "assign values to its instance variables, a class can control the range of values that can " +
                "be assigned to them.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("131");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following code?\n\n" +
                "class SampleClass {\n" +
                "\tpublic static void main(String args[ ]) {\n" +
                "\t\tint ejg = 10;\n" +
                "\t\tanotherMethod(ejg);\n" +
                "\t\tSystem.out.println(ejg);\n" +
                "\t\tsomeMethod(ejg);\n" +
                "\t\tSystem.out.println(ejg);\n" +
                "\t}\n" +
                "\tstatic void someMethod(int val) {\n" +
                "\t\t++val;\n" +
                "\t\tSystem.out.println(val);\n" +
                "\t}\n" +
                "\tstatic void anotherMethod(int val) {\n" +
                "\t\tval = 20;\n" +
                "\t\tSystem.out.println(val);\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("20\n" +
                "10\n" +
                "11\n" +
                "11");
        temp.setOPT_TWO("20\n" +
                "20\n" +
                "11\n" +
                "10");
        temp.setOPT_THREE("20\n" +
                "10\n" +
                "11\n" +
                "10");
        temp.setOPT_FOUR("Compilation error");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("When primitive data types are passed to a method, the values of the variables " +
                "in the calling method remain the same. This behavior doesn’t depend on " +
                "whether the primitive values are reassigned other values or modified by addition, subtraction, " +
                "or multiplication—or any other operation.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("132");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n" +
                "\n" +
                "void m1() throws Exception{\n" +
                "\ttry{\n" +
                "\t\t// line1\n" +
                "\t}\n" +
                "\tcatch (IOException e){\n" +
                "\t\tthrow new SQLException();\n" +
                "\t}\n" +
                "\tcatch(SQLException e){\n" +
                "\t\tthrow new InstantiationException();\n" +
                "\t}\n" +
                "\tfinally{\n" +
                "\t\tthrow new CloneNotSupportedException();\n" +
                "\t}\n" +
                "}\n" +
                "\n" +
                "Which of the following statements are true?");
        temp.setOPT_ONE("If IOException gets thrown at line1, then the whole method will end up throwing SQLException.");
        temp.setOPT_TWO("If IOException gets thrown at line1, then the whole method will end up throwing InstantiationException()");
        temp.setOPT_THREE("If IOException gets thrown at line1, then the whole method will end up throwing CloneNotSupportedException.");
        temp.setOPT_FOUR("If no exception is thrown at line1, then the whole method will end up throwing CloneNotSupportedException.");
        temp.setOPT_FIVE("If SQLException gets thrown at line1, then the whole method will end up throwing InstantiationException()");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("3");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("C D");
        temp.setEXPLANATION("The fundamental concepts at play here are:\n" +
                "\n" +
                "1. The Exception that is thrown the last, is the Exception that is thrown by the method to the caller.\n" +
                "So, when no exception or any exception is thrown at line 1, the control goes to finally or some catch block. " +
                "Now, even if the catch blocks throws some exception, the control goes to finally. " +
                "The finally block throws CloneNotSupportedException, so the method ends up throwing CloneNotSupportedException. " +
                "Other exceptions thrown by the code prior to this point are lost.\n" +
                "2. Exception thrown by a catch cannot be caught by the following catch blocks at the same level. " +
                "So, if IOException is thrown at line 1, the control goes to first catch which throws SQLException. " +
                "Now, although there is a catch for SQLException, it won't catch the exception because it is at the same level. " +
                "So, the control goes to the finally and same process as explained above continues. " +
                "Any exceptions thrown before this exception are lost.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("133");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Identify the exceptions that are usually thrown by the JVM and the exceptions usually thrown by an application.");
        temp.setOPT_ONE("JVM : IllegalStateException, IllegalArgumentException\n" +
                "Application :  ClassCastException, NullPointerException, SecurityException");
        temp.setOPT_TWO("JVM : IllegalStateException, IllegalArgumentException, ClassCastException\n" +
                "Application :   NullPointerException, SecurityException");
        temp.setOPT_THREE("JVM : IllegalStateException, IllegalArgumentException, ClassCastException, NullPointerException\n" +
                "Application :  SecurityException");
        temp.setOPT_FOUR("JVM : ClassCastException, NullPointerException, SecurityException\n" +
                "Application :  IllegalStateException, IllegalArgumentException");
        temp.setOPT_FIVE("JVM : ClassCastException, NullPointerException\n" +
                "Application :  IllegalStateException, IllegalArgumentException, SecurityException");
        temp.setOPT_SIX("JVM : ClassCastException, NullPointerException, IllegalStateException\n" +
                "Application :  IllegalArgumentException, SecurityException");
        temp.setNo_Opt("6");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("2");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("E");
        temp.setEXPLANATION("A quick way to determine who should throw an exception is to see if the exception extends java.lang.Error." +
                " Errors are always thrown only by the JVM.  " +
                "Generally, RuntimeExceptions are also thrown by the JVM. " +
                "However, it is ok for an application code to throw a RuntimeException if it makes sense for " +
                "the application to throw a RuntimeException in a given situation.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("134");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Select the two incorrect statements:");
        temp.setOPT_ONE("java.lang.Throwable is the base class of all type of exceptions.");
        temp.setOPT_TWO("If a class is a subclass of java.lang.Exception, it may or may not be a checked\n" +
                "exception.");
        temp.setOPT_THREE("Error is an unchecked exception.");
        temp.setOPT_FOUR("Error and checked exceptions need not be part of a method signature.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("2");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("C D");
        temp.setEXPLANATION("Option C : is a false statement. Error is not an exception. It does not subclass " +
                "java.lang.Exception.\n" +
                "Option D : is also a false statement. Error need not be part of a method signature, " +
                "but checked exceptions must be a part of the method signatures.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("135");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n\n" +
                "public class SampleClass{\n" +
                "\tpublic static void main(String[ ] args){\n" +
                "\t\ttry{\n" +
                "\t\t\tSystem.exit(0);\n" +
                "\t\t}\n" +
                "\t\tfinally{\n" +
                "\t\t\tSystem.out.println(\"finally is always executed!\");\n" +
                "\t\t}\n" +
                "\t}\n" +
                "}\n\n" +
                "What will be the output ?");
        temp.setOPT_ONE("It will print  \"finally is always executed!\"");
        temp.setOPT_TWO("It will not compile as there is no catch block.");
        temp.setOPT_THREE("It will not print anything.");
        temp.setOPT_FOUR("An exception will be thrown");
        temp.setOPT_FIVE("None of the above.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("This is exception to the fact \"finally is always executed\". \n" +
                "JVM exits whenever you call System.exit(0)");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("136");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("The following class will print 'index = 2' when compiled and run.\n\n" +
                "class SampleClass{\n" +
                "\tpublic static int[ ] getArray() {  return null;  }\n" +
                "\tpublic static void main(String[ ] args){\n" +
                "\t\tint index = 1;\n" +
                "\t\ttry{\n" +
                "\t\t\tgetArray()[index=2]++;\n" +
                "\t\t}\n" +
                "\t\tcatch (Exception e){  }  //empty catch\n" +
                "\t\tSystem.out.println(\"index = \" + index);\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("True");
        temp.setOPT_TWO("False");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("2");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("3");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("The embedded assignment of 2 to index occurs before the check for array reference produced by getArray().\n" +
                "This means, first index = 2 will be executed, which assigns 2 to index. After that null[2] is executed," +
                " which throws a NullPointerException. But this exception is caught by the catch block, which prints nothing.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("137");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("int[ ] scores = { 1, 2, 3, 4, 5, 6};\n" +
                "System.arraycopy(scores, 2, scores, 3, 2);\n" +
                "for(int i :  scores) System.out.print(i);\n" +
                "\n" +
                "What will be the output ?");
        temp.setOPT_ONE("123446");
        temp.setOPT_TWO("123356");
        temp.setOPT_THREE("1233456");
        temp.setOPT_FOUR("123346");
        temp.setOPT_FIVE("123336");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("2");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("The arraycopy method basically copies an array from the specified source array," +
                " beginning at the specified position," +
                " to the specified position of the destination array." +
                " The last parameter is the number of elements that you want to copy.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("138");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n\n" +
                "int[ ][ ] arr = { { 1, 2, 3} , { 4, 5, 6, 7}, { 8, 9, 10 } };\n\n" +
                "What will the following lines of code print?\n\n" +
                "System.out.println(arr[1].length);\n" +
                "System.out.println(arr[2].getClass().isArray());\n" +
                "System.out.println(arr[1][2]); ");
        temp.setOPT_ONE("4\ntrue\n6");
        temp.setOPT_TWO("3\ntrue\n3");
        temp.setOPT_THREE("3\nfalse\n3");
        temp.setOPT_FOUR("4\nfalse\n6");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("2");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("arr[1].length : length of { 4, 5, 6, 7} i.e (4)\n" +
                "arr[2].getClass().isArray() : is { 8, 9, 10 } array ? i.e (true)\n" +
                "arr[1][2] : 3rd element in { 4, 5, 6, 7} i.e (6)");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("139");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n" +
                "\n" +
                "class Flower {\n" +
                "\tpublic void fragrance() {\n" +
                "\t\tSystem.out.println(\"Flower\"); \n" +
                "\t}\n" +
                "}\n" +
                "class Rose {\n" +
                "\tpublic void fragrance() {\n" +
                "\t\tSystem.out.println(\"Rose\");\n" +
                "\t}\n" +
                "}\n" +
                "class Lily {\n" +
                "\tpublic void fragrance() {\n" +
                "\t\tSystem.out.println(\"Lily\");\n" +
                "\t}\n" +
                "}\n" +
                "class Bouquet {\n" +
                "\tpublic void arrangeFlowers() {\n" +
                "\t\tFlower f1 = new Rose();\n" +
                "\t\tFlower f2 = new Lily();\n" +
                "\t\tf1.fragrance();\n" +
                "\t}\n" +
                "}\n" +
                "\n" +
                "Select the correct option ?");
        temp.setOPT_ONE("The output of the code is:\n" +
                "Flower");
        temp.setOPT_TWO("The output of the code is:\n" +
                "Rose");
        temp.setOPT_THREE("The output of the code is:\n" +
                "Lily");
        temp.setOPT_FOUR("The code fails to compile.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("2");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("Although the code seems to implement polymorphism using classes, " +
                "note that neither of the classes Rose or Lily extends the class Flower. Hence, a variable " +
                "of type Flower can’t be used to store objects of the classes Rose or Lily. The following " +
                "lines of code will fail to compile:\n" +
                "Flower f1 = new Rose();\n" +
                "Flower f2 = new Lily();");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("140");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the following code, select the correct statement:\n" +
                "class Person {}\n" +
                "class Employee extends Person {}\n" +
                "class Doctor extends Person {}");
        temp.setOPT_ONE("The code exhibits polymorphism with classes.");
        temp.setOPT_TWO("The code exhibits polymorphism with interfaces.");
        temp.setOPT_THREE("The code exhibits polymorphism with classes and interfaces.");
        temp.setOPT_FOUR("None of the above.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("The given code does not define any method in the class Person that is " +
                "redefined or implemented in the classes Employee and Doctor. Though the classes " +
                "Employee and Doctor extend the class Person, all these three polymorphism concepts " +
                "or design principles are based on a method, which is missing in these classes.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);







        temp.setID("141");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the result ?\n\n" +
                "List<String> val = Arrays.asList(\"20\", \"9\", \"2B\", \"GH\");\n" +
                "Collections.sort(val);\n" +
                "int m = Collections.binarySearch(val, \"9\");\n" +
                "int n = Collections.binarySearch(val, \"2B\");\n" +
                "int o = Collections.binarySearch(val, \"5A\");\n" +
                "System.out.println(m + \" \" + n + \" \" + o);");
        temp.setOPT_ONE("0 1 –2");
        temp.setOPT_TWO("0 1 –3");
        temp.setOPT_THREE("2 1 –2");
        temp.setOPT_FOUR("2 1 –3");
        temp.setOPT_FIVE("The code doesn’t even compile.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("3");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("After sorting, val contains [20, 2B, 9, GH]. Remember that numbers sort before " +
                "letters and strings sort alphabetically. This makes 20 come before 9. A binary search " +
                "correctly finds 9 at index 2 and 2B at index 1. It cannot find 5A but notices it should " +
                "be at index 2. The rule when an item isn’t found is to negate that index and subtract 1. " +
                "Therefore, we get –2–1, which is –3.");
        temp.setDuplicate("true");
        dbActivity.insertData(temp, db);



        temp.setID("142");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "LocalDate date = LocalDate.parse(\"2019-07-15\", DateTimeFormatter.ISO_LOCAL_DATE);\n" +
                "date.plusHours(1);\n" +
                "date.plusDays(4);\n" +
                "System.out.println(date.getDayOfMonth() + \" \" + date.getMonth() + \" \"+ date.getYear());\n\n" +
                "What is the output ?");
        temp.setOPT_ONE("2019 JULY 2");
        temp.setOPT_TWO("2019 JULY 15");
        temp.setOPT_THREE("2019 AUG 15");
        temp.setOPT_FOUR("The code does not compile.");
        temp.setOPT_FIVE("A runtime exception is thrown.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("LocalDate does not have a time element. Therefore, it has no method to add " +
                "hours and the code does not compile.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("143");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given : \n\n" +
                "LocalDate date = LocalDate.of(2019, Month.MAY, 33);\n" +
                "System.out.println(date.getYear() + \" \" + date.getMonth() + \" \"+ date.getDayOfMonth());\n\n" +
                "What is the output ?");
        temp.setOPT_ONE("2019 JULY 19");
        temp.setOPT_TWO("2019 MAY 33");
        temp.setOPT_THREE("2019 MAY 10");
        temp.setOPT_FOUR("The code does not compile.");
        temp.setOPT_FIVE("A runtime exception is thrown.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("E");
        temp.setEXPLANATION("Java throws an runtime exception if invalid date values are passed. There is no 33rd day in " +
                "May—or any other month for that matter.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp ,db);




        temp.setID("144");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n\n" +
                "LocalDateTime date = LocalDateTime.of(2014, 5, 10, 10, 17, 33);\n" +
                "Period period = Period.of(1, 2, 3);\n" +
                "date = date.minus(period);\n" +
                "DateTimeFormatter formattedDate = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);\n" +
                "System.out.println(date.format(formattedDate));\n\n" +
                "What is the output ?");
        temp.setOPT_ONE("5/10/15 10:17 AM");
        temp.setOPT_TWO("5/10/14 10:17 AM");
        temp.setOPT_THREE("10:17 AM");
        temp.setOPT_FOUR("5/10/15");
        temp.setOPT_FIVE("The code does not compile.");
        temp.setOPT_SIX("A runtime exception is thrown.");
        temp.setNo_Opt("6");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("2");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Even though date variable has both date and time, the formatter only outputs time.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp ,db);





        temp.setID("145");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "import java.util.*;\n" +
                "public class Ref {\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tStringBuilder s1 = new StringBuilder(\"Hello Java!\");\n" +
                "\t\tString s2 = s1.toString();\n" +
                "\t\tList<String> lst = new ArrayList<String>();\n" +
                "\t\tlst.add(s2);\n" +
                "\t\tSystem.out.println(s1.getClass());\n" +
                "\t\tSystem.out.println(s2.getClass());\n" +
                "\t\tSystem.out.println(lst.getClass());\n" +
                "\t}\n" +
                "}\n\n" +
                "What is the result?");
        temp.setOPT_ONE("class java.lang.String\n" +
                "class java.lang.String\n" +
                "class java.util.ArrayList");
        temp.setOPT_TWO("class java.lang.Object\n" +
                "class java.lang. Object\n" +
                "class java.util.Collection");
        temp.setOPT_THREE("class java.lang.StringBuilder\n" +
                "class java.lang.String\n" +
                "class java.util.ArrayList");
        temp.setOPT_FOUR("class java.lang.StringBuilder\n" +
                "class java.lang.String\n" +
                "class java.util.List");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("The java.lang.Object.getClass() method returns the runtime class of an object. " +
                "That Class object is the object that is locked by static synchronized methods of the represented class.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp ,db);






        temp.setID("146");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of this program?\n\n" +
                "import java.util.*;\n" +
                "class Output {\n" +
                "\tpublic static void main(String args[ ]) {\n" +
                "\t\tArrayList obj = new ArrayList();\n" +
                "\t\tobj.add(\"A\");\n" +
                "\t\tobj.ensureCapacity(3);\n" +
                "\t\tSystem.out.println(obj.size());\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("1");
        temp.setOPT_TWO("2");
        temp.setOPT_THREE("3");
        temp.setOPT_FOUR("4");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("2");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("Although obj.ensureCapacity(3); has manually increased the capacity of obj to 3 but the value is " +
                "stored only at index 0, therefore obj.size() returns the total number of elements stored " +
                "in the obj i:e 1, it has nothing to do with ensureCapacity().");
        temp.setDuplicate("false");
        dbActivity.insertData(temp ,db);



        temp.setID("147");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following statement is correct?");
        temp.setOPT_ONE("reverse() method reverses all characters.");
        temp.setOPT_TWO("reverseall() method reverses all characters.");
        temp.setOPT_THREE("replace() method replaces first occurrence of a character in invoking string with another character.");
        temp.setOPT_FOUR("replace() method replaces last occurrence of a character in invoking string with another character.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("reverse() method reverses all characters. It returns the reversed object on which it was called.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp ,db);




        temp.setID("148");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the value returned by function compareTo() if the invoking string is less than the string compared?");
        temp.setOPT_ONE("zero");
        temp.setOPT_TWO("value less than zero");
        temp.setOPT_THREE("value greater than zero");
        temp.setOPT_FOUR("None of the mentioned");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("compareTo() function returns zero when both the strings are equal, " +
                "it returns a value less than zero if the invoking string is less than the other string being compared" +
                " and value greater than zero when invoking string is greater than the string compared to.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp ,db);




        temp.setID("149");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n" +
                "1: import java.util.function.*;\n" +
                "2:\n" +
                "3: public class Student {\n" +
                "4: \tint marks;\n" +
                "5: \tpublic static void main(String[ ] args) {\n" +
                "6: \t\tStudent s1 = new Student();\n" +
                "7: \t\ts1.marks = 20;\n" +
                "8: \t\tcheck(s1, p -> p.marks < 35);\n" +
                "9: \t}\n" +
                "10: \tprivate static void check(Student student, Predicate<Student> pred) {\n" +
                "11: \t\tString result = pred.test(student) ? \"match\" : \"not match\";\n" +
                "12: \t\tSystem.out.print(result);\n" +
                "13: } }\n" +
                "What is the output ?");
        temp.setOPT_ONE("match");
        temp.setOPT_TWO("not match");
        temp.setOPT_THREE("Compiler error on line 8.");
        temp.setOPT_FOUR("Compiler error on line 10.");
        temp.setOPT_FIVE("Compiler error on line 11.");
        temp.setOPT_SIX("A runtime exception is thrown.");
        temp.setNo_Opt("6");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("3");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("This code is correct. Line 8 creates a lambda expression that checks if the marks is less " +
                "than 35. Since there is only one parameter and it does not specify a type, the parentheses " +
                "around the type parameter are optional. Line 10 uses the Predicate interface, which " +
                "declares a test() method. Refer java.util.function for more details.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp ,db);



        temp.setID("150");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n\n" +
                "1: interface Mountain {\n" +
                "2: boolean isTooHigh(int height, int limit);\n" +
                "3: }\n" +
                "4:\n" +
                "5: public class Climber {\n" +
                "6: public static void main(String[ ] args) {\n" +
                "7: check((h, l) -> h.append(l).isEmpty(), 5);\n" +
                "8: }\n" +
                "9: private static void check(Mountain mountain, int height) {\n" +
                "10: if (mountain.isTooHigh(height, 10))\n" +
                "11: System.out.println(\"too high\");\n" +
                "12: else\n" +
                "13: System.out.println(\"ok\");\n" +
                "14: }\n" +
                "15: }\n\n" +
                "What is the output ?");
        temp.setOPT_ONE("ok");
        temp.setOPT_TWO("too high");
        temp.setOPT_THREE("Compiler error on line 7.");
        temp.setOPT_FOUR("Compiler error on line 10.");
        temp.setOPT_FIVE("Compiler error on a different line.");
        temp.setOPT_SIX("A runtime exception is thrown.");
        temp.setNo_Opt("6");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("2");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("The interface takes two int parameters. The code on line 7 attempts to use them as " +
                "if one is a StringBuilder. It is tricky to use types in a lambda when they are implicitly " +
                "specified. Remember to check the interface for the real type.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp ,db);




        temp.setID("151");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n" +
                "List<String> ocjp = new ArrayList<>();\n" +
                "ocjp.removeIf(_________________);\n\n" +
                "Select any 3 options.");
        temp.setOPT_ONE("s -> {s.isEmpty()}");
        temp.setOPT_TWO("s -> {s.isEmpty();}");
        temp.setOPT_THREE("s -> {return s.isEmpty();}");
        temp.setOPT_FOUR("s -> s.isEmpty()");
        temp.setOPT_FIVE("String s -> s.isEmpty()");
        temp.setOPT_SIX("(String s) -> s.isEmpty()");
        temp.setNo_Opt("6");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("2");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("C D F");
        temp.setEXPLANATION("removeIf() expects a Predicate, which takes a parameter ocjp of one parameter " +
                "using the specified type. Options A and B are incorrect because they do not use the " +
                "return keyword. It is required inside braces for lambda bodies. Option E is incorrect " +
                "because it is missing the parentheses around the parameter ocjp. This is only optional " +
                "for a single parameter with an inferred type.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp ,db);




        temp.setID("152");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following is incorrect form of StringBuffer class constructor?");
        temp.setOPT_ONE("StringBuffer() ");
        temp.setOPT_TWO("StringBuffer(int size) ");
        temp.setOPT_THREE("StringBuffer(String str)");
        temp.setOPT_FOUR("StringBuffer(int size , String str)");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("No Explanation needed.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp ,db);





        temp.setID("153");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of these compile when replacing line 2? \n" +
                "1: char[ ]c = new char[2];\n" +
                "2: // INSERT CODE HERE");
        temp.setOPT_ONE("int length = c.capacity;");
        temp.setOPT_TWO("int length = c.capacity();");
        temp.setOPT_THREE("int length = c.length;");
        temp.setOPT_FOUR("int length = c.length();");
        temp.setOPT_FIVE("int length = c.size;");
        temp.setOPT_SIX("int length = c.size();");
        temp.setNo_Opt("6");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Arrays define a property called length. It is not a method, so parentheses are not " +
                "allowed.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp ,db);




        temp.setID("154");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given : \n" +
                "int[ ] val = { 6, -4, 12, 0, -10 };\n" +
                "int x = 12;\n" +
                "int y = Arrays.binarySearch(val, x);\n" +
                "System.out.println(y);\n\n" +
                "What is the result ?");
        temp.setOPT_ONE("2");
        temp.setOPT_TWO("4");
        temp.setOPT_THREE("6");
        temp.setOPT_FOUR("The result is undefined.");
        temp.setOPT_FIVE("An exception is thrown.");
        temp.setOPT_SIX("The code does not compile.");
        temp.setNo_Opt("6");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("The code compiles and runs fine. However, an array must be sorted for binarySearch() " +
                "to return a meaningful result.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp ,db);




        temp.setID("155");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "public static void main(String[ ] args) {\n" +
                "\tint arr[ ] = {65, 68, 69};\n" +
                "\tarr[2] = arr[0];\n" +
                "\tarr[0] = arr[1];\n" +
                "\tarr[1] = arr[2];\n" +
                "\tfor (int element : arr) {\n" +
                "\tSystem.out.print(element + \" \");\n" +
                "\t}\n" +
                "}\n\n" +
                "What is the output ?");
        temp.setOPT_ONE("68, 65, 69");
        temp.setOPT_TWO("68, 65, 65");
        temp.setOPT_THREE("65, 68, 65");
        temp.setOPT_FOUR("65, 68, 69");
        temp.setOPT_FIVE("Compilation fails");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("arr[2] = 65\n" +
                "arr[0] = 68\n" +
                "arr[1] = 65 as arr[2] is now 65");
        temp.setDuplicate("false");
        dbActivity.insertData(temp ,db);




        temp.setID("156");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of these operators is used to allocate memory to array variable in Java?");
        temp.setOPT_ONE("malloc");
        temp.setOPT_TWO("alloc");
        temp.setOPT_THREE("new");
        temp.setOPT_FOUR("new malloc");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Operator new allocates block of memory specified by the size of array, and gives the reference of memory allocated to the array variable.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp ,db);




        temp.setID("157");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What will this code print?\n\n" +
                "int arr[ ] = new int [5];\n" +
                "System.out.print(arr);");
        temp.setOPT_ONE("0");
        temp.setOPT_TWO("value stored in arr[0].");
        temp.setOPT_THREE("00000");
        temp.setOPT_FOUR("Garbage value");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("2");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("arr is an array variable, it is pointing to array if integers. Printing arr will print garbage value. It is not same as printing arr[0].");
        temp.setDuplicate("false");
        dbActivity.insertData(temp ,db);




        temp.setID("158");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of these is an incorrect Statement?");
        temp.setOPT_ONE("It is necessary to use new operator to initialize an array.");
        temp.setOPT_TWO("Array can be initialized using comma separated expressions surrounded by curly braces.");
        temp.setOPT_THREE("Array can be initialized when they are declared.");
        temp.setOPT_FOUR("None of the mentioned");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("2");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("Array can be initialized using both new and comma separated expressions surrounded " +
                "by curly braces example : int arr[5] = new int[5]; and int arr[ ] = { 0, 1, 2, 3, 4};");
        temp.setDuplicate("false");
        dbActivity.insertData(temp ,db);





        temp.setID("159");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of this program?\n\n" +
                "class Test {\n" +
                "\tpublic static void main(String args[ ]) {\n" +
                "\t\tint arr [ ] = new int[10];\n" +
                "\t\tfor (int i = 0; i < 10; ++i) {\n" +
                "\t\t\tarr[i] = i;\n" +
                "\t\t\tSystem.out.print(arr[i] + \" \");\n" +
                "\t\t\ti++;\n" +
                "\t\t}\n" +
                "\t} \n" +
                "}");
        temp.setOPT_ONE("0 2 4 6 8");
        temp.setOPT_TWO("1 3 5 7 9");
        temp.setOPT_THREE("0 1 2 3 4 5 6 7 8 9");
        temp.setOPT_FOUR("1 2 3 4 5 6 7 8 9 10");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("2");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("When an array is declared using new operator then all of its elements are initialized " +
                "to 0 automatically. for loop body is executed 5 times as whenever controls comes in the loop i value " +
                "is incremented twice, first by i++ in body of loop then by ++i in increment condition of for loop.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp ,db);




        temp.setID("160");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n" +
                "public class Lion {\n" +
                "\tprotected void finalize() {\n" +
                "\t\tSystem.out.println(\"Roar!\");\n" +
                "\t}\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tLion lion = new Lion();\n" +
                "\t\tlion = null;\n" +
                "\t\tSystem.gc();\n" +
                "\t} \n" +
                "}\n\n" +
                "Select any 2 options.");
        temp.setOPT_ONE("finalize() is guaranteed to be called.");
        temp.setOPT_TWO("finalize() might or might not be called.");
        temp.setOPT_THREE("finalize() is guaranteed not to be called.");
        temp.setOPT_FOUR("Garbage collection is guaranteed to run.");
        temp.setOPT_FIVE("Garbage collection might or might not run.");
        temp.setOPT_SIX("The code does not compile.");
        temp.setNo_Opt("6");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("2");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("B E");
        temp.setEXPLANATION("Calling System.gc() suggests that Java might wish to run the garbage collector. " +
                "Java is free to ignore the request, making option E correct. finalize() runs if an object " +
                "attempts to be garbage collected, making option B correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp ,db);







        temp.setID("161");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the following code:\n\n" +
                "1. public class Simple { \n" +
                "2. \tpublic float price; \n" +
                "3. \t\tpublic static void main (String[ ] args) { \n" +
                "4. \t\tSimple price = new Simple (); \n" +
                "5. \t\tprice = 4; \n" +
                "6. \t} \n" +
                "7. } \n" +
                "What will make this code compile and run?");
        temp.setOPT_ONE("Change line 2 to the following:\n" +
                "public int price");
        temp.setOPT_TWO("Change line 4 to the following:\n" +
                "int price = new simple ();");
        temp.setOPT_THREE("Change line 4 to the following:\n" +
                "Float price = new simple ();");
        temp.setOPT_FOUR("Change line 5 to the following:\n" +
                "price.price = 4;");
        temp.setOPT_FIVE("Change line 5 to the following:\n" +
                "Price = (float) 4:");
        temp.setOPT_SIX("The code compiles and runs properly; no changes are necessary");
        temp.setNo_Opt("6");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("price.price =4; is correct, not price=4; The attribute price of the instance must be set, not the instance itself.");
        temp.setDuplicate("true");
        dbActivity.insertData(temp, db);



        temp.setID("162");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "public class DoWhile {\n" +
                "\tpublic static void main (String [ ] args) {\n" +
                "\t\tint ii = 2;\n" +
                "\t\tdo {\n" +
                "\t\t\tSystem.out.println (ii);\n" +
                "\t\t} while (--ii);\n" +
                "\t}\n" +
                "}\n" +
                "What is the result?");
        temp.setOPT_ONE("1");
        temp.setOPT_TWO("2");
        temp.setOPT_THREE("null");
        temp.setOPT_FOUR("an infinite loop");
        temp.setOPT_FIVE("compilation fails");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("E");
        temp.setEXPLANATION("The line while (--ii); will cause the compilation to fail.\n" +
                "--ii is not a boolean value.\n" +
                "A correct line would be while (--ii>0);");
        temp.setDuplicate("true");
        dbActivity.insertData(temp, db);


        temp.setID("163");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("You are writing a method that is declared not to return a value. Which two are permitted in the method body?");
        temp.setOPT_ONE("omission of the return statement");
        temp.setOPT_TWO("return null;");
        temp.setOPT_THREE("return void;");
        temp.setOPT_FOUR("return;");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("A D");
        temp.setEXPLANATION("Any method declared void doesn't return a value. It does not need to contain a return statement, " +
                "but it may do so. In such a case, a return statement can be used to branch out of a control flow block and exit " +
                "the method and is simply used like this:\n" +
                "return;");
        temp.setDuplicate("true");
        dbActivity.insertData(temp, db);


        temp.setID("164");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Identify two benefits of using ArrayList over array in software development.");
        temp.setOPT_ONE("reduces memory footprint");
        temp.setOPT_TWO("implements the Collection API");
        temp.setOPT_THREE("is multi thread safe");
        temp.setOPT_FOUR("dynamically resizes based on the number of elements in the list");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("2");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("A D");
        temp.setEXPLANATION("ArrayList supports dynamic arrays that can grow as needed. In Java, standard arrays are of a" +
                " fixed length. After arrays are created, they cannot grow or shrink, which means that you must know in advance" +
                " how many elements an array will hold. But, sometimes, you may not know until run time precisely how large of" +
                " an array you need. To handle this situation, the collections framework defines ArrayList. In essence, an" +
                " ArrayList is a variable-length array of object references. That is, an ArrayList can dynamically increase or" +
                " decrease in size. Array lists are created with an initial size. When this size is exceeded, the collection is automatically enlarged. When" +
                " objects are removed, the array may be shrunk.");
        temp.setDuplicate("true");
        dbActivity.insertData(temp, db);



        temp.setID("165");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which three are valid types for switch?");
        temp.setOPT_ONE("int");
        temp.setOPT_TWO("float");
        temp.setOPT_THREE("double");
        temp.setOPT_FOUR("Integer");
        temp.setOPT_FIVE("String");
        temp.setOPT_SIX("Float");
        temp.setNo_Opt("6");
        temp.setCHAPTER("3");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("A D E");
        temp.setEXPLANATION("A switch works with the byte, short, char, and int primitive data types. It also works with " +
                "enumerated types the String class, and a few special classes that wrap certain primitive types: Character, Byte, " +
                "Short, and Integer.");
        temp.setDuplicate("true");
        dbActivity.insertData(temp, db);



        temp.setID("166");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Give:\n\n" +
                "public class MyFive {\n" +
                "\tstatic void main(String[ ] args) {\n" +
                "\t\tshort ii;\n" +
                "\t\tshort jj = 0;\n" +
                "\t\tfor (ii = KK;ii > 6; ii -= 1) { // line x //\n" +
                "\t\t\tjj++;\n" +
                "\t\t}\n" +
                "\t\tSystem.out.println(\"jj = \" + jj);\n" +
                "\t}\n" +
                "}\n\n" +
                "What value should replace KK in line x to cause jj = 5 to be output?");
        temp.setOPT_ONE("-1");
        temp.setOPT_TWO("1");
        temp.setOPT_THREE("5");
        temp.setOPT_FOUR("8");
        temp.setOPT_FIVE("11");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("2");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("E");
        temp.setEXPLANATION("We need to get jj to 5. It is initially set to 0. So we need to go through the for loop 5 times. The for\n" +
                "loops ends when ii > 6 and ii decreases for every loop. So we need to initially set ii to 11. We set KK to 11.");
        temp.setDuplicate("true");
        dbActivity.insertData(temp, db);



        temp.setID("167");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the code fragment:\n\n" +
                "Boolean b1 = true;\n" +
                "Boolean b2 = false;\n" +
                "int i = 0;\n" +
                "while (foo) {}\n\n" +
                "Which one is valid as a replacement for foo?");
        temp.setOPT_ONE("b1.compareTo(b2)");
        temp.setOPT_TWO("i = 1");
        temp.setOPT_THREE("i == 2? -1:0");
        temp.setOPT_FOUR("\"foo\".equals(\"bar\")");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("equals works fine on strings. equals produces a Boolean value.");
        temp.setDuplicate("true");
        dbActivity.insertData(temp, db);



        temp.setID("168");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "public class SuperTest {\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tstatement1\n" +
                "\t\tstatement2\n" +
                "\t\tstatement3\n" +
                "\t}\n" +
                "}\n" +
                "class Shape {\n" +
                "\tpublic Shape() {\n" +
                "\t\tSystem.out.println(\"Shape: constructor\");\n" +
                "\t}\n" +
                "\tpublic void foo() {\n" +
                "\t\tSystem.out.println(\"Shape: foo\");\n" +
                "\t}\n" +
                "}\n" +
                "class Square extends Shape {\n" +
                "\tpublic Square() {\n" +
                "\t\tsuper();\n" +
                "\t}\n" +
                "\tpublic Square(String label) {\n" +
                "\t\tSystem.out.println(\"Square: constructor\");\n" +
                "\t}\n" +
                "\tpublic void foo() {\n" +
                "\t\tsuper.foo();\n" +
                "\t}\n" +
                "\tpublic void foo(String label) {\n" +
                "\t\tSystem.out.println(\"Square: foo\");\n" +
                "\t}\n" +
                "}\n\n" +
                "What should statement1, statement2, and statement3, be respectively, in order to produce the result:\n" +
                "Shape: constructor\n" +
                "Square: foo\n" +
                "Shape: foo");
        temp.setOPT_ONE("Square square = new Square (\"bar\");\n" +
                "square.foo (\"bar\");\n" +
                "square.foo();");
        temp.setOPT_TWO("Square square = new Square (\"bar\");\n" +
                "square.foo (\"bar\");\n" +
                "square.foo (\"bar\");");
        temp.setOPT_THREE("Square square = new Square ();\n" +
                "square.foo ();\n" +
                "square.foo(bar);");
        temp.setOPT_FOUR("Square square = new Square ();\n" +
                "square.foo ();\n" +
                "square.foo(\"bar\");");
        temp.setOPT_FIVE("Square square = new Square ();\n" +
                "square.foo ();\n" +
                "square.foo ();");
        temp.setOPT_SIX("Square square = new Square ();\n" +
                "square.foo(\"bar\");\n" +
                "square.foo ();");
        temp.setNo_Opt("6");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("2");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("F");
        temp.setEXPLANATION("\"Shape: constructor\" is printed when statement 1 is replaced by \"Square square = new Square ();\" " +
                "as default constructor of square will be called, which in this case will call super class constructor.\n" +
                "\"Square: foo\" is printed when statement 2 is replaced by square.foo(\"bar\"); " +
                "as function \"public void foo(String label)\"  of square will be called.\n" +
                "\"Shape: foo\" is printed when statement 2 is replaced by square.foo (); " +
                "as function \"public void foo()\" of square will be called, which in this case will call super class function \"foo()\". ");
        temp.setDuplicate("true");
        dbActivity.insertData(temp, db);



        temp.setID("169");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "public class X implements Z\n" +
                "{\n" +
                "\tpublic String toString()\n" +
                "\t{\n" +
                "\t\treturn \"I am X\";\n" +
                "\t}\n" +
                "\tpublic static void main(String[ ] args)\n" +
                "\t{\n" +
                "\t\tY myY = new Y();\n" +
                "\t\tX myX = myY;\n" +
                "\t\tZ myZ = myX;\n" +
                "\t\tSystem.out.println(myZ);\n" +
                "\t}\n" +
                "}\n" +
                "class Y extends X\n" +
                "{\n" +
                "\tpublic String toString()\n" +
                "\t{\n" +
                "\t\treturn \"I am Y\";\n" +
                "\t}\n" +
                "}\n" +
                "interface Z { }\n\n" +
                "What is the reference type of myZ and what is the type of the object it references?");

        temp.setOPT_ONE("Reference type is Z; object type is Z.");
        temp.setOPT_TWO("Reference type is Y; object type is Y.");
        temp.setOPT_THREE("Reference type is Z; object type is Y.");
        temp.setOPT_FOUR("Reference type is X; object type is Z.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("2");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Because Java handles objects and arrays by reference, classes and array types are known\n" +
                "as reference types.");
        temp.setDuplicate("true");
        dbActivity.insertData(temp, db);




        temp.setID("170");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "class SampleClass\n" +
                "{\n" +
                "}\n" +
                "class AnotherSampleClass extends SampleClass\n" +
                "{\n" +
                "}\n" +
                "class Test\n" +
                "{\n" +
                "\tpublic static void main(String[ ] args)\n" +
                "\t{\n" +
                "\t\tSampleClass sc = new SampleClass();\n" +
                "\t\tAnotherSampleClass asc = new AnotherSampleClass();\n" +
                "\t\tsc = asc;\n" +
                "\t\tSystem.out.println(\"sc: \" + sc.getClass());\n" +
                "\t\tSystem.out.println(\"asc: \" + asc.getClass());\n" +
                "\t}\n" +
                "}\n\n" +
                "What is the result?");
        temp.setOPT_ONE("sc: class.Object\n" +
                "asc: class.AnotherSampleClass");
        temp.setOPT_TWO("sc: class.SampleClass\n" +
                "asc: class.AnotherSampleClass");
        temp.setOPT_THREE("sc: class.AnotherSampleClass\n" +
                "asc: class.SampleClass");
        temp.setOPT_FOUR("sc: class.AnotherSampleClass\n" +
                "asc: class.AnotherSampleClass");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("2");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("Note: The getClass method Returns the runtime class of an object. That Class object is the object " +
                "that is locked by static synchronized methods of the represented class.\n" +
                "Note: Because Java handles objects and arrays by reference, classes and array types are known as reference " +
                "types.");
        temp.setDuplicate("true");
        dbActivity.insertData(temp, db);




        temp.setID("171");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the code fragment:\n\n" +
                "public static void main(String[ ] args)\n" +
                "{\n" +
                "\tString [ ] table = {\"aa\", \"bb\", \"cc\"};\n" +
                "\tint ii = 0;\n" +
                "\tfor (String ss:table)\n" +
                "\t{\n" +
                "\t\twhile (ii < table.length)\n" +
                "\t\t{\n" +
                "\t\t\tSystem.out.println (ii);\n" +
                "\t\t\tii++;\n" +
                "\t\t\tbreak;\n" +
                "\t\t}\n" +
                "\t}\n" +
                "}\n\n" +
                "How many times is 2 printed?");

        temp.setOPT_ONE("zero");
        temp.setOPT_TWO("once");
        temp.setOPT_THREE("twice");
        temp.setOPT_FOUR("thrice");
        temp.setOPT_FIVE("It is not printed because compilation fails");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("The outer loop will run three times, one time each for the elements in table. The break statement " +
                "breaks the inner loop immediately each time. 2 will be printed once only.");
        temp.setDuplicate("true");
        dbActivity.insertData(temp, db);




        temp.setID("172");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "public class SampleClass{\n" +
                "\tpublic static void main(String[ ] args){\n" +
                "\t\tSampleClass sc, scA, scB;\n" +
                "\t\tsc = new SampleClass();\n" +
                "\t\tscA = new SampleClassA();\n" +
                "\t\tscB = new SampleClassB();\n" +
                "\t\tSystem.out.println(\"Hash is : \" + sc.getHash() + \", \" + scA.getHash() + \", \" + scB.getHash());\n" +
                "\t}\n" +
                "\tpublic int getHash(){\n" +
                "\t\treturn 111111;\n" +
                "\t}\n" +
                "}\n" +
                "class SampleClassA extends SampleClass{\n" +
                "\tpublic long getHash(){\n" +
                "\t\treturn 44444444;\n" +
                "\t}\n" +
                "}\n" +
                "class SampleClassB extends SampleClass{\n" +
                "\tpublic long getHash(){\n" +
                "\t\treturn 999999999;\n" +
                "\t}\n" +
                "}\n\n" +
                "What is the result?");
        temp.setOPT_ONE("Compilation fails");
        temp.setOPT_TWO("An exception is thrown at runtime");
        temp.setOPT_THREE("There is no result because this is not correct way to determine the hash code");
        temp.setOPT_FOUR("Hash is: 111111, 44444444, 999999999");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("3");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("The compilation fails as SampleClassA and SampleClassB cannot override SampleClass because " +
                "the return type of SampleClass is int, while the return type of SampleClassA and SampleClassB is long.");
        temp.setDuplicate("true");
        dbActivity.insertData(temp, db);




        temp.setID("173");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which two will compile, and can be run successfully using the command:\n" +
                "Java fred1 hello walls");
        temp.setOPT_ONE("class Fred1{\n" +
                "\tpublic static void main (String args) {\n" +
                "\t\tSystem.out.println(args[1]);\n" +
                "\t}\n" +
                "}");
        temp.setOPT_TWO("class Fred1{\n" +
                "\tpublic static void main (String [ ] args) {\n" +
                "\t\tSystem.out.println(args[2]);\n" +
                "\t}\n" +
                "}");
        temp.setOPT_THREE("class Fred1 {\n" +
                "\tpublic static void main (String [ ] args) {\n" +
                "\t\tSystem.out.println (args);\n" +
                "\t}\n" +
                "}");
        temp.setOPT_FOUR("class Fred1 {\n" +
                "\tpublic static void main (String [ ] args) {\n" +
                "\t\tSystem.out.println(args [1]);\n" +
                "\t}\n" +
                "}");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("C D");
        temp.setEXPLANATION("A. main syntax is wrong\n" +
                "B. Throws java.lang.ArrayIndexOutOfBoundsException: 2 \n" +
                "C. Prints out: [java.lang.String;@39341183\n" +
                "D. Prints out: walls");
        temp.setDuplicate("true");
        dbActivity.insertData(temp, db);




        temp.setID("174");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "public abstract class Wow {\n" +
                "\tprivate int wow;\n" +
                "\tpublic Wow (int wow) {\n" +
                "\t\tthis.wow = wow;\n" +
                "\t}\n" +
                "\tpublic void wow () {}\n" +
                "\tprivate void wowza () {}\n" +
                "}\n\n" +
                "What is true about the class Wow?");
        temp.setOPT_ONE("It compiles without error.");
        temp.setOPT_TWO("It does NOT compile because an abstract class CANNOT have private methods.");
        temp.setOPT_THREE("It does NOT compile because an abstract class CANNOT have instance variables.");
        temp.setOPT_FOUR("It does NOT compile because an abstract class must have at least one abstract method.");
        temp.setOPT_FIVE("It does NOT compile because an abstract class must have a constructor with no arguments.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("A class that is declared with abstract keyword, is known as abstract class in java. " +
                "It can have abstract and non-abstract methods (method with body).");
        temp.setDuplicate("true");
        dbActivity.insertData(temp, db);




        temp.setID("175");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "class X{\n" +
                "\tstatic void m(int i){\n" +
                "\t}\n" +
                "\tpublic static void main(String[ ] args){\n" +
                "\t\tint j = 12;\n" +
                "\t\tm ( j );\n" +
                "\t\tSystem.out.println( j );\n" +
                "\t}\n" +
                "}\n\n" +
                "What is the result?");
        temp.setOPT_ONE("7");
        temp.setOPT_TWO("12");
        temp.setOPT_THREE("19");
        temp.setOPT_FOUR("Compilation fails");
        temp.setOPT_FIVE("An exception is thrown at run time");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("No compilation error and no exception will be thrown. As \"j\" is initialized with 12 so it will print 12. ");
        temp.setDuplicate("true");
        dbActivity.insertData(temp, db);





        temp.setID("176");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which two statements are true?");
        temp.setOPT_ONE("An abstract class can implement an interface.");
        temp.setOPT_TWO("An abstract class can be extended by an interface.");
        temp.setOPT_THREE("An interface CANNOT be extended by another interface.");
        temp.setOPT_FOUR("An interface can be extended by an abstract class.");
        temp.setOPT_FIVE("An abstract class can be extended by a concrete class.");
        temp.setOPT_SIX("An abstract class CANNOT be extended by an abstract class.");
        temp.setNo_Opt("6");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("A E");
        temp.setEXPLANATION("In Java, an abstract class can implement an interface, and not provide" +
                " implementations of all of the interface's methods. It is the responsibility" +
                " of the first concrete class that has that abstract class as an ancestor to implement all of the methods in the interface.\n" +
                "A class may implement a number of Interfaces, but can extend only one abstract class.");
        temp.setDuplicate("true");
        dbActivity.insertData(temp, db);





        temp.setID("177");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "class Overloading {\n" +
                "\tint x(double d) {\n" +
                "\t\tSystem.out.println(\"one\");\n" +
                "\t\treturn 0;\n" +
                "\t}\n" +
                "\tString x(double d) {\n" +
                "\t\tSystem.out.println(\"two\");\n" +
                "\t\treturn null;\n" +
                "\t}\n" +
                "\tdouble x(double d) {\n" +
                "\t\tSystem.out.println(\"three\");\n" +
                "\t\treturn 0.0;\n" +
                "\t}\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tnew Overloading().x(4.0)\n" +
                "\t}\n" +
                "}\n\n" +
                "What is the result?");
        temp.setOPT_ONE("One");
        temp.setOPT_TWO("Two");
        temp.setOPT_THREE("Three");
        temp.setOPT_FOUR("Compilation fails");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("overloading of the x method fails as the input argument in all three cases are double. To use\n" +
                "overloading of methods the argument types must be different.");
        temp.setDuplicate("true");
        dbActivity.insertData(temp, db);



        temp.setID("178");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("The catch clause argument is always of type___________.");
        temp.setOPT_ONE("Exception");
        temp.setOPT_TWO("Exception but NOT including RuntimeException");
        temp.setOPT_THREE("Throwable");
        temp.setOPT_FOUR("RuntimeException");
        temp.setOPT_FIVE("CheckedException");
        temp.setOPT_SIX("Error");
        temp.setNo_Opt("6");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Because all exceptions in Java are the sub-class of java.lang.Exception class, you can have a " +
                "single catch block that catches an exception of type Exception only. Hence the compiler is fooled into thinking " +
                "that this block can handle any exception.\n" +
                "Since Throwable is the parent class for the application specific " +
                "Exception classes. However, this is discouraged in Java programming circles. This is because " +
                "Throwable happens to also be the parent class for the non-application specific Error classes which are not " +
                "meant to be handled explicitly as they are catered for by the JVM itself.");
        temp.setDuplicate("true");
        dbActivity.insertData(temp, db);




        temp.setID("179");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the code fragment:\n\n" +
                "1. ArrayList<Integer> list = new ArrayList<>(1);\n" +
                "2. list.add(1001);\n" +
                "3. list.add(1002);\n" +
                "4. System.out.println(list.get(list.size()));\n\n" +
                "What is the result?");
        temp.setOPT_ONE("Compilation fails due to an error on line 1.");
        temp.setOPT_TWO("An exception is thrown at run time due to error on line 3");
        temp.setOPT_THREE("An exception is thrown at run time due to error on line 4");
        temp.setOPT_FOUR("1002");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("At runtime an IndexOutOfBoundsException is thrown when the third list item is tried to be accessed.");
        temp.setDuplicate("true");
        dbActivity.insertData(temp, db);





        temp.setID("180");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("View the Exhibit.\n\n" +
                "public class Hat {\n" +
                "\tpublic int ID =0;\n" +
                "\tpublic String name = \"hat\";\n" +
                "\tpublic String size = \"One Size Fit All\";\n" +
                "\tpublic String color=\"\";\n" +
                "\tpublic String getName() { return name; }\n" +
                "\tpublic void setName(String name) {\n" +
                "\t\tthis.name = name;\n" +
                "\t}\n" +
                "}\n" +
                "Given\n" +
                "public class TestHat {\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tHat blackCowboyHat = new Hat();\n" +
                "\t}\n" +
                "}\n\n" +
                "Which statement sets the name of the Hat instance?");
        temp.setOPT_ONE("blackCowboyHat.setName = \"Cowboy Hat\";");
        temp.setOPT_TWO("setName(\"Cowboy Hat\");");
        temp.setOPT_THREE("Hat.setName(\"Cowboy Hat\");");
        temp.setOPT_FOUR("blackCowboyHat.setName(\"Cowboy Hat\");");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("blackCowboyHat.setName(\"Cowboy Hat\"); will call setName function of class hat.");
        temp.setDuplicate("true");
        dbActivity.insertData(temp, db);





        temp.setID("181");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "public class Two{\n" +
                "\tpublic static void main(String[ ] args){\n" +
                "\t\ttry{\n" +
                "\t\t\tdoStuff();\n" +
                "\t\t\tSystem.out.println(\"1\");\n" +
                "\t\t}\n" +
                "\t\tcatch{\n" +
                "\t\t\tSystem.out.println(\"2\");\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\tpublic static void do Stuff(){\n" +
                "\t\tif (Math.random() > 0.5) throw new RunTimeException();\n" +
                "\t\tdoMoreStuff();\n" +
                "\t\tSystem.out.println(\"3 \");\n" +
                "\t}\n" +
                "\tpublic static void doMoreStuff(){\n" +
                "\tSystem.out.println(\"4\");\n" +
                "\t}\n" +
                "}\n\n" +
                "Which two are possible outputs?");
        temp.setOPT_ONE("2");
        temp.setOPT_TWO("4 3 1");
        temp.setOPT_THREE("1 2 3");
        temp.setOPT_FOUR("1 3 4");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("2");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("A B");
        temp.setEXPLANATION("If Math.random() is greater than 0.5 then it will throw RunTimeException which will call " +
                "catch block, therfore 2 will be printed.\n" +
                "If Math.random() is less than 0.5 , it will call doMorestuff() which will print 4, " +
                "then System.out.println(\"3 \"); will print 3 & in last it will go back to try block which will print 1. " +
                "Therefore 4 3 1 will be printed.");
        temp.setDuplicate("true");
        dbActivity.insertData(temp, db);



        temp.setID("182");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n\n" +
                "class S {\n" +
                "\tpublic static void main(String [ ] args){\n" +
                "\t\tString s = \"Java\";\n" +
                "\t\ts.concat(\" SE 6\");\n" +
                "\t\ts.replace('6','7');\n" +
                "\t\tSystem.out.print(s);\n" +
                "\t}\n" +
                "}\n" +
                "What is the result?");
        temp.setOPT_ONE("Java SE 6");
        temp.setOPT_TWO("Java SE 7");
        temp.setOPT_THREE("Java SE");
        temp.setOPT_FOUR("Java");
        temp.setOPT_FIVE("Compilation fails.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("In java, string objects are immutable. Immutable simply means unmodifiable or unchangeable.\n" +
                "Once string object is created its data or state can't be changed but a new string object is created.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("183");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n\n" +
                "1. class Ex1{\n" +
                "2. public static void main(String[ ] args) {\n" +
                "3. new Ex1().pass();\n" +
                "4. }\n" +
                "5. \n" +
                "6. public void pass(){\n" +
                "7. int a =10 , b=20;\n" +
                "8. print(a) ;\n" +
                "9. }\n" +
                "10. \n" +
                "11. public void print(int a){\n" +
                "12. int c = b/a;\n" +
                "13. System.out.print(c);\n" +
                "14. }\n" +
                "15. }\n" +
                "What is the result?");
        temp.setOPT_ONE("2");
        temp.setOPT_TWO("Compilation fails due to an error on line 8. ");
        temp.setOPT_THREE("Compilation fails due to an error on line 7. ");
        temp.setOPT_FOUR("volatile");
        temp.setOPT_FIVE("Compilation fails due to an error on line 12.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("E");
        temp.setEXPLANATION("'b' cannot be resolved to a variable as 'b' is not defined in function print().");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("184");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n" +
                "import java.util.*;\n" +
                "public class Primes {\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tList p = new ArrayList();\n" +
                "\t\tp.add(7);\n" +
                "\t\tp.add(2);\n" +
                "\t\tp.add(5);\n" +
                "\t\tp.add(2);\n" +
                "\t\tp.sort();\n" +
                "\t\tSystem.out.println(p);\n" +
                "\t}\n" +
                "}\n" +
                "What is the result? ");
        temp.setOPT_ONE("[2, 5, 7]");
        temp.setOPT_TWO("[2, 2, 5, 7]");
        temp.setOPT_THREE("[7, 2, 5, 2]");
        temp.setOPT_FOUR("[7, 5, 2, 2]");
        temp.setOPT_FIVE("Compilation fails");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("2");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("E");
        temp.setEXPLANATION("There is no sort() Method in List(I). It should use Collections.sort(p);");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("185");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which statement is true about the default constructor of a top-level class?");
        temp.setOPT_ONE("It can take arguments.");
        temp.setOPT_TWO("It has private access modifier in its declaration.");
        temp.setOPT_THREE("It can be overloaded.");
        temp.setOPT_FOUR("The default constructor of a subclass always invokes the no-argument constructor of its superclass.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("1. If you do not make a constructor, the default empty constructor is automatically created.\n" +
                "2. If any constructor does not explicitly call a super or this constructor as its first statement," +
                " a call to super() is automatically added.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("186");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the code fragment:\n\n" +
                "5. // insert code here\n" +
                "6.\n" +
                "7. arr[0] = new int[3];\n" +
                "8. arr[0][0] = 1;\n" +
                "9. arr[0][1] = 2;\n" +
                "10. arr[0][2] = 3;\n" +
                "11.\n" +
                "12. arr[1] = new int[4];\n" +
                "13. arr[1][0] = 10;\n" +
                "14. arr[1][1] = 20;\n" +
                "15. arr[1][2] = 30;\n" +
                "16. arr[1][3] = 40;\n\n" +
                "Which two statements, when inserted independently at line 5, enable the code to compile?");
        temp.setOPT_ONE("int [ ][ ] arr = null;");
        temp.setOPT_TWO("int [ ][ ] arr = new int[2];");
        temp.setOPT_THREE("int [ ][ ] arr = new int[2][ ];");
        temp.setOPT_FOUR("int [ ][ ] arr = new int[ ][4];");
        temp.setOPT_FIVE("int [ ][ ] arr = new int[2][4];");
        temp.setOPT_SIX("int [ ][ ] arr = new int[0][4];");
        temp.setNo_Opt("6");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("C E");
        temp.setEXPLANATION("Only option C & E are the correct declaration");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("187");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n\n" +
                "1.class Sample {\n" +
                "2.\tpublic static void main(String [ ] args) {\n" +
                "3.\t\tint x = 100;\n" +
                "4.\t\tdouble y = 100.1;\n" +
                "5.\t\tboolean b = (x = y); \n" +
                "6.\t\tSystem.out.println(b);\n" +
                "7.\t}\n" +
                "8.}\n\n" +
                "What will be the output ?");
        temp.setOPT_ONE("true");
        temp.setOPT_TWO("false");
        temp.setOPT_THREE("Compilation fails");
        temp.setOPT_FOUR("An exception is thrown at runtime");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("3");
        temp.setDIFFICULTY("2");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("The code will not compile because in line 5, " +
                "the line will work only if we use (x==y) in the line. " +
                "The == operator compares values to produce a boolean, " +
                "whereas the = operator assigns a value to variables.\n" +
                "Option A, B, and D are incorrect because the code does not get as far as compiling. " +
                "If we corrected this code, the output would be false.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("188");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which is a reserved word in the Java programming language ?");
        temp.setOPT_ONE("method");
        temp.setOPT_TWO("native");
        temp.setOPT_THREE("subclasses");
        temp.setOPT_FOUR("reference");
        temp.setOPT_FIVE("array");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("The word \"native\" is a valid keyword, used to modify a method declaration.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("189");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n\n" +
                "switch(x) \n" +
                "{ \n" +
                "\tdefault:  \n" +
                "\t\tSystem.out.println(\"Hello\"); \n" +
                "}\n\n" +
                "Which three are acceptable types for x?");
        temp.setOPT_ONE("byte");
        temp.setOPT_TWO("long");
        temp.setOPT_THREE("char");
        temp.setOPT_FOUR("float");
        temp.setOPT_FIVE("Short");
        temp.setOPT_SIX("Long");
        temp.setNo_Opt("6");
        temp.setCHAPTER("3");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("A C E");
        temp.setEXPLANATION("A switch works with the byte, short, char, and int primitive data types.\n" +
                "It also works with enumerated types, a few special classes that wrap certain primitive types: Character, Byte, Short, and Integer");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("190");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What will be the output of the program?\n\n" +
                "public class Sample {\n" +
                "\tpublic static void main(String [ ] args) {\n" +
                "\t\ttry {\n" +
                "\t\t\tbadMethod();  \n" +
                "\t\t\tSystem.out.print(\"A\"); \n" +
                "\t\t}  \n" +
                "\t\tcatch (Exception ex) {\n" +
                "\t\t\tSystem.out.print(\"B\"); \n" +
                "\t\t}  \n" +
                "\t\tfinally {\n" +
                "\t\t\tSystem.out.print(\"C\"); \n" +
                "\t\t}  \n" +
                "\t\tSystem.out.print(\"D\"); \n" +
                "\t}  \n" +
                "\tpublic static void badMethod() {} \n" +
                "}");
        temp.setOPT_ONE("AC");
        temp.setOPT_TWO("BC");
        temp.setOPT_THREE("ACD");
        temp.setOPT_FOUR("ABCD");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("There is no exception thrown, so all the code with the exception of the catch statement block is run.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("191");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following statements are incorrect?");
        temp.setOPT_ONE("public members of class can be accessed by any code in the program.");
        temp.setOPT_TWO("private members of class can only be accessed by other members of the class.");
        temp.setOPT_THREE("private members of class can be inherited by a sub class, and become protected members in sub class.");
        temp.setOPT_FOUR("protected members of a class can be inherited by a sub class, and become private members of the sub class.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Private members of a class cannot be inherited by a sub class.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("192");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of this program?\n\n" +
                "class Output {\n" +
                "\tstatic void main(String args[ ]) {\n" +
                "\t\tint x , y = 1;\n" +
                "\t\tx = 10;\n" +
                "\t\tif (x != 10 && x / 0 == 0)\n" +
                "\t\t\tSystem.out.println(y);\n" +
                "\t\telse\n" +
                "\t\t\tSystem.out.println(++y);\n" +
                "\t} \n" +
                "}");
        temp.setOPT_ONE("1");
        temp.setOPT_TWO("2");
        temp.setOPT_THREE("Runtime Error");
        temp.setOPT_FOUR("Compilation Error");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("main() method must be made public. " +
                "Without main() being public java run time system will not be able to access main() " +
                "and will not be able to execute the code.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("193");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("class Star {\n" +
                "\tpublic void doStuff() {\n" +
                "\t\tSystem.out.println(\"Twinkling Star\");\n" +
                "\t}\n" +
                "}\n" +
                "interface Universe {\n" +
                "\tpublic void doStuff();\n" +
                "}\n" +
                "class Sun extends Star implements Universe {\n" +
                "\tpublic void doStuff() {\n" +
                "\t\tSystem.out.println(\"Shining Sun\");\n" +
                "\t}\n" +
                "}\n" +
                "public class Bob {\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tSun obj2 = new Sun();\n" +
                "\t\tStar obj3 = obj2;\n" +
                "\t\t((Sun) obj3).doStuff();\n" +
                "\t\t((Star) obj2).doStuff();\n" +
                "\t\t((Universe) obj2).doStuff();\n" +
                "\t}\n" +
                "}\n\n" +
                "What is the result?\n");
        temp.setOPT_ONE("Shining Sun\n" +
                "Shining Sun\n" +
                "Shining Sun\n");
        temp.setOPT_TWO("Shining Sun\n" +
                "Twinkling Star\n" +
                "Shining Sun");
        temp.setOPT_THREE("Compilation fails.\n");
        temp.setOPT_FOUR("A ClassCastException is thrown at runtime.\n");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("2");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("obj2 & obj3 both are pointing to the same class");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("194");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "public class Calculator {\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tint num = 5;\n" +
                "\t\tint sum;\n" +
                "\t\tdo {\n" +
                "\t\t\tsum += sum;\n" +
                "\t\t} while ((num--) > 1);\n" +
                "\t\tSystem.out.println(\"The sum is \" + sum + \".\");\n" +
                "\t}\n" +
                "}\n\n" +
                "What is the result?");
        temp.setOPT_ONE("The sum is 2.");
        temp.setOPT_TWO("The sum is 14.");
        temp.setOPT_THREE("The sum is 15.");
        temp.setOPT_FOUR("The loop executes infinite times.\n");
        temp.setOPT_FIVE(" Compilation fails.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("E");
        temp.setEXPLANATION("Exception in thread \"main\" java.lang.Error: Unresolved compilation problems:\n" +
                "The local variable sum may not have been initialized\n");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("195");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the code fragment:\n\n" +
                "System.out.println( 28 + 5 <= 4 + 29 );\n" +
                "System.out.println( ( 28 + 5 ) <= ( 4 + 29) );\n\n" +
                "What is the result?");
        temp.setOPT_ONE(" 28false29\n" +
                "true");
        temp.setOPT_TWO(" 285 < 429\n" +
                "true");
        temp.setOPT_THREE("true\n" +
                "true");
        temp.setOPT_FOUR("Compilation fails\n");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("3");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("In '28 + 5 <= 4 + 29', + operator has more preference than <=.\n" +
                "In '( 28 + 5 ) <= ( 4 + 29)', Parentheses has more preference than any operator.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("196");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which two statement correctly describe checked exception?");
        temp.setOPT_ONE("These are exceptional conditions that a well-written application should anticipate and recover " +
                "from");
        temp.setOPT_TWO("These are exceptional conditions that are external to the application, and that the application " +
                "usually cannot anticipate or recover from.");
        temp.setOPT_THREE("These are exceptional conditions that are internal to the application, and that the application " +
                "usually cannot anticipate or recover from.");
        temp.setOPT_FOUR(" Every class that is a subclass of RuntimeException and Error is categorized as checked " +
                "exception.");
        temp.setOPT_FIVE("Every class that is a subclass of Exception, excluding RuntimeException and its subclasses, is " +
                "categorized as checked exception.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("2");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("A E");
        temp.setEXPLANATION("Self Explanatory !");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("197");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("public static void main(String[ ] args) {\n" +
                "\tint x = 353;\n" +
                "\tint j = x++;\n" +
                "\tswitch (j) {\n" +
                "\t\tcase 317:\n" +
                "\t\tcase 353:\n" +
                "\t\tcase 367:\n" +
                "\t\t\tSystem.out.println(\"Is a prime number.\");\n" +
                "\t\tcase 353:\n" +
                "\t\tcase 363:\n" +
                "\t\t\tSystem.out.println(\"Is a palindrome.\");\n" +
                "\t\tbreak;\n" +
                "\t\tdefault:\n" +
                "\t\t\tSystem.out.println(\"Invalid value.\");\n" +
                "\t}\n" +
                "}\n\n" +
                "What is the result?");
        temp.setOPT_ONE("Compilation fails\n");
        temp.setOPT_TWO("Is a prime number.");
        temp.setOPT_THREE("Is a palindrome.");
        temp.setOPT_FOUR("Is a prime number.\n" +
                "Is a palindrome.");
        temp.setOPT_FIVE("Invalid value.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("3");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("Exception in thread \"main\" java.lang.Error: Unresolved compilation problems:\n" +
                "Duplicate case\n" +
                "Duplicate case\n");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("198");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "public class DoWhile1 {\n" +
                "\tpublic static void main (String[ ] args) {\n" +
                "\t\tint i = 2;\n" +
                "\t\tdo {\n" +
                "\t\t\tSystem.out.println(i);\n" +
                "\t\t} while (--i);\n" +
                "\t}\n" +
                "}\n\n" +
                "What is the result?");
        temp.setOPT_ONE("1");
        temp.setOPT_TWO("2");
        temp.setOPT_THREE(" An exception is thrown at runtime\n");
        temp.setOPT_FOUR("The loop executes infinite times\n");
        temp.setOPT_FIVE("Compilation fails");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("E");
        temp.setEXPLANATION("Exception in thread \"main\" java.lang.Error: Unresolved compilation problem:\n" +
                "Type mismatch: cannot convert from int to boolean\n");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("199");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "public class Case {\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tString product = \"Pen\";\n" +
                "\t\tproduct.toLowerCase();\n" +
                "\t\tproduct.concat(\" BOX\".toLowerCase());\n" +
                "\t\tSystem.out.print(product.substring(4,6));\n" +
                "\t}\n" +
                "}\n\n" +
                "What is the result?\n");
        temp.setOPT_ONE("box");
        temp.setOPT_TWO("cbo");
        temp.setOPT_THREE("bo");
        temp.setOPT_FOUR("nb");
        temp.setOPT_FIVE("An exception is thrown at runtime");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("2");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("E");
        temp.setEXPLANATION("Exception in thread \"main\" java.lang.StringIndexOutOfBoundsException: " +
                "String index out of range: 6 at " +
                "java.lang.String.substring\n" +
                "As String product is still storing value Pen.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("200");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the code fragment:\n\n" +
                "StringBuilder sb = new StringBuilder();\n" +
                "sb.append(\"World\");\n\n" +
                "Which fragment prints Hello World?");
        temp.setOPT_ONE("sb.insert(0, \"Hello \");\n" +
                "System.out.println(sb);");
        temp.setOPT_TWO("sb.append(0, \"Hello \");\n" +
                "System.out.println(sb);");
        temp.setOPT_THREE("sb.add(0, \"Hello \");\n" +
                "System.out.println(sb);");
        temp.setOPT_FOUR("sb.set(0, \"Hello \");\n" +
                "System.out.println(sb);");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("The java.lang.StringBuilder.insert(int offset, char c) method " +
                "inserts the string representation of the char argument into this sequence.\n" +
                "The second argument is inserted into the contents of this sequence at the position indicated by offset. " +
                "The length of this sequence increases by one.The offset argument must be greater than or equal to 0, " +
                "and less than or equal to the length of this sequence.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("201");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "1. interface Pet { }\n" +
                "2. class Dog implements Pet { }\n" +
                "3. class Beagle extends Dog { }\n\n" +
                "Which three are valid?");
        temp.setOPT_ONE("Pet a = new Dog();");
        temp.setOPT_TWO("Pet b = new Pet();");
        temp.setOPT_THREE("Dog f = new Pet();");
        temp.setOPT_FOUR("Dog d = new Beagle();");
        temp.setOPT_FIVE("Pet e = new Beagle();");
        temp.setOPT_SIX("Beagle c = new Dog();");
        temp.setNo_Opt("6");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("2");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("A D E");
        temp.setEXPLANATION("B & C: We can not instantiate the interface (since they do not have constructor).\n" +
                "F: It is breaking the principles of Polymorphism. The reason is because subclasses generally define additional behavior. " +
                "If you could assign a superclass object to a subclass reference, you would run into problems at " +
                "runtime when you try to access class members that don't actually exist.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("202");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n" +
                "class MarksOutOfBoundsException extends IndexOutOfBoundsException { }\n" +
                "public class GradingProcess {\n" +
                "\tvoid verify(int marks) throws IndexOutOfBoundsException { \n" +
                "\t\tif (marks > 100) {\n" +
                "\t\t\tthrow new MarksOutOfBoundsException();\n" +
                "\t\t}\n" +
                "\t\tif (marks > 50) {\n" +
                "\t\t\tSystem.out.print(\"Pass\");\n" +
                "\t\t} else {\n" +
                "\t\t\tSystem.out.print(\"Fail\");\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tint marks = Integer.parseInt(args[2]);\n" +
                "\t\ttry {\n" +
                "\t\t\tnew GradingProcess().verify(marks);\n" +
                "\t\t} catch (Exception e) {\n" +
                "\t\t\tSystem.out.print(e.getClass());\n" +
                "\t\t}\n" +
                "\t}\n" +
                "}\n\n" +
                "And the command line invocation:\n" +
                "java GradingProcess 89 50 104\n" +
                "What is the result?");
        temp.setOPT_ONE("Pass");
        temp.setOPT_TWO("Fail");
        temp.setOPT_THREE("class MarksOutOfBoundsException");
        temp.setOPT_FOUR("class IndexOutOfBoundsException");
        temp.setOPT_FIVE("class Exception");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("2");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("For 89 & 50 program will run fine. But for 104 which is greater than 100(check the 'if(marks > 100)' condition), " +
                "it will throw new MarksOutOfBoundsException(). In catch e.getClass will print the class name i.e class MarksOutOfBoundsException.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("203");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the code fragment:\n" +
                "String[ ] colors = {\"red\", \"blue\", \"green\", \"yellow\", \"maroon\", \"cyan\"};\n\n" +
                "Which code fragment prints blue, cyan, ?");
        temp.setOPT_ONE("for (String c:colors) {\n" +
                "\tif (c.length() != 4) {\n" +
                "\t\tcontinue;\n" +
                "\t}\n" +
                "\tSystem.out.print(c + \", \");\n" +
                "}");
        temp.setOPT_TWO("for (String c:colors[ ]) {\n" +
                "\tif (c.length() <= 4) {\n" +
                "\t\tcontinue;\n" +
                "\t}\n" +
                "\tSystem.out.print(c + \", \");\n" +
                "}");
        temp.setOPT_THREE("for (String c: String[ ] colors) {\n" +
                "\tif (c.length() >= 3) {\n" +
                "\t\tcontinue;\n" +
                "\t}\n" +
                "\tSystem.out.print(c + \", \");\n" +
                "}");
        temp.setOPT_FOUR("for (String c:colors) {\n" +
                "\tif (c.length() != 4) {\n" +
                "\t\tSystem.out.print(c + \", \");\n" +
                "\t\tcontinue;\n" +
                "\t}\n" +
                "}");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("1");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("blue & cyan has string length 4. In Opt A, if length is not equal to 4, " +
                "the loop will continue & if length is 4 it will print that string");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("204");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "class A { }\n" +
                "class B { }\n" +
                "Interface X { }\n" +
                "Interface Y { }\n\n" +
                "Which two definitions of class C are valid?");
        temp.setOPT_ONE("class C extends A implements X { }");
        temp.setOPT_TWO("class C implements Y extends B { }");
        temp.setOPT_THREE("class C extends A, B { }");
        temp.setOPT_FOUR("class C implements X, Y extends B { }");
        temp.setOPT_FIVE("class C extends B implements X, Y { }");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("A E");
        temp.setEXPLANATION("When a subclass extends a class, it allows the subclass to inherit (reuse) " +
                "and override code defined in the supertype. " +
                "When a class implements an interface, it allows an object created " +
                "from the class to be used in any context that expects a value of the interface.\n" +
                "Java allows for a class to implement many interfaces.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("205");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "public class App {\n" +
                "// Insert code here\n" +
                "\t\tSystem.out.print(“Welcome to the world of Java”);\n" +
                "\t}\n" +
                "}\n\n" +
                "Which two code fragments, when inserted independently at line // Insert code here, " +
                "enable the program to execute and print the welcome message on the screen?");
        temp.setOPT_ONE("static public void main (String [ ] args) {");
        temp.setOPT_TWO("static void main (String [ ] args) {");
        temp.setOPT_THREE("public static void Main (String [ ] args) {");
        temp.setOPT_FOUR("public static void main (String [ ] args) {");
        temp.setOPT_FIVE("public void main (String [ ] args) {");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("A D");
        temp.setEXPLANATION("Incorrect:\n" +
                "Not B: Since the main function is inside a class. This main function should be having an access specifier.\n" +
                "Not C: main method not found.\n" +
                "Not E: main method is not static.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("206");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("public class Sample{  \n" +
                "\tpublic static void main(String args[ ]){     \n" +
                "\t\tString blank  = \" \";  // one space   \n" +
                "\t\tString combine = blank + \"hello\" + blank + blank;\n" +
                "\t\tcombine.concat(\"world\"); \n" +
                "\t\tString newLine  =  combine.trim();   \n" +
                "\t\tSystem.out.println((int)(combine.length() + newLine.length())); \n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("25");
        temp.setOPT_TWO("24");
        temp.setOPT_THREE("23");
        temp.setOPT_FOUR("22");
        temp.setOPT_FIVE("21");
        temp.setOPT_SIX("None of the above");
        temp.setNo_Opt("6");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("2");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("F");
        temp.setEXPLANATION("Note that combine.concat(\"world\") does not change line itself. " +
                "It creates a new String object containing \" hello world\" " +
                "but it is lost because there is no reference to it. " +
                "Similarly, calling trim() does not change the object itself. So the answer is 8 + 5 = 13 !");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("207");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the code fragment:\n\n" +
                "if (aVar++ < 10) {\n" +
                "\tSystem.out.println(aVar + \" Hello World!\");\n" +
                "} else {\n" +
                "\tSystem.out.println(aVar + \" Hello Universe!\");\n" +
                "}\n\n" +
                "What is the result if the integer aVar is 9?");
        temp.setOPT_ONE("10 Hello world!");
        temp.setOPT_TWO("10 Hello universe!");
        temp.setOPT_THREE("9 Hello world!");
        temp.setOPT_FOUR("Compilation fails.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("3");
        temp.setDIFFICULTY("1");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("aVar++ is a post increment i.e aVar++ uses and then increments the variable.\n" +
                "So at the time of comparison aVar value is 9 & at the time of print it is 10");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("208");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following methods modify the object on which they are called?\n");
        temp.setOPT_ONE("setValue(int, String)of java.lang.String class.");
        temp.setOPT_TWO("The substring(int) method of the java.lang.String class");
        temp.setOPT_THREE("The replace() method of the java.lang.String class.");
        temp.setOPT_FOUR("The reverse() method of the StringBuilder class.");
        temp.setOPT_FIVE("None of these");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("1");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("A : There is no such method in String class.\n" +
                "B : String is an immutable object. calling substring(...) returns a new different String object. It cannot change the original object.\n" +
                "C : String objects can never be modified once created.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("209");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the result ?\n\n" +
                "List<String> val = Arrays.asList(\"20\", \"9\", \"2B\", \"GH\");\n" +
                "Collections.sort(val);\n" +
                "int m = Collections.binarySearch(val, \"9\");\n" +
                "int n = Collections.binarySearch(val, \"2B\");\n" +
                "int o = Collections.binarySearch(val, \"5A\");\n" +
                "System.out.println(m + \" \" + n + \" \" + o);");
        temp.setOPT_ONE("0 1 –2");
        temp.setOPT_TWO("0 1 –3");
        temp.setOPT_THREE("2 1 –2");
        temp.setOPT_FOUR("2 1 –3");
        temp.setOPT_FIVE("The code doesn’t even compile.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("3");
        temp.setMOCK("2");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("After sorting, val contains [20, 2B, 9, GH]. Remember that numbers sort before " +
                "letters and strings sort alphabetically. This makes 20 come before 9. A binary search " +
                "correctly finds 9 at index 2 and 2B at index 1. It cannot find 5A but notices it should " +
                "be at index 2. The rule when an item isn’t found is to negate that index and subtract 1. " +
                "Therefore, we get –2–1, which is –3.");
        temp.setDuplicate("true");
        dbActivity.insertData(temp, db);




        temp.setID("210");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n" +
                "public class CharToStr {\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tString str1 = \"Java\";\n" +
                "\t\tchar str2[ ] = {'J', 'a', 'v', 'a'};\n" +
                "\t\tString str3 = null;\n" +
                "\t\tfor (char c : str2) {\n" +
                "\t\t\tstr3 = str3 + c;\n" +
                "\t\t}\n" +
                "\t\tif (str1.equals(str3)) \n" +
                "\t\t\tSystem.out.print(\"Successful\");\n" +
                "\t\telse \n" +
                "\t\t\tSystem.out.print(\"Unsuccessful\");\n" +
                "\t}\n" +
                "}\n\n" +
                "What is result?");
        temp.setOPT_ONE("Successful");
        temp.setOPT_TWO("Unsuccessful");
        temp.setOPT_THREE("Compilation fails");
        temp.setOPT_FOUR("An exception is thrown at runtime");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("2");
        temp.setMOCK("3");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("str3 will be having string 'nullJava' in the end of for loop.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        // New Questions

        temp.setID("211");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which two are the correct parameter specification for the standard main method?\n");
        temp.setOPT_ONE("String[ ] args");
        temp.setOPT_TWO("Strings args[ ]");
        temp.setOPT_THREE("String args[ ]");
        temp.setOPT_FOUR("String args");
        temp.setOPT_FIVE("void");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A C");
        temp.setEXPLANATION("There is a no difference for args whether it is defined as String[ ] args or String args[ ].");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("212");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("How can you declare a method ocjp() such that an instance of the class is not needed to access it and all the members of the same package have access to it.\n" +
                "Select any 3 options.");
        temp.setOPT_ONE("void ocjp()");
        temp.setOPT_TWO("public static void ocjp()");
        temp.setOPT_THREE("protected void ocjp()");
        temp.setOPT_FOUR("static void ocjp()");
        temp.setOPT_FIVE("protected static void ocjp()");
        temp.setOPT_SIX("protected void ocjp()");
        temp.setNo_Opt("6");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("5");
        temp.setCORRECT_OPT("B D E");
        temp.setEXPLANATION("Since the question says, \"...an instance of the class is not needed...\", the method has to be static.\n" +
                "Also, as the question does not say that other packages should not have access to the method so public or protected is also correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("213");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n" +
                "\n" +
                "public class Eternal{\n" +
                "\tpublic static void main( String[ ] args){\n" +
                "\t\ttry{\n" +
                "\t\t\tint m = 0;\n" +
                "\t\t\tm =  Integer.parseInt( args[0] );\n" +
                "\t\t}\n" +
                "\t\tcatch(NumberFormatException e){\n" +
                "\t\t\tSystem.out.println(\"Problem in \" + m );\n" +
                "\t\t}\n" +
                "\t}\n" +
                "}\n" +
                "What will be the output if it is run with the following command line:\n" +
                "java Eternal one");
        temp.setOPT_ONE("It will throw an exception and end without printing anything.");
        temp.setOPT_TWO("It will print Problem in one");
        temp.setOPT_THREE("It will print Problem in 0");
        temp.setOPT_FOUR("It will not even compile.");
        temp.setOPT_FIVE("It will not print anything if the argument is '1' instead of 'one'.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("6");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("Because 'm' is defined in try block and so it is not visible in the catch block.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("214");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What will be the output ?\n" +
                "\n" +
                "public class Eternal{\n" +
                "\tpublic static long main(String[ ] args){\n" +
                "\t\tSystem.out.println(\"Hello World\");\n" +
                "\t\treturn 10L;\n" +
                "\t} \n" +
                "}");
        temp.setOPT_ONE("It will print nothing.");
        temp.setOPT_TWO("It will not compile");
        temp.setOPT_THREE("Hello World");
        temp.setOPT_FOUR("It will throw an Error at runtime.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("2");
        temp.setMOCK("7");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("When the program is run, the JVM looks for a method named main() which takes an array of Strings as input and returns nothing (i.e. the return type is void). But in this case, it doesn't find such a method ( the given main() method is returning long!) so it throws a java.lang.NoSuchMethodError.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("215");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Select 3 options which can be successfully inserted at line 1....\n\n" +
                "//line 1\n" +
                "public class Test{\n" +
                "}");
        temp.setOPT_ONE("package p.util;");
        temp.setOPT_TWO("import java.lang.*;");
        temp.setOPT_THREE("abstract class Eternal{ }");
        temp.setOPT_FOUR("public class Eternal{ }");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A B C");
        temp.setEXPLANATION("Opt A: It is a perfectly valid package statement.\n" +
               "Opt B: Although this package is automatically imported, it is not an error to import it explicitly.\n" +
                "Opt C: You can have more than one classes in a file but at most one of them can be public.\n" +
               "Opt D: There can be only 1 \"public\" class within package scope in a file. You can have additional inner classes that are public though.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("216");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n\n" +
                "1: class Eternal{ }\n" +
                "2: public class TestClass {\n" +
                "3:  public int main(String[ ] args)  {\n" +
                "4:   double x=15, double y;\n" +
                "5:   System.out.println[ ];\n" +
                "6:   for(int i=0; i<x; i++){ }\n" +
                "7:   return 0;\n" +
                "8:  }\n" +
                "9: } \n" +
                "Which of the lines are invalid ?");
        temp.setOPT_ONE("Line 1 and Line 5");
        temp.setOPT_TWO("Line 4 and Line 5");
        temp.setOPT_THREE("Line 3 and Line 4");
        temp.setOPT_FOUR("Line 3 and Line 5");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("2");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("4: is invalid syntax. It can be written as either double x=15; double y;  or double x=15, y;\n" +
                "5: is invalid because println is not a class name. So you cannot create an array of it. println is a method. So it should be written as System.out.println();");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("217");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n\n" +
                "1 : public Object Eternal(Object a) {\n" +
                "2 :  Object b = new Object();\n" +
                "3 :  Object c, d = new Object();\n" +
                "4 :  c = b;\n" +
                "5 :  b = a = null; \n" +
                "6 :  return c;\n" +
                "7 : }\n" +
                "After which line will the object created at line 2 be eligible for garbage collection?");
        temp.setOPT_ONE("Line 4");
        temp.setOPT_TWO("Line 5");
        temp.setOPT_THREE("Line 6");
        temp.setOPT_FOUR("Never in this method.");
        temp.setOPT_FIVE("Line 7");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("3");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("At line 4, c is assigned the reference of b. i.e. c starts pointing to the object created at line 2. So even if at //Line 5 b and a are set to null, the object is not without any reference.Also, at Line 6 c is being returned. So the object referred to by c cannot be garbage collected in this method!");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("218");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n\n" +
                "1 :  class Eternal { } \n" +
                "2 :  public class TestClass{\n" +
                "3 :   Eternal getEternalObject(){\n" +
                "4 :    Eternal mc = new Eternal();\n" +
                "5 :    return mc;\n" +
                "6 :   }\n" +
                "7 :   public static void main(String[ ] args){\n" +
                "8 :    TestClass tc = new TestClass();\n" +
                "9 :    Eternal x = tc.getEternalObject();\n" +
                "10 :   System.out.println(\"got eternal object\");\n" +
                "11 :   x = new Eternal();\n" +
                "12 :   System.out.println(\"done\");\n" +
                "13 :  } \n" +
                "14 : }\n\n" +
                "After what line the Eternal object created at line 4 will be eligible for garbage collection?");
        temp.setOPT_ONE("At Line 6");
        temp.setOPT_TWO("At Line 8");
        temp.setOPT_THREE("At Line 11");
        temp.setOPT_FOUR("At Line 12");
        temp.setOPT_FIVE("At Line 13");
        temp.setOPT_SIX("Never till the program ends.");
        temp.setNo_Opt("6");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("3");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("At line 11, x starts pointing to a new Eternal Object and no reference to the original Eternal object is left.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("219");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Select two statements which are true?");
        temp.setOPT_ONE("A class may contain both static and non-static variables and both static and non-static methods. ");
        temp.setOPT_TWO("A static method can call other non-static methods in the same class by using the 'this' keyword.");
        temp.setOPT_THREE("Instance methods may access local variables of static methods.");
        temp.setOPT_FOUR("All methods in a class are implicitly passed a 'this' parameter when called.");
        temp.setOPT_FIVE("Each object of a class has its own copy of each non-static member variable.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A E");
        temp.setEXPLANATION("Opt B : 'this' reference is not available within a static method.\n" +
                "Opt C : local variables can only be accessed in the method they are defined. So you cannot access them anywhere outside that method.\n" +
                "Opt D : All non-static/instance methods in a class are implicitly passed a 'this' parameter when called.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("220");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Select two options which are valid at line 1?\n" +
                "\n" +
                "public class Eternal{\n" +
                "\t//line 1: insert code here.\n" +
                "}");
        temp.setOPT_ONE("String s;");
        temp.setOPT_TWO("String s = 'aaa';");
        temp.setOPT_THREE("String s = 'a';");
        temp.setOPT_FOUR("String s = aaa;");
        temp.setOPT_FIVE("String s = this.toString();");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A E");
        temp.setEXPLANATION("Since every class directly or indirectly extends Object class and since Object class has a toString() method, that toString() method will be invoked and the String that it returns will be assigned to s.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("221");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Select 2 of the given options which can be inserted at line 1 so that the following code can compile without any errors?\n" +
                "package eternal;\n" +
                "public class StaticImports{\n" +
                "\tpublic StaticImports(){\n" +
                "\t\tout.println(MAX_VALUE);\n" +
                "\t}\n" +
                "}\n" +
                "(Assume that java.lang.Integer has a static field named MAX_VALUE)");
        temp.setOPT_ONE("static import Integer.MAX_VALUE;");
        temp.setOPT_TWO("import static java.lang.System.*;");
        temp.setOPT_THREE("static import java.lang.System.*;");
        temp.setOPT_FOUR("static import java.lang.System.out;");
        temp.setOPT_FIVE("import static java.lang.Integer.*;");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B E");
        temp.setEXPLANATION("The order of keywords for a static import must be \"import static ... \". You can either import all the static members using import static java.lang.Integer.* or one specific member using import static java.lang.Integer.MAX_VALUE;");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("222");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given : \n\n" +
                "package util.log4j;\n" +
                "public class Eternal {\n" +
                "\tpublic void log(String msg){\n" +
                "\t\tSystem.out.println(msg);\n" +
                "\t}\n" +
                "}\n" +
                "and\n" +
                "package util;\n" +
                "public class Ocjp {\n" +
                "\tpublic static void main(String[ ] args) throws Exception {\n" +
                "\t\tEternal eternal = new Eternal();\n" +
                "\t\teternal.log(\"hello\");\n" +
                "\t}\n" +
                "}\n\n" +
                "What changes, when made independently, will enable the code to compile and run?");
        temp.setOPT_ONE("Remove package util.log4j; from Eternal.");
        temp.setOPT_TWO("Replace Eternal eternal = new Eternal(); with: util.log4j.Eternal eternal = new util.log4j.Eternal();");
        temp.setOPT_THREE("Replace package util.log4j; with package util;");
        temp.setOPT_FOUR("Replace Eternal eternal = new Eternal(); with: log4j.Eternal eternal = new log4j.Eternal();");
        temp.setOPT_FIVE("Add import log4j; to TestClass.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("2");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B C");
        temp.setEXPLANATION("Opt B : Using a fully qualified class name always works irrespective of whether you import the package or not.  In this case, all classes of package util are available in TestClass without any import statement but Eternal is in util.log4j. Therefore, the use of fully qualified class name for Eternal, which is util.log4j.Eternal, makes it work.\n" +
                "Opt C: This will put both the classes in the same package and TestClass can then directly use Eternal class without importing anything.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("223");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n" +
                "public class Eternal {\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tSystem.out.println(\"Result : \"+args[0]+args[1]);\n" +
                "\t}\n" +
                "}\n" +
                "What will be the output of the following program when it is compiled and run with the command line:\n" +
                "java Eternal 1 2 3");
        temp.setOPT_ONE("Result : java Eternal");
        temp.setOPT_TWO("Result : Eternal 1");
        temp.setOPT_THREE("Result : 23");
        temp.setOPT_FOUR("Result : 12");
        temp.setOPT_FIVE("Values : 3");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("In Java, command line arguments are passed into the program using the String[ ] parameter to the main method. The String array contains actual parameters and does not include java and the name of the class. Therefore, in this case, args will point to an array of Strings with 3 elements - \"1\", \"2\", and \"3\". The program prints out only args[0] and args[1], which is 1 and 2.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("224");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the following class, which four statements can be inserted at line 1 without causing the code to fail compilation?\n" +
                "\n" +
                "public class Eternal{\n" +
                "\tint a;\n" +
                "\tint b = 0;\n" +
                "\tstatic int c;\n" +
                "\tpublic void m(){\n" +
                "\t\tint d;\n" +
                "\t\tint e = 0;\n" +
                "\t\t// Line 1\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("a++;");
        temp.setOPT_TWO("b++;");
        temp.setOPT_THREE("c++;");
        temp.setOPT_FOUR("d++;");
        temp.setOPT_FIVE("e++;");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A B D E");
        temp.setEXPLANATION("All the instance or static variables are given a default values if they are not explicitly initialized. All numeric variable are given a value of zero or equivalent to zero (i.e. 0 for integral types and 0.0 for double/float). Booleans are initialized to false and objects are initialized to null.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("225");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following are valid declarations of the standard main() method?\n");
        temp.setOPT_ONE("public static void main (String args) { }");
        temp.setOPT_TWO("final static public void main (String[ ] arguments) { }");
        temp.setOPT_THREE("public static void main (String[ ] args) { }");
        temp.setOPT_FOUR("static void main(String args[ ]) { }");
        temp.setOPT_FIVE("public static int main(String args[ ]) {}");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B C");
        temp.setEXPLANATION("A valid declaration of \"the\" main() method must be public and static, should return void, and should take a single array of Strings.  The order of the static and public keywords is irrelevant.But the return type should always come just before the method name.Applying final to the method does not change the method signature.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("226");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following lines can be inserted at line 1 to make the program run?\n\n" +
                "//line 1\n" +
                "public class Eternal{\n" +
                "\tpublic static void main(String[ ] args){\n" +
                "\t\tPrintWriter pw = new PrintWriter(System.out);\n" +
                "\t\tOutputStreamWriter osw  =  new OutputStreamWriter( System.out );\n" +
                "\t\tpw.print(\"hello\");\n" +
                "\t}\n" +
                "}\n\n" +
                "Assume that PrintWriter and OutputStreamWriter are valid classes in java.io package.");
        temp.setOPT_ONE("import java.io.OutputStreamWriter;");
        temp.setOPT_TWO("import java.lang.*;");
        temp.setOPT_THREE("import java.io.*;");
        temp.setOPT_FOUR("include java.io.*;");
        temp.setOPT_FIVE("include java.lang.System;");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("import java.io.*; will make all the classes of java.io package available.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("227");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n" +
                "public class Ocjp{\n" +
                "\tint i1;\n" +
                "\tstatic int i2;\n" +
                "\tpublic void method1(){\n" +
                "\t\tint i;\n" +
                "\t\t// line XXX\n" +
                "\t}\n" +
                "}\n" +
                "Which three statements can be inserted at line XXX, without causing any error ?");
        temp.setOPT_ONE("i = this.i1;");
        temp.setOPT_TWO("this = new Test( );");
        temp.setOPT_THREE("i = this.i2;");
        temp.setOPT_FOUR("this.i = 4;");
        temp.setOPT_FIVE("this.i1 = i2;");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("2");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A C E");
        temp.setEXPLANATION("Opt A: As i1 is an instance variable, it is accessible through 'this'.\n" +
                "Opt C: Although 'this' is not needed to access i2, it is not an error to do so.\n" +
                "Opt E: You are just assigning a static field's value to non-static field.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("228");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given:\n\n" +
                "public class Eternal{\n" +
                "\tpublic static void main(String args){\n" +
                "\t\tfor(int i=0; i<3; i++){\n" +
                "\t\t\tSystem.out.print(args+\" \");\n" +
                "\t\t}\n" +
                "\t}\n" +
                "}\n\n" +
                "What will be printed when the above class is run using the following command line:\n" +
                "java Eternal 1 2 3 4");
        temp.setOPT_ONE("1 1 1");
        temp.setOPT_TWO("1 2 3");
        temp.setOPT_THREE("Eternal 1 2");
        temp.setOPT_FOUR("java Eternal 1 2");
        temp.setOPT_FIVE("None of these.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("E");
        temp.setEXPLANATION("To run a class from the command line, you need a main(String[ ] ) method that takes an array of Strings array not just a String. Therefore, an exception will be thrown at runtime saying no main(String[ ] ) method found. ");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("229");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n" +
                "class Eternal{\n" +
                "\tstatic Eternal obj;\n" +
                "\tString[ ] arguments;\n" +
                "\tpublic static void main(String args[ ]){\n" +
                "\t\tobj = new Eternal();\n" +
                "\t\tobj.func(args);\n" +
                "\t}\n" +
                "\tpublic void func(String[ ] args){\n" +
                "\t\tobj.arguments = args;\n" +
                "\t}\n" +
                "}\n" +
                "What will be the output ? ");
        temp.setOPT_ONE("The program will fail to compile, since the static method main is trying to call the non-static method func.");
        temp.setOPT_TWO("The program will fail to compile, since the non-static method func cannot access the static member variable ref.");
        temp.setOPT_THREE("The program will fail to compile, since the argument args passed to the static method main cannot be passed on to the non-static method func.");
        temp.setOPT_FOUR("The program will fail to compile, since method func is trying to assign to the non-static member variable 'arguments' through the static member variable ref.");
        temp.setOPT_FIVE("The program will compile and run successfully.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("E");
        temp.setEXPLANATION("The concept here is that a non-static method (i.e. an instance method) can only be called on an instance of that class. Whether the caller itself is a static method or not, is immaterial.  The main method is calling obj.func(); - this means the main method is calling a non-static method on an actual instance of the class Eternal (referred to by 'obj'). Hence, it is valid. It is not trying calling it directly such as func() or this.func(), in which case, it would have been invalid.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("230");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of these are NOT legal declarations within a class?");
        temp.setOPT_ONE("final Object[ ] obj = { null } ;");
        temp.setOPT_TWO("static int b ;");
        temp.setOPT_THREE("abstract void ocjp( ) ;");
        temp.setOPT_FOUR("abstract int b ;");
        temp.setOPT_FIVE("final static private double ss = 3.14159265358979323846 ;");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("Variables can't be declared as abstract or native.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("231");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What does the arg[0] of the string array passed to the standard main method contain?\n");
        temp.setOPT_ONE("The string \"java\".");
        temp.setOPT_TWO("The name of the class.");
        temp.setOPT_THREE("The number of arguments.");
        temp.setOPT_FOUR("The first argument of the argument list, if present.");
        temp.setOPT_FIVE("None of the above.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("Note that if no argument is passed the args parameter is NOT null but a valid non-null String array of length zero.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("232");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Consider the following two java files:\n\n" +
                "//in file Eternal.java\n" +
                "package x.y;\n" +
                "public class Eternal{\n" +
                "\tpublic static void foo(){ };\n" +
                "}\n" +
                "//in file Sample.java\n" +
                "//insert import statement here //1\n" +
                "public class Sample{\n" +
                "\tpublic static void main(String[ ] args){\n" +
                "\t\tfoo();\n" +
                "\t}\n" +
                "}\n\n" +
                "What should be inserted at //1 so that Sample will compile and run?");
        temp.setOPT_ONE("import static x.y.*;");
        temp.setOPT_TWO("import static x.y.Eternal;");
        temp.setOPT_THREE("import static x.y.Eternal.foo;");
        temp.setOPT_FOUR("import static x.y.Eternal.foo();");
        temp.setOPT_FIVE("import static x.y.Eternal.*;");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C E");
        temp.setEXPLANATION("Opt C : This is valid because this statement is importing the static member foo of class x.y.Eternal.\n" +
                "Opt E: This is valid because this statement is importing all the static members of class x.y.Eternal.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("233");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n" +
                "class A { }\n" +
                "class B{\n" +
                "\tprivate A a = new A();\n" +
                "\tpublic void soft(A pM){\n" +
                "\t\tpM = null;\n" +
                "\t}\n" +
                "\tpublic void eternal(){\n" +
                "\t\tsoft(a);\n" +
                "\t}\n" +
                "\tpublic static void main(String[ ] args){\n" +
                "\t\tB b = new B();\n" +
                "\t\tb.eternal();\n" +
                "\t}\n" +
                "}\n" +
                "Which of the following statements are correct?");
        temp.setOPT_ONE("There are no instances of A to be garbage collected till the program ends.");
        temp.setOPT_TWO("Setting pM = null; in soft(), marks the private instance of A for garbage collection.");
        temp.setOPT_THREE("A call to b.eternal() marks the private instance of A for garbage collection.");
        temp.setOPT_FOUR("Private members of a class become eligible for garbage collection only when the instance of the class itself becomes eligible for garbage collection.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("3");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("1. An object can be made eligible for garbage collection by making sure there are no references pointing to that object.\n" +
                "2. You cannot directly invoke the garbage collector. You can suggest the JVM to perform garbage collection by calling System.gc();\n");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("234");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given :\n" +
                "public class Test{\n" +
                "\tvoid test(){\n" +
                "\t\tSample obj = new Sample();\n" +
                "\t\tobj.name = \"hello\";\n" +
                "\t\t// 1 insert code here\n" +
                "\t}\n" +
                "}\n" +
                "//In Sample.java\n" +
                "public class Sample{\n" +
                "\tint value;\n" +
                "\tString name;\n" +
                "}\n" +
                "What can be inserted at // 1, which will make the object referred to by obj eligible for garbage collection?");
        temp.setOPT_ONE("Runtime.getRuntime().gc();");
        temp.setOPT_TWO("obj.destroy();");
        temp.setOPT_THREE("obj = null;");
        temp.setOPT_FOUR("obj.finalize()");
        temp.setOPT_FIVE("obj.name = null; as well as obj = null;");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("This will make the object eligible for GC because there are no other references to it.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("235");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of these statements is correct in case of using modifiers ?\n");
        temp.setOPT_ONE("Local variable always have default accessibility.");
        temp.setOPT_TWO("You cannot specify visibility of local variables.");
        temp.setOPT_THREE("By default (i.e. no modifier) the member is only accessible to classes in the same package and subclasses of the class.");
        temp.setOPT_FOUR("Local variables can be declared as private.");
        temp.setOPT_FIVE("Local variables can only be declared as public.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("They are always only accessible within the block in which they are declared.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("236");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following are valid code snippets :");
        temp.setOPT_ONE("int a = b = c = 50;");
        temp.setOPT_TWO("int a, b, c = 50;");
        temp.setOPT_THREE("int a, b, c; a = b = c = 50;");
        temp.setOPT_FOUR("int a = 50, b, c;");
        temp.setOPT_FIVE("int a = 50 = b = c;");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("2");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B C D");
        temp.setEXPLANATION("Java does not allow chained initialization in declaration so option A and E are not valid.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("237");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the following set of member declarations:\n" +
                "\n" +
                "Line 1: int a;\n" +
                "Line 2: static int a;\n" +
                "Line 3: int f( )   { return a; }\n" +
                "Line 4: static int f( ) { return a; }\n" +
                "\n" +
                "Which of the following is true?");
        temp.setOPT_ONE("Line (1) and (3) cannot occur in the same class definition.");
        temp.setOPT_TWO("Line (2) and (4) cannot occur in the same class definition.");
        temp.setOPT_THREE("Line (1) and (4) cannot occur in the same class definition.");
        temp.setOPT_FOUR("Line (2) and (3) cannot occur in the same class definition.");
        temp.setOPT_FIVE("Line (1) and (2) cannot occur in the same class definition.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("Local variables can have same name as member variables. The local variables will simply shadow the member variables with the same names.\n" +
                "line (4) defines a static method that tries to access a variable named 'a' which is not locally declared.\n" +
                "Since the method is static, this access will only be valid if variable 'a' is declared static within the class. Therefore lines (1) and (4) cannot occur in the same definition.");
        temp.setEXPLANATION("C E");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("238");
        temp.setTYPE("1");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the following class, which of these are valid ways of referring to the class from outside of the package com.eternal?\n" +
                "package com.eternal;\n" +
                "public class Soft{\n" +
                "// ....\n" +
                "// lot of code...\n" +
                "}");
        temp.setOPT_ONE("Soft");
        temp.setOPT_TWO("importing com.* is illegal.");
        temp.setOPT_THREE("By importing the package com.* and referring to the class as eternal.Soft");
        temp.setOPT_FOUR("By importing com.eternal.* and referring to the class as Soft.");
        temp.setOPT_FIVE("By referring to the class as com.eternal.Soft.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("5");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D E");
        temp.setEXPLANATION("A class or interface can be referred to by using its fully qualified name or its simple name. Using the fully qualified name will always work, but to use the simple name either the class must be in the same package or it has to be imported. By importing com.eternal.* all the classes from the package will be imported and can be referred to using simple names. Importing com.* will not import the subpackage eternal. It will only import the classes in package com.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("239");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the proper filename extension for a Java bytecode\n" +
                "compiled file?");
        temp.setOPT_ONE(".java");
        temp.setOPT_TWO(".bytecode");
        temp.setOPT_THREE(".class");
        temp.setOPT_FOUR(".dll");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("The proper extension for a Java compiled bytecode file is " +
                ".class, making Option C the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("240");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given that a Date class exists in both the java.util and java.sql " +
                "packages, what is the result of compiling the following class?\n" +
                "1: import java.util.*;\n" +
                "2: import java.sql.*;\n" +
                "3: public class Eternal {\n" +
                "4:  private Date rob = new Date();\n" +
                "5:  private java.util.Date date = new java.util.Date();\n" +
                "6: }");
        temp.setOPT_ONE("The code does not compile because of lines 1 and 2.");
        temp.setOPT_TWO("The code does not compile because of line 4.");
        temp.setOPT_THREE("The code does not compile because of line 5.");
        temp.setOPT_FOUR("The code compiles without issue.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("2");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("The fact that the Date class exists in both packages does not " +
                "impact the ability to import both packages, so lines 1 and 2 " +
                "compile without issue, and Option A is incorrect. Line 4 will not " +
                "compile because the Date class used is ambiguous, making Option " +
                "B correct and Option D incorrect. Finally, Option C is incorrect " +
                "because line 5 does compile, as the fully qualified name of the " +
                "class is used.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("241");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which variables have a scope limited to a method?");
        temp.setOPT_ONE("Interface variables");
        temp.setOPT_TWO("Class variables");
        temp.setOPT_THREE("Instance variables");
        temp.setOPT_FOUR("Local variables");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("Only local variables have such a small scope, making Option D " +
                "the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("242");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following is not a valid code comment in Java?");
        temp.setOPT_ONE("// Add 5 to the result");
        temp.setOPT_TWO("/*** TODO: Fix bug 12312 ***/");
        temp.setOPT_THREE("# Add configuration value");
        temp.setOPT_FOUR("/* Read file from system ****/");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Java accepts Options A, B, and D as valid comments. Note that " +
                "the /* */ syntax can have additional (and uneven) star (*) " +
                "characters as shown in B and D. Option C is incorrect as hashtag " +
                "(#) is not a valid comment character in Java.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("243");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which statement about a valid .java file is true?");
        temp.setOPT_ONE("It can only contain one class declaration.");
        temp.setOPT_TWO("It can contain one public class declaration and one public\n" +
                "interface definition.");
        temp.setOPT_THREE("It must define at least one public class.");
        temp.setOPT_FOUR("It may define at most one public class.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("2");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("A valid .java file may define any number of classes or " +
                "interfaces but have at most one public class. It can also not define " +
                "any public classes. For these reasons, Option A, B, and C are " +
                "incorrect, leaving Option D as the only correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("244");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which statement about import statements is true?");
        temp.setOPT_ONE("The class will not compile if it contains unused import " +
                "statements.");
        temp.setOPT_TWO("Unused import statements can be removed from the class " +
                "without causing a class to become unable to be compiled.");
        temp.setOPT_THREE("The class will not compile if a duplicate import statement is " +
                "present.");
        temp.setOPT_FOUR("If a class contains an import statement for a class used in the " +
                "program that cannot be found, it can still compile.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("class will compile if it has unused or redundant import " +
                "statements, making Option A and C incorrect. Option D is also " +
                "incorrect as the compiler must be able to locate the class of the " +
                "import statement. The correct answer is Option B. Removing " +
                "unused import statements does not cause a class to become " +
                "unable to be compiled.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("245");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the result of compiling and executing the following class?\n" +
                "1: public class ParkRanger {\n" +
                "2: int birds = 10;\n" +
                "3: public static void main(String[ ] data) {\n" +
                "4: int trees = 5;\n" +
                "5: System.out.print(trees+birds);\n" +
                "6: }\n" +
                "7: }");
        temp.setOPT_ONE("It does not compile.");
        temp.setOPT_TWO("It compiles but throws an exception at runtime.");
        temp.setOPT_THREE("It compiles and outputs 5.");
        temp.setOPT_FOUR("It compiles and outputs 15.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("2");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("The code does not compile because of line 5, making Option A " +
                "the correct answer. For this question, it helps to understand " +
                "variable scope. The main() method is static and does not have " +
                "access to any class instance variables. The birds variable is not " +
                "static and requires a class instance variable to access. Therefore, " +
                "the code does not compile when the static method attempts to " +
                "access a non-static variable without an instance of the class.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("246");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following lines of code is not allowed as the first line " +
                "of a Java class file?");
        temp.setOPT_ONE("import widget.*;");
        temp.setOPT_TWO("// Widget Manager");
        temp.setOPT_THREE("package sprockets;");
        temp.setOPT_FOUR("int facilityNumber;");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("2");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("A class can start with a comment, an optional package " +
                "statement, or an import statement if there is no package " +
                "statement. It cannot start with a variable definition, making " +
                "Option D the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("247");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which one of the following statements is true about using " +
                "packages to organize your code in Java?");
        temp.setOPT_ONE("Every class is required to include a package declaration.");
        temp.setOPT_TWO("To create a new package, you need to add a package.init file to " +
                "the directory.");
        temp.setOPT_THREE("Packages allow you to limit access to classes, methods, or data " +
                "from classes outside the package.");
        temp.setOPT_FOUR("It is not possible to restrict access to objects and methods " +
                "within a package.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Classes may be defined without a package declaration and are " +
                "placed in the default package, so Option A is incorrect. Option B is " +
                "a completely false statement as no such file is required in Java. " +
                "Option C is correct as it is one of the primary reasons for " +
                "organizing your application into packages. Option D is incorrect as " +
                "package-private allows access to methods and variables to be " +
                "limited to those classes within the same package.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("248");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Structuring a Java class such that only methods within the class\n" +
                "can access its instance variables is referred to as _______.");
        temp.setOPT_ONE("platform independence");
        temp.setOPT_TWO("object orientation");
        temp.setOPT_THREE("inheritance");
        temp.setOPT_FOUR("encapsulation");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("Encapsulation is the technique of removing access to a class’s " +
                "instance variables from processes outside the class, making " +
                "Option D the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("249");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following code snippet?\n" +
                "String tree = \"pine\";\n" +
                "int count = 0;\n" +
                "if (tree.equals(\"pine\")) {\n" +
                "\tint height = 55;\n" +
                "\tcount = count + 1;\n" +
                "}" +
                "System.out.print(height + count);");
        temp.setOPT_ONE("1");
        temp.setOPT_TWO("55");
        temp.setOPT_THREE("56");
        temp.setOPT_FOUR("It does not compile.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("The height variable is declared within the if-then statement " +
                "block. Therefore, it cannot be referenced outside the if-then " +
                "statement and the code does not compile.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("250");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following is true of a Java bytecode file?");
        temp.setOPT_ONE("It can be run on any computer with a compatible JVM.");
        temp.setOPT_TWO("It can only be executed on the same type of computer that it " +
                "was created on.");
        temp.setOPT_THREE("It can be easily read and modified in a standard text editor.");
        temp.setOPT_FOUR("It requires the corresponding .java that created it to execute.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("A Java bytecode file is a binary encoded set of instructions " +
                "designed to be run on any computer with a compatible JVM, " +
                "making Option A the only correct answer. By compatible JVM, we " +
                "mean one capable of running the class file. For example, a Java 6 " +
                "JVM may have trouble executing a Java 8 compiled file. Option B " +
                "is incorrect, and is more a facet of machine language compiled " +
                "programming classes. Option C is also incorrect as binary data is " +
                "not particularly human readable. Finally, Option D is incorrect as " +
                "the compiled file can be distributed without its .java source file " +
                "and execute without issue.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("251");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the result of compiling and executing the following class?\n" +
                "1: public class Tolls {\n" +
                "2: private static int yesterday = 1;\n" +
                "3: int tomorrow = 10;\n" +
                "4: public static void main(String[ ] args) {\n" +
                "5: Tolls tolls = new Tolls();\n" +
                "6: int today=20, tomorrow = 40;\n" +
                "7: System.out.print(today + tolls.tomorrow + " +
                "tolls.yesterday);\n" +
                "8: }\n" +
                "9: }");
        temp.setOPT_ONE("The code does not compile due to line 6.");
        temp.setOPT_TWO("The code does not compile due to line 7.");
        temp.setOPT_THREE("31");
        temp.setOPT_FOUR("61");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("2");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("The code compiles and runs without issue, so Options A and B " +
                "are incorrect. The question relies on your ability to understand " +
                "variable scope. The variable today has local scope to the method in " +
                "which it is executed. The variable tomorrow is re-declared in the " +
                "method, but the reference used on line 7 is to the instance variable " +
                "with a value of 10. Finally, the variable tomorrow is static. While " +
                "using an instance reference to access a static variable is not " +
                "recommended, it does not prevent the variable from being read. " +
                "The result is line 7 evaluates and prints (20 + 10 + 1) = 31, making " +
                "C the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("252");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the following class definition, which is the only line that\n" +
                "does not contain a compilation error?\n" +
                "1: public ThisClassDoesNotCompile {\n" +
                "2: double int count;\n" +
                "3: void errors() {}\n" +
                "4: static void private limit; }");
        temp.setOPT_ONE("Line 1");
        temp.setOPT_TWO("Line 2");
        temp.setOPT_THREE("Line 3");
        temp.setOPT_FOUR("Line 4");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Line 1 is missing the class keyword. Line 2 contains two types " +
                "for the same variable. Line 3 is a valid definition for a method, " +
                "making C the correct answer. Finally, line 4 contains an access " +
                "modifier, private, after the return type, which is not allowed. In " +
                "addition, void is an invalid type for variables.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("253");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the following wildcard import statements, which class " +
                "would be included in the import?\n" +
                "import television.actor.*;\n" +
                "import movie.director.*;");
        temp.setOPT_ONE("television.actor.recurring.Marie");
        temp.setOPT_TWO("movie.directors.John");
        temp.setOPT_THREE("television.actor.Package");
        temp.setOPT_FOUR("movie.NewRelease");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Option A is incorrect as the sub-package recurring is not " +
                "included by the import statements. Option B is also incorrect as it " +
                "uses the plural directors instead of the singular director used in " +
                "the import statements. Option D is incorrect as the wildcard is " +
                "applied to the sub-package movie.director, not the package movie. " +
                "Finally, Option C is correct as it is a valid class accessible from the " +
                "wildcard import.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("254");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the following class definition, what is the maximum " +
                "number of import statements that can be discarded and still have " +
                "the code compile? For this question, assume that the Blackhole " +
                "class is defined only in the stars package.\n" +
                "package planetarium;\n" +
                "import java.lang.*;\n" +
                "import stars.*;\n" +
                "import java.lang.Object;\n" +
                "import stars.Blackhole;\n" +
                "public class Observer {\n" +
                "\tpublic void find(Blackhole blackhole) {}\n" +
                "}");
        temp.setOPT_ONE("Zero");
        temp.setOPT_TWO("One");
        temp.setOPT_THREE("Two");
        temp.setOPT_FOUR("Three");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("The import statements for stars.* and stars.Blackhole are " +
                "redundant import statements, since only the class Blackhole is " +
                "used, and therefore one of them can be safely removed. The " +
                "import statements java.lang.* and java.lang.Object are both " +
                "not required as java.lang is automatically imported in every Java " +
                "class. Therefore, three of the four import statements can be safely " +
                "removed, making the correct answer Option D.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("255");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following is a true statement?");
        temp.setOPT_ONE("The java command compiles a .java file into a .class file.");
        temp.setOPT_TWO("The javac command compiles a .java file into a .class file.");
        temp.setOPT_THREE("The java command compiles a .class file into a .java file.");
        temp.setOPT_FOUR("The javac command compiles a .class file into a .java file.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("The javac command compiles a .java file into a .class " +
                "bytecode file, making Option B the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("256");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the following code, what values inserted in order into the " +
                "blank lines, allow the code to compile?\n" +
                "_______agent;\n" +
                "public _______Banker {\n" +
                "\tprivate static _______getMaxWithdrawal() {\n" +
                "\t\treturn 10;\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("import, class, null");
        temp.setOPT_TWO("import, interface, void");
        temp.setOPT_THREE("package, int, int");
        temp.setOPT_FOUR("package, class, long");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("Option A is incorrect as the return type of the method cannot " +
                "be null. Option B is also incorrect as the return type cannot be " +
                "void if the method uses a return statement. Option C is incorrect " +
                "too as the class keyword is replaced with int. Option D is correct " +
                "because it’s the only answer that allows the code to compile " +
                "without issue.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("257");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following method signatures is not a valid " +
                "declaration of an entry point in a Java application?");
        temp.setOPT_ONE("public static void main(String... arguments)");
        temp.setOPT_TWO("public static void main(String arguments)");
        temp.setOPT_THREE("public static final void main(String[ ] arguments)");
        temp.setOPT_FOUR("public static void main(String[ ] arguments)");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("An entry point in a Java application consists of a main() method " +
                "with a single String[ ] argument, return type of void, and " +
                "modifiers public and static. Option D is the typical syntax for " +
                "this method, although Options A and C are also valid forms of this " +
                "method. Note that the modifier final is optional and may be " +
                "added to the method signature. Furthermore, the main() method " +
                "may take a vararg or array. Option B is the only invalid declaration " +
                "as it does not take an array as an argument.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("258");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given a class that uses the following import statements, which " +
                "class would not be automatically accessible within the class " +
                "without using its full package name?\n\n" +
                "import dog.*;\n" +
                "import dog.puppy.*;");
        temp.setOPT_ONE("dog.puppy.female.KC");
        temp.setOPT_TWO("dog.puppy.Georgette");
        temp.setOPT_THREE("dog.Webby");
        temp.setOPT_FOUR("java.lang.Object");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("Options B and C are accessible within the class as they are " +
                "covered by the import statements. Option D is also fine as " +
                "java.lang.Object is available without an explicit import. The only " +
                "class not automatically accessible within the class without the full " +
                "package name is dog.puppy.female.KC as the import statements " +
                "do not include sub-packages; therefore, Option A is the correct " +
                "answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("259");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the following application, what is the expected output?\n" +
                "public class Keyboard {\n" +
                "\tprivate boolean numLock = true;\n" +
                "\tstatic boolean capLock = false;\n" +
                "\tpublic static void main(String... shortcuts) {\n" +
                "\t\tSystem.out.print(numLock+\" \"+capLock);\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("true false");
        temp.setOPT_TWO("false false");
        temp.setOPT_THREE("It does not compile.");
        temp.setOPT_FOUR("It compiles but throws an exception at runtime.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("2");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("The numLock variable is not accessible in the static main() " +
                "method without an instance of the Keyboard class; therefore, the " +
                "code does not compile, and Option C is the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("260");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the result of compiling and executing the following class?\n" +
                "package sports;\n" +
                "public class Bicycle {\n" +
                "\tString color = \"red\";\n" +
                "\tprivate void printColor(String color) {\n" +
                "\t\tcolor = \"purple\";\n" +
                "\t\tSystem.out.print(color);\n" +
                "\t}\n" +
                "\tpublic static void main(String[ ] rider) {\n" +
                "\t\tnew Bicycle().printColor(\"blue\");\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("red");
        temp.setOPT_TWO("purple");
        temp.setOPT_THREE("blue");
        temp.setOPT_FOUR("It does not compile.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("First off, the color variable defined in the instance and set to " +
                "red is ignored in the method printColor() as local scope overrides " +
                "instance scope, so Option A is incorrect. The value of color passed " +
                "to the printColor() method is blue, but that is lost by the " +
                "assignment to purple, making Option B the correct answer and " +
                "Option C incorrect. Option D is incorrect as the code compiles and " +
                "runs without issue.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("261");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which statements about calling the compilation command javac " +
                "and the execution command java are true?\n" +
                "I. java may use a period . to separate packages.\n" +
                "II. javac takes a .java file and returns a .class file.\n" +
                "III. java may use a slash (/) to separate packages.");
        temp.setOPT_ONE("I only");
        temp.setOPT_TWO("II only");
        temp.setOPT_THREE("I and II");
        temp.setOPT_FOUR("I, II, and III");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("The javac command takes a text-based .java file and returns a " +
                "binary bytecode .class file, making II a true statement. The java " +
                "command uses a period (.) to separate packages, not a slash (/), " +
                "making I a true statement and III a false statement. For these " +
                "reasons, Option C is the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("262");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the result of compiling and executing the following " +
                "application?\n" +
                "package forecast;\n" +
                "public class Weather {\n" +
                "\tprivate static boolean heatWave = true;\n" +
                "\tpublic static void main() {\n" +
                "\t\tboolean heatWave = false;\n" +
                "\t\tSystem.out.print(heatWave);\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("true");
        temp.setOPT_TWO("false");
        temp.setOPT_THREE("It does not compile.");
        temp.setOPT_FOUR("It compiles but throws an error at runtime.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("1");
        temp.setDIFFICULTY("2");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("The application compiles without issue, so Option C is " +
                "incorrect. The application does not execute though, as the main() " +
                "method does not have the correct method signature. It is missing " +
                "the required input argument, an array of String. Trying to execute " +
                "the application without a proper entry point produces an error, making Option D the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("263");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following declarations does not compile?");
        temp.setOPT_ONE("double num1, int num2 = 0;");
        temp.setOPT_TWO("int num1, num2;");
        temp.setOPT_THREE("int num1, num2 = 0;");
        temp.setOPT_FOUR("int num1 = 0, num2 = 0;");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("Option A does not compile because Java does not allow " +
                "declaring different types as part of the same declaration. The other " +
                "three options show various legal combinations of combining " +
                "multiple variables in the same declarations with optional default " +
                "values.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("264");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which is correct about an instance variable of type String?");
        temp.setOPT_ONE("It defaults to an empty string.");
        temp.setOPT_TWO("It defaults to null.");
        temp.setOPT_THREE("It does not have a default value.");
        temp.setOPT_FOUR("It will not compile without initializing on the declaration line.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("Instance variables have a default value based on the type. For " +
                "any non-primitive, including String, that type is a reference to " +
                "null. Therefore Option B is correct. If the variable was a local " +
                "variable, Option C would be correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("265");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of these class names best follows standard Java naming conventions?");
        temp.setOPT_ONE("fooBar");
        temp.setOPT_TWO("FooBar");
        temp.setOPT_THREE("FOO_BAR");
        temp.setOPT_FOUR("F_o_o_B_a_r");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("In Java, class names begin with an uppercase letter by " +
                "convention. Then they use lowercase with the exception of new " +
                "words. Option B follows this convention and is correct. Option A " +
                "follows the convention for variable names. Option C follows the " +
                "convention for constants. Option D doesn’t follow any Java " +
                "conventions.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("266");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("How many of the following methods compile?\n" +
                "public String convert(int value) {\n" +
                "\treturn value.toString();\n" +
                "}\n" +
                "public String convert(Integer value) {\n" +
                "\treturn value.toString();\n" +
                "}\n" +
                "public String convert(Object value) {\n" +
                "\treturn value.toString();\n" +
                "}");
        temp.setOPT_ONE("None");
        temp.setOPT_TWO("One");
        temp.setOPT_THREE("Two");
        temp.setOPT_FOUR("Three");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("2");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Objects have instance methods while primitives do not. Since " +
                "int is a primitive, you cannot call instance methods on it. Integer " +
                "and String are both objects and have instance methods. " +
                "Therefore, Option C is correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("267");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following does not compile?");
        temp.setOPT_ONE("int num = 999;");
        temp.setOPT_TWO("int num = 9_9_9;");
        temp.setOPT_THREE("int num = _9_99;");
        temp.setOPT_FOUR("None of the above; they all compile.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("268");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the result of running this code?\n" +
                "public class Values {\n" +
                "\tinteger a = Integer.valueOf(\"1\");\n" +
                "\tpublic static void main(String[ ] nums) {\n" +
                "\t\tinteger a = Integer.valueOf(\"2\");\n" +
                "\t\tinteger b = Integer.valueOf(\"3\");\n" +
                "\t\tSystem.out.println(a + b);\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("4");
        temp.setOPT_TWO("5");
        temp.setOPT_THREE("The code does not compile.");
        temp.setOPT_FOUR("The code compiles but throws an exception at runtime.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Underscores are allowed between any two digits in a numeric " +
                "literal. Underscores are not allowed at the beginning or end of the " +
                "literal, making Option C the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("269");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which best describes what the new keyword does?");
        temp.setOPT_ONE("Creates a copy of an existing object and treats it as a new one");
        temp.setOPT_TWO("Creates a new primitive");
        temp.setOPT_THREE("Instantiates a new object");
        temp.setOPT_FOUR("Switches an object reference to a new one");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("The new keyword is used to call the constructor for a class and " +
                "instantiate an instance of the class. A primitive cannot be created " +
                "using the new keyword. Dealing with references happens after the " +
                "object created by new is returned.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("270");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which is the first line to trigger a compiler error?\n" +
                "double d1 = 5f; // p1\n" +
                "double d2 = 5.0; // p2\n" +
                "float f1 = 5f; // p3\n" +
                "float f2 = 5.0; // p4");
        temp.setOPT_ONE("p1");
        temp.setOPT_TWO("p2");
        temp.setOPT_THREE("p3");
        temp.setOPT_FOUR("p4");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("2");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("Java uses the suffix f to indicate a number is a float. Java " +
                "automatically widens a type, allowing a float to be assigned to " +
                "either a float or a double. This makes both lines p1 and p3 " +
                "compile. Line p2 does compile without a suffix. Line p4 does not " +
                "compile without a suffix and therefore is the answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("271");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following is not a valid order for elements in a class?");
        temp.setOPT_ONE("Constructor, instance variables, method names");
        temp.setOPT_TWO("Instance variables, constructor, method names");
        temp.setOPT_THREE("Method names, instance variables, constructor");
        temp.setOPT_FOUR("None of the above: all orders are valid.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("The instance variables, constructor, and method names can " +
                "appear in any order within a class declaration.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("271");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("How many instance initializers are in this code?\n" +
                "1: public class Bowling {\n" +
                "2: \t{ System.out.println(); }\n" +
                "3: \tpublic Bowling () {\n" +
                "4: \t\tSystem.out.println();\n" +
                "5: \t}\n" +
                "6: \tstatic { System.out.println(); }\n" +
                "7: \t{ System.out.println(); }\n" +
                "8: }");
        temp.setOPT_ONE("None");
        temp.setOPT_TWO("One");
        temp.setOPT_THREE("Two");
        temp.setOPT_FOUR("Three");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Lines 2 and 7 illustrate instance initializers. Line 6 is a static\n" +
                "initializer. Lines 3–5 are a constructor.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("272");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is true of the finalize() method?");
        temp.setOPT_ONE("It may be called zero or one times.");
        temp.setOPT_TWO("It may be called zero or more times.");
        temp.setOPT_THREE("It will be called exactly once.");
        temp.setOPT_FOUR("It may be called one or more times.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("The finalize() method may not be called, such as if your " +
                "program crashes. However, it is guaranteed to be called no more " +
                "than once.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("273");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following is not a wrapper class ?");
        temp.setOPT_ONE("Double");
        temp.setOPT_TWO("Integer");
        temp.setOPT_THREE("Long");
        temp.setOPT_FOUR("String");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("String is a class, but it is not a wrapper class. In order to be a " +
                "wrapper class, the class must have a one-to-one mapping with a " +
                "primitive.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("274");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Suppose foo is a reference to an instance of a class. Which of the " +
                "following is not true about foo.bar?");
        temp.setOPT_ONE("bar is an instance variable.");
        temp.setOPT_TWO("bar is a local variable.");
        temp.setOPT_THREE("It can be used to read from bar.");
        temp.setOPT_FOUR("It can be used to write to bar.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("Dot notation is used for both reading and writing instance " +
                "variables, assuming they are in scope. It cannot be used for " +
                "referencing local variables, making Option B the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("23");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following is not a valid class declaration?");
        temp.setOPT_ONE("class building {}");
        temp.setOPT_TWO("class Cost$ {}");
        temp.setOPT_THREE("class 5MainSt {}");
        temp.setOPT_FOUR("class _Outside {}");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Class names follow the same requirements as other identifiers. " +
                "Underscores and dollar signs are allowed. Numbers are allowed, " +
                "but not as the first character of an identifier. Therefore, Option C " +
                "is correct. Note that class names begin with an uppercase letter by " +
                "convention, but this is not a requirement.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("27");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following is true about primitives?");
        temp.setOPT_ONE("You can call methods on a primitive.");
        temp.setOPT_TWO("You can convert a primitive to a wrapper class object simply by " +
                "assigning it.");
        temp.setOPT_THREE("You can convert a wrapper class object to a primitive by calling " +
                "valueOf().");
        temp.setOPT_FOUR("You can store a primitive directly into an ArrayList.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("Option B is an example of autoboxing. Java will automatically " +
                "convert from primitive to wrapper class types and vice versa. " +
                "Option A is incorrect because you can only call methods on an " +
                "object. Option C is incorrect because this method is used for " +
                "converting to a wrapper class from a String. Option D is incorrect " +
                "because autoboxing will convert the primitive to an object before " +
                "adding it to the ArrayList.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("31");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which two primitives have wrapper classes that are not merely " +
                "the name of the primitive with an uppercase letter?");
        temp.setOPT_ONE("byte and char");
        temp.setOPT_TWO("byte and int");
        temp.setOPT_THREE("char and int");
        temp.setOPT_FOUR("None of the above");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("The wrapper class for int is Integer and the wrapper class for " +
                "char is Character. All other primitives have the same name. For " +
                "example, the wrapper class for boolean is Boolean.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("33");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which statement is true about primitives?");
        temp.setOPT_ONE("Primitive types begin with a lowercase letter.");
        temp.setOPT_TWO("Primitive types can be set to null.");
        temp.setOPT_THREE("String is a primitive.");
        temp.setOPT_FOUR("You can create your own primitive types.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("An example of a primitive type is int. All the primitive types are " +
                "lowercase, making Option A correct. Unlike object reference " +
                "variables, primitives cannot reference null. String is not a " +
                "primitive as evidenced by the uppercase letter in the name and the " +
                "fact that we can call methods on it. You can create your own " +
                "classes, but not primitives.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("34");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("How do you force garbage collection to occur at a certain point?");
        temp.setOPT_ONE("Call System.forceGc()");
        temp.setOPT_TWO("Call System.gc()");
        temp.setOPT_THREE("Call System.requireGc()");
        temp.setOPT_FOUR("None of the above");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("While you can suggest to the JVM that it might want to run a " +
                "garbage collection cycle, the JVM is free to ignore your suggestion. " +
                "Option B is how to make this suggestion. Since garbage collection " +
                "is not guaranteed to run, Option D is correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("37");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What does the following output?\n" +
                "1: public class InitOrder {\n" +
                "2: \tpublic String first = \"instance\";\n" +
                "3: \tpublic InitOrder() {\n" +
                "4: \t\tfirst = \"constructor\";\n" +
                "5: \t}\n" +
                "6: \t{ first = \"block\"; }\n" +
                "7: \tpublic void print() {\n" +
                "8: \t\tSystem.out.println(first);\n" +
                "9: \t}\n" +
                "10: \tpublic static void main(String... args) {\n" +
                "11: \t\tnew InitOrder().print();\n" +
                "12: \t}\n" +
                "13: }");
        temp.setOPT_ONE("block");
        temp.setOPT_TWO("constructor");
        temp.setOPT_THREE("instance");
        temp.setOPT_FOUR("The code does not compile.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("First line 2 runs and sets the variable using the declaration. " +
                "Then the instance initializer on line 6 runs. Finally, the " +
                "constructor runs. Since the constructor is the last to run of the " +
                "three, that is the value that is set when we print the result, so " +
                "Option B is correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("48");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following is not a possible output of this code, " +
                "assuming it runs to completion?\n" +
                "package store;\n" +
                "public class Toy {\n" +
                "\tpublic void play() {\n" +
                "\t\tSystem.out.print(\"play-\");\n" +
                "\t}\n" +
                "\tpublic void finalize() {\n" +
                "\tSystem.out.print(\"clean-\");\n" +
                "\t}\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tToy car = new Toy();\n" +
                "\t\tcar.play();\n" +
                "\t\tSystem.gc();\n" +
                "\t\tToy doll = new Toy();\n" +
                "\t\tdoll.play();\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("play-");
        temp.setOPT_TWO("play-play-");
        temp.setOPT_THREE("play-play-clean-");
        temp.setOPT_FOUR("play-play-clean-clean-");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("2");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("Remember that garbage collection is not guaranteed to run on " +
                "demand. If it doesn’t run at all, Option B would be output. If it " +
                "runs at the requested point, Option C would be output. If it runs " +
                "right at the end of the main() method, Option D would be output. " +
                "Option A is the correct answer because play is definitely called " +
                "twice.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("49");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which converts a primitive to a wrapper class object without using " +
                "autoboxing?");
        temp.setOPT_ONE("Call the asObject() method");
        temp.setOPT_TWO("Call the constructor of the wrapper class");
        temp.setOPT_THREE("Call the convertToObject() method");
        temp.setOPT_FOUR("Call the toObject() method");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("2");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("Each wrapper class has a constructor that takes the primitive " +
                "equivalent. The methods mentioned in Options A, C, and D do not " +
                "exist.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("50");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following?\n" +
                "package beach;\n" +
                "public class Sand {\n" +
                "\tpublic Sand() {\n" +
                "\t\tSystem.out.print(\"a\");\n" +
                "\t}\n" +
                "\tpublic void Sand() {\n" +
                "\t\tSystem.out.print(\"b\");\n" +
                "\t}\n" +
                "\tpublic void run() {\n" +
                "\t\tnew Sand();\n" +
                "\t\tSand();\n" +
                "\t}\n" +
                "\tpublic static void main(String... args) {\n" +
                "\t\tnew Sand().run();\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("a");
        temp.setOPT_TWO("ab");
        temp.setOPT_THREE("aab");
        temp.setOPT_FOUR("None of the above");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("2");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("The main() method calls the constructor which outputs a. Then " +
                "the main method calls the run() method. The run() method calls " +
                "the constructor again, which outputs a again. Then the run() " +
                "method calls the Sand() method, which happens to have the same " +
                "name as the constructor. This outputs b. Therefore, Option C is " +
                "correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("1");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following variable types is not permitted in a switch " +
                "statement?");
        temp.setOPT_ONE("String");
        temp.setOPT_TWO("double");
        temp.setOPT_THREE("int");
        temp.setOPT_FOUR("char");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("3");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("A switch statement supports the primitive types byte, short, " +
                "char, and int and the classes String, Character, Byte, Short, and " +
                "Integer. It also supports enumerated types. Floating-point types " +
                "like float and double are not supported, therefore Option B is the " +
                "correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("2");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the value of tip after executing the following code " +
                "snippet?\n" +
                "int meal = 5;\n" +
                "int tip = 2;\n" +
                "int total = meal + (meal>6 ? ++tip : ‐‐tip);");
        temp.setOPT_ONE("1");
        temp.setOPT_TWO("2");
        temp.setOPT_THREE("3");
        temp.setOPT_FOUR("6");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("3");
        temp.setDIFFICULTY("2");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("Remember that in ternary expressions, only one of the two " +
                "right-most expressions are evaluated. Since meal>6 is false, ––tip " +
                "is evaluated and ++tip is skipped. The result is that tip is changed " +
                "from 2 to 1, making Option A the correct answer. The value of " +
                "total is 6, since the pre-increment operator was used on tip, " +
                "although you did not need to know this to solve the question.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("3");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following application?\n" +
                "package registration;\n" +
                "public class NameCheck {\n" +
                "\tpublic static void main(String... data) {\n" +
                "\t\tString john = \"john\";\n" +
                "\t\tString jon = new String(john);\n" +
                "\t\tSystem.out.print((john==jon)+\" \"+(john.equals(jon)));\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("true true");
        temp.setOPT_TWO("true false");
        temp.setOPT_THREE("false true");
        temp.setOPT_FOUR("false false");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("3");
        temp.setDIFFICULTY("2");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("The first assignment creates a new String \"john\" object. The " +
                "second line explicitly uses the new keyword, meaning a new String " +
                "object is created. Since these objects are not the same, the == test " +
                "on them evaluates to false. The equals() test on them returns " +
                "true because the values they refer to are equivalent. Therefore, " +
                "the correct answer is C.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("6");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the value of thatNumber after the execution of the " +
                "following code snippet?\n" +
                "long thatNumber = 5 >= 5 ? 1+2 : 1*1;\n" +
                "if(++thatNumber < 4)\n" +
                "thatNumber += 1;");
        temp.setOPT_ONE("3");
        temp.setOPT_TWO("4");
        temp.setOPT_THREE("5");
        temp.setOPT_FOUR("The answer cannot be determined until runtime.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("3");
        temp.setDIFFICULTY("2");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("The initial assignment of thatNumber follows the first branch of " +
                "the ternary expression. Since 5 >= 5 evaluates to true, a value of 3 " +
                "is assigned to thatNumber. In the next line, the pre-increment " +
                "operator increments the value of thatNumber to 4 and returns a " +
                "value of 4 to the expression. Since 4 < 4 evaluates to false, the ifthen " +
                "block is skipped. This leaves the value of thatNumber as 4, " +
                "making Option B the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("8");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which statement immediately exits a switch statement, skipping " +
                "all remaining case or default branches?");
        temp.setOPT_ONE("exit");
        temp.setOPT_TWO("break");
        temp.setOPT_THREE("goto");
        temp.setOPT_FOUR("continue");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("3");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Option A is incorrect as only one of the two right-hand " +
                "expressions is evaluated at runtime. Parentheses are often helpful " +
                "for reading ternary expressions but are not required, making " +
                "Option B incorrect. Option C is a correct statement about ternary " +
                "operators as they are commonly used to replace short if-then-else " +
                "statements. Finally, Option D is incorrect as only boolean " +
                "expressions are permitted in the left-most operand of a ternary " +
                "expression.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("10");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following application?\n" +
                "package dinosaur;\n" +
                "public class Park {\n" +
                "\tpublic final static void main(String... arguments) {\n" +
                "\t\tint pterodactyl = 6;\n" +
                "\t\tlong triceratops = 3;\n" +
                "\t\tif(pterodactyl % 3 >= 1)\n" +
                "\t\t\ttriceratops++;\n" +
                "\t\ttriceratops--;\n" +
                "\t\tSystem.out.print(triceratops);\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("2");
        temp.setOPT_TWO("3");
        temp.setOPT_THREE("4");
        temp.setOPT_FOUR("The code does not compile.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("The first step is to determine whether or not the if-then " +
                "statement’s expression is executed. The expression 6 % 3 " +
                "evaluates to 0, since there is no remainder, and since 0 >= 1 is " +
                "false, the expression triceratops++ is not called. Notice there are " +
                "no brackets {} in the if-then statement. Despite the triceratops–– " +
                "line being indented, it is not part of the if-then statement. Recall " +
                "that Java does not use indentation to determine the beginning or " +
                "end of a statement. Therefore, triceratops–– is always executed," +
                "resulting in a value of 2 for triceratops and making Option A the " +
                "correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("13");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which statement about case statements of a switch statement is " +
                "not true?");
        temp.setOPT_ONE("A case value can be final.");
        temp.setOPT_TWO("A case statement must be terminated with a break statement.");
        temp.setOPT_THREE("A case value can be a literal expression.");
        temp.setOPT_FOUR("A case value must match the data type of the switch variable, " +
                "or be able to be promoted to that type.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("A case value must be a constant expression, such as a literal or " +
                "final variable, so Options A and C are true statements about case " +
                "values. A case statement may be terminated by a break statement, " +
                "but it is not required, making Option B the false statement and " +
                "correct answer. Option D is also a true statement about case " +
                "values.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("17");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following application?\n" +
                "package jungle;\n" +
                "public class TheBigRace {\n" +
                "\tpublic static void main(String[ ] in) {\n" +
                "\t\tint tiger = 2;\n" +
                "\t\tshort lion = 3;\n" +
                "\t\tlong winner = lion+2*(tiger + lion);\n" +
                "\t\tSystem.out.print(winner);\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("11");
        temp.setOPT_TWO("13");
        temp.setOPT_THREE("25");
        temp.setOPT_FOUR("None of the above");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("3");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("For this problem, it helps to recognize that parentheses take " +
                "precedence over the operations outside the parentheses. Once we " +
                "replace the variables with values, the expression becomes: 3+2* " +
                "(2+3). We then calculate the value inside the parentheses to get " +
                "3+2*5. Since the multiplication operator has higher precedence " +
                "than addition, we evaluate it first, resulting in 3+10 = 13, making " +
                "Option B the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("19");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the following code snippet, what is the value of dinner after " +
                "it is executed?\n" +
                "int time = 11;\n" +
                "int day = 4;\n" +
                "String dinner = time > 10 ? day ? \"Takeout\" : \"Salad\" : " +
                "\"Leftovers\";");
        temp.setOPT_ONE("Takeout");
        temp.setOPT_TWO("Salad");
        temp.setOPT_THREE("The code does not compile but would compile if parentheses " +
                "were added.");
        temp.setOPT_FOUR("None of the above");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("3");
        temp.setDIFFICULTY("2");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("While parentheses are recommended for ternary operations, " +
                "especially embedded ones, they are not required, so Option C is " +
                "incorrect. The code does not compile because day is an int, not a " +
                "boolean expression, in the second ternary operation, making " +
                "Option D the correct answer. Remember that in Java, numeric " +
                "values are not accepted in place of boolean expressions in if-then " +
                "statements or ternary operations.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("21");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following application?\n" +
                "package schedule;\n" +
                "public class PrintWeek {\n" +
                "\tpublic static final void main(String[ ] days) {\n" +
                "\t\tSystem.out.print(5 + 6 + \"7\" + 8 + 9);\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("56789");
        temp.setOPT_TWO("11789");
        temp.setOPT_THREE("11717");
        temp.setOPT_FOUR("The code does not compile.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("3");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("Remember that Java evaluates + from left to right. The first two " +
                "values are both numbers, so the + is evaluated as numeric " +
                "addition, resulting in a reduction to 11 + \"7\" + 8 + 9. The next " +
                "two terms, 11 + \"7\", are handled as string concatenation since " +
                "one of the terms is a String. This allows us to reduce the " +
                "expression to \"117\" + 8 + 9. Likewise, the final two terms are " +
                "each evaluated one at a time with the String on the left. " +
                "Therefore, the final value is 11789, making Option B the correct " +
                "answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("27");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("For a given non-null String myTestVariable, what is the resulting " +
                "value of executing the statement myTestVariable.equals(null)?");
        temp.setOPT_ONE("true");
        temp.setOPT_TWO("false");
        temp.setOPT_THREE("The statement does not compile.");
        temp.setOPT_FOUR("The statement compiles but will produce an exception when " +
                "used at runtime.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("2");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("The statement compiles and runs without issue, making " +
                "Options C and D incorrect. Since we are given that myTestVariable " +
                "is not null, the statement will always evaluate to false, making " +
                "Option B the correct answer. Note that if myTestVariable was " +
                "null, then the code would still compile but throw a " +
                "NullPointerException calling equals() at runtime.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("29");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which statement about the logical operators & and && is true?");
        temp.setOPT_ONE("The & and && operators are interchangeable, always producing " +
                "the same results at runtime.");
        temp.setOPT_TWO("The & operator always evaluates both operands, while the && " +
                "operator may only evaluate the left operand.");
        temp.setOPT_THREE("Both expressions evaluate to true if either operand is true.");
        temp.setOPT_FOUR("The & operator always evaluates both operands, while the && " +
                "operator may only evaluate the right operand.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("3");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("The & and && (AND) operators are not interchangeable, as the\n" +
                "conjunctive & operator always evaluates both sides of the\n" +
                "expression, while the conditional conjunctive && operator only\n" +
                "evaluates the right-hand side of the expression if the left side is\n" +
                "determined to be true. This is why conditional operators are often\n" +
                "referred to as short-circuit operators, skipping the right-hand side\n" +
                "expression at runtime. For these reasons, Option B is the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("30");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following code snippet?\n" +
                "int x = 10, y = 5;\n" +
                "boolean w = true, z = false;\n" +
                "x = w ? y++ : y--;\n" +
                "w = !z;\n" +
                "System.out.print((x+y)+\" \"+(w ? 5 : 10));");
        temp.setOPT_ONE("The code does not compile.");
        temp.setOPT_TWO("10 10");
        temp.setOPT_THREE("11 5");
        temp.setOPT_FOUR("12 5");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("3");
        temp.setDIFFICULTY("2");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("The code compiles, so Option A is incorrect. Since w starts out " +
                "true, the third line takes the first right-hand side of the ternary " +
                "expression returning and assigning 5 to x (post-increment " +
                "operator) while incrementing y to 6. Note that the second righthand " +
                "side of the ternary expression y–– is not evaluated since " +
                "ternary operators only evaluate one right-hand expression at " +
                "runtime. On the fourth line, the value of w is set to !z. Since z is " +
                "false, the value of w remains true. The final line outputs the value " +
                "of (5+6) and (true ? 5 : 10), which is 11 5, making Option C the " +
                "correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("32");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the value of 12 + 6 * 3 % (1 + 1) in Java?");
        temp.setOPT_ONE("0");
        temp.setOPT_TWO("12");
        temp.setOPT_THREE("14");
        temp.setOPT_FOUR("None of the above");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("3");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("The question is about operator precedence and order of " +
                "operation. The multiplication * and modulus % operators have the " +
                "highest precedence, although what is inside the parentheses needs " +
                "to be evaluated first. We can reduce the expression to the " +
                "following: 12 + 6 * 3 % 2. Since multiplication * and modulus % " +
                "have the same operator precedence, we evaluate them from left to " +
                "right as follows: 12 + 6 * 3 % 2 → 12 + 18 % 2 → 12 + 0 → 12. " +
                "We see that despite all of the operators on the right-hand side of " +
                "the expression, the result is zero, leaving us a value of 12, making " +
                "Option B the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("42");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following application?\n" +
                "public class CountEntries {\n" +
                "\tpublic static int getResult(int threshold) {\n" +
                "\t\treturn threshold > 5 ? 1 : 0;\n" +
                "\t}\n" +
                "\tpublic static final void main(String[ ] days) {\n" +
                "\t\tSystem.out.print(getResult(5)+getResult(1)" +
                "+getResult(0)+getResult(2)+\"\");\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("0");
        temp.setOPT_TWO("1");
        temp.setOPT_THREE("0000");
        temp.setOPT_FOUR("1000");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("3");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("The code compiles without issue, so Option D is incorrect. The " +
                "key here is that the if-then statement in the runTest() method " +
                "uses the assignment operator (=) instead of the (==) operator. The " +
                "result is that spinner is assigned a value of true, and the " +
                "statement (spinner = roller) returns the newly assigned value. " +
                "The method then returns up, making Option A the correct answer. " +
                "If the (==) operator had been used in the if-then statement, then " +
                "the process would have branched to the else statement, with down " +
                "being returned by the method.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("46");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following is not a possible result of executing the " +
                "following application?\n" +
                "public class OutsideLogic {\n" +
                "\tpublic static void main(String... weather) {\n" +
                "\t\tSystem.out.print(weather[0]!=null " +
                "&& weather[0].equals(\"sunny\") " +
                "&& !false " +
                "? \"Go Outside\" : \"Stay Inside\"); " +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("Nothing is printed");
        temp.setOPT_TWO("The application throws an exception at runtime");
        temp.setOPT_THREE("Go Outside is printed");
        temp.setOPT_FOUR("Stay Inside is printed");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("3");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("The application uses the conditional conjunction && operator to " +
                "test if weather[0] is null, but unfortunately this test does not " +
                "work on zero-length arrays. Therefore, it is possible this code will " +
                "throw an ArrayIndexOutOfBoundsException at runtime. The " +
                "second part of the expression evaluates to true if the first input of " +
                "weather matches sunny. The final part of the expression, && " +
                "!false, is a tautology in that it is always true and has no impact " +
                "on the expression. Either an exception will be thrown or text will " +
                "be output, based on the value of weather, therefore Option A is the " +
                "correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("47");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the value of (5 + (!2 + 8) * 3 - 3 % 2)/2 in Java?");
        temp.setOPT_ONE("2");
        temp.setOPT_TWO("11");
        temp.setOPT_THREE("16");
        temp.setOPT_FOUR("None of the above");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("3");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("The question looks a lot more difficult than it is. In fact, to " +
                "solve it you don’t have to compute anything! You just have to " +
                "notice that the logical complement operator (!), which can only be " +
                "applied to boolean values, is being applied to a numeric value. " +
                "Therefore, the answer is that the expression wouldn’t compile or " +
                "run, making Option D the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("3");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following are primitives?\n" +
                "int[ ] lowercase = new int[0];\n" +
                "Integer[ ] uppercase = new Integer[0];");
        temp.setOPT_ONE("Only lowercase");
        temp.setOPT_TWO("Only uppercase");
        temp.setOPT_THREE("Bother lowercase and uppercase");
        temp.setOPT_FOUR("Neither lowercase nor uppercase");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("6");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("How do you determine the number of elements in an array?");
        temp.setOPT_ONE("buses.length");
        temp.setOPT_TWO("buses.length()");
        temp.setOPT_THREE("buses.size");
        temp.setOPT_FOUR("buses.size()");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("Trick question! While int is a primitive, all arrays are objects. " +
                "One way to tell is that an array has a public instance variable " +
                "called length. Another way is that you can assign it a variable of " +
                "type Object. Therefore, Option D is correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("8");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("How many lines does the following code output?\n" +
                "String[ ] days = new String[ ] { \"Sunday\", \"Monday\"," +
                "\"Tuesday\", " +
                "\"Wednesday\", \"Thursday\", \"Friday\", \"Saturday\" };\n" +
                "for (int i = 0; i < days.length; i++)\n" +
                "System.out.println(days[i]);");
        temp.setOPT_ONE("Six");
        temp.setOPT_TWO("Seven");
        temp.setOPT_THREE("The code does not compile.");
        temp.setOPT_FOUR("The code compiles but throws an exception at runtime");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("There is nothing wrong with this code. It correctly creates a\n" +
                "seven-element array. The loop starts with index 0 and ends with\n" +
                "index 6. Each line is correctly output. Therefore, Option B is correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("10");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What does this code output?\n" +
                "String[ ] nums = new String[ ] { \"1\", \"9\", \"10\" };\n" +
                "Arrays.sort(nums);\n" +
                "System.out.println(Arrays.toString(nums));");
        temp.setOPT_ONE("[1, 9, 10]");
        temp.setOPT_TWO("[1, 10, 9]");
        temp.setOPT_THREE("[10, 1, 9]");
        temp.setOPT_FOUR("None of the above");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("The elements of the array are of type String rather than int. " +
                "Therefore, we use alphabetical order when sorting. The character 1 " +
                "sorts before the character 9, alphabetically making Option A " +
                "incorrect. Shorter strings sort before longer strings when all the " +
                "other characters are the same, making Option B the answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("13");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("How many of the following are legal declarations?\n" +
                "float[ ] lion = new float[ ];\n" +
                "float[ ] tiger = new float[1];\n" +
                "float[ ] bear = new[ ] float;\n" +
                "float[ ] ohMy = new[1] float;");
        temp.setOPT_ONE("None");
        temp.setOPT_TWO("One");
        temp.setOPT_THREE("Two");
        temp.setOPT_FOUR("Three");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("Since no elements are being provided when creating the arrays, " +
                "a size is required. Therefore, lion and bear are incorrect. The " +
                "braces containing the size are required to be after the type, making " +
                "ohMy incorrect. The only one that is correct is tiger, making the " +
                "correct answer Option B.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("14");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which statement most accurately represents the relationship " +
                "between searching and sorting with respect to the Arrays class?");
        temp.setOPT_ONE("If the array is not sorted, calling Arrays.binarySearch() will be " +
                "accurate, but slower than if it were sorted.");
        temp.setOPT_TWO("The array does not need to be sorted before calling " +
                "Arrays.binarySearch() to get an accurate result.");
        temp.setOPT_THREE("The array must be sorted before calling Arrays.binarySearch() " +
                "to get an accurate result.");
        temp.setOPT_FOUR("None of the above");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("The binarySearch() method requires a sorted array in order to " +
                "return a correct result. If the array is not sorted, the results of a " +
                "binary search are undefined.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("17");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What does the following output?\n" +
                "String[ ] os = new String[ ] { \"Mac\", \"Linux\", \"Windows\" };\n" +
                "Arrays.sort(os);\n" +
                "System.out.println(Arrays.binarySearch(os, \"Mac\"));");
        temp.setOPT_ONE("0");
        temp.setOPT_TWO("1");
        temp.setOPT_THREE("2");
        temp.setOPT_FOUR("The output is not defined.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("The code sorts before calling binarySearch(), so it meets the " +
                "precondition for that method. The target string of \"Mac\" is the " +
                "second element in the sorted array. Since array indices begin with " +
                "zero, the second position is index 1, and Option B is correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("19");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("How many objects are created when running the following code?\n" +
                "Integer[ ] lotto = new Integer[4];\n" +
                "lotto[0] = new Integer(1_000_000);\n" +
                "lotto[1] = new Integer(999_999);");
        temp.setOPT_ONE("Two");
        temp.setOPT_TWO("Three");
        temp.setOPT_THREE("Four");
        temp.setOPT_FOUR("Five");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("The first line creates one object; the array itself. While there are " +
                "four references to null in that array, none of those are objects. " +
                "The second line creates one object and points one of the array " +
                "references to it. So far there are two objects: the array itself and " +
                "one object it is referencing. The third line does the same, bringing " +
                "up the object count to three. Therefore, Option B is correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("20");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("How many of the following are legal declarations?\n" +
                "[ ][ ] String alpha;\n" +
                "[ ] String beta;\n" +
                "String[ ][ ] gamma;\n" +
                "String[ ] delta[ ];\n" +
                "String epsilon[ ][ ];");
        temp.setOPT_ONE("Two");
        temp.setOPT_TWO("Three");
        temp.setOPT_THREE("Four");
        temp.setOPT_FOUR("Five");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("As with a one-dimensional array, the braces must be after the " +
                "type, making alpha and beta illegal declarations. For a multidimensional " +
                "array, the braces are allowed to be before and/or after " +
                "the variable name. They do not need to be in the same place. " +
                "Therefore, the remaining three are correct, and Option B is " +
                "correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("22");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What happens when calling the following method with a non-null " +
                "and non-empty array?\n" +
                "public static void addStationName(String[ ] names) {\n" +
                "\tnames[names.length] = \"Times Square\";\n" +
                "}");
        temp.setOPT_ONE("It adds an element to the array the value of which is Times " +
                "Square.");
        temp.setOPT_TWO("It replaces the last element in the array with the value Times " +
                "Square.");
        temp.setOPT_THREE("It does not compile");
        temp.setOPT_FOUR("It throws an exception");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("names.length is the number of elements in the array. The last " +
                "valid index in the array is one less than names.length. In Java, " +
                "arrays do not resize automatically. Therefore, the code throws an " +
                "ArrayIndexOutOfBoundsException.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("25");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is a possible output of the following code?\n" +
                "String[ ] strings = new String[2];\n" +
                "System.out.println(strings);");
        temp.setOPT_ONE("[null, null]");
        temp.setOPT_TWO("[,]");
        temp.setOPT_THREE("[Ljava.lang.String;@74a14482");
        temp.setOPT_FOUR("None of the above");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Calling toString() on an array doesn’t output the contents of " +
                "the array, making Option C correct. If you wanted Option A to be " +
                "the answer, you’d have to call Arrays.toString(strings).");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("28");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the result of running the following program?\n" +
                "1: package fun;\n" +
                "2: public class Sudoku {\n" +
                "3: \tstatic int[ ][ ] game = new int[6][6];\n" +
                "4:\n" +
                "5: \tpublic static void main(String[ ] args) {\n" +
                "6: \t\tgame[3][3] = 6;\n" +
                "7: \t\tObject[ ] obj = game;\n" +
                "8: \t\tobj[3] = \"X\";\n" +
                "9: \t\tSystem.out.println(game[3][3]);\n" +
                "10: \t}\n" +
                "11: }");
        temp.setOPT_ONE("x");
        temp.setOPT_TWO("The code does not compile.");
        temp.setOPT_THREE("The code compiles but throws a NullPointerException at " +
                "runtime.");
        temp.setOPT_FOUR("The code compiles but throws a different exception at runtime.");
        temp.setOPT_FIVE("D");
        temp.setOPT_SIX("Line 6 assigns an int to a cell in a 2D array. This is fine. Line 7 " +
                "casts to a general Object[ ]. This is dangerous, but legal. Why is it " +
                "dangerous, you ask? That brings us to line 8. The compiler can’t " +
                "protect us from assigning a String to the int[ ] because the " +
                "reference is more generic. Therefore, line 8 throws an " +
                "ArrayStoreException because the type is incorrect, and Option D " +
                "is correct. You couldn’t have assigned an int on line 8 either " +
                "because obj[3] is really an int[ ] behind the scenes and not an " +
                "int.");
        temp.setNo_Opt("4");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("32");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following when run as java " +
                "unix.EchoFirst seed flower?\n" +
                "package unix;\n" +
                "import java.util.*;\n" +
                "public class EchoFirst {\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tString one = args[0];\n" +
                "\t\tArrays.sort(args);\n" +
                "\t\tint result = Arrays.binarySearch(args, one);\n" +
                "\t\tSystem.out.println(result);\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("0");
        temp.setOPT_TWO("1");
        temp.setOPT_THREE("The code does not compile.");
        temp.setOPT_FOUR("The code compiles but throws an exception at runtime.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("This class is called with two arguments. The first one (seed) is " +
                "stored in the variable one. Then the array is sorted, meeting the " +
                "precondition for binary search. Binary search returns 1 because " +
                "seed is the second element in the sorted array, and Java uses zerobased " +
                "indexes. Option B is correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("42");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the result of running the following program?\n" +
                "1: package fun;\n" +
                "2: public class Sudoku {\n" +
                "3: static int[ ][ ] game;\n" +
                "4:\n" +
                "5: public static void main(String[ ] args) {\n" +
                "6: game[3][3] = 6;\n" +
                "7: Object[ ] obj = game;\n" +
                "8: game[3][3] = \"X\";\n" +
                "9: System.out.println(game[3][3]);\n" +
                "10: }\n" +
                "11: }");
        temp.setOPT_ONE("x");
        temp.setOPT_TWO("The code does not compile.");
        temp.setOPT_THREE("The code compiles but throws a NullPointerException at " +
                "runtime.");
        temp.setOPT_FOUR("The code compiles but throws a different exception at runtime.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("Line 8 attempts to store a String in an array meant for an int. " +
                "Line 8 does not compile, and Option B is correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("47");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What does the following output?\n" +
                "String[ ] os = new String[ ] { \"Linux\", \"Mac\", \"Windows\" };\n" +
                "System.out.println(Arrays.binarySearch(os, \"Linux\"));");
        temp.setOPT_ONE("0");
        temp.setOPT_TWO("1");
        temp.setOPT_THREE("2");
        temp.setOPT_FOUR("The output is not defined");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("Java requires having a sorted array before calling " +
                "binarySearch(). You do not have to call Arrays.sort to perform " +
                "the sort though. This array happens to already be sorted, so it " +
                "meets the precondition. The target string of \"Linux\" is the first " +
                "element in the array. Since Java uses zero-based indexing, the " +
                "answer is Option A.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("50");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following when run as java " +
                "unix.EchoFirst seed flower?\n" +
                "package unix;\n" +
                "import java.util.*;\n" +
                "public class EchoFirst {\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tArrays.sort(args);\n" +
                "\t\tString result = Arrays.binarySearch(args, args[0]);\n" +
                "\t\tSystem.out.println(result);\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("0");
        temp.setOPT_TWO("1");
        temp.setOPT_THREE("The code does not compile.");
        temp.setOPT_FOUR("The code compiles but throws an exception at runtime.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Binary search returns an int representing the index of a match " +
                "or where a match would be. An int cannot be stored in a String " +
                "variable. Therefore, the code does not compile and the answer is " +
                "Option C.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("1");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which type of loop is best known for its boolean condition that " +
                "controls entry to the loop?");
        temp.setOPT_ONE("do-while loop");
        temp.setOPT_TWO("for (traditional)");
        temp.setOPT_THREE("for-each");
        temp.setOPT_FOUR("while");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("4");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("A while loop has a condition that returns a boolean that " +
                "controls the loop. It appears at the beginning and is checked " +
                "before entering the loop. Therefore, Option D is correct. A " +
                "traditional for loop also has a boolean condition that is checked " +
                "before entering the loop. However, it is best known for having a " +
                "counter variable, making Option B incorrect. Option A is incorrect " +
                "because the boolean condition on a do-while loop is at the end of " +
                "the loop. Option C is incorrect because there is no condition as " +
                "part of the loop construct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("4");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following can loop through an array without " +
                "referring to the elements by index?");
        temp.setOPT_ONE("do-while loop");
        temp.setOPT_TWO("for (traditional)");
        temp.setOPT_THREE("for-each");
        temp.setOPT_FOUR("while");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("While a traditional for loop often loops through an array, it " +
                "uses an index to do so, making Option B incorrect. The for-each " +
                "loop goes through each element, storing it in a variable. Option C " +
                "is correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("8");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following statements is/are true?\n" +
                "I. A traditional for loop can iterate through an array starting " +
                "from index 0.\n" +
                "II. A traditional for loop can iterate through an array starting " +
                "from the end.");
        temp.setOPT_ONE("Only I");
        temp.setOPT_TWO("Only II");
        temp.setOPT_THREE("Both statements");
        temp.setOPT_FOUR("Neither statement");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("With a traditional for loop, you control the order in which " +
                "indexes are visited in code. This means you can loop through an " +
                "array in ascending or descending order, and Option C is correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("11");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What does the following code output?\n" +
                "int singer = 0;\n" +
                "while (singer)\n" +
                "System.out.println(singer++);");
        temp.setOPT_ONE("0");
        temp.setOPT_TWO("The code does not compile");
        temp.setOPT_THREE("The loops complete with no output");
        temp.setOPT_FOUR("This is an infinite loop");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("A while loop requires a boolean condition. While singer is a " +
                "variable, it is not a boolean. Therefore, the code does not compile, " +
                "and Option B is correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);









        temp.setID("12");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What does the following code output?\n" +
                "List<String> drinks = Arrays.asList(\"can\", \"cup\");\n" +
                "for (int container = drinks.size() - 1; container >= 0; " +
                "container‐‐)\n" +
                "System.out.print(drinks.get(container) + \",\");");
        temp.setOPT_ONE("can,cup,");
        temp.setOPT_TWO("cup,can,");
        temp.setOPT_THREE("The code does not compile.");
        temp.setOPT_FOUR("None of the above");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("This is a correct loop to go through an ArrayList or List " +
                "starting from the end. It starts with the last index in the list and " +
                "goes to the first index in the list. Option B is correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);








        temp.setID("15");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the result of the following when run with java " +
                "peregrine.TimeLoop September 3 1940?\n" +
                "package peregrine;\n" +
                "public class TimeLoop {\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tfor (int i = args.length; i>=0; i++)\n" +
                "\t\tSystem.out.println(\"args\");\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("args");
        temp.setOPT_TWO("argsargs");
        temp.setOPT_THREE("The code does not compile.");
        temp.setOPT_FOUR("None of the above");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("There are three arguments passed to the program. This means " +
                "that i is 3 on the first iteration of the loop. The program prints " +
                "args. Then i is incremented to 4. Which is also greater than or " +
                "equal to 0. Since i never gets smaller, this code produces an " +
                "infinite loop and the answer is Option D.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);







        temp.setID("16");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following code?\n" +
                "package chicago;\n" +
                "public class Loop {\n" +
                "\tprivate static int count;\n" +
                "\tprivate static String[ ] stops = new String[ ] { " +
                "\"Washington\", " +
                "\"Monroe\", \"Jackson\", \"LaSalle\" };\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\twhile (count < stops.length) {\n" +
                "\t\t\tif (stops[count++].length() < 8) {\n" +
                "\t\t\t\tbreak;\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\t\tSystem.out.println(count);\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("1");
        temp.setOPT_TWO("2");
        temp.setOPT_THREE("4");
        temp.setOPT_FOUR("The code does not compile.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("Since count is a class variable that isn’t specifically initialized, it " +
                "defaults to 0. On the first iteration of the loop, \"Washington\", is 11 " +
                "characters and count is set to 1. The if statement’s body is not " +
                "run. The loop then proceeds to the next iteration. This time, the " +
                "post-increment operator uses index 1 before setting count to 2. " +
                "\"Monroe\" is checked, which is only 6 characters. The break " +
                "statement sends the execution to after the loop and 2 is output. " +
                "Option B is correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("17");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the result of the following code?\n" +
                "do {\n" +
                "\tint count = 0;\n" +
                "\tdo {\n" +
                "\t\tcount++;\n" +
                "\t} while (count < 2);\n" +
                "\tbreak;\n" +
                "} while (true);\n" +
                "System.out.println(count);");
        temp.setOPT_ONE("2");
        temp.setOPT_TWO("3");
        temp.setOPT_THREE("The code does not compile.");
        temp.setOPT_FOUR("This is an infinite loop.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("At first this code appears to be an infinite loop. However, the " +
                "count variable is declared inside the loop. It is not in scope after " +
                "the loop where it is referenced by the println(). Therefore, the " +
                "code does not compile, and Option C is correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("20");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following?\n" +
                "List<String> drinks = Arrays.asList(\"can\", \"cup\");\n" +
                "for (int container = 0; container < drinks.size(); " +
                "container++)\n" +
                "\tSystem.out.print(drinks.get(container) + \",\");");
        temp.setOPT_ONE("can,cup,");
        temp.setOPT_TWO("cup,can,");
        temp.setOPT_THREE("The code does not compile");
        temp.setOPT_FOUR("None of the above");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("This is a correct loop to go through an ArrayList or List " +
                "starting from the beginning. It starts with index 0 and goes to the " +
                "last index in the list. Option A is correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("26");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following types is taxis not allowed to be in order\n" +
                "for this code to compile?\n" +
                "for (Object obj : taxis) {\n" +
                "}");
        temp.setOPT_ONE("ArrayList<Integer>");
        temp.setOPT_TWO("int[ ]");
        temp.setOPT_THREE("StringBuilder");
        temp.setOPT_FOUR("All of these are allowed.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("A for-each loop is allowed to be used with arrays and ArrayList " +
                "objects. StringBuilder is not an allowed type for this loop, so\n" +
                "Option C is the answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("27");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following?\n" +
                "boolean balloonInflated = false;\n" +
                "do {\n" +
                "\tif (!balloonInflated) {\n" +
                "\t\tballoonInflated = true;\n" +
                "\t\tSystem.out.print(\"inflate-\");\n" +
                "\t}\n" +
                "} while (! balloonInflated);\n" +
                "System.out.println(\"done\");");
        temp.setOPT_ONE("done");
        temp.setOPT_TWO("inflate-done");
        temp.setOPT_THREE("The code does not compile");
        temp.setOPT_FOUR("This is an infinite loop");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("This is a correct do-while loop. On the first iteration of the loop, " +
                "the if statement executes and prints inflate-. Then the loop " +
                "condition is checked. The variable balloonInflated is true, so the " +
                "loop condition is false and the loop completes.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("31");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the result of the following?\n" +
                "int k = 0;\n" +
                "for (int i = 10; i > 0; i‐‐) {\n" +
                "\twhile (i > 3) i ‐= 3;\n" +
                "\t\tk += 1;\n" +
                "}System.out.println(k);");
        temp.setOPT_ONE("1");
        temp.setOPT_TWO("2");
        temp.setOPT_THREE("3");
        temp.setOPT_FOUR("4");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("On the first iteration of the outer loop, i starts out at 10. The " +
                "inner loop sees that 10 > 3 and subtracts 3, making the 7 the new " +
                "value of i. Since 7 > 3, we subtract 3 again, making i set to 4. Yet " +
                "again 4 > 3, so i becomes 1. Then k is finally incremented to 1. " +
                "The outer loop decrements i i, making it 0. The boolean condition " +
                "sees that 0 is not greater than 0. The outer loop ends and 1 is " +
                "printed out. Therefore, Option A is correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("35");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the result of the following when run with java\n" +
                "peregrine.TimeLoop September 3 1940?\n" +
                "package peregrine;\n" +
                "public class TimeLoop {\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tfor (int i = args.length; i>=0; i‐‐)\n" +
                "\t\t\tSystem.out.println(args[i]);\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("September");
        temp.setOPT_TWO("1940");
        temp.setOPT_THREE("The code does not compile");
        temp.setOPT_FOUR("None of the above");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("There are three arguments passed to the program. This means " +
                "that i is 3 on the first iteration of the loop. The program attempts " +
                "to print args[3]. Since indexes are zero based in Java, it throws an " +
                "ArrayIndexOutOfBoundsException.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("37");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("The following code outputs a single letter x. What happens if you " +
                "remove lines 25 and 28?\n" +
                "23: String race = \"\";\n" +
                "24: loop:\n" +
                "25: do {\n" +
                "26: \trace += \"x\";\n" +
                "27: \tbreak loop;\n" +
                "28: } while (true);\n" +
                "29: System.out.println(race);");
        temp.setOPT_ONE("It prints an empty string.");
        temp.setOPT_TWO("It still outputs a single letter x.");
        temp.setOPT_THREE("It no longer compiles.");
        temp.setOPT_FOUR("It becomes an infinite loop.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("The code compiles as is. However, we aren’t asked about " +
                "whether the code compiles as is. Line 27 refers to a loop label. " +
                "While the label is still present, it no longer points to a loop. This " +
                "causes the code to not compile, and Option C is correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("43");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("How many lines does the following code output ?\n" +
                "import java.util.*;\n" +
                "public class Exams {\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tList<String> exams = Arrays.asList(\"OCA\", \"OCP\");\n" +
                "\t\tfor (String e1 : exams)\n" +
                "\t\t\tfor (String e2 : exams)\n" +
                "\t\t\t\tSystem.out.println(e1 + \" \" + e2);\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("One");
        temp.setOPT_TWO("Four");
        temp.setOPT_THREE("The code does not compile");
        temp.setOPT_FOUR("The code compiles but throws an exception at runtime.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("Looping through the same list multiple times is allowed. The " +
                "outer loop executes twice. The inner loop executes twice for each " +
                "of those iterations of the outer loop. Therefore, the inner loop " +
                "executes four times, and Option B is correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("45");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following best describes the flow of execution in this " +
                "for loop if the loop body is run exactly once?\n" +
                "for (alpha; beta; gamma) {\n" +
                "\tdelta;\n" +
                "}");
        temp.setOPT_ONE("alpha, delta, gamma, beta");
        temp.setOPT_TWO("alpha, beta, delta, gamma, beta");
        temp.setOPT_THREE("alpha, delta, gamma, alpha, beta");
        temp.setOPT_FOUR("alpha, beta, delta, gamma, alpha, beta");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("The initializer, which is alpha, runs first. Then Java checks the " +
                "condition, which is beta, to see if loop execution should start. " +
                "Then the loop body, which is delta, runs. After the loop execution, " +
                "the updater, which is gamma, runs. Then the loop condition, which " +
                "is beta, is checked again. Therefore, Option B is correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("47");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following?\n" +
                "public class Shoelaces {\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tString tie = null;\n" +
                "\t\twhile (tie == null);\n" +
                "\t\t\ttie = \"shoelace\";\n" +
                "\t\t\tSystem.out.print(tie);\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("null");
        temp.setOPT_TWO("shoelace");
        temp.setOPT_THREE("shoelaceshoelace");
        temp.setOPT_FOUR("None of the above");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("The first time the loop condition is checked, the variable tie is " +
                "null. However, the loop body is empty due to the semicolon right " +
                "after the condition. This means the loop condition keeps running " +
                "with no opportunity for tie to be set. Therefore, this is an infinite " +
                "loop, and Option D is correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("49");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following?\n" +
                "boolean baloonInflated = false;\n" +
                "do {\n" +
                "\tif (!baloonInflated) {\n" +
                "\t\tbaloonInflated = true;\n" +
                "\t\tSystem.out.print(\"inflate-\");\n" +
                "\t}\n" +
                "} while (baloonInflated);\n" +
                "System.out.println(\"done\");");
        temp.setOPT_ONE("done");
        temp.setOPT_TWO("inflate-done");
        temp.setOPT_THREE("The code does not compile.");
        temp.setOPT_FOUR("This is an infinite loop.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("5");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("On the first iteration of the loop, the if statement executes " +
                "printing inflate-. Then the loop condition is checked. The " +
                "variable baloonInflated is true, so the loop condition is true and " +
                "the loop continues. The if statement no longer runs, but the " +
                "variable never changes state again, so the loop doesn’t end.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("2");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the command to call one constructor from another " +
                "constructor in the same class?");
        temp.setOPT_ONE("super()");
        temp.setOPT_TWO("this()");
        temp.setOPT_THREE("that()");
        temp.setOPT_FOUR("construct()");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("3");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following application?\n" +
                "package stocks;\n" +
                "public class Bond {\n" +
                "\tprivate static int price = 5;\n" +
                "\tpublic boolean sell() {\n" +
                "\t\tif(price<10) {\n" +
                "\t\t\tprice++;\n" +
                "\t\t\treturn true;\n" +
                "\t\t} else if(price>=10) {\n" +
                "\t\t\treturn false;\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\tpublic static void main(String[ ] cash) {\n" +
                "\t\tnew Bond().sell();\n" +
                "\t\tnew Bond().sell();\n" +
                "\t\tnew Bond().sell();\n" +
                "\t\tSystem.out.print(price);\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("5");
        temp.setOPT_TWO("6");
        temp.setOPT_THREE("8");
        temp.setOPT_FOUR("The code does not compile");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("The super() statement is used to call a constructor in a parent " +
                "class, while the this() statement is used to call a constructor in " +
                "the same class, making Option B correct and Option A incorrect. " +
                "Options C and D are incorrect because they are not constructors.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("7");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following statements about calling this() in a " +
                "constructor is not true?");
        temp.setOPT_ONE("If this() is used, it must be the first line of the constructor.");
        temp.setOPT_TWO("If super() and this() are both used in the same constructor, " +
                "super() must appear on the line immediately after this().");
        temp.setOPT_THREE("If arguments are provided to this(), then there must be a " +
                "constructor in the class able to take those arguments.");
        temp.setOPT_FOUR("If the no-argument this() is called, then the class must " +
                "explicitly implement the no-argument constructor.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("Options A, C, and D are true statements about calling this() " +
                "inside a constructor. Option B is incorrect because a constructor " +
                "can only call this() or super() on the first line of the constructor, " +
                "but never both in the same constructor. If both constructors were " +
                "allowed to be called, there would be two separate calls to super(), " +
                "leading to duplicate initialization of parent constructors, since the " +
                "other constructor referenced by this() would also call super()");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("10");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which line of code, inserted at line p1, causes the application to " +
                "print 5?\n" +
                "package games;\n" +
                "public class Jump {\n" +
                "\tprivate int rope = 1;\n" +
                "\tprotected boolean outside;\n" +
                "\tpublic Jump() {\n" +
                "\t\t// p1\n" +
                "\t\toutside = true;\n" +
                "\t}\n" +
                "\tpublic Jump(int rope) {\n" +
                "\t\tthis.rope = outside ? rope : rope+1;\n" +
                "\t}\n" +
                "\tpublic static void main(String[ ] bounce) {\n" +
                "\t\tSystem.out.print(new Jump().rope);\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("this(4);");
        temp.setOPT_TWO("new Jump(4);");
        temp.setOPT_THREE("this(5);");
        temp.setOPT_FOUR("rope = 4;");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("First off, all of the lines compile but they produce various " +
                "different results. Remember that the default initialization of a " +
                "boolean instance variable is false, making outside false at line " +
                "p1. Therefore, this(4) will cause rope to be set to 5, while this(5) " +
                "will cause rope to be set to 6. Since 5 is the number we are looking " +
                "for, Option A is correct");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("11");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following statements is not true?");
        temp.setOPT_ONE("An instance of one class may access an instance of another " +
                "class’s attributes if it has a reference to the instance and the " +
                "attributes are declared public.");
        temp.setOPT_TWO("An instance of one class may access package-private attributes " +
                "in a parent class, provided the parent class is not in the same " +
                "package.");
        temp.setOPT_THREE("Two instances of the same class may access each other’s " +
                "private attributes.");
        temp.setOPT_FOUR("An instance of one class may access an instance of another " +
                "class’s attributes if both classes are located in the same " +
                "package and marked protected.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("Options A, C, and D are true statements. In particular, Option C " +
                "allows us to write the equals() methods between two objects that " +
                "compare private attributes of the class. Option D is true because " +
                "protected access also provides package-private access. Option B is " +
                "false. Package-private attributes are only visible if the two classes " +
                "are in the same package, regardless of whether one extends the " +
                "other.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("13");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which statement about a no-argument constructor is true?");
        temp.setOPT_ONE("The Java compiler will always insert a default no-argument " +
                "constructor if you do not define a no-argument constructor in " +
                "your class.");
        temp.setOPT_TWO("In order for a class to call super() in one of its constructors, its " +
                "parent class must explicitly implement a no-argument " +
                "constructor.");
        temp.setOPT_THREE("If a class extends another class that has only one constructor " +
                "that takes a value, then the child class must explicitly declare " +
                "at least one constructor.");
        temp.setOPT_FOUR("A class may contain more than one no-argument constructor.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Option A is incorrect because Java only inserts a no-argument " +
                "constructor if there are no other constructors in the class. Option " +
                "B is incorrect because the parent can have a default no-argument " +
                "constructor, which is inserted by the compiler and accessible in " +
                "the child class. Finally, Option D is incorrect. A class that contains " +
                "two no-argument constructors will not compile because they " +
                "would have the same signature. Finally, Option C is correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("14");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following method signatures does not contain a " +
                "compiler error?");
        temp.setOPT_ONE("public void sing(String key, String... harmonies)");
        temp.setOPT_TWO("public void sing(int note, String... sound, int music)");
        temp.setOPT_THREE("public void sing(String... keys, String... pitches)");
        temp.setOPT_FOUR("public void sing(String... notes, String melodies)");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("A method may contain at most one varargs parameter, and it " +
                "must appear as the last argument in the list. For this reason, " +
                "Option A is correct, and Options B, C, and D are incorrect.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("17");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following is not a reason to use encapsulation when " +
                "designing a class?");
        temp.setOPT_ONE("Promote usability by other developers.");
        temp.setOPT_TWO("Maintain class data integrity of data elements.");
        temp.setOPT_THREE("Prevent users from modifying the internal attributes of a class.");
        temp.setOPT_FOUR("Increase concurrency and improve performance.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("Implementing encapsulation prevents internal attributes of a " +
                "class from being modified directly, so Option C is a true " +
                "statement. By preventing access to internal attributes, we can also " +
                "maintain class data integrity between elements, making Option B " +
                "a true statement. Option A is also a true statement about " +
                "encapsulation, since well-encapsulated classes are often easier to " +
                "use. Option D is an incorrect statement. Encapsulation makes no " +
                "guarantees about performance and concurrency.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("18");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following data types can be modified after they are " +
                "passed to a method as an argument?");
        temp.setOPT_ONE("int[ ]");
        temp.setOPT_TWO("String");
        temp.setOPT_THREE("long");
        temp.setOPT_FOUR("boolean");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("Option B is incorrect because String values are immutable and " +
                "cannot be modified. Options C and D are also incorrect since " +
                "variables are passed by value, not reference, in Java. Option A is " +
                "the correct answer. The contents of an array can be modified when " +
                "passed to a method, since a copy of the reference to the object is " +
                "passed. For example, the method can change the first element of a " +
                "non-empty array.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("20");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given a method with one of the following return types, which data " +
                "type prevents the return statement from being used within the " +
                "method?");
        temp.setOPT_ONE("byte");
        temp.setOPT_TWO("String");
        temp.setOPT_THREE("void");
        temp.setOPT_FOUR("None of the above");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("Options A and B are incorrect because a method with a nonvoid " +
                "return type requires that the method return a value using the " +
                "return statement. Option C is also incorrect since a method with a " +
                "void return type can still call the return command with no values " +
                "and exit the method. Therefore, Option D is the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("23");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the following method signature, which classes can call it?\n" +
                "void run(String government)");
        temp.setOPT_ONE("Classes in other packages");
        temp.setOPT_TWO("Classes in the same package");
        temp.setOPT_THREE("Subclasses in a different package");
        temp.setOPT_FOUR("All classes");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("The method signature has package-private, or default, access; " +
                "therefore, it is accessible to classes in the same package, making " +
                "Option B the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("24");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which statement(s) about the following class would help to " +
                "properly encapsulate the data in the class?\n" +
                "package shield;\n" +
                "public class Protect {\n" +
                "\tprivate String material;\n" +
                "\tprotected int strength;\n" +
                "\tpublic int getStrength() {\n" +
                "\t\treturn strength;\n" +
                "\t}\n" +
                "\tpublic void setStrength(int strength) {\n" +
                "\t\tthis.strength = strength;\n" +
                "\t}\n" +
                "}\n" +
                "I. Change the access modifier of strength to private.\n" +
                "II. Add a getter method for material.\n" +
                "III. Add a setter method for material.");
        temp.setOPT_ONE("I");
        temp.setOPT_TWO("II and III");
        temp.setOPT_THREE("I, II, and III");
        temp.setOPT_FOUR("None, the data in the class is already encapsulated.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("The access modifier of strength is protected, meaning " +
                "subclasses and classes within the same package can modify it. " +
                "Changing the value to private would improve encapsulation by " +
                "making the Protect class the only one capable of directly " +
                "modifying it. For these reasons, the first statement is correct. " +
                "Alternatively, the second and third statements do not improve the " +
                "encapsulation of the class. While having getters and setters for " +
                "private variables is helpful, they are not required. Encapsulation " +
                "is about protecting the data elements. With this in mind, it is clear " +
                "the material variable is already protected. Therefore, Option A is " +
                "the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("26");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following lines of code can be inserted in the line " +
                "below that would allow the class to compile?\n" +
                "package farm;\n" +
                "public class Coop {\n" +
                "\tpublic final int static getNumberOfChickens() {\n" +
                "\t\t// INSERT CODE HERE\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("return 3.0;");
        temp.setOPT_TWO("return 5L;");
        temp.setOPT_THREE("return 10;");
        temp.setOPT_FOUR("None of the above");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("The code does not compile, regardless of what is inserted into " +
                "the line because the method signature is invalid. The return type, " +
                "int, should go before the method name and after any access, " +
                "final, or static modifiers. Therefore, Option D is the correct " +
                "answer. If the method was fixed, by swapping the order of int and " +
                "static in the method declaration, then Option C would be the " +
                "correct answer. Options A and B are still incorrect, though, since " +
                "each uses a return type that cannot be implicitly converted to int.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("27");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following is a true statement about passing data to a " +
                "method?");
        temp.setOPT_ONE("A change made to a primitive value passed to a method is " +
                "reflected in the calling method.");
        temp.setOPT_TWO("A change made to the data within an object passed to a method " +
                "is reflected in the calling method.");
        temp.setOPT_THREE("Reassigning an object reference passed to a method is reflected " +
                "in the calling method.");
        temp.setOPT_FOUR("A change made to a boolean value passed to a method is " +
                "reflected in the calling method.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("Java uses pass-by-value, so changes made to primitive values " +
                "and object references passed to a method are not reflected in the " +
                "calling method. For this reason, Options A and C are incorrect " +
                "statements. Option D is also an invalid statement because it is a " +
                "special case of Option A. Finally, Option B is the correct answer. " +
                "Changes to the data within an object are visible to the calling " +
                "method since the object that the copied reference points to is the " +
                "same.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("31");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What access modifier is used to mark class members package private?");
        temp.setOPT_ONE("private");
        temp.setOPT_TWO("default");
        temp.setOPT_THREE("protected");
        temp.setOPT_FOUR("None of the above");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("In Java, the lack of an access modifier indicates that the " +
                "member is package-private, therefore Option D is correct. Note " +
                "that the default keyword is used for interfaces and switch " +
                "statements, and is not an access modifier.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("33");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following statements is true?");
        temp.setOPT_ONE("An instance method is allowed to reference a static variable.");
        temp.setOPT_TWO("A static method is allowed to reference an instance variable.");
        temp.setOPT_THREE("A static initialization block is allowed to reference an instance " +
                "variable.");
        temp.setOPT_FOUR("A final static variable may be set in a constructor.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("An instance method or constructor has access to all static " +
                "variables, making Option A correct. On the other hand, static " +
                "methods and static initializers cannot reference instance " +
                "variables since they are defined across all instances, making " +
                "Options B and C incorrect. Note that they can access instance " +
                "variables if they are passed a reference to a specific instance, but " +
                "not in the general case. Finally, Option D is incorrect because " +
                "static final variables must be set when they are declared or in a " +
                "static initialization block.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("37");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following application?\n" +
                "package pet;\n" +
                "public class Puppy {\n" +
                "\tpublic static int wag = 5; // q1\n" +
                "\tpublic void Puppy(int wag) { // q2\n" +
                "\t\tthis.wag = wag;\n" +
                "\t}\n" +
                "\tpublic static void main(String[ ] tail) {\n" +
                "\t\tSystem.out.print(new Puppy(2).wag); // q3\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("2");
        temp.setOPT_TWO("It does not compile because of line q1.");
        temp.setOPT_THREE("It does not compile because of line q2.");
        temp.setOPT_FOUR("It does not compile because of line q3.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("The Puppy class does not declare a constructor, so the default " +
                "no-argument constructor is automatically inserted by the " +
                "compiler. What looks like a constructor in the class is actually a " +
                "method that has a return type of void. Therefore, the line in the " +
                "main() method to create the new Puppy(2) object does not " +
                "compile, since there is no constructor capable of taking an int " +
                "value, making Option D the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("39");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following application?\n" +
                "package ship;\n" +
                "public class Phone {\n" +
                "\tprivate int size;\n" +
                "\tpublic Phone(int size) {this.size=size;}\n" +
                "\tpublic static void sendHome(Phone p, int newSize) {\n" +
                "\t\tp = new Phone(newSize);\n" +
                "\t\tp.size = 4;\n" +
                "\t}\n" +
                "\tpublic static final void main(String... params) {\n" +
                "\t\tfinal Phone phone = new Phone(3);\n" +
                "\t\tsendHome(phone,7);\n" +
                "\t\tSystem.out.print(phone.size);\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("3");
        temp.setOPT_TWO("4");
        temp.setOPT_THREE("7");
        temp.setOPT_FOUR("The code does not compile.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("The code compiles without issue, so Option D is incorrect. The " +
                "key here is that Java uses pass by value to send object references " +
                "to methods. Since the Phone reference p was reassigned in the first " +
                "line of the sendHome() method, any changes to the p reference " +
                "were made to a new object. In other words, no changes in the " +
                "sendHome() method affected the object that was passed in. " +
                "Therefore, the value of size was the same before and after the " +
                "method call, making the output 3 and Option A the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);









        temp.setID("42");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which statement about a static variable is true?");
        temp.setOPT_ONE("The value of a static variable must be set when the variable is " +
                "declared or in a static initialization block.");
        temp.setOPT_TWO("It is not possible to read static final variables outside the " +
                "class in which they are defined.");
        temp.setOPT_THREE("It is not possible to reference static methods using static " +
                "imports.");
        temp.setOPT_FOUR("A static variable is always available in all instances of the " +
                "class.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("Option A is a statement about final static variables, not all " +
                "static variables. Option B only applies to static variables marked " +
                "private, not final. Option C is false because static imports can " +
                "be used to reference both variables and methods. Option D is the " +
                "correct answer because a static variable is accessible to all " +
                "instances of the class.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);








        temp.setID("44");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("How many final modifiers would need to be removed for this " +
                "application to compile?\n" +
                "package park;\n" +
                "public class Tree {\n" +
                "\tpublic final static long numberOfTrees;\n" +
                "\tpublic final double height;\n" +
                "\tstatic {}\n" +
                "\t{ final int initHeight = 2;\n" +
                "\t\theight = initHeight;\n" +
                "\t}\n" +
                "\tstatic {\n" +
                "\t\tnumberOfTrees = 100;\n" +
                "\t\theight = 4;\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("None");
        temp.setOPT_TWO("One");
        temp.setOPT_THREE("Two");
        temp.setOPT_FOUR("The code will not compile regardless of the number of final " +
                "modifiers removed.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("The last static initialization block accesses height, which is an " +
                "instance variable, not a static variable. Therefore, the code will " +
                "not compile no matter how many final modifiers are removed, " +
                "making Option D the correct answer. Note that if the line height = " +
                "4; was removed, then no final modifiers would need to be " +
                "removed to make the class compile.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);







        temp.setID("45");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following application?\n" +
                "package jungle;\n" +
                "public class RainForest extends Forest {\n" +
                "\tpublic RainForest(long treeCount) {\n" +
                "\t\tthis.treeCount = treeCount+1;\n" +
                "\t}\n" +
                "\tpublic static void main(String[ ] birds) {\n" +
                "\t\tSystem.out.print(new RainForest(5).treeCount);\n" +
                "\t}\n" +
                "}\n" +
                "class Forest {\n" +
                "\tpublic long treeCount;\n" +
                "\tpublic Forest(long treeCount) {\n" +
                "\t\tthis.treeCount = treeCount+2;\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("5");
        temp.setOPT_TWO("6");
        temp.setOPT_THREE("8");
        temp.setOPT_FOUR("The code does not compile.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("Since a constructor call is not the first line of the RainForest() " +
                "constructor, the compiler inserts the no-argument super() call. " +
                "Since the parent class, Forest, does not define a no-argument " +
                "super() constructor, the RainForest() constructor does not " +
                "compile, and Option D is correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("49");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Assume there is a class Bouncer with a protected variable. " +
                "Methods in which class can access this variable?");
        temp.setOPT_ONE("Only subclasses of Bouncer");
        temp.setOPT_TWO("Any subclass of Bouncer or any class in the same package as Bouncer");
        temp.setOPT_THREE("Only classes in the same package as Bouncer");
        temp.setOPT_FOUR("Any superclass of Bouncer");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("The protected modifier allows access by any subclass or class " +
                "that is in the same package, therefore Option B is the correct " +
                "answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("50");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the following two classes, each in a different package, which " +
                "line inserted below allows the second class to compile?\n" +
                "package commerce;\n" +
                "public class Bank {\n" +
                "\tpublic void withdrawal(int amountInCents) {}\n" +
                "\tpublic void deposit(int amountInCents) {}\n" +
                "}\n" +
                "package employee;\n" +
                "// INSERT CODE HERE\n" +
                "public class Teller {\n" +
                "\tpublic void processAccount(int depositSlip, int " +
                "withdrawalSlip) {\n" +
                "\t\twithdrawal(withdrawalSlip);\n" +
                "\t\tdeposit(depositSlip);\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("import static commerce.Bank.*;");
        temp.setOPT_TWO("static import commerce.Bank.*;");
        temp.setOPT_THREE("import static commerce.Bank;");
        temp.setOPT_FOUR("None of the above");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("6");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("A static import is used to import static members of another " +
                "class. In this case, the withdrawal() and deposit() methods in the " +
                "Bank class are not marked static. They require an instance of Bank " +
                "to be used and cannot be imported as static methods. Therefore, " +
                "Option D is correct. If the two methods in the Bank class were " +
                "marked static, then Option A would be the correct answer since " +
                "wildcards can be used with static imports to import more than " +
                "one method. Option B reverses the keywords static and import, " +
                "while Option C incorrectly imports a class, which cannot be " +
                "imported via a static import.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("1");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("How many lines of the following program contain compilation " +
                "errors?\n" +
                "package theater;\n" +
                "class Cinema {\n" +
                "\tprivate String name;\n" +
                "\tpublic Cinema(String name) {this.name = name;}\n" +
                "}\n" +
                "public class Movie extends Cinema {\n" +
                "\tpublic Movie(String movie) {}\n" +
                "\tpublic static void main(String[ ] showing) {\n" +
                "\t\tSystem.out.print(new Movie(\"Another Trilogy\").name);\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("None");
        temp.setOPT_TWO("One");
        temp.setOPT_THREE("Two");
        temp.setOPT_FOUR("Three");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("The code does not compile, so Option A is incorrect. This code " +
                "does not compile for two reasons. First, the name variable is " +
                "marked private in the Cinema class, which means it cannot be " +
                "accessed directly in the Movie class. Next, the Movie class defines a " +
                "constructor that is missing an explicit super() statement. Since " +
                "Cinema does not include a no-argument constructor, the noargument " +
                "super() cannot be inserted automatically by the " +
                "compiler without a compilation error. For these two reasons, the " +
                "code does not compile, and Option C is the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("2");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which modifier can be applied to an abstract interface method?");
        temp.setOPT_ONE("protected");
        temp.setOPT_TWO("static");
        temp.setOPT_THREE("final");
        temp.setOPT_FOUR("public");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("All abstract interface methods are implicitly public, making " +
                "Option D the correct answer. Option A is incorrect because " +
                "protected conflicts with the implicit public modifier. Since static " +
                "methods must have a body and abstract methods cannot have a " +
                "body, Option B is incorrect. Finally, Option C is incorrect. A " +
                "method, whether it be in an interface or a class, cannot be " +
                "declared both final and abstract, as doing so would prevent it " +
                "from ever being implemented.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("3");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following application?\n" +
                "package radio;\n" +
                "public class Song {\n" +
                "\tpublic void playMusic() {\n" +
                "\t\tSystem.out.print(\"Play!\");\n" +
                "\t}\n" +
                "\tprivate static int playMusic() {\n" +
                "\t\tSystem.out.print(\"Music!\");\n" +
                "\t}\n" +
                "\tpublic static void main(String[ ] tracks) {\n" +
                "\t\tnew Song().playMusic();\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("Play!");
        temp.setOPT_TWO("Music!");
        temp.setOPT_THREE("The code does not compile.");
        temp.setOPT_FOUR("The code compiles but the answer cannot be determined until " +
                "runtime.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("A class cannot contain two methods with the same method " +
                "signature, even if one is static and the other is not. Therefore, the " +
                "code does not compile because the two declarations of " +
                "playMusic() conflict with one another, making Option C the " +
                "correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("4");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following statements about inheritance is true?");
        temp.setOPT_ONE("Inheritance allows objects to access commonly used attributes " +
                "and methods.");
        temp.setOPT_TWO("Inheritance always leads to simpler code.");
        temp.setOPT_THREE("All primitives and objects inherit a set of methods.");
        temp.setOPT_FOUR("Inheritance allows you to write methods that reference " +
                "themselves.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("Inheritance is often about improving code reusability, by " +
                "allowing subclasses to inherit commonly used attributes and " +
                "methods from parent classes, making Option A the correct answer. " +
                "Option B is incorrect. Inheritance can lead to either simpler or " +
                "more complex code, depending on how well it is structured. " +
                "Option C is also incorrect. While all objects inherit methods from " +
                "java.lang.Object, this does not apply to primitives. Finally, " +
                "Option D is incorrect because methods that reference themselves " +
                "are not a facet of inheritance.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("10");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following statements about overriding a method is " +
                "incorrect?");
        temp.setOPT_ONE("The return types must be covariant.");
        temp.setOPT_TWO("The access modifier of the method in the child class must be " +
                "the same or broader than the method in the superclass.");
        temp.setOPT_THREE("A checked exception thrown by the method in the parent class " +
                "must be thrown by the method in the child class.");
        temp.setOPT_FOUR("A checked exception thrown by a method in the child class " +
                "must be the same or narrower than the exception thrown by " +
                "the method in the parent class.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("First off, the return types of an overridden method must be " +
                "covariant. Next, it is true that the access modifier must be the " +
                "same or broader in the child method. Using a narrower access " +
                "modifier in the child class would not allow the code to compile. " +
                "Overridden methods must not throw any new or broader checked " +
                "exceptions than the method in the superclass. For these reasons, " +
                "Options A, B, and D are true statements. Option C is the false " +
                "statement. An overridden method is not required to throw a " +
                "checked exception defined in the parent class.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("12");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given that FileNotFoundException is a subclass of IOException, " +
                "what is the output of the following application?\n" +
                "package edu;\n" +
                "import java.io.*;\n" +
                "class School {\n" +
                "\tpublic int getNumberOfStudentsPerClassroom(String... " +
                "students) throws IOException {\n" +
                "\t\treturn 3;\n" +
                "\t}\n" +
                "\tpublic int getNumberOfStudentsPerClassroom() throws " +
                "IOException {\n" +
                "\t\treturn 9;\n" +
                "\t}\n" +
                "}\n" +
                "public class HighSchool extends School {\n" +
                "\tpublic int getNumberOfStudentsPerClassroom() throws " +
                "FileNotFoundException {\n" +
                "\t\treturn 2;\n" +
                "\t}\n" +
                "\tpublic static void main(String[ ] students) throws " +
                "IOException {\n" +
                "\t\tSchool school = new HighSchool();\n" +
                "\t\tSystem.out.print(school.getNumberOfStudentsPerClassroom());\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("2");
        temp.setOPT_TWO("3");
        temp.setOPT_THREE("9");
        temp.setOPT_FOUR("The code does not compile.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("The code compiles without issue, so Option D is incorrect. The " +
                "rule for overriding a method with exceptions is that the subclass " +
                "cannot throw any new or broader checked exceptions. Since " +
                "FileNotFoundException is a subclass of IOException, it is " +
                "considered a narrower exception, and therefore the overridden " +
                "method is allowed. Due to polymorphism, the overridden version " +
                "of the method in HighSchool is used, regardless of the reference " +
                "type, and 2 is printed, making Option A the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("13");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which modifier can be applied to an interface method?");
        temp.setOPT_ONE("protected");
        temp.setOPT_TWO("static");
        temp.setOPT_THREE("private");
        temp.setOPT_FOUR("final");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("Interface methods are implicitly public, making Option A and C " +
                "incorrect. Interface methods can also not be declared final, " +
                "whether they are static, default, or abstract methods, making " +
                "Option D incorrect. Option B is the correct answer because an " +
                "interface method can be declared static.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("14");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following application?\n" +
                "package track;\n" +
                "interface Run {\n" +
                "\tdefault void walk() {\n" +
                "\t\tSystem.out.print(\"Walking and running!\");\n" +
                "\t}\n" +
                "}\n" +
                "interface Jog {\n" +
                "\tdefault void walk() {\n" +
                "\t\tSystem.out.print(\"Walking and jogging!\");\n" +
                "\t}\n" +
                "}\n" +
                "public class Sprint implements Run, Jog {\n" +
                "\tpublic void walk() {\n" +
                "\t\tSystem.out.print(\"Sprinting!\");\n" +
                "\t}\n" +
                "\tpublic static void main() {\n" +
                "\t\tnew Sprint().walk();\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("Walking and running!");
        temp.setOPT_TWO("Walking and jogging!");
        temp.setOPT_THREE("Sprinting!");
        temp.setOPT_FOUR("The code does not compile.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Having one class implement two interfaces that both define the " +
                "same default method signature leads to a compiler error, unless " +
                "the class overrides the default method. In this case, the Sprint " +
                "class does override the walk() method correctly, therefore the " +
                "code compiles without issue, and Option C is correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("16");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following application?\n" +
                "package transport;\n" +
                "class Ship {\n" +
                "\tprotected int weight = 3;\n" +
                "\tprivate int height = 5;\n" +
                "\tpublic int getWeight() { return weight; }\n" +
                "\tpublic int getHeight() { return height; }\n" +
                "}\n" +
                "public class Rocket extends Ship {\n" +
                "\tpublic int weight = 2;\n" +
                "\tpublic int height = 4;\n" +
                "\tpublic void printDetails() {\n" +
                "\t\tSystem.out.print(super.getWeight()+\",\"+super.height);\n" +
                "\t}\n" +
                "\tpublic static final void main(String[ ] fuel) {\n" +
                "\t\tnew Rocket().printDetails();\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("2,5");
        temp.setOPT_TWO("3,4");
        temp.setOPT_THREE("3,5");
        temp.setOPT_FOUR("The code does not compile.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("The code does not compile because super.height is not visible " +
                "in the Rocket class, making Option D the correct answer. Even " +
                "though the Rocket class defines a height value, the super keyword " +
                "looks for an inherited version. Since there are none, the code does " +
                "not compile. Note that super.getWeight() returns 3 from the " +
                "variable in the parent class, as polymorphism and overriding does " +
                "not apply to instance variables.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("21");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following application?\n" +
                "package paper;\n" +
                "abstract class Book {\n" +
                "\tprotected static String material = \"papyrus\";\n" +
                "\tpublic Book() {}\n" +
                "\tpublic Book(String material) {this.material = material;}\n" +
                "}\n" +
                "public class Encyclopedia extends Book {\n" +
                "\tpublic static String material = \"cellulose\";\n" +
                "\tpublic Encyclopedia() {super();}\n" +
                "\tpublic String getMaterial() {return super.material;}\n" +
                "\tpublic static void main(String[ ] pages) {\n" +
                "\t\tSystem.out.print(new Encyclopedia().getMaterial());\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("papyrus");
        temp.setOPT_TWO("cellulose");
        temp.setOPT_THREE("The code does not compile.");
        temp.setOPT_FOUR("The code compiles but throws an exception at runtime.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("The code compiles and runs without issue, making Options C " +
                "and D incorrect. Although super.material and this.material are " +
                "poor choices in accessing static variables, they are permitted. " +
                "Since super is used to access the variable in getMaterial(), the " +
                "value papyrus is returned, making Option A the correct answer. " +
                "Also, note that the constructor Book(String) is not used in the " +
                "Encyclopedia class.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("24");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following application?\n" +
                "package space;\n" +
                "interface Sphere {\n" +
                "\tdefault String getName() { return \"Unknown\"; }\n" +
                "}\n" +
                "abstract class Planet {\n" +
                "\tabstract String getName();\n" +
                "}\n" +
                "public class Mars extends Sphere implements Planet {\n" +
                "\tpublic Mars() {\n" +
                "\t\tsuper();\n" +
                "\t}\n" +
                "\tpublic String getName() { return \"Mars\"; }\n" +
                "\tpublic static void main(final String[ ] probe) {\n" +
                "\t\tSystem.out.print(((Planet)new Mars()).getName());\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("Mars");
        temp.setOPT_TWO("Unknown");
        temp.setOPT_THREE("The code does not compile due to the declaration of Sphere.");
        temp.setOPT_FOUR("The code does not compile for another reason.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("The declaration of Sphere compiles without issue, so Option C " +
                "is incorrect. The Mars class declaration is invalid because Mars " +
                "cannot extend Sphere, an interface, nor can Mars implement " +
                "Planet, a class. In other words, they are reversed. Since the code " +
                "does not compile, Option D is the correct answer. Note that if " +
                "Sphere and Planet were swapped in the Mars class definition, the " +
                "code would compile and the output would be Mars, making Option " +
                "A the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("27");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following application?\n" +
                "package race;\n" +
                "abstract class Car {\n" +
                "\tstatic { System.out.print(\"1\"); }\n" +
                "\tpublic Car(String name) {\n" +
                "\t\tsuper();\n" +
                "\t\tSystem.out.print(\"2\");\n" +
                "\t}\n" +
                "\t{ System.out.print(\"3\"); }\n" +
                "}\n" +
                "public class BlueCar extends Car {\n" +
                "\t{ System.out.print(\"4\"); }\n" +
                "\tpublic BlueCar() {\n" +
                "\t\tsuper(\"blue\");\n" +
                "\t\tSystem.out.print(\"5\");\n" +
                "\t}\n" +
                "\tpublic static void main(String[ ] gears) {\n" +
                "\t\tnew BlueCar();\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("23451");
        temp.setOPT_TWO("12354");
        temp.setOPT_THREE("13245");
        temp.setOPT_FOUR("The code does not compile.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("The class is loaded first, with the static initialization block " +
                "called and 1 is outputted first. When the BlueCar is created in the " +
                "main() method, the superclass initialization happens first. The " +
                "instance initialization blocks are executed before the constructor, " +
                "so 32 is outputted next. Finally, the class is loaded with the " +
                "instance initialization blocks again being called before the " +
                "has a widening access modifier, which is fine per the rules of " +
                "overriding methods.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("32");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following application?\n" +
                "package flying;\n" +
                "class Rotorcraft {\n" +
                "\tprotected final int height = 5;\n" +
                "\tabstract int fly();\n" +
                "}\n" +
                "public class Helicopter extends Rotorcraft {\n" +
                "\tprivate int height = 10;\n" +
                "\tprotected int fly() {\n" +
                "\t\treturn super.height;\n" +
                "\t}\n" +
                "\tpublic static void main(String[ ] unused) {\n" +
                "\t\tHelicopter h = (Helicopter)new Rotorcraft();\n" +
                "\t\tSystem.out.print(h.fly());\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("5");
        temp.setOPT_TWO("10");
        temp.setOPT_THREE("The code does not compile.");
        temp.setOPT_FOUR("The code compiles but produces a ClassCastException at " +
                "runtime.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("The application does not compile, but not for any reason having " +
                "to do with the cast in the main() method. The Rotorcraft class " +
                "includes an abstract method, but the class itself is not marked " +
                "abstract. Only interfaces and abstract classes can include abstract " +
                "methods. Since the code does not compile, Option C is the correct " +
                "answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("36");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following is not an attribute common to both " +
                "abstract classes and interfaces?");
        temp.setOPT_ONE("They both can contain static variables.");
        temp.setOPT_TWO("They both can contain default methods.");
        temp.setOPT_THREE("They both can contain static methods.");
        temp.setOPT_FOUR("They both can contain abstract methods.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("Abstract classes and interfaces can both contain static and " +
                "abstract methods as well as static variables, but only an " +
                "interface can contain default methods. Therefore, Option B is " +
                "correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("40");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following application?\n" +
                "class Math {\n" +
                "\tpublic final double secret = 2;\n" +
                "}\n" +
                "class ComplexMath extends Math {\n" +
                "\tpublic final double secret = 4;\n" +
                "}\n" +
                "public class InfiniteMath extends ComplexMath {\n" +
                "\tpublic final double secret = 8;\n" +
                "\tpublic static void main(String[ ] numbers) {\n" +
                "\t\tMath math = new InfiniteMath();\n" +
                "\t\tSystem.out.print(math.secret);\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("2");
        temp.setOPT_TWO("4");
        temp.setOPT_THREE("8");
        temp.setOPT_FOUR("The code does not compile.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("The code compiles without issue, so Option D is incorrect. Java " +
                "allows methods to be overridden, but not variables. Therefore, " +
                "marking them final does not prevent them from being " +
                "reimplemented in a subclass. Furthermore, polymorphism does " +
                "not apply in the same way it would to methods as it does to " +
                "variables. In particular, the reference type determines the version " +
                "of the secret variable that is selected, making the output 2 and " +
                "Option A the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("46");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following statements about no-argument " +
                "constructors is correct?");
        temp.setOPT_ONE("If a parent class does not include a no-argument constructor, a " +
                "child class cannot declare one.");
        temp.setOPT_TWO("If a parent class does not include a no-argument constructor " +
                "(nor a default one inserted by the compiler), a child class must " +
                "contain at least one constructor definition.");
        temp.setOPT_THREE("If a parent class contains a no-argument constructor, a child " +
                "class must contain a no-argument constructor.");
        temp.setOPT_FOUR("If a parent class contains a no-argument constructor, a child " +
                "class must contain at least one constructor.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("46");
        temp.setEXPLANATION("If a parent class does not include a no-argument " +
                "constructor, the child class must explicitly declare a constructor, " +
                "since the compiler will not be able to insert the default noargument " +
                "constructor, making Option B correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("50");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given that EOFException is a subclass of IOException, what is the " +
                "output of the following application?\n" +
                "package ai;\n" +
                "import java.io.*;\n" +
                "class Machine {\n" +
                "\tpublic boolean turnOn() throws EOFException {\n" +
                "\t\treturn true;\n" +
                "\t}\n" +
                "}\n" +
                "public class Robot extends Machine {\n" +
                "\tpublic boolean turnOn() throws IOException {\n" +
                "\t\treturn false;\n" +
                "\t}\n" +
                "\tpublic static void main(String[ ] doesNotCompute) throws " +
                "Exception {\n" +
                "\t\tMachine m = new Robot();\n" +
                "\t\tSystem.out.print(m.turnOn());\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("true");
        temp.setOPT_TWO("false");
        temp.setOPT_THREE("The code does not compile.");
        temp.setOPT_FOUR("The code compiles but produces an exception at runtime.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("7");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("The rule for overriding a method with exceptions is that the " +
                "subclass cannot throw any new or broader checked exceptions. " +
                "Since IOException is a superclass of EOFException, from the " +
                "question description, we see that this is a broader exception and " +
                "therefore not compatible. For this reason, the code does not " +
                "compile, and Option C is the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("1");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the result of compiling and executing the following " +
                "application?\n" +
                "package mind;\n" +
                "public class Remember {\n" +
                "\tpublic static void think() throws Exception { // k1\n" +
                "\ttry {\n" +
                "\t\tthrow new Exception();\n" +
                "\t}\n" +
                "}\n" +
                "\tpublic static void main(String... ideas) throws " +
                "Exception {\n" +
                "\t\tthink();\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("The code compiles and runs without printing anything.");
        temp.setOPT_TWO("The code compiles but a stack trace is printed at runtime.");
        temp.setOPT_THREE("The code does not compile because of line k1.");
        temp.setOPT_FOUR("The code does not compile for another reason.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("A try block must include either a catch or finally block, or " +
                "both. The think() method declares a try block but neither " +
                "additional block. For this reason, the code does not compile, and " +
                "Option D is the correct answer. The rest of the lines compile " +
                "without issue, including k1.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("4");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following Throwable types is it recommended not to " +
                "catch in a Java application?");
        temp.setOPT_ONE("Error");
        temp.setOPT_TWO("CheckedException");
        temp.setOPT_THREE("Exception");
        temp.setOPT_FOUR("RuntimeException");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("While Exception and RuntimeException are commonly caught " +
                "in Java applications, it is recommended Error not be caught. An " +
                "Error often indicates a failure of the JVM which cannot be " +
                "recovered from. For this reason, Option A is correct, and Options " +
                "C and D are incorrect. Option B is not a class defined in the Java " +
                "API; therefore, it is also incorrect.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("5");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following application?\n" +
                "package game;\n" +
                "public class Baseball {\n" +
                "\tpublic static void main(String... teams) {\n" +
                "\t\ttry {\n" +
                "\t\t\tint score = 1;\n" +
                "\t\t\tSystem.out.print(score++);\n" +
                "\t\t} catch (Throwable t) {\n" +
                "\t\t\tSystem.out.print(score++);\n" +
                "\t\t} finally {\n" +
                "\t\t\tSystem.out.print(score++);\n" +
                "\t\t}\n" +
                "\tSystem.out.print(score++);\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("123");
        temp.setOPT_TWO("124");
        temp.setOPT_THREE("12");
        temp.setOPT_FOUR("None of the above");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("The application does not compile because score is defined only " +
                "within the try block. The other three places it is referenced, in the " +
                "catch block, in the finally block, and outside the try-catch-finally " +
                "block at the end, are not in scope for this variable and each does " +
                "not compile. Therefore, the correct answer is Option D.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("6");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following is a checked exception?");
        temp.setOPT_ONE("ClassCastException");
        temp.setOPT_TWO("IOException");
        temp.setOPT_THREE("ArrayIndexOutOfBoundsException");
        temp.setOPT_FOUR("IllegalArgumentException");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("ClassCastException, ArrayIndexOutOfBoundsException, and " +
                "IllegalArgumentException are unchecked exceptions and can be " +
                "thrown at any time. IOException is a checked exception that must " +
                "be handled or declared when used, making Option B the correct " +
                "answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("8");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("If a try statement has catch blocks for both Exception and " +
                "IOException, then which of the following statements is correct?");
        temp.setOPT_ONE("The catch block for Exception must appear before the catch " +
                "block for IOException.");
        temp.setOPT_TWO("The catch block for IOException must appear before the catch " +
                "block for Exception.");
        temp.setOPT_THREE("The catch blocks for these two exception types can be declared " +
                "in any order.");
        temp.setOPT_FOUR("A try statement cannot be declared with these two catch block " +
                "types because they are incompatible.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("IOException is a subclass of Exception, so it must appear first " +
                "in any related catch blocks. If Exception was to appear before " +
                "IOException, then the IOException block would be considered " +
                "unreachable code because any thrown IOException is already " +
                "handled by the Exception catch block. For this reason, Option B " +
                "is correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("11");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following exception types must be handled or " +
                "declared by the method in which they are thrown?");
        temp.setOPT_ONE("NullPointerException");
        temp.setOPT_TWO("Exception");
        temp.setOPT_THREE("RuntimeException");
        temp.setOPT_FOUR("ArithmeticException");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("NullPointerException and ArithmeticException both extend " +
                "RuntimeException, which are unchecked exceptions and not " +
                "required to be handled or declared in the method in which they " +
                "are thrown. On the other hand, Exception is a checked exception " +
                "and must be handled or declared by the method in which it is " +
                "thrown. Therefore, Option B is the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("13");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following statements about a finally block is true?");
        temp.setOPT_ONE("Every line of the finally block is guaranteed to be executed.");
        temp.setOPT_TWO("The finally block is executed only if the related catch block is " +
                "also executed.");
        temp.setOPT_THREE("The finally statement requires brackets {}.");
        temp.setOPT_FOUR("The finally block cannot throw an exception.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("A finally block can throw an exception, in which case not every " +
                "line of the finally block would be executed. For this reason, " +
                "Options A and D are incorrect. Option B is also incorrect The " +
                "finally block is called regardless of whether or not the related " +
                "catch block is executed. Option C is the correct answer. Unlike an " +
                "if-then statement, which can take a single statement, a finally " +
                "statement requires brackets {}.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("14");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given that FileNotFoundException is a subclass of IOException, " +
                "what is the output of the following application?\n" +
                "package office;\n" +
                "import java.io.*;\n" +
                "public class Printer {\n" +
                "\tpublic void print() {\n" +
                "\t\ttry {\n" +
                "\t\t\tthrow new FileNotFoundException();\n" +
                "\t\t} catch (IOException exception) {\n" +
                "\t\t\tSystem.out.print(\"Z\");\n" +
                "\t\t} catch (FileNotFoundException enfe) {\n" +
                "\t\t\tSystem.out.print(\"X\");\n" +
                "\t\t} finally {\n" +
                "\t\t\tSystem.out.print(\"Y\");\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\tpublic static void main(String... ink) {\n" +
                "\t\tnew Printer().print();\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("XY");
        temp.setOPT_TWO("ZY");
        temp.setOPT_THREE("The code does not compile.");
        temp.setOPT_FOUR("The code compiles but a stack trace is printed at runtime.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("The code does not compile because the catch blocks are used in " +
                "the wrong order. Since IOException is a superclass of " +
                "FileNotFoundException, the FileNotFoundException is considered " +
                "unreachable code. For this reason, the code does not compile, and " +
                "Option C is correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("16");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which statement about the role of exceptions in Java is incorrect?");
        temp.setOPT_ONE("Exceptions are often used when things “go wrong” or deviate " +
                "from the expected path.");
        temp.setOPT_TWO("An application that throws an exception will terminate.");
        temp.setOPT_THREE("Some exceptions can be avoided programmatically.");
        temp.setOPT_FOUR("An application that can properly handle its exception may " +
                "recover from unexpected problems.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("Option A is a true statement about exceptions and when they " +
                "are often applied. Option B is the false statement and the correct " +
                "answer. An application that throws an exception can choose to " +
                "handle the exception and avoid termination. Option C is also a " +
                "true statement. For example, a NullPointerException can be " +
                "avoided on a null object by testing whether or not the object is " +
                "null before attempting to use it. Option D is also a correct statement. " +
                "Attempting to recover from unexpected problems is an " +
                "important aspect of proper exception handling.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("18");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of following method signatures would not be allowed in a " +
                "class implementing the Printer interface?\n" +
                "class PrintException extends Exception {}\n" +
                "class PaperPrintException extends PrintException {}\n" +
                "public interface Printer {\n" +
                "\tabstract int printData() throws PrintException;\n" +
                "}");
        temp.setOPT_ONE("public int printData() throws PaperPrintException");
        temp.setOPT_TWO("public int printData() throws Exception");
        temp.setOPT_THREE("public int printData()");
        temp.setOPT_FOUR("None of the above");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("Overridden methods cannot throw new or broader checked " +
                "exceptions than the one they inherit. Since Exception is a broader " +
                "checked exception than PrintException, Option B is not allowed " +
                "and is the correct choice. Alternatively, declaring narrower or the " +
                "same checked exceptions or removing them entirely is allowed, " +
                "making Options A and C incorrect. Since Option B is correct, " +
                "Option D is incorrect.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);









        temp.setID("23");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("If an exception matches two or more catch blocks, which catch " +
                "block is executed?");
        temp.setOPT_ONE("If an exception matches two or more catch blocks, which catch " +
                "block is executed?");
        temp.setOPT_TWO("The last one that matches is executed.");
        temp.setOPT_THREE("All matched blocks are executed.");
        temp.setOPT_FOUR("It is not possible to write code like this.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("If an exception matches multiple catch blocks, the first one that " +
                "it encounters will be the only one executed, making Option A " +
                "correct, and Options B and C incorrect. Option D is also incorrect. " +
                "It is possible to write two consecutive catch blocks that can catch " +
                "the same exception, with the first type being a subclass of the " +
                "second. In this scenario, an exception thrown of the first type " +
                "would match both catch blocks, but only the first catch block " +
                "would be executed, since it is the more specific match.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);








        temp.setID("24");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following application?\n" +
                "package system;\n" +
                "public class Computer {\n" +
                "\tpublic void compute() throws Exception {\n" +
                "\t\tthrow new RuntimeException(\"Error processing " +
                "request\");\n" +
                "\t}\n" +
                "\tpublic static void main(String[ ] bits) {\n" +
                "\t\ttry {\n" +
                "\t\t\tnew Computer().compute();\n" +
                "\t\t\tSystem.out.print(\"Ping\");\n" +
                "\t\t} catch (NullPointerException e) {\n" +
                "\t\t\tSystem.out.print(\"Pong\");\n" +
                "\t\t\tthrow e;\n" +
                "\t\t}\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("Ping");
        temp.setOPT_TWO("Pong");
        temp.setOPT_THREE("The code does not compile.");
        temp.setOPT_FOUR("The code compiles but throws an exception at runtime.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("The code does not compile due to the call to compute() in the " +
                "main() method. Even though the compute() method only throws " +
                "an unchecked exception, its method declaration includes the " +
                "Exception class, which is a checked exception. For this reason, the " +
                "checked exception must be handled or declared in the main() " +
                "method in which it is called. While there is a try-catch block in the " +
                "main() method, it is only for the unchecked " +
                "NullPointerException. Since Exception is not a subclass of " +
                "NullPointerException, the checked Exception is not properly " +
                "handled or declared and the code does not compile, making " +
                "Option C the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);







        temp.setID("25");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("In the following application, the value of list has been omitted. " +
                "Assuming the code compiles without issue, which one of the " +
                "following is not a possible output of executing this class?\n" +
                "package checkboard;\n" +
                "public class Attendance {\n" +
                "\tprivate Boolean[ ] list = // value omitted\n" +
                "\tpublic int printTodaysCount() {\n" +
                "\t\tint count=0;\n" +
                "\t\tfor(int i=0; i<10; i++) {\n" +
                "\t\t\tif(list[i]) ++count;\n" +
                "\t\t}\n" +
                "\t\treturn count;\n" +
                "\t}\n" +
                "\tpublic static void main(String[ ] roster) {\n" +
                "\t\tnew Attendance().printTodaysCount();\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("A stack trace for NullPointerException is printed.");
        temp.setOPT_TWO("A stack trace for ArrayIndexOutOfBoundsException is printed.");
        temp.setOPT_THREE("A stack trace for ClassCastException is printed.");
        temp.setOPT_FOUR("None of the above");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("NullPointerException can be thrown if the value of list is " +
                "null. Likewise, an ArrayIndexOutOfBoundsException can be " +
                "thrown if the value of list is an array with fewer than 10 " +
                "elements. Finally, a ClassCastException can be thrown if list is " +
                "assigned an object that is not of type Boolean[ ]. For example, the " +
                "assignment list = (Boolean[ ]) new Object() will compile " +
                "without issue but throws a ClassCastException at runtime. " +
                "Therefore, the first three options are possible, making Option D " +
                "the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("27");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following is not a reason to add checked exceptions " +
                "to a method signature?");
        temp.setOPT_ONE("To force a caller to handle or declare its exceptions");
        temp.setOPT_TWO("To notify the caller of potential types of problems");
        temp.setOPT_THREE("To ensure that exceptions never cause the application to " +
                "terminate");
        temp.setOPT_FOUR("To give the caller a chance to recover from a problem");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Checked exceptions are commonly used to force a caller to deal " +
                "with an expected type of problem, such as the inability to write a " +
                "file to the file system. Without dealing with all checked exceptions " +
                "thrown by the method, the calling code does not compile, so " +
                "Option A is a true statement. Option B is also a true statement. " +
                "Declaring various different exceptions informs the caller of the " +
                "potential types of problems the method can encounter. Option C is " +
                "the correct answer. There may be no recourse in handling an " +
                "exception other than to terminate the application. Finally, Option " +
                "D is also a true statement because it gives the caller a chance to " +
                "recover from an exception, such as writing file data to a backup " +
                "location.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("30");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following application?\n" +
                "package pond;\n" +
                "abstract class Duck {\n" +
                "\tprotected int count;\n" +
                "\tpublic abstract int getDuckies();\n" +
                "}\n" +
                "public class Ducklings extends Duck {\n" +
                "\tprivate int age;\n" +
                "\tpublic Ducklings(int age) { this.age = age; }\n" +
                "\tpublic int getDuckies() { return this.age/count; }\n" +
                "\tpublic static void main(String[ ] pondInfo) {\n" +
                "\t\tDuck itQuacks = new Ducklings(5);\n" +
                "\t\tSystem.out.print(itQuacks.getDuckies());\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("0");
        temp.setOPT_TWO("5");
        temp.setOPT_THREE("The code does not compile.");
        temp.setOPT_FOUR("The code compiles but throws an exception at runtime.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("The code compiles without issue, so Option C is incorrect. The " +
                "key here is noticing that count, an instance variable, is initialized " +
                "with a value of 0. The getDuckies() method ends up computing " +
                "5/0, which leads to an unchecked ArithmeticException at " +
                "runtime, making Option D the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("35");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given a try statement, if both the catch block and the finally " +
                "block each throw an exception, what does the caller see?");
        temp.setOPT_ONE("The exception from the catch block");
        temp.setOPT_TWO("The exception from the finally block");
        temp.setOPT_THREE("Both the exception from the catch block and the exception " +
                "from the finally block");
        temp.setOPT_FOUR("None of the above");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("If both values are valid non-null String objects, then no " +
                "exception will be thrown, with the statement in the finally block " +
                "being executed first, before returning control to the main() " +
                "method; therefore, the second statement is a possible output. If " +
                "either value is null, then the toString() method will cause a");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("33");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the following code snippet, which specific exception will be " +
                "thrown?\n" +
                "final Object exception = new Exception();\n" +
                "final Exception data = (RuntimeException)exception;\n" +
                "System.out.print(data);");
        temp.setOPT_ONE("ClassCastException");
        temp.setOPT_TWO("RuntimeException");
        temp.setOPT_THREE("NullPointerException");
        temp.setOPT_FOUR("None of the above");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("Although this code uses the RuntimeException and Exception " +
                "classes, the question is about casting. Exception is not a subclass " +
                "of RuntimeException, so the assignment on the second line throws " +
                "a ClassCastException at runtime, making Option A correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("34");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following classes will handle all types in a catch " +
                "block?");
        temp.setOPT_ONE("Exception");
        temp.setOPT_TWO("Error");
        temp.setOPT_THREE("Throwable");
        temp.setOPT_FOUR("RuntimeException");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("All exceptions in Java inherit from Throwable, making Option C " +
                "the correct answer. Note that Error and Exception extend " +
                "Throwable, and RuntimeException extends Exception.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("36");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("If a try statement has catch blocks for both ClassCastException " +
                "and RuntimeException, then which of the following statements is " +
                "correct?");
        temp.setOPT_ONE("The catch block for ClassCastException must appear before " +
                "the catch block for RuntimeException.");
        temp.setOPT_TWO("The catch block for RuntimeException must appear before the " +
                "catch block for ClassCastException.");
        temp.setOPT_THREE("The catch blocks for these two exception types can be declared " +
                "in any order.");
        temp.setOPT_FOUR("A try statement cannot be declared with these two catch block " +
                "types because they are incompatible.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("ClassCastException is a subclass of RuntimeException, so it " +
                "must appear first in any related catch blocks. If RuntimeException " +
                "was to appear before ClassCastException, then the " +
                "ClassCastException block would be considered unreachable code, " +
                "since any thrown ClassCastException is already handled by the " +
                "RuntimeException catch block. For this reason, Option A is " +
                "correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("41");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Given the following application, which type of exception will be " +
                "printed in the stack trace at runtime?\n" +
                "package carnival;\n" +
                "public class WhackAnException {\n" +
                "\tpublic static void main(String... hammer) {\n" +
                "\t\ttry {\n" +
                "\t\t\tthrow new ClassCastException();\n" +
                "\t\t} catch (IllegalArgumentException e) {\n" +
                "\t\t\tthrow new IllegalArgumentException();\n" +
                "\t\t} catch (RuntimeException e) {\n" +
                "\t\t\tthrow new NullPointerException();\n" +
                "\t\t} finally {\n" +
                "\t\t\tthrow new RuntimeException();\n" +
                "\t\t}\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("IllegalArgumentException");
        temp.setOPT_TWO("NullPointerException");
        temp.setOPT_THREE("RuntimeException");
        temp.setOPT_FOUR("The code does not compile.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("For this question, notice that all the exceptions thrown or " +
                "caught are unchecked exceptions. First, the ClassCastException is " +
                "thrown in the try block and caught by the second catch block " +
                "since it inherits from RuntimeException, not " +
                "IllegalArgumentException. Next, a NullPointerException is " +
                "thrown, but before it can be returned the finally block is " +
                "executed and a RuntimeException replaces it. The application exits " +
                "and the caller sees the RuntimeException in the stack trace, " +
                "making Option C the correct answer. If the finally block did not " +
                "throw any exceptions, then Option B would be the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("42");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of these method signatures is allowed in a class " +
                "implementing the Outfielder interface?\n" +
                "class OutOfBoundsException extends BadCatchException {}\n" +
                "class BadCatchException extends Exception {}\n" +
                "public interface Outfielder {\n" +
                "\tpublic void catchBall() throws OutOfBoundsException;\n" +
                "}");
        temp.setOPT_ONE("public int catchBall() throws OutOfBoundsException");
        temp.setOPT_TWO("public int catchBall() throws BadCatchException");
        temp.setOPT_THREE("public int catchBall() throws Exception");
        temp.setOPT_FOUR("None of the above");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("Trick question! Options A, B, and C are each invalid overrides " +
                "of the method because the return type must be covariant with " +
                "void. For this reason, Option D is the correct answer. If the return " +
                "types were changed to be void, then Option A would be a valid " +
                "override. Options B and C would still be incorrect, since " +
                "overridden methods cannot throw broader checked exceptions " +
                "than the inherited method.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("46");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following application?\n" +
                "package broken;\n" +
                "class Problem implements RuntimeException {}\n" +
                "public class BiggerProblem extends Problem {\n" +
                "\tpublic static void main(String uhOh[ ]) {\n" +
                "\t\ttry {\n" +
                "\t\t\tthrow new BiggerProblem();\n" +
                "\t\t} catch (BiggerProblem re) {\n" +
                "\t\t\tSystem.out.print(\"Problem?\");\n" +
                "\t\t} catch (Problem e) {\n" +
                "\t\t\tSystem.out.print(\"Handled\");\n" +
                "\t\t} finally {\n" +
                "\t\t\tSystem.out.print(\"Fixed!\");\n" +
                "\t\t}\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("Problem?Fixed!");
        temp.setOPT_TWO("Handled.Fixed!");
        temp.setOPT_THREE("Problem?Handled.Fixed!");
        temp.setOPT_FOUR("The code does not compile.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("The class RuntimeException is not an interface and it cannot be " +
                "implemented. For this reason, the Problem class does not compile, " +
                "and Option D is the correct answer. Note that this is the only " +
                "compilation problem in the application. If implements was " +
                "changed to extends, the code would compile and Problem?Fixed! " +
                "would be printed, making Option A the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("50");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following application?\n" +
                "package bed;\n" +
                "public class Sleep {\n" +
                "\tpublic static void snore() {\n" +
                "\t\ttry {\n" +
                "\t\t\tString sheep[ ] = new String[3];\n" +
                "\t\t\tSystem.out.print(sheep[3]);\n" +
                "\t\t} catch (RuntimeException e) {\n" +
                "\t\t\tSystem.out.print(\"Awake!\");\n" +
                "\t\t} finally {\n" +
                "\t\t\tthrow new Exception(); // x1\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\tpublic static void main(String... sheep) { // x2\n" +
                "\t\tnew Sleep().snore(); // x3\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("Awake!, followed by a stack trace");
        temp.setOPT_TWO("The code does not compile because of line x1.");
        temp.setOPT_THREE("The code does not compile because of line x2.");
        temp.setOPT_FOUR("The code does not compile because of line x3.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("8");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("The finally block of the snore() method throws a new checked " +
                "exception on line x1, but there is no try-catch block around it to " +
                "handle it, nor does the snore() method declare any checked " +
                "exceptions. For these reasons, line x1 does not compile, and " +
                "Option B is the correct answer.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("3");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of the following creates a StringBuilder with a different " +
                "value than the other options?");
        temp.setOPT_ONE("new StringBuilder().append(\"clown\")");
        temp.setOPT_TWO("new StringBuilder(\"clown\")");
        temp.setOPT_THREE("new StringBuilder(\"cl\").insert(2, \"own\")");
        temp.setOPT_FOUR("All of them create the same value.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("This question is testing whether you understand how method " +
                "chaining works. Option A creates an empty StringBuilder and " +
                "then adds the five characters in clown to it. Option B simply " +
                "creates the clown when calling the constructor. Finally, Option C " +
                "creates the same value, just in two parts. Therefore, Option D is " +
                "correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("4");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following?\n" +
                "StringBuilder teams = new StringBuilder(\"333\");\n" +
                "teams.append(\" 806\");\n" +
                "teams.append(\" 1601\");\n" +
                "System.out.print(teams);");
        temp.setOPT_ONE("333");
        temp.setOPT_TWO("333 806 1601");
        temp.setOPT_THREE("The code compiles but outputs something else.");
        temp.setOPT_FOUR("The code does not compile.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("B");
        temp.setEXPLANATION("Since StringBuilder is mutable, each call to append adds to the " +
                "value. When calling print, toString() is automatically called and " +
                "333 806 1601 is output. Therefore, Option B is correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("7");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the result of the following code?\n" +
                "StringBuilder sb = new StringBuilder(\"radical\")" +
                ".insert(sb.length(), \"robots\");\n" +
                "System.out.println(sb);");
        temp.setOPT_ONE("radicarobots");
        temp.setOPT_TWO("radicalrobots");
        temp.setOPT_THREE("The code does not compile.");
        temp.setOPT_FOUR("The code compiles but throws an exception at runtime.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("Calling the constructor and then insert() is an example of " +
                "method chaining. However, the sb.length() call is a problem. The " +
                "sb reference doesn’t exist until after the chained calls complete. " +
                "Just because it happens to be on a separate line doesn’t change " +
                "when the reference is created. Since the code does not compile, " +
                "Option C is correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("9");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following?\n" +
                "12: StringBuilder b = new StringBuilder(\"12\");\n" +
                "13: b = b.append(\"3\");\n" +
                "14: b.reverse();\n" +
                "15: System.out.println(b.toString());");
        temp.setOPT_ONE("12");
        temp.setOPT_TWO("123");
        temp.setOPT_THREE("321");
        temp.setOPT_FOUR("The code does not compile.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("C");
        temp.setEXPLANATION("On line 12, the value of the StringBuilder is 12. On line 13, it " +
                "becomes 123. Since StringBuilder is mutable, storing the result in " +
                "the same reference is redundant. Then on line 14, the value is " +
                "reversed, giving us 321 and making Option C correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("10");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the main benefit of a lambda expression?");
        temp.setOPT_ONE("It allows you to convert a primitive to a wrapper class.");
        temp.setOPT_TWO("It allows you to change the bytecode while the application is " +
                "running.");
        temp.setOPT_THREE("It allows you to inherit from multiple classes.");
        temp.setOPT_FOUR("It allows you to write code that has the execution deferred.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("Option A is incorrect as it describes autoboxing. Options B and " +
                "C are not possible in Java. Option D is correct as it describes " +
                "lambdas. Lambdas use deferred execution and can be run " +
                "elsewhere in the codebase.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("11");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following?\n" +
                "5: StringBuilder line = new StringBuilder(\"-\");\n" +
                "6: StringBuilder anotherLine = line.append(\"-\");\n" +
                "7: System.out.print(line == anotherLine);\n" +
                "8: System.out.print(\" \");\n" +
                "9: System.out.print(line.length());");
        temp.setOPT_ONE("false 1");
        temp.setOPT_TWO("false 2");
        temp.setOPT_THREE("true 1");
        temp.setOPT_FOUR("true 2");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("A StringBuilder is mutable, so the length is two after line 6 " +
                "completes. The StringBuilder methods return a reference to the " +
                "same object so you can chain method calls. Therefore, line and " +
                "anotherLine refer to the same object. This means that line 7 prints " +
                "true. Then on line 9, both references point to the same object of " +
                "length 2, and Option D is correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("13");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which portion of code can be removed so that this line of code " +
                "continues to compile?\n" +
                "Predicate<StringBuilder> p = (StringBuilder b) ‐> {return " +
                "true;};");
        temp.setOPT_ONE("Remove StringBuilder b");
        temp.setOPT_TWO("Remove ->");
        temp.setOPT_THREE("Remove { and ;}");
        temp.setOPT_FOUR("Remove { return and ;}");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("Option A is tricky, but incorrect. While a lambda can have zero " +
                "parameters, a Predicate cannot. A Predicate is defined as a type " +
                "mapping to a boolean. Option B is clearly incorrect as -> separates " +
                "the parts of a lambda. Options C and D are similar. Option C is " +
                "incorrect because return is only allowed when the brackets are " +
                "present. Option D is correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("14");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following?\n" +
                "20: List<Character> chars = new ArrayList<>();\n" +
                "21: chars.add('a');\n" +
                "22: chars.add('b');\n" +
                "23: chars.set(1, 'c');\n" +
                "24: chars.remove(0);\n" +
                "25: System.out.print(chars.size() + \" \" + " +
                "chars.contains('b'));");
        temp.setOPT_ONE("1 false");
        temp.setOPT_TWO("1 true");
        temp.setOPT_THREE("2 false");
        temp.setOPT_FOUR("2 true");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("Lines 20–22 create an ArrayList with two elements. Line 23 " +
                "replaces the second one with a new value. Now chars is [a, c]. " +
                "Then line 24 removes the first element, making it just [c]. Option " +
                "A is correct because there is only one element, but it is not the " +
                "value b.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("15");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following?\n" +
                "12: String b = \"12\";\n" +
                "13: b += \"3\";\n" +
                "14: b.reverse();\n" +
                "15: System.out.println(b.toString());");
        temp.setOPT_ONE("12");
        temp.setOPT_TWO("123");
        temp.setOPT_THREE("321");
        temp.setOPT_FOUR("The code does not compile.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("D");
        temp.setEXPLANATION("Trick question. There is no reverse method on the String class. " +
                "There is one on the StringBuilder class. Therefore, the code does " +
                "not compile, and Option D is correct.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("16");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("How many of these lines fail to compile?\n" +
                "Predicate<String> pred1 = s ‐> false;\n" +
                "Predicate<String> pred2 = (s) ‐> false;\n" +
                "Predicate<String> pred3 = String s ‐> false;\n" +
                "Predicate<String> pred4 = (String s) ‐> false;");
        temp.setOPT_ONE("One");
        temp.setOPT_TWO("Two");
        temp.setOPT_THREE("Three");
        temp.setOPT_FOUR("Four");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("A");
        temp.setEXPLANATION("When creating a lambda with only one parameter, there are a " +
                "few variants. The pred1 approach shows the shortest way, where " +
                "the type is omitted and the parentheses are omitted. The pred2 " +
                "approach is similar except it includes the parentheses. Both are\n" +
                "legal. The pred4 approach is the long way with both the\n" +
                "parentheses and type specified. The only one that doesn’t compile\n" +
                "is pred3. The parentheses are required if including the type.");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("17");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What does the following do?\n" +
                "public class Shoot {\n" +
                "\tinterface Target {\n" +
                "\t\tboolean needToAim(double angle);\n" +
                "\t}\n" +
                "\tstatic void prepare(double angle, Target t) {\n" +
                "\t\tboolean ready = t.needToAim(angle); // k1\n" +
                "\t\tSystem.out.println(ready);\n" +
                "\t}\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tprepare(45, d -> d > 5 || d < -5); // k2\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("It prints true.");
        temp.setOPT_TWO("It prints false.");
        temp.setOPT_THREE("It doesn’t compile due to line k1.");
        temp.setOPT_FOUR("It doesn’t compile due to line k2.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("19");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of these classes are in the java.util package?\n" +
                "I. ArrayList\n" +
                "II. LocalDate\n" +
                "III. String");
        temp.setOPT_ONE("I only");
        temp.setOPT_TWO("II only");
        temp.setOPT_THREE("I and II");
        temp.setOPT_FOUR("I, II, and III");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("21");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following?\n" +
                "String[ ] array = {\"Natural History\", \"Science\"};\n" +
                "List<String> museums = Arrays.asList(array);\n" +
                "museums.set(0, \"Art\");\n" +
                "System.out.println(museums.contains(\"Art\"));");
        temp.setOPT_ONE("true");
        temp.setOPT_TWO("false");
        temp.setOPT_THREE("The code does not compile.");
        temp.setOPT_FOUR("The code compiles but throws an exception at runtime.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("22");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which is a true statement?");
        temp.setOPT_ONE("If s.contains(\"abc\") is true, then s.equals(\"abc\") is also " +
                "true.");
        temp.setOPT_TWO("If s.contains(\"abc\") is true, then s.startsWith(\"abc\") is also " +
                "true.");
        temp.setOPT_THREE("If s.startsWith(\"abc\") is true, then s.equals(\"abc\") is also " +
                "true.");
        temp.setOPT_FOUR("If s.startsWith(\"abc\") is true, then s.contains(\"abc\") is also " +
                "true.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("23");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following?\n" +
                "20: List<Character> chars = new ArrayList<>();\n" +
                "21: chars.add('a');\n" +
                "22: chars.add('b');\n" +
                "23: chars.set(1, 'c');\n" +
                "24: chars.remove(0);\n" +
                "25: System.out.print(chars.length());");
        temp.setOPT_ONE("0");
        temp.setOPT_TWO("1");
        temp.setOPT_THREE("2");
        temp.setOPT_FOUR("None of the above");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("27");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following?\n" +
                "5: String line = new String(\"-\");\n" +
                "6: String anotherLine = line.concat(\"-\");\n" +
                "7: System.out.print(line == anotherLine);\n" +
                "8: System.out.print(\" \");\n" +
                "9: System.out.print(line.length());");
        temp.setOPT_ONE("false 1");
        temp.setOPT_TWO("false 2");
        temp.setOPT_THREE("true 1");
        temp.setOPT_FOUR("true 2");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("28");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What does the following output?\n" +
                "Predicate dash = c -> c.startsWith(\"‐\");\n" +
                "System.out.println(dash.test(\"–\"));");
        temp.setOPT_ONE("true");
        temp.setOPT_TWO("false");
        temp.setOPT_THREE("The code does not compile.");
        temp.setOPT_FOUR("The code compiles but throws an exception at runtime.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("29");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Of the classes LocalDate, LocalDateTime, LocalTime, and " +
                "LocalTimeStamp, how many include hours, minutes, and seconds?");
        temp.setOPT_ONE("One");
        temp.setOPT_TWO("Two");
        temp.setOPT_THREE("Three");
        temp.setOPT_FOUR("Four");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("31");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which equivalent code can replace i -> i != 0 in the following line?\n" +
                "Predicate<Integer> ip = i ‐> i != 0;");
        temp.setOPT_ONE("i -> { i != 0 }");
        temp.setOPT_TWO("i -> { i != 0; }");
        temp.setOPT_THREE("i -> { return i != 0 }");
        temp.setOPT_FOUR("i -> { return i != 0; }");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);









        temp.setID("32");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the output of the following?\n" +
                "LocalDate xmas = LocalDate.of(2016, 12, 25);\n" +
                "xmas.plusDays(-1);\n" +
                "System.out.println(xmas.getDayOfMonth());");
        temp.setOPT_ONE("24");
        temp.setOPT_TWO("25");
        temp.setOPT_THREE("26");
        temp.setOPT_FOUR("None of the above");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);








        temp.setID("34");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What does the following output?\n" +
                "Predicate clear = c -> c.equals(\"clear\");\n" +
                "System.out.println(clear.test(\"pink\"));");
        temp.setOPT_ONE("true");
        temp.setOPT_TWO("false");
        temp.setOPT_THREE("The code does not compile.");
        temp.setOPT_FOUR("The code compiles but throws an exception at runtime.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);







        temp.setID("36");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which statement is not true of Predicate?");
        temp.setOPT_ONE("A boolean is returned from the method it declares.");
        temp.setOPT_TWO("It is an interface.");
        temp.setOPT_THREE("The method it declares accepts two parameters.");
        temp.setOPT_FOUR("The method it declares is named test.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("37");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which of these periods represents a larger amount of time?\n" +
                "Period period1 = Period.ofWeeks(1).ofDays(3);\n" +
                "Period period2 = Period.ofDays(10);");
        temp.setOPT_ONE("period1");
        temp.setOPT_TWO("period2");
        temp.setOPT_THREE("They represent the same length of time.");
        temp.setOPT_FOUR("They represent the same length of time.");
        temp.setOPT_FIVE("None of the above. This code does not compile.");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the result of the following?\n" +
                "import java.time.*;\n" +
                "import java.time.format.*;\n" +
                "public class HowLong {\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tLocalDate newYears = LocalDate.of(2017, 1, 1);\n" +
                "\t\tPeriod period = Period.ofDays(1);\n" +
                "\t\tDateTimeFormatter format =\n" +
                "\t\tDateTimeFormatter.ofPattern(\"MM-dd-yyyy\");\n" +
                "\t\tSystem.out.print(format.format(newYears.minus(period)));\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("01-01-2017");
        temp.setOPT_TWO("12-31-2016");
        temp.setOPT_THREE("The code does not compile.");
        temp.setOPT_FOUR("The code compiles but throws an exception at runtime.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("40");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("Which is not a true statement about the Period class?");
        temp.setOPT_ONE("A Period is immutable.");
        temp.setOPT_TWO("A Period is typically used for adding or subtracting time from " +
                "dates.");
        temp.setOPT_THREE("You can create a Period representing 2 minutes.");
        temp.setOPT_FOUR("You can create a Period representing 5 years.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("44");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the smallest unit you can add to a LocalTime object?");
        temp.setOPT_ONE("Second");
        temp.setOPT_TWO("Millisecond");
        temp.setOPT_THREE("Nanosecond");
        temp.setOPT_FOUR("Picosecond");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("45");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the result of the following?\n" +
                "import java.time.*;\n" +
                "import java.time.format.*;\n" +
                "public class HowLong {\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tLocalDate newYears = LocalDate.of(2017, 1, 1);\n" +
                "\t\tPeriod period = Period.ofDays(1);\n" +
                "\t\tDateTimeFormatter format =\n" +
                "\t\tDateTimeFormatter.ofPattern(\"mm-dd-yyyy\");\n" +
                "\t\tSystem.out.print(format.format(newYears.minus(period)));\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("01-01-2017");
        temp.setOPT_TWO("12-31-2016");
        temp.setOPT_THREE("The code does not compile.");
        temp.setOPT_FOUR("The code compiles but throws an exception at runtime.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("47");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("How many lines does this code output?\n" +
                "import java.util.*;\n" +
                "import java.util.function.*;\n" +
                "public class PrintNegative {\n" +
                "\tpublic static void main(String[ ] args) {\n" +
                "\t\tList<String> list = new ArrayList<>();\n" +
                "\t\tlist.add(\"-5\");\n" +
                "\t\tlist.add(\"0\");\n" +
                "\t\tlist.add(\"5\");\n" +
                "\t\tprint(list, e -> e < 0);\n" +
                "\t}\n" +
                "\tpublic static void print(List<String> list, " +
                "Predicate<Integer> p) {\n" +
                "\t\tfor (String num : list)\n" +
                "\t\t\tif (p.test(num))\n" +
                "\t\t\t\tSystem.out.println(num);\n" +
                "\t}\n" +
                "}");
        temp.setOPT_ONE("One");
        temp.setOPT_TWO("Two");
        temp.setOPT_THREE("None. The code does not compile.");
        temp.setOPT_FOUR("None. The code throws an exception at runtime.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("50");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("What is the result of the following?\n" +
                "LocalDate xmas = LocalDate.of(2017, 12, 25);\n" +
                "xmas.setYear(2018);\n" +
                "System.out.println(xmas.getYear());");
        temp.setOPT_ONE("2017");
        temp.setOPT_TWO("2018");
        temp.setOPT_THREE("The code does not compile.");
        temp.setOPT_FOUR("The code compiles but throws an exception at runtime.");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("4");
        temp.setCHAPTER("9");
        temp.setDIFFICULTY("1");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);









        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);








        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);







        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);







        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);









        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);








        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);







        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);









        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);








        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);







        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);









        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);








        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);







        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);









        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);








        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);







        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);









        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);








        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);







        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);







        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);









        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);








        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);







        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);







        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);









        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);








        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);







        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);



        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);









        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);








        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);







        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);
        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);









        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);








        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);







        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);
        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);









        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);








        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);







        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);
        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);









        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);








        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);







        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);









        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);








        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);







        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);







        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);









        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);








        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);







        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);






        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);









        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);








        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);







        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);




        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);





        temp.setID("212");
        temp.setTYPE("2");  // 1 meaning multiple and 2 meaning single
        temp.setQUESTION("");
        temp.setOPT_ONE("");
        temp.setOPT_TWO("");
        temp.setOPT_THREE("");
        temp.setOPT_FOUR("");
        temp.setOPT_FIVE("");
        temp.setOPT_SIX("");
        temp.setNo_Opt("");
        temp.setCHAPTER("");
        temp.setDIFFICULTY("");
        temp.setMOCK("4");
        temp.setCORRECT_OPT("");
        temp.setEXPLANATION("");
        temp.setDuplicate("false");
        dbActivity.insertData(temp, db);








        dbActivity.close();

    }


}
