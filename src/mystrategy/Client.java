/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystrategy;

import data.DataGenerator;
import sort.methods.*;
import sort.strategy.ISortMethod;

/**
 *
 * @author LeopardProMK
 */
public class Client {
    
    private static ISortMethod _sortMethod;

    private static void setSortingMethod(ISortMethod sortMethod) {
        Client._sortMethod = sortMethod;
    };
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Algorytmy sortowania */
        // http://www.algorytm.org/algorytmy-sortowania/
        
        double[] dataNonSort = DataGenerator.generate(100000);
        
        /* Wzorzec Stratega */
        Client.setSortingMethod(new Quicksort());
        double[] dataSorted = Client._sortMethod.sortData(dataNonSort);
        
        System.out.println("Time: " + Client._sortMethod.GetElapsedTime());
    }
}
