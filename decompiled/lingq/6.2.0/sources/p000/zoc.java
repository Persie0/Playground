package p000;

import android.text.format.DateFormat;
import androidx.compose.runtime.internal.C0282a;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import kotlin.Result;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f71923a = new C0282a(-857301693, false, new de1(25));

    /* JADX INFO: renamed from: b */
    public static final C0282a f71924b = new C0282a(-484323165, false, new de1(26));

    /* JADX INFO: renamed from: c */
    public static final C0282a f71925c = new C0282a(-936381583, false, new de1(27));

    /* JADX INFO: renamed from: d */
    public static final C0282a f71926d = new C0282a(27984808, false, new de1(28));

    /* JADX INFO: renamed from: a */
    public static String m25735a(String str) {
        Object failure;
        Locale locale = Locale.getDefault();
        locale.getClass();
        try {
            LocalDate localDate = LocalDate.parse(str);
            String bestDateTimePattern = DateFormat.getBestDateTimePattern(locale, "MMMMd");
            bestDateTimePattern.getClass();
            failure = localDate.format(DateTimeFormatter.ofPattern(bestDateTimePattern, locale));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (String) failure;
    }
}
