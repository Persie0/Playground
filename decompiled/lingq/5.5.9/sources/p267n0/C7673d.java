package p267n0;

import androidx.compose.runtime.snapshots.AbstractC0497b;
import androidx.compose.runtime.snapshots.NestedReadonlySnapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.compose.runtime.snapshots.SnapshotKt;
import cm.InterfaceC2052l;
import dm.C5207g;
import sl.C9072e;

/* JADX INFO: renamed from: n0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7673d extends AbstractC0497b {

    /* JADX INFO: renamed from: e */
    public final InterfaceC2052l<Object, C9072e> f42160e;

    /* JADX INFO: renamed from: f */
    public int f42161f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7673d(int i10, SnapshotIdSet snapshotIdSet, InterfaceC2052l<Object, C9072e> interfaceC2052l) {
        super(i10, snapshotIdSet);
        C5207g.m11111f(snapshotIdSet, "invalid");
        this.f42160e = interfaceC2052l;
        this.f42161f = 1;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: c */
    public final void mo1866c() {
        if (!this.f3314c) {
            mo1868k(this);
            super.mo1866c();
        }
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: f */
    public final InterfaceC2052l<Object, C9072e> mo1873f() {
        return this.f42160e;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: g */
    public final boolean mo1874g() {
        return true;
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
        this.f42161f++;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: k */
    public final void mo1868k(AbstractC0497b abstractC0497b) {
        C5207g.m11111f(abstractC0497b, "snapshot");
        int i10 = this.f42161f - 1;
        this.f42161f = i10;
        if (i10 == 0) {
            m1916a();
        }
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: l */
    public final void mo1869l() {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: m */
    public final void mo1876m(InterfaceC7690u interfaceC7690u) {
        C5207g.m11111f(interfaceC7690u, "state");
        InterfaceC2052l<SnapshotIdSet, C9072e> interfaceC2052l = SnapshotKt.f3260a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: r */
    public final AbstractC0497b mo1870r(InterfaceC2052l<Object, C9072e> interfaceC2052l) {
        SnapshotKt.m1885d(this);
        return new NestedReadonlySnapshot(this.f3313b, this.f3312a, interfaceC2052l, this);
    }
}
