package androidx.compose.runtime.snapshots;

import ae.C0062b;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import dm.C5207g;
import p081e0.C5298b1;
import p267n0.C7670a;
import p267n0.C7693x;
import p267n0.InterfaceC7690u;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0497b {

    /* JADX INFO: renamed from: a */
    public SnapshotIdSet f3312a;

    /* JADX INFO: renamed from: b */
    public int f3313b;

    /* JADX INFO: renamed from: c */
    public boolean f3314c;

    /* JADX INFO: renamed from: d */
    public int f3315d;

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.b$a */
    public static final class a {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public static Object m1924a(InterfaceC2041a interfaceC2041a, InterfaceC2052l interfaceC2052l) {
            AbstractC0497b c7693x;
            C5207g.m11111f(interfaceC2041a, "block");
            if (interfaceC2052l == null) {
                return interfaceC2041a.mo807E();
            }
            AbstractC0497b abstractC0497b = (AbstractC0497b) SnapshotKt.f3261b.m11437d();
            if (abstractC0497b == null || (abstractC0497b instanceof C7670a)) {
                c7693x = new C7693x(abstractC0497b instanceof C7670a ? (C7670a) abstractC0497b : null, interfaceC2052l, null, true, false);
            } else {
                if (interfaceC2052l == null) {
                    return interfaceC2041a.mo807E();
                }
                c7693x = abstractC0497b.mo1870r(interfaceC2052l);
            }
            try {
                AbstractC0497b abstractC0497bM1920i = c7693x.m1920i();
                try {
                    Object objMo807E = interfaceC2041a.mo807E();
                    AbstractC0497b.m1915o(abstractC0497bM1920i);
                    c7693x.mo1866c();
                    return objMo807E;
                } catch (Throwable th2) {
                    AbstractC0497b.m1915o(abstractC0497bM1920i);
                    throw th2;
                }
            } catch (Throwable th3) {
                c7693x.mo1866c();
                throw th3;
            }
        }
    }

    public AbstractC0497b(int i10, SnapshotIdSet snapshotIdSet) {
        int iM15275a;
        int iM248B;
        this.f3312a = snapshotIdSet;
        this.f3313b = i10;
        if (i10 != 0) {
            SnapshotIdSet snapshotIdSetMo1919e = mo1919e();
            InterfaceC2052l<SnapshotIdSet, C9072e> interfaceC2052l = SnapshotKt.f3260a;
            C5207g.m11111f(snapshotIdSetMo1919e, "invalid");
            int[] iArr = snapshotIdSetMo1919e.f3253d;
            if (iArr != null) {
                i10 = iArr[0];
            } else {
                long j10 = snapshotIdSetMo1919e.f3251b;
                int i11 = snapshotIdSetMo1919e.f3252c;
                if (j10 != 0) {
                    iM248B = C0062b.m248B(j10);
                } else {
                    long j11 = snapshotIdSetMo1919e.f3250a;
                    if (j11 != 0) {
                        i11 += 64;
                        iM248B = C0062b.m248B(j11);
                    }
                }
                i10 = iM248B + i11;
            }
            synchronized (SnapshotKt.f3262c) {
                iM15275a = SnapshotKt.f3265f.m15275a(i10);
            }
        } else {
            iM15275a = -1;
        }
        this.f3315d = iM15275a;
    }

    /* JADX INFO: renamed from: o */
    public static void m1915o(AbstractC0497b abstractC0497b) {
        SnapshotKt.f3261b.m11439h(abstractC0497b);
    }

    /* JADX INFO: renamed from: a */
    public final void m1916a() {
        synchronized (SnapshotKt.f3262c) {
            try {
                mo1917b();
                mo1921n();
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo1917b() {
        SnapshotKt.f3263d = SnapshotKt.f3263d.m1878f(mo1918d());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public void mo1866c() {
        this.f3314c = true;
        synchronized (SnapshotKt.f3262c) {
            try {
                int i10 = this.f3315d;
                if (i10 >= 0) {
                    SnapshotKt.m1901t(i10);
                    this.f3315d = -1;
                }
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public int mo1918d() {
        return this.f3313b;
    }

    /* JADX INFO: renamed from: e */
    public SnapshotIdSet mo1919e() {
        return this.f3312a;
    }

    /* JADX INFO: renamed from: f */
    public abstract InterfaceC2052l<Object, C9072e> mo1873f();

    /* JADX INFO: renamed from: g */
    public abstract boolean mo1874g();

    /* JADX INFO: renamed from: h */
    public abstract InterfaceC2052l<Object, C9072e> mo1875h();

    /* JADX INFO: renamed from: i */
    public final AbstractC0497b m1920i() {
        C5298b1 c5298b1 = SnapshotKt.f3261b;
        AbstractC0497b abstractC0497b = (AbstractC0497b) c5298b1.m11437d();
        c5298b1.m11439h(this);
        return abstractC0497b;
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo1867j(AbstractC0497b abstractC0497b);

    /* JADX INFO: renamed from: k */
    public abstract void mo1868k(AbstractC0497b abstractC0497b);

    /* JADX INFO: renamed from: l */
    public abstract void mo1869l();

    /* JADX INFO: renamed from: m */
    public abstract void mo1876m(InterfaceC7690u interfaceC7690u);

    /* JADX INFO: renamed from: n */
    public void mo1921n() {
        int i10 = this.f3315d;
        if (i10 >= 0) {
            SnapshotKt.m1901t(i10);
            this.f3315d = -1;
        }
    }

    /* JADX INFO: renamed from: p */
    public void mo1922p(int i10) {
        this.f3313b = i10;
    }

    /* JADX INFO: renamed from: q */
    public void mo1923q(SnapshotIdSet snapshotIdSet) {
        C5207g.m11111f(snapshotIdSet, "<set-?>");
        this.f3312a = snapshotIdSet;
    }

    /* JADX INFO: renamed from: r */
    public abstract AbstractC0497b mo1870r(InterfaceC2052l<Object, C9072e> interfaceC2052l);
}
