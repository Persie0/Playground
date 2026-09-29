package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class wc2 {

    /* JADX INFO: renamed from: c */
    public static final C3723wi f66611c = C3723wi.m23970d();

    /* JADX INFO: renamed from: d */
    public static wc2 f66612d;

    /* JADX INFO: renamed from: a */
    public volatile SharedPreferences f66613a;

    /* JADX INFO: renamed from: b */
    public final ExecutorService f66614b;

    public wc2(ExecutorService executorService) {
        this.f66614b = executorService;
    }

    /* JADX INFO: renamed from: a */
    public static Context m23843a() {
        try {
            q43.m19641c();
            q43 q43VarM19641c = q43.m19641c();
            q43VarM19641c.m19644a();
            return q43VarM19641c.f57252a;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized wc2 m23844b() {
        try {
            if (f66612d == null) {
                f66612d = new wc2(Executors.newSingleThreadExecutor());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f66612d;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m23845c(Context context) {
        if (this.f66613a == null && context != null) {
            this.f66614b.execute(new RunnableC3470pr(13, this, context));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m23846d(double d, String str) {
        if (this.f66613a == null) {
            m23845c(m23843a());
            if (this.f66613a == null) {
                return;
            }
        }
        this.f66613a.edit().putLong(str, Double.doubleToRawLongBits(d)).apply();
    }

    /* JADX INFO: renamed from: e */
    public final void m23847e(String str, long j) {
        if (this.f66613a == null) {
            m23845c(m23843a());
            if (this.f66613a == null) {
                return;
            }
        }
        this.f66613a.edit().putLong(str, j).apply();
    }

    /* JADX INFO: renamed from: f */
    public final void m23848f(String str, String str2) {
        if (this.f66613a == null) {
            m23845c(m23843a());
            if (this.f66613a == null) {
                return;
            }
        }
        SharedPreferences sharedPreferences = this.f66613a;
        if (str2 == null) {
            sharedPreferences.edit().remove(str).apply();
        } else {
            sharedPreferences.edit().putString(str, str2).apply();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m23849g(String str, boolean z) {
        if (this.f66613a == null) {
            m23845c(m23843a());
            if (this.f66613a == null) {
                return;
            }
        }
        this.f66613a.edit().putBoolean(str, z).apply();
    }
}
