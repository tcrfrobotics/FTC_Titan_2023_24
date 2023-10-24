package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp

public class e11 extends OpMode {

    @Override
    public void init() {
        telemetry.addData("The driver hub is", "ready");
    }

    @Override
    public void loop() {

        double motor_0_speed = 1.5;
        boolean motor_1_active = false;
        boolean motor_2_active = false;
        boolean motor_3_active = false;

        telemetry.addData("Motor zero speed", motor_0_speed);
        telemetry.addData("Motor one active", motor_1_active);
        telemetry.addData("Motor two active", motor_2_active);
        telemetry.addData("Motor three active", motor_3_active);

    }
}
