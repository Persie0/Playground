package p000;

import java.util.Locale;
import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes.dex */
public interface u94 {
    int estimatePrintedLength();

    void printTo(Appendable appendable, long j, s11 s11Var, int i, DateTimeZone dateTimeZone, Locale locale);

    void printTo(Appendable appendable, ir7 ir7Var, Locale locale);
}
