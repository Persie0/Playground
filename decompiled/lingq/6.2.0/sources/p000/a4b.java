package p000;

import androidx.media3.common.ParserException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a4b {
    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    /* JADX INFO: renamed from: a */
    public static float m118a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* JADX INFO: renamed from: b */
    public static long m119b(String str) {
        String str2 = uma.f64080a;
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str3 : strArrSplit[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str3);
        }
        long j2 = j * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() != 3) {
                C3386nv.m17626m("Expected 3 decimal places, got: ".concat(strTrim));
                return 0L;
            }
            j2 += Long.parseLong(strTrim);
        }
        return j2 * 1000;
    }

    /* JADX INFO: renamed from: c */
    public static void m120c(k47 k47Var) {
        int i = k47Var.f46701b;
        Charset charset = StandardCharsets.UTF_8;
        String strM14830n = k47Var.m14830n(charset);
        if (strM14830n == null || !strM14830n.startsWith("WEBVTT")) {
            k47Var.m14818M(i);
            throw ParserException.m2516a(null, "Expected WEBVTT. Got " + k47Var.m14830n(charset));
        }
    }
}
