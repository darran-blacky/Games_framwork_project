package hud;

import java.util.ArrayList;

public class Caretaker {
	private ArrayList<Memento> mementos = new ArrayList<>();
	
	public void addMemento(Memento m)
	{
		mementos.add(m);
	}
	
	public Memento getMemento() 
	{
		switch (mementos.size())
		{
		case 0:
			return null;
		case 1:
			return mementos.get(0);
		default:
			return mementos.get(mementos.size()-1);
		}
		
	}
}
