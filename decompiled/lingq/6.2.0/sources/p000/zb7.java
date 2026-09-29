package p000;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class zb7 {

    /* JADX INFO: renamed from: a */
    public final yb7 f71303a;

    /* JADX INFO: renamed from: b */
    public final rw2 f71304b;

    /* JADX INFO: renamed from: c */
    public int f71305c;

    /* JADX INFO: renamed from: d */
    public Object f71306d;

    /* JADX INFO: renamed from: e */
    public final Looper f71307e;

    /* JADX INFO: renamed from: f */
    public boolean f71308f;

    public zb7(rw2 rw2Var, yb7 yb7Var, z0a z0aVar, int i, Looper looper) {
        this.f71304b = rw2Var;
        this.f71303a = yb7Var;
        this.f71307e = looper;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m25539a(boolean z) {
        notifyAll();
    }

    /* JADX INFO: renamed from: b */
    public final void m25540b() {
        bna.m3987z(!this.f71308f);
        this.f71308f = true;
        rw2 rw2Var = this.f71304b;
        if (rw2Var.f59936j.getThread().isAlive()) {
            rw2Var.f59932h.m20097a(14, this).m19440b();
        } else {
            ss5.m21707d0("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            m25539a(false);
        }
    }
}
