package p000;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes2.dex */
public final class bva implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public boolean f9074a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t18 f9075b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewTreeObserver f9076c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ sm0 f9077d;

    public bva(t18 t18Var, ViewTreeObserver viewTreeObserver, sm0 sm0Var) {
        this.f9075b = t18Var;
        this.f9076c = viewTreeObserver;
        this.f9077d = sm0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        t18 t18Var = this.f9075b;
        w89 w89VarM21816b = t18Var.m21816b();
        if (w89VarM21816b != null) {
            ViewTreeObserver viewTreeObserver = this.f9076c;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                t18Var.f61746a.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if (!this.f9074a) {
                this.f9074a = true;
                this.f9077d.resumeWith(w89VarM21816b);
            }
        }
        return true;
    }
}
