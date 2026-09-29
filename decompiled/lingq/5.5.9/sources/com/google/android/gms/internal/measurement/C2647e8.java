package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e8 */
/* JADX INFO: loaded from: classes.dex */
public class C2647e8 extends AbstractMap {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f14173g = 0;

    /* JADX INFO: renamed from: a */
    public final int f14174a;

    /* JADX INFO: renamed from: d */
    public boolean f14177d;

    /* JADX INFO: renamed from: e */
    public volatile C2633d8 f14178e;

    /* JADX INFO: renamed from: b */
    public List f14175b = Collections.emptyList();

    /* JADX INFO: renamed from: c */
    public Map f14176c = Collections.emptyMap();

    /* JADX INFO: renamed from: f */
    public Map f14179f = Collections.emptyMap();

    /* JADX INFO: renamed from: a */
    public void mo7773a() {
        if (!this.f14177d) {
            this.f14176c = this.f14176c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f14176c);
            this.f14179f = this.f14179f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f14179f);
            this.f14177d = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m7774b() {
        return this.f14175b.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m7779g();
        int iM7776d = m7776d(comparable);
        if (iM7776d >= 0) {
            return ((C2605b8) this.f14175b.get(iM7776d)).setValue(obj);
        }
        m7779g();
        boolean zIsEmpty = this.f14175b.isEmpty();
        int i10 = this.f14174a;
        if (zIsEmpty && !(this.f14175b instanceof ArrayList)) {
            this.f14175b = new ArrayList(i10);
        }
        int i11 = -(iM7776d + 1);
        if (i11 >= i10) {
            return m7778f().put(comparable, obj);
        }
        if (this.f14175b.size() == i10) {
            C2605b8 c2605b8 = (C2605b8) this.f14175b.remove(i10 - 1);
            m7778f().put(c2605b8.f14067a, c2605b8.f14068b);
        }
        this.f14175b.add(i11, new C2605b8(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m7779g();
        if (!this.f14175b.isEmpty()) {
            this.f14175b.clear();
        }
        if (!this.f14176c.isEmpty()) {
            this.f14176c.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m7776d(comparable) < 0 && !this.f14176c.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final int m7776d(Comparable comparable) {
        int size = this.f14175b.size() - 1;
        int i10 = 0;
        if (size >= 0) {
            int iCompareTo = comparable.compareTo(((C2605b8) this.f14175b.get(size)).f14067a);
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int iCompareTo2 = comparable.compareTo(((C2605b8) this.f14175b.get(i11)).f14067a);
            if (iCompareTo2 < 0) {
                size = i11 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i11;
                }
                i10 = i11 + 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX INFO: renamed from: e */
    public final Object m7777e(int i10) {
        m7779g();
        Object obj = ((C2605b8) this.f14175b.remove(i10)).f14068b;
        if (!this.f14176c.isEmpty()) {
            Iterator it = m7778f().entrySet().iterator();
            List list = this.f14175b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C2605b8(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f14178e == null) {
            this.f14178e = new C2633d8(this);
        }
        return this.f14178e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2647e8)) {
            return super.equals(obj);
        }
        C2647e8 c2647e8 = (C2647e8) obj;
        int size = size();
        if (size != c2647e8.size()) {
            return false;
        }
        int iM7774b = m7774b();
        if (iM7774b != c2647e8.m7774b()) {
            return entrySet().equals(c2647e8.entrySet());
        }
        for (int i10 = 0; i10 < iM7774b; i10++) {
            if (!((Map.Entry) this.f14175b.get(i10)).equals((Map.Entry) c2647e8.f14175b.get(i10))) {
                return false;
            }
        }
        if (iM7774b != size) {
            return this.f14176c.equals(c2647e8.f14176c);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final SortedMap m7778f() {
        m7779g();
        if (this.f14176c.isEmpty() && !(this.f14176c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f14176c = treeMap;
            this.f14179f = treeMap.descendingMap();
        }
        return (SortedMap) this.f14176c;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final void m7779g() {
        if (this.f14177d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM7776d = m7776d(comparable);
        return iM7776d >= 0 ? ((C2605b8) this.f14175b.get(iM7776d)).f14068b : this.f14176c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM7774b = m7774b();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iM7774b; i10++) {
            iHashCode += ((C2605b8) this.f14175b.get(i10)).hashCode();
        }
        return this.f14176c.size() > 0 ? this.f14176c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m7779g();
        Comparable comparable = (Comparable) obj;
        int iM7776d = m7776d(comparable);
        if (iM7776d >= 0) {
            return m7777e(iM7776d);
        }
        if (this.f14176c.isEmpty()) {
            return null;
        }
        return this.f14176c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f14176c.size() + this.f14175b.size();
    }
}
