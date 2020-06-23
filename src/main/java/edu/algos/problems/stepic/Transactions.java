package edu.algos.problems.stepic;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Transactions {
  public static void main(String[] args) {
    List<Transaction> transactions = asList(new Transaction(), new Transaction(), new Transaction());

    // Write a collector that calculates the total sum of transactions
    // (long type, not integer) by each account (i.e. by account number).
    // The collector will be applied to a stream of transactions.


    final HashMap<String, Long> collect = transactions.stream().collect(Collectors.groupingBy(
        t -> t.getAccount().getNumber(),
        HashMap::new,
        Collectors.summingLong(Transaction::getSum)
    ));

  }

  public static class Account {
    String number;
    Long balance;

    public String getNumber() {
      return number;
    }

    public void setNumber(String number) {
      this.number = number;
    }
  }

  public static class Transaction {
    String uuid;
    Long sum;
    Account account;

    public String getUuid() {
      return uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }

    public Long getSum() {
      return sum;
    }

    public void setSum(Long sum) {
      this.sum = sum;
    }

    public Account getAccount() {
      return account;
    }

    public void setAccount(Account account) {
      this.account = account;
    }
  }
}
