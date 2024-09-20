package com.shivakrishna226.Inheritance;

public class IUser implements IAdmin {

	
	public static void main(String[] args) {
		IAdmin iAdmin=new IAdmin() {
			
			@Override
			public void read() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void write() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void manage() {
				// TODO Auto-generated method stub
				
			}
		};
	}
	
	@Override
	public void write() {
		System.out.println("Write Code");
	}

	@Override
	public void read() {
		System.out.println("Read Code");
	}

	@Override
	public void manage() {
		System.out.println("Manage Code");
	}
	
	IDeveloper iDeveloper= new IDeveloper() {
		
		@Override
		public void read() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void write() {
			// TODO Auto-generated method stub
			
		}
	};
	
	IGuest iGuest=new IGuest() {
		
		@Override
		public void read() {
			// TODO Auto-generated method stub
			
		}
	};
	
//	public static void main(String[] args) {
//		
//	}

}
