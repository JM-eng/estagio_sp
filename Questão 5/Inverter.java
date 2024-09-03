public class Main
{
	public static void main(String[] args) {
        String input = "String de teste", output = "";
        
        char[] caracteres = input.toCharArray();

        for (int i = caracteres.length - 1; i >= 0; i--) {
            output += caracteres[i];
        }

        System.out.println("String original: " + input);
        System.out.println("String invertida: " + output);
    }

}
