import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    // A = 0, B = 1, ..., H = 7
    public static char[][] cube = { { 'B', 'D', 'E' }, // A
            { 'A', 'C', 'F' }, // B
            { 'B', 'D', 'G' }, // C
            { 'A', 'C', 'H' }, // D
            { 'A', 'F', 'H' }, // E
            { 'B', 'E', 'G' }, // F
            { 'C', 'F', 'H' }, // G
            { 'D', 'E', 'G' }, // H
    };

    public static Random rand = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            run(rand.nextInt(100_000));
    }

    public static void run(int run_times) {
        double sum = 0;
        for (int i = 0; i < run_times; i++) {
            var res = one_run();
            // print(one_run());
            sum += res.size() - 1;
        }
        System.out.printf("Run %d times and the average is %.2f.\n", run_times, sum / run_times);

    }

    public static ArrayList<Character> one_run() {
        var steps = new ArrayList<Character>();
        char bug_pos = 'A';
        steps.add(bug_pos);
        do {
            bug_pos = cube[bug_pos - 65][rand.nextInt(3)];
            steps.add(bug_pos);
        } while (bug_pos != 'G');
        return steps;
    }

    public static void print(ArrayList<Character> steps) {
        System.out.print(steps.size() + ": ");
        System.out.println(Arrays.toString(steps.toArray()).replace(", ", " -> "));
    }

}
