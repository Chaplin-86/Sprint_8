import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.example.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith( Parameterized.class )
public class NameLengthTest {

@Parameterized.Parameter
public String name;

@Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {
                {" "},
                {"Я"},
                {"ГП"},
                {"Г П"},
                {"Г По"},
                {"Гарри Потт"},
                {"Гермиона Грейнджер"},
                {"Гермиона Грейнджерр"},
                {"Геррмиона Грейнджерр"},
                {"Гермионагермиона Грейнджергрейнджер"}

        };
}

@Test
@DisplayName("Проверка допустимого количества символов в имени")
@Description("Проверка на 0, 1, 2, 3, 4, 10, 18, 19, 20, 35 символов")

public void checkNameLength() {

    Account account = new Account(name);

    System.out.println(account.checkNameToEmboss(name));

    }


}
