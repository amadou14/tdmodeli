import static org.junit.Assert.*;
import org.junit.Before;
import static org.hamcrest.MatchersAssert.assertThat;
import static  org.hamcrest.Matchers.equalTo;
  public class DictionaryTest{
  	DictionaryTest d = Dictionary();

  	@Test  public void testDictionary(){
  	}	assertThat(d.getName(),equalTo("Example"));
  	
  	@Test public void testIsEmpty(){
  		assertThat(d.isEmpty(),equalTo(true));
  		}



  }
