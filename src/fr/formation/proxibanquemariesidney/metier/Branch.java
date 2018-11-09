package fr.formation.proxibanquemariesidney.metier;

import java.util.ArrayList;
import java.util.List;

public class Branch {
	
	public String idNum;
	public String creationDate;
	public List<Advisor> advisorList;
	public Manager manager;
	
	public Branch(String idNum, String creationDate) {
		this.idNum = idNum;
		this.creationDate = creationDate;
		this.manager = new Manager();
		this.advisorList = new ArrayList<>();
	}
	
}