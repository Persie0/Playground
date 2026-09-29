package p267n0;

import androidx.compose.runtime.snapshots.AbstractC0497b;
import androidx.compose.runtime.snapshots.GlobalSnapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.compose.runtime.snapshots.SnapshotKt;
import cm.InterfaceC2052l;
import dm.C5207g;
import sl.C9072e;

/* JADX INFO: renamed from: n0.y */
/* JADX INFO: loaded from: classes.dex */
public final class C7694y extends AbstractC0497b {

    /* JADX INFO: renamed from: e */
    public final AbstractC0497b f42201e;

    /* JADX INFO: renamed from: f */
    public final boolean f42202f;

    /* JADX INFO: renamed from: g */
    public final boolean f42203g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2052l<Object, C9072e> f42204h;

    public C7694y(AbstractC0497b abstractC0497b, InterfaceC2052l interfaceC2052l, boolean z10) {
        InterfaceC2052l<Object, C9072e> interfaceC2052lMo1873f;
        super(0, SnapshotIdSet.f3249e);
        this.f42201e = abstractC0497b;
        this.f42202f = false;
        this.f42203g = z10;
        this.f42204h = SnapshotKt.m1892k(interfaceC2052l, (abstractC0497b == null || (interfaceC2052lMo1873f = abstractC0497b.mo1873f()) == null) ? SnapshotKt.f3268i.get().f42151e : interfaceC2052lMo1873f, false);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: c */
    public final void mo1866c() {
        AbstractC0497b abstractC0497b;
        this.f3314c = true;
        if (!this.f42203g || (abstractC0497b = this.f42201e) == null) {
            return;
        }
        abstractC0497b.mo1866c();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: d */
    public final int mo1918d() {
        return m15285s().mo1918d();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: e */
    public final SnapshotIdSet mo1919e() {
        return m15285s().mo1919e();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: f */
    public final InterfaceC2052l<Object, C9072e> mo1873f() {
        return this.f42204h;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: g */
    public final boolean mo1874g() {
        return m15285s().mo1874g();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: h */
    public final InterfaceC2052l<Object, C9072e> mo1875h() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: j */
    public final void mo1867j(AbstractC0497b abstractC0497b) {
        C5207g.m11111f(abstractC0497b, "snapshot");
        C7683n.m15280a();
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: k */
    public final void mo1868k(AbstractC0497b abstractC0497b) {
        C5207g.m11111f(abstractC0497b, "snapshot");
        C7683n.m15280a();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: l */
    public final void mo1869l() {
        m15285s().mo1869l();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: m */
    public final void mo1876m(InterfaceC7690u interfaceC7690u) {
        C5207g.m11111f(interfaceC7690u, "state");
        m15285s().mo1876m(interfaceC7690u);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: r */
    public final AbstractC0497b mo1870r(InterfaceC2052l<Object, C9072e> interfaceC2052l) {
        InterfaceC2052l<Object, C9072e> interfaceC2052lM1892k = SnapshotKt.m1892k(interfaceC2052l, this.f42204h, true);
        return !this.f42202f ? SnapshotKt.m1888g(m15285s().mo1870r(null), interfaceC2052lM1892k, true) : m15285s().mo1870r(interfaceC2052lM1892k);
    }

    /* JADX INFO: renamed from: s */
    public final AbstractC0497b m15285s() {
        AbstractC0497b abstractC0497b = this.f42201e;
        if (abstractC0497b != null) {
            return abstractC0497b;
        }
        GlobalSnapshot globalSnapshot = SnapshotKt.f3268i.get();
        C5207g.m11110e(globalSnapshot, "currentGlobalSnapshot.get()");
        return globalSnapshot;
    }
}
