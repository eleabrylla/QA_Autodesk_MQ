import java.util.Scanner;
/**
 * This program assesses a student's attendance record eligibility for an award based on predefined criteria.
 * The record should only contain characters 'A' (absent), 'L' (late), or 'P' (present).
 * Assumptions:
 * - The program is not case-sensitive.
 * - The attendance record has no character limitation.
 * - The user can only enter one record each time.
 * - The program ends if the user enters an invalid character.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = scanner.nextLine().toLowerCase();  // Convert to lowercase to make it not case-sensitive

        if (isValidAttendanceRecord(s)) {
            System.out.println("True: Congratulations! The student is eligible for an attendance award");
        }
    }

    /**
     Determines if a given attendance record string meets the criteria for an award.
     This function checks the following:
      - The record only contains characters 'a' (absent), 'l' (late), or 'p' (present).
      - The record does not have three consecutive 'l' characters (indicating 3+ consecutive late).
      - The record does not have more than two 'a' characters (indicating more than 2 absences).
      @param record The student's attendance record string.
      @return True if the record is valid for the award, false otherwise.
     */
    public static boolean isValidAttendanceRecord(String record) {
        if (!record.matches("[alp]+")) { //[alp]+ means the string must contain one or more characters from the set 'a', 'l', or 'p'
            System.out.println("This string has invalid characters");
            return false;
        }
        return !hasThreeConsecutiveLate(record) && !hasMoreThanTwoTotalAbsences(record);
        /*
        The function returns true only if both these conditions are met:
        - The student is not late three or more days consecutively.
        - The student is not absent for more than two days total.
        */
    }

    /**
     Checks if the attendance record string contains three consecutive 'l' characters.
     @param record The student's attendance record string.
     @return True if the record has three consecutive 'l's, false otherwise.
     */
    public static boolean hasThreeConsecutiveLate(String record) {
        if(record.contains("lll")){
            System.out.println("False: The student is NO eligible for an attendance award");
            return true;
        }
        return false;
    }

    /**
     Checks if the attendance record string contains more than two 'a' characters.
     @param record The student's attendance record string.
     @return True if the record has more than two 'a's, false otherwise.
     */
    public static boolean hasMoreThanTwoTotalAbsences(String record) {
        int absenceCount = 0;
        for (char c : record.toCharArray()) {
            if (c == 'a') {
                absenceCount++;
                if (absenceCount >= 2) {
                    System.out.println("False: The student is NO eligible for an attendance award");
                    return true;
                }
            }
        }
        return false;
    }
}
