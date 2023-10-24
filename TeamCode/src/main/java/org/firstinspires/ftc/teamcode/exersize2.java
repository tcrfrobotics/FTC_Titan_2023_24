package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class exersize2 extends OpMode {
    @Override
    public void init() {

        boolean motor0active = true;
        double motor0speed = 1.5;
        boolean motor1active = false;
        boolean motor2active = false;
        boolean motor3active = false;
        telemetry.addData("motor0active", motor0active);
        telemetry.addData("motor speed",motor0speed);
        telemetry.addData("motor1active", motor1active);
        telemetry.addData("motor2active", motor2active);
        telemetry.addData("motor3active", motor3active);
    }

    @Override
    public void loop()
    {}
}
