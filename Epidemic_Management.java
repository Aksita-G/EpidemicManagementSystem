package helloworld;

import java.util.Scanner;
import java.util.Calendar;

//INTERFACE

interface clan
{
	//ABSTRACT FUNCTION
	abstract public void clan_info();
}

//INTERFACE IMPLEMENTATION

class patient implements clan
{
	Scanner std=new Scanner(System.in);
    public String pid, pname, gender, disease_history, status;
    int age;
    
    //CONSTRUCTOR
    
    public patient()
    {
    	pid=null;
    	pname=null;
    	gender=null;
    	disease_history=null;
    	status=null;
    	age=0;
    }
    public void add_patient()
    {
    	
		
        System.out.print("Enter patient id:");
        pid = std.next();
        System.out.print("Enter patient name:");
        pname = std.next();
        System.out.print("Enter disease history:");
        disease_history = std.next();
        System.out.print("Ender gender:");
        gender = std.next();
        System.out.print("Enter status:");
        status = std.next();
        System.out.print("Enter age:");
        age = std.nextInt();
        
    }
    public void clan_info()
    {
        System.out.println(pid + "\t" + pname + " \t" + gender + "     \t" + disease_history + "      \t" + status + "\t" + age);
    }
}
//INHERITANCE 

class migrant extends patient
{
    public String mid, mname, Gender, phnno;
    char epizone;
    int Age;
    public void add_migrant()
    {
    	@SuppressWarnings("resource")
		Scanner std=new Scanner(System.in);
        System.out.print("Enter Migrantt id: ");
        mid = std.nextLine();
        System.out.print("Enter Migrant name: ");
        mname = std.nextLine();
        System.out.print("Enter Gender: ");
        Gender = std.nextLine();
        System.out.print("Enter age: ");
        age = std.nextInt();
        System.out.print("Enter Phone Number: ");
        phnno = std.nextLine();
        System.out.print("Whether from Epidemic Zone (Y/N): ");
        epizone = std.next().charAt(0);
       
    }
    public void clan_info()
    {
        System.out.println(mid + "\t" + mname + " \t" + gender + "     \t" + age + "      \t" + phnno + "\t" + epizone);
    }
}

//ABSTRACT CLASS

abstract class employee{
	abstract public void get_data();
	abstract public void employee_info();
}
class doctor extends employee
{
	Scanner std=new Scanner(System.in);
	public String name;
	public String employee_id;
	public long phn_no;
	public void get_data()
	{
		System.out.println("Enter name:");
		name=std.next();
		System.out.println("Enter employee id:");
		employee_id=std.next();
		System.out.println("Enter phone number: ");
		phn_no=std.nextLong();
	}
	public void employee_info() 
	{
		System.out.println(employee_id + "\t" + name + " \t" + phn_no );
	}
}
class labstaff extends employee
{
	Scanner std=new Scanner(System.in);
	public String name;
	public String employee_id;
	public long phn_no;
	public void get_data()
	{
		System.out.println("Enter name:");
		name=std.next();
		System.out.println("Enter employee id:");
		employee_id=std.next();
		System.out.println("Enter phone number: ");
		phn_no=std.nextLong();
	}
	public void employee_info() 
	{
		System.out.println(employee_id + "\t" + name + " \t" + phn_no );
	}
}


class admin
{
	Scanner std=new Scanner(System.in);
	public String name;
	public String employee_id;
	public long phn_no;
	public void get_data()
	{
		System.out.println("Enter name:");
		name=std.next();
		System.out.println("Enter employee id:");
		employee_id=std.next();
		System.out.println("Enter phone number: ");
		phn_no=std.nextLong();
	}
	public void admin_info(String e_id) 
	{
		System.out.println(e_id + "\t" + name + " \t" + phn_no );
	}	
}

class sample extends patient
{
	Scanner std=new Scanner(System.in);
	public int sampleid,s;
	public  float rate;
	public  float acc_rate;
	
	//GETTER (ACCESSOR)
	
	public int getsampleid()
	{
		return sampleid;
	}
	
	//SETTER (MUTATOR)
	
	public void setsampleid(int s)
	{
		sampleid=s;
	}
	public void getsam()
	{
		System.out.println("Enter sample id:");
		s=std.nextInt();
		setsampleid(s);
		System.out.println("Enter rate:");
		rate=std.nextFloat();
		System.out.println("Enter acceptable rate:");
		acc_rate=std.nextFloat();
		
	}
	public void putsam(String pname,String status)
	{
		sampleid=getsampleid();
		System.out.println(sampleid + "\t" + rate + " \t" + acc_rate + "\t         " +pname  + "\t" +status);
	}
	
}

class hospital 
{
	//STATIC VARIABLES
	
	public static String hosp_name[]=new String[5];
	public  static int hosp_id[]= new int[5] ;
	public  static String address[]= new String[5];	
	public void get_hosp()
	{
		hosp_name[0]="AIMS";
		hosp_name[1]="Apollo";
		hosp_name[2]="PSG";
		hosp_name[3]="Ganga";
		hosp_name[4]="KMCH";
		
		
		hosp_id[0]=3;
		hosp_id[1]=4;
		hosp_id[2]= 5;
		hosp_id[3]=6;
		hosp_id[4]=7;
		
		address[0]="1, Ram Nagar Rd, Thiruvananthapuram, Kerala 695029";
		address[1]="1, Mount Rd, T Nagar, Chennai 600749";
		address[2]="1, Avinashi Rd, Peelamedu, Coimbatore 641041";
		address[3]="1, Mettupalayam Rd, Sai Baba Colony, Coimbatore 641108";
		address[4]="1, Gandhi Rd, KK Nagar, Madurai 625069";
	}

	public void display()
	{
		for(int j=0;j<5;j++)
		{
			System.out.println("hospital name - "+hosp_name[j]);
			System.out.println(" hospital_id: - "+hosp_id[j]);
			System.out.println(" address - "+address[j]);
		}
		
	}
}
//MAIN
public class EpidemicManagement
{
	public static void critical(int sid,float r,float ar,String pname,String pid)
	{
		if(r>ar)
		{
			System.out.println("--------------------------------------------------------------------------------");
            System.out.println("Name \t P_id\t S_id");
            System.out.println("--------------------------------------------------------------------------------");
            
			System.out.println(pname + " \t" + pid + " \t" + sid + "    \tCritical");
		}
	}
	public static void critical(float r,float ar,String pname,String pid,int sid)
	{
		System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Name \t P_id\t S_id");
        System.out.println("--------------------------------------------------------------------------------");
        	
		System.out.println(pname + " \t" + pid + " \t" + sid);
	}
    public static void main(String args[])
    {
        String months[] = {
            "Jan",
            "Feb",
            "Mar",
            "Apr",
            "May",
            "Jun",
            "Jul",
            "Aug",
            "Sep",
            "Oct",
            "Nov",
            "Dec"
        };
        Calendar calendar = Calendar.getInstance();
        int count1=0, count2=0, count3=0, count4=0, count5=0;
        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("            * Welcome to Epidemic Management System in Java *");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
        
        //TYPE CASTING (UP-CASTING)
        employee[]d = new doctor[20];
        employee[]l = new labstaff[20];
       
        sample[] s= new sample[10];
        patient[] p = new patient[20];
        
        admin[] a = new admin[20];
        migrant[] m = new migrant[10];
       
        hospital h = new hospital();
   ;
        
        //testing_fac[] s = new testing_fac[100];
        int c1, c2,c3,c4,c5,c6,c7,c8,c9;
        int status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1,s7=1,s8=1,s9=1;
        
        while (status == 1)
        {
            System.out.println("\n             MAIN MENU");
            System.out.println(" 1.Patients"+"\n"+" 2.Samples Collected"+"\n"+" 3.Doctors"+"\n"+" 4.Lab staffs"+"\n"+" 5.Admin"+"\n"
            +" 6.Migrants"+"\n"+" 7.Test Report"+
            "\n"+" 8.Critical Case"+"\n"+" 9.Hospital"+"\n 10.Exit\n"+"Enter your choice:");
        @SuppressWarnings("resource")
		Scanner std=new Scanner(System.in);
        int choice = std.nextInt();   
        switch (choice)
        {
        case 1:
        {
        	System.out.println("                      PATIENTS SECTION");
            s1 = 1;
            while (s1 == 1)
            {
                System.out.println("1.Add New Entry\n2.Existing Patient list");
                c1 = std.nextInt();
                switch (c1)
                {
                    case 1:
                        {
                        	//EXCEPTION HANDLING
                        	
                        	try 
        					{
        						
                        		p[count1]=new patient();
                            	p[count1].add_patient();
                                count1++;
        			        }
        			        catch (Exception e) 
        					{
        			            System.out.println("\nException caught\nArray index out of bound");
        					}	
                        	
                            break;
                        }
                    case 2:
                        {
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("P_id \t Name\t Gender \t Disease \t Status \tAge ");
                            System.out.println("--------------------------------------------------------------------------------");
                            for (int j = 0; j < count1; j++)
                            {
                                p[j].clan_info();
                            }
                            break;
                        }
                }
                System.out.println("\nPress 0 for Main Menu, 1 to Return");
                s1 = std.nextInt();
            }
            break;
        }
    
       
   case 2:
        {
        	System.out.println("                      SAMPLES SECTION");
            s2 = 1;
            while (s2 == 1)
            {
                System.out.println("1.Add New Sample\n2.Existing Samples");
                c2 = std.nextInt();
                switch (c2)
                {
                    case 1:
                        {
                        	try 
        					{
        						
                        		 s[count2]=new sample();
                             	s[count2].getsam();
                                 count2++;
        			        }
        			        catch (Exception e) 
        					{
        			            System.out.println("\nException caught\nArray index out of bound");
        					}	
                           
                            break;
                        }
                    case 2:
                        {
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("S_id \tRate\tAcceptable \tName\tStatus");
                            System.out.println("--------------------------------------------------------------------------------");
                            for (int j = 0; j < count2; j++)
                            {
                                s[j].putsam(p[j].pname,p[j].status);
                            }
                            break;
                        }
                }
                System.out.println("\nPress 0 for Main Menu, 1 to Return");
                s2 = std.nextInt();
            }
            break;
        }
    
   
  
        
    case 3:
    {
    	System.out.println("                      DOCTOR SECTION");
        s3 = 1;
        while (s3 == 1)
        {
            System.out.println("1.Add New Entry\n2.Existing Doctors List");
            c3 = std.nextInt();
            switch (c3)
            {
                case 1:
                    {
                    	try 
    					{
    						
                    		  d[count3]=new doctor();
                          	d[count3].get_data();
                              count3++;
    			        }
    			        catch (Exception e) 
    					{
    			            System.out.println("\nException caught\nArray index out of bound");
    					}	
                      
                        break;
                    }
                case 2:
                    {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("E_id \t Name\t Phone_NO ");
                        System.out.println("--------------------------------------------------------------------------------");
                        for (int j = 0; j < count3; j++)
                        {
                            d[j].employee_info();
                        }
                        break;
                    }
            }
            System.out.println("\nPress 0 for Main Menu, 1 to Return");
            s3 = std.nextInt();
        }
        break;
    }
    
    case 4:
    {
    	System.out.println("                       LAB STAFF SECTION");
        s4 = 1;
        while (s4 == 1)
        {
            System.out.println("1.Add New Entry\n2.Existing Lab staffs List");
            c4 = std.nextInt();
            switch (c4)
            {
                case 1:
                    {
                    	try 
    					{
                    		 l[count4]=new labstaff();
                         	l[count4].get_data();
                             count4++;
                    		
    			        }
    			        catch (Exception e) 
    					{
    			            System.out.println("\nException caught\nArray index out of bound");
    					}	
                       
                        break;
                    }
                case 2:
                    {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("E_id \t Name\t Phone_NO ");
                        System.out.println("--------------------------------------------------------------------------------");
                        for (int j = 0; j < count4; j++)
                        {
                            l[j].employee_info();
                        }
                        break;
                    }
            }
            System.out.println("\nPress 0 for Main Menu, 1 to Return");
            s4 = std.nextInt();
        }
        break;
    }
    case 5:
    {
    	System.out.println("                      ADMIN SECTION");
        s5 = 1;
        while (s5 == 1)
        {
            System.out.println("1.Add New Entry\n2.View Admins List\n3.View Patients list\n4.View Doctors list\n5.View Labstaff List\n6.View Crictical Case\n");
            c5 = std.nextInt();
            switch (c5)
            {
                case 1:
                    {
                    	try 
    					{
                    		 a[count5]=new admin();
                         	a[count5].get_data();
                             count5++;
                    		
    			        }
    			        catch (Exception e) 
    					{
    			            System.out.println("\nException caught\nArray index out of bound");
    					}	
                       
                        break;
                     }
                case 2:
                    {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("E_id \t Name\t Phone_NO ");
                        System.out.println("--------------------------------------------------------------------------------");
                        for (int j = 0; j < count5; j++)
                        {
                            a[j].admin_info(a[j].employee_id);
                        }
                        break;
                    }
                case 3:
                {
                	 {
                         System.out.println("--------------------------------------------------------------------------------");
                         System.out.println("P_id \t Name\t Gender \t Disease \t Status \tAge ");
                         System.out.println("--------------------------------------------------------------------------------");
                         for (int j = 0; j < count1; j++)
                         {
                             p[j].clan_info();
                         }
                         break;
                     }
                }
               
                case 4:
                {
                	 System.out.println("--------------------------------------------------------------------------------");
                     System.out.println("E_id \t Name\t Phone_NO ");
                     System.out.println("--------------------------------------------------------------------------------");
                     for (int j = 0; j < count3; j++)
                     {
                         d[j].employee_info();
                     }
                     break;
                }
                case 5:
                {
                	System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("E_id \t Name\t Phone_NO ");
                    System.out.println("--------------------------------------------------------------------------------");
                    for (int j = 0; j < count4; j++)
                    {
                        l[j].employee_info();
                    }
                    break;
                }
                case 6:
                {
                	for(int j=0;j<count1;j++)
                    	critical(s[j].sampleid,s[j].rate,s[j].acc_rate,p[j].pname,p[j].pid);
                     break;
                }
            }
            System.out.println("\nPress 0 for Main Menu, 1 to Return");
            s5 = std.nextInt();
        }
        break;
    }
    case 6:
    {
    	System.out.println("                      MIGRANT SECTION");
        s6 = 1;
        while (s6 == 1)
        {
            System.out.println("1.View MIGRANTS\n");
            c6 = std.nextInt();
            switch (c6)
            {
                case 1:
                {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("M_id \t Name\t Gender \t Disease \t Status \tAge ");
                    System.out.println("--------------------------------------------------------------------------------");
                    for (int j = 0; j < count1; j++)
                    {
                        p[j].clan_info();
                    }
                    break;
                }            
             }
            System.out.println("\nPress 0 for Main Menu, 1 to Return");
            s6 = std.nextInt();
        }
        break;
    }

    case 7:
    {
    	 {
    	    	System.out.println("                      REPORT AND GUIDELINES SECTION");
    	        s7 = 1;
    	        while (s7 == 1)
    	        {
    	            System.out.println("1.Enter sample ID");
    	            c7 = std.nextInt();
    	            
    	            for(int j=0;j<count1;j++)
    	            	
    	            	//METHOD OVERLOADING
    	            	if(c7==s[j].sampleid)
    	            		critical(s[j].rate,s[j].acc_rate,p[j].pname,p[j].pid,c7);
    	            
    	            System.out.println("\nYour sample is been identified as positive so,\n 1.Maintain a safe distance from others.\n 2.Clean your hands often. Use soap and water\n 3.Get vaccinated when it’s your turn\n ");
    	            System.out.println("\nPress 0 for Main Menu, 1 to Return");
    	            s7 = std.nextInt();
    	        }
    	  }
    }
    	 
  
    
    case 8:
    {
    	System.out.println("                      CRITICAL CASE SECTION");
        s8 = 1;
        while (s8 == 1)
        {
            System.out.println("1.View critical cases\n");
            c8 = std.nextInt();
            switch (c8)
            {
                case 1:
                    {
                        for(int j=0;j<count1;j++)
                        	critical(s[j].sampleid,s[j].rate,s[j].acc_rate,p[j].pname,p[j].pid);
                        
                        break;
                    }
            }
            System.out.println("\nPress 0 for Main Menu, 1 to Return");
            s8 = std.nextInt();
        }
        break;
    }
    case 9:
    {
    	System.out.println("                      HOSPITAL SECTION");
        s9 = 1;
        while (s9 == 1)
        {
            System.out.println("1.View Hospital List");
            c9 = std.nextInt();
            switch (c9)
            {
                case 1:
                    {
                    	h.get_hosp();
                    	h.display();
                      
                        break;
                    }
            }
            System.out.println("\nPress 0 for Main Menu, 1 to Return");
            s9 = std.nextInt();
        }
        break;
    }
    case 10:
    {
    	System.out.println("Epidemic Management System Exited");
    	System.exit(0);
    }
}
       
}
     
}

}