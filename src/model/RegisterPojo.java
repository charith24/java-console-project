package model;

public class RegisterPojo{
		private String firstname;
		private String lastname;
		private String username;
		private String password;
		private String email;
		private String Apply;
		
		

		public RegisterPojo(String firstname, String lastname, String username, String password, String email,
				String apply) {
			super();
			this.firstname = firstname;
			this.lastname = lastname;
			this.username = username;
			this.password = password;
			this.email = email;
			this.Apply = apply;
		}
		


		public RegisterPojo(String firstname, String lastname, String email) {
			super();
			this.firstname = firstname;
			this.lastname = lastname;
			this.email = email;
		}



		public String getApply() {
			return Apply;
		}
		public void setApply(String apply) {
			Apply = apply;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getUsername() {
			return username;
		}
		public RegisterPojo(String username, String password) {
			super();
			this.username = username;
			this.password = password;
		}



		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		

	}
