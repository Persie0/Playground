package p000;

import android.content.Context;
import androidx.compose.p002ui.graphics.layer.C0312a;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;

/* JADX INFO: renamed from: ji */
/* JADX INFO: loaded from: classes.dex */
public final class C3148ji implements qp3 {

    /* JADX INFO: renamed from: a */
    public final ViewTreeObserverOnGlobalLayoutListenerC0391c f45555a;

    /* JADX INFO: renamed from: b */
    public final Object f45556b = new Object();

    /* JADX INFO: renamed from: c */
    public boolean f45557c;

    /* JADX INFO: renamed from: d */
    public C3156jq f45558d;

    /* JADX INFO: renamed from: e */
    public final ComponentCallbacks2C3076hi f45559e;

    public C3148ji(ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c) {
        this.f45555a = viewTreeObserverOnGlobalLayoutListenerC0391c;
        ComponentCallbacks2C3076hi componentCallbacks2C3076hi = new ComponentCallbacks2C3076hi(this);
        this.f45559e = componentCallbacks2C3076hi;
        if (viewTreeObserverOnGlobalLayoutListenerC0391c.isAttachedToWindow()) {
            Context context = viewTreeObserverOnGlobalLayoutListenerC0391c.getContext();
            if (!this.f45557c) {
                context.getApplicationContext().registerComponentCallbacks(componentCallbacks2C3076hi);
                this.f45557c = true;
            }
        }
        viewTreeObserverOnGlobalLayoutListenerC0391c.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3112ii(this, 0));
    }

    /* JADX INFO: renamed from: d */
    public static final void m14484d(C3148ji c3148ji) {
        C3156jq c3156jq = c3148ji.f45558d;
        if (c3156jq != null) {
            synchronized (c3156jq) {
                try {
                    n66 n66Var = (n66) c3156jq.f45990a;
                    if (n66Var != null) {
                        n66Var.m17249a();
                    }
                    c3156jq.f45991b = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        c3148ji.f45558d = null;
    }

    @Override // p000.qp3
    /* JADX INFO: renamed from: a */
    public final void mo14485a(C0312a c0312a) {
        synchronized (this.f45556b) {
            if (!c0312a.f3995s) {
                c0312a.f3995s = true;
                c0312a.m1425b();
            }
        }
    }

    @Override // p000.qp3
    /* JADX INFO: renamed from: b */
    public final C3156jq mo14486b() {
        C3156jq c3156jq = this.f45558d;
        if (c3156jq != null) {
            return c3156jq;
        }
        C3156jq c3156jq2 = new C3156jq();
        this.f45558d = c3156jq2;
        return c3156jq2;
    }

    @Override // p000.qp3
    /* JADX INFO: renamed from: c */
    public final C0312a mo14487c() {
        C0312a c0312a;
        synchronized (this.f45556b) {
            this.f45555a.getUniqueDrawingId();
            c0312a = new C0312a(new sp3());
        }
        return c0312a;
    }
}
