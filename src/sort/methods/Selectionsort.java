/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.methods;

import sort.strategy.ISortMethod;
import sort.strategy.Stopwatch;

/**
 *
 * @author LeopardProMK
 */
public class Selectionsort implements ISortMethod {
    private Stopwatch _stopwatch;
    private double _elapsedTime;

    @Override
    public double[] sortData(double[] arr) {
        _stopwatch = new Stopwatch();
        int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            double temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        
        _elapsedTime = _stopwatch.elapsedTime();
        return arr;
    }

    @Override
    public double GetElapsedTime() {
        return _elapsedTime;
    }
}
