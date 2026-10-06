package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class aqa {

    /* JADX INFO: renamed from: a */
    private final apt f2103a;

    /* JADX INFO: renamed from: b */
    private final AtomicBoolean f2104b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    private final ojy f2105c = lkm.m15593t(new C0910po(this, 5));

    public aqa(apt aptVar) {
        this.f2103a = aptVar;
    }

    /* JADX INFO: renamed from: a */
    private final arf m1851a() {
        return (arf) this.f2105c.mo18586a();
    }

    /* JADX INFO: renamed from: d */
    protected abstract String mo1852d();

    /* JADX INFO: renamed from: e */
    public final arf m1853e() {
        this.f2103a.m1823k();
        return this.f2104b.compareAndSet(false, true) ? m1851a() : m1854f();
    }

    /* JADX INFO: renamed from: f */
    public final arf m1854f() {
        return this.f2103a.m1832t(mo1852d());
    }

    /* JADX INFO: renamed from: g */
    public final void m1855g(arf arfVar) {
        arfVar.getClass();
        if (arfVar == m1851a()) {
            this.f2104b.set(false);
        }
    }
}
