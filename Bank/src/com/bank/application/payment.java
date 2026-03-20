package com.bank.application;

public interface payment {
	void Deposit(Double amount);
	void Withdraw(Double amount);
	void CheckBalance();
	void Viewstatement();
}
