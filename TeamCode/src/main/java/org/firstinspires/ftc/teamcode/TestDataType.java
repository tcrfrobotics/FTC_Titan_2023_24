package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class TestDataType extends OpMode {
    @Override
    public void init(){
        int motorNumber = 0;

        telemetry.addData("Motor running", "Motor" +motorNumber);
    }
    @Override
    public void loop(){
    }
}
