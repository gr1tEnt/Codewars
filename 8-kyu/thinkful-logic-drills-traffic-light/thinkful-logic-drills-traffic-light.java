public class TrafficLights {
​
    public static String updateLight(String current) {
        return switch (current) {
            case "red" -> "green";
            case "green" -> "yellow";
            case "yellow" -> "red";
            default -> null;
        };
    }
  
}