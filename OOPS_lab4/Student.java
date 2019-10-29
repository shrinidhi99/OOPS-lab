import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Student
{
    private static int N;
    String name,department,email;
    static String nswap, dswap, eswap,dept;
    float salary_offered,cgpa;
    static float soswap,cgpaswap;
    int rollno,dob,deptID;
    static int rswap, dobswap;
    static int[] deptno = new int[9];
    static float[] deptavg = new float[9];
    static float[] salavg = new float[9];
    public static void main(String[] args)throws IOException
    {
        int i=0,j=0,k=0,t=0,q=0;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of students: ");
        N = Integer.parseInt(in.readLine());
        Student[] obj = new Student[N];
        Student[] newlist1 = new Student[N];
        Student[] newlist2 = new Student[N];
        for(i=0;i<9;i++)
            deptno[i]=0;
        for(i=0;i<N;i++)
        {
            obj[i] = new Student();
            System.out.println("Enter Name:");
            obj[i].name = in.readLine();
            System.out.println("Enter rollno:");
            obj[i].rollno = Integer.parseInt(in.readLine());
            System.out.println("Enter department:");
            obj[i].department = in.readLine();
            if((obj[i].department).equals("cse")) {
                deptno[0] += 1;
                obj[i].deptID = 0;
            }
            if((obj[i].department).equals("ece")) {
                deptno[1] += 1;
                obj[i].deptID = 1;
            }
            if((obj[i].department).equals("it")) {
                deptno[2] += 1;
                obj[i].deptID = 2;
            }
            if((obj[i].department).equals("eee")) {
                deptno[3] += 1;
                obj[i].deptID = 3;
            }
            if((obj[i].department).equals("mech")) {
                deptno[4] += 1;
                obj[i].deptID = 4;
            }
            if((obj[i].department).equals("cv")) {
                deptno[5] += 1;
                obj[i].deptID = 5;
            }
            if((obj[i].department).equals("ch")) {
                deptno[6] += 1;
                obj[i].deptID = 6;
            }
            if((obj[i].department).equals("mn")) {
                deptno[7] += 1;
                obj[i].deptID = 7;
            }
            if((obj[i].department).equals("mt")) {
                deptno[8] += 1;
                obj[i].deptID = 8;
            }
            System.out.println("Enter CGPA:");
            obj[i].cgpa = Float.parseFloat(in.readLine());
            System.out.println("Enter salary offered:");
            obj[i].salary_offered = Float.parseFloat(in.readLine());
            System.out.println("Enter email:");
            obj[i].email = in.readLine();
            System.out.println("Enter year of birth (in YYYY form):");
            obj[i].dob = Integer.parseInt(in.readLine());
        }
        //initializing deptavg of all depts to 0
        for(i=0;i<9;i++)
        {
            deptavg[i] = 0;
            salavg[i] = 0;
        }
        // calculating the average cgpa of every department
        for(i=0;i<N;i++)
        {
            switch(obj[i].deptID)
            {
                case 0:
                {
                    deptavg[0] += obj[i].cgpa;
                    salavg[0] += obj[i].salary_offered;
                    break;
                }
                case 1:
                {
                    deptavg[1] += obj[i].cgpa;
                    salavg[1] += obj[i].salary_offered;
                    break;
                }
                case 2:
                {
                    deptavg[2] += obj[i].cgpa;
                    salavg[2] += obj[i].salary_offered;
                    break;
                }
                case 3:
                {
                    deptavg[3] += obj[i].cgpa;
                    salavg[3] += obj[i].salary_offered;
                    break;
                }
                case 4:
                {
                    deptavg[4] += obj[i].cgpa;
                    salavg[4] += obj[i].salary_offered;
                    break;
                }
                case 5:
                {
                    deptavg[5] += obj[i].cgpa;
                    salavg[5] += obj[i].salary_offered;
                    break;
                }
                case 6:
                {
                    deptavg[6] += obj[i].cgpa;
                    salavg[6] += obj[i].salary_offered;
                    break;
                }
                case 7:
                {
                    deptavg[7] += obj[i].cgpa;
                    salavg[7] += obj[i].salary_offered;
                    break;
                }
                case 8:
                {
                    deptavg[8] += obj[i].cgpa;
                    salavg[8] += obj[i].salary_offered;
                    break;
                }
                default:
                    System.out.println("Wrong department ID. No such department exists.");
            }
        }
        for(i=0;i<9;i++)
        {
            if(deptno[i]>0)
            {
                deptavg[i] = deptavg[i]/deptno[i];
                salavg[i] = salavg[i]/deptno[i];
            }
        }
        // now we find the department with highest average cgpa
        for(i=0;i<9;i++)
        {
            if(deptavg[i] > deptavg[j] && deptno[i]>0 && deptno[j]>0)
            {
                j=i;
            }
        }
        if(j==0)
            dept = "cse";
        if(j==1)
            dept = "ece";
        if(j==2)
            dept = "it";
        if(j==3)
            dept = "eee";
        if(j==4)
            dept = "mech";
        if(j==5)
            dept = "cv";
        if(j==6)
            dept = "ch";
        if(j==7)
            dept = "mn";
        if(j==8)
            dept = "mt";
        System.out.println("The department with highest average cgpa is "+dept+" and department average cgpa = "+deptavg[j]);
        // now 'j' has the deptID with max cgpa
        // SORT the students in that department in decreasing order of their cgpa
        for(i=0;i<N;i++)
        {
            if(obj[i].deptID == j)
            {
                newlist1[k] = new Student();
                newlist1[k].name = obj[i].name;
                newlist1[k].department = obj[i].department;
                newlist1[k].rollno = obj[i].rollno;
                newlist1[k].email = obj[i].email;
                newlist1[k].dob = obj[i].dob;
                newlist1[k].salary_offered = obj[i].salary_offered;
                newlist1[k].cgpa = obj[i].cgpa;
                newlist1[k].deptID = obj[i].deptID;
                ++k;
            }
        }
        // now we have shortlisted students from that particular branch to sort
        for(i=0;i<k;i++)
        {
            for(t=0;t<k-i-1;t++)
            {
                if(newlist1[t].cgpa < newlist1[t+1].cgpa)
                {
                    //swap
                    cgpaswap = newlist1[t].cgpa;
                    newlist1[t].cgpa = newlist1[t+1].cgpa;
                    newlist1[t+1].cgpa = cgpaswap;
                    rswap = newlist1[t].rollno;
                    newlist1[t].rollno = newlist1[t+1].rollno;
                    newlist1[t+1].rollno = rswap;
                    dswap = newlist1[t].department;
                    newlist1[t].department = newlist1[t+1].department;
                    newlist1[t+1].department = dswap;
                    dobswap = newlist1[t].dob;
                    newlist1[t].dob = newlist1[t+1].dob;
                    newlist1[t+1].dob = dobswap;
                    eswap = newlist1[t].email;
                    newlist1[t].email = newlist1[t+1].email;
                    newlist1[t+1].email = eswap;
                    soswap = newlist1[t].salary_offered;
                    newlist1[t].salary_offered = newlist1[t+1].salary_offered;
                    newlist1[t+1].salary_offered = soswap;
                    nswap = newlist1[t].name;
                    newlist1[t].name = newlist1[t+1].name;
                    newlist1[t+1].name = nswap;
                }
            }
        }
        System.out.println("Name\tRollno\tEmail\tCGPA");
        for(i=0;i<k;i++)
        {
            System.out.println(newlist1[i].name+"\t"+newlist1[i].rollno+"\t"+newlist1[i].email+"\t"+newlist1[i].cgpa);
        }
        System.out.println("\n");
        for(i=0;i<9;i++)
        {
            if(salavg[i] > salavg[j] && deptno[i]>0 && deptno[j]>0)
            {
                q=i;
            }
        }
        if(q==0)
            dept = "cse";
        if(q==1)
            dept = "ece";
        if(q==2)
            dept = "it";
        if(q==3)
            dept = "eee";
        if(q==4)
            dept = "mech";
        if(q==5)
            dept = "cv";
        if(q==6)
            dept = "ch";
        if(q==7)
            dept = "mn";
        if(q==8)
            dept = "mt";
        System.out.println("The department with highest average salary offered is "+dept+" and department average salary offered = "+salavg[j]);
        k=0;
        for(i=0;i<N;i++)
        {
            if(obj[i].deptID == q)
            {
                newlist2[k] = new Student();
                newlist2[k].name = obj[i].name;
                newlist2[k].department = obj[i].department;
                newlist2[k].rollno = obj[i].rollno;
                newlist2[k].email = obj[i].email;
                newlist2[k].dob = obj[i].dob;
                newlist2[k].salary_offered = obj[i].salary_offered;
                newlist2[k].cgpa = obj[i].cgpa;
                newlist2[k].deptID = obj[i].deptID;
                ++k;
            }
        }
        for(i=0;i<k;i++)
        {
            for(t=0;t<k-i-1;t++)
            {
                if(newlist2[t].dob > newlist2[t+1].dob)
                {
                    //swap
                    cgpaswap = newlist2[t].cgpa;
                    newlist2[t].cgpa = newlist2[t+1].cgpa;
                    newlist2[t+1].cgpa = cgpaswap;
                    rswap = newlist2[t].rollno;
                    newlist2[t].rollno = newlist2[t+1].rollno;
                    newlist2[t+1].rollno = rswap;
                    dswap = newlist2[t].department;
                    newlist2[t].department = newlist2[t+1].department;
                    newlist2[t+1].department = dswap;
                    dobswap = newlist2[t].dob;
                    newlist2[t].dob = newlist2[t+1].dob;
                    newlist2[t+1].dob = dobswap;
                    eswap = newlist2[t].email;
                    newlist2[t].email = newlist2[t+1].email;
                    newlist2[t+1].email = eswap;
                    soswap = newlist2[t].salary_offered;
                    newlist2[t].salary_offered = newlist2[t+1].salary_offered;
                    newlist2[t+1].salary_offered = soswap;
                    nswap = newlist2[t].name;
                    newlist2[t].name = newlist2[t+1].name;
                    newlist2[t+1].name = nswap;
                }
            }
        }
        System.out.println("Name\tRollno\tSalary\tAge");
        for(i=0;i<k;i++)
        {
            System.out.println(newlist2[i].name+"\t"+newlist2[i].rollno+"\t"+newlist2[i].salary_offered+"\t"+newlist1[i].dob);
        }
        System.out.println("\n");


    }

}