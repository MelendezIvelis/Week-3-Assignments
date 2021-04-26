package week3;

import acm.program.ConsoleProgram;

public class DeleteCharactersFromString extends ConsoleProgram {

	public void run() {

		String x = "Charlie and the Chocolate Factory ";
		int size = x.length();
		char key = 'h';

		int i = 0;
		String res = "";
		while (i != size) {
			if (x.charAt(i) != key) {
				res = res + x.charAt(i);
			}
			++i;
		}
		System.out.println(res);

	}

}
