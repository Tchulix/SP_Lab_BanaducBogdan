package lab8;

public class UndoCommand implements Command{
	public void execute() {
		DeleteCommand toUndo = (DeleteCommand)DocumentManager.getInstance().stack.get(DocumentManager.getInstance().stack.size()-1);
		DocumentManager.getInstance().setBook((Section)toUndo.memento.getState());
		toUndo.unexecute();
	}
	public void unexecute() {
		
	}
}
