package p000;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kdx implements kea {

    /* JADX INFO: renamed from: a */
    public final List f35703a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: a */
    public final synchronized kba m14009a(kea keaVar) {
        keaVar.getClass();
        this.f35703a.add(keaVar);
        return new igy(this, keaVar, 5);
    }

    @Override // p000.kea
    /* JADX INFO: renamed from: e */
    public final synchronized void mo6457e(Throwable th) {
        throw null;
    }

    @Override // p000.kea
    /* JADX INFO: renamed from: f */
    public final synchronized void mo6458f(Throwable th) {
        Iterator it = this.f35703a.iterator();
        while (it.hasNext()) {
            ((kea) it.next()).mo6458f(th);
        }
    }
}
