package javathreads_examples_ch02;

public interface CharacterSource {
	public void addCharacterListener(CharacterListener cl);
	public void removeCharacterListener(CharacterListener cl);
	public void nextCharacter();
	public void addCharacterListener(CharacterDisplayCanvas characterDisplayCanvas);
}


