package p493xo;

import dm.C5207g;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import sl.C9072e;
import to.C9347b;

/* JADX INFO: renamed from: xo.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C10263c {

    /* JADX INFO: renamed from: a */
    public static final a f51694a = new a();

    /* JADX INFO: renamed from: b */
    public static final String[] f51695b;

    /* JADX INFO: renamed from: c */
    public static final DateFormat[] f51696c;

    /* JADX INFO: renamed from: xo.c$a */
    public static final class a extends ThreadLocal<DateFormat> {
        @Override // java.lang.ThreadLocal
        public final DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(C9347b.f48086e);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f51695b = strArr;
        f51696c = new DateFormat[strArr.length];
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final Date m19222a(String str) {
        C5207g.m11111f(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = f51694a.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        String[] strArr = f51695b;
        synchronized (strArr) {
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                DateFormat[] dateFormatArr = f51696c;
                DateFormat simpleDateFormat = dateFormatArr[i10];
                if (simpleDateFormat == null) {
                    simpleDateFormat = new SimpleDateFormat(f51695b[i10], Locale.US);
                    simpleDateFormat.setTimeZone(C9347b.f48086e);
                    dateFormatArr[i10] = simpleDateFormat;
                }
                parsePosition.setIndex(0);
                Date date2 = simpleDateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return date2;
                }
                i10 = i11;
            }
            C9072e c9072e = C9072e.f47360a;
            return null;
        }
    }
}
