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
public class Bubblesort implements ISortMethod {
    private Stopwatch _stopwatch;
    private double _elapsedTime;

    @Override
    public double[] sortData(double[] arr) {
        _stopwatch = new Stopwatch();
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        _elapsedTime = _stopwatch.elapsedTime();
        return arr;
    }

    @Override
    public double GetElapsedTime() {
        return _elapsedTime;
    }
}