package assignments;

public class As18 {

	public static void main(String[] args) {
		        String username = "Srikanth";
		        String password = "GroTechMinds";
		        String role = "Admin";

		        if (username == "Srikanth")
		        { 
		            if (password == "GroTechMinds")
		            {

		                if (role == "Admin")
		                {
		                    System.out.println("Full Access");
		                } else {
		                    if (role == "User")
		                    {
		                        System.out.println("Limited Access");
		                    } else
		                    {
		                        System.out.println("Guest Access");
		                    }
		                }

		            } else 
		            {
		                System.out.println("Wrong password");
		            }
		        } else 
		        {
		            System.out.println("Invalid username");
		        }
		    }
		}

