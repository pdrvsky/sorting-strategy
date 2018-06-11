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
public class Insertionsort implements ISortMethod {
    private Stopwatch _stopwatch;
    private double _elapsedTime;

    @Override
    public double[] sortData(double[] arr) {
        _stopwatch = new Stopwatch();
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            double key = arr[i];
            int j = i-1;
 
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        _elapsedTime = _stopwatch.elapsedTime();
        return arr;
    }

    @Override
    public double GetElapsedTime() {
        return _elapsedTime;
    }
}