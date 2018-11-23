package ch3;

public class BitwiseOperator {
	public static void main(String[] args) {
        System.out.println("AND"); 
        System.out.println("0 AND 0 " + (0 & 0)); 
        System.out.println("0 AND 1 " + (0 & 1)); 
        System.out.println("1 AND 0 " + (1 & 0)); 
        System.out.println("1 AND 1 " + (1 & 1)); 

        System.out.println("OR："); 
        System.out.println("0 OR 0 " + (0 | 0)); 
        System.out.println("0 OR 1 " + (0 | 1)); 
        System.out.println("1 OR 0 " + (1 | 0)); 
        System.out.println("1 OR 1 " + (1 | 1)); 

        System.out.println("XOR："); 
        System.out.println("0 XOR 0 " + (0 ^ 0)); 
        System.out.println("0 XOR 1 " + (0 ^ 1)); 
        System.out.println("1 XOR 0 " + (1 ^ 0)); 
        System.out.println("1 XOR 1 " + (1 ^ 1)); 
	}
}
