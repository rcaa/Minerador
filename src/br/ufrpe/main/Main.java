package br.ufrpe.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String temp = "/Users/rodrigoandrade/Documents/workspaces/ufrpe"
				+ "/administrativo/Minerador/files/Analise.txt";
		File file = new File(temp);
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String nextLine = scanner.nextLine();
				if (nextLine.contains("***")) {
					while (scanner.hasNextLine()) {
						String line = scanner.nextLine();
						String[] dados = line.split(" ");
						if (dados.length == 0) {
							break;
						}
						if (line.startsWith("@")) {
							String statsLine = scanner.nextLine();
							String[] dadosPeriodo = statsLine.split(" ");
							String aprovacoes = dadosPeriodo[0];
							String reprovacoesNota = dadosPeriodo[1];
							String reprovacoesFalta = dadosPeriodo[2];
							String trancamento = dadosPeriodo[3];
							String dp = dadosPeriodo[4];
							String tipoObrig = dadosPeriodo[5];
							String tipoOpta = dadosPeriodo[6];
							String tipoEletiva = dadosPeriodo[7];
							String tipoIsolada = dadosPeriodo[8];
							if (dadosPeriodo.length == 10) {
								String mediaGeral = dadosPeriodo[9];
							}
						} else if (!line.startsWith("#") && !line.isEmpty()) {
							if (dados.length > 1) {
								String cpf = dados[0];
								String nomeEstudante = "";
								int i = 1;
								while (i < (dados.length - 4)) {
									nomeEstudante += dados[i] + " ";
									i++;
								}
								String sexo = nomeEstudante.substring(
										nomeEstudante.length() - 2,
										nomeEstudante.length());
								nomeEstudante = nomeEstudante.substring(0,
										nomeEstudante.length() - 2);
								String tipoIngresso = dados[i];
								String periodoIngresso = dados[i + 1];
								String turno = dados[i + 2];
								String argmClassf = dados[i + 3];

							} else {
								String mediaPeriodo = dados[0];
							}
						} else {
							if (dados.length == 8) {
								String periodo = dados[1];
								String codigoDisciplina = dados[2];
								String nomeDisciplina = dados[3];
								String tipoDisciplina = dados[4];
								String cargaHoraria = dados[5];
								String creditos = dados[6];
								String situacaoConceito = dados[7];
							} else if (dados.length == 9) {
								String periodo = dados[1];
								String codigoDisciplina = dados[2];
								String nomeDisciplina = dados[3];
								String tipoDisciplina = dados[4];
								String cargaHoraria = dados[5];
								String creditos = dados[6];
								String nota = dados[7];
								String situacaoConceito = dados[8];
							}
						}
					}
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}
