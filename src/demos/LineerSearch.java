package demos;

import java.util.ArrayList;
import java.util.List;

import de.fhpotsdam.unfolding.data.PointFeature;
import parsing.ParseFeed;


public class LineerSearch{
	
	public static void main(String[] args) {
		int[] dizi = {10,20,30,40,50,60,70,80,90,100};
		int n = dizi.length;
		binarySearch(dizi,n,100);
	}
	
	public static String findAirportCode(Airport[] Airports, String toFind) {
		for(int i=0; i<Airports.length; i++) {
			if(Airports[i].getCity().equals(toFind)) {
				return Airports[i].getCode3();
			}
		}
		return null;
	}
	
	public static void binarySearch(int[] dizi, int length,int aranan) {
		int low = 0;
		int high = length-1;
		while(low<=high) {
			int mid = (low+high) / 2;
			if(dizi[mid] == aranan) {
				System.out.println(mid);
				return;
			}
			else if(dizi[mid]>aranan) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		System.out.println("oyle bi sayi yok");
	}
}
