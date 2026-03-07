public class OOPSBannerApp{
	static class CharacterPatternMap{
		Character character;
		String[] pattern;
		
		public CharacterPatternMap(Character character,String[] pattern){
			this.character=character;
			this.pattern=pattern;
		}
		
		public Character getCharacter(){
			return character;
		}
		
		public String[] getPattern(){
			return pattern;
		}
	}
	
	public static CharacterPatternMap[] createCharacterPatternMap(){
		CharacterPatternMap[] charMaps=new CharacterPatternMap[4];
		String[] oPattern={
			"   ***   ",
			" **   ** ",
			"**     **",
			"**     **",
			"**     **",
			"**     **",
			"**     **",
			" **   ** ",
			"   ***   ",
		};
		String[] pPattern={
			"******   ",
			"**    ** ",
			"**     **",
			"**    ** ",
			"******   ",
			"**       ",
			"**       ",
			"**       ",
			"**       ",
		};
		String[] sPattern={
			"  *****  ",
			" **   ** ",
			"**       ",
			" **      ",
			"  *****  ",
			"      ** ",
			"       **",
			" **   ** ",
			"  *****  ",
		};
		String[] spacePattern={
			"         ",
			"         ",
			"         ",
			"         ",
			"         ",
			"         ",
			"         ",
			"         ",
			"         ",
		};
		charMaps[0]=new CharacterPatternMap('O',oPattern);
		charMaps[1]=new CharacterPatternMap('P',pPattern);
		charMaps[2]=new CharacterPatternMap('S',sPattern);
		charMaps[3]=new CharacterPatternMap(' ',spacePattern);
		return charMaps;
	}
	
	public static String[] getCharactePattern(char ch,CharacterPatternMap[] charMaps){
		for (CharacterPatternMap map:charMaps){
			if (map.getCharacter()==ch){
				return map.getPattern();
			}
		}
		return getCharactePattern(' ',charMaps);
	}
	
	public static void printMessage(String message, CharacterPatternMap[] charMaps){
		for(int i=0;i<9;i++){
			StringBuilder lineAssembler=new StringBuilder();
			for(char ch:message.toCharArray()){
				String[] pattern=getCharactePattern(ch, charMaps);
				lineAssembler.append(pattern[i]).append(" ");
			}
			System.out.println(lineAssembler.toString());
		}
	}
	
	public static void main(String[] args){
		CharacterPatternMap[] charMaps=createCharacterPatternMap();
		String message="OOPS";
		printMessage(message,charMaps);
	}
}