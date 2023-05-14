public abstract class BoardComponentDecorator extends BoardComponent{
    protected BoardComponent wrappedObject;
    BoardComponentDecorator(BoardComponent boardComponent){
        wrappedObject=boardComponent;
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
}
