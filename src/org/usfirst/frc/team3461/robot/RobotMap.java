package org.usfirst.frc.team3461.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
   public static final int
   // CANTalons
   	RightDrive1 = 1,
   	RightDrive2 = 2,
   	LeftDrive1 = 3,
   	LeftDrive2 = 4,
   	
   	ShooterWheel1 = 0,
   	ShooterWheel2 = 0,
   	
   	// PWM
   	
   	ShooterAngle1 = 0,
   	ShooterAngle2 = 0,
   	
   	RightBunnyEar = 7,
   	LeftBunnyEar = 6,
   	
   	// DIO
   	
   	ShooterUp = 0,
   	ShooterDown = 0,
   	LeftEarDown = 0,
   	RightEarDown = 0,
   	LeftEarUp = 0,
   	RightEarUp = 0 ,
   	
   	// PCM 
   	PuncherChanA = 0,
   	PuncherChanB = 1,
   	
   	// Analaog
   	ShooterAnglePot = 1
   ;
}
