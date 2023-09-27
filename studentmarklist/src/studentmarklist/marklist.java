package studentmarklist;
import java.util.Scanner;
public class marklist {

	public static void main(String[] args) {
		Scanner inn = new Scanner(System.in);
		System.out.print("Num of students:");
		int nstudents = inn.nextInt();
		inn.nextLine();
		int i=0,k,b,t,j=0;
		int []roll = {101,102,103,104};
			System.out.println("Enter names:");
			String []name = new String[nstudents];
		     while(j<nstudents){
		    	name[j] = inn.nextLine();
		    	j++;
			}
			System.out.println("Mark1 for students:");
			int []mark1 = new int[nstudents];
			while (i<nstudents) {
				mark1[i] = inn.nextInt();
				i++;
			}
			System.out.println("Mark2 for students:");
			int []mark2 = new int[nstudents];
			for( k=0; k<nstudents; k++) {
				mark2[k] = inn.nextInt();
			}
			System.out.println("Mark3 for students:");
			int []mark3 = new int[nstudents];
			for( b=0; b<nstudents; b++) {
				mark3[b] = inn.nextInt();
			}
			int []total = new int[nstudents];
			double []avg = new double[nstudents];
			String []grade = new String[nstudents];
			for( t=0; t<nstudents; t++) {
			total[t] =mark1[t]+mark2[t]+mark3[t];
		    avg[t]= total[t]/3;
		
		if (avg[t]>=80&&avg[t]<=100){
			grade[t] = "A";
		}
		else if (avg[t]>=75) {
			grade[t] = "B+";
		}
		else if (avg[t]>=65) {
			grade[t] = "B";
		}
		else if (avg[t]>=55) {
			grade[t] = "C+";
		}
		else if (avg[t]>=50) {
			grade[t] = "C";
		}
		else if (avg[t]>=40) {
			grade[t] = "D";
		}
		else {grade[t] = "F";
		}
		}
		System.out.println("*******************************************************");
		System.out.println("\t\t\t\tSTUDENT MARKLIST");
		System.out.println("*******************************************************");
		System.out.println("ROLL\tNAME\tMARK1 MARK2 MARK3 TOTAL RESULT Average GRADE");
		System.out.println(+roll[0]+"\t"+name[0]+"\t  "+mark1[0]+"\t"+mark2[0]+"    "+mark3[0]+"    "+total[0]+"\t   P\t"+avg[0]+"\t "+grade[0]);
		System.out.println(+roll[1]+"\t"+name[1]+"\t  "+mark1[1]+"\t"+mark2[1]+"    "+mark3[1]+"    "+total[1]+"\t   P\t"+avg[1]+"\t "+grade[1]);
		System.out.println(+roll[2]+"\t"+name[2]+"\t  "+mark1[2]+"\t"+mark2[2]+"    "+mark3[2]+"    "+total[2]+"\t   P\t"+avg[2]+"\t "+grade[2]);
		System.out.println(+roll[3]+"\t"+name[3]+"\t  "+mark1[3]+"\t"+mark2[3]+"    "+mark3[3]+"    "+total[3]+"\t   P\t"+avg[3]+"\t "+grade[3]);
		
inn.close();
	}
}

