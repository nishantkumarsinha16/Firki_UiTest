package com.Pages;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.Loactors.iDiscussionPageLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DiscussionPage extends Base implements iDiscussionPageLocator {

    By ownerListLocator = By.xpath("//span[@class='owner_m ng-binding ng-scope']");
    By memberListLocator = By.xpath("//span[@class='member_m ng-binding ng-scope']");

    public DiscussionPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);

    }

    public boolean myLearningCircle() {
        return isElementPresent(myLearningCircleText);

    }

    public String createCircle(String circleName, String aboutCircle, String members, String owners) {
        String message = "";
        clickOn(createCircleLocator);
        // uploadFile(uploadImageLocator);
        enterText(circleName, createNameLocator);
        enterText(aboutCircle, aboutCircleLocator);
        enterText(members, membersCircleLocator);
        clickOn(selectUserLocator);
        enterText(owners, ownersCircleLocator);
        clickOn(selectUserLocator);
        clickOn(leaveGroupFreelyeLocator);
        clickOn(createCicleLocator);
        try {

            message = getText(tostTitleLocator);
            // System.out.println(message);

        } catch (Exception e) {
            clickOn(closeCreateCirclePopUpLocator);
            // message = getText(tostTitleFailLocator);
            System.out.println("Error: Group name already exist");

        }

        return message;

    }

    public String[] validateCircle() throws InterruptedException, IOException {
        String str = "";

        List<String> listmember = new ArrayList<String>();
        String stringArr[] = new String[listmember.size()];

        moveToElement(groupLocator);
        clickOn(groupLocator);

        // Hashtable<String, String> hastable = new Hashtable<String, String>();

        Properties p = new Properties();
        Thread.sleep(2000);
        List<String> ownerList = printAllElement(ownerListLocator);
        for (String owner : ownerList) {
            listmember.add(owner);
            stringArr = listmember.toArray(stringArr);
            for (int i = 0; i < listmember.size(); i++) {
                stringArr[i] = listmember.get(i);
            }
        }

        /*
         * for (String owners : ownerList) { /// System.out.println("-------------" +
         * owners); hastable.put("owner", owners); List<Map.Entry<String, String>>
         * listEntries = new ArrayList<Map.Entry<String, String>>(hastable.entrySet());
         * for (Entry<String, String> s : listEntries) { listString += s;
         * 
         * }
         * 
         * }
         */
        // -------------------------------------------------------------------------------------
        List<String> memberList = printAllElement(memberListLocator);
        for (String member : memberList) {
            listmember.add(member);
            stringArr = listmember.toArray(stringArr);
            for (int j = 0; j < listmember.size(); j++) {
                stringArr[j] = listmember.get(j);
            }
        }

        // hastable.clear();
        // for (String members : memberList) {
        // hastable.put("member", members);
        // List<Map.Entry<String, String>> listEntries = new ArrayList<Map.Entry<String,
        // String>>(hastable.entrySet());
        // for (Entry<String, String> s : listEntries) {
        // listString += s;
        // }
        // }

        // System.out.println("---------" + listString);

        // for (String s : stringArr) {
        // str += s;

        // }
        // System.out.println("===========" + str);
        // p.setProperty("group_details", str);
        // p.store(new FileWriter("info.properties"), "Nishant: Discussion page");

        // System.out.println(str);
        // File f = new File(System.getProperty("user.dir") + "/token.txt");
        // FileUtils.write(f, token);

        return stringArr;

    }

}
