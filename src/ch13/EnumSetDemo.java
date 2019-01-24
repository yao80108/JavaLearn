package ch13;

import java.util.EnumSet;

enum FontConstant {
	Plain, Bold, Italic
}

public class EnumSetDemo {
	public static void main(String[] args) {
		EnumSet<FontConstant> enumSet = EnumSet.of(FontConstant.Plain, FontConstant.Bold);
		showEnumSet(enumSet);
		showEnumSet(EnumSet.complementOf(enumSet));

		enumSet = EnumSet.noneOf(FontConstant.class);
		enumSet.add(FontConstant.Bold);
		enumSet.add(FontConstant.Italic);

		showEnumSet(enumSet);
	}

	public static void showEnumSet(EnumSet<FontConstant> enumSet) {
		for (FontConstant constant : enumSet) {
			System.out.println(constant);
		}
		System.out.println();
	}
}
