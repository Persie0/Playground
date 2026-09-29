package kotlin.collections.builders;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import jm.C6525h;
import jm.C6526i;
import kotlin.Metadata;
import p100em.InterfaceC5429a;
import p100em.InterfaceC5432d;
import p165i0.C6117j;
import p165i0.C6119l;
import p349qo.C8656b;
import p419ul.C9554a;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006\n\u000b\f\r\u000e\u000fB\t\b\u0016¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0007\u001a\u00020\u0006H\u0002¨\u0006\u0010"}, m13365d2 = {"Lkotlin/collections/builders/MapBuilder;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "<init>", "()V", "a", "b", "c", "d", "e", "f", "kotlin-stdlib"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, InterfaceC5432d {

    /* JADX INFO: renamed from: a */
    public K[] f38058a;

    /* JADX INFO: renamed from: b */
    public V[] f38059b;

    /* JADX INFO: renamed from: c */
    public int[] f38060c;

    /* JADX INFO: renamed from: d */
    public int[] f38061d;

    /* JADX INFO: renamed from: e */
    public int f38062e;

    /* JADX INFO: renamed from: f */
    public int f38063f;

    /* JADX INFO: renamed from: g */
    public int f38064g;

    /* JADX INFO: renamed from: h */
    public int f38065h;

    /* JADX INFO: renamed from: i */
    public C9554a<K> f38066i;

    /* JADX INFO: renamed from: j */
    public C6119l f38067j;

    /* JADX INFO: renamed from: k */
    public C6117j f38068k;

    /* JADX INFO: renamed from: l */
    public boolean f38069l;

    /* JADX INFO: renamed from: kotlin.collections.builders.MapBuilder$a */
    public static final class C6746a {
    }

    /* JADX INFO: renamed from: kotlin.collections.builders.MapBuilder$b */
    public static final class C6747b<K, V> extends C6749d<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC5429a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6747b(MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            C5207g.m11111f(mapBuilder, "map");
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Iterator
        public final Object next() {
            int i10 = this.f38073b;
            MapBuilder<K, V> mapBuilder = this.f38072a;
            if (i10 >= mapBuilder.f38063f) {
                throw new NoSuchElementException();
            }
            this.f38073b = i10 + 1;
            this.f38074c = i10;
            C6748c c6748c = new C6748c(mapBuilder, i10);
            m13411a();
            return c6748c;
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.builders.MapBuilder$c */
    public static final class C6748c<K, V> implements Map.Entry<K, V>, InterfaceC5432d.a {

        /* JADX INFO: renamed from: a */
        public final MapBuilder<K, V> f38070a;

        /* JADX INFO: renamed from: b */
        public final int f38071b;

        public C6748c(MapBuilder<K, V> mapBuilder, int i10) {
            C5207g.m11111f(mapBuilder, "map");
            this.f38070a = mapBuilder;
            this.f38071b = i10;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (C5207g.m11106a(entry.getKey(), getKey()) && C5207g.m11106a(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f38070a.f38058a[this.f38071b];
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            V[] vArr = this.f38070a.f38059b;
            C5207g.m11108c(vArr);
            return vArr[this.f38071b];
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            MapBuilder<K, V> mapBuilder = this.f38070a;
            mapBuilder.m13403b();
            V[] vArr = mapBuilder.f38059b;
            if (vArr == null) {
                vArr = (V[]) C8656b.m16900h(mapBuilder.f38058a.length);
                mapBuilder.f38059b = vArr;
            }
            int i10 = this.f38071b;
            V v11 = vArr[i10];
            vArr[i10] = v10;
            return v11;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.builders.MapBuilder$d */
    public static class C6749d<K, V> {

        /* JADX INFO: renamed from: a */
        public final MapBuilder<K, V> f38072a;

        /* JADX INFO: renamed from: b */
        public int f38073b;

        /* JADX INFO: renamed from: c */
        public int f38074c;

        public C6749d(MapBuilder<K, V> mapBuilder) {
            C5207g.m11111f(mapBuilder, "map");
            this.f38072a = mapBuilder;
            this.f38074c = -1;
            m13411a();
        }

        /* JADX INFO: renamed from: a */
        public final void m13411a() {
            while (true) {
                int i10 = this.f38073b;
                MapBuilder<K, V> mapBuilder = this.f38072a;
                if (i10 >= mapBuilder.f38063f || mapBuilder.f38060c[i10] >= 0) {
                    break;
                } else {
                    this.f38073b = i10 + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.f38073b < this.f38072a.f38063f;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public final void remove() {
            if (!(this.f38074c != -1)) {
                throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
            }
            MapBuilder<K, V> mapBuilder = this.f38072a;
            mapBuilder.m13403b();
            mapBuilder.m13410q(this.f38074c);
            this.f38074c = -1;
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.builders.MapBuilder$e */
    public static final class C6750e<K, V> extends C6749d<K, V> implements Iterator<K>, InterfaceC5429a {
        public C6750e(MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Iterator
        public final K next() {
            int i10 = this.f38073b;
            MapBuilder<K, V> mapBuilder = this.f38072a;
            if (i10 >= mapBuilder.f38063f) {
                throw new NoSuchElementException();
            }
            this.f38073b = i10 + 1;
            this.f38074c = i10;
            K k10 = mapBuilder.f38058a[i10];
            m13411a();
            return k10;
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.builders.MapBuilder$f */
    public static final class C6751f<K, V> extends C6749d<K, V> implements Iterator<V>, InterfaceC5429a {
        public C6751f(MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Iterator
        public final V next() {
            int i10 = this.f38073b;
            MapBuilder<K, V> mapBuilder = this.f38072a;
            if (i10 >= mapBuilder.f38063f) {
                throw new NoSuchElementException();
            }
            this.f38073b = i10 + 1;
            this.f38074c = i10;
            V[] vArr = mapBuilder.f38059b;
            C5207g.m11108c(vArr);
            V v10 = vArr[this.f38074c];
            m13411a();
            return v10;
        }
    }

    static {
        new C6746a();
    }

    public MapBuilder() {
        this(8);
    }

    public MapBuilder(int i10) {
        K[] kArr = (K[]) C8656b.m16900h(i10);
        int[] iArr = new int[i10];
        int iHighestOneBit = Integer.highestOneBit((i10 < 1 ? 1 : i10) * 3);
        this.f38058a = kArr;
        this.f38059b = null;
        this.f38060c = iArr;
        this.f38061d = new int[iHighestOneBit];
        this.f38062e = 2;
        this.f38063f = 0;
        this.f38064g = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f38069l) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    /* JADX INFO: renamed from: a */
    public final int m13402a(K k10) {
        m13403b();
        while (true) {
            int iM13408l = m13408l(k10);
            int i10 = this.f38062e * 2;
            int length = this.f38061d.length / 2;
            if (i10 > length) {
                i10 = length;
            }
            int i11 = 0;
            while (true) {
                int[] iArr = this.f38061d;
                int i12 = iArr[iM13408l];
                if (i12 <= 0) {
                    int i13 = this.f38063f;
                    K[] kArr = this.f38058a;
                    if (i13 >= kArr.length) {
                        m13406e(1);
                        break;
                    }
                    int i14 = i13 + 1;
                    this.f38063f = i14;
                    kArr[i13] = k10;
                    this.f38060c[i13] = iM13408l;
                    iArr[iM13408l] = i14;
                    this.f38065h++;
                    if (i11 > this.f38062e) {
                        this.f38062e = i11;
                    }
                    return i13;
                }
                if (C5207g.m11106a(this.f38058a[i12 - 1], k10)) {
                    return -i12;
                }
                i11++;
                if (i11 > i10) {
                    m13409n(this.f38061d.length * 2);
                    break;
                }
                iM13408l = iM13408l == 0 ? this.f38061d.length - 1 : iM13408l - 1;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m13403b() {
        if (this.f38069l) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m13404c(Collection<?> collection) {
        C5207g.m11111f(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!m13405d((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final void clear() {
        m13403b();
        C6525h c6525hM13104g = new C6526i(0, this.f38063f - 1).iterator();
        loop0: while (true) {
            while (true) {
                if (!c6525hM13104g.f37168c) {
                    break loop0;
                }
                int iMo13105a = c6525hM13104g.mo13105a();
                int[] iArr = this.f38060c;
                int i10 = iArr[iMo13105a];
                if (i10 >= 0) {
                    this.f38061d[i10] = 0;
                    iArr[iMo13105a] = -1;
                }
            }
        }
        C8656b.m16891R(0, this.f38063f, this.f38058a);
        V[] vArr = this.f38059b;
        if (vArr != null) {
            C8656b.m16891R(0, this.f38063f, vArr);
        }
        this.f38065h = 0;
        this.f38063f = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m13407k(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i10;
        int i11 = this.f38063f;
        while (true) {
            i10 = -1;
            i11--;
            if (i11 < 0) {
                break;
            }
            if (this.f38060c[i11] >= 0) {
                V[] vArr = this.f38059b;
                C5207g.m11108c(vArr);
                if (C5207g.m11106a(vArr[i11], obj)) {
                    i10 = i11;
                    break;
                }
            }
        }
        return i10 >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m13405d(Map.Entry<? extends K, ? extends V> entry) {
        C5207g.m11111f(entry, "entry");
        int iM13407k = m13407k(entry.getKey());
        if (iM13407k < 0) {
            return false;
        }
        V[] vArr = this.f38059b;
        C5207g.m11108c(vArr);
        return C5207g.m11106a(vArr[iM13407k], entry.getValue());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final void m13406e(int i10) {
        V[] vArr;
        K[] kArr = this.f38058a;
        int length = kArr.length;
        int i11 = this.f38063f;
        int i12 = length - i11;
        int i13 = i11 - this.f38065h;
        int i14 = 1;
        if (i12 < i10 && i12 + i13 >= i10 && i13 >= kArr.length / 4) {
            m13409n(this.f38061d.length);
            return;
        }
        int i15 = i11 + i10;
        if (i15 < 0) {
            throw new OutOfMemoryError();
        }
        if (i15 > kArr.length) {
            int length2 = (kArr.length * 3) / 2;
            if (i15 <= length2) {
                i15 = length2;
            }
            K[] kArr2 = (K[]) Arrays.copyOf(kArr, i15);
            C5207g.m11110e(kArr2, "copyOf(this, newSize)");
            this.f38058a = kArr2;
            V[] vArr2 = this.f38059b;
            if (vArr2 != null) {
                vArr = (V[]) Arrays.copyOf(vArr2, i15);
                C5207g.m11110e(vArr, "copyOf(this, newSize)");
            } else {
                vArr = null;
            }
            this.f38059b = vArr;
            int[] iArrCopyOf = Arrays.copyOf(this.f38060c, i15);
            C5207g.m11110e(iArrCopyOf, "copyOf(this, newSize)");
            this.f38060c = iArrCopyOf;
            if (i15 >= 1) {
                i14 = i15;
            }
            int iHighestOneBit = Integer.highestOneBit(i14 * 3);
            if (iHighestOneBit > this.f38061d.length) {
                m13409n(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        C6117j c6117j = this.f38068k;
        if (c6117j != null) {
            return c6117j;
        }
        C6117j c6117j2 = new C6117j(this);
        this.f38068k = c6117j2;
        return c6117j2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f38065h == map.size() && m13404c(map.entrySet())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V get(Object obj) {
        int iM13407k = m13407k(obj);
        if (iM13407k < 0) {
            return null;
        }
        V[] vArr = this.f38059b;
        C5207g.m11108c(vArr);
        return vArr[iM13407k];
    }

    @Override // java.util.Map
    public final int hashCode() {
        C6747b c6747b = new C6747b(this);
        int i10 = 0;
        while (c6747b.hasNext()) {
            int i11 = c6747b.f38073b;
            MapBuilder<K, V> mapBuilder = c6747b.f38072a;
            if (i11 >= mapBuilder.f38063f) {
                throw new NoSuchElementException();
            }
            c6747b.f38073b = i11 + 1;
            c6747b.f38074c = i11;
            K k10 = mapBuilder.f38058a[i11];
            int iHashCode = k10 != null ? k10.hashCode() : 0;
            V[] vArr = mapBuilder.f38059b;
            C5207g.m11108c(vArr);
            V v10 = vArr[c6747b.f38074c];
            int iHashCode2 = v10 != null ? v10.hashCode() : 0;
            c6747b.m13411a();
            i10 += iHashCode ^ iHashCode2;
        }
        return i10;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f38065h == 0;
    }

    /* JADX INFO: renamed from: k */
    public final int m13407k(K k10) {
        int iM13408l = m13408l(k10);
        int i10 = this.f38062e;
        while (true) {
            int i11 = this.f38061d[iM13408l];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (C5207g.m11106a(this.f38058a[i12], k10)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iM13408l = iM13408l == 0 ? this.f38061d.length - 1 : iM13408l - 1;
        }
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        C9554a<K> c9554a = this.f38066i;
        if (c9554a == null) {
            c9554a = new C9554a<>(this);
            this.f38066i = c9554a;
        }
        return c9554a;
    }

    /* JADX INFO: renamed from: l */
    public final int m13408l(K k10) {
        return ((k10 != null ? k10.hashCode() : 0) * (-1640531527)) >>> this.f38064g;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: n */
    public final void m13409n(int i10) {
        boolean z10;
        int i11;
        if (this.f38063f > this.f38065h) {
            V[] vArr = this.f38059b;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                i11 = this.f38063f;
                if (i12 >= i11) {
                    break;
                }
                if (this.f38060c[i12] >= 0) {
                    K[] kArr = this.f38058a;
                    kArr[i13] = kArr[i12];
                    if (vArr != null) {
                        vArr[i13] = vArr[i12];
                    }
                    i13++;
                }
                i12++;
            }
            C8656b.m16891R(i13, i11, this.f38058a);
            if (vArr != null) {
                C8656b.m16891R(i13, this.f38063f, vArr);
            }
            this.f38063f = i13;
        }
        int[] iArr = this.f38061d;
        if (i10 != iArr.length) {
            this.f38061d = new int[i10];
            this.f38064g = Integer.numberOfLeadingZeros(i10) + 1;
        } else {
            Arrays.fill(iArr, 0, iArr.length, 0);
        }
        int i14 = 0;
        while (i14 < this.f38063f) {
            int i15 = i14 + 1;
            int iM13408l = m13408l(this.f38058a[i14]);
            int i16 = this.f38062e;
            while (true) {
                int[] iArr2 = this.f38061d;
                if (iArr2[iM13408l] == 0) {
                    iArr2[iM13408l] = i15;
                    this.f38060c[i14] = iM13408l;
                    z10 = true;
                    break;
                } else {
                    i16--;
                    if (i16 < 0) {
                        z10 = false;
                        break;
                    }
                    iM13408l = iM13408l == 0 ? iArr2.length - 1 : iM13408l - 1;
                }
            }
            if (!z10) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i14 = i15;
        }
    }

    @Override // java.util.Map
    public final V put(K k10, V v10) {
        m13403b();
        int iM13402a = m13402a(k10);
        V[] vArr = this.f38059b;
        if (vArr == null) {
            vArr = (V[]) C8656b.m16900h(this.f38058a.length);
            this.f38059b = vArr;
        }
        if (iM13402a >= 0) {
            vArr[iM13402a] = v10;
            return null;
        }
        int i10 = (-iM13402a) - 1;
        V v11 = vArr[i10];
        vArr[i10] = v10;
        return v11;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        C5207g.m11111f(map, "from");
        m13403b();
        Set<Map.Entry<? extends K, ? extends V>> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        m13406e(setEntrySet.size());
        for (Map.Entry<? extends K, ? extends V> entry : setEntrySet) {
            int iM13402a = m13402a(entry.getKey());
            V[] vArr = this.f38059b;
            if (vArr == null) {
                vArr = (V[]) C8656b.m16900h(this.f38058a.length);
                this.f38059b = vArr;
            }
            if (iM13402a >= 0) {
                vArr[iM13402a] = entry.getValue();
            } else {
                int i10 = (-iM13402a) - 1;
                if (!C5207g.m11106a(entry.getValue(), vArr[i10])) {
                    vArr[i10] = entry.getValue();
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m13410q(int i10) {
        K[] kArr = this.f38058a;
        C5207g.m11111f(kArr, "<this>");
        kArr[i10] = null;
        int length = this.f38060c[i10];
        int i11 = this.f38062e * 2;
        int length2 = this.f38061d.length / 2;
        if (i11 > length2) {
            i11 = length2;
        }
        int i12 = i11;
        int i13 = 0;
        int i14 = length;
        do {
            length = length == 0 ? this.f38061d.length - 1 : length - 1;
            i13++;
            if (i13 > this.f38062e) {
                this.f38061d[i14] = 0;
            } else {
                int[] iArr = this.f38061d;
                int i15 = iArr[length];
                if (i15 == 0) {
                    iArr[i14] = 0;
                } else {
                    if (i15 < 0) {
                        iArr[i14] = -1;
                    } else {
                        int i16 = i15 - 1;
                        int iM13408l = m13408l(this.f38058a[i16]) - length;
                        int[] iArr2 = this.f38061d;
                        if ((iM13408l & (iArr2.length - 1)) >= i13) {
                            iArr2[i14] = i15;
                            this.f38060c[i16] = i14;
                        }
                        i12--;
                    }
                    i14 = length;
                    i13 = 0;
                    i12--;
                }
            }
            this.f38060c[i10] = -1;
            this.f38065h--;
        } while (i12 >= 0);
        this.f38061d[i14] = -1;
        this.f38060c[i10] = -1;
        this.f38065h--;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V remove(Object obj) {
        m13403b();
        int iM13407k = m13407k(obj);
        if (iM13407k < 0) {
            iM13407k = -1;
        } else {
            m13410q(iM13407k);
        }
        if (iM13407k < 0) {
            return null;
        }
        V[] vArr = this.f38059b;
        C5207g.m11108c(vArr);
        V v10 = vArr[iM13407k];
        vArr[iM13407k] = null;
        return v10;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f38065h;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f38065h * 3) + 2);
        sb2.append("{");
        C6747b c6747b = new C6747b(this);
        int i10 = 0;
        while (c6747b.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            int i11 = c6747b.f38073b;
            MapBuilder<K, V> mapBuilder = c6747b.f38072a;
            if (i11 >= mapBuilder.f38063f) {
                throw new NoSuchElementException();
            }
            c6747b.f38073b = i11 + 1;
            c6747b.f38074c = i11;
            K k10 = mapBuilder.f38058a[i11];
            if (C5207g.m11106a(k10, mapBuilder)) {
                sb2.append("(this Map)");
            } else {
                sb2.append(k10);
            }
            sb2.append('=');
            V[] vArr = mapBuilder.f38059b;
            C5207g.m11108c(vArr);
            V v10 = vArr[c6747b.f38074c];
            if (C5207g.m11106a(v10, mapBuilder)) {
                sb2.append("(this Map)");
            } else {
                sb2.append(v10);
            }
            c6747b.m13411a();
            i10++;
        }
        sb2.append("}");
        String string = sb2.toString();
        C5207g.m11110e(string, "sb.toString()");
        return string;
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        C6119l c6119l = this.f38067j;
        if (c6119l != null) {
            return c6119l;
        }
        C6119l c6119l2 = new C6119l(this);
        this.f38067j = c6119l2;
        return c6119l2;
    }
}
