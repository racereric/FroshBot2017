package org.usfirst.frc.team5401.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	//PWM Motors
	public static final int LEFT_DRIVE_MOTOR    = 0;
	public static final int RIGHT_DRIVE_MOTOR   = 1;

	
	//Encoders
	public static final int LEFT_ENCODER_A    = 0;
	public static final int RIGHT_ENCODER_A   = 1;
	public static final int LEFT_ENCODER_B    = 2;
	public static final int RIGHT_ENCODER_B   = 3;
	
	
	
}
