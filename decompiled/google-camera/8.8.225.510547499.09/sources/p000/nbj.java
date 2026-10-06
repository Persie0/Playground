package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class nbj extends nbz {
    public nbj(Class cls) {
        super("group_by", cls, true);
    }

    @Override // p000.nbz
    /* JADX INFO: renamed from: a */
    public final void mo17261a(Iterator it, nby nbyVar) {
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                nbyVar.mo17308a(this.f41965a, next);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            sb.append(next);
            do {
                sb.append(',');
                sb.append(it.next());
            } while (it.hasNext());
            String str = this.f41965a;
            sb.append(']');
            nbyVar.mo17308a(str, sb.toString());
        }
    }
}
