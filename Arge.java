/*More generally given parameters:
*
*p0, percent, aug (inhabitants coming or leaving each year), p (population to equal or surpass)
*
*the function nb_year should return n number of entire years needed to get a population greater or equal to p.
*
*aug is an integer, percent a positive or null floating number, p0 and p are positive integers (> 0)
*/

public class Arge {
	public static void main(String[] args) {
		int init = 1000;
		double perc = .02;
		int aug = 50;
		int goal = 1200;
		System.out.println(nbYear(init, perc, aug, goal));
	}
	
	public static int nbYear(int p0, double percent, int aug, int p) {
	        int year = 0;
	        int population = p0;
	        while (population < p) {
				population += population * percent / 100 + aug;
				year++;
	        }
	        return year;
    }

}
