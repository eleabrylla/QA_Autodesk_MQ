**Attendance Award Eligibility Checker**

This program assesses a student's attendance record eligibility for an award based on predefined criteria.

**Functionality:**

- Prompts the user to enter a student's attendance record.
- Determines if the student meets both criteria for award eligibility.
- Provides feedback to the user indicating eligibility or ineligibility.
- Analyzes the record for:
  - Valid characters: 'A' (absent), 'L' (late), or 'P' (present).
  - Absence limit: No more than two absences ('A') total.
  - Lateness limit: No three consecutive late marks ('LLL').

**Assumptions:**

- The program is not case-sensitive (uppercase and lowercase letters are treated the same).
- There is no limit on the length of the attendance record.
- The user enters a single record at a time.
- Invalid characters in the record will terminate the program.

**Usage:**

- Compile the Java code (if necessary).
- Run the program.
- Enter the student's attendance record when prompted.
- The program will analyze the record and display a message indicating whether the student is eligible for the award.

**Examples:**

_Eligible:_
- ApLpP (One absence, one late, rest present)
- pplaaaa (Less than two absences, even if consecutive)
- lPlplPl (Multiple lates, but not consecutive)

_Ineligible:_
- 123 (Contains invalid characters)
- lll (Three consecutive lates)
- aaaaa (More than two absences)
- alllllllll (More than two consecutive lates)
