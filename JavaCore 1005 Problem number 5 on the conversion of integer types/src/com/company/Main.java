package com.company;

/*

1005 Problem number 5 on the conversion of integer types
Place the type conversion operators correctly to get the answer: c = 256
int a = (byte) 44;
int b = (byte) 300;
short c = (byte) (b - a);

Requirements:
1. The program should display the text on the screen.
2. You cannot change the display command.
3. The main () method must contain a variable of type int.
4. The main () method must contain a variable b of type int.
5. The main () method must contain a short variable of type c.
6. The initial value of the variables during initialization cannot be changed. You can add only cast operators.
7. The program should output the number 256.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        int a = (byte)44;
        int b = (short)300;
        short c = (short) (b - a);
        System.out.println(c);
    }
}















