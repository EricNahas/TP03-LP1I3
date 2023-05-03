import java.util.Scanner;

/**
* TRABALHO PRATICO 03: Construir a classe Hora, conforme especificacao abaixo, este exercicio compora a avaliacao final, portanto sera obrigatoria sua elaboracao para a prova final.
*
* ERIC NAHAS - CB3020096
* ARMANDO SOUZA - CB302038X
*
*/

class Teste {
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);

		Hora horario = new Hora();
		System.out.println("APRESENTANDO O CONSTRUTOR SEM PARÂMETROS");
		System.out.println();
		System.out.println("Neste horário, há " + horario.getSegundos() + " segundos.");
		System.out.println();
		System.out.println(horario.getHora1());
		System.out.println();
		System.out.println(horario.getHora2());
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println();

		System.out.println("APRESENTANDO O CONSTRUTOR COM PARÂMETROS");
		System.out.println();
		Hora horario1 = new Hora(1, 2, 3);

		horario1.setHora();
		horario1.setMinuto();
		horario1.setSegundo();
		
		System.out.println();

		System.out.println("getHora() = " + horario1.getHora());
		System.out.println("getMinuto() = " + horario1.getMinuto());
		System.out.println("getSegundo() = " + horario1.getSegundo());
		

}}