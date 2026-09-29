package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;
import p338qd.C8573r0;

/* JADX INFO: loaded from: classes.dex */
final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {

    /* JADX INFO: renamed from: g */
    public static final ImmutableMap<Object, Object> f16119g = new RegularImmutableMap(0, null, new Object[0]);

    /* JADX INFO: renamed from: d */
    public final transient Object f16120d;

    /* JADX INFO: renamed from: e */
    public final transient Object[] f16121e;

    /* JADX INFO: renamed from: f */
    public final transient int f16122f;

    public static class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: d */
        public final transient ImmutableMap<K, V> f16123d;

        /* JADX INFO: renamed from: e */
        public final transient Object[] f16124e;

        /* JADX INFO: renamed from: f */
        public final transient int f16125f = 0;

        /* JADX INFO: renamed from: g */
        public final transient int f16126g;

        public EntrySet(ImmutableMap immutableMap, Object[] objArr, int i10) {
            this.f16123d = immutableMap;
            this.f16124e = objArr;
            this.f16126g = i10;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* JADX INFO: renamed from: C */
        public final AbstractC3187f0<Map.Entry<K, V>> iterator() {
            return mo9049a().listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableSet
        /* JADX INFO: renamed from: X */
        public final ImmutableList<Map.Entry<K, V>> mo9083X() {
            return new ImmutableList<Map.Entry<K, V>>() { // from class: com.google.common.collect.RegularImmutableMap.EntrySet.1
                @Override // java.util.List
                public final Object get(int i10) {
                    EntrySet entrySet = EntrySet.this;
                    C8573r0.m16683L(i10, entrySet.f16126g);
                    int i11 = i10 * 2;
                    int i12 = entrySet.f16125f;
                    Object[] objArr = entrySet.f16124e;
                    Object obj = objArr[i12 + i11];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArr[i11 + (i12 ^ 1)];
                    Objects.requireNonNull(obj2);
                    return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
                    return EntrySet.this.f16126g;
                }

                @Override // com.google.common.collect.ImmutableCollection
                /* JADX INFO: renamed from: y */
                public final boolean mo9054y() {
                    return true;
                }
            };
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f16123d.get(key));
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: l */
        public final int mo9050l(int i10, Object[] objArr) {
            return mo9049a().mo9050l(i10, objArr);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f16126g;
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: y */
        public final boolean mo9054y() {
            return true;
        }
    }

    public static final class KeySet<K> extends ImmutableSet<K> {

        /* JADX INFO: renamed from: d */
        public final transient ImmutableMap<K, ?> f16128d;

        /* JADX INFO: renamed from: e */
        public final transient ImmutableList<K> f16129e;

        public KeySet(ImmutableMap<K, ?> immutableMap, ImmutableList<K> immutableList) {
            this.f16128d = immutableMap;
            this.f16129e = immutableList;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* JADX INFO: renamed from: C */
        public final AbstractC3187f0<K> iterator() {
            return this.f16129e.listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: a */
        public final ImmutableList<K> mo9049a() {
            return this.f16129e;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return this.f16128d.get(obj) != null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: l */
        public final int mo9050l(int i10, Object[] objArr) {
            return this.f16129e.mo9050l(i10, objArr);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f16128d.size();
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: y */
        public final boolean mo9054y() {
            return true;
        }
    }

    public static final class KeysOrValuesAsList extends ImmutableList<Object> {

        /* JADX INFO: renamed from: c */
        public final transient Object[] f16130c;

        /* JADX INFO: renamed from: d */
        public final transient int f16131d;

        /* JADX INFO: renamed from: e */
        public final transient int f16132e;

        public KeysOrValuesAsList(int i10, int i11, Object[] objArr) {
            this.f16130c = objArr;
            this.f16131d = i10;
            this.f16132e = i11;
        }

        @Override // java.util.List
        public final Object get(int i10) {
            C8573r0.m16683L(i10, this.f16132e);
            Object obj = this.f16130c[(i10 * 2) + this.f16131d];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f16132e;
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: y */
        public final boolean mo9054y() {
            return true;
        }
    }

    public RegularImmutableMap(int i10, Object obj, Object[] objArr) {
        this.f16120d = obj;
        this.f16121e = objArr;
        this.f16122f = i10;
    }

    /* JADX INFO: renamed from: k */
    public static IllegalArgumentException m9120k(int i10, Object obj, Object obj2, Object[] objArr) {
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(obj2);
        String strValueOf3 = String.valueOf(objArr[i10]);
        String strValueOf4 = String.valueOf(objArr[i10 ^ 1]);
        StringBuilder sb2 = new StringBuilder(strValueOf4.length() + strValueOf3.length() + strValueOf2.length() + strValueOf.length() + 39);
        sb2.append("Multiple entries with same key: ");
        sb2.append(strValueOf);
        sb2.append("=");
        sb2.append(strValueOf2);
        sb2.append(" and ");
        sb2.append(strValueOf3);
        sb2.append("=");
        sb2.append(strValueOf4);
        return new IllegalArgumentException(sb2.toString());
    }

    @Override // com.google.common.collect.ImmutableMap
    /* JADX INFO: renamed from: b */
    public final ImmutableSet<Map.Entry<K, V>> mo9071b() {
        return new EntrySet(this, this.f16121e, this.f16122f);
    }

    @Override // com.google.common.collect.ImmutableMap
    /* JADX INFO: renamed from: c */
    public final ImmutableSet<K> mo9072c() {
        return new KeySet(this, new KeysOrValuesAsList(0, this.f16122f, this.f16121e));
    }

    @Override // com.google.common.collect.ImmutableMap
    /* JADX INFO: renamed from: d */
    public final ImmutableCollection<V> mo9073d() {
        return new KeysOrValuesAsList(1, this.f16122f, this.f16121e);
    }

    @Override // com.google.common.collect.ImmutableMap
    /* JADX INFO: renamed from: e */
    public final void mo9074e() {
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c7 A[RETURN] */
    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final V get(Object obj) {
        V v10;
        if (obj != null) {
            Object[] objArr = this.f16121e;
            if (this.f16122f == 1) {
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                if (obj2.equals(obj)) {
                    v10 = (V) objArr[1];
                    Objects.requireNonNull(v10);
                }
            } else {
                Object obj3 = this.f16120d;
                if (obj3 != null) {
                    if (obj3 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj3;
                        int length = bArr.length - 1;
                        int iM16720d1 = C8573r0.m16720d1(obj.hashCode());
                        while (true) {
                            int i10 = iM16720d1 & length;
                            int i11 = bArr[i10] & 255;
                            if (i11 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i11])) {
                                v10 = (V) objArr[i11 ^ 1];
                            } else {
                                iM16720d1 = i10 + 1;
                            }
                        }
                    } else if (obj3 instanceof short[]) {
                        short[] sArr = (short[]) obj3;
                        int length2 = sArr.length - 1;
                        int iM16720d2 = C8573r0.m16720d1(obj.hashCode());
                        while (true) {
                            int i12 = iM16720d2 & length2;
                            int i13 = sArr[i12] & 65535;
                            if (i13 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[i13])) {
                                v10 = (V) objArr[i13 ^ 1];
                            } else {
                                iM16720d2 = i12 + 1;
                            }
                        }
                    } else {
                        int[] iArr = (int[]) obj3;
                        int length3 = iArr.length - 1;
                        int iM16720d3 = C8573r0.m16720d1(obj.hashCode());
                        while (true) {
                            int i14 = iM16720d3 & length3;
                            int i15 = iArr[i14];
                            if (i15 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i15])) {
                                v10 = (V) objArr[i15 ^ 1];
                            } else {
                                iM16720d3 = i14 + 1;
                            }
                        }
                    }
                }
            }
            if (v10 == null) {
                return null;
            }
            return v10;
        }
        v10 = null;
        if (v10 == null) {
            return null;
        }
        return v10;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f16122f;
    }
}
