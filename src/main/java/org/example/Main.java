package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hey These are the splits!");
        User user1 = new User("1","Asta");
        User user2 = new User("1","Ben");
        User user3 = new User("1","Charlie");
//        Calculate Expense
        List<User> splitAmong = Arrays.asList(user1,user2,user3);
        Expense expense = new Expense("1",150,user1,splitAmong,"Equal");
//        Calculate equal Splits
        List<Double> splits = EqualSplit.calculateEqualSplits(expense.getAmount(),splitAmong.size());
//        Printing the splits
        for (int i = 0; i < splitAmong.size(); i++){
            System.out.println(splitAmong.get(i).getName() + " owes: $ "+splits.get(i));
        }
    }
}