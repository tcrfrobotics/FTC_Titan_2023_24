package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp

public class ocean extends OpMode {

    @Override
    public void init() {
        telemetry.addData("Speed", "1");
    }

    @Override
    public void loop() {
        telemetry.addData("speed","1");
    }
}
