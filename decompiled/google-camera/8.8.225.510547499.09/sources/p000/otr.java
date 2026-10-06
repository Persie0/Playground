package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class otr extends opp implements otq {

    /* JADX INFO: renamed from: b */
    public final otq f46543b;

    public otr(oly olyVar, otq otqVar) {
        super(olyVar);
        this.f46543b = otqVar;
    }

    @Override // p000.ouh
    /* JADX INFO: renamed from: A */
    public final boolean mo19053A() {
        throw null;
    }

    @Override // p000.osg
    /* JADX INFO: renamed from: B */
    public final void mo19002B(Throwable th) throws Throwable {
        CancellationException cancellationExceptionM18992K = osg.m18992K(this, th);
        this.f46543b.mo19049r(cancellationExceptionM18992K);
        m19005E(cancellationExceptionM18992K);
    }

    @Override // p000.oud
    /* JADX INFO: renamed from: b */
    public final Object mo19037b(ols olsVar) {
        throw null;
    }

    @Override // p000.oud
    /* JADX INFO: renamed from: c */
    public final Object mo19038c(ols olsVar) {
        Object objC = this.f46543b.mo19038c(olsVar);
        oma omaVar = oma.COROUTINE_SUSPENDED;
        return objC;
    }

    @Override // p000.oud
    /* JADX INFO: renamed from: k */
    public final boolean mo19046k() {
        throw null;
    }

    @Override // p000.oud
    /* JADX INFO: renamed from: m */
    public final ote mo19048m() {
        throw null;
    }

    @Override // p000.ouh
    /* JADX INFO: renamed from: q */
    public final Object mo19056q(Object obj, ols olsVar) {
        return this.f46543b.mo19056q(obj, olsVar);
    }

    @Override // p000.osg, p000.ory
    /* JADX INFO: renamed from: r */
    public final void mo18977r(CancellationException cancellationException) throws Throwable {
        if (mo18978t()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new orz(mo18857a(), null, this);
        }
        mo19002B(cancellationException);
    }

    @Override // p000.ouh
    /* JADX INFO: renamed from: s */
    public final Object mo19057s(Object obj) {
        return this.f46543b.mo19057s(obj);
    }

    @Override // p000.ouh
    /* JADX INFO: renamed from: w */
    public final void mo19061w(oni oniVar) {
        throw null;
    }

    @Override // p000.ouh
    /* JADX INFO: renamed from: x */
    public final boolean mo19062x(Throwable th) {
        return this.f46543b.mo19062x(th);
    }
}
