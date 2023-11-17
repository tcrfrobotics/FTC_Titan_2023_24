package org.firstinspires.ftc.teamcode; //importing package

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
/*  importing OpMode class
    from com.qualcomm.robotcore.eventloop.opmode package
 */

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
/*  importing TeleOp class
    from com.qualcomm.robotcore.eventloop.opmode package

 */
@TeleOp()        //This will include the code in TeleOp drop down menu
public class HelloWorld extends OpMode {      //Creating a class
    @Override                                 // Overriding the functionality of parent class
    public void init(){
        /* init function is called to define what will happen
        when we press INIT button in driver hub */

<<<<<<< HEAD
        telemetry.addData("Text is: ","My Name is Shayden:)");  // Sending data to the driver hub
=======
        telemetry.addData("Text is: ","My Name is Shafiq");  // Sending data to the driver hub
>>>>>>> origin/main
    }
    @Override
    public void loop(){
    }
}


