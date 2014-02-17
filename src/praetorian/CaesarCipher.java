package praetorian;

import java.util.Scanner;
public class CaesarCipher {

	public static void main(String args []) {

		Scanner scr = new Scanner(System.in);
		String str = "Mpyza johsslunl";

		char [] dearray = new char[str.length()]; //gets the string that's to be decrypted
		for(int k=0; k<dearray.length; k++){
				dearray[k] = str.charAt(k);
			
			System.out.print(dearray[k]);	
		}System.out.println("\n");

		char [] alphaarray = new char[26+26]; // the alphabet
		for(int i='a', j=0, k='A', l=26; i<='z' && j<=26 && k<='Z' && l<=51; i++, j++, k++, l++){
			alphaarray[j] = (char)i;
			alphaarray[l] = (char)k;
			System.out.println(alphaarray[j]+ " = " + j + "\t" + alphaarray[l] + " = " + l + " ");
		}System.out.println();

		int [] intarray = new int[dearray.length]; // maps the letters in the decrypted array with their place in the alphabet
		for(int r=0; r<dearray.length; r++){
			for(int q=0; q<alphaarray.length; q++){
				if(dearray[r] == alphaarray[q]){
					intarray[r] = q;
				}
			}System.out.print(intarray[r] + " "); //prints out the mapping 
		}System.out.println();

		while(true){ //always keeps going need to fix this 
			System.out.println();
			System.out.print("Enter Shift: ");
			int shift = scr.nextInt();	
			System.out.println();
			
			int [] index = new int[intarray.length];
			for(int s=0; s<intarray.length; s++){ // the index 
				 if(intarray[s]-shift<0){
					index[s] = ((intarray[s]-shift)+26); // if the answer is negative then add 26 to it 
				}
				else{
					index[s] = (intarray[s]-shift); // else just subtract the shift 
				}
				System.out.print(index[s] + " ");
			}System.out.println("\n");

			for(int i=0; i<index.length; i++){ //print out the decrypted message 
				System.out.print(alphaarray[index[i]]);
			}System.out.println();
		}
	}
}





