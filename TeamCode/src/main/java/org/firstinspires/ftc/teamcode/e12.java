package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp

public class e12 extends OpMode {

    @Override
    public void init() {
        telemetry.addData("The driver hub is", "ready");
    }

    @Override
    public void loop() {

        boolean motor_1_active = false;
        boolean motor_0_active = false;
        double motor_2_speed = 3.8;
        double motor_3_speed = 1.9;

        telemetry.addData("Motor one active", motor_1_active);
        telemetry.addData("Motor zero active", motor_0_active);
        telemetry.addData("Motor two speed", motor_2_speed+" ft/s");
        telemetry.addData("Motor three speed", motor_3_speed+" " +
                "ft/s");


    }
}
