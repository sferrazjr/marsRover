package com.sf9000.marsRover;

import com.sf9000.marsRover.utils.DataInputReader;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by sergio on 6/18/17.
 */
public class InputDataTest {

    final String INPUT_DATA = "inputData/inputData.txt";

    @Test
    public void inputDataTest() throws IOException {

        ClassLoader classLoader = this.getClass().getClassLoader();

        List<String> inputs = DataInputReader.read(classLoader.getResource( INPUT_DATA ).getFile());

        assertThat(inputs.get(0), is("5 5"));
        assertThat(inputs.get(1), is("1 2 N"));
        assertThat(inputs.get(2), is("LMLMLMLMM"));
        assertThat(inputs.get(3), is("3 3 E"));
        assertThat(inputs.get(4), is("MMRMMRMRRM"));

    }


}
