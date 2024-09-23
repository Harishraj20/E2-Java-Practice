package JavaUnitTesting;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class FrequencyCounterUnitTesting {

	@Test
	public void case1() {
		String str = "Hello world";
		Map<String,Integer>expectedOutputMap = new HashMap<>();
		expectedOutputMap.put("Hello", 1);
		expectedOutputMap.put("world", 1);
		Map<String,Integer>actualOutputMap = WordFrequencyCounter.countWordFrequency(str);
		
		assertEquals(expectedOutputMap, actualOutputMap);
	}
	@Test
	public void case2() {
		String str = " ";
		Map<String,Integer>expectedOutputMap = new HashMap<>();
	
		Map<String,Integer>actualOutputMap = WordFrequencyCounter.countWordFrequency(str);
		
		assertEquals(expectedOutputMap, actualOutputMap);
	}
	@Test
	public void case3() {
		String str = "Welcome to India India ";
		Map<String,Integer>expectedOutputMap = new HashMap<>();
		expectedOutputMap.put("Welcome", 1);
		expectedOutputMap.put("to", 1);
		expectedOutputMap.put("India", 2);
		Map<String,Integer>actualOutputMap = WordFrequencyCounter.countWordFrequency(str);
		
		assertEquals(expectedOutputMap, actualOutputMap);
	}

}
