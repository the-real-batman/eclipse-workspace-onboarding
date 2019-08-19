package com.amdocs;

public class Mobile{
	
	private Camera camera;
	
	public Mobile() {
		camera=new Camera();
	}
	
	public Mobile(Camera camera) {
		this.camera=camera;
	}
	
	public boolean startPhotoApp() {
		System.out.println("Inside start photo app method");
		
		if(camera.on()) {
			System.out.println("Positive code path");
			return true;
		}
		
		System.out.println("Positive code path");
		return false;

	}

}