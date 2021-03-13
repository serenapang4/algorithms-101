package javathreads_examples_ch02;

import java.util.*; 

public class CharacterEventHandler {
	private Vector listeners = new Vector();
	
	public void addCharacterListener(CharacterListener cl) {
		
		listeners.add(cl);
	}
	
public void removeCharacterListener(CharacterListener cl) {
		
		listeners.remove(cl);
	}

public void fireNewCharacterListener(CharacterSource source, int c) {
	CharacterEvent ce = new CharacterEvent(source, c); 
	CharacterListener[] cl = (CharacterListener[])
					 listeners.toArray(new CharacterListener[0]);
	for(int i = 0; i < cl.length;i++) {
		cl[i].newCharacter(ce);
	}
}
}
