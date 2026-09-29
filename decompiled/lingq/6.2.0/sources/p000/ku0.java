package p000;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.channels.C3211a;

/* JADX INFO: loaded from: classes.dex */
public final class ku0 extends au8 {

    /* JADX INFO: renamed from: g */
    public final C3211a f48423g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AtomicReferenceArray f48424h;

    public ku0(long j, ku0 ku0Var, C3211a c3211a, int i) {
        super(j, ku0Var, i);
        this.f48423g = c3211a;
        this.f48424h = new AtomicReferenceArray(fj0.f39171b * 2);
    }

    @Override // p000.au8
    /* JADX INFO: renamed from: l */
    public final int mo3062l() {
        return fj0.f39171b;
    }

    @Override // p000.au8
    /* JADX INFO: renamed from: m */
    public final void mo3063m(int i, kn1 kn1Var) {
        C3211a c3211a;
        int i2 = fj0.f39171b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.f48424h.get(i * 2);
        while (true) {
            Object objM15691q = m15691q(i);
            boolean z2 = objM15691q instanceof z1b;
            c3211a = this.f48423g;
            if (z2 || (objM15691q instanceof a2b)) {
                if (m15690p(i, objM15691q, z ? fj0.f39179j : fj0.f39180k)) {
                    m15693s(i, null);
                    m15692r(i, !z);
                    if (z) {
                        c3211a.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (objM15691q == fj0.f39179j || objM15691q == fj0.f39180k) {
                    break;
                }
                if (objM15691q != fj0.f39176g && objM15691q != fj0.f39175f) {
                    if (objM15691q == fj0.f39178i || objM15691q == fj0.f39173d || objM15691q == fj0.f39181l) {
                        return;
                    }
                    C3386nv.m17632s(objM15691q, "unexpected state: ");
                    return;
                }
            }
        }
        m15693s(i, null);
        if (z) {
            c3211a.getClass();
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m15690p(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f48424h;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final Object m15691q(int i) {
        return this.f48424h.get((i * 2) + 1);
    }

    /* JADX INFO: renamed from: r */
    public final void m15692r(int i, boolean z) {
        if (z) {
            C3211a c3211a = this.f48423g;
            c3211a.getClass();
            c3211a.m15468S((this.f7522e * ((long) fj0.f39171b)) + ((long) i));
        }
        m3064n();
    }

    /* JADX INFO: renamed from: s */
    public final void m15693s(int i, Object obj) {
        this.f48424h.set(i * 2, obj);
    }

    /* JADX INFO: renamed from: t */
    public final void m15694t(int i, Object obj) {
        this.f48424h.set((i * 2) + 1, obj);
    }
}
