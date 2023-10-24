package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp

public class nov_16_ex2 extends OpMode {

    @Override
    public void init() {
    }

    @Override
    public void loop() {

telemetry.addData("1joystick left data x",gamepad1.left_stick_x);
        telemetry.addData("1joystick left data y",gamepad1.left_stick_y);
        telemetry.addData("1joystick right(: data x",gamepad1.right_stick_x);
        telemetry.addData("1joystick right data y",gamepad1.right_stick_y);

        telemetry.addData("2joystick left data x",gamepad2.left_stick_x-0.28242543);
        telemetry.addData("2joystick left data y",gamepad2.left_stick_y+0.34917656);
        telemetry.addData("2joystick right(: data x",gamepad2.right_stick_x);
        telemetry.addData("2joystick right data y",gamepad2.right_stick_y);
    }
}
