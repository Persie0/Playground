package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jwa implements jvz {
    @Override // p000.jvz
    /* JADX INFO: renamed from: a */
    public final void mo13607a(kba kbaVar) {
        kbaVar.close();
    }

    @Override // p000.jvz
    /* JADX INFO: renamed from: b */
    public final void mo13608b(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ((kba) it.next()).close();
        }
    }
}
