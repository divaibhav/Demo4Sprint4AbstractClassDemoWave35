public class Manager extends Employee{
    private int teamSize;
    private int teamRating;

    public Manager(String name, int empCode, String dob, int age, double salary, int teamSize, int teamRating) {
        super(name, empCode, dob, age, salary);
        this.teamSize = teamSize;
        this.teamRating = teamRating;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getTeamRating() {
        return teamRating;
    }

    public void setTeamRating(int teamRating) {
        this.teamRating = teamRating;
    }
    public double calculateIncrement(float payHike){
        if(teamRating > 8){
            return (getSalary() * payHike) / 100;
        }
        return 0;
    }
}
