import org.example.TT;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.File;

public class TTTest {
    public TT tt;

    @BeforeEach
    public void init() {
        tt = new TT();
    }


    @org.junit.jupiter.api.Test
    public void stringStart() {
        // given:
        String string = "Тестовая строка!";
        String shablon = "Тест";
        // when:
        boolean result = tt.stringStart(string, shablon);
        // then:
        Assertions.assertEquals(true, result);
    }

    @org.junit.jupiter.api.Test
    public void concat() {
        // given:
        String a = "Тестовая ";
        String b = "строка";
        String c = "Тестовая строка";
        // when:
        String result = tt.concat(a, b);
        // then:
        Assertions.assertEquals(c, result);
    }

    @ParameterizedTest
    @ValueSource(ints = { 3, 4, 5 })
    public void a1b(int argument) {
        // given:
        int b = 2;
        // when:
        boolean result = tt.a1b(argument, b);
        // then:
        Assertions.assertEquals(true, result);
    }

    @org.junit.jupiter.api.Test
    public void fileExist() {
        // given:
        String filename = "c://temp//1.txt";
        // when:
        boolean result = tt.fileExist(filename);
        // then:
        Assertions.assertEquals(true, result);
    }
}
