package Lesson5;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, InvalidArgumentException {
        //String[] header = {"Value #1", "Value #2", "Value #3"};
        //int[][] data = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}, {100, 110, 120}};
        //AppData appData = new AppData(header, data);
        //appData.save("file.csv");
        AppData readerData = AppData.load("file.csv");
    }
}
