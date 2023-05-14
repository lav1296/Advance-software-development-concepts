public class SpawnShieldCommand extends Command{

    public SpawnShieldCommand(Object receiver, String[] args)
    {
        super(receiver, args);
    }
    @Override
    public void Execute() {

        Square square = (Square) receiver;
        // The args for SpawnShieldCommand are the X,Y coordinate for the shield
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        //getting GameBoard Instance
        GameBoard gameBoard=GameBoard.Instance();
        IAsteroidGameFactory factory = gameBoard.GetFactory();
        System.out.println("Spawning shield at (" + x + "," + y + ")");
        //decorating square with shield decorator
        Shield shield=new Shield(square,x,y);
        //removing square from the board
        GameBoard.Instance().GetBoard().get(y).remove(x);
        //replacing the square with shield
        GameBoard.Instance().GetBoard().get(y).add(x,shield);
        //attaching the shield to the subject
        square.AsteroidImpacts.attach(shield);
        //detaching all building, so they do not get impacted by asteroids as shield is attached to the square
        square.AsteroidImpacts.detachAllBuildings();


    }
}
