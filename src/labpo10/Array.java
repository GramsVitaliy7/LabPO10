/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labpo10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author VITGR
 */
public class Array {

    private int[][] value;

    public int[][] loadArrayFromFile(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            int height = Integer.parseInt(br.readLine());
            int width = Integer.parseInt(br.readLine());
            value = new int[height][width];
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    value[i][j] = Integer.parseInt(br.readLine());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }

    public void saveArrayToFile(String path) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            for (int i = 0; i < value.length; i++) {
                for (int j = 0; j < value[0].length; j++) {
                    bw.write(String.valueOf(value[i][j] + "  "));
                }
                 bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   
    public int[][] sortArray() {
        //int[][] sortedArray = Arrays.copyOf(value, value.length);
        int height = value.length;
        int width = value[0].length;
        int buffer;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                for (int x = 0; x < height; x++) {
                    for (int y = 0; y < width; y++) {
                        if (value[i][j] < value[x][y]) {
                            buffer = value[i][j];
                            value[i][j] = value[x][y];
                            value[x][y] = buffer;
                        }
                    }
                }
            }
        }
        return value;
    }

}
