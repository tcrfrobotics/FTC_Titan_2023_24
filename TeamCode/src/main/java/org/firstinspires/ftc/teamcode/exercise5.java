package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp
public class exercise5 extends OpMode {
    @Override
    public void init() {

telemetry.addData("this is test","test5");
    }

    @Override
    public void loop()
    {

    telemetry.addData("left stick x", gamepad1.left_stick_x);
    telemetry.addData("left stick y", gamepad1.left_stick_y);
    telemetry.addData("A button", gamepad1.a);
    }
}