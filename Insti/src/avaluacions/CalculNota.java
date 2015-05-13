package avaluacions;

import java.text.DecimalFormat;

public class CalculNota {
	public static int calculaNota(String modul, String uf, int notes[]) {
		double lanota = 0.0;
		int lanotaint = 0;
		DecimalFormat df = new DecimalFormat("##");
		if (modul == "M5") {
			for (int i = 0; i < notes.length; i++) {
				int notaminima = 3;
				if (notes[i] < notaminima)
					lanotaint = -3; // alguna nota és menor que 3
			}
			if (lanotaint == 0) {
				if (uf == "UF1") {
					if (notes.length < 6)
						lanotaint = -4; // falten notes
					else {
						lanota = notes[0] * 0.05 + notes[1] * 0.05 + notes[2]
								* 0.05 + notes[3] * 0.05 + notes[4] * 0.3
								+ notes[5] * 0.5;
						lanotaint = Integer.parseInt(df.format(lanota));
					}
				} else if (uf == "UF2") {
					if (notes.length < 6)
						lanotaint = -4; // falten notes
					else {
						lanota = notes[0] * 0.1 + notes[1] * 0.05 + notes[2]
								* 0.05 + notes[3] * 0.2 + notes[4] * 0.2
								+ notes[5] * 0.4;
						lanotaint = Integer.parseInt(df.format(lanota));
					}
				} else if (uf == "UF3") {
					if (notes.length < 5)
						lanotaint = -4; // falten notes
					else {
						lanotaint = notaM5UF3(notes, df);
					}
				} else
					lanotaint = -2; // uf diferent de UF1, UF2 o UF3
			}
		} else
			lanotaint = -1; // mòdul no és M5
		return lanotaint;
	}

	private static int notaM5UF3(int[] notes, DecimalFormat df) {
		double lanota;
		int lanotaint;
		lanota = notes[0] * 0.1 + notes[1] * 0.1 + notes[2]
				* 0.2 + notes[3] * 0.2 + notes[4] * 0.4;
		lanotaint = Integer.parseInt(df.format(lanota));
		return lanotaint;
	}
}
