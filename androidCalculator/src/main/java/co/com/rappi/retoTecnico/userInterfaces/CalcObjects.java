package co.com.rappi.retoTecnico.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CalcObjects {

    public static Target NUMBER_BUTTON = Target.the("Button number {0}")
            .locatedBy("//*[@resource-id='com.android.calculator2:id/digit_{0}']");

    public static Target SUM_BUTTON = Target.the("select sum as operator")
            .located(By.xpath("//*[@resource-id='com.android.calculator2:id/op_add']"));

    public static Target SUBTRACT_BUTTON = Target.the("select subtraction as operator")
            .located(By.xpath("//*[@resource-id='com.android.calculator2:id/op_sub']"));

    public static Target MULTI_BUTTON = Target.the("select multiplier as operator")
            .located(By.xpath("//*[@resource-id='com.android.calculator2:id/op_mul']"));

    public static Target DIVISION_BUTTON = Target.the("select division as operator")
            .located(By.xpath("//*[@resource-id='com.android.calculator2:id/op_div']"));

    public static Target EQUALS_BUTTON = Target.the("select equal to get the result")
            .located(By.xpath("//*[@resource-id='com.android.calculator2:id/eq']"));

    public static Target RESUL_TEXT = Target.the("Operation result")
            .located(By.xpath("//*[@resource-id='com.android.calculator2:id/formula']"));


}
