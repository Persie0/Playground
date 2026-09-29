package androidx.compose.runtime;

import java.util.ArrayList;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.C3552rx;
import p000.cm1;
import p000.eh0;
import p000.in1;
import p000.jn1;
import p000.kn1;
import p000.sm0;
import p000.t16;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.runtime.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0277e implements t16 {

    /* JADX INFO: renamed from: a */
    public final t16 f3739a;

    /* JADX INFO: renamed from: b */
    public final C3552rx f3740b = new C3552rx();

    public C0277e(t16 t16Var) {
        this.f3739a = t16Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.t16
    /* JADX INFO: renamed from: e */
    public final Object mo1250e(vi3 vi3Var, Continuation continuation) throws Throwable {
        PausableMonotonicFrameClock$withFrameNanos$1 pausableMonotonicFrameClock$withFrameNanos$1;
        boolean z;
        Object objM21466r;
        if (continuation instanceof PausableMonotonicFrameClock$withFrameNanos$1) {
            pausableMonotonicFrameClock$withFrameNanos$1 = (PausableMonotonicFrameClock$withFrameNanos$1) continuation;
            int i = pausableMonotonicFrameClock$withFrameNanos$1.f3668d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pausableMonotonicFrameClock$withFrameNanos$1.f3668d = i - Integer.MIN_VALUE;
            } else {
                pausableMonotonicFrameClock$withFrameNanos$1 = new PausableMonotonicFrameClock$withFrameNanos$1(this, continuation);
            }
        } else {
            pausableMonotonicFrameClock$withFrameNanos$1 = new PausableMonotonicFrameClock$withFrameNanos$1(this, continuation);
        }
        Object obj = pausableMonotonicFrameClock$withFrameNanos$1.f3666b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pausableMonotonicFrameClock$withFrameNanos$1.f3668d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            C3552rx c3552rx = this.f3740b;
            pausableMonotonicFrameClock$withFrameNanos$1.f3665a = vi3Var;
            pausableMonotonicFrameClock$withFrameNanos$1.f3668d = 1;
            synchronized (c3552rx.f59987b) {
                z = c3552rx.f59986a;
            }
            if (z) {
                objM21466r = xfa.f68157a;
            } else {
                sm0 sm0Var = new sm0(1, AbstractC3584sr.m21600K(pausableMonotonicFrameClock$withFrameNanos$1));
                sm0Var.m21468u();
                synchronized (c3552rx.f59987b) {
                    ((ArrayList) c3552rx.f59988c).add(sm0Var);
                }
                sm0Var.m21470w(new cm1(3, c3552rx, sm0Var));
                objM21466r = sm0Var.m21466r();
                if (objM21466r != coroutineSingletons) {
                    objM21466r = xfa.f68157a;
                }
            }
            if (objM21466r != coroutineSingletons) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        vi3Var = pausableMonotonicFrameClock$withFrameNanos$1.f3665a;
        AbstractC3193b.m15359b(obj);
        t16 t16Var = this.f3739a;
        pausableMonotonicFrameClock$withFrameNanos$1.f3665a = null;
        pausableMonotonicFrameClock$withFrameNanos$1.f3668d = 2;
        Object objMo1250e = t16Var.mo1250e(vi3Var, pausableMonotonicFrameClock$withFrameNanos$1);
        return objMo1250e == coroutineSingletons ? coroutineSingletons : objMo1250e;
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
