package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class exersize3 extends OpMode {
    @Override
    public void init() {

boolean motor2running=true;
double motor2speed=0.8;
boolean motor1running=false;

telemetry.addData("motor2active",motor2running);
telemetry.addData("motor2speed",motor2speed+"ft/s");
telemetry.addData("motor1active",motor1running);


    }

    @Override
    public void loop()
    {
    }
}