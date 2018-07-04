class User{
		private String firstName;
		private String lastName;
		private String userName;
		private String password;
		private String email;
		private String contactNo;
		private String dateOfBirth;
		private String gender;
		private String sit;
		private String cost;
		
		public User(){
			
		}
		
		public void setF(String f){
			this.firstName=f;
		}
		public void setL(String l){
			this.lastName=l;
		}
		public void setU(String u){
			this.userName=u;
		}
		public void setP(String p){
			this.password=p;
		}
		public void setE(String e){
			this.email=e;
		}
		public void setG(String g){
			this.gender=g;
		}
		public void setC(String c){
			this.contactNo=c;
		}
		public void setS(String s){
			this.sit=s;
		}
		public void setCost(String cos){
			this.cost=cos;
		}
		
		public void setD(String y,String m,String d){
			this.dateOfBirth= y+"-"+m+"-"+d;
		}
		public void setD(String d){
			this.dateOfBirth=d;
		}
		
		public String getG(){
			return this.gender;
		}
		public String getF(){
			return this.firstName;
		}
		public String getL(){
			return this.lastName;
		}
		public String getU(){
			return this.userName;
		}
		public String getP(){
			return this.password;
		}
		public String getE(){
			return this.email;
		}
		public String getC(){
			return this.contactNo;
		}
			public String getS(){
			return this.sit;
		}
			public String getCost(){
			return this.cost;
		}
		
		
		public String getD(){
			return this.dateOfBirth;
		}
	}
