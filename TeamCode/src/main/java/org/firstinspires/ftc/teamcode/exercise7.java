package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class exercise7 extends OpMode {
    @Override
    public void init() {

telemetry.addData("the gamepad is:","ready");
    }

    @Override
    public void loop()
    {

double speedForward = 10*gamepad1.left_stick_y;
telemetry.addData("left stick y", gamepad1.left_stick_y);
telemetry.addData("speed forward", speedForward);
    }
}