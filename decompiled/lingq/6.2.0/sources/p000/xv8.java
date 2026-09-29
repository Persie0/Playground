package p000;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class xv8 extends au8 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AtomicReferenceArray f68858g;

    public xv8(long j, xv8 xv8Var, int i) {
        super(j, xv8Var, i);
        this.f68858g = new AtomicReferenceArray(wv8.f67394f);
    }

    @Override // p000.au8
    /* JADX INFO: renamed from: l */
    public final int mo3062l() {
        return wv8.f67394f;
    }

    @Override // p000.au8
    /* JADX INFO: renamed from: m */
    public final void mo3063m(int i, kn1 kn1Var) {
        this.f68858g.set(i, wv8.f67393e);
        m3064n();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f7522e + ", hashCode=" + hashCode() + ']';
    }
}
