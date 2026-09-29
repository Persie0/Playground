package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class au8 extends gg1 implements dm6 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7521f = AtomicIntegerFieldUpdater.newUpdater(au8.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* JADX INFO: renamed from: e */
    public final long f7522e;

    public au8(long j, au8 au8Var, int i) {
        super(au8Var);
        this.f7522e = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // p000.gg1
    /* JADX INFO: renamed from: g */
    public final boolean mo3060g() {
        return f7521f.get(this) == mo3062l() && m12574d() != null;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m3061k() {
        return f7521f.addAndGet(this, -65536) == mo3062l() && m12574d() != null;
    }

    /* JADX INFO: renamed from: l */
    public abstract int mo3062l();

    /* JADX INFO: renamed from: m */
    public abstract void mo3063m(int i, kn1 kn1Var);

    /* JADX INFO: renamed from: n */
    public final void m3064n() {
        if (f7521f.incrementAndGet(this) == mo3062l()) {
            m12578i();
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m3065o() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f7521f;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == mo3062l() && m12574d() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
