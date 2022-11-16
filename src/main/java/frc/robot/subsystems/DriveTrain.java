package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
    WPI_TalonFX right_front = new WPI_TalonFX(Constants.DriveTrain.right_front);
    WPI_TalonFX left_front = new WPI_TalonFX(Constants.DriveTrain.left_front);
    WPI_TalonFX right_rear = new WPI_TalonFX(Constants.DriveTrain.right_rear);
    WPI_TalonFX left_rear = new WPI_TalonFX(Constants.DriveTrain.left_rear);

    MotorControllerGroup right_motors = new MotorControllerGroup(right_front, right_rear);
    MotorControllerGroup left_motors = new MotorControllerGroup(left_front, left_rear);

    public DriveTrain (){
        right_motors.setInverted(true);
    }

    public void set_motor_speed (double right_speed, double left_speed){
        right_motors.set(right_speed);
        left_motors.set(left_speed);
    }


    public void periodic() {

    }
    public void simulationPeriodic() {

    }
}

