package exer1b;

import java.io.*;
import java.util.*;

public class progCriar {
	public static void main(String args[]) throws IOException {

		Scanner nome = new Scanner(System.in);
		String nomeArquivo;
		System.out.println("Digite o nome do arquivo, exemplo: Teste.txt ");
		System.out.println("Para sair e salvar digite: 'salvar'");
		nomeArquivo = nome.nextLine();

		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Digite o texto:\n");

		try (FileWriter fw = new FileWriter(nomeArquivo)) {

			do {
				// System.out.println("| ");
				str = br.readLine();
				if (str.compareTo("salvar") == 0)
					break;
				str = str + "\r\n";
				fw.write(str);

			} while (str.compareTo("salvar") != 0);

			System.out.println("Arquivo gravado com sucesso!");
			nome.close();
			fw.close();

		} catch (IOException exc) {
			System.out.println("IO / ERRO FATAL: " + exc);
		}

	}

}
