package ru.job4j.tracker.input;

import ru.job4j.tracker.output.*;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ValidateInputTest {

    @Test
    void whenInvalidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenValidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"2"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(2);
    }

    @Test
    void whenValidInputManyTimes() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"1", "2", "4"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
        int selected2time = input.askInt("Enter menu:");
        assertThat(selected2time).isEqualTo(2);
        int selected3time = input.askInt("Enter menu:");
        assertThat(selected3time).isEqualTo(4);
    }

    @Test
    void whenValidInputNegative() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"-5"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(-5);
    }
}