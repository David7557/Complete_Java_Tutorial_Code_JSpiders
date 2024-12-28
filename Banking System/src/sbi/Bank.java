package sbi;

interface Bank {
	void login(int userid, String password);
	void deposite(int amount);
	void withdraw(int amount);
	void checkBalance();

}
