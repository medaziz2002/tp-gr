package org.anonbnr.web_services.grpc.agence.navigo.cli;


/*
import java.util.Scanner;

import org.anonbnr.web_services.grpc.agence.booking.services.EmployeeServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.grpc.Employee;
import com.example.grpc.EmployeeCount;
import com.example.grpc.EmployeeId;
import com.example.grpc.EmployeeList;
import com.example.grpc.Empty;

import io.grpc.StatusRuntimeException;

@Component
public class EmployeeClientCLI implements CommandLineRunner {
	
	@Autowired
	private EmployeeServiceClient employeeServiceClient;

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String choice = "";
		
		System.out.println("Welcome to the Employee Service CLI");
		
		do {
			menu();
			choice = scanner.nextLine().trim();
			
			switch(choice) {
			case "1":
				listAllEmployees();
				break;
			
			case "2":
				getEmployeeCount();
				break;
			
			case "3":
				getEmployeeById(scanner);
				break;
			
			case "4":
				addEmployee(scanner);
				break;
				
			case "5":
				deleteEmployeeById(scanner);
				break;
			
			case "6":
				updateEmployee(scanner);
				break;
			
			case "q":
				System.out.println("Exiting CLI...");
				System.exit(0);
				break;
			
			default:
				System.out.println("Invalid option. Please try again.");
			}
			
		} while (!choice.equalsIgnoreCase("q"));
	}
	
	private void menu() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("\nMenu:")
			.append("\n1. List all employees")
			.append("\n2. Get total employee count")
			.append("\n3. Get employee by ID")
			.append("\n4. Add a new employee")
			.append("\n5. Delete employee by ID")
			.append("\n6. Update employee details")
			.append("\nq. Quit")
			.append("\nEnter your choice: ");
		
		System.out.println(buffer);
	}

	private void listAllEmployees() {
		try {
			EmployeeList employeeList = employeeServiceClient.getAllEmployees(
					Empty.newBuilder().build());
			System.out.println("Employees:");
			employeeList.getEmployeesList().forEach(employee ->
					System.out.printf("ID: %d, Name: %s, Role: %s, Email: %s%n",
							employee.getId(), employee.getName(), 
							employee.getRole(), employee.getEmail()));
		} catch (StatusRuntimeException e) {
            System.err.println("Error: " + e.getStatus().getDescription());
        }
	}

	private void getEmployeeCount() {
		try {
			EmployeeCount count = employeeServiceClient.getEmployeeCount(Empty.newBuilder().build());
			System.out.println("Total number of employees: " + count.getCount());
		} catch (StatusRuntimeException e) {
            System.err.println("Error: " + e.getStatus().getDescription());
        }
	}

	private void getEmployeeById(Scanner scanner) {
		long id = 0;
		try {
			System.out.print("Enter employee ID: ");
			id = Long.parseLong(scanner.nextLine().trim());
			Employee employee = employeeServiceClient.getEmployeeById(
					EmployeeId.newBuilder().setId(id).build());
			
			System.out.printf("ID: %d, Name: %s, Role: %s, Email: %s%n",
					employee.getId(), employee.getName(), 
					employee.getRole(), employee.getEmail());
		} catch (NumberFormatException e) {
            System.err.println("Error: Invalid Employee ID " + e.getMessage());
        } catch (StatusRuntimeException e) {
        	System.err.println("Error: No Employee exists with ID " + id);
        }
	}

	private void addEmployee(Scanner scanner) {
		try {
			System.out.print("Enter employee name: ");
			String name = scanner.nextLine().trim();
			
			System.out.print("Enter employee role: ");
			String role = scanner.nextLine().trim();
			
			System.out.print("Enter employee email: ");
			String email = scanner.nextLine().trim();
			
			Employee newEmployee = Employee.newBuilder()
					.setName(name)
					.setRole(role)
					.setEmail(email)
					.build();
			
			Employee addedEmployee = employeeServiceClient.addEmployee(newEmployee);
			
			System.out.printf("Added Employee -> ID: %d, Name: %s, Role: %s, Email: %s%n",
					addedEmployee.getId(), addedEmployee.getName(), 
					addedEmployee.getRole(), addedEmployee.getEmail());
		} catch (StatusRuntimeException e) {
            System.err.println("Error: " + e.getStatus().getDescription());
        }
	}

	private void deleteEmployeeById(Scanner scanner) {
		long id = 0;
		try {
			System.out.print("Enter employee ID: ");
			id = Long.parseLong(scanner.nextLine().trim());
			
			employeeServiceClient.deleteEmployeeById(EmployeeId.newBuilder().setId(id).build());
			System.out.printf("Deleted Employee with ID %d successfully", id);
		} catch (NumberFormatException e) {
            System.err.println("Error: Invalid Employee ID " + e.getMessage());
        } catch (StatusRuntimeException e) {
        	System.err.println("Error: No Employee exists with ID " + id);
        } 
	}

	private void updateEmployee(Scanner scanner) {
		long id = 0;
		try {
			System.out.print("Enter employee ID to update: ");
	        id = Long.parseLong(scanner.nextLine());
	        
	        System.out.print("Enter new employee name: ");
	        String name = scanner.nextLine();
	        
	        System.out.print("Enter new employee role: ");
	        String role = scanner.nextLine();
	        
	        System.out.print("Enter new employee email: ");
	        String email = scanner.nextLine();

	        Employee newEmployee = Employee.newBuilder()
	        		.setId(id)
	        		.setName(name)
	        		.setRole(role)
	        		.setEmail(email)
	        		.build();
	        
	        Employee updatedEmployee = employeeServiceClient.updateEmployee(newEmployee);
	        
	        System.out.printf("Updated Employee -> ID: %d, Name: %s, Role: %s, Email: %s%n",
	        		updatedEmployee.getId(), updatedEmployee.getName(), 
	        		updatedEmployee.getRole(), updatedEmployee.getEmail());
		} catch (NumberFormatException e) {
            System.err.println("Error: Invalid Employee ID " + e.getMessage());
        } catch (StatusRuntimeException e) {
        	System.err.println("Error: No Employee exists with ID " + id);
        }
	}
}
*/