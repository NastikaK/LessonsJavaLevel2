package Lesson5;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) throws InvalidArgumentException {
        if (Arrays.stream(data).anyMatch(x -> x.length != header.length)) {
            throw new InvalidArgumentException(new String[]{"invalid data length"});
        }
        this.header = header;
        this.data = data;
    }

    public void save(String fileName) {
        try (PrintWriter printWriter = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(fileName)))) {
            printWriter.println(String.join(";", header));
            for (int i = 0; i <= data.length - 1; i++) {
                String[] d = Arrays.stream(data[i]).mapToObj(x -> "" + x).toArray(String[]::new);
                printWriter.println(String.join(";", d));
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static AppData load(String fileName) throws InvalidArgumentException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            String[] header = null;
            ArrayList<int[]> dataList = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                String[] dataLine = line.split(";");
                if (dataLine.length < 1) continue;
                if (header == null) {
                    header = dataLine;
                    continue;
                }
                int[] buffer = new int[header.length];
                for (int i = 0; i < buffer.length; i++) {
                    buffer[i] = Integer.parseInt(dataLine[i]);
                }
                dataList.add(buffer);
            }
            int[][] data = new int[dataList.size()][header.length];
            return new AppData(header, dataList.toArray(data));
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
