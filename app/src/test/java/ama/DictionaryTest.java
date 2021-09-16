import static org.junit.Assert.*;
import org.junit.Before;
import static org.hamcrest.MatchersAssert.assertThat;
import static  org.hamcrest.Matchers.equalTo;
  public class DictionaryTest{
  	DictionaryTest d = Dictionary();

  	public void testDictionary(){
  		assertThat(d.getName(),equalTo("Example"));
  	}
  }
