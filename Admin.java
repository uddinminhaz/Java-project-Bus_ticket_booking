class Admin{
		
		private String userName;
		private String id;
		private String contactNo;
	
	
		public void setAU(String u){
			this.userName=u;
		}
		public void setAI(String i){
			this.id=i;
		}
	
		public void setAC(String c){
			this.contactNo=c;
		}
	
		
		public String getAU(){
			return this.userName;
		}
		public String getAI(){
			return this.id;
		}
		public String getAC(){
			return this.contactNo;
		}
		
	
	}
