package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by Anjali on 10/24/2018.
 */

@TeleOp(name="TeleOp: Woody", group="Linear Opmode")
public class WoodyTeleOp extends LinearOpMode{
    Hardware9837_woody woody = new Hardware9837_woody();
    @Override
    public void runOpMode() {
        woody.init(hardwareMap);
        waitForStart();
        //positive on andymark motors = cw
        while (opModeIsActive()) {
            double leftDrive = gamepad1.left_stick_y;
            double rightDrive = gamepad1.right_stick_y;

            woody.leftMotorTop.setPower(-leftDrive);
            woody.leftMotorBott.setPower(-leftDrive);

            woody.rightMotorTop.setPower(rightDrive);
            woody.rightMotorBott.setPower(rightDrive);
        }
    }


}
