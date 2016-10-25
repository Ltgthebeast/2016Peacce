package org.usfirst.frc.team3461.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    public Joystick driver = new Joystick(0),
    		operator = new Joystick(1);
    
    public JoystickButton Fire = new JoystickButton(operator , 0),
    		Low = new JoystickButton(operator, 0),
    		High = new JoystickButton(operator, 0),
    		InTake = new JoystickButton(operator, 0);
}

