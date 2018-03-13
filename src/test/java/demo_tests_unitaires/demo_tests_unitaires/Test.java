package demo_tests_unitaires.demo_tests_unitaires;

import javax.management.RuntimeErrorException;

import dev.utils.StringUtils;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = StringUtils.levenshteinDistance("chien", "chine");
		if (result != 2) {
			throw new RuntimeException("La distance doit etre de 2 pour le test");
		}

		
		int result1 = StringUtils.levenshteinDistance("chat", "chats");
		if(result1 != 1 )
		
		{
			
			throw new RuntimeException("La distance doit etre de 1 pour le test ");
		}
		
		
		int result2 = StringUtils.levenshteinDistance("Machins", "Machine");
		if(result2 != 1 )
		
		{
			
			throw new RuntimeException("La distance doit etre de 1 pour le test ");
		}
	}
}

