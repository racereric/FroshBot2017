package org.usfirst.frc.team5401.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team5401.robot.RobotMap;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.Victor;

/**
 *
 */
public class DriveBase extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private double kP_Right;
	private double kP_Left;
	private double DPPLeft;
	private double DPPRight;
	
	//Declares Motors
	private Victor LeftDrive;
	private Victor RightDrive;
	
	AHRS navxGyro;
	
	//Encoders
	private Encoder LeftEncoder;
	private Encoder RightEncoder;
	
	public DriveBase(){
		LeftDrive 	= new Victor(RobotMap.LEFT_DRIVE_MOTOR);
		RightDrive	= new Victor(RobotMap.RIGHT_DRIVE_MOTOR);
		
		LeftEncoder = new Encoder(RobotMap.LEFT_ENCODER_A, RobotMap.LEFT_ENCODER_B, true, Encoder.EncodingType.k1X);
		RightEncoder = new Encoder(RobotMap.RIGHT_ENCODER_A, RobotMap.RIGHT_ENCODER_B, true, Encoder.EncodingType.k1X);
		
		navxGyro = new AHRS(SerialPort.Port.kMXP);
		navxGyro.reset();
	}
		/*
		[Values Unknown so commented out]
		Offset for drive motors when driving autonomously
	 	kP_Right = .9;
	 	kP_Left = .835;
	 	DPPRight = (1/6.318);
	 	DPPLeft = (-1/6.318);
	 	*/
		
	public void Drive(double leftDriveDesired, double rightDriveDesired){
	    	LeftDrive.set(leftDriveDesired); //passes desired state to speed controllers
	    	RightDrive.set(-1* rightDriveDesired);

	}
		


    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

