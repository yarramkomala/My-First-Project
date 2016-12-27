package com.niit.uaerDao;

public class UserDao {
	public boolean isValidCredentials(String email,String pwd){
		if(email.equals("komali@gmail.com")&& pwd.equals("abc12")){
			
			return true;
		
			
		}
		return false;

}
}
