package p000;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class hjb extends AbstractMap {

    /* JADX INFO: renamed from: a */
    public Object[] f42507a;

    /* JADX INFO: renamed from: b */
    public int f42508b;

    /* JADX INFO: renamed from: c */
    public Map f42509c;

    /* JADX INFO: renamed from: d */
    public boolean f42510d;

    /* JADX INFO: renamed from: e */
    public volatile pb9 f42511e;

    /* JADX INFO: renamed from: f */
    public Map f42512f;

    public hjb() {
        Map map = Collections.EMPTY_MAP;
        this.f42509c = map;
        this.f42512f = map;
    }

    /* JADX INFO: renamed from: a */
    public final ijb m13295a(int i) {
        if (i < this.f42508b) {
            return (ijb) this.f42507a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    /* JADX INFO: renamed from: b */
    public final Set m13296b() {
        return this.f42509c.isEmpty() ? Collections.EMPTY_SET : this.f42509c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m13300f();
        int iM13299e = m13299e(comparable);
        if (iM13299e >= 0) {
            return ((ijb) this.f42507a[iM13299e]).setValue(obj);
        }
        m13300f();
        if (this.f42507a == null) {
            this.f42507a = new Object[16];
        }
        int i = -(iM13299e + 1);
        if (i >= 16) {
            return m13301g().put(comparable, obj);
        }
        if (this.f42508b == 16) {
            ijb ijbVar = (ijb) this.f42507a[15];
            this.f42508b = 15;
            m13301g().put(ijbVar.f44203a, ijbVar.f44204b);
        }
        Object[] objArr = this.f42507a;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.f42507a[i] = new ijb(this, comparable, obj);
        this.f42508b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m13300f();
        if (this.f42508b != 0) {
            this.f42507a = null;
            this.f42508b = 0;
        }
        if (this.f42509c.isEmpty()) {
            return;
        }
        this.f42509c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m13299e(comparable) >= 0 || this.f42509c.containsKey(comparable);
    }

    /* JADX INFO: renamed from: d */
    public final Object m13298d(int i) {
        m13300f();
        Object[] objArr = this.f42507a;
        Object obj = ((ijb) objArr[i]).f44204b;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f42508b - i) - 1);
        this.f42508b--;
        if (!this.f42509c.isEmpty()) {
            Iterator it = m13301g().entrySet().iterator();
            Object[] objArr2 = this.f42507a;
            int i2 = this.f42508b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new ijb(this, (Comparable) entry.getKey(), entry.getValue());
            this.f42508b++;
            it.remove();
        }
        return obj;
    }

    /* JADX INFO: renamed from: e */
    public final int m13299e(Comparable comparable) {
        int i = this.f42508b;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int iCompareTo = comparable.compareTo(((ijb) this.f42507a[i2]).f44203a);
            if (iCompareTo > 0) {
                return -(i + 1);
            }
            if (iCompareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int iCompareTo2 = comparable.compareTo(((ijb) this.f42507a[i4]).f44203a);
            if (iCompareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        return -(i3 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f42511e == null) {
            this.f42511e = new pb9(this, 1);
        }
        return this.f42511e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjb)) {
            return super.equals(obj);
        }
        hjb hjbVar = (hjb) obj;
        int size = size();
        if (size == hjbVar.size()) {
            int i = this.f42508b;
            if (i != hjbVar.f42508b) {
                return entrySet().equals(hjbVar.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (m13295a(i2).equals(hjbVar.m13295a(i2))) {
                }
            }
            if (i != size) {
                return this.f42509c.equals(hjbVar.f42509c);
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m13300f() {
        if (this.f42510d) {
            ij6.m13946b();
        }
    }

    /* JADX INFO: renamed from: g */
    public final SortedMap m13301g() {
        m13300f();
        if (this.f42509c.isEmpty() && !(this.f42509c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f42509c = treeMap;
            this.f42512f = treeMap.descendingMap();
        }
        return (SortedMap) this.f42509c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM13299e = m13299e(comparable);
        return iM13299e >= 0 ? ((ijb) this.f42507a[iM13299e]).f44204b : this.f42509c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f42508b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.f42507a[i2].hashCode();
        }
        return this.f42509c.size() > 0 ? this.f42509c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m13300f();
        Comparable comparable = (Comparable) obj;
        int iM13299e = m13299e(comparable);
        if (iM13299e >= 0) {
            return m13298d(iM13299e);
        }
        if (this.f42509c.isEmpty()) {
            return null;
        }
        return this.f42509c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f42509c.size() + this.f42508b;
    }
}
