package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {

	//Construtor: Deve criar o objeto quando os dados forem válidos
	@Test
	public void constructorShouldCreateObjWhenValidData() {
		double totalAmount = 100000.00;
		double income = 2000.0;
		int months = 80;
		
		Financing fin = new Financing(totalAmount, income, months);
		
		Assertions.assertEquals(totalAmount, fin.getTotalAmount());
		Assertions.assertEquals(income, fin.getIncome());
		Assertions.assertEquals(months, fin.getMonths());
		
	}
	
	
	// Construtor: Deve lançar IllegalArgumentException quando os dados não forem válidos
	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = new Financing(100000.0, 2000.0, 20);
		});
	}
	
	
	// setTotalAmount: Deve atualizar o valor quando os dados forem válidos
	@Test
	public void setTotalAmountShouldUpdateValueWhenValidData() {
		
		Financing fin = new Financing(100000.0, 2000.0, 80);
		double newValue = 80000.00;
		
		fin.setTotalAmount(newValue);

		Assertions.assertEquals(newValue, fin.getTotalAmount());
	}
	
	// setTotalAmount: Deve lançar IllegalArgumentException quando os dados não forem válidos
	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = new Financing(100000.0, 2000.0, 80);
			double newValue = 200000.00;
			fin.setTotalAmount(newValue);
		});
		
	}
		
		
	
	// setIncome: Deve atualizar o valor quando os dados forem válidos
	@Test
	public void setIncomeShouldUpdateValueWhenValidData() {
		
		Financing fin = new Financing(100000.0, 2000.0, 80);
		double newValue = 3000.00;
		
		fin.setIncome(newValue);

		Assertions.assertEquals(newValue, fin.getIncome());
	}
	
	// setIncome: Deve lançar IllegalArgumentException quando os dados não forem válidos
	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = new Financing(100000.0, 2000.0, 80);
			double newValue = 1500.00;
			fin.setIncome(newValue);
		});
	}
	
	
	// setMonths: Deve atualizar o valor quando os dados forem válidos
	@Test
	public void setMonthsShouldUpdateValueWhenValidData() {
		Financing fin = new Financing(100000.0, 2000.0, 80);
		int newValue = 100;
		
		fin.setMonths(newValue);
		Assertions.assertEquals(newValue, fin.getMonths());
	}
	
	// setMonths: Deve lançar IllegalArgumentException quando os dados não forem válidos
	@Test
	public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = new Financing(100000.0, 2000.0, 80);
			int newValue = 50;
			fin.setMonths(newValue);
		});
	}

	
	// entry: Deve calcular corretamente o valor da entrada
	@Test 
	public void entryShouldCalcCorrectlyEntryValue() {
		Financing fin = new Financing(100000.0, 2000.0, 80);
		double expectedValue = 20000.00;
		
		Assertions.assertEquals(expectedValue, fin.entry());
	}
	
	// quota: Deve calcular corretamente o valor da prestação
	@Test
	public void quotaShouldCalcCorrectlyValue() {
		Financing fin = new Financing(100000.0, 2000.0, 80);
		double expectedValue = 1000.00;
		
		Assertions.assertEquals(expectedValue, fin.quota());
	}

}
