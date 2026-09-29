package p000;

import android.util.Log;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class e0a extends g0a {

    /* JADX INFO: renamed from: c */
    public static final Pattern f36542c = Pattern.compile("(\\$\\d+)+$");

    /* JADX INFO: renamed from: b */
    public final List f36543b = vz1.m23605K(h0a.class.getName(), f0a.class.getName(), g0a.class.getName(), e0a.class.getName());

    @Override // p000.g0a
    /* JADX INFO: renamed from: d */
    public final String mo10784d() {
        String strMo10784d = super.mo10784d();
        if (strMo10784d != null) {
            return strMo10784d;
        }
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        stackTrace.getClass();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!this.f36543b.contains(stackTraceElement.getClassName())) {
                String className = stackTraceElement.getClassName();
                className.getClass();
                String strM23369E0 = vk9.m23369E0('.', className, className);
                Matcher matcher = f36542c.matcher(strM23369E0);
                if (!matcher.find()) {
                    return strM23369E0;
                }
                String strReplaceAll = matcher.replaceAll("");
                strReplaceAll.getClass();
                return strReplaceAll;
            }
        }
        uk9.m22775i("Array contains no element matching the predicate.");
        return null;
    }

    @Override // p000.g0a
    /* JADX INFO: renamed from: e */
    public final void mo10785e(String str, int i, String str2) {
        int iMin;
        str2.getClass();
        if (str2.length() < 4000) {
            if (i == 7) {
                Log.wtf(str, str2);
                return;
            } else {
                Log.println(i, str, str2);
                return;
            }
        }
        int length = str2.length();
        int i2 = 0;
        while (i2 < length) {
            int iM23388k0 = vk9.m23388k0(str2, '\n', i2, 4);
            if (iM23388k0 == -1) {
                iM23388k0 = length;
            }
            while (true) {
                iMin = Math.min(iM23388k0, i2 + 4000);
                String strSubstring = str2.substring(i2, iMin);
                if (i == 7) {
                    Log.wtf(str, strSubstring);
                } else {
                    Log.println(i, str, strSubstring);
                }
                if (iMin >= iM23388k0) {
                    break;
                } else {
                    i2 = iMin;
                }
            }
            i2 = iMin + 1;
        }
    }
}
