package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;
import java.util.List;
import com.Loactors.iResourcePage;

public class ResourcePage extends Base implements iResourcePage {

	public ResourcePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	public boolean verify_resource() {
		return isElementPresent(resourceCountTitleLocator);
	}

	/*----------------------------------------------------------------
	 * ---------------------------------------------------------------
	 * Subject Filter
	 * ---------------------------------------------------------------
	 * ---------------------------------------------------------------
	 */

	public String[] subjectFilter() throws InterruptedException {

		String callback[] = { "", "", "", "", "", "", "", "", "", "", "", "", "" };

		List<String> getlist = new ArrayList<String>();
		List<By> list = new ArrayList<By>();
		list.add(artFilterLocator);
		list.add(CommunityWellnessFilterLocator);
		list.add(ComputerScienceFilterLocator);
		list.add(EnglishFilterLocator);
		list.add(GeneralPedagogyFilterLocator);
		list.add(HindiFilterLocator);
		list.add(IntegrativeArtFilterLocator);
		list.add(MathFilterLocator);
		list.add(OnlineTeachingandFilterLocator);
		list.add(OnlineTeachingandqAndArtFilterLocator);
		list.add(ScienceFilterLocator);
		list.add(SocialSciencesFilterLocator);
		list.add(WellbeingFilterLocator);

		for (int i = 0; i < list.size(); i++) {
			By arr = list.get(i);
			Thread.sleep(1000);
			clickOn(subjectOpenFilterLocator);
			moveToElement(arr);
			clickOn(arr);
			clickOn(okButtonLocator);
			Thread.sleep(1000);
			String text = getText(resourceCountLocator);
			// System.out.println(text);
			getlist.add(text);

			for (int count = 0; count < getlist.size(); count++) {
				callback[count] = getlist.get(count);
			}

			Thread.sleep(1000);
			clickOn(subjectOpenFilterLocator);
			clickOn(selectAllButtonLocator);
			clickOn(okButtonLocator);
		}
		// for (String val : callback) {
		// System.out.println("------->>> " + val);
		return callback;
	}

	/*----------------------------------------------------------------
	* ---------------------------------------------------------------
	* Grade Filter
	* ---------------------------------------------------------------
	* ---------------------------------------------------------------
	*/
	public String[] gradesFilter() throws InterruptedException {

		String callback[] = { "", "", "", "", "", "", "", "", "", "", "", "" };
		List<String> getlist = new ArrayList<String>();
		List<By> list = new ArrayList<By>();
		list.add(gradeOneLocator);
		list.add(gradeTwoLocator);
		list.add(gradeThreeLocator);
		list.add(gradeFourLocator);
		list.add(gradeFiveLocator);
		list.add(gradeSixLocator);
		list.add(gradeSevenLocator);
		list.add(gradeEightLocator);
		list.add(gradeNineLocator);
		list.add(gradeTenLocator);
		list.add(gradeElevenLocator);
		list.add(gradeTwelvLocator);

		for (int i = 0; i < list.size(); i++) {
			By arr = list.get(i);
			Thread.sleep(1000);
			clickOn(gradeOpenFilterLocator);
			moveToElement(arr);
			clickOn(arr);
			clickOn(okButtonLocator);
			Thread.sleep(1000);
			String text = getText(resourceCountLocator);
			// System.out.println(text);
			getlist.add(text);

			for (int count = 0; count < getlist.size(); count++) {
				callback[count] = getlist.get(count);
			}

			Thread.sleep(1000);
			clickOn(clearButtonLocator);
			// clickOn(selectAllButtonLocator);
			// clickOn(okButtonLocator);
		}
		// for (String val : callback) {
		// System.out.println("------->>> " + val);
		// }
		return callback;

	}

	/*----------------------------------------------------------------
	* ---------------------------------------------------------------
	* Type Of Resource Filter
	* ---------------------------------------------------------------
	* ---------------------------------------------------------------
	*/

	public String[] typeOfResourceFilter() throws InterruptedException {

		String callback[] = { "", "", "", "", "" };

		List<String> getlist = new ArrayList<String>();
		List<By> list = new ArrayList<By>();
		list.add(articleLocator);
		list.add(contentAndClassroomVideosLocator);
		list.add(LessonPlanLocator);
		list.add(OtherLocator);
		list.add(WorksheetAssessmentLocator);

		for (int i = 0; i < list.size(); i++) {
			By arr = list.get(i);
			Thread.sleep(1000);
			clickOn(resourceOpenFilterLocator);
			// moveToElement(arr);
			clickOn(arr);
			clickOn(okButtonLocator);
			Thread.sleep(1000);
			String text = getText(resourceCountLocator);
			getlist.add(text);
			for (int count = 0; count < getlist.size(); count++) {
				callback[count] = getlist.get(count);
			}
			Thread.sleep(1000);
			try {
				clickOn(clearButtonLocator);
			} catch (Exception e) {
				clickOn(resourceOpenFilterLocator);
				clickOn(selectAllButtonLocator);
				clickOn(okButtonLocator);
			}

		}

		// for (String val : callback) {
		// System.out.println("------->>> " + val);
		// }

		return callback;

	}

	/*----------------------------------------------------------------
	* ---------------------------------------------------------------
	* Type Of Partner Filter
	* ---------------------------------------------------------------
	* ---------------------------------------------------------------
	*/

	public String[] partnersFilter() throws InterruptedException {

		String callback[] = { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" };

		List<String> getlist = new ArrayList<String>();
		List<By> list = new ArrayList<By>();
		list.add(akankshaFoundationLocator);
		list.add(ankitaGuptaLocator);
		list.add(ASBLocator);
		list.add(britishCouncilLocator);
		list.add(codeToEnhanceLearningLocator);
		list.add(fosterandForgeLocator);
		list.add(khanAcademyLocator);
		list.add(lifeLabLocator);
		list.add(godrejFoundationforEducationLocator);
		list.add(simpleEducationFoundationLocator);
		list.add(slamOutLoudLocator);
		list.add(smallScienceLocator);
		list.add(storyWeaverLocator);
		list.add(teachForIndiaLocator);
		list.add(theAkankshaFoundationLocator);
		list.add(theApprenticeProjectLocator);
		list.add(tickLinksLocator);
		list.add(trikonLocator);
		list.add(vidyodayaMathsandScienceResourceCentreLocator);
		// list.add(vMSRCLocator);
		// list.add(wikiHowLocator);

		for (int i = 0; i < list.size(); i++) {
			By arr = list.get(i);
			Thread.sleep(1000);
			clickOn(partnerOpenFilterLocator);
			moveToElement(arr);
			clickOn(arr);
			clickOn(okButtonLocator);
			Thread.sleep(1000);
			String text = getText(resourceCountLocator);
			getlist.add(text);
			for (int count = 0; count < getlist.size(); count++) {
				callback[count] = getlist.get(count);
			}
			Thread.sleep(1000);
			clickOn(partnerOpenFilterLocator);
			clickOn(selectAllButtonLocator);
			clickOn(okButtonLocator);
		}

		// for (String val : callback) {
		// System.out.println("------->>> " + val);
		/// }
		return callback;

	}

}
