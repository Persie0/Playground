package p479xa;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;
import p003a2.C0009a;

/* JADX INFO: renamed from: xa.n */
/* JADX INFO: loaded from: classes.dex */
public final class C10145n {

    /* JADX INFO: renamed from: a */
    public static final Object f51397a = new Object();

    @Pure
    /* JADX INFO: renamed from: a */
    public static String m19093a(String str, Throwable th2) {
        String strM19097e = m19097e(th2);
        if (TextUtils.isEmpty(strM19097e)) {
            return str;
        }
        StringBuilder sbM26o = C0009a.m26o(str, "\n  ");
        sbM26o.append(strM19097e.replace("\n", "\n  "));
        sbM26o.append('\n');
        return sbM26o.toString();
    }

    @Pure
    /* JADX INFO: renamed from: b */
    public static void m19094b(String str, String str2) {
        synchronized (f51397a) {
            Log.d(str, str2);
        }
    }

    @Pure
    /* JADX INFO: renamed from: c */
    public static void m19095c(String str, String str2) {
        synchronized (f51397a) {
            Log.e(str, str2);
        }
    }

    @Pure
    /* JADX INFO: renamed from: d */
    public static void m19096d(String str, String str2, Throwable th2) {
        m19095c(str, m19093a(str2, th2));
    }

    @Pure
    /* JADX INFO: renamed from: e */
    public static String m19097e(Throwable th2) {
        boolean z10;
        synchronized (f51397a) {
            try {
                if (th2 == null) {
                    return null;
                }
                Throwable cause = th2;
                while (true) {
                    if (cause == null) {
                        z10 = false;
                        break;
                    }
                    if (cause instanceof UnknownHostException) {
                        z10 = true;
                        break;
                    }
                    cause = cause.getCause();
                }
                if (z10) {
                    return "UnknownHostException (no network)";
                }
                return Log.getStackTraceString(th2).trim().replace("\t", "    ");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Pure
    /* JADX INFO: renamed from: f */
    public static void m19098f(String str, String str2) {
        synchronized (f51397a) {
            Log.i(str, str2);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Pure
    /* JADX INFO: renamed from: g */
    public static void m19099g(String str, String str2) {
        synchronized (f51397a) {
            Log.w(str, str2);
        }
    }

    @Pure
    /* JADX INFO: renamed from: h */
    public static void m19100h(String str, String str2, Throwable th2) {
        m19099g(str, m19093a(str2, th2));
    }
}
