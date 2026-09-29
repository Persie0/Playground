package p267n0;

import androidx.compose.runtime.snapshots.AbstractC0497b;
import androidx.compose.runtime.snapshots.GlobalSnapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.compose.runtime.snapshots.SnapshotKt;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.HashSet;
import java.util.Set;
import sl.C9072e;

/* JADX INFO: renamed from: n0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C7693x extends C7670a {

    /* JADX INFO: renamed from: l */
    public final C7670a f42196l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC2052l<Object, C9072e> f42197m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC2052l<Object, C9072e> f42198n;

    /* JADX INFO: renamed from: o */
    public final boolean f42199o;

    /* JADX INFO: renamed from: p */
    public final boolean f42200p;

    public C7693x(C7670a c7670a, InterfaceC2052l<Object, C9072e> interfaceC2052l, InterfaceC2052l<Object, C9072e> interfaceC2052l2, boolean z10, boolean z11) {
        InterfaceC2052l<Object, C9072e> interfaceC2052l3;
        InterfaceC2052l<Object, C9072e> interfaceC2052l4;
        super(0, SnapshotIdSet.f3249e, SnapshotKt.m1892k(interfaceC2052l, (c7670a == null || (interfaceC2052l4 = c7670a.f42151e) == null) ? SnapshotKt.f3268i.get().f42151e : interfaceC2052l4, z10), SnapshotKt.m1883b(interfaceC2052l2, (c7670a == null || (interfaceC2052l3 = c7670a.f42152f) == null) ? SnapshotKt.f3268i.get().f42152f : interfaceC2052l3));
        this.f42196l = c7670a;
        this.f42197m = interfaceC2052l;
        this.f42198n = interfaceC2052l2;
        this.f42199o = z10;
        this.f42200p = z11;
    }

    /* JADX INFO: renamed from: A */
    public final C7670a m15284A() {
        C7670a c7670a = this.f42196l;
        if (c7670a != null) {
            return c7670a;
        }
        GlobalSnapshot globalSnapshot = SnapshotKt.f3268i.get();
        C5207g.m11110e(globalSnapshot, "currentGlobalSnapshot.get()");
        return globalSnapshot;
    }

    @Override // p267n0.C7670a, androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: c */
    public final void mo1866c() {
        C7670a c7670a;
        this.f3314c = true;
        if (this.f42200p && (c7670a = this.f42196l) != null) {
            c7670a.mo1866c();
        }
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: d */
    public final int mo1918d() {
        return m15284A().mo1918d();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: e */
    public final SnapshotIdSet mo1919e() {
        return m15284A().mo1919e();
    }

    @Override // p267n0.C7670a, androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: g */
    public final boolean mo1874g() {
        return m15284A().mo1874g();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p267n0.C7670a, androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: j */
    public final void mo1867j(AbstractC0497b abstractC0497b) {
        C5207g.m11111f(abstractC0497b, "snapshot");
        C7683n.m15280a();
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p267n0.C7670a, androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: k */
    public final void mo1868k(AbstractC0497b abstractC0497b) {
        C5207g.m11111f(abstractC0497b, "snapshot");
        C7683n.m15280a();
        throw null;
    }

    @Override // p267n0.C7670a, androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: l */
    public final void mo1869l() {
        m15284A().mo1869l();
    }

    @Override // p267n0.C7670a, androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: m */
    public final void mo1876m(InterfaceC7690u interfaceC7690u) {
        C5207g.m11111f(interfaceC7690u, "state");
        m15284A().mo1876m(interfaceC7690u);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: p */
    public final void mo1922p(int i10) {
        C7683n.m15280a();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: q */
    public final void mo1923q(SnapshotIdSet snapshotIdSet) {
        C5207g.m11111f(snapshotIdSet, "value");
        C7683n.m15280a();
        throw null;
    }

    @Override // p267n0.C7670a, androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: r */
    public final AbstractC0497b mo1870r(InterfaceC2052l<Object, C9072e> interfaceC2052l) {
        InterfaceC2052l<Object, C9072e> interfaceC2052lM1892k = SnapshotKt.m1892k(interfaceC2052l, this.f42151e, true);
        return !this.f42199o ? SnapshotKt.m1888g(m15284A().mo1870r(null), interfaceC2052lM1892k, true) : m15284A().mo1870r(interfaceC2052lM1892k);
    }

    @Override // p267n0.C7670a
    /* JADX INFO: renamed from: t */
    public final AbstractC7674e mo1871t() {
        return m15284A().mo1871t();
    }

    @Override // p267n0.C7670a
    /* JADX INFO: renamed from: u */
    public final Set<InterfaceC7690u> mo15270u() {
        return m15284A().mo15270u();
    }

    @Override // p267n0.C7670a
    /* JADX INFO: renamed from: x */
    public final void mo15273x(HashSet hashSet) {
        C7683n.m15280a();
        throw null;
    }

    @Override // p267n0.C7670a
    /* JADX INFO: renamed from: y */
    public final C7670a mo1872y(InterfaceC2052l<Object, C9072e> interfaceC2052l, InterfaceC2052l<Object, C9072e> interfaceC2052l2) {
        InterfaceC2052l<Object, C9072e> interfaceC2052lM1892k = SnapshotKt.m1892k(interfaceC2052l, this.f42151e, true);
        InterfaceC2052l<Object, C9072e> interfaceC2052lM1883b = SnapshotKt.m1883b(interfaceC2052l2, this.f42152f);
        return !this.f42199o ? new C7693x(m15284A().mo1872y(null, interfaceC2052lM1883b), interfaceC2052lM1892k, interfaceC2052lM1883b, false, true) : m15284A().mo1872y(interfaceC2052lM1892k, interfaceC2052lM1883b);
    }
}
