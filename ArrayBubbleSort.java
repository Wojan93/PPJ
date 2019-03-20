package com.PPJ;

	import java.util.Random;

	public class ArrayBubbleSort {

	   private static void bubbleSort(int[] x) {
	        for (int j = 0; j < x.length - 1; j++) {
	            for (int i = 0; i < x.length - 1; i++) {
	                if (x[i] > x[i + 1]) {
	                    int temp = x[i];
	                    x[i] = x[i + 1];
	                    x[i + 1] = temp;
	                }
	            }
	        }
	    }


	    static int[] arrOccurrences = new int[10];
	    static int min;
	    static int max;
	    static int[] arr = new int[100];
	    static int suma = 0;

	    public static void main(String[] args) {
	        Random randomGen = new Random();
	        for (int i = 0; i < 100; i++) {

	            arr[i] = randomGen.nextInt(10);
	            System.out.println(i + " wystapienie tablicy ma wartoœæ: " + arr[i]);
	            min = arr[0];
	            max = arr[0];
	            switch (arr[i]) {
	                case 0: {
	                    arrOccurrences[0]++;
	                    break;
	                }
	                case 1: {
	                    arrOccurrences[1]++;
	                    break;
	                }
	                case 2: {
	                    arrOccurrences[2]++;
	                    break;
	                }
	                case 3: {
	                    arrOccurrences[3]++;
	                    break;
	                }
	                case 4: {
	                    arrOccurrences[4]++;
	                    break;
	                }
	                case 5: {
	                    arrOccurrences[5]++;
	                    break;
	                }
	                case 6: {
	                    arrOccurrences[6]++;
	                    break;
	                }
	                case 7: {
	                    arrOccurrences[7]++;
	                    break;
	                }
	                case 8: {
	                    arrOccurrences[8]++;
	                    break;
	                }
	                case 9: {
	                    arrOccurrences[9]++;
	                    break;
	                }
	            }
	        }
	        for (int i = 0; i < 100; i++) {
	            if (arr[i] < min) {
	                min = arr[i];
	            }

	            if (arr[i] > max) {
	                max = arr[i];
	            }
	            suma = suma + arr[i];
	        }

	        for (int k = 0; k < 10; k++) {
	            System.out.println(" ilosc wyst¹pien wartoœci " + k + " to: " + arrOccurrences[k]);
	        }
	        System.out.println("Minimalna wartosc: " + min);
	        System.out.println("Maksymalna wartosc: " + max);
	        System.out.println("Suma wszystkich elementów tablicy: " + suma);
	        bubbleSort(arr);
	        for (int k = 0; k < 100; k++) {
	            System.out.println("Wartoœci tablicy po sortowaniu. Element nr: " + k + " Wartoœæ: " + arr[k]);
	        }
	    }
	    }




