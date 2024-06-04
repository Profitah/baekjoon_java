import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        int bitSet = 0;
        int commandsCount = Integer.parseInt(reader.readLine());

        while (commandsCount-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            String command = tokenizer.nextToken();
            int number = 0;
            if (tokenizer.hasMoreTokens()) {
                number = Integer.parseInt(tokenizer.nextToken());
            }

            switch (command) {
                case "add":
                    bitSet |= (1 << number);
                    break;
                case "remove":
                    bitSet &= ~(1 << number);
                    break;
                case "check":
                    output.append((bitSet & (1 << number)) != 0 ? 1 : 0).append("\n");
                    break;
                case "toggle":
                    bitSet ^= (1 << number);
                    break;
                case "all":
                    bitSet = (1 << 21) - 1;
                    break;
                case "empty":
                    bitSet = 0;
                    break;
            }
        }
        System.out.print(output);
    }
}
