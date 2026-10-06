package p021j$.util;

import java.util.TimeZone;
import p021j$.time.ZoneId;

/* JADX INFO: loaded from: classes3.dex */
public class DesugarTimeZone {
    public static TimeZone getTimeZone(ZoneId zoneId) {
        String strMo12260q = zoneId.mo12260q();
        char cCharAt = strMo12260q.charAt(0);
        if (cCharAt == '+' || cCharAt == '-') {
            strMo12260q = "GMT".concat(strMo12260q);
        } else if (cCharAt == 'Z' && strMo12260q.length() == 1) {
            strMo12260q = "UTC";
        }
        return TimeZone.getTimeZone(strMo12260q);
    }

    public static TimeZone getTimeZone(String str) {
        return TimeZone.getTimeZone(str);
    }
}
