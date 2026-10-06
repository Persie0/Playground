package p000;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nzu extends AbstractMap {

    /* JADX INFO: renamed from: c */
    public boolean f45097c;

    /* JADX INFO: renamed from: e */
    private final int f45099e;

    /* JADX INFO: renamed from: f */
    private volatile nzt f45100f;

    /* JADX INFO: renamed from: a */
    public List f45095a = Collections.emptyList();

    /* JADX INFO: renamed from: b */
    public Map f45096b = Collections.emptyMap();

    /* JADX INFO: renamed from: d */
    public Map f45098d = Collections.emptyMap();

    public nzu(int i) {
        this.f45099e = i;
    }

    /* JADX INFO: renamed from: b */
    static nzu m18319b(int i) {
        return new nzu(i);
    }

    /* JADX INFO: renamed from: h */
    private final int m18320h(Comparable comparable) {
        int size = this.f45095a.size() - 1;
        int i = 0;
        if (size >= 0) {
            int iCompareTo = comparable.compareTo(((nzr) this.f45095a.get(size)).f45087a);
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int iCompareTo2 = comparable.compareTo(((nzr) this.f45095a.get(i2)).f45087a);
            if (iCompareTo2 < 0) {
                size = i2 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i2;
                }
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: i */
    private final SortedMap m18321i() {
        m18327g();
        if (this.f45096b.isEmpty() && !(this.f45096b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f45096b = treeMap;
            this.f45098d = treeMap.descendingMap();
        }
        return (SortedMap) this.f45096b;
    }

    /* JADX INFO: renamed from: a */
    public final int m18322a() {
        return this.f45095a.size();
    }

    /* JADX INFO: renamed from: c */
    public final Iterable m18323c() {
        return this.f45096b.isEmpty() ? nzq.f45086b : this.f45096b.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m18327g();
        if (!this.f45095a.isEmpty()) {
            this.f45095a.clear();
        }
        if (this.f45096b.isEmpty()) {
            return;
        }
        this.f45096b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m18320h(comparable) >= 0 || this.f45096b.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m18327g();
        int iM18320h = m18320h(comparable);
        if (iM18320h >= 0) {
            return ((nzr) this.f45095a.get(iM18320h)).setValue(obj);
        }
        m18327g();
        if (this.f45095a.isEmpty() && !(this.f45095a instanceof ArrayList)) {
            this.f45095a = new ArrayList(this.f45099e);
        }
        int i = -(iM18320h + 1);
        if (i >= this.f45099e) {
            return m18321i().put(comparable, obj);
        }
        int size = this.f45095a.size();
        int i2 = this.f45099e;
        if (size == i2) {
            nzr nzrVar = (nzr) this.f45095a.remove(i2 - 1);
            m18321i().put(nzrVar.f45087a, nzrVar.f45088b);
        }
        this.f45095a.add(i, new nzr(this, comparable, obj));
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final Object m18325e(int i) {
        m18327g();
        Object obj = ((nzr) this.f45095a.remove(i)).f45088b;
        if (!this.f45096b.isEmpty()) {
            Iterator it = m18321i().entrySet().iterator();
            List list = this.f45095a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new nzr(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f45100f == null) {
            this.f45100f = new nzt(this);
        }
        return this.f45100f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nzu)) {
            return super.equals(obj);
        }
        nzu nzuVar = (nzu) obj;
        int size = size();
        if (size != nzuVar.size()) {
            return false;
        }
        int iM18322a = m18322a();
        if (iM18322a != nzuVar.m18322a()) {
            return entrySet().equals(nzuVar.entrySet());
        }
        for (int i = 0; i < iM18322a; i++) {
            if (!m18326f(i).equals(nzuVar.m18326f(i))) {
                return false;
            }
        }
        if (iM18322a != size) {
            return this.f45096b.equals(nzuVar.f45096b);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final Map.Entry m18326f(int i) {
        return (Map.Entry) this.f45095a.get(i);
    }

    /* JADX INFO: renamed from: g */
    public final void m18327g() {
        if (this.f45097c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM18320h = m18320h(comparable);
        return iM18320h >= 0 ? ((nzr) this.f45095a.get(iM18320h)).f45088b : this.f45096b.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM18322a = m18322a();
        int iHashCode = 0;
        for (int i = 0; i < iM18322a; i++) {
            iHashCode += ((nzr) this.f45095a.get(i)).hashCode();
        }
        return this.f45096b.size() > 0 ? iHashCode + this.f45096b.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m18327g();
        Comparable comparable = (Comparable) obj;
        int iM18320h = m18320h(comparable);
        if (iM18320h >= 0) {
            return m18325e(iM18320h);
        }
        if (this.f45096b.isEmpty()) {
            return null;
        }
        return this.f45096b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f45095a.size() + this.f45096b.size();
    }
}
