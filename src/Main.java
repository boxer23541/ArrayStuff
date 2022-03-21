public class Main
{

    public static void main(String[] args)
    {
        final int TOTAL_STUDENTS = 10;
	    String[] names = new String[TOTAL_STUDENTS];

        String[] toys = {"Car", "Truck", "Doll"};

        names[0] = "Tom";
        names[1] = "Joseph";
        names[2] = "Duc";
        names[3] = "Clark";

        for(int s = 0; s < names.length; s++)
        {
            System.out.println(s + " " + names[s]);
        }

        for(String t:toys)
        {
            System.out.println("Toy: " + t);
        }

        int[] primes = {1, 2, 3, 5, 7, 11};
        for(int s = 0; s < primes.length; s++)
        {
            System.out.println(s + " " + primes[s]);
        }

        int sum = 0;

        for(int p : primes)
        {
            sum += p; //sum = sum + p
        }
    }
}
