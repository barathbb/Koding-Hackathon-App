package com.app.util;

public class AppConstants {
	
	public static final int EMAIL_NOT_EXIST = 1;
	public static final int WRONG_PASSW0RD = 2;
	public static final int VALID_USER = 3;
	
	
	public enum Users{
		
		SUPER_ADMIN(1),
		REVIEWER(2),
		DEPARTMENT_ADMIN(3),
		DEPARTMENT_WORKER(4),
		END_USER(5);
		
		private int type;
		
		private Users(int i) {
			this.type = i;
		}
		
		public int getIntValue(){
			return type;
		}
		
	}
	
	public enum PostState{
		
		CREATED(1),
		REVIEWED(2),
		ASSIGNED(3),
		FINISHED(4),
		CLOSED(5);
		
		private int state;
		
		private PostState(int state) {
			this.state = state;
		}
		
		public int getState(){
			return state;
		}
		
	}
	
	
}
