package ama;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public  class DictionaryTest {
    Dictionary dic = new Dictionary("Example");
    @Before
    public void initialize() {
        List<String> tradui = new ArrayList<>();
        tradui.add("S1");
        tradui.add("S2");
        tradui.add("s3");
        dic.addTranslation("chien",tradui);

        List<String> tradui_c = new ArrayList<>();
        tradui_c.add("chien");
        tradui_c.add("chien2");
        tradui_c.add("chien3");
        dic.addTranslation("chien",tradui_c);
    }




    @Test
    public void testDictionaryName() {
        assertThat(dic.getName(), equalTo("Example"));
    }

    @Test
    public void testDictionaryIsEmpty() {
        assertThat(dic.isEmpty(), equalTo("false"));


    }
}


