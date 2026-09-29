package p000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class si0 implements t16 {

    /* JADX INFO: renamed from: a */
    public final ui3 f60885a;

    /* JADX INFO: renamed from: b */
    public final w41 f60886b = new w41(3);

    public si0(ui3 ui3Var) {
        this.f60885a = ui3Var;
    }

    @Override // p000.t16
    /* JADX INFO: renamed from: e */
    public final Object mo1250e(vi3 vi3Var, Continuation continuation) {
        sm0 sm0Var = new sm0(1, AbstractC3584sr.m21600K(continuation));
        sm0Var.m21468u();
        qi0 qi0Var = new qi0();
        qi0Var.f57800a = sm0Var;
        qi0Var.f57801b = vi3Var;
        sm0Var.m21470w(new ri0(this.f60886b.m23723j(qi0Var, this.f60885a), 0));
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
