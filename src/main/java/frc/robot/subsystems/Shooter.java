package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Shooter extends SubsystemBase {
    WPI_TalonFX motor_1 = new WPI_TalonFX(Constants.Shooter.left_shooter_motor);
    WPI_TalonFX motor_2 = new WPI_TalonFX(Constants.Shooter.right_shooter_motor);
    public Shooter(){
        motor_1.setInverted(true);
    }
}

