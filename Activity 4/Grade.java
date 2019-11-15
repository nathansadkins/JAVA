/**This program contains methods to calculate 
*the final grade in a specific class.
*
*Nathan Adkins - COMP - 1210 - 001
*/
public class Grade {
   private double exam1, exam2, finalExam = 0;
   private double activityAvg, quizAvg, projectAvg = 0;
   private String studentName = " ";
   /**These variables represent the different exams.
   */
   public static final int EXAM_1 = 1, EXAM_2 = 2, FINAL = 3;
   /**These variables represent the exam weights.
   */
   private static final double EXAM_WEIGHT = 0.15,
       FINAL_WEIGHT = 0.30, ACT_WEIGHT = 0.05, 
       QUIZ_WEIGHT = 0.10, PROJ_WEIGHT = 0.25;
   /**This constructor assigns a string to studentName.
   *@param studentNameIn - string containing the student name
   */
   public Grade(String studentNameIn) {
      studentName = studentNameIn;
   }
   /**This method will set the lab averages.
   *@param activityAvgIn - average activity scores
   *@param quizAvgIn - average quiz scores
   */
   public void setLabAverages(double activityAvgIn, double quizAvgIn) {
      activityAvg = activityAvgIn;
      quizAvg = quizAvgIn;
   }
   /**This method will set the project average.
   *@param projectAvgIn - average project score
   */
   public void setProjectAvg(double projectAvgIn) {
      projectAvg = projectAvgIn;
   }
   /**This method will set the exam scores.
   *@param examType - this is the exam the score will be assigned to 
   *@param examScoreIn - score representing one of the exams
   */
   public void setExamScore(int examType, double examScoreIn) {
      if (examType == EXAM_1) {
         exam1 = examScoreIn;
      }
      else if (examType == EXAM_2) {
         exam2 = examScoreIn;
      }
      else if (examType == FINAL) {
         finalExam = examScoreIn;
      }
   }
   /**This method will calculate the final grade.
   *@return double - this is the final grade for the class
   */
   public double calculateGrade() {
      double grade = exam1 * EXAM_WEIGHT + exam2 * EXAM_WEIGHT
         + finalExam * FINAL_WEIGHT
         + activityAvg * ACT_WEIGHT
         + quizAvg * QUIZ_WEIGHT 
         + projectAvg * PROJ_WEIGHT;
      return grade;
   }
   /**This method displays the final grade of class along with
   *user information.
   *@return - the string with the final grade
   */
   public String toString() {
      return "Name: " + studentName + "\n"
         + "Course Grade: " + calculateGrade(); 
   }
}