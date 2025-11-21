package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class VariablePractice extends OpMode {
    @Override
    public void init() {
        int teamnumber=23014;
        double motorspeed=0.75;
        boolean clawclosed=true;
        String teamname="MOir robotics";
        int motorangle=90;
        telemetry.addAction("Team Number",teamnumber);
        telemetry.addAction("Motor speed",motorspeed);
        telemetry.addAction("Claw STate",clawclosed);
        telemetry.addAction("Name",teamname);
        telemetry.addAction("Motor Angle",motorangle);




    }

    @Override
    public void loop() {

    }
}
