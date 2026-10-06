package p000;

import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hmy implements fbp, fbl, fbj, fae {

    /* JADX INFO: renamed from: a */
    public final Window f28373a;

    /* JADX INFO: renamed from: b */
    public boolean f28374b = false;

    /* JADX INFO: renamed from: c */
    public int f28375c = 1797;

    /* JADX INFO: renamed from: e */
    private int f28377e = 0;

    /* JADX INFO: renamed from: d */
    public final View.OnSystemUiVisibilityChangeListener f28376d = new hmx(this);

    public hmy(jvd jvdVar, Window window) {
        this.f28373a = window;
        jvdVar.execute(new hea(this, window, 17));
    }

    @Override // p000.fae
    /* JADX INFO: renamed from: B */
    public final void mo7779B(boolean z) {
        if (this.f28374b || !z) {
            return;
        }
        m10482e();
    }

    /* JADX INFO: renamed from: a */
    public final void m10480a(int i) {
        this.f28375c = i;
        m10482e();
    }

    @Override // p000.fbj
    /* JADX INFO: renamed from: bE */
    public final void mo3522bE() {
        this.f28374b = true;
    }

    @Override // p000.fbl
    /* JADX INFO: renamed from: bF */
    public final void mo3523bF() {
        this.f28374b = false;
        m10482e();
    }

    /* JADX INFO: renamed from: d */
    public final void m10481d(int i) {
        this.f28377e = i;
        m10482e();
    }

    /* JADX INFO: renamed from: e */
    public final void m10482e() {
        if (this.f28374b) {
            return;
        }
        int i = this.f28375c;
        this.f28373a.getDecorView().setSystemUiVisibility(((i == 1797 || i == 1812) ? this.f28377e : 0) | this.f28375c);
    }
}
