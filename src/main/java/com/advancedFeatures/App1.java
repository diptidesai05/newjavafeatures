package com.advancedFeatures;

import com.advancedFeatures.defaultInteface.CarRental;

public class App1 {
	
	public static void main(String args[]) {
		
		 CarRental car=new CarRental();
		 String band=car.getBrand();
		 String speedUp=car.speedUp();
		 int rent=car.calculateRent(530, 13);
		 System.out.println("band "+band+" speedUp "+speedUp+" rent "+rent);
		 int arr[] = { 1, 0, 2, 4, 21, 0, 23};
	        int n = arr.length;
	        System.out.println("Index of a peak point is "
	                           + findPeak(arr, n));
		 
	}
	static int findPeak(int arr[], int n)
    {
        int l = 0;
        int r = n-1;
        int mid = 0;
       
        while (l <= r) {
        	System.out.println("l= "+l);
        	System.out.println("r= "+r);
            // finding mid by binary right shifting.
            mid = (l + r) >> 1;
           int mid2 = (l + r)/2;
            System.out.println("mid "+mid);
            System.out.println("mid2 "+mid2);
            // first case if mid is the answer
            if ((mid == 0
                 || arr[mid - 1] <= arr[mid])
                        && (mid == n - 1
                            || arr[mid + 1] <= arr[mid]))
                break;
 
            // move the right pointer
            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                r = mid - 1;
                //System.out.println("r= "+r);
            }
            // move the left pointer
            else {
                l = mid + 1;
                //System.out.println("l= "+l);
            }
        }
       
        return mid;
    }

}
