package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class idf {

    /* JADX INFO: renamed from: a */
    public final idb f30425a;

    /* JADX INFO: renamed from: b */
    public final jwf f30426b;

    /* JADX INFO: renamed from: e */
    private final dhv f30429e;

    /* JADX INFO: renamed from: f */
    private final Handler f30430f;

    /* JADX INFO: renamed from: g */
    private final Runnable f30431g;

    /* JADX INFO: renamed from: h */
    private final Object f30432h = new Object();

    /* JADX INFO: renamed from: c */
    public kbg f30427c = null;

    /* JADX INFO: renamed from: d */
    public Executor f30428d = null;

    public idf(dhv dhvVar, Context context) {
        this.f30429e = dhvVar;
        jpd.m13426g(true, 3000, null, null, context.getResources().getString(C0100R.string.flash_chip_text), context, false, -1, 2);
        String string = context.getResources().getString(C0100R.string.warm_light_on_with_flash);
        jpd.m13426g(true, 3000, null, null, string, context, false, -1, 2);
        this.f30425a = jpd.m13426g(false, 3000, null, new ide(this, 0), string, context, false, -1, 2);
        this.f30430f = jvh.m13557e(Looper.getMainLooper());
        this.f30426b = new jwf(false);
        this.f30431g = new idd(this, 2);
    }

    /* JADX INFO: renamed from: a */
    public final void m11110a() {
        synchronized (this.f30432h) {
            this.f30430f.removeCallbacks(this.f30431g);
            this.f30430f.removeCallbacks(null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11111b(kbg kbgVar, Executor executor) {
        this.f30427c = kbgVar;
        this.f30428d = executor;
    }

    /* JADX INFO: renamed from: c */
    public final void m11112c() {
        synchronized (this.f30432h) {
            dhv dhvVar = this.f30429e;
            dhx dhxVar = dib.f11240a;
            dhvVar.mo6175c();
        }
    }
}
