package p000;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: renamed from: wi */
/* JADX INFO: loaded from: classes.dex */
public final class C3723wi {

    /* JADX INFO: renamed from: c */
    public static volatile C3723wi f66842c;

    /* JADX INFO: renamed from: a */
    public final jj5 f66843a;

    /* JADX INFO: renamed from: b */
    public boolean f66844b = false;

    public C3723wi() {
        jj5 jj5Var;
        synchronized (jj5.class) {
            try {
                if (jj5.f45611b == null) {
                    jj5.f45611b = new jj5(0);
                }
                jj5Var = jj5.f45611b;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f66843a = jj5Var;
    }

    /* JADX INFO: renamed from: d */
    public static C3723wi m23970d() {
        if (f66842c == null) {
            synchronized (C3723wi.class) {
                try {
                    if (f66842c == null) {
                        f66842c = new C3723wi();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f66842c;
    }

    /* JADX INFO: renamed from: a */
    public final void m23971a(String str) {
        if (this.f66844b) {
            this.f66843a.getClass();
            Log.d("FirebasePerformance", str);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m23972b(String str, Object... objArr) {
        if (this.f66844b) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.f66843a.getClass();
            Log.d("FirebasePerformance", str2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m23973c(String str, Object... objArr) {
        if (this.f66844b) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.f66843a.getClass();
            Log.e("FirebasePerformance", str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m23974e(String str, Object... objArr) {
        if (this.f66844b) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.f66843a.getClass();
            Log.i("FirebasePerformance", str2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m23975f(String str) {
        if (this.f66844b) {
            this.f66843a.getClass();
            Log.w("FirebasePerformance", str);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m23976g(String str, Object... objArr) {
        if (this.f66844b) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.f66843a.getClass();
            Log.w("FirebasePerformance", str2);
        }
    }
}
