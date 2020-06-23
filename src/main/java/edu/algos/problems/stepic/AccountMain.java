package edu.algos.problems.stepic;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AccountMain {

  public static void main(String[] args) {
    List<Account> accounts = new ArrayList<>();
    List<Account> nonEmptyAccounts = filter(accounts, p -> p.balance > 0); // write your code here
    List<Account> accountsWithTooMuchMoney = filter(accounts, p -> p.getBalance() >= 100000000 && !p.isLocked()); // write your code here
  }

  public static <T> List<T> filter(List<T> inputList, Predicate<T> condition) {
    return inputList.stream().filter(condition).collect(Collectors.toList());
  }

  public static class Account {
    private String number;
    private Long balance;
    private boolean isLocked;

    public String getNumber() {
      return number;
    }

    public void setNumber(String number) {
      this.number = number;
    }

    public Long getBalance() {
      return balance;
    }

    public void setBalance(Long balance) {
      this.balance = balance;
    }

    public boolean isLocked() {
      return isLocked;
    }

    public void setLocked(boolean locked) {
      isLocked = locked;
    }

  }
}
