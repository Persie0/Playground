package p290o6;

import android.content.Context;
import android.content.SharedPreferences;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import p003a2.C0009a;

/* JADX INFO: renamed from: o6.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7977q0 {
    /* JADX INFO: renamed from: a */
    public static boolean m15823a(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        if (!cleverTapInstanceConfig.f10988H) {
            return m15827e(context, null).getBoolean(m15833k(cleverTapInstanceConfig, str), false);
        }
        boolean z10 = m15827e(context, null).getBoolean(m15833k(cleverTapInstanceConfig, str), false);
        return !z10 ? m15827e(context, null).getBoolean(str, false) : z10;
    }

    /* JADX INFO: renamed from: b */
    public static int m15824b(Context context, int i10, String str) {
        return m15827e(context, null).getInt(str, i10);
    }

    /* JADX INFO: renamed from: c */
    public static int m15825c(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        if (!cleverTapInstanceConfig.f10988H) {
            return m15824b(context, 0, m15833k(cleverTapInstanceConfig, str));
        }
        int iM15824b = m15824b(context, -1000, m15833k(cleverTapInstanceConfig, str));
        return iM15824b != -1000 ? iM15824b : m15824b(context, 0, str);
    }

    /* JADX INFO: renamed from: d */
    public static long m15826d(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        if (!cleverTapInstanceConfig.f10988H) {
            return m15827e(context, "IJ").getLong(m15833k(cleverTapInstanceConfig, str), 0);
        }
        long j10 = m15827e(context, "IJ").getLong(m15833k(cleverTapInstanceConfig, str), -1000L);
        if (j10 != -1000) {
            return j10;
        }
        return m15827e(context, "IJ").getLong(str, 0);
    }

    /* JADX INFO: renamed from: e */
    public static SharedPreferences m15827e(Context context, String str) {
        return context.getSharedPreferences(str != null ? "WizRocket_".concat(str) : "WizRocket", 0);
    }

    /* JADX INFO: renamed from: f */
    public static String m15828f(Context context, String str, String str2) {
        return m15827e(context, null).getString(str, str2);
    }

    /* JADX INFO: renamed from: g */
    public static String m15829g(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str, String str2) {
        if (!cleverTapInstanceConfig.f10988H) {
            return m15828f(context, m15833k(cleverTapInstanceConfig, str), str2);
        }
        String strM15828f = m15828f(context, m15833k(cleverTapInstanceConfig, str), str2);
        return strM15828f != null ? strM15828f : m15828f(context, str, str2);
    }

    /* JADX INFO: renamed from: h */
    public static void m15830h(SharedPreferences.Editor editor) {
        try {
            editor.apply();
        } catch (Throwable th2) {
            C2181a.m6457j("CRITICAL: Failed to persist shared preferences!", th2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m15831i(Context context, int i10, String str) {
        m15830h(m15827e(context, null).edit().putInt(str, i10));
    }

    /* JADX INFO: renamed from: j */
    public static void m15832j(Context context, String str, String str2) {
        m15830h(m15827e(context, null).edit().putString(str, str2));
    }

    /* JADX INFO: renamed from: k */
    public static String m15833k(CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        StringBuilder sbM26o = C0009a.m26o(str, ":");
        sbM26o.append(cleverTapInstanceConfig.f10995a);
        return sbM26o.toString();
    }
}
