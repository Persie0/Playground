package p000;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fcf implements fcq {

    /* JADX INFO: renamed from: a */
    private final List f21242a;

    public fcf(List list) {
        this.f21242a = list;
    }

    @Override // p000.fcq
    /* JADX INFO: renamed from: a */
    public final void mo4205a(nho nhoVar) {
        Iterator it = this.f21242a.iterator();
        while (it.hasNext()) {
            ((fcq) it.next()).mo4205a(nhoVar);
        }
    }
}
