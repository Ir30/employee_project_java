import java.util.Scanner;
import java.util.ArrayList;

class Employee{

    int emp_code;
    String name;
    String cmp_name;
    long phone;
    String email;

    Employee(int emp_code,String name,String cmp_name,long phone,String email){
        this.emp_code=emp_code;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.cmp_name = cmp_name;
    }

    void display(){
        System.out.println("Emp code: "+emp_code);
        System.out.println("name: "+name);
        System.out.println("company name: "+cmp_name);
        System.out.println("phone: "+phone);
        System.out.println("email: "+email);
        System.out.println();
        System.out.println("-------------");
        

    }

    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ArrayList<Employee> emp_list = new ArrayList<Employee>();
while(true){
        System.out.println("Employee");
        System.out.println("-------------");
        System.out.println();
        System.out.println("1:Add employee");
        System.out.println("2:View employee");
        System.out.println("3:Search employee");
        System.out.println("4:Delete employee");
        System.out.println("5:Exit");
        System.out.println("Employee");
        System.out.println("-------------");
        int choice=sc.nextInt();

        switch(choice){
            case 1:{

                Scanner sc1 =new Scanner(System.in);

                System.out.println("name: ");
                String name = sc1.nextLine();

                System.out.println("Empcode: ");
                int emp_code = sc1.nextInt();

                System.out.println("Company name: ");
                String cmp_name = sc1.next();

                System.out.println("phone: ");
                long phone=sc1.nextLong();

                System.out.println("email: ");
                String email = sc1.next();

                emp_list.add(new Employee(emp_code, name, cmp_name, phone, email));
                break;

            }

            case 2:{

                for(Employee i:emp_list){
                    i.display();
                }
                break;
            }

            case 3:{
  
                System.out.println("enter emp code");
                int emp = sc.nextInt();

                for(Employee i:emp_list){
                    if (i.emp_code==emp){
                        i.display();
                        break;
                    }
                }
                break;

            }

            case 4:{

                System.out.println("enter emp code");
                int emp_no = sc.nextInt();
                for(Employee i:emp_list){
                    if (i.emp_code==emp_no){
                        emp_list.remove(i);
                        break;
                    }
                }
                break;

            }

            case 5:{
                System.exit(0);
            }

        }

        


    }

}
}