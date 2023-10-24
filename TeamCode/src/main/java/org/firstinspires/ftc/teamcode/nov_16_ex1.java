package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp

public class nov_16_ex1 extends OpMode {

    @Override
    public void init() {
    }
    @Override
    public void loop() {
        if (gamepad1.b) {telemetry.addData("B button is", "pressed");}
        else if (gamepad1.a) {telemetry.addData("A button is", "pressed"); }
        else if (gamepad1.x) {telemetry.addData("X button is", "pressed"); }
        else if (gamepad1.y) {telemetry.addData("Y button is", "pressed"); }
        }

}
