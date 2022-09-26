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

WebUI.callTestCase(findTestCase('PreCondition/SP'), [('validData') : ''], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('PreCondition/Edit-Valid Param/Search ID'), [:], FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.callTestCase(findTestCase('PreCondition/Edit-Valid Param/Validasi'), [('Cekpostcode') : '', ('valuePostcode') : ''
//        , ('valueAddress') : '', ('PostCode') : '20118', ('Address') : 'SUMUT, Medan'], FailureHandling.CONTINUE_ON_FAILURE)
//valuePostcode = WebUI.getText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'))
//
//valueAddress = WebUI.getText(findTestObject('Add SP with valid data/Page_/input_Address'))
//WebUI.delay(5)
WebUI.sendKeys(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'), Keys.chord(Keys.CONTROL, 'a'))

//Press Ctrl+A on the Edit element
//Windows.sendKeys(findTestObject('Add SP with valid data/Page_/AddSP_Input company name'),Keys.chord(Keys.CONTROL,'a'))
WebUI.sendKeys(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Add SP with valid data/Page_/AddSP_inputPostalcode'), PostCode)

WebUI.scrollToPosition(10, 10)

WebUI.delay(3)

WebUI.click(findTestObject('Edit SP/Button_SaveChanges'))

if (PostCode == '') {
    WebUI.verifyElementText(findTestObject('Validation_With Empty String/Page_/EmptyString_C_PostCode'), 'Post Code must be filled')
}else if ((PostCode.length() < 5) || ((PostCode.length() < 5))) {
        WebUI.verifyElementPresent(findTestObject('Invalid_Parameter_PopUP/Page_/Body_ALert'), 0)

        WebUI.verifyElementText(findTestObject('Invalid_Parameter_PopUP/Page_/span_TextAlert'), '"postalCode" length must be 5 characters long')

        WebUI.closeBrowser()
    } 
