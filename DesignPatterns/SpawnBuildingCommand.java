public class SpawnBuildingCommand extends Command {

    public SpawnBuildingCommand(Object receiver, String[] args)
    {
        super(receiver, args);
    }
    @Override
    public void Execute() {
        // Square is the receiver of building where the building is spawned
        Square square = (Square) receiver;

        // The args for SpawnBuildingCommand are the X,Y coordinate for the building

        //getting GameBoard Instance
        GameBoard gameBoard=GameBoard.Instance();
        IAsteroidGameFactory factory = gameBoard.GetFactory();
        System.out.println("Spawning building at (" + args[0] + "," + args[1] + ")");
        //adding the building to the square
        BoardComponent building=factory.MakeBuilding();
        square.Add(building);
        //attaching building to the subjects observer list
        square.AsteroidImpacts.attach((IObserver) building);
        //adding buildings to the list of subject, so they can be attached and detached later on
        square.AsteroidImpacts.addBuilding((IObserver) building);

        //incrementing the building count on the game board
        gameBoard.IncrementBuildingCount();
    }
}
