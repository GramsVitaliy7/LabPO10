/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labpo10;

/**
 *
 * @author VITGR
 */
public class LabPO10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String path1 = "input.txt";
        String path2 = "output.txt";
        Array array = new Array();
        array.loadArrayFromFile(path1);
        array.sortArray();
        array.saveArrayToFile(path2);

    }

}
