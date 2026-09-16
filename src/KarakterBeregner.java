public class KarakterBeregner {
    int assignmentPoints = 0;
    int examPoints = 0;
    int projectPoints = 0;

    public int addAssignmentPoints(int points) {
       return assignmentPoints += points;
    }

    public int addExamPoints(int points) {
        return examPoints += points;
    }

    public int addProjectPoints(int points) {
        return projectPoints += points;
    }

    public void printTotal() {
        System.out.println("Total points: " + (assignmentPoints + examPoints + projectPoints));
    }

    public void main() {
        addAssignmentPoints(25);
        addExamPoints(40);
        addProjectPoints(30);
        printTotal();
    }
}
