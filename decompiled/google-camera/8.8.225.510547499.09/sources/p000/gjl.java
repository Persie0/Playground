package p000;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gjl {
    /* JADX INFO: renamed from: b */
    public static Map m9339b(Map map, Map map2) {
        HashMap map3 = new HashMap();
        for (gnf gnfVar : map.keySet()) {
            kho khoVar = (kho) map.get(gnfVar);
            kmg kmgVar = (kmg) map2.get(gnfVar);
            kmgVar.getClass();
            String str = kmgVar.f36540a;
            if (str != null) {
                mxk mxkVar = khoVar.f36067c;
                map3.put(str, khoVar);
            }
        }
        return map3;
    }
}
