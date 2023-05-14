// Building is the leaf node for the composite pattern, Square's can have MULTIPLE Buildings
// Buildings cannot have children.
public class Building extends BoardComponent implements IObserver
{
	private int buildingHealth;
	
	public Building()
	{
		super();
		buildingHealth = 2;
	}

	@Override
	public void Operation()
	{
		// Buildings just stand there, they don't do anything.
	}

	@Override
	public void Add(BoardComponent child)
	{
		// Do nothing, I'm a leaf.
	}

	@Override
	public void Remove(BoardComponent child)
	{
		// Do nothing, I'm a leaf.
	}

	@Override
	public void update() {
		buildingHealth=buildingHealth-1;
		if(buildingHealth==0){


			//removing building from its parent composite
			this.parent.Remove(this);
			//removing building from subject square
			Square square=(Square)this.parent;
			//remove building from building list from subject
			square.AsteroidImpacts.removeBuilding(this);
			square.AsteroidImpacts.detach(this);

			//getting GameBoard Instance
			GameBoard gameBoard=GameBoard.Instance();
			//decrementing building count
			gameBoard.DecrementBuildingCount();


		}
	}
}