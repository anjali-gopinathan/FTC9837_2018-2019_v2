package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by Anjali on 10/19/2018.
 */

@TeleOp(name="TeleOp: Geary", group="Linear Opmode")
public class GearyTeleOp_v2 extends LinearOpMode{
    Hardware9837_geary_v2 geary = new Hardware9837_geary_v2();

    @Override
    public void runOpMode() {
        waitForStart();

        while (opModeIsActive()) {
            double leftDrive = gamepad1.left_stick_y;
            double rightDrive = gamepad1.right_stick_y;

            geary.leftMotor.setPower(leftDrive);
            geary.rightMotor.setPower(rightDrive);

        }
    }

}
