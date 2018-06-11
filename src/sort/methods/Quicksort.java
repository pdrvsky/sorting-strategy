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

    @Override
    public Comparable[] sortData(Comparable[] inputData) {
        _stopwatch = new Stopwatch();
        // TODO: Implementation
        _elapsedTime = _stopwatch.elapsedTime();
        return inputData;
    }

    @Override
    public double GetElapsedTime() {
        return _elapsedTime;
    }
    /* http://www.algorytm.org/algorytmy-sortowania/sortowanie-szybkie-quicksort/quick-j.html */
}
