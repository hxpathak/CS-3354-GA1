//Sharv Utpat
//CS 3345.001
//Greg Ozbirn
//10/28/22
//UT Dallas

//OutsidePrintJob.java class

//subclass of PrintJob
public class OutsidePrintjob extends Printjob
{
    //variable to store cost per page in cents
    private final int CENTSPERPAGE = 10;

    //variable to store printing cost
    private int printingCost;

    //user super to use parent class constructor
    public OutsidePrintjob(String userName, int userPriority, int numPages)
    {
        super(userName, userPriority, numPages);
    }

    //calculate and get printing cost using userPriority, numPages, and CENTSPERPAGE
    public int getPrintingCost()
    {
        this.printingCost = (super.getNumPages() * CENTSPERPAGE);
        return printingCost;
    }
}
