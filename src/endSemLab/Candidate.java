package endSemLab;

public class Candidate
{
	private String name;   
    private int votes;

    public Candidate(String name)
    {       
        this.name = name;
        votes = 0;
    }
 
    public void setName(String name)
    {
        this.name = name;
    }

    public void incrementVoteCount()
    {
        votes++;
    }

    public String getName()
    {
        return name;
    }

    public int getNumberOfVotes()
    {
        return votes;
    }
}
