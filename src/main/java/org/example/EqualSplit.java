package org.example;

import java.util.ArrayList;
import java.util.List;

public class EqualSplit {
    public static List<Double> calculateEqualSplits(double amount, int numParticipants){
        double splitAmount = amount / numParticipants;
        List<Double> splits = new ArrayList<>();
        for(int i = 0; i < numParticipants; i++){
            splits.add(splitAmount);
        }
        return splits;
    }
}
