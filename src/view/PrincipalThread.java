package view;

import controller.ThreadId;

public class PrincipalThread {

	public static void main(String[] args) {
		
		for (int idThread = 0; idThread < 5 ; idThread++) {
		ThreadId threadId = new ThreadId(idThread);	
		threadId.start();
		}
	}
}
