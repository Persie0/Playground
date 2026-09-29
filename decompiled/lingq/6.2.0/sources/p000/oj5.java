package p000;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class oj5 implements xoa {

    /* JADX INFO: renamed from: b */
    public static final Object f54462b = new Object();

    /* JADX INFO: renamed from: c */
    public static volatile oj5 f54463c;

    /* JADX INFO: renamed from: a */
    public final int f54464a;

    public /* synthetic */ oj5(int i) {
        this.f54464a = i;
    }

    /* JADX INFO: renamed from: f */
    public static oj5 m18040f() {
        oj5 oj5Var;
        synchronized (f54462b) {
            try {
                if (f54463c == null) {
                    f54463c = new oj5(3);
                }
                oj5Var = f54463c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oj5Var;
    }

    /* JADX INFO: renamed from: h */
    public static String m18041h(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public void m18042a(String str, String str2) {
        if (this.f54464a <= 3) {
            Log.d(str, str2);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m18043c(String str, String str2) {
        if (this.f54464a <= 6) {
            Log.e(str, str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m18044e(String str, String str2, Throwable th) {
        if (this.f54464a <= 6) {
            Log.e(str, str2, th);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m18045g(String str, String str2) {
        if (this.f54464a <= 4) {
            Log.i(str, str2);
        }
    }

    @Override // p000.voa
    /* JADX INFO: renamed from: i */
    public AbstractC3081hn mo4033i(long j, AbstractC3081hn abstractC3081hn, AbstractC3081hn abstractC3081hn2, AbstractC3081hn abstractC3081hn3) {
        return abstractC3081hn3;
    }

    /* JADX INFO: renamed from: j */
    public void m18046j(String str, String str2) {
        if (this.f54464a <= 5) {
            Log.w(str, str2);
        }
    }

    @Override // p000.xoa
    /* JADX INFO: renamed from: o */
    public int mo4034o() {
        return this.f54464a;
    }

    @Override // p000.xoa
    /* JADX INFO: renamed from: q */
    public int mo4035q() {
        return 0;
    }

    @Override // p000.voa
    /* JADX INFO: renamed from: r */
    public AbstractC3081hn mo4036r(long j, AbstractC3081hn abstractC3081hn, AbstractC3081hn abstractC3081hn2, AbstractC3081hn abstractC3081hn3) {
        return j < ((long) this.f54464a) * 1000000 ? abstractC3081hn : abstractC3081hn2;
    }
}
