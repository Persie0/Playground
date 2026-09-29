package com.google.common.collect;

import com.google.common.primitives.Ints;
import dm.C5212l;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import p338qd.C8573r0;

/* JADX INFO: loaded from: classes.dex */
class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: j */
    public static final Object f16016j = new Object();

    /* JADX INFO: renamed from: a */
    public transient Object f16017a;

    /* JADX INFO: renamed from: b */
    public transient int[] f16018b;

    /* JADX INFO: renamed from: c */
    public transient Object[] f16019c;

    /* JADX INFO: renamed from: d */
    public transient Object[] f16020d;

    /* JADX INFO: renamed from: e */
    public transient int f16021e;

    /* JADX INFO: renamed from: f */
    public transient int f16022f;

    /* JADX INFO: renamed from: g */
    public transient C3141c f16023g;

    /* JADX INFO: renamed from: h */
    public transient C3139a f16024h;

    /* JADX INFO: renamed from: i */
    public transient C3143e f16025i;

    /* JADX INFO: renamed from: com.google.common.collect.CompactHashMap$a */
    public class C3139a extends AbstractSet<Map.Entry<K, V>> {
        public C3139a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map<K, V> mapM9035a = compactHashMap.m9035a();
            if (mapM9035a != null) {
                return mapM9035a.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iM9036b = compactHashMap.m9036b(entry.getKey());
            return iM9036b != -1 && C5212l.m11140M(compactHashMap.m9045r(iM9036b), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map<K, V> mapM9035a = compactHashMap.m9035a();
            return mapM9035a != null ? mapM9035a.entrySet().iterator() : new C3188g(compactHashMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map<K, V> mapM9035a = compactHashMap.m9035a();
            if (mapM9035a != null) {
                return mapM9035a.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (compactHashMap.m9039e()) {
                return false;
            }
            int i10 = (1 << (compactHashMap.f16021e & 31)) - 1;
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object obj2 = compactHashMap.f16017a;
            Objects.requireNonNull(obj2);
            int iM11162i0 = C5212l.m11162i0(key, value, i10, obj2, compactHashMap.m9041k(), compactHashMap.m9042l(), compactHashMap.m9043n());
            if (iM11162i0 == -1) {
                return false;
            }
            compactHashMap.m9038d(iM11162i0, i10);
            compactHashMap.f16022f--;
            compactHashMap.f16021e += 32;
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return CompactHashMap.this.size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.CompactHashMap$b */
    public abstract class AbstractC3140b<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public int f16027a;

        /* JADX INFO: renamed from: b */
        public int f16028b;

        /* JADX INFO: renamed from: c */
        public int f16029c;

        public AbstractC3140b() {
            this.f16027a = CompactHashMap.this.f16021e;
            this.f16028b = CompactHashMap.this.isEmpty() ? -1 : 0;
            this.f16029c = -1;
        }

        /* JADX INFO: renamed from: a */
        public abstract T mo9046a(int i10);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f16028b >= 0;
        }

        @Override // java.util.Iterator
        public final T next() {
            CompactHashMap compactHashMap = CompactHashMap.this;
            if (compactHashMap.f16021e != this.f16027a) {
                throw new ConcurrentModificationException();
            }
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f16028b;
            this.f16029c = i10;
            T tMo9046a = mo9046a(i10);
            int i11 = this.f16028b + 1;
            if (i11 >= compactHashMap.f16022f) {
                i11 = -1;
            }
            this.f16028b = i11;
            return tMo9046a;
        }

        @Override // java.util.Iterator
        public final void remove() {
            CompactHashMap compactHashMap = CompactHashMap.this;
            if (compactHashMap.f16021e != this.f16027a) {
                throw new ConcurrentModificationException();
            }
            C8573r0.m16697S("no calls to next() since the last call to remove()", this.f16029c >= 0);
            this.f16027a += 32;
            compactHashMap.remove(compactHashMap.m9037c(this.f16029c));
            this.f16028b--;
            this.f16029c = -1;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.CompactHashMap$c */
    public class C3141c extends AbstractSet<K> {
        public C3141c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return CompactHashMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map<K, V> mapM9035a = compactHashMap.m9035a();
            return mapM9035a != null ? mapM9035a.keySet().iterator() : new C3186f(compactHashMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map<K, V> mapM9035a = compactHashMap.m9035a();
            if (mapM9035a != null) {
                return mapM9035a.keySet().remove(obj);
            }
            return compactHashMap.m9040h(obj) != CompactHashMap.f16016j;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return CompactHashMap.this.size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.CompactHashMap$d */
    public final class C3142d extends AbstractC3180c<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f16032a;

        /* JADX INFO: renamed from: b */
        public int f16033b;

        public C3142d(int i10) {
            Object obj = CompactHashMap.f16016j;
            this.f16032a = (K) CompactHashMap.this.m9037c(i10);
            this.f16033b = i10;
        }

        /* JADX INFO: renamed from: a */
        public final void m9047a() {
            int i10 = this.f16033b;
            K k10 = this.f16032a;
            CompactHashMap compactHashMap = CompactHashMap.this;
            if (i10 != -1 && i10 < compactHashMap.size() && C5212l.m11140M(k10, compactHashMap.m9037c(this.f16033b))) {
                return;
            }
            Object obj = CompactHashMap.f16016j;
            this.f16033b = compactHashMap.m9036b(k10);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f16032a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map<K, V> mapM9035a = compactHashMap.m9035a();
            if (mapM9035a != null) {
                return mapM9035a.get(this.f16032a);
            }
            m9047a();
            int i10 = this.f16033b;
            if (i10 == -1) {
                return null;
            }
            return (V) compactHashMap.m9045r(i10);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map<K, V> mapM9035a = compactHashMap.m9035a();
            K k10 = this.f16032a;
            if (mapM9035a != null) {
                return mapM9035a.put(k10, v10);
            }
            m9047a();
            int i10 = this.f16033b;
            if (i10 == -1) {
                compactHashMap.put(k10, v10);
                return null;
            }
            V v11 = (V) compactHashMap.m9045r(i10);
            compactHashMap.m9043n()[this.f16033b] = v10;
            return v11;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.CompactHashMap$e */
    public class C3143e extends AbstractCollection<V> {
        public C3143e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map<K, V> mapM9035a = compactHashMap.m9035a();
            return mapM9035a != null ? mapM9035a.values().iterator() : new C3189h(compactHashMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return CompactHashMap.this.size();
        }
    }

    public CompactHashMap(int i10) {
        C8573r0.m16679J("Expected size must be >= 0", i10 >= 0);
        this.f16021e = Ints.m9143m0(i10, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i10 = objectInputStream.readInt();
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(25);
            sb2.append("Invalid size: ");
            sb2.append(i10);
            throw new InvalidObjectException(sb2.toString());
        }
        C8573r0.m16679J("Expected size must be >= 0", i10 >= 0);
        this.f16021e = Ints.m9143m0(i10, 1);
        for (int i11 = 0; i11 < i10; i11++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map<K, V> mapM9035a = m9035a();
        Iterator<Map.Entry<K, V>> it = mapM9035a != null ? mapM9035a.entrySet().iterator() : new C3188g(this);
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    /* JADX INFO: renamed from: a */
    public final Map<K, V> m9035a() {
        Object obj = this.f16017a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final int m9036b(Object obj) {
        if (m9039e()) {
            return -1;
        }
        int iM16722e1 = C8573r0.m16722e1(obj);
        int i10 = (1 << (this.f16021e & 31)) - 1;
        Object obj2 = this.f16017a;
        Objects.requireNonNull(obj2);
        int iM11172o0 = C5212l.m11172o0(iM16722e1 & i10, obj2);
        if (iM11172o0 == 0) {
            return -1;
        }
        int i11 = ~i10;
        int i12 = iM16722e1 & i11;
        do {
            int i13 = iM11172o0 - 1;
            int i14 = m9041k()[i13];
            if ((i14 & i11) == i12 && C5212l.m11140M(obj, m9037c(i13))) {
                return i13;
            }
            iM11172o0 = i14 & i10;
        } while (iM11172o0 != 0);
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public final K m9037c(int i10) {
        return (K) m9042l()[i10];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m9039e()) {
            return;
        }
        this.f16021e += 32;
        Map<K, V> mapM9035a = m9035a();
        if (mapM9035a != null) {
            this.f16021e = Ints.m9143m0(size(), 3);
            mapM9035a.clear();
            this.f16017a = null;
            this.f16022f = 0;
            return;
        }
        Arrays.fill(m9042l(), 0, this.f16022f, (Object) null);
        Arrays.fill(m9043n(), 0, this.f16022f, (Object) null);
        Object obj = this.f16017a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(m9041k(), 0, this.f16022f, 0);
        this.f16022f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map<K, V> mapM9035a = m9035a();
        if (mapM9035a != null) {
            return mapM9035a.containsKey(obj);
        }
        return m9036b(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map<K, V> mapM9035a = m9035a();
        if (mapM9035a != null) {
            return mapM9035a.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f16022f; i10++) {
            if (C5212l.m11140M(obj, m9045r(i10))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m9038d(int i10, int i11) {
        Object obj = this.f16017a;
        Objects.requireNonNull(obj);
        int[] iArrM9041k = m9041k();
        Object[] objArrM9042l = m9042l();
        Object[] objArrM9043n = m9043n();
        int size = size() - 1;
        if (i10 >= size) {
            objArrM9042l[i10] = null;
            objArrM9043n[i10] = null;
            iArrM9041k[i10] = 0;
            return;
        }
        Object obj2 = objArrM9042l[size];
        objArrM9042l[i10] = obj2;
        objArrM9043n[i10] = objArrM9043n[size];
        objArrM9042l[size] = null;
        objArrM9043n[size] = null;
        iArrM9041k[i10] = iArrM9041k[size];
        iArrM9041k[size] = 0;
        int iM16722e1 = C8573r0.m16722e1(obj2) & i11;
        int iM11172o0 = C5212l.m11172o0(iM16722e1, obj);
        int i12 = size + 1;
        if (iM11172o0 == i12) {
            C5212l.m11174p0(iM16722e1, i10 + 1, obj);
            return;
        }
        while (true) {
            int i13 = iM11172o0 - 1;
            int i14 = iArrM9041k[i13];
            int i15 = i14 & i11;
            if (i15 == i12) {
                iArrM9041k[i13] = ((i10 + 1) & i11) | (i14 & (~i11));
                return;
            }
            iM11172o0 = i15;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m9039e() {
        return this.f16017a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        C3139a c3139a = this.f16024h;
        if (c3139a != null) {
            return c3139a;
        }
        C3139a c3139a2 = new C3139a();
        this.f16024h = c3139a2;
        return c3139a2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Map<K, V> mapM9035a = m9035a();
        if (mapM9035a != null) {
            return mapM9035a.get(obj);
        }
        int iM9036b = m9036b(obj);
        if (iM9036b == -1) {
            return null;
        }
        return m9045r(iM9036b);
    }

    /* JADX INFO: renamed from: h */
    public final Object m9040h(Object obj) {
        boolean zM9039e = m9039e();
        Object obj2 = f16016j;
        if (zM9039e) {
            return obj2;
        }
        int i10 = (1 << (this.f16021e & 31)) - 1;
        Object obj3 = this.f16017a;
        Objects.requireNonNull(obj3);
        int iM11162i0 = C5212l.m11162i0(obj, null, i10, obj3, m9041k(), m9042l(), null);
        if (iM11162i0 == -1) {
            return obj2;
        }
        V vM9045r = m9045r(iM11162i0);
        m9038d(iM11162i0, i10);
        this.f16022f--;
        this.f16021e += 32;
        return vM9045r;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    /* JADX INFO: renamed from: k */
    public final int[] m9041k() {
        int[] iArr = this.f16018b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        C3141c c3141c = this.f16023g;
        if (c3141c != null) {
            return c3141c;
        }
        C3141c c3141c2 = new C3141c();
        this.f16023g = c3141c2;
        return c3141c2;
    }

    /* JADX INFO: renamed from: l */
    public final Object[] m9042l() {
        Object[] objArr = this.f16019c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: renamed from: n */
    public final Object[] m9043n() {
        Object[] objArr = this.f16020d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        int iMin;
        if (m9039e()) {
            C8573r0.m16697S("Arrays already allocated", m9039e());
            int i10 = this.f16021e;
            int iMax = Math.max(i10 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > ((int) (((double) iHighestOneBit) * 1.0d))) {
                int i11 = iHighestOneBit << 1;
                if (i11 <= 0) {
                    i11 = 1073741824;
                }
                iHighestOneBit = i11;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f16017a = C5212l.m11134F(iMax2);
            this.f16021e = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.f16021e & (-32));
            this.f16018b = new int[i10];
            this.f16019c = new Object[i10];
            this.f16020d = new Object[i10];
        }
        Map<K, V> mapM9035a = m9035a();
        if (mapM9035a != null) {
            return mapM9035a.put(k10, v10);
        }
        int[] iArrM9041k = m9041k();
        Object[] objArrM9042l = m9042l();
        Object[] objArrM9043n = m9043n();
        int i12 = this.f16022f;
        int i13 = i12 + 1;
        int iM16722e1 = C8573r0.m16722e1(k10);
        int iM9044q = (1 << (this.f16021e & 31)) - 1;
        int i14 = iM16722e1 & iM9044q;
        Object obj = this.f16017a;
        Objects.requireNonNull(obj);
        int iM11172o0 = C5212l.m11172o0(i14, obj);
        if (iM11172o0 != 0) {
            int i15 = ~iM9044q;
            int i16 = iM16722e1 & i15;
            int i17 = 0;
            while (true) {
                int i18 = iM11172o0 - 1;
                int i19 = iArrM9041k[i18];
                int i20 = i19 & i15;
                if (i20 == i16 && C5212l.m11140M(k10, objArrM9042l[i18])) {
                    V v11 = (V) objArrM9043n[i18];
                    objArrM9043n[i18] = v10;
                    return v11;
                }
                int i21 = i19 & iM9044q;
                int i22 = i16;
                int i23 = i17 + 1;
                if (i21 == 0) {
                    if (i23 < 9) {
                        if (i13 <= iM9044q) {
                            iArrM9041k[i18] = (i13 & iM9044q) | i20;
                            break;
                        }
                        iM9044q = m9044q(iM9044q, (iM9044q + 1) * (iM9044q < 32 ? 4 : 2), iM16722e1, i12);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(((1 << (this.f16021e & 31)) - 1) + 1, 1.0f);
                    int i24 = isEmpty() ? -1 : 0;
                    while (i24 >= 0) {
                        linkedHashMap.put(m9037c(i24), m9045r(i24));
                        i24++;
                        if (i24 >= this.f16022f) {
                            i24 = -1;
                        }
                    }
                    this.f16017a = linkedHashMap;
                    this.f16018b = null;
                    this.f16019c = null;
                    this.f16020d = null;
                    this.f16021e += 32;
                    return (V) linkedHashMap.put(k10, v10);
                }
                iM11172o0 = i21;
                i17 = i23;
                i16 = i22;
            }
        } else if (i13 > iM9044q) {
            iM9044q = m9044q(iM9044q, (iM9044q + 1) * (iM9044q < 32 ? 4 : 2), iM16722e1, i12);
        } else {
            Object obj2 = this.f16017a;
            Objects.requireNonNull(obj2);
            C5212l.m11174p0(i14, i13, obj2);
        }
        int length = m9041k().length;
        if (i13 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f16018b = Arrays.copyOf(m9041k(), iMin);
            this.f16019c = Arrays.copyOf(m9042l(), iMin);
            this.f16020d = Arrays.copyOf(m9043n(), iMin);
        }
        m9041k()[i12] = ((~iM9044q) & iM16722e1) | (iM9044q & 0);
        m9042l()[i12] = k10;
        m9043n()[i12] = v10;
        this.f16022f = i13;
        this.f16021e += 32;
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final int m9044q(int i10, int i11, int i12, int i13) {
        Object objM11134F = C5212l.m11134F(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            C5212l.m11174p0(i12 & i14, i13 + 1, objM11134F);
        }
        Object obj = this.f16017a;
        Objects.requireNonNull(obj);
        int[] iArrM9041k = m9041k();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iM11172o0 = C5212l.m11172o0(i15, obj);
            while (iM11172o0 != 0) {
                int i16 = iM11172o0 - 1;
                int i17 = iArrM9041k[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iM11172o1 = C5212l.m11172o0(i19, objM11134F);
                C5212l.m11174p0(i19, iM11172o0, objM11134F);
                iArrM9041k[i16] = ((~i14) & i18) | (iM11172o1 & i14);
                iM11172o0 = i17 & i10;
            }
        }
        this.f16017a = objM11134F;
        this.f16021e = ((32 - Integer.numberOfLeadingZeros(i14)) & 31) | (this.f16021e & (-32));
        return i14;
    }

    /* JADX INFO: renamed from: r */
    public final V m9045r(int i10) {
        return (V) m9043n()[i10];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        Map<K, V> mapM9035a = m9035a();
        if (mapM9035a != null) {
            return mapM9035a.remove(obj);
        }
        V v10 = (V) m9040h(obj);
        if (v10 == f16016j) {
            return null;
        }
        return v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map<K, V> mapM9035a = m9035a();
        return mapM9035a != null ? mapM9035a.size() : this.f16022f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        C3143e c3143e = this.f16025i;
        if (c3143e == null) {
            c3143e = new C3143e();
            this.f16025i = c3143e;
        }
        return c3143e;
    }
}
