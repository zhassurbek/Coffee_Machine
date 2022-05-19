import org.hyperskill.hstest.stage.StageTest;
import org.hyperskill.hstest.testcase.CheckResult;
import org.hyperskill.hstest.testcase.TestCase;

import java.util.List;


public class CoffeeMachineTest extends StageTest<String> {

    @Override
    public List<TestCase<String>> generate() {
        return List.of(
            new TestCase<String>()
                .setInput("25")
                .setAttach("25"),

            new TestCase<String>()
                .setInput("125")
                .setAttach("125"),

            new TestCase<String>()
                .setInput("1")
                .setAttach("1"),

            new TestCase<String>()
                .setInput("123")
                .setAttach("123")
        );
    }

    @Override
    public CheckResult check(String reply, String clue) {
        String[] lines = reply.split("\\n");
        if (lines.length < 3) {
            return new CheckResult(false,
                "Output contains less than 3 lines, but should output at least 3 lines");
        }
        