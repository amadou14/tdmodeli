package ama;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public  class DictionaryTest {
    Dictionary dic = new Dictionary("Example");
    public void testDictionaryName() {
        assertThat(dic.getName() ,equalTo("Example"));
    }
    public void testDictionaryIsEmpy() {
        assertThat(dic.isEmpty() ,equalTo("Example"));
    }




}


