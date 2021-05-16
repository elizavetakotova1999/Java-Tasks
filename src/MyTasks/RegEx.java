package MyTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        String text = "ЕгорА Алла Александр";
        Pattern pattern = Pattern.compile("А.+а");//мы двигаемся от первого символа "А" до последнего символа "а" в строке
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
