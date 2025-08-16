import java.util.Scanner;

public class VotingSystem {
    static Scanner input = new Scanner(System.in);
    static int population;
    static String[] candidateNames;
    static int[] voteCounts;
    static String[] votedNames;

    // Step 1: Accept number of candidates and their names
    public static String[] candidateSetup() {
        System.out.print("Enter number of candidates: ");
        int numberOfCandidates = input.nextInt();
        input.nextLine(); // consume newline

        candidateNames = new String[numberOfCandidates];
        voteCounts = new int[numberOfCandidates];

        System.out.println("Enter candidate names:");
        for (int i = 0; i < numberOfCandidates; i++) {
            System.out.print("Candidate " + (i + 1) + ": ");
            candidateNames[i] = input.nextLine();
        }

        // Proceed to voter verification and voting
        return verifyAgeAndVote();
    }

    // Step 2: Verify voter's age
    public static boolean verifyAge() {
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine(); // consume newline

        if (age >= 18) {
            return true;
        } else {
            System.out.println("You are underage and not eligible to vote.\nYou have "+(18-age)+" years to vote.");
            return false;
        }
    }

    // Step 3: Check if person has already voted
    public static boolean hasAlreadyVoted(String name) {
        for (String voted : votedNames) {
            if (voted != null && voted.equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    // Step 4: Voting logic
    public static void votingProcess(String name) {
        System.out.println("\n" + name + ", cast your vote by entering the number next to the candidate name:");
        for (int i = 0; i < candidateNames.length; i++) {
            System.out.println((i + 1) + ". " + candidateNames[i]);
        }

        System.out.print("Your vote: ");
        int vote = input.nextInt();
        input.nextLine(); // consume newline

        if (vote >= 1 && vote <= candidateNames.length) {
            voteCounts[vote - 1]++;
            System.out.println("Thank you, " + name + ". Your vote has been recorded.\n");
        } else {
            System.out.println("Invalid choice. Vote not recorded.\n");
        }
    }

    // Step 5: Loop through voters and handle age and repeat checks
    public static String[] verifyAgeAndVote() {
        System.out.print("\nEnter the number of people in your city eligible to vote: ");
        population = input.nextInt();
        input.nextLine(); // consume newline

        votedNames = new String[population];
        int validVoters = 0;

        System.out.println("\n--- Voting Begins ---");
        while (validVoters < population) {
            System.out.print("\nEnter your name: ");
            String name = input.nextLine().toLowerCase();

            if (hasAlreadyVoted(name)) {
                System.out.println("You have already voted.");
                continue;
            }

            if (!verifyAge()) {
                continue;
            }

            votedNames[validVoters] = name;
            votingProcess(name);
            validVoters++;
        }

        return checkResults(); // return result board
    }

    // Step 6: Evaluate votes and determine winner or tie
    public static String[] checkResults() {
        int maxVotes = 0;
        for (int count : voteCounts) {
            if (count > maxVotes) {
                maxVotes = count;
            }
        }

        int winnerCount = 0;
        for (int count : voteCounts) {
            if (count == maxVotes) {
                winnerCount++;
            }
        }

        boolean tie = winnerCount > 1;

        String[] resultBoard = new String[candidateNames.length];
        for (int i = 0; i < candidateNames.length; i++) {
            String status;
            if (voteCounts[i] == maxVotes) {
                status = tie ? "TIED" : "WINNER";
            } else {
                status = "LOST";
            }

            resultBoard[i] = String.format("%-20s %-10d %-10s", candidateNames[i], voteCounts[i], status);
        }

        return resultBoard;
    }

    // Step 7: Main function with sequence of calls
    public static void main(String[] args) {
        String[] finalResultBoard = candidateSetup();

        System.out.println("\n===== FINAL RESULTS =====");
        System.out.printf("%-20s %-10s %-10s\n", "Candidate", "Votes", "Status");
        System.out.println("-------------------------------------------");

        for (int i = 0; i < finalResultBoard.length; i++) {
            System.out.println(finalResultBoard[i]);
        }
    }
}
