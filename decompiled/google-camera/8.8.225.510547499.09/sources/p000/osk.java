package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class osk extends oln implements ory {

    /* JADX INFO: renamed from: a */
    public static final osk f46496a = new osk();

    private osk() {
        super(ory.f46473c);
    }

    @Override // p000.ory
    /* JADX INFO: renamed from: cY */
    public final orf mo18973cY(boolean z, boolean z2, oni oniVar) {
        return osl.f46497a;
    }

    @Override // p000.ory
    /* JADX INFO: renamed from: cZ */
    public final boolean mo18974cZ() {
        return true;
    }

    @Override // p000.ory
    /* JADX INFO: renamed from: o */
    public final CancellationException mo18975o() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // p000.ory
    /* JADX INFO: renamed from: p */
    public final oqc mo18976p(oqe oqeVar) {
        return osl.f46497a;
    }

    @Override // p000.ory
    /* JADX INFO: renamed from: r */
    public final void mo18977r(CancellationException cancellationException) {
    }

    @Override // p000.ory
    /* JADX INFO: renamed from: t */
    public final boolean mo18978t() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // p000.ory
    /* JADX INFO: renamed from: u */
    public final void mo18979u() {
    }
}
