package p000;

import java.util.Collections;
import java.util.Map;
import java.util.NavigableMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kaw extends kax {
    public kaw(NavigableMap navigableMap) {
        super(navigableMap);
    }

    /* JADX INFO: renamed from: a */
    private final Object m13888a() {
        if (size() > 9000) {
            return super.remove((Comparable) Collections.min(super.navigableKeySet()));
        }
        return null;
    }

    @Override // p000.kax, java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object objPut = super.put(obj, obj2);
        return objPut != null ? objPut : m13888a();
    }

    @Override // p000.kax, java.util.Map
    public final void putAll(Map map) {
        super.putAll(map);
        while (m13888a() != null) {
        }
    }
}
