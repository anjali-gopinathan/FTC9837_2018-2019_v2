package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by Anjali on 10/24/2018.
 */

class Hardware9837_woody {
    DcMotor leftMotorTop, leftMotorBott, rightMotorTop, rightMotorBott;
    HardwareMap hwMap = null;
    public void init(HardwareMap hw){
        //set direction of motors facing opposite directions
        leftMotorTop = hw.dcMotor.get("leftDriveTop");
        leftMotorBott = hw.dcMotor.get("leftDriveBott");

        rightMotorTop = hw.dcMotor.get("rightDriveTop");
        rightMotorBott = hw.dcMotor.get("rightDriveBott");



        leftMotorTop.setDirection(DcMotor.Direction.FORWARD);
        leftMotorBott.setDirection(DcMotor.Direction.FORWARD);

        rightMotorTop.setDirection(DcMotor.Direction.FORWARD);
        rightMotorBott.setDirection(DcMotor.Direction.FORWARD);

//        colorSensor = hwMap.colorSensor.get("color sensor");

        //set pwr to 0

        leftMotorTop.setPower(0.0);
        leftMotorBott.setPower(0.0);

        rightMotorTop.setPower(0.0);
        rightMotorBott.setPower(0.0);


    }
}
