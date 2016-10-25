package org.usfirst.frc.team3461.robot.subsystems;

import org.usfirst.frc.team3461.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ShooterControl extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public Talon angleControl1 = new Talon(RobotMap.ShooterAngle1),
			angleControl2 = new Talon(RobotMap.ShooterAngle2);
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void up(){
    	angleControl1.set(.5);
    	angleControl2.set(.5);
    }
    
    public void down(){
    	angleControl2.set(-.5);
    	angleControl1.set(-.5);
    }
    
    public void stop(){
    	angleControl1.set(0);
    	angleControl2.set(0);
    }
}

