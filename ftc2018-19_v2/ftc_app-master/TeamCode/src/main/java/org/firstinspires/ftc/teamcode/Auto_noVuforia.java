package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

/**
 * Created by Anjali on 10/31/2018.
 */
@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name="Auto No vuforia", group="Pushbot")

public class Auto_noVuforia extends LinearOpMode {
    Hardware9837_geary_v2 geary = new Hardware9837_geary_v2();
    public int t1 = 1100, t2=800;  //miliseconds

    public void runOpMode(){
        geary.init(hardwareMap);
        waitForStart();

        //while(opModeIsActive()){
            //Move forward
            geary.leftMotor.setPower(1.0);
            geary.rightMotor.setPower(1.0);
            sleep(t1);

            //Turn right
            geary.leftMotor.setPower(1.0);
            geary.rightMotor.setPower(-1.0);
            sleep(t2);

            //Move forward
            geary.leftMotor.setPower(0.5);
            geary.rightMotor.setPower(0.5);
            sleep(1400);

            //Stop
            geary.leftMotor.setPower(0.0);
            geary.rightMotor.setPower(0.0);
            //Move backward
            geary.leftMotor.setPower(-1.0);
            geary.rightMotor.setPower(-1.0);
            sleep(2200);


        //}
    }
}
