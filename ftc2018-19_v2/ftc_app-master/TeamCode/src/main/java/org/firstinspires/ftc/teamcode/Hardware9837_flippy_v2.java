package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by Anjali on 10/22/2018.
 */

public class Hardware9837_flippy_v2 {

    DcMotor rightMotor;
    DcMotor leftMotor;

    DcMotor rightFlipper;
    DcMotor leftFlipper;

//    private ElapsedTime period  = new ElapsedTime();

    public void init(HardwareMap hardwareMap){
        //set direction of motors facing opposite directions

        rightMotor = hardwareMap.dcMotor.get("rightDrive");
        leftMotor = hardwareMap.dcMotor.get("leftDrive");

        rightFlipper = hardwareMap.dcMotor.get("rightFlipper");
        leftFlipper = hardwareMap.dcMotor.get("leftFlipper");

        rightMotor.setDirection(DcMotor.Direction.FORWARD);
        leftMotor.setDirection(DcMotor.Direction.FORWARD);

        //set pwr to 0

        rightMotor.setPower(0.0);
        leftMotor.setPower(0.0);

        rightFlipper.setPower(0.0);
        leftFlipper.setPower(0.0);
    }

}
