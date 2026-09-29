package p000;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;

/* JADX INFO: loaded from: classes.dex */
public final class hd3 extends bq1 implements ur6, dua, rr6, InterfaceC3564s7, vl8, ue3 {

    /* JADX INFO: renamed from: K */
    public final id3 f42209K;

    /* JADX INFO: renamed from: L */
    public final id3 f42210L;

    /* JADX INFO: renamed from: M */
    public final Handler f42211M;

    /* JADX INFO: renamed from: N */
    public final le3 f42212N;

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ id3 f42213O;

    public hd3(id3 id3Var) {
        this.f42213O = id3Var;
        Handler handler = new Handler();
        this.f42209K = id3Var;
        this.f42210L = id3Var;
        this.f42211M = handler;
        this.f42212N = new le3();
    }

    @Override // p000.ur6
    /* JADX INFO: renamed from: B */
    public final void mo13201B(lk1 lk1Var) {
        this.f42213O.mo13201B(lk1Var);
    }

    @Override // p000.ub5
    /* JADX INFO: renamed from: K */
    public final AbstractC3572sf mo256K() {
        return this.f42213O.f43960R;
    }

    @Override // p000.rr6
    /* JADX INFO: renamed from: c */
    public final pr6 mo13202c() {
        return this.f42213O.mo13202c();
    }

    @Override // p000.ue3
    /* JADX INFO: renamed from: g */
    public final void mo4569g(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, AbstractC0638f abstractC0638f) {
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: o0 */
    public final View mo293o0(int i) {
        return this.f42213O.findViewById(i);
    }

    @Override // p000.InterfaceC3564s7
    /* JADX INFO: renamed from: p */
    public final sc1 mo13203p() {
        return this.f42213O.f63705i;
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: p0 */
    public final boolean mo294p0() {
        Window window = this.f42213O.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // p000.dua
    /* JADX INFO: renamed from: r */
    public final cua mo2116r() {
        return this.f42213O.mo2116r();
    }

    @Override // p000.vl8
    /* JADX INFO: renamed from: t */
    public final fs6 mo2118t() {
        return (fs6) this.f42213O.f63700d.f39591c;
    }

    @Override // p000.ur6
    /* JADX INFO: renamed from: z */
    public final void mo13204z(lk1 lk1Var) {
        this.f42213O.mo13204z(lk1Var);
    }
}
