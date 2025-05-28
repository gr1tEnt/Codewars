public class DnaStrand {
  public static String makeComplement(String dna) {
        String[] strings = dna.split("");
        for (int i = 0; i < strings.length; i++) {
            switch (strings[i]) {
                case "A":
                    strings[i] = "T";
                    break;
                case "T":
                    strings[i] = "A";
                    break;
                case "G":
                    strings[i] = "C";
                    break;
                case "C":
                    strings[i] = "G";
                    break;
            }
        }
        return String.join("", strings);
  }
}