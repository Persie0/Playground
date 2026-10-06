package p000;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ncv extends ncy {

    /* JADX INFO: renamed from: a */
    private final Map f42029a;

    /* JADX INFO: renamed from: b */
    private final Map f42030b;

    /* JADX INFO: renamed from: c */
    private final ncw f42031c;

    public ncv(ncu ncuVar) {
        HashMap map = new HashMap();
        this.f42029a = map;
        HashMap map2 = new HashMap();
        this.f42030b = map2;
        map.putAll(ncuVar.f42025c);
        map2.putAll(ncuVar.f42026d);
        this.f42031c = ncuVar.f42028f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.ncy
    /* JADX INFO: renamed from: a */
    protected final void mo17348a(nbz nbzVar, Object obj, Object obj2) {
        ncx ncxVar = (ncx) this.f42029a.get(nbzVar);
        if (ncxVar != null) {
            ncxVar.mo17346a(nbzVar, obj, obj2);
        } else {
            nbzVar.m17311e(obj, obj2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.ncy
    /* JADX INFO: renamed from: b */
    protected final void mo17349b(nbz nbzVar, Iterator it, Object obj) {
        ncw ncwVar = (ncw) this.f42030b.get(nbzVar);
        if (ncwVar != null) {
            ncwVar.mo17347a(nbzVar, it, obj);
        } else if (this.f42031c != null && !this.f42029a.containsKey(nbzVar)) {
            nbzVar.m17312f(it, obj);
        } else {
            while (it.hasNext()) {
                mo17348a(nbzVar, it.next(), obj);
            }
        }
    }
}
