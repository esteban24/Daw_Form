package es.sidelab.holamundo;


import org.springframework.stereotype.Component;

@Component
public class UsersService {
	
	private int numUsers;
	
	public UsersService(){
		this.numUsers = 5;
	}
	
	public UsersService(int numUsers){ 
		this.numUsers = numUsers;
	}
	
	public int getNumUsers(){
	      return numUsers;
	}

}
