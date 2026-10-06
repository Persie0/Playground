package p000;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class noj extends noh {
    @Override // p000.noh
    /* JADX INFO: renamed from: a */
    public final int mo17565a(nok nokVar) {
        int i;
        synchronized (nokVar) {
            i = nokVar.remaining - 1;
            nokVar.remaining = i;
        }
        return i;
    }

    @Override // p000.noh
    /* JADX INFO: renamed from: b */
    public final void mo17566b(nok nokVar, Set set) {
        synchronized (nokVar) {
            if (nokVar.seenExceptions == null) {
                nokVar.seenExceptions = set;
            }
        }
    }
}
