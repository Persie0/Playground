package p000;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final class bu5 implements jsa {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fu5 f9025b;

    public bu5(fu5 fu5Var) {
        this.f9025b = fu5Var;
    }

    @Override // p000.jsa
    /* JADX INFO: renamed from: a */
    public final void mo4178a(lsa lsaVar) {
    }

    @Override // p000.jsa
    /* JADX INFO: renamed from: b */
    public final void mo4179b() {
        fu5 fu5Var = this.f9025b;
        Surface surface = fu5Var.f39685u1;
        if (surface != null) {
            C3165jz c3165jz = fu5Var.f39669e1;
            Handler handler = c3165jz.f46413a;
            if (handler != null) {
                handler.post(new sp1(c3165jz, surface, SystemClock.elapsedRealtime()));
            }
            fu5Var.f39688x1 = true;
        }
    }

    @Override // p000.jsa
    /* JADX INFO: renamed from: c */
    public final void mo4180c() {
        fu5 fu5Var = this.f9025b;
        if (fu5Var.f39685u1 != null) {
            fu5Var.m12174S0(0, 1);
        }
    }

    @Override // p000.jsa
    /* JADX INFO: renamed from: d */
    public final void mo4181d() {
        mw2 mw2Var = this.f9025b.f68749d0;
        if (mw2Var != null) {
            mw2Var.m17064b();
        }
    }
}
