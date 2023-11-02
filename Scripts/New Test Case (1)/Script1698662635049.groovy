import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import io.appium.java_client.AppiumDriver

//Open chrome app
Mobile.startExistingApplication('com.android.chrome')

Mobile.tap(findTestObject('Object Repository/Chrome/Use without an account'), 5, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Chrome/Got it btn'), 5, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Chrome/No thanks btn'), 5, FailureHandling.OPTIONAL)

Mobile.waitForElementPresent(findTestObject('Object Repository/Chrome/Menu btn'), 10)

Mobile.tap(findTestObject('Object Repository/Chrome/Menu btn'),10)

Mobile.tap(findTestObject('Object Repository/Chrome/Incognito tab'),10)

//Navigate to URL
Mobile.waitForElementPresent(findTestObject('Object Repository/Chrome/android.widget.EditText - Search or type web address'), 10)

Mobile.tap(findTestObject('Object Repository/Chrome/android.widget.EditText - Search or type web address'), 10)

Mobile.setText(findTestObject('Object Repository/Chrome/android.widget.EditText - Search or type web address'), 'https://dev-eus2-rc-bap-breeder-webapp.cloud-effem.com/', 
    10)

Mobile.waitForElementPresent(findTestObject('Chrome/Select_URL'), 10)

Mobile.tap(findTestObject('Chrome/Select_URL'), 0)

//Close Cookie
Mobile.waitForElementPresent(findTestObject('Object Repository/Accept All Cookies'), 20)

Mobile.tap(findTestObject('Object Repository/Accept All Cookies'), 10)

//Login
Mobile.tap(findTestObject('Object Repository/Login btn'), 10)
Mobile.delay(5)
//--Close Cookie
Mobile.waitForElementPresent(findTestObject('Object Repository/Accept All Cookies'), 10)

Mobile.tap(findTestObject('Object Repository/Accept All Cookies'), 10)

//--Fill email & pass
//Mobile.scrollToText('Email address', FailureHandling.STOP_ON_FAILURE)
TestObject email = findTestObject('Object Repository/Email field')
CustomKeywords.'actions.comon_actions.Scroll'(email)

Mobile.setText(findTestObject('Object Repository/Email field'), 'royalcanin.proservices+pp+dev+on+fr@gmail.com', 10)

Mobile.setText(findTestObject('Object Repository/Password field'), 'RoyalCanin_2022', 10)

//--Click Sign in
//Mobile.scrollToText('Forgot password', FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Object Repository/Sign in btn'), 10)

TestObject signin = findTestObject('Object Repository/Sign in btn')
CustomKeywords.'actions.comon_actions.Scroll'(signin)

Mobile.tap(findTestObject('Object Repository/Sign in btn'), 10)

Mobile.waitForElementPresent(findTestObject('Object Repository/Close warning'), 20)

//--Close warning
for (int i = 1; i <= 3; i++) {
    Mobile.tap(findTestObject('Object Repository/Close warning'), 10)

    Mobile.waitForElementPresent(findTestObject('Object Repository/Close warning'), 5)
}

Mobile.delay(30)

