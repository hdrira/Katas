public class FooBarQix {
	
	public static void main(String[] args){
		
		 String foo = "Foo";
		 String bar = "Bar";
		 String qix = "Qix";
		 String space = " ";
		
		for(Integer number = 1 ; number<=100;number++){
			StringBuffer affichage = new StringBuffer("");
			
			//Test Division by Three
			int testNumber = number.intValue();
			while(testNumber % 3 == 0){
				testNumber = testNumber / 3;
				affichage.append(foo);
			}
			//Test Division by Five
			testNumber = number.intValue();
			while(testNumber % 5 == 0){
				testNumber = testNumber / 5;
				affichage.append(bar);
			}
			
			//Test Division by Five
			testNumber = number.intValue();
			while(testNumber % 7 == 0){
				testNumber = testNumber / 7;
				affichage.append(qix);
			}
			
			//Test content 
			for (char ch: number.toString().toCharArray()) {
				if (ch == '3'){
					affichage.append(foo);
				}else if (ch == '5'){
					affichage.append(bar);
				}else if(ch == '7'){
					affichage.append(qix);
				}
			}
			
			if(affichage.length() == 0){
				affichage.append(number);
			}
			affichage.append(space);
			System.out.print(affichage);
		}
		
	}

}
