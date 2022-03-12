package com.budfielder.genaric;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplemantation extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	}

	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot t = (TakesScreenshot) driver;
		try {
			FileUtils.copyFile(t.getScreenshotAs(OutputType.FILE),
					new File("./ScreenShorts/" + result.getClass() + ".png"));
		} catch (IOException e) {
			
		}
//		Robot r = null;
//		try {
//			r = new Robot();
//		} catch (AWTException e) {
//		}
//		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
//		Rectangle rec = new Rectangle(dim);
//		BufferedImage Bimg = r.createScreenCapture(rec);
//		try {
//			ImageIO.write(Bimg, "png", new File("./ScreenShorts/" + result.getClass() + ".png"));
//		} catch (IOException e) {
//		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {
	}

}
