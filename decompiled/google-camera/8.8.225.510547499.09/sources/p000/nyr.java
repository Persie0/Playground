package p000;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nyr extends LinkedHashMap {

    /* JADX INFO: renamed from: a */
    public static final nyr f45033a;

    /* JADX INFO: renamed from: b */
    public boolean f45034b;

    static {
        nyr nyrVar = new nyr();
        f45033a = nyrVar;
        nyrVar.m18193c();
    }

    private nyr() {
        this.f45034b = true;
    }

    /* JADX INFO: renamed from: d */
    private static int m18190d(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof nxt) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = nxz.f44985a;
        int length = bArr.length;
        int iM18154c = nxz.m18154c(length, bArr, 0, length);
        if (iM18154c == 0) {
            return 1;
        }
        return iM18154c;
    }

    /* JADX INFO: renamed from: a */
    public final nyr m18191a() {
        return isEmpty() ? new nyr() : new nyr(this);
    }

    /* JADX INFO: renamed from: b */
    public final void m18192b() {
        if (!this.f45034b) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m18193c() {
        this.f45034b = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m18192b();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int iM18190d = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iM18190d += m18190d(entry.getValue()) ^ m18190d(entry.getKey());
        }
        return iM18190d;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m18192b();
        nxz.m18156e(obj);
        nxz.m18156e(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m18192b();
        for (Object obj : map.keySet()) {
            nxz.m18156e(obj);
            nxz.m18156e(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m18192b();
        return super.remove(obj);
    }

    private nyr(Map map) {
        super(map);
        this.f45034b = true;
    }
}
