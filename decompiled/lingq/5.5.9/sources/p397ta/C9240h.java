package p397ta;

import com.google.android.exoplayer2.ParserException;
import java.util.regex.Pattern;
import p479xa.C10134c0;
import p479xa.C10151t;

/* JADX INFO: renamed from: ta.h */
/* JADX INFO: loaded from: classes.dex */
public final class C9240h {

    /* JADX INFO: renamed from: a */
    public static final Pattern f47927a = Pattern.compile("^NOTE([ \t].*)?$");

    /* JADX INFO: renamed from: a */
    public static boolean m17603a(C10151t c10151t) {
        String strM19130e = c10151t.m19130e();
        return strM19130e != null && strM19130e.startsWith("WEBVTT");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static float m17604b(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* JADX INFO: renamed from: c */
    public static long m17605c(String str) throws NumberFormatException {
        int i10 = C10134c0.f51354a;
        String[] strArrSplit = str.split("\\.", 2);
        long j10 = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (strArrSplit.length == 2) {
            j11 += Long.parseLong(strArrSplit[1]);
        }
        return j11 * 1000;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public static void m17606d(C10151t c10151t) throws ParserException {
        int i10 = c10151t.f51439b;
        if (m17603a(c10151t)) {
            return;
        }
        c10151t.m19124E(i10);
        throw ParserException.m6770a("Expected WEBVTT. Got " + c10151t.m19130e(), null);
    }
}
