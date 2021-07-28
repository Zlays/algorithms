package it.zlays.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestCase< O, I > {
	
	protected O expected;
	protected I input;
	
}
