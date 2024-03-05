public class questaocinco {

    public static void main(String[] args) {
        String stringOriginal = "hello";
        String stringInvertida = inverterString(stringOriginal);
        System.out.println("A string invertida de '" + stringOriginal + "' é '" + stringInvertida + "'.");
    }

    public static String inverterString(String str) {
        StringBuilder novaString = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            novaString.append(str.charAt(i));
        }
        return novaString.toString();
    }
}