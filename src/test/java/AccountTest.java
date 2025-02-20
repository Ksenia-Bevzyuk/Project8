import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AccountTest {

    @Test
    @DisplayName("Проверка, что имя удовлетворяющее всем требованиям подходит для печати")
    @Description("Проверка имени на количество символов 3-19, " +
            "содержание пробела и отсутствия обрамляющих пробелов")
    public void checkNameLengthLessThreeNoMore19CharsContainsSpaceNoStartAndNoEndTest() {
        Account account = new Account("Тимоти Шаламе");
        assertTrue("Данное имя можно напечатать на карте",
                account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Проверка, что имя неудовлетворяющее требованию длины больше 3 не подходит для печати")
    @Description("Проверка имени с количеством символов 2")
    public void checkNameLengthLessThreeCharsTest() {
        Account account = new Account("Ан");
        assertFalse("Данное имя не подходит для печати", account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Проверка, что имя неудовлетворяющее требованию длины меньше 19 не подходит для печати")
    @Description("Проверка имени с количеством символов 20")
    public void checkNameLengthMore19CharsTest() {
        Account account = new Account("Тимоти Шаламандравов");
        assertFalse("Данное имя не подходит для печати", account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Проверка, что имя неудовлетворяющее требованию содержания пробела не подходит для печати")
    @Description("Проверка имени без пробела")
    public void checkNameNoContainsSpaceTest() {
        Account account = new Account("ТимотиШаламе");
        assertFalse("Данное имя не подходит для печати", account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Проверка, что имя неудовлетворяющее требованию нет пробела в начале, не подходит для печати")
    @Description("Проверка имени начинающегося с пробела")
    public void checkNameStartWithSpaceTest() {
        Account account = new Account(" Тимоти Шаламе");
        assertFalse("Данное имя не подходит для печати", account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Проверка, что имя неудовлетворяющее требованию нет пробела в конце, не подходит для печати")
    @Description("Проверка имени заканчивающегося пробелом")
    public void checkNameEndsWithSpaceTest() {
        Account account = new Account("Тимоти Шаламе ");
        assertFalse("Данное имя не подходит для печати", account.checkNameToEmboss());
    }
}
