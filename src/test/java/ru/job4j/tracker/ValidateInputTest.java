package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertThrows;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"5", "2", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected00 = input.askInt("Enter menu:");
        assertThat(selected00, is(5));
        int selected01 = input.askInt("Enter menu:");
        assertThat(selected01, is(2));
        int selected02 = input.askInt("Enter menu:");
        assertThat(selected02, is(1));
    }

    @Test
    public void whenInvalidInputTwo() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"-1", "5"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(-1));
    }
}