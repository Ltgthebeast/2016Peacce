package org.usfirst.frc.team3461.robot.subsystems;

import org.usfirst.frc.team3461.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public CANTalon rd1 = new CANTalon(RobotMap.RightDrive1),
			rd2 = new CANTalon(RobotMap.RightDrive2),
			ld1 = new CANTalon(RobotMap.LeftDrive1),
			ld2 = new CANTalon(RobotMap.LeftDrive2);
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setLeft(double speed){
    	ld1.set(speed);
    	ld2.set(speed);
    }
    
    public void setRight(double speed){
    	rd1.set(speed);
    	rd2.set(speed);
    }
}

