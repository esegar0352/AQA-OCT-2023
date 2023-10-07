package org.prog.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo {

    //TODO: write catch for null pointer exception - done. f. 57
    //TODO: write method that will cause NPE - done f.21

    public static void main(String[] args) {
//
//        equalsA("b");
//        equalsA("a");
//        equalsA("");
//        equalsA(null);

        try {
            causeNPE();
        } catch (NullPointerException nullPointerException) {
            System.out.println("Null Pointer exceptiom");
        }  finally {
            System.out.println("Null Pointer exception is catched");
        }
//        try {
//            doSmth();
//            doAnother();
//
//       } catch (Throwable e) {
//            System.out.println("This is another exception");
//        } finally {
//           System.out.println("this code is always executed");
//      }
//      System.out.println("test2");
    }

    public static void doSmth() throws FileNotFoundException {
        FileReader reader = new FileReader(new File("C:\\test.txt"));
        System.out.println("test");
    }

    public static void doAnother() throws Exception {
        throw new Exception("another exception");
    }

    public static void printStuffLength(String value) {
        System.out.println(value.length());
    }

    public static void equalsA(String value) {
        System.out.println("a".equals(value));
    }

    public static void causeNPE()  { //Method written  by Kateryna Bila - Method causes Null Pointer Exception
      String a = null;
        System.out.println(a.length());
    }



    }
