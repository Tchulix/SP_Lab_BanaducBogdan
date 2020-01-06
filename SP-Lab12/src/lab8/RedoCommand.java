package lab8;

public class RedoCommand implements Command{
	public void execute() {
		DeleteCommand toRedo = (DeleteCommand)DocumentManager.getInstance().stack.get(DocumentManager.getInstance().stack.size()-1);
		DocumentManager.getInstance().setBook((Section)toRedo.memento.getState());
		toRedo.execute();
	}
	public void unexecute() {
		
	}
}
