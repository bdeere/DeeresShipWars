package eecs285.proj4;

public class UserNameError extends Exception {
	public UserNameError()
	{
		super("Username already exists! Please enter a different one");
	}
}
