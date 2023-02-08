//Sharv Utpat
//CS 3345.001
//Greg Ozbirn
//10/28/22
//UT Dallas

//Printer.java class

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//class reads files and creates objects for each entry
public class Printer
{
    public static void main (String[] args) throws FileNotFoundException, UnderflowException {
        Scanner console = new Scanner(System.in);

        //variables declared for username, user priority, number of pages, and flag (I or O)
        String userName;
        int userPriority;
        int numPages;
        String flag;

        //variable to store name of input file
        String fileName;

        //asking user to input name of input file
        //type "input.txt"
        System.out.print("Enter file name: ");
        fileName = console.next();

        //object of BinaryHeap type to store objects of PrintJob type
        BinaryHeap<Printjob> jobs = new BinaryHeap<Printjob>();

        //Scanner class object inputFile used to read files
        Scanner inputFile = new Scanner(new File(fileName));

        while (inputFile.hasNext())
        {
            //store file line in line variable
            String line = inputFile.nextLine();

            //create array and split elements by multiple spaces
            String[] array = line.split("\\s+");

            //first element is userName
            userName = array[0];

            //second element is userPriority
            userPriority = Integer.valueOf(array[1]);

            //third element is numPages
            numPages = Integer.valueOf(array[2]);

            //fourth element is flag
            flag = array[3];

            //if inside job
            if (flag.equals("I"))
            {
                //create object with values
                Printjob inside = new Printjob(userName, userPriority, numPages);

                //add to binary heap
                jobs.insert(inside);
            }
            //if outside job
            else
            {
                //create outside object with values
                OutsidePrintjob outside = new OutsidePrintjob(userName, userPriority, numPages);

                //add to binary heap
                jobs.insert(outside);
            }

        }

        //close inputFile
        inputFile.close();

        System.out.println("");

        //line prints label for upcoming values
        System.out.format("%-12s%-12s%-12s%-12s\n", "Username", "Priority", "NumPages", "Cost(¢)");

        //loop until heap is empty
        while (!jobs.isEmpty())
        {
            //get lowest value
            Printjob job = (Printjob) jobs.deleteMin();

            //if job is an outside job
            if (job instanceof OutsidePrintjob)
            {
                OutsidePrintjob outsideJob = (OutsidePrintjob) job;

                //set space formatting
                System.out.format("%-12s%-12s%-12s%-12s\n", outsideJob.getUserName(), outsideJob.getUserPriority() , outsideJob.getNumPages(), outsideJob.getPrintingCost());
            }
            //if job is an inside job
            else
            {
                //set space formatting
                System.out.format("%-12s%-12s%-12s\n", job.getUserName(), job.getUserPriority() , job.getNumPages());
            }
        }
    }
}
