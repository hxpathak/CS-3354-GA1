//Sharv Utpat
//CS 3345.001
//Greg Ozbirn
//10/28/22
//UT Dallas

//PrintJob.java class

//implements Comparable with compareTo
public class Printjob implements Comparable<Printjob>
{
    //declaring variables for userName, userPriority, numPages
    private String userName;
    private int userPriority;
    private int numPages;

    //constructor to assign values to object
    public Printjob(String userName, int userPriority, int numPages)
    {
        this.userName = userName;
        this.userPriority = userPriority;
        this.numPages = numPages;
    }

    //method to set userName
    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    //method to setUserPriority

    public void setUserPriority(int userPriority)
    {
        this.userPriority = userPriority;
    }

    //method to setNumPages
    public void setNumPages(int numPages)
    {
        this.numPages = numPages;
    }

    //method to get userName
    public String getUserName()
    {
        return userName;
    }

    //method to get userPriority
    public int getUserPriority()
    {
        return userPriority;
    }

    //method to get numPages
    public int getNumPages()
    {
        return numPages;
    }

    //compareTo method to compare job priorities of two print jobs
    @Override
    public int compareTo(Printjob o)
    {
        //declaring two job priority variables
        int jobPriority1;
        int jobPriority2;

        //assigning values to job priority variables by multiplying userPriority and numPages
        jobPriority1 = (this.getUserPriority() * this.getNumPages());
        jobPriority2 = (o.getUserPriority() * o.getNumPages());

        if (jobPriority1 > jobPriority2)
        {
            return 1;
        }

        else
        if (jobPriority1 < jobPriority2)
        {
            return -1;
        }

        //if jobPriorities are equal
        else
        {
                return 0;
        }
    }
}
