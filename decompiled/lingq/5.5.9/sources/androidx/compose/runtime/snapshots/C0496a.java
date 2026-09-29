package androidx.compose.runtime.snapshots;

import cm.InterfaceC2056p;
import java.util.Set;
import p267n0.InterfaceC7672c;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0496a implements InterfaceC7672c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC2056p<Set<? extends Object>, AbstractC0497b, C9072e> f3311a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0496a(InterfaceC2056p<? super Set<? extends Object>, ? super AbstractC0497b, C9072e> interfaceC2056p) {
        this.f3311a = interfaceC2056p;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p267n0.InterfaceC7672c
    /* JADX INFO: renamed from: a */
    public final void mo1914a() {
        InterfaceC2056p<Set<? extends Object>, AbstractC0497b, C9072e> interfaceC2056p = this.f3311a;
        synchronized (SnapshotKt.f3262c) {
            try {
                SnapshotKt.f3266g.remove(interfaceC2056p);
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
