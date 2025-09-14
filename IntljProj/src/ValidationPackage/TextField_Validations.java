package ValidationPackage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TextField_Validations {
    public static void main(String[] args) {
    	textFieldValidations();
    }

    public static void textFieldValidations(){
        WebDriver oBrowser = null;
        try{
            oBrowser = new ChromeDriver();
            oBrowser.manage().window().maximize();
            oBrowser.navigate().to("file:///D:/ACM/SeleniumClassJuly21st2025/HTML/Htmlsample.html");            
            Thread.sleep(2000);

            //1. Exist Or not?
            System.out.println("*****************Verify element exist OR not**********************");
            if(oBrowser.findElement(By.xpath("//input[@id='frm1_un_id']")).isDisplayed()){
                System.out.println("The Text Field exist");
            }else{
                System.out.println("Failed to find the Text Field");
            }

            if(oBrowser.findElements(By.xpath("//input[@id='frm1_un_id']")).size() > 0){
                System.out.println("The Text Field exist");
            }else{
                System.out.println("Failed to find the Text Field");
            }


            //2. Enter the value
            oBrowser.findElement(By.xpath("//input[@id='frm1_un_id']")).sendKeys("adminnnnnnnnn");
            Thread.sleep(2000);

            //3. Read the entered value
            String strText = oBrowser.findElement(By.xpath("//input[@id='frm1_un_id']")).getAttribute("value");
            System.out.println(strText);

            //4. Clear the value
            oBrowser.findElement(By.xpath("//input[@id='frm1_un_id']")).clear();
            Thread.sleep(2000);


            //5. Read the placeholder value
            strText = oBrowser.findElement(By.xpath("//input[@id='frm1_un_id']")).getDomAttribute("placeholder");
            System.out.println(strText);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            oBrowser.close();
            oBrowser = null;
        }
    }
}
