/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerofhanoi;

import java.util.Scanner;

/**
 *
 * @author x
 */
public class TowerOfHanoi {

   
       public static void rift(int n, String startPole, String intermediatePole, String endPole)
    {
        if (n == 0)
        {
            return;
        }
        rift(n - 1, startPole, endPole, intermediatePole);
        System.out.println("Move \"" + n + "\" from " + startPole + " --> " + endPole);
        rift(n - 1, intermediatePole, startPole, endPole);
    }
    public static void main(String[] args)
    {
        System.out.print("Enter number of discs: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfDiscs = scanner.nextInt();
        rift(numberOfDiscs, "Pole1", "Pole2", "Pole3");
    }

    
}
