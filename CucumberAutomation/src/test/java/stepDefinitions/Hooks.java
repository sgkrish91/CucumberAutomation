package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@NetBanking")
	public void netBankingSetup() {
		System.out.println("***************************");
		System.out.println("Setup the entries in NetBanking database");
	}
	
	@After
	public void teardown() {
		System.out.println("Entries cleared");
	}
	
	@Before("@Mortgage")
	public void mortgageSetup() {
		System.out.println("************************");
		System.out.println("Setup the entries in Mortgage database");
	}

}
