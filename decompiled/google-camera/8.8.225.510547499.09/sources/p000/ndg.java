package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ndg extends ndh {

    /* JADX INFO: renamed from: a */
    private final Map f42043a;

    public ndg(ncr ncrVar, ncr ncrVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        m17356d(linkedHashMap, ncrVar);
        m17356d(linkedHashMap, ncrVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((nbz) entry.getKey()).f41966b) {
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.f42043a = Collections.unmodifiableMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: d */
    private static void m17356d(Map map, ncr ncrVar) {
        for (int i = 0; i < ncrVar.mo17264b(); i++) {
            nbz nbzVarMo17265c = ncrVar.mo17265c(i);
            Object obj = map.get(nbzVarMo17265c);
            if (nbzVarMo17265c.f41966b) {
                List arrayList = (List) obj;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(nbzVarMo17265c, arrayList);
                }
                arrayList.add(nbzVarMo17265c.m17310d(ncrVar.mo17267e(i)));
            } else {
                map.put(nbzVarMo17265c, nbzVarMo17265c.m17310d(ncrVar.mo17267e(i)));
            }
        }
    }

    @Override // p000.ndh
    /* JADX INFO: renamed from: a */
    public final int mo17351a() {
        return this.f42043a.size();
    }

    @Override // p000.ndh
    /* JADX INFO: renamed from: b */
    public final Set mo17352b() {
        return this.f42043a.keySet();
    }

    @Override // p000.ndh
    /* JADX INFO: renamed from: c */
    public final void mo17353c(ncy ncyVar, Object obj) {
        for (Map.Entry entry : this.f42043a.entrySet()) {
            nbz nbzVar = (nbz) entry.getKey();
            Object value = entry.getValue();
            if (nbzVar.f41966b) {
                ncyVar.mo17349b(nbzVar, ((List) value).iterator(), obj);
            } else {
                ncyVar.mo17348a(nbzVar, value, obj);
            }
        }
    }
}
