package p000;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ndb {

    /* JADX INFO: renamed from: a */
    private static final ncx f42032a = new ncz();

    /* JADX INFO: renamed from: b */
    private static final ncw f42033b = new nda();

    /* JADX INFO: renamed from: a */
    public static ncy m17350a(Set set) {
        ncu ncuVar = new ncu(f42032a);
        ncuVar.f42028f = f42033b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            nbz nbzVar = (nbz) it.next();
            nea.m17397k(nbzVar, "key");
            if (nbzVar.f41966b) {
                ncw ncwVar = ncu.f42024b;
                nea.m17397k(nbzVar, "key");
                nea.m17395i(nbzVar.f41966b, "key must be repeating");
                ncuVar.f42025c.remove(nbzVar);
                ncuVar.f42026d.put(nbzVar, ncwVar);
            } else {
                ncx ncxVar = ncu.f42023a;
                nea.m17397k(nbzVar, "key");
                ncuVar.f42026d.remove(nbzVar);
                ncuVar.f42025c.put(nbzVar, ncxVar);
            }
        }
        return new ncv(ncuVar);
    }
}
