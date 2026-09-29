package p000;

import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class up1 {

    /* JADX INFO: renamed from: c */
    public static final g9c f64161c = new g9c(9);

    /* JADX INFO: renamed from: a */
    public final qz6 f64162a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f64163b = new AtomicReference(null);

    public up1(qz6 qz6Var) {
        this.f64162a = qz6Var;
        qz6Var.m20220a(new C3487q7(this, 6));
    }

    /* JADX INFO: renamed from: a */
    public final g9c m22848a() {
        up1 up1Var = (up1) this.f64163b.get();
        return up1Var == null ? f64161c : up1Var.m22848a();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m22849b() {
        up1 up1Var = (up1) this.f64163b.get();
        return up1Var != null && up1Var.m22849b();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m22850c() {
        up1 up1Var = (up1) this.f64163b.get();
        return up1Var != null && up1Var.m22850c();
    }

    /* JADX INFO: renamed from: d */
    public final void m22851d(String str, long j, l50 l50Var) {
        String strM17734i = AbstractC3393o1.m17734i("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strM17734i, null);
        }
        this.f64162a.m20220a(new tg1(str, j, l50Var));
    }
}
