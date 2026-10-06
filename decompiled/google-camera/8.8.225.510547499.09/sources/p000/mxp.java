package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import p021j$.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mxp extends mxq implements NavigableMap, Map {

    /* JADX INFO: renamed from: c */
    private static final mxp f41772c;
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    public final transient mzy f41773a;

    /* JADX INFO: renamed from: b */
    public final transient mws f41774b;

    /* JADX INFO: renamed from: d */
    private transient mxp f41775d;

    static {
        mzy mzyVarM17155Q = mxt.m17155Q(mzg.f41839a);
        int i = mws.f41739d;
        f41772c = new mxp(mzyVarM17155Q, mzr.f41857a);
    }

    public mxp(mzy mzyVar, mws mwsVar) {
        this(mzyVar, mwsVar, null);
    }

    public mxp(mzy mzyVar, mws mwsVar, mxp mxpVar) {
        this.f41773a = mzyVar;
        this.f41774b = mwsVar;
        this.f41775d = mxpVar;
    }

    /* JADX INFO: renamed from: a */
    public static mxn m17146a() {
        return new mxn(mzg.f41839a);
    }

    /* JADX INFO: renamed from: h */
    static mxp m17147h(Comparator comparator) {
        if (mzg.f41839a.equals(comparator)) {
            return f41772c;
        }
        mzy mzyVarM17155Q = mxt.m17155Q(comparator);
        int i = mws.f41739d;
        return new mxp(mzyVarM17155Q, mzr.f41857a);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX INFO: renamed from: v */
    private final mxp m17148v(int i, int i2) {
        if (i == 0) {
            if (i2 == size()) {
                return this;
            }
            i = 0;
        }
        return i == i2 ? m17147h(comparator()) : new mxp(this.f41773a.m17198g(i, i2), this.f41774b.subList(i, i2));
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return mkv.m16560y(ceilingEntry(obj));
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.f41773a.f41779b;
    }

    @Override // p000.mwx
    /* JADX INFO: renamed from: ct */
    public final mxk mo17113ct() {
        return isEmpty() ? mzx.f41874a : new mxm(this);
    }

    @Override // p000.mwx
    /* JADX INFO: renamed from: cu */
    public final mxk mo17114cu() {
        throw new AssertionError("should never be called");
    }

    @Override // p000.mwx
    /* JADX INFO: renamed from: cw */
    public final boolean mo17080cw() {
        return this.f41773a.mo17014cs() || this.f41774b.mo17014cs();
    }

    @Override // p000.mwx
    /* JADX INFO: renamed from: d */
    public final mwj mo17065d() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableSet descendingKeySet() {
        return this.f41773a.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        mxp mxpVar = this.f41775d;
        if (mxpVar == null) {
            return isEmpty() ? m17147h(mzh.m17166b(comparator()).mo17165a()) : new mxp((mzy) this.f41773a.descendingSet(), this.f41774b.mo17088a(), this);
        }
        return mxpVar;
    }

    @Override // p000.mwx, java.util.Map
    public final /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    @Override // p000.mwx
    /* JADX INFO: renamed from: f */
    public final mwj values() {
        return this.f41774b;
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (java.util.Map.Entry) entrySet().mo17025v().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.f41773a.first();
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return mkv.m16560y(floorEntry(obj));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return mkv.m16560y(higherEntry(obj));
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final mxp headMap(Object obj, boolean z) {
        mzy mzyVar = this.f41773a;
        obj.getClass();
        return m17148v(0, mzyVar.m17196e(obj, z));
    }

    @Override // p000.mwx, java.util.Map
    public final /* synthetic */ Set keySet() {
        return this.f41773a;
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (java.util.Map.Entry) entrySet().mo17025v().get(size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.f41773a.last();
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return mkv.m16560y(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.f41773a;
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final java.util.Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final java.util.Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.mwx
    /* JADX INFO: renamed from: s */
    public final /* synthetic */ mxk keySet() {
        return this.f41773a;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f41774b.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final mxp subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        lku.m15610E(comparator().compare(obj, obj2) <= 0, "expected fromKey <= toKey but %s > %s", obj, obj2);
        return headMap(obj2, z2).tailMap(obj, z);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final mxp tailMap(Object obj, boolean z) {
        mzy mzyVar = this.f41773a;
        obj.getClass();
        return m17148v(mzyVar.m17197f(obj, z), size());
    }

    @Override // p000.mwx, java.util.Map
    public final /* synthetic */ Collection values() {
        return this.f41774b;
    }

    @Override // p000.mwx
    Object writeReplace() {
        return new mxo(this);
    }

    @Override // p000.mwx, java.util.Map
    public final Object get(Object obj) {
        int iBinarySearch;
        mzy mzyVar = this.f41773a;
        if (obj == null) {
            iBinarySearch = -1;
        } else {
            try {
                iBinarySearch = Collections.binarySearch(mzyVar.f41882d, obj, mzyVar.f41779b);
                if (iBinarySearch < 0) {
                    iBinarySearch = -1;
                }
            } catch (ClassCastException e) {
            }
        }
        if (iBinarySearch == -1) {
            return null;
        }
        return this.f41774b.get(iBinarySearch);
    }
}
