package com.yotilla.bilbao.demos.string;

public class Printer {

    public static void main(String[] args) {
        final String string = "This is a string\nWith multiple lines\nIncredible!";

        print(string);
        print(string.indent(2));
        final String veryIndentedString = string.indent(4);
        print(veryIndentedString);
        print(veryIndentedString.indent(-10));

        print("\n\nTransform\n");

        print(string.transform(Printer::reverse));

        print("\n\nTextBlock\n");

        final String textBlock = """
                    This is a text block
                    With indented lines
                Incred\
                ible!
                """;

        print(textBlock);
        final String indentedBlock = textBlock.indent(4);
        print(indentedBlock);
        print(textBlock.stripIndent());
    }

    private static String reverse(final String s) {
        return new StringBuilder(s).reverse().toString();
    }

    private static void print(final String string) {
        System.out.print(string);
    }
}
