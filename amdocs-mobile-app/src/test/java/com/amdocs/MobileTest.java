package com.amdocs;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class MobileTest {

	@Test
	public void testStartPhotoAppWhenCameraOnFunctionsNormally() {
		
		Camera mockedCamera = mock(Camera.class);
		
		when( mockedCamera.on() ).thenReturn(true);
		
		Mobile mobile = new Mobile(mockedCamera);
		
		boolean actualResponse = mobile.startPhotoApp();
		boolean expectedResponse = true;
		
		assertEquals( expectedResponse, actualResponse );
		
		verify( mockedCamera, times(1) ).on();
	}

}
