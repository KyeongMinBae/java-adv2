package charset;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static java.nio.charset.StandardCharsets.*;

public class EncodingMaIn1 {

    private static final Charset EUC_KR = Charset.forName("EUC-KR");
    private static final Charset MS_949 = Charset.forName("MS949");

    public static void main(String[] args) {
        System.out.println("== ASCII 영문 처리 ==");
        encding("A", US_ASCII);
        encding("A", ISO_8859_1);
        encding("A", EUC_KR);
        encding("A", UTF_8);
        encding("A", UTF_16BE);

        System.out.println("== 한글 지원 ==");
        encding("가", EUC_KR);
        encding("가", MS_949);
        encding("가", UTF_8);
        encding("가", UTF_16BE);

    }

    private static void encding(String text, Charset charset) {
        byte[] bytes = text.getBytes(charset);
        System.out.printf("%s -> [%s] 인코딩 -> %s %sbyte\n", text, charset, Arrays.toString(bytes), bytes.length);
    }
}
