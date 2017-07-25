/**
 * Created by smita on 7/14/17.
 *
 * consider sports class with methods - getName(display generic sports) and getNumberOfTeamMembers(Display numbers of players in game)
 * Create a sports class which override the methods of sports class to display customize information as per soccer.
 *
 */
public class Overriding1 {
    public static void  main(String[] args){
        Sports sports = new Sports();
        sports.getNumberOfTeamMembers();

        Soccer soccer = new Soccer();
        soccer.getNumberOfTeamMembers();
    }
}

class Sports{
    String getName(){
        return "Generic Sports";
    }

    void getNumberOfTeamMembers(){
        System.out.println("Each team has n players in " + getName());
    }
}

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Sport";
    }

    @Override
    void getNumberOfTeamMembers(){
        System.out.println("Each team has 11 players in " + getName());
    }
}