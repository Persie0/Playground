package p000;

import java.util.Comparator;
import java.util.SortedMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class naq extends nak implements SortedMap {
    private static final long serialVersionUID = 0;

    public naq(SortedMap sortedMap, Object obj) {
        super(sortedMap, obj);
    }

    @Override // p000.nak
    /* JADX INFO: renamed from: c */
    public SortedMap mo17203c() {
        return (SortedMap) super.mo17203c();
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        Comparator comparator;
        synchronized (this.f41902h) {
            comparator = mo17203c().comparator();
        }
        return comparator;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        Object objFirstKey;
        synchronized (this.f41902h) {
            objFirstKey = mo17203c().firstKey();
        }
        return objFirstKey;
    }

    public SortedMap headMap(Object obj) {
        SortedMap sortedMapM16782u;
        synchronized (this.f41902h) {
            sortedMapM16782u = mpw.m16782u(mo17203c().headMap(obj), this.f41902h);
        }
        return sortedMapM16782u;
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        Object objLastKey;
        synchronized (this.f41902h) {
            objLastKey = mo17203c().lastKey();
        }
        return objLastKey;
    }

    public SortedMap subMap(Object obj, Object obj2) {
        SortedMap sortedMapM16782u;
        synchronized (this.f41902h) {
            sortedMapM16782u = mpw.m16782u(mo17203c().subMap(obj, obj2), this.f41902h);
        }
        return sortedMapM16782u;
    }

    public SortedMap tailMap(Object obj) {
        SortedMap sortedMapM16782u;
        synchronized (this.f41902h) {
            sortedMapM16782u = mpw.m16782u(mo17203c().tailMap(obj), this.f41902h);
        }
        return sortedMapM16782u;
    }
}
