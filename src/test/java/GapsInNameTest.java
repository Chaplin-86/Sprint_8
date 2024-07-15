import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.example.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class GapsInNameTest {
@Parameterized.Parameter
    public String name;

@Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {
                {" Гарри Поттер"},
                {"Гарри Поттер "},
                {" Гарри Поттер "},
                {"ГарриПоттер"}
        };
    }

@Test
@DisplayName("Проверка пробелов в имени")
@Description("Проверяем, что строку без пробелов в имени напечатать нельзя, а пробклы в начле и конце строки удаляются")
public void checkGapsInName() {
    Account account = new Account(name);

    System.out.println(account.checkNameToEmboss(name));
    }
}
