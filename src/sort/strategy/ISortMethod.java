/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.strategy;

/**
 *
 * @author student
 */
public interface ISortMethod {
    public double[] sortData(double[] inputData);
    public double GetElapsedTime();
}
