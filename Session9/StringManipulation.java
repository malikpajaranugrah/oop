public class StringManipulation {
    public static void main(String[] args) {
        String kata = "NUGRAHA";
        int length = kata.length();

        // Membuat pola
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j == i)
                    System.out.print(kata.charAt(i) + " ");
                else
                    System.out.print("* ");
            }
            System.out.println();
            
        }
        System.out.println(" ");

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == j || i + j == length - 1) {
                    System.out.print(kata.charAt(i) + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    
}
