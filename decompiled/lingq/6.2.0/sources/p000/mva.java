package p000;

import android.os.Looper;
import android.view.View;
import coil.request.C0864a;

/* JADX INFO: loaded from: classes.dex */
public final class mva implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public g9c f51897a;

    /* JADX INFO: renamed from: b */
    public pg9 f51898b;

    /* JADX INFO: renamed from: c */
    public C0864a f51899c;

    /* JADX INFO: renamed from: d */
    public boolean f51900d;

    /* JADX INFO: renamed from: a */
    public final synchronized g9c m17058a() {
        g9c g9cVar = this.f51897a;
        if (g9cVar != null && fa4.m11650l(Looper.myLooper(), Looper.getMainLooper()) && this.f51900d) {
            this.f51900d = false;
            return g9cVar;
        }
        pg9 pg9Var = this.f51898b;
        if (pg9Var != null) {
            pg9Var.mo4537a(null);
        }
        this.f51898b = null;
        g9c g9cVar2 = new g9c(17);
        this.f51897a = g9cVar2;
        return g9cVar2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C0864a c0864a = this.f51899c;
        if (c0864a == null) {
            return;
        }
        this.f51900d = true;
        c0864a.f10567a.m4951b(c0864a.f10568b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C0864a c0864a = this.f51899c;
        if (c0864a != null) {
            AbstractC3572sf abstractC3572sf = c0864a.f10570d;
            c0864a.f10571e.mo4537a(null);
            t04 t04Var = c0864a.f10569c;
            if (t04Var != null) {
                abstractC3572sf.mo21331x(t04Var);
            }
            abstractC3572sf.mo21331x(c0864a);
        }
    }
}
