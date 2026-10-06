package p000;

import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class mre {

    /* JADX INFO: renamed from: a */
    private static final Map f41464a = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    public static mrm m16820a(Class cls, String str) {
        Map map;
        str.getClass();
        int i = mro.f41481a;
        Map map2 = f41464a;
        synchronized (map2) {
            map = (Map) map2.get(cls);
            if (map == null) {
                map = new HashMap();
                for (Enum r3 : EnumSet.allOf(cls)) {
                    map.put(r3.name(), new WeakReference(r3));
                }
                f41464a.put(cls, map);
            }
        }
        WeakReference weakReference = (WeakReference) map.get(str);
        return weakReference == null ? mqu.f41450a : mrm.m16829i((Enum) cls.cast(weakReference.get()));
    }
}
