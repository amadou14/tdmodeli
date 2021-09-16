import static org.junit.Assert.*;
import org.junit.Before;
import static org.hamcrest.MatchersAssert.assertThat;
import static  org.hamcrest.Matchers.equalTo;
  public class DictionaryTest{
  	DictionaryTest d = Dictionary();
	  public void testDictionary(){
		  assertThat(d.getName(),equalTo("Example"));
  	}	
  	
  	public void testIsEmpty(){
  		assertThat(d.isEmpty(),equalTo(true));
  		}
  		@Test public void testOneTranslation() {
                d.addTranslation("contre", "against");
                assertThat(d.getTranslation("contre"), equalsTo("against"));
        }




  }
