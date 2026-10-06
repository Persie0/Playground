package p000;

import android.app.Activity;
import android.os.Handler;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ens implements fbp, fbn, fbl, fbo, fbg {

    /* JADX INFO: renamed from: a */
    public final WeakReference f14786a;

    /* JADX INFO: renamed from: b */
    public Runnable f14787b;

    /* JADX INFO: renamed from: c */
    private final Handler f14788c;

    /* JADX INFO: renamed from: d */
    private final long f14789d;

    public ens(Activity activity, Handler handler, long j) {
        this.f14786a = new WeakReference(activity);
        this.f14788c = handler;
        this.f14789d = j;
    }

    /* JADX INFO: renamed from: b */
    private final void m7567b() {
        jvd.m13538a();
        Runnable runnable = this.f14787b;
        if (runnable == null) {
            return;
        }
        this.f14788c.removeCallbacks(runnable);
        this.f14787b = null;
    }

    @Override // p000.fbg
    /* JADX INFO: renamed from: bC */
    public final void mo3521bC() {
        m7567b();
    }

    @Override // p000.fbl
    /* JADX INFO: renamed from: bF */
    public final void mo3523bF() {
        m7567b();
    }

    @Override // p000.fbn
    /* JADX INFO: renamed from: bG */
    public final void mo3524bG() {
        m7567b();
    }

    @Override // p000.fbo
    /* JADX INFO: renamed from: e */
    public final void mo3525e() {
        jvd.m13538a();
        lku.m15657k(this.f14787b == null);
        long j = this.f14789d;
        if (j == 0) {
            return;
        }
        elu eluVar = new elu(this, 4);
        this.f14787b = eluVar;
        this.f14788c.postDelayed(eluVar, j);
    }
}
