package androidx.compose.runtime.snapshots;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C6752c;
import p267n0.AbstractC7674e;
import p267n0.C7670a;
import p267n0.C7673d;
import p267n0.C7683n;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class GlobalSnapshot extends C7670a {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public GlobalSnapshot(int i10, SnapshotIdSet snapshotIdSet) {
        InterfaceC2052l<Object, C9072e> interfaceC2052l;
        synchronized (SnapshotKt.f3262c) {
            try {
                ArrayList arrayList = SnapshotKt.f3267h;
                final ArrayList arrayListM13454v0 = arrayList.isEmpty() ^ true ? C6752c.m13454v0(arrayList) : null;
                if (arrayListM13454v0 != null) {
                    interfaceC2052l = (InterfaceC2052l) C6752c.m13445m0(arrayListM13454v0);
                    if (interfaceC2052l == null) {
                        interfaceC2052l = new InterfaceC2052l<Object, C9072e>() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(Object obj) {
                                C5207g.m11111f(obj, "state");
                                List<InterfaceC2052l<Object, C9072e>> list = arrayListM13454v0;
                                int size = list.size();
                                for (int i11 = 0; i11 < size; i11++) {
                                    list.get(i11).mo528n(obj);
                                }
                                return C9072e.f47360a;
                            }
                        };
                    }
                } else {
                    interfaceC2052l = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        super(i10, snapshotIdSet, null, interfaceC2052l);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p267n0.C7670a, androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: c */
    public final void mo1866c() {
        synchronized (SnapshotKt.f3262c) {
            int i10 = this.f3315d;
            if (i10 >= 0) {
                SnapshotKt.m1901t(i10);
                this.f3315d = -1;
            }
            C9072e c9072e = C9072e.f47360a;
        }
    }

    @Override // p267n0.C7670a, androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: j */
    public final void mo1867j(AbstractC0497b abstractC0497b) {
        C5207g.m11111f(abstractC0497b, "snapshot");
        C7683n.m15280a();
        throw null;
    }

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
        SnapshotKt.m1882a();
    }

    @Override // p267n0.C7670a, androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: r */
    public final AbstractC0497b mo1870r(final InterfaceC2052l<Object, C9072e> interfaceC2052l) {
        return (AbstractC0497b) SnapshotKt.m1887f(new SnapshotKt$takeNewSnapshot$1(new InterfaceC2052l<SnapshotIdSet, C7673d>() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot$takeNestedSnapshot$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C7673d mo528n(SnapshotIdSet snapshotIdSet) {
                int i10;
                SnapshotIdSet snapshotIdSet2 = snapshotIdSet;
                C5207g.m11111f(snapshotIdSet2, "invalid");
                synchronized (SnapshotKt.f3262c) {
                    i10 = SnapshotKt.f3264e;
                    SnapshotKt.f3264e = i10 + 1;
                }
                return new C7673d(i10, snapshotIdSet2, interfaceC2052l);
            }
        }));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p267n0.C7670a
    /* JADX INFO: renamed from: t */
    public final AbstractC7674e mo1871t() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }

    @Override // p267n0.C7670a
    /* JADX INFO: renamed from: y */
    public final C7670a mo1872y(final InterfaceC2052l<Object, C9072e> interfaceC2052l, final InterfaceC2052l<Object, C9072e> interfaceC2052l2) {
        return (C7670a) ((AbstractC0497b) SnapshotKt.m1887f(new SnapshotKt$takeNewSnapshot$1(new InterfaceC2052l<SnapshotIdSet, C7670a>() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot$takeNestedMutableSnapshot$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C7670a mo528n(SnapshotIdSet snapshotIdSet) {
                int i10;
                SnapshotIdSet snapshotIdSet2 = snapshotIdSet;
                C5207g.m11111f(snapshotIdSet2, "invalid");
                synchronized (SnapshotKt.f3262c) {
                    try {
                        i10 = SnapshotKt.f3264e;
                        SnapshotKt.f3264e = i10 + 1;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return new C7670a(i10, snapshotIdSet2, interfaceC2052l, interfaceC2052l2);
            }
        })));
    }
}
