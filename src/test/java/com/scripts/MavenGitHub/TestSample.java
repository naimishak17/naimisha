package com.scripts.MavenGitHub;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestSample {
 @Test
 public void a() {
	 Reporter.log("method a executed", true);
 }
 @Test
 public void b() {
	 Reporter.log("method b executed", true);
 }
 @Test
 public void c() {
	 Reporter.log("method c executed", true);
 }

}
