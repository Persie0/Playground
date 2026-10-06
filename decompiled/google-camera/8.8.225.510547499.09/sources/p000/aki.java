package p000;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class aki {

    /* JADX INFO: renamed from: a */
    public final Map f585a = new HashMap();

    /* JADX INFO: renamed from: b */
    final Map f586b;

    public aki(Map map) {
        this.f586b = map;
        for (Map.Entry entry : map.entrySet()) {
            akq akqVar = (akq) entry.getValue();
            List arrayList = (List) this.f585a.get(akqVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f585a.put(akqVar, arrayList);
            }
            arrayList.add((akj) entry.getKey());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m863a(List list, akv akvVar, akq akqVar, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                akj akjVar = (akj) list.get(size);
                try {
                    switch (akjVar.f587a) {
                        case 0:
                            akjVar.f588b.invoke(obj, new Object[0]);
                            break;
                        case 1:
                            akjVar.f588b.invoke(obj, akvVar);
                            break;
                        default:
                            akjVar.f588b.invoke(obj, akvVar, akqVar);
                            break;
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
