package p000;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class acl {
    /* JADX INFO: renamed from: e */
    public static Handler m197e() {
        return new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo198a(Typeface typeface);

    /* JADX INFO: renamed from: b */
    public abstract void mo199b();

    /* JADX INFO: renamed from: c */
    public final void m200c(int i) {
        m197e().post(new RunnableC0852nk(this, 9));
    }

    /* JADX INFO: renamed from: d */
    public final void m201d(Typeface typeface) {
        m197e().post(new RunnableC0058bd(this, typeface, 9));
    }
}
