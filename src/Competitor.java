import java.util.LinkedList;

public class Competitor {
    private String name;
    private LinkedList<Double> firstRoundResults;
    private LinkedList<Integer> positions;
    private LinkedList<Double> secondRoundResults;

    public Competitor(String name) {
        this.name = name;
        secondRoundResults = new LinkedList<>();
        firstRoundResults = new LinkedList<>();
        positions = new LinkedList<>();
    }

    public Competitor(String name, double average, int position) {
        this.name = name;
        secondRoundResults = new LinkedList<>();
        firstRoundResults = new LinkedList<>();
        positions = new LinkedList<>();
        addNextWeekFirstRound(average, position);
    }

    public void addNextWeekFirstRound(double average, int position) {
        firstRoundResults.addLast(average);
        positions.add(position);
    }

    public void addNextWeekSecondRound(double average, int position) {
        secondRoundResults.addLast(firstRoundResults.getLast());
        secondRoundResults.addLast(average);
        positions.add(position);
    }

    public int getPoints() {
        int points = 0;
        for (int temp : positions) {
            if (temp == 1) {
                points += 4;
            } else if (temp == 2) {
                points += 2;
            } else if (temp == 3) {
                points++;
            }
        }

        double previous = 0;
        for(double temp : firstRoundResults){
            if(temp < previous){
                points++;
            }
            previous = temp;
        }

        for(int i = 1; i < secondRoundResults.size(); i += 2){
            if(secondRoundResults.get(i) < secondRoundResults.get(i - 1)){
                points++;
            }
        }

        return points;
    }

    public String getName() {
        return name;
    }

}
