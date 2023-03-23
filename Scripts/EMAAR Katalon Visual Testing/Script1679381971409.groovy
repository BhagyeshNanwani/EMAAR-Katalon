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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.delay(4)

WebUI.navigateToUrl('https://www.emaar.com/')

WebUI.takeElementScreenshotAsCheckpoint('Header', findTestObject('EMAAR Katalon Visual Testing Test Objects/Header'))

WebUI.takeFullPageScreenshotAsCheckpoint('HomePage', [findTestObject('Object Repository/EMAAR Katalon Visual Testing Test Objects/Video')])

//WebUI.scrollToElement(findTestObject('Object Repository/EMAAR Katalon Visual Testing Test Objects/Footer'), 0)
WebUI.delay(5)

WebDriver driver = DriverFactory.getWebDriver()

//go to the chrome settings
driver.get('chrome://settings/')

//set the zoom to 70%
    ((driver) as JavascriptExecutor).executeScript('chrome.settingsPrivate.setDefaultZoom(0.45);')

WebUI.navigateToUrl('https://www.emaar.com/')

WebUI.takeElementScreenshotAsCheckpoint('Footer', findTestObject('EMAAR Katalon Visual Testing Test Objects/Footer'))

WebUI.closeBrowser()

