package lab8;

public class DeleteCommand implements Command{
	public static Memento memento;
	public DeleteCommand() {
		memento = new Memento();
		DocumentManager.getInstance().stack.add(this);
	}
	public void execute() {
		Section sect = DocumentManager.getInstance().getBook();
		memento.setState(sect);
		Element toRemove = sect.content.get(sect.content.size() - 1);
		sect.content.remove(toRemove);
		DocumentManager.getInstance().setBook(sect);
	}
	public void unexecute() {
		DocumentManager.getInstance().setBook((Section)memento.getState());
	}
}
