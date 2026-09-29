package p000;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class q60 extends i16 {

    /* JADX INFO: renamed from: b */
    public p60 f57304b;

    /* JADX INFO: renamed from: c */
    public xb1 f57305c;

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new p60(this);
    }

    public final int hashCode() {
        return 234;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "AwaitFirstLayoutModifier";
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final /* bridge */ /* synthetic */ void mo23o(d16 d16Var) {
    }

    /* JADX INFO: renamed from: p */
    public final Object m19677p(ContinuationImpl continuationImpl) throws Throwable {
        xb1 xb1VarM20377b = this.f57305c;
        if (xb1VarM20377b == null) {
            xb1VarM20377b = r46.m20377b();
            this.f57305c = xb1VarM20377b;
            p60 p60Var = this.f57304b;
            if (p60Var != null && p60Var.f34836I) {
                p60Var.f55628J = omd.m18140b0(p60Var, 0L, new C3704w(2, p60Var, p60Var.f55629K));
            }
        }
        Object objM15517w = xb1VarM20377b.m15517w(continuationImpl);
        return objM15517w == CoroutineSingletons.COROUTINE_SUSPENDED ? objM15517w : xfa.f68157a;
    }
}
