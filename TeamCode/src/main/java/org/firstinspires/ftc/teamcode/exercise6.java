package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class exercise6 extends OpMode {
    @Override
    public void init() {

telemetry.addData("test number 6","test6");
    }

    @Override
    public void loop()
    {

    telemetry.addData("Button A", gamepad1.b);
    telemetry.addData("Button B", gamepad2.a);
    }
}