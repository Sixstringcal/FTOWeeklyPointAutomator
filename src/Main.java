import java.util.*;

public class Main {
    public static HashMap<String, Competitor> competitors;

    public static void main(String[] args) {
        competitors = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the results for the round as described in README.md");
        String input = scanner.nextLine();
        while (!input.equals("done with results")) {
            int roundNumber = Integer.parseInt(input);
            input = scanner.nextLine();
            int position = 1;
            while (!input.equals("end of round")) {
                String[] competitorInfo = input.split(",");
                Competitor competitor;
                if (competitors.containsKey(competitorInfo[0])) {
                    competitor = competitors.get(competitorInfo[0]);
                    if (roundNumber == 1) {
                        competitor.addNextWeekFirstRound(Double.parseDouble(competitorInfo[1]), position);
                    } else {
                        competitor.addNextWeekSecondRound(Double.parseDouble(competitorInfo[1]), position);
                    }
                } else {
                    competitor = new Competitor(competitorInfo[0], Double.parseDouble(competitorInfo[1]), position);
                }
                competitors.put(competitorInfo[0], competitor);
                input = scanner.nextLine();
                position++;
            }
            input = scanner.nextLine();
        }
        System.out.println("Here are the points results");
        LinkedList<Competitor> scoredCompetitors = new LinkedList<>();
        for (Competitor temp : competitors.values()) {
            temp.getAndTallyPoints();
            scoredCompetitors.add(temp);
        }
        Collections.sort(scoredCompetitors, (o2, o1) -> o1.getPoints() - o2.getPoints());
        for(Competitor temp : scoredCompetitors){
            System.out.println(temp.getName() + "\t" + temp.getPoints());
        }
    }
}
