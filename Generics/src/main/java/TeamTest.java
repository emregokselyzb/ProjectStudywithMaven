public class TeamTest {

    public static void main(String[] args) {
        FootballPlayer joe=new FootballPlayer("Joe ");
        BaseBallPlayer pat=new BaseBallPlayer("Pat ");
        SoccerPlayer beckham=new SoccerPlayer("Beckham ");
        SoccerPlayer zidane=new SoccerPlayer("Zidane ");

        Team<SoccerPlayer> liverpool=new Team<>("Liverpool");
        Team<FootballPlayer> galatasaray=new Team<>("Galatasaray");

        liverpool.addPlayer(zidane);
        liverpool.addPlayer(beckham);
        galatasaray.addPlayer(joe);

        System.out.println(galatasaray.numPlayers());

    }
}
