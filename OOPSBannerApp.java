//OOPSBannerApp UC4 - BannerApp-Array_Loop
public class OOPSBannerApp{ 
       public static void main(String[] arg){
		    String[] lines={
				String.join(" ", "   ***   ", "   ***   ", "******   ", "  *****  "),
				String.join(" ", " **   ** ", " **   ** ", "**    ** ", " **   ** "),
				String.join(" ", "**     **", "**     **", "**     **", "**       "),
				String.join(" ", "**     **", "**     **", "**    ** ", " **      "),
				String.join(" ", "**     **", "**     **", "******   ", "  *****  "),
				String.join(" ", "**     **", "**     **", "**       ", "      ** "),
				String.join(" ", "**     **", "**     **", "**       ", "       **"),
				String.join(" ", " **   ** ", " **   ** ", "**       ", " **   ** "),
				String.join(" ", "   ***   ", "   ***   ", "**       ", "  *****  "),
			};
			for (String line : lines){
				System.out.println(line);
			}
       }
}