package p000;

import androidx.glance.session.C0701i;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$LongRef;
import p000.w84;
import p000.wfb;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
public final class w84 implements t16 {

    /* JADX INFO: renamed from: a */
    public final un1 f66513a;

    /* JADX INFO: renamed from: b */
    public final wf1 f66514b;

    /* JADX INFO: renamed from: c */
    public final si0 f66515c;

    /* JADX INFO: renamed from: d */
    public final Object f66516d;

    /* JADX INFO: renamed from: e */
    public int f66517e;

    /* JADX INFO: renamed from: f */
    public long f66518f;

    /* JADX INFO: renamed from: g */
    public sm0 f66519g;

    public w84(C0701i c0701i) {
        wf1 wf1Var = new wf1(16);
        this.f66513a = c0701i;
        this.f66514b = wf1Var;
        this.f66515c = new si0(new ui3() { // from class: androidx.glance.session.c
            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                w84 w84Var = this.f6260a;
                long jLongValue = ((Number) w84Var.f66514b.mo0a()).longValue();
                Ref$LongRef ref$LongRef = new Ref$LongRef();
                Ref$LongRef ref$LongRef2 = new Ref$LongRef();
                synchronized (w84Var.f66516d) {
                    ref$LongRef.f47717a = jLongValue - w84Var.f66518f;
                    ref$LongRef2.f47717a = 1000000000 / ((long) w84Var.f66517e);
                }
                wfb.m23926u(w84Var.f66513a, null, null, new InteractiveFrameClock$onNewAwaiters$2(ref$LongRef, ref$LongRef2, w84Var, jLongValue, null), 3);
                return xfa.f68157a;
            }
        });
        this.f66516d = new Object();
        this.f66517e = 5;
    }

    /* JADX INFO: renamed from: d */
    public final void m23812d() {
        synchronized (this.f66516d) {
            sm0 sm0Var = this.f66519g;
            if (sm0Var != null) {
                sm0Var.mo10141l(null);
            }
        }
    }

    @Override // p000.t16
    /* JADX INFO: renamed from: e */
    public final Object mo1250e(vi3 vi3Var, Continuation continuation) {
        return this.f66515c.mo1250e(vi3Var, continuation);
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
