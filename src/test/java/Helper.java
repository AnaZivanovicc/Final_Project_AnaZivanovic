import org.openqa.selenium.chrome.ChromeDriver;

    public class Helper {


     public static final String ORANGEHRMLINK = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

     public static final String ORANGEUSERNAME = "username";
     public static final String ORANGEPASSWORD = "password";
     public static final String SHAZAMURL = "https://www.shazam.com/home";
     public static final String SHAZAMLOG = "//*[@id=\"/header\"]/div[1]/div[2]/nav/a";
     public static final String WIKISELENIUM= "https://en.wikipedia.org/wiki/Selenium";

     public static final String FINALPROJECTFOLDER = "C:\\Users\\Admin\\Desktop\\";
     public static final String TXT = ".txt";
     public static final String JPG = ".jpg";
     public static final  String XPATHWIKI = "//*[@id=\"mw-content-text\"]/div[1]/p[2]";

     public static final String HOUSINGCAMERA = "https://www.housingcamera.com/test.html";
     public static final String NAMEFILEDCAMERA = "name";
     public static final String PASSWORDFIELDCAMERA = "password";

     public static final String EMAILIDCAMERA = "name";
     public static final String GENDERMALE = "radiogroup1";
     public static final String GENDERFEMALE = "radiogroup2";
     public static final String CONTACTCAMERANAME = "mobile";
     public static final String DROPDOWNDEGREE = "degree";

     public static final String DROPDOWNENGINEERING = "eng";
     public static final String HOBBIESCHECKBOX1 = "CheckboxGroup1";

     public static final String HOBBIESCHECKBOX2 ="CheckboxGroup2";

     public static final String ADDRESS ="textarea";

     public static final String WIKIFISH = "https://en.wikipedia.org/wiki/Fish";
     public static final String WIKIELEPHANT = "https://en.wikipedia.org/wiki/Elephant";
     public static final String SERCH = "searchInput";
     public static final String SEARCHBTN ="searchButton";

     public static ChromeDriver setupDriver(){
      System.setProperty("webdriver.chrome.driver","res\\chromedriver.exe");
      return new ChromeDriver();
     }




}
