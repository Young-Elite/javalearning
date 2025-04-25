import java.util.Random;

public class StudentExamData {

    public static void main(String[] args) {
        String[] genders = {"Male", "Female"};
        String[] locations = {"Urban", "Rural"};
        String[] classes = {"SS1", "SS2", "SS3"};
        String[] schoolTypes = {"Public", "Private"};

        Random random = new Random();

        System.out.println("A1\tA2\tA3\tA4\tB1\tB2\tB3\tB4\tB5\tB6\tB7\tB8\tB9\tB10\tB_Total");

        for (int i = 0; i < 50; i++) {
            String A1 = genders[random.nextInt(genders.length)];
            String A2 = locations[random.nextInt(locations.length)];
            String A3 = classes[random.nextInt(classes.length)];
            String A4 = schoolTypes[random.nextInt(schoolTypes.length)];

            int[] B = new int[10];
            int B_Total = 0;

            for (int j = 0; j < B.length; j++) {
                B[j] = random.nextInt(5) + 1; // 1 to 5
                B_Total += B[j];
            }

            // Print the line
            System.out.print(A1 + "\t" + A2 + "\t" + A3 + "\t" + A4 + "\t");
            for (int score : B) {
                System.out.print(score + "\t");
            }
            System.out.println(B_Total);
        }
    }
}
 
