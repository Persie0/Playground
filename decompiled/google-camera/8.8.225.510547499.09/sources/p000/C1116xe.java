package p000;

import android.graphics.PorterDuff;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: xe */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1116xe {

    /* JADX INFO: renamed from: a */
    private int f47994a;

    /* JADX INFO: renamed from: b */
    private int f47995b;

    /* JADX INFO: renamed from: c */
    private int f47996c;

    /* JADX INFO: renamed from: d */
    private int f47997d;

    /* JADX INFO: renamed from: e */
    private int f47998e;

    /* JADX INFO: renamed from: f */
    private int f47999f;

    /* JADX INFO: renamed from: g */
    private final C0905pj f48000g;

    /* JADX INFO: renamed from: h */
    private final bkn f48001h;

    public C1116xe() {
        this(6);
    }

    /* JADX INFO: renamed from: c */
    public static int m19550c(int i, PorterDuff.Mode mode) {
        return ((i + 31) * 31) + mode.hashCode();
    }

    /* JADX INFO: renamed from: d */
    protected static final void m19551d(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
    }

    /* JADX INFO: renamed from: e */
    private static final void m19552e(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final Object m19553a(Object obj) {
        synchronized (this.f48000g) {
            Object obj2 = ((LinkedHashMap) this.f48001h.f3651a).get(obj);
            if (obj2 != null) {
                this.f47998e++;
                return obj2;
            }
            this.f47999f++;
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m19554b(Object obj, Object obj2) {
        Object objM2598s;
        Object key;
        Object value;
        obj2.getClass();
        synchronized (this.f48000g) {
            this.f47996c++;
            int i = this.f47995b;
            m19552e(obj, obj2);
            this.f47995b = i + 1;
            objM2598s = this.f48001h.m2598s(obj, obj2);
            if (objM2598s != null) {
                int i2 = this.f47995b;
                m19552e(obj, objM2598s);
                this.f47995b = i2 - 1;
            }
        }
        if (objM2598s != null) {
            m19551d(obj, objM2598s);
        }
        int i3 = this.f47994a;
        while (true) {
            synchronized (this.f48000g) {
                if (this.f47995b < 0 || (this.f48001h.m2599t() && this.f47995b != 0)) {
                    break;
                }
                if (this.f47995b > i3 && !this.f48001h.m2599t()) {
                    Set setEntrySet = ((LinkedHashMap) this.f48001h.f3651a).entrySet();
                    setEntrySet.getClass();
                    Object next = null;
                    if (setEntrySet instanceof List) {
                        List list = (List) setEntrySet;
                        if (!list.isEmpty()) {
                            next = list.get(0);
                        }
                    } else {
                        Iterator it = setEntrySet.iterator();
                        if (it.hasNext()) {
                            next = it.next();
                        }
                    }
                    Map.Entry entry = (Map.Entry) next;
                    if (entry != null) {
                        key = entry.getKey();
                        value = entry.getValue();
                        bkn bknVar = this.f48001h;
                        key.getClass();
                        ((LinkedHashMap) bknVar.f3651a).remove(key);
                        int i4 = this.f47995b;
                        m19552e(key, value);
                        this.f47995b = i4 - 1;
                        this.f47997d++;
                    }
                }
                return objM2598s;
            }
            return objM2598s;
            m19551d(key, value);
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public final String toString() {
        String str;
        synchronized (this.f48000g) {
            int i = this.f47998e;
            int i2 = this.f47999f + i;
            str = "LruCache[maxSize=" + this.f47994a + ",hits=" + this.f47998e + ",misses=" + this.f47999f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
        }
        return str;
    }

    public C1116xe(int i) {
        this.f47994a = i;
        this.f48001h = new bkn(null, null, null, null);
        this.f48000g = new C0905pj();
    }
}
