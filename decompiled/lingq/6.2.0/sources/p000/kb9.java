package p000;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class kb9 extends AbstractMap {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f46981g = 0;

    /* JADX INFO: renamed from: a */
    public final int f46982a;

    /* JADX INFO: renamed from: b */
    public List f46983b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c */
    public Map f46984c;

    /* JADX INFO: renamed from: d */
    public boolean f46985d;

    /* JADX INFO: renamed from: e */
    public volatile pb9 f46986e;

    /* JADX INFO: renamed from: f */
    public Map f46987f;

    public kb9(int i) {
        this.f46982a = i;
        Map map = Collections.EMPTY_MAP;
        this.f46984c = map;
        this.f46987f = map;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final int m15051a(Comparable comparable) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int size = this.f46983b.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = comparable.compareTo(((nb9) this.f46983b.get(i3)).m17317a());
                if (iCompareTo < 0) {
                    i4 = i3 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i3;
                    }
                    i = i3 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((nb9) this.f46983b.get(i4)).m17317a());
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = comparable.compareTo(((nb9) this.f46983b.get(i3)).m17317a());
                    if (iCompareTo < 0) {
                        i4 = i3 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i3;
                        }
                        i = i3 + 1;
                    }
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }

    /* JADX INFO: renamed from: b */
    public final void m15052b() {
        if (this.f46985d) {
            ij6.m13946b();
        }
    }

    /* JADX INFO: renamed from: c */
    public final Map.Entry m15053c(int i) {
        return (Map.Entry) this.f46983b.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m15052b();
        if (!this.f46983b.isEmpty()) {
            this.f46983b.clear();
        }
        if (this.f46984c.isEmpty()) {
            return;
        }
        this.f46984c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m15051a(comparable) >= 0 || this.f46984c.containsKey(comparable);
    }

    /* JADX INFO: renamed from: d */
    public final Iterable m15054d() {
        return this.f46984c.isEmpty() ? AbstractC3423or.f54769g : this.f46984c.entrySet();
    }

    /* JADX INFO: renamed from: e */
    public final SortedMap m15055e() {
        m15052b();
        if (this.f46984c.isEmpty() && !(this.f46984c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f46984c = treeMap;
            this.f46987f = treeMap.descendingMap();
        }
        return (SortedMap) this.f46984c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f46986e == null) {
            this.f46986e = new pb9(this, 0);
        }
        return this.f46986e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb9)) {
            return super.equals(obj);
        }
        kb9 kb9Var = (kb9) obj;
        int size = size();
        if (size == kb9Var.size()) {
            int size2 = this.f46983b.size();
            if (size2 != kb9Var.f46983b.size()) {
                return ((AbstractSet) entrySet()).equals(kb9Var.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (m15053c(i).equals(kb9Var.m15053c(i))) {
                }
            }
            if (size2 != size) {
                return this.f46984c.equals(kb9Var.f46984c);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m15052b();
        int iM15051a = m15051a(comparable);
        if (iM15051a >= 0) {
            return ((nb9) this.f46983b.get(iM15051a)).setValue(obj);
        }
        m15052b();
        boolean zIsEmpty = this.f46983b.isEmpty();
        int i = this.f46982a;
        if (zIsEmpty && !(this.f46983b instanceof ArrayList)) {
            this.f46983b = new ArrayList(i);
        }
        int i2 = -(iM15051a + 1);
        if (i2 >= i) {
            return m15055e().put(comparable, obj);
        }
        if (this.f46983b.size() == i) {
            nb9 nb9Var = (nb9) this.f46983b.remove(i - 1);
            m15055e().put(nb9Var.m17317a(), nb9Var.getValue());
        }
        this.f46983b.add(i2, new nb9(this, comparable, obj));
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final Object m15057g(int i) {
        m15052b();
        Object value = ((nb9) this.f46983b.remove(i)).getValue();
        if (!this.f46984c.isEmpty()) {
            Iterator it = m15055e().entrySet().iterator();
            this.f46983b.add(new nb9(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM15051a = m15051a(comparable);
        return iM15051a >= 0 ? ((nb9) this.f46983b.get(iM15051a)).getValue() : this.f46984c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f46983b.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((nb9) this.f46983b.get(i)).hashCode();
        }
        return this.f46984c.size() > 0 ? this.f46984c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m15052b();
        Comparable comparable = (Comparable) obj;
        int iM15051a = m15051a(comparable);
        if (iM15051a >= 0) {
            return m15057g(iM15051a);
        }
        if (this.f46984c.isEmpty()) {
            return null;
        }
        return this.f46984c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f46984c.size() + this.f46983b.size();
    }
}
