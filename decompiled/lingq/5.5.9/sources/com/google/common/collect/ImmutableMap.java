package com.google.common.collect;

import androidx.fragment.app.C0987y;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import p338qd.C8573r0;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {

    /* JADX INFO: renamed from: a */
    @RetainedWith
    public transient ImmutableSet<Map.Entry<K, V>> f16049a;

    /* JADX INFO: renamed from: b */
    @RetainedWith
    public transient ImmutableSet<K> f16050b;

    /* JADX INFO: renamed from: c */
    @RetainedWith
    public transient ImmutableCollection<V> f16051c;

    public static class SerializedForm<K, V> implements Serializable {

        /* JADX INFO: renamed from: a */
        public final Object[] f16052a;

        /* JADX INFO: renamed from: b */
        public final Object[] f16053b;

        public SerializedForm(ImmutableMap<K, V> immutableMap) {
            Object[] objArr = new Object[immutableMap.size()];
            Object[] objArr2 = new Object[immutableMap.size()];
            ImmutableSet<Map.Entry<K, V>> immutableSetMo9071b = immutableMap.f16049a;
            if (immutableSetMo9071b == null) {
                immutableSetMo9071b = immutableMap.mo9071b();
                immutableMap.f16049a = immutableSetMo9071b;
            }
            AbstractC3187f0<Map.Entry<K, V>> it = immutableSetMo9071b.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i10] = next.getKey();
                objArr2[i10] = next.getValue();
                i10++;
            }
            this.f16052a = objArr;
            this.f16053b = objArr2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object readResolve() {
            Object[] objArr = this.f16052a;
            boolean z10 = objArr instanceof ImmutableSet;
            Object[] objArr2 = this.f16053b;
            if (!z10) {
                C3148a c3148a = new C3148a(objArr.length);
                for (int i10 = 0; i10 < objArr.length; i10++) {
                    c3148a.m9076b(objArr[i10], objArr2[i10]);
                }
                return c3148a.m9075a();
            }
            ImmutableSet immutableSet = (ImmutableSet) objArr;
            C3148a c3148a2 = new C3148a(immutableSet.size());
            Iterator it = immutableSet.iterator();
            AbstractC3187f0 it2 = ((ImmutableCollection) objArr2).iterator();
            while (it.hasNext()) {
                c3148a2.m9076b(it.next(), it2.next());
            }
            return c3148a2.m9075a();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableMap$a */
    public static class C3148a<K, V> {

        /* JADX INFO: renamed from: a */
        public Object[] f16054a;

        /* JADX INFO: renamed from: b */
        public int f16055b = 0;

        public C3148a(int i10) {
            this.f16054a = new Object[i10 * 2];
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v3, types: [int[]] */
        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        /* JADX INFO: renamed from: a */
        public final ImmutableMap<K, V> m9075a() {
            int i10;
            int i11;
            int i12;
            int i13 = this.f16055b;
            Object[] objArr = this.f16054a;
            if (i13 == 0) {
                return (RegularImmutableMap) RegularImmutableMap.f16119g;
            }
            ImmutableMap<Object, Object> immutableMap = RegularImmutableMap.f16119g;
            byte[] bArr = 0;
            if (i13 == 1) {
                Objects.requireNonNull(objArr[0]);
                Objects.requireNonNull(objArr[1]);
                return new RegularImmutableMap(1, null, objArr);
            }
            C8573r0.m16687N(i13, objArr.length >> 1);
            int iM9077D = ImmutableSet.m9077D(i13);
            if (i13 == 1) {
                Objects.requireNonNull(objArr[0]);
                Objects.requireNonNull(objArr[1]);
            } else {
                int i14 = iM9077D - 1;
                if (iM9077D <= 128) {
                    bArr = new byte[iM9077D];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i15 = 0; i15 < i13; i15++) {
                        int i16 = (i15 * 2) + 0;
                        Object obj = objArr[i16];
                        Objects.requireNonNull(obj);
                        Object obj2 = objArr[i16 ^ 1];
                        Objects.requireNonNull(obj2);
                        int iM16720d1 = C8573r0.m16720d1(obj.hashCode());
                        while (true) {
                            i12 = iM16720d1 & i14;
                            int i17 = bArr[i12] & 255;
                            if (i17 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i17])) {
                                throw RegularImmutableMap.m9120k(i17, obj, obj2, objArr);
                            }
                            iM16720d1 = i12 + 1;
                        }
                        bArr[i12] = (byte) i16;
                    }
                } else if (iM9077D <= 32768) {
                    bArr = new short[iM9077D];
                    Arrays.fill(bArr, (short) -1);
                    for (int i18 = 0; i18 < i13; i18++) {
                        int i19 = (i18 * 2) + 0;
                        Object obj3 = objArr[i19];
                        Objects.requireNonNull(obj3);
                        Object obj4 = objArr[i19 ^ 1];
                        Objects.requireNonNull(obj4);
                        int iM16720d2 = C8573r0.m16720d1(obj3.hashCode());
                        while (true) {
                            i11 = iM16720d2 & i14;
                            int i20 = bArr[i11] & 65535;
                            if (i20 == 65535) {
                                break;
                            }
                            if (obj3.equals(objArr[i20])) {
                                throw RegularImmutableMap.m9120k(i20, obj3, obj4, objArr);
                            }
                            iM16720d2 = i11 + 1;
                        }
                        bArr[i11] = (short) i19;
                    }
                } else {
                    bArr = new int[iM9077D];
                    Arrays.fill((int[]) bArr, -1);
                    for (int i21 = 0; i21 < i13; i21++) {
                        int i22 = (i21 * 2) + 0;
                        Object obj5 = objArr[i22];
                        Objects.requireNonNull(obj5);
                        Object obj6 = objArr[i22 ^ 1];
                        Objects.requireNonNull(obj6);
                        int iM16720d3 = C8573r0.m16720d1(obj5.hashCode());
                        while (true) {
                            i10 = iM16720d3 & i14;
                            char c10 = bArr[i10];
                            if (c10 == -1) {
                                break;
                            }
                            if (obj5.equals(objArr[c10])) {
                                throw RegularImmutableMap.m9120k(c10, obj5, obj6, objArr);
                            }
                            iM16720d3 = i10 + 1;
                        }
                        bArr[i10] = i22;
                    }
                }
            }
            return new RegularImmutableMap(i13, bArr, objArr);
        }

        /* JADX INFO: renamed from: b */
        public final void m9076b(Object obj, Object obj2) {
            int i10 = (this.f16055b + 1) * 2;
            Object[] objArr = this.f16054a;
            if (i10 > objArr.length) {
                this.f16054a = Arrays.copyOf(objArr, ImmutableCollection.AbstractC3145b.m9057a(objArr.length, i10));
            }
            if (obj == null) {
                String strValueOf = String.valueOf(obj2);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 24);
                sb2.append("null key in entry: null=");
                sb2.append(strValueOf);
                throw new NullPointerException(sb2.toString());
            }
            if (obj2 == null) {
                String strValueOf2 = String.valueOf(obj);
                StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 26);
                sb3.append("null value in entry: ");
                sb3.append(strValueOf2);
                sb3.append("=null");
                throw new NullPointerException(sb3.toString());
            }
            Object[] objArr2 = this.f16054a;
            int i11 = this.f16055b;
            int i12 = i11 * 2;
            objArr2[i12] = obj;
            objArr2[i12 + 1] = obj2;
            this.f16055b = i11 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static <K, V> ImmutableMap<K, V> m9069a(Map<? extends K, ? extends V> map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap<K, V> immutableMap = (ImmutableMap) map;
            immutableMap.mo9074e();
            return immutableMap;
        }
        Set<Map.Entry<? extends K, ? extends V>> setEntrySet = map.entrySet();
        boolean z10 = setEntrySet instanceof Collection;
        C3148a c3148a = new C3148a(z10 ? setEntrySet.size() : 4);
        if (z10) {
            int size = (setEntrySet.size() + c3148a.f16055b) * 2;
            Object[] objArr = c3148a.f16054a;
            if (size > objArr.length) {
                c3148a.f16054a = Arrays.copyOf(objArr, ImmutableCollection.AbstractC3145b.m9057a(objArr.length, size));
            }
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c3148a.m9076b(entry.getKey(), entry.getValue());
        }
        return c3148a.m9075a();
    }

    /* JADX INFO: renamed from: h */
    public static <K, V> ImmutableMap<K, V> m9070h() {
        return (ImmutableMap<K, V>) RegularImmutableMap.f16119g;
    }

    /* JADX INFO: renamed from: b */
    public abstract ImmutableSet<Map.Entry<K, V>> mo9071b();

    /* JADX INFO: renamed from: c */
    public abstract ImmutableSet<K> mo9072c();

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        ImmutableCollection<V> immutableCollectionMo9073d = this.f16051c;
        if (immutableCollectionMo9073d == null) {
            immutableCollectionMo9073d = mo9073d();
            this.f16051c = immutableCollectionMo9073d;
        }
        return immutableCollectionMo9073d.contains(obj);
    }

    /* JADX INFO: renamed from: d */
    public abstract ImmutableCollection<V> mo9073d();

    /* JADX INFO: renamed from: e */
    public abstract void mo9074e();

    @Override // java.util.Map
    public final Set entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSetMo9071b = this.f16049a;
        if (immutableSetMo9071b == null) {
            immutableSetMo9071b = mo9071b();
            this.f16049a = immutableSetMo9071b;
        }
        return immutableSetMo9071b;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    @Override // java.util.Map
    public final int hashCode() {
        ImmutableSet<Map.Entry<K, V>> immutableSetMo9071b = this.f16049a;
        if (immutableSetMo9071b == null) {
            immutableSetMo9071b = mo9071b();
            this.f16049a = immutableSetMo9071b;
        }
        return C3183d0.m9127c(immutableSetMo9071b);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        ImmutableSet<K> immutableSet = this.f16050b;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> immutableSetMo9072c = mo9072c();
        this.f16050b = immutableSetMo9072c;
        return immutableSetMo9072c;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Map
    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        C0987y.m3820b("size", size);
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        ImmutableCollection<V> immutableCollection = this.f16051c;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection<V> immutableCollectionMo9073d = mo9073d();
        this.f16051c = immutableCollectionMo9073d;
        return immutableCollectionMo9073d;
    }

    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
