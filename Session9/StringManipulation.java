public class StringManipulation {
    public static void main(String[] args) {
        String kata = "NUGRAHA";
        int length = kata.length();

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

        int lebar = panjang;

        for (int i = 0; i < lebar; i++) {
            for (int j = 0; j < lebar; j++) {
                if (i == lebar / 2 && j >= (lebar - panjang) / 2 && j < (lebar + panjang) / 2) {
                    System.out.print(nama.charAt(j - (lebar - panjang) / 2) + " ");
                } else if (j == lebar / 2 && i >= (lebar - panjang) / 2 && i < (lebar + panjang) / 2) {
                    System.out.print(nama.charAt(i - (lebar - panjang) / 2) + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }
    
}
