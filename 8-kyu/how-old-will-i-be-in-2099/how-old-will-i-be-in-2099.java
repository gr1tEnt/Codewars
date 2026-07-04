public class AgeDiff {
    public static String CalculateAge(int birth, int yearTo) {
        if (yearTo > birth) {
            int age = yearTo - birth;
            return "You are " + age + " " + (age == 1 ? "year" : "years") + " old.";
        } else if (yearTo < birth) {
            int yearsUntilBirth = birth - yearTo;
            return "You will be born in " + yearsUntilBirth + " " +
                    (yearsUntilBirth == 1 ? "year" : "years") + ".";
        } else {
            return "You were born this very year!";
        }
    }
}