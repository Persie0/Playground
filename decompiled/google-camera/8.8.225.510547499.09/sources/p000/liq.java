package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class liq {
    /* JADX INFO: renamed from: a */
    public abstract nyw mo15467a(String str, Object obj);

    /* JADX INFO: renamed from: b */
    public abstract nyw mo15468b(nyw nywVar, nyw nywVar2);

    /* JADX INFO: renamed from: c */
    public abstract String mo15469c(nyw nywVar);

    /* JADX INFO: renamed from: d */
    public final List m15470d(Map map) {
        nyw nywVarMo15467a;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null && (nywVarMo15467a = mo15467a((String) entry.getKey(), entry.getValue())) != null) {
                arrayList.add(nywVarMo15467a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final List m15471e(List list, List list2) {
        nyw nywVar;
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nyw nywVar2 = (nyw) it.next();
            String strMo15469c = mo15469c(nywVar2);
            Iterator it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    nywVar = null;
                    break;
                }
                nywVar = (nyw) it2.next();
            } while (!strMo15469c.equals(mo15469c(nywVar)));
            nyw nywVarMo15468b = mo15468b(nywVar2, nywVar);
            if (nywVarMo15468b != null) {
                arrayList.add(nywVarMo15468b);
            }
        }
        return arrayList;
    }
}
