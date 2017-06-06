package executables;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

import operationsOverArray.Util;

public class OperationsOverArray {

	public static void main(String[] args) throws IOException {
		BufferedReader br = addInput();
		PrintStream ps = addOutput();
		Util<Integer> tool = new Util<>();
		
		welcome();
		Integer[] array = addAndValidateArray();
		

		help();
		boolean isOver = false;
		while (!isOver) {
			ps.print("Número da opção escolhida:");
			String s = br.readLine();
			isOver = veriflyPossibleExit(s, isOver);
			
			if (s.compareTo("1") == 0) {
				ps.print(tool.toString(array));				
				
			}else if (s.compareTo("2") == 0){
				ps.print("Número da opção escolhida:");
				
			}else if (s.compareTo("3") == 0){
				
			}else if (s.compareTo("4") == 0){
				
			}else if (s.compareTo("5") == 0){
				
			}else{
				help();
			}
			
				
		}
		

	}

	private static void welcome() {
		PrintStream ps = addOutput();
		ps.println("Bem vindo ao operador de array.");
	}

	private static Integer[] addAndValidateArray() throws IOException {
		BufferedReader br = addInput();
		PrintStream ps = addOutput();
		Integer[] array = null;
		boolean acceptableSize = false;
		while(! acceptableSize){
			ps.print("Digite o tamanho do array maior ou igual a 1: ");
			int size = new Integer(br.readLine());
			if (size >= 1) {
				acceptableSize = true;
				array = new Integer[size];
				ps.println();
			}			
		}
		return array;
	}

	private static BufferedReader addInput() {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
	
	private static PrintStream addOutput() {
		OutputStream is = System.out;
		PrintStream isr = new PrintStream(is);
		return isr;
	}

	private static boolean veriflyPossibleExit(String s, boolean isOver) {
		if (s.compareTo("0") == 0) {
			isOver = true;
		}
		return isOver;
	}

	private static void help() throws IOException {
		PrintStream ps = addOutput();
		ps.println("Ajuda:");
		ps.println("Digite 0 para sair.");
		ps.println("Digite 1 para mostrar o array.");
		ps.println("Digite 2 para adicionar um inteiro ao array.");
		ps.println("Digite 3 para remover um inteiro do array.");
		ps.println("Digite 4 para retornar o menor inteiro do array.");
		ps.println("Digite 5 para retornar o maior inteiro do array.");
	}

}
