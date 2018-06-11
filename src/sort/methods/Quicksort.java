/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.methods;

import sort.strategy.*;

/**
 *
 * @author LeopardProMK
 */
public class Quicksort implements ISortMethod {
    private Stopwatch _stopwatch;
    private double _elapsedTime;
    
    private int partition(double arr[], int low, int high)
    {
        double pivot = arr[high]; 
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;
 
                // swap arr[i] and arr[j]
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)
        double temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
 
 
    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    private void sort(double arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is 
              now at right place */
            int pi = partition(arr, low, high);
 
            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

    @Override
    public double[] sortData(double[] arr) {
        _stopwatch = new Stopwatch();
        this.sort(arr, 0, arr.length - 1);
        _elapsedTime = _stopwatch.elapsedTime();
        return arr;
    }

    @Override
    public double GetElapsedTime() {
        return _elapsedTime;
    }
    /* http://www.algorytm.org/algorytmy-sortowania/sortowanie-szybkie-quicksort/quick-j.html */
}
