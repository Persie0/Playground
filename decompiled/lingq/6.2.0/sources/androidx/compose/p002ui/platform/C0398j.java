package androidx.compose.p002ui.platform;

import android.view.Choreographer;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p000.AbstractC3584sr;
import p000.ChoreographerFrameCallbackC3005fl;
import p000.eh0;
import p000.fa4;
import p000.in1;
import p000.jn1;
import p000.kn1;
import p000.sm0;
import p000.t16;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.ui.platform.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0398j implements t16 {

    /* JADX INFO: renamed from: a */
    public final Choreographer f4782a;

    /* JADX INFO: renamed from: b */
    public final C0397i f4783b;

    public C0398j(Choreographer choreographer, C0397i c0397i) {
        this.f4782a = choreographer;
        this.f4783b = c0397i;
    }

    @Override // p000.t16
    /* JADX INFO: renamed from: e */
    public final Object mo1250e(vi3 vi3Var, Continuation continuation) {
        final C0397i c0397i = this.f4783b;
        sm0 sm0Var = new sm0(1, AbstractC3584sr.m21600K(continuation));
        sm0Var.m21468u();
        final ChoreographerFrameCallbackC3005fl choreographerFrameCallbackC3005fl = new ChoreographerFrameCallbackC3005fl(sm0Var, this, vi3Var);
        if (fa4.m11650l(c0397i.f4772c, this.f4782a)) {
            synchronized (c0397i.f4774e) {
                c0397i.f4776g.add(choreographerFrameCallbackC3005fl);
                if (!c0397i.f4779j) {
                    c0397i.f4779j = true;
                    c0397i.f4772c.postFrameCallback(c0397i.f4780k);
                }
            }
            sm0Var.m21470w(new vi3() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p000.vi3
                public final Object invoke(Object obj) {
                    C0397i c0397i2 = c0397i;
                    ChoreographerFrameCallbackC3005fl choreographerFrameCallbackC3005fl2 = choreographerFrameCallbackC3005fl;
                    synchronized (c0397i2.f4774e) {
                        c0397i2.f4776g.remove(choreographerFrameCallbackC3005fl2);
                    }
                    return xfa.f68157a;
                }
            });
        } else {
            this.f4782a.postFrameCallback(choreographerFrameCallbackC3005fl);
            sm0Var.m21470w(new vi3() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p000.vi3
                public final Object invoke(Object obj) {
                    this.f4527b.f4782a.removeFrameCallback(choreographerFrameCallbackC3005fl);
                    return xfa.f68157a;
                }
            });
        }
        Object objM21466r = sm0Var.m21466r();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM21466r;
    }

    @Override // p000.kn1
    public final Object fold(Object obj, zi3 zi3Var) {
        return zi3Var.invoke(obj, this);
    }

    @Override // p000.kn1
    public final in1 get(jn1 jn1Var) {
        return eh0.m11141v(this, jn1Var);
    }

    @Override // p000.kn1
    public final kn1 minusKey(jn1 jn1Var) {
        return eh0.m11107D(this, jn1Var);
    }

    @Override // p000.kn1
    public final kn1 plus(kn1 kn1Var) {
        return eh0.m11113J(this, kn1Var);
    }
}
