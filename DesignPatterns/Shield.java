//concrete implementation of the decorator class
public class Shield extends BoardComponentDecorator implements IObserver {
    protected int shieldHealth;
    int xCoordinate;
    int yCoordinate;


    public Shield(BoardComponent square, int xCoordinate, int yCoordinate) {
        super(square);
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        shieldHealth = 2;
    }

    @Override
    public void Operation() {
        wrappedObject.Operation();
    }

    @Override
    public void Add(BoardComponent child) {
        wrappedObject.Add(child);
    }

    @Override
    public void Remove(BoardComponent child) {
        wrappedObject.Remove(child);
    }


    @Override
    public void update() {
        this.shieldHealth = shieldHealth - 1;
        if (shieldHealth == 0) {
            //removing shield from the board , at the stored co-ordinates
            GameBoard.Instance().GetBoard().get(yCoordinate).remove(xCoordinate);
            //replacing the square back on the board
            //getting square object
            Square square = (Square) this.wrappedObject;
            GameBoard.Instance().GetBoard().get(yCoordinate).add(xCoordinate, this.wrappedObject);
            //as the shield is destroyed attaching all the buildings in the square , so they can take the impact
            square.AsteroidImpacts.attachAllBuildings();
            //detaching the Shield observer from the subject as it is destroyed.
            square.AsteroidImpacts.detach(this);


        }
    }
}
