package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.sync.C3248a;

/* JADX INFO: loaded from: classes.dex */
public final class d76 implements qm0, z1b {

    /* JADX INFO: renamed from: a */
    public final sm0 f35085a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3248a f35086b;

    public d76(C3248a c3248a, sm0 sm0Var) {
        this.f35086b = c3248a;
        this.f35085a = sm0Var;
    }

    @Override // p000.z1b
    /* JADX INFO: renamed from: a */
    public final void mo10138a(au8 au8Var, int i) {
        this.f35085a.mo10138a(au8Var, i);
    }

    @Override // p000.qm0
    /* JADX INFO: renamed from: d */
    public final C0842cc mo10139d(Object obj, aj3 aj3Var) {
        C3248a c3248a = this.f35086b;
        rm0 rm0Var = new rm0(10, c3248a, this);
        C0842cc c0842ccM21459H = this.f35085a.m21459H((xfa) obj, rm0Var);
        if (c0842ccM21459H != null) {
            C3248a.f48177j.set(c3248a, null);
        }
        return c0842ccM21459H;
    }

    @Override // kotlin.coroutines.Continuation
    public final kn1 getContext() {
        return this.f35085a.f61016e;
    }

    @Override // p000.qm0
    /* JADX INFO: renamed from: j */
    public final void mo10140j(Object obj, aj3 aj3Var) throws DispatchException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3248a.f48177j;
        C3248a c3248a = this.f35086b;
        atomicReferenceFieldUpdater.set(c3248a, null);
        fy4 fy4Var = new fy4(c3248a, this);
        sm0 sm0Var = this.f35085a;
        sm0Var.m21457E(xfa.f68157a, sm0Var.f49653c, new rm0(fy4Var, 0));
    }

    @Override // p000.qm0
    /* JADX INFO: renamed from: l */
    public final boolean mo10141l(Throwable th) {
        return this.f35085a.mo10141l(th);
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.f35085a.resumeWith(obj);
    }

    @Override // p000.qm0
    /* JADX INFO: renamed from: s */
    public final void mo10142s(Object obj) throws DispatchException {
        this.f35085a.mo10142s(obj);
    }
}
