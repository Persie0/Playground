package androidx.compose.runtime.snapshots;

import cm.InterfaceC2052l;
import dm.C5207g;
import p267n0.C7683n;
import p267n0.InterfaceC7690u;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class NestedReadonlySnapshot extends AbstractC0497b {

    /* JADX INFO: renamed from: e */
    public final AbstractC0497b f3245e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2052l<Object, C9072e> f3246f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedReadonlySnapshot(int i10, SnapshotIdSet snapshotIdSet, final InterfaceC2052l<Object, C9072e> interfaceC2052l, AbstractC0497b abstractC0497b) {
        super(i10, snapshotIdSet);
        C5207g.m11111f(snapshotIdSet, "invalid");
        C5207g.m11111f(abstractC0497b, "parent");
        this.f3245e = abstractC0497b;
        abstractC0497b.mo1867j(this);
        if (interfaceC2052l != null) {
            final InterfaceC2052l<Object, C9072e> interfaceC2052lMo1873f = abstractC0497b.mo1873f();
            if (interfaceC2052lMo1873f != null) {
                interfaceC2052l = new InterfaceC2052l<Object, C9072e>() { // from class: androidx.compose.runtime.snapshots.NestedReadonlySnapshot$readObserver$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(Object obj) {
                        C5207g.m11111f(obj, "state");
                        interfaceC2052l.mo528n(obj);
                        interfaceC2052lMo1873f.mo528n(obj);
                        return C9072e.f47360a;
                    }
                };
            }
        } else {
            interfaceC2052l = abstractC0497b.mo1873f();
        }
        this.f3246f = interfaceC2052l;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: c */
    public final void mo1866c() {
        if (!this.f3314c) {
            int i10 = this.f3313b;
            AbstractC0497b abstractC0497b = this.f3245e;
            if (i10 != abstractC0497b.mo1918d()) {
                m1916a();
            }
            abstractC0497b.mo1868k(this);
            super.mo1866c();
        }
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: f */
    public final InterfaceC2052l<Object, C9072e> mo1873f() {
        return this.f3246f;
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
    public final AbstractC0497b mo1870r(InterfaceC2052l interfaceC2052l) {
        return new NestedReadonlySnapshot(this.f3313b, this.f3312a, interfaceC2052l, this.f3245e);
    }
}
