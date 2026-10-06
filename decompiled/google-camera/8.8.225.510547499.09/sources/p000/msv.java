package p000;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class msv extends mvn implements Serializable, mtz {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    public transient Map f41563a;

    /* JADX INFO: renamed from: b */
    public transient msv f41564b;

    /* JADX INFO: renamed from: c */
    private transient Set f41565c;

    /* JADX INFO: renamed from: d */
    private transient Set f41566d;

    /* JADX INFO: renamed from: e */
    private transient Set f41567e;

    public msv(Map map, Map map2) {
        m16881i(map, map2);
    }

    public msv(Map map, msv msvVar) {
        this.f41563a = map;
        this.f41564b = msvVar;
    }

    @Override // p000.mvn, p000.mvq
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ Object mo3817b() {
        return this.f41563a;
    }

    /* JADX INFO: renamed from: b */
    public Object mo16875b(Object obj) {
        throw null;
    }

    @Override // p000.mvn
    /* JADX INFO: renamed from: c */
    protected final Map mo15848c() {
        return this.f41563a;
    }

    @Override // p000.mvn, java.util.Map
    public final void clear() {
        this.f41563a.clear();
        this.f41564b.f41563a.clear();
    }

    @Override // p000.mvn, java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f41564b.containsKey(obj);
    }

    /* JADX INFO: renamed from: d */
    public Object mo16876d(Object obj) {
        return obj;
    }

    @Override // p000.mtz
    /* JADX INFO: renamed from: e */
    public final mtz mo16877e() {
        return this.f41564b;
    }

    @Override // p000.mvn, java.util.Map
    public final Set entrySet() {
        Set set = this.f41567e;
        if (set != null) {
            return set;
        }
        msr msrVar = new msr(this);
        this.f41567e = msrVar;
        return msrVar;
    }

    /* JADX INFO: renamed from: f */
    public final Object m16878f(Object obj) {
        Object objRemove = this.f41563a.remove(obj);
        m16880h(objRemove);
        return objRemove;
    }

    @Override // p000.mvn, java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Set values() {
        Set set = this.f41566d;
        if (set != null) {
            return set;
        }
        msu msuVar = new msu(this);
        this.f41566d = msuVar;
        return msuVar;
    }

    /* JADX INFO: renamed from: h */
    public final void m16880h(Object obj) {
        this.f41564b.f41563a.remove(obj);
    }

    /* JADX INFO: renamed from: i */
    final void m16881i(Map map, Map map2) {
        lku.m15613H(this.f41563a == null);
        lku.m15613H(this.f41564b == null);
        lku.m15669w(map.isEmpty());
        lku.m15669w(map2.isEmpty());
        lku.m15669w(map != map2);
        this.f41563a = map;
        this.f41564b = new mss(map2, this);
    }

    /* JADX INFO: renamed from: j */
    public final void m16882j(Object obj, boolean z, Object obj2, Object obj3) {
        if (z) {
            m16880h(obj2);
        }
        this.f41564b.f41563a.put(obj3, obj);
    }

    @Override // p000.mtz
    /* JADX INFO: renamed from: k */
    public final void mo16883k(Object obj, Object obj2) {
        throw null;
    }

    @Override // p000.mvn, java.util.Map
    public final Set keySet() {
        Set set = this.f41565c;
        if (set != null) {
            return set;
        }
        mst mstVar = new mst(this);
        this.f41565c = mstVar;
        return mstVar;
    }

    @Override // p000.mvn, java.util.Map, p000.mtz
    public Object put(Object obj, Object obj2) {
        mo16875b(obj);
        mo16876d(obj2);
        boolean zContainsKey = containsKey(obj);
        if (zContainsKey && mpw.m16768g(obj2, get(obj))) {
            return obj2;
        }
        lku.m15607B(!containsValue(obj2), "value already present: %s", obj2);
        Object objPut = this.f41563a.put(obj, obj2);
        m16882j(obj, zContainsKey, objPut, obj2);
        return objPut;
    }

    @Override // p000.mvn, java.util.Map
    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // p000.mvn, java.util.Map
    public final Object remove(Object obj) {
        if (containsKey(obj)) {
            return m16878f(obj);
        }
        return null;
    }
}
