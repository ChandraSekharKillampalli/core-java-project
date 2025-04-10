package core;

import java.util.*;

public class PracticeFieldScheduler {

    public static void main(String[] args) {
        int[] L = {0, 3, 23};
        int[] R = {4, 8, 24};
        int m = 2; // max players allowed on field
        int duration = 2; // new player needs 2 units of time to practice

        int maxTime = Arrays.stream(R).max().getAsInt() + duration;
        int[] timeline = new int[maxTime + 2]; // +2 to avoid boundary errors

        // Build the player count over time
        for (int i = 0; i < L.length; i++) {
            timeline[L[i]] += 1;
            timeline[R[i]] -= 1;
        }

        // Convert to prefix sum to get active player count at each time
        for (int i = 1; i < timeline.length; i++) {
            timeline[i] += timeline[i - 1];
        }

        // Sliding window to find interval with ≤ (m-1) players
        for (int start = 0; start <= maxTime - duration; start++) {
            boolean canSchedule = true;
            for (int t = start; t < start + duration; t++) {
                if (timeline[t] >= m) {
                    canSchedule = false;
                    break;
                }
            }
            if (canSchedule) {
                System.out.println("New player can practice from time " + start + " to " + (start + duration));
                return;
            }
        }

        System.out.println("No suitable time slot found for the new player.");
    }
}
