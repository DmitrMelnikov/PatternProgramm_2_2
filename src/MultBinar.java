public class MultBinar {
    public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, умножте и переведите
      обратно в двоичную запись*/
        int result = Integer.parseInt(a, 2) * Integer.parseInt(b, 2);
        return Integer.toBinaryString(result);
    }
}
