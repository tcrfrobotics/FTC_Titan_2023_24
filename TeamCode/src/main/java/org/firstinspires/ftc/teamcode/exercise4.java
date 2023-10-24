package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class exercise4 extends OpMode {
    @Override
    public void init() {
    String my_name = "Shayden:)";

    telemetry.addData("my name is",my_name);

    }

    @Override
    public void loop()
    {
    }
}