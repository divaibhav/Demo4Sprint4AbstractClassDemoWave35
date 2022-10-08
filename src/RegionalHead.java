public class RegionalHead extends Employee{
    private String regionName;
    private int reviewRating;
    private int regionPerformance;

    public RegionalHead(String name, int empCode, String dob, int age, double salary, String regionName, int reviewRating, int regionPerformance) {
        super(name, empCode, dob, age, salary);
        this.regionName = regionName;
        this.reviewRating = reviewRating;
        this.regionPerformance = regionPerformance;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public int getReviewRating() {
        return reviewRating;
    }

    public void setReviewRating(int reviewRating) {
        this.reviewRating = reviewRating;
    }

    public int getRegionPerformance() {
        return regionPerformance;
    }

    public void setRegionPerformance(int regionPerformance) {
        this.regionPerformance = regionPerformance;
    }
    public double calculateIncrement(float payHike){
        if(reviewRating > 7 && regionPerformance > 8){
            return (getSalary() * payHike) / 100;
        }
        return 0;
    }
}
