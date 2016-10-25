package org.usfirst.frc.team3461.robot.subsystems;

import org.usfirst.frc.team3461.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BunnyEars extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public Talon leftEar = new Talon(RobotMap.LeftBunnyEar),
			rightEar = new Talon(RobotMap.RightBunnyEar);
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void control(double speed){
    	leftEar.set(speed);
    	rightEar.set(speed);
    }
    
    public void stop(){
    	leftEar.set(0);
    	rightEar.set(0);
    }
}

