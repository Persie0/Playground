package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class nbk extends nbz {
    public nbk(Class cls) {
        super("tags", cls, false);
    }

    @Override // p000.nbz
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo17262b(Object obj, nby nbyVar) {
        for (Map.Entry entry : ((nei) obj).f42108c.f42098d) {
            if (((Set) entry.getValue()).isEmpty()) {
                nbyVar.mo17308a((String) entry.getKey(), null);
            } else {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    nbyVar.mo17308a((String) entry.getKey(), it.next());
                }
            }
        }
    }
}
