package com.squareup.moshi;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: i */
    public static final C4933a f32183i = new C4933a();

    /* JADX INFO: renamed from: g */
    public LinkedHashTreeMap<K, V>.C4935c f32190g;

    /* JADX INFO: renamed from: h */
    public LinkedHashTreeMap<K, V>.C4936d f32191h;

    /* JADX INFO: renamed from: d */
    public int f32187d = 0;

    /* JADX INFO: renamed from: e */
    public int f32188e = 0;

    /* JADX INFO: renamed from: a */
    public final Comparator<? super K> f32184a = f32183i;

    /* JADX INFO: renamed from: c */
    public final C4938f<K, V> f32186c = new C4938f<>();

    /* JADX INFO: renamed from: b */
    public C4938f<K, V>[] f32185b = new C4938f[16];

    /* JADX INFO: renamed from: f */
    public int f32189f = 12;

    /* JADX INFO: renamed from: com.squareup.moshi.LinkedHashTreeMap$a */
    public class C4933a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.LinkedHashTreeMap$b */
    public static final class C4934b<K, V> {

        /* JADX INFO: renamed from: a */
        public C4938f<K, V> f32192a;

        /* JADX INFO: renamed from: b */
        public int f32193b;

        /* JADX INFO: renamed from: c */
        public int f32194c;

        /* JADX INFO: renamed from: d */
        public int f32195d;

        /* JADX INFO: renamed from: a */
        public final void m10521a(C4938f<K, V> c4938f) {
            c4938f.f32204c = null;
            c4938f.f32202a = null;
            c4938f.f32203b = null;
            c4938f.f32210i = 1;
            int i10 = this.f32193b;
            if (i10 > 0) {
                int i11 = this.f32195d;
                if ((i11 & 1) == 0) {
                    this.f32195d = i11 + 1;
                    this.f32193b = i10 - 1;
                    this.f32194c++;
                }
            }
            c4938f.f32202a = this.f32192a;
            this.f32192a = c4938f;
            int i12 = this.f32195d + 1;
            this.f32195d = i12;
            int i13 = this.f32193b;
            if (i13 > 0 && (i12 & 1) == 0) {
                this.f32195d = i12 + 1;
                this.f32193b = i13 - 1;
                this.f32194c++;
            }
            int i14 = 4;
            while (true) {
                int i15 = i14 - 1;
                if ((this.f32195d & i15) != i15) {
                    return;
                }
                int i16 = this.f32194c;
                if (i16 == 0) {
                    C4938f<K, V> c4938f2 = this.f32192a;
                    C4938f<K, V> c4938f3 = c4938f2.f32202a;
                    C4938f<K, V> c4938f4 = c4938f3.f32202a;
                    c4938f3.f32202a = c4938f4.f32202a;
                    this.f32192a = c4938f3;
                    c4938f3.f32203b = c4938f4;
                    c4938f3.f32204c = c4938f2;
                    c4938f3.f32210i = c4938f2.f32210i + 1;
                    c4938f4.f32202a = c4938f3;
                    c4938f2.f32202a = c4938f3;
                } else if (i16 == 1) {
                    C4938f<K, V> c4938f5 = this.f32192a;
                    C4938f<K, V> c4938f6 = c4938f5.f32202a;
                    this.f32192a = c4938f6;
                    c4938f6.f32204c = c4938f5;
                    c4938f6.f32210i = c4938f5.f32210i + 1;
                    c4938f5.f32202a = c4938f6;
                    this.f32194c = 0;
                } else if (i16 == 2) {
                    this.f32194c = 0;
                }
                i14 *= 2;
            }
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.LinkedHashTreeMap$c */
    public final class C4935c extends AbstractSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: com.squareup.moshi.LinkedHashTreeMap$c$a */
        public class a extends LinkedHashTreeMap<K, V>.AbstractC4937e<Map.Entry<K, V>> {
            public a(C4935c c4935c) {
                super();
            }

            @Override // java.util.Iterator
            public final Object next() {
                return m10522a();
            }
        }

        public C4935c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            LinkedHashTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedHashTreeMap.this.m10515b((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            LinkedHashTreeMap linkedHashTreeMap;
            C4938f<K, V> c4938fM10515b;
            if ((obj instanceof Map.Entry) && (c4938fM10515b = (linkedHashTreeMap = LinkedHashTreeMap.this).m10515b((Map.Entry) obj)) != null) {
                linkedHashTreeMap.m10517d(c4938fM10515b, true);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return LinkedHashTreeMap.this.f32187d;
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.LinkedHashTreeMap$d */
    public final class C4936d extends AbstractSet<K> {

        /* JADX INFO: renamed from: com.squareup.moshi.LinkedHashTreeMap$d$a */
        public class a extends LinkedHashTreeMap<K, V>.AbstractC4937e<K> {
            public a(C4936d c4936d) {
                super();
            }

            @Override // java.util.Iterator
            public final K next() {
                return m10522a().f32207f;
            }
        }

        public C4936d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            LinkedHashTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return LinkedHashTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            C4938f<K, V> c4938fM10514a;
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            linkedHashTreeMap.getClass();
            if (obj != null) {
                try {
                    c4938fM10514a = linkedHashTreeMap.m10514a(obj, false);
                } catch (ClassCastException unused) {
                    c4938fM10514a = null;
                }
            } else {
                c4938fM10514a = null;
            }
            if (c4938fM10514a != null) {
                linkedHashTreeMap.m10517d(c4938fM10514a, true);
            }
            return c4938fM10514a != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return LinkedHashTreeMap.this.f32187d;
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.LinkedHashTreeMap$e */
    public abstract class AbstractC4937e<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public C4938f<K, V> f32198a;

        /* JADX INFO: renamed from: b */
        public C4938f<K, V> f32199b = null;

        /* JADX INFO: renamed from: c */
        public int f32200c;

        public AbstractC4937e() {
            this.f32198a = LinkedHashTreeMap.this.f32186c.f32205d;
            this.f32200c = LinkedHashTreeMap.this.f32188e;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final C4938f<K, V> m10522a() {
            C4938f<K, V> c4938f = this.f32198a;
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            if (c4938f == linkedHashTreeMap.f32186c) {
                throw new NoSuchElementException();
            }
            if (linkedHashTreeMap.f32188e != this.f32200c) {
                throw new ConcurrentModificationException();
            }
            this.f32198a = c4938f.f32205d;
            this.f32199b = c4938f;
            return c4938f;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f32198a != LinkedHashTreeMap.this.f32186c;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Iterator
        public final void remove() {
            C4938f<K, V> c4938f = this.f32199b;
            if (c4938f == null) {
                throw new IllegalStateException();
            }
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            linkedHashTreeMap.m10517d(c4938f, true);
            this.f32199b = null;
            this.f32200c = linkedHashTreeMap.f32188e;
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.LinkedHashTreeMap$f */
    public static final class C4938f<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a */
        public C4938f<K, V> f32202a;

        /* JADX INFO: renamed from: b */
        public C4938f<K, V> f32203b;

        /* JADX INFO: renamed from: c */
        public C4938f<K, V> f32204c;

        /* JADX INFO: renamed from: d */
        public C4938f<K, V> f32205d;

        /* JADX INFO: renamed from: e */
        public C4938f<K, V> f32206e;

        /* JADX INFO: renamed from: f */
        public final K f32207f;

        /* JADX INFO: renamed from: g */
        public final int f32208g;

        /* JADX INFO: renamed from: h */
        public V f32209h;

        /* JADX INFO: renamed from: i */
        public int f32210i;

        public C4938f() {
            this.f32207f = null;
            this.f32208g = -1;
            this.f32206e = this;
            this.f32205d = this;
        }

        public C4938f(C4938f<K, V> c4938f, K k10, int i10, C4938f<K, V> c4938f2, C4938f<K, V> c4938f3) {
            this.f32202a = c4938f;
            this.f32207f = k10;
            this.f32208g = i10;
            this.f32210i = 1;
            this.f32205d = c4938f2;
            this.f32206e = c4938f3;
            c4938f3.f32205d = this;
            c4938f2.f32206e = this;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x002b  */
        /* JADX WARN: Code duplicated, block: B:17:0x0032  */
        /* JADX WARN: Code duplicated, block: B:19:0x003c  */
        /* JADX WARN: Code duplicated, block: B:20:0x003d  */
        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            V v10;
            boolean z10 = false;
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k10 = this.f32207f;
                if (k10 == null) {
                    if (entry.getKey() == null) {
                        v10 = this.f32209h;
                        if (v10 == null) {
                            if (entry.getValue() == null) {
                                z10 = true;
                            }
                        } else if (v10.equals(entry.getValue())) {
                            z10 = true;
                        }
                    }
                } else if (k10.equals(entry.getKey())) {
                    v10 = this.f32209h;
                    if (v10 == null) {
                        if (entry.getValue() == null) {
                            z10 = true;
                        }
                    } else if (v10.equals(entry.getValue())) {
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f32207f;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f32209h;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k10 = this.f32207f;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f32209h;
            return (v10 != null ? v10.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            V v11 = this.f32209h;
            this.f32209h = v10;
            return v11;
        }

        public final String toString() {
            return this.f32207f + "=" + this.f32209h;
        }
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    /* JADX INFO: renamed from: a */
    public final C4938f<K, V> m10514a(K k10, boolean z10) {
        C4938f<K, V> c4938f;
        int i10;
        C4938f<K, V> c4938f2;
        C4938f<K, V> c4938f3;
        C4938f<K, V> c4938f4;
        C4938f<K, V> c4938f5;
        C4938f<K, V> c4938f6;
        C4938f<K, V>[] c4938fArr = this.f32185b;
        int iHashCode = k10.hashCode();
        int i11 = iHashCode ^ ((iHashCode >>> 20) ^ (iHashCode >>> 12));
        int i12 = (i11 >>> 4) ^ ((i11 >>> 7) ^ i11);
        int length = i12 & (c4938fArr.length - 1);
        C4938f<K, V> c4938f7 = c4938fArr[length];
        C4933a c4933a = f32183i;
        C4938f<K, V> c4938f8 = null;
        Comparator<? super K> comparator = this.f32184a;
        if (c4938f7 != null) {
            Comparable comparable = comparator == c4933a ? (Comparable) k10 : null;
            while (true) {
                K k11 = c4938f7.f32207f;
                int iCompareTo = comparable != null ? comparable.compareTo(k11) : comparator.compare(k10, k11);
                if (iCompareTo == 0) {
                    return c4938f7;
                }
                C4938f<K, V> c4938f9 = iCompareTo < 0 ? c4938f7.f32203b : c4938f7.f32204c;
                if (c4938f9 == null) {
                    i10 = iCompareTo;
                    c4938f = c4938f7;
                    break;
                }
                c4938f7 = c4938f9;
            }
        } else {
            c4938f = c4938f7;
            i10 = 0;
        }
        if (!z10) {
            return null;
        }
        C4938f<K, V> c4938f10 = this.f32186c;
        if (c4938f != null) {
            C4938f<K, V> c4938f11 = new C4938f<>(c4938f, k10, i12, c4938f10, c4938f10.f32206e);
            if (i10 < 0) {
                c4938f.f32203b = c4938f11;
            } else {
                c4938f.f32204c = c4938f11;
            }
            m10516c(c4938f, true);
            c4938f2 = c4938f11;
        } else {
            if (comparator == c4933a && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName().concat(" is not Comparable"));
            }
            c4938f2 = new C4938f<>(c4938f, k10, i12, c4938f10, c4938f10.f32206e);
            c4938fArr[length] = c4938f2;
        }
        int i13 = this.f32187d;
        this.f32187d = i13 + 1;
        if (i13 > this.f32189f) {
            C4938f<K, V>[] c4938fArr2 = this.f32185b;
            int length2 = c4938fArr2.length;
            int i14 = length2 * 2;
            C4938f<K, V>[] c4938fArr3 = new C4938f[i14];
            C4934b c4934b = new C4934b();
            C4934b c4934b2 = new C4934b();
            for (int i15 = 0; i15 < length2; i15++) {
                C4938f<K, V> c4938f12 = c4938fArr2[i15];
                if (c4938f12 != null) {
                    C4938f<K, V> c4938f13 = c4938f8;
                    for (C4938f<K, V> c4938f14 = c4938f12; c4938f14 != null; c4938f14 = c4938f14.f32203b) {
                        c4938f14.f32202a = c4938f13;
                        c4938f13 = c4938f14;
                    }
                    int i16 = 0;
                    int i17 = 0;
                    while (true) {
                        if (c4938f13 == null) {
                            c4938f3 = c4938f13;
                            c4938f13 = c4938f8;
                        } else {
                            c4938f3 = c4938f13.f32202a;
                            c4938f13.f32202a = c4938f8;
                            C4938f<K, V> c4938f15 = c4938f13.f32204c;
                            while (c4938f15 != null) {
                                c4938f15.f32202a = c4938f3;
                                C4938f<K, V> c4938f16 = c4938f15;
                                c4938f15 = c4938f15.f32203b;
                                c4938f3 = c4938f16;
                            }
                        }
                        if (c4938f13 == null) {
                            break;
                        }
                        if ((c4938f13.f32208g & length2) == 0) {
                            i16++;
                        } else {
                            i17++;
                        }
                        c4938f13 = c4938f3;
                        c4938f8 = null;
                    }
                    c4934b.f32193b = ((Integer.highestOneBit(i16) * 2) - 1) - i16;
                    c4934b.f32195d = 0;
                    c4934b.f32194c = 0;
                    c4934b.f32192a = null;
                    c4934b2.f32193b = ((Integer.highestOneBit(i17) * 2) - 1) - i17;
                    c4934b2.f32195d = 0;
                    c4934b2.f32194c = 0;
                    c4934b2.f32192a = null;
                    C4938f<K, V> c4938f17 = null;
                    while (c4938f12 != null) {
                        c4938f12.f32202a = c4938f17;
                        C4938f<K, V> c4938f18 = c4938f12;
                        c4938f12 = c4938f12.f32203b;
                        c4938f17 = c4938f18;
                    }
                    while (true) {
                        if (c4938f17 != null) {
                            C4938f<K, V> c4938f19 = c4938f17.f32202a;
                            c4938f8 = null;
                            c4938f17.f32202a = null;
                            C4938f<K, V> c4938f20 = c4938f17.f32204c;
                            while (true) {
                                C4938f<K, V> c4938f21 = c4938f20;
                                c4938f4 = c4938f19;
                                c4938f19 = c4938f21;
                                if (c4938f19 == null) {
                                    break;
                                }
                                c4938f19.f32202a = c4938f4;
                                c4938f20 = c4938f19.f32203b;
                            }
                        } else {
                            c4938f4 = c4938f17;
                            c4938f17 = null;
                            c4938f8 = null;
                        }
                        if (c4938f17 == null) {
                            break;
                        }
                        if ((c4938f17.f32208g & length2) == 0) {
                            c4934b.m10521a(c4938f17);
                        } else {
                            c4934b2.m10521a(c4938f17);
                        }
                        c4938f17 = c4938f4;
                    }
                    if (i16 > 0) {
                        c4938f5 = c4934b.f32192a;
                        if (c4938f5.f32202a != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        c4938f5 = c4938f8;
                    }
                    c4938fArr3[i15] = c4938f5;
                    int i18 = i15 + length2;
                    if (i17 > 0) {
                        c4938f6 = c4934b2.f32192a;
                        if (c4938f6.f32202a != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        c4938f6 = c4938f8;
                    }
                    c4938fArr3[i18] = c4938f6;
                }
            }
            this.f32185b = c4938fArr3;
            this.f32189f = (i14 / 4) + (i14 / 2);
        }
        this.f32188e++;
        return c4938f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final C4938f<K, V> m10515b(Map.Entry<?, ?> entry) {
        C4938f<K, V> c4938fM10514a;
        Object key = entry.getKey();
        boolean z10 = false;
        if (key != null) {
            try {
                c4938fM10514a = m10514a(key, false);
            } catch (ClassCastException unused) {
                c4938fM10514a = null;
            }
        } else {
            c4938fM10514a = null;
        }
        if (c4938fM10514a != null) {
            V v10 = c4938fM10514a.f32209h;
            Object value = entry.getValue();
            if (v10 == value || (v10 != null && v10.equals(value))) {
                z10 = true;
            }
        }
        if (z10) {
            return c4938fM10514a;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m10516c(C4938f<K, V> c4938f, boolean z10) {
        while (c4938f != null) {
            C4938f<K, V> c4938f2 = c4938f.f32203b;
            C4938f<K, V> c4938f3 = c4938f.f32204c;
            int i10 = c4938f2 != null ? c4938f2.f32210i : 0;
            int i11 = c4938f3 != null ? c4938f3.f32210i : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                C4938f<K, V> c4938f4 = c4938f3.f32203b;
                C4938f<K, V> c4938f5 = c4938f3.f32204c;
                int i13 = (c4938f4 != null ? c4938f4.f32210i : 0) - (c4938f5 != null ? c4938f5.f32210i : 0);
                if (i13 != -1 && (i13 != 0 || z10)) {
                    m10520k(c4938f3);
                }
                m10519h(c4938f);
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                C4938f<K, V> c4938f6 = c4938f2.f32203b;
                C4938f<K, V> c4938f7 = c4938f2.f32204c;
                int i14 = (c4938f6 != null ? c4938f6.f32210i : 0) - (c4938f7 != null ? c4938f7.f32210i : 0);
                if (i14 != 1 && (i14 != 0 || z10)) {
                    m10519h(c4938f2);
                }
                m10520k(c4938f);
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                c4938f.f32210i = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                c4938f.f32210i = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            c4938f = c4938f.f32202a;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.f32185b, (Object) null);
        this.f32187d = 0;
        this.f32188e++;
        C4938f<K, V> c4938f = this.f32186c;
        C4938f<K, V> c4938f2 = c4938f.f32205d;
        while (c4938f2 != c4938f) {
            C4938f<K, V> c4938f3 = c4938f2.f32205d;
            c4938f2.f32206e = null;
            c4938f2.f32205d = null;
            c4938f2 = c4938f3;
        }
        c4938f.f32206e = c4938f;
        c4938f.f32205d = c4938f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C4938f<K, V> c4938fM10514a;
        boolean z10 = false;
        if (obj != 0) {
            try {
                c4938fM10514a = m10514a(obj, false);
            } catch (ClassCastException unused) {
                c4938fM10514a = null;
            }
        } else {
            c4938fM10514a = null;
        }
        if (c4938fM10514a != null) {
            z10 = true;
        }
        return z10;
    }

    /* JADX INFO: renamed from: d */
    public final void m10517d(C4938f<K, V> c4938f, boolean z10) {
        C4938f<K, V> c4938f2;
        C4938f<K, V> c4938f3;
        int i10;
        if (z10) {
            C4938f<K, V> c4938f4 = c4938f.f32206e;
            c4938f4.f32205d = c4938f.f32205d;
            c4938f.f32205d.f32206e = c4938f4;
            c4938f.f32206e = null;
            c4938f.f32205d = null;
        }
        C4938f<K, V> c4938f5 = c4938f.f32203b;
        C4938f<K, V> c4938f6 = c4938f.f32204c;
        C4938f<K, V> c4938f7 = c4938f.f32202a;
        int i11 = 0;
        if (c4938f5 == null || c4938f6 == null) {
            if (c4938f5 != null) {
                m10518e(c4938f, c4938f5);
                c4938f.f32203b = null;
            } else if (c4938f6 != null) {
                m10518e(c4938f, c4938f6);
                c4938f.f32204c = null;
            } else {
                m10518e(c4938f, null);
            }
            m10516c(c4938f7, false);
            this.f32187d--;
            this.f32188e++;
            return;
        }
        if (c4938f5.f32210i > c4938f6.f32210i) {
            C4938f<K, V> c4938f8 = c4938f5.f32204c;
            while (true) {
                C4938f<K, V> c4938f9 = c4938f8;
                c4938f3 = c4938f5;
                c4938f5 = c4938f9;
                if (c4938f5 == null) {
                    break;
                } else {
                    c4938f8 = c4938f5.f32204c;
                }
            }
        } else {
            C4938f<K, V> c4938f10 = c4938f6.f32203b;
            while (true) {
                c4938f2 = c4938f6;
                c4938f6 = c4938f10;
                if (c4938f6 == null) {
                    break;
                } else {
                    c4938f10 = c4938f6.f32203b;
                }
            }
            c4938f3 = c4938f2;
        }
        m10517d(c4938f3, false);
        C4938f<K, V> c4938f11 = c4938f.f32203b;
        if (c4938f11 != null) {
            i10 = c4938f11.f32210i;
            c4938f3.f32203b = c4938f11;
            c4938f11.f32202a = c4938f3;
            c4938f.f32203b = null;
        } else {
            i10 = 0;
        }
        C4938f<K, V> c4938f12 = c4938f.f32204c;
        if (c4938f12 != null) {
            i11 = c4938f12.f32210i;
            c4938f3.f32204c = c4938f12;
            c4938f12.f32202a = c4938f3;
            c4938f.f32204c = null;
        }
        c4938f3.f32210i = Math.max(i10, i11) + 1;
        m10518e(c4938f, c4938f3);
    }

    /* JADX INFO: renamed from: e */
    public final void m10518e(C4938f<K, V> c4938f, C4938f<K, V> c4938f2) {
        C4938f<K, V> c4938f3 = c4938f.f32202a;
        c4938f.f32202a = null;
        if (c4938f2 != null) {
            c4938f2.f32202a = c4938f3;
        }
        if (c4938f3 == null) {
            C4938f<K, V>[] c4938fArr = this.f32185b;
            c4938fArr[c4938f.f32208g & (c4938fArr.length - 1)] = c4938f2;
        } else if (c4938f3.f32203b == c4938f) {
            c4938f3.f32203b = c4938f2;
        } else {
            c4938f3.f32204c = c4938f2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        LinkedHashTreeMap<K, V>.C4935c c4935c = this.f32190g;
        if (c4935c != null) {
            return c4935c;
        }
        LinkedHashTreeMap<K, V>.C4935c c4935c2 = new C4935c();
        this.f32190g = c4935c2;
        return c4935c2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        C4938f<K, V> c4938fM10514a;
        if (obj != 0) {
            try {
                c4938fM10514a = m10514a(obj, false);
            } catch (ClassCastException unused) {
                c4938fM10514a = null;
            }
        } else {
            c4938fM10514a = null;
        }
        return c4938fM10514a != null ? c4938fM10514a.f32209h : null;
    }

    /* JADX INFO: renamed from: h */
    public final void m10519h(C4938f<K, V> c4938f) {
        C4938f<K, V> c4938f2 = c4938f.f32203b;
        C4938f<K, V> c4938f3 = c4938f.f32204c;
        C4938f<K, V> c4938f4 = c4938f3.f32203b;
        C4938f<K, V> c4938f5 = c4938f3.f32204c;
        c4938f.f32204c = c4938f4;
        if (c4938f4 != null) {
            c4938f4.f32202a = c4938f;
        }
        m10518e(c4938f, c4938f3);
        c4938f3.f32203b = c4938f;
        c4938f.f32202a = c4938f3;
        int iMax = Math.max(c4938f2 != null ? c4938f2.f32210i : 0, c4938f4 != null ? c4938f4.f32210i : 0) + 1;
        c4938f.f32210i = iMax;
        c4938f3.f32210i = Math.max(iMax, c4938f5 != null ? c4938f5.f32210i : 0) + 1;
    }

    /* JADX INFO: renamed from: k */
    public final void m10520k(C4938f<K, V> c4938f) {
        C4938f<K, V> c4938f2 = c4938f.f32203b;
        C4938f<K, V> c4938f3 = c4938f.f32204c;
        C4938f<K, V> c4938f4 = c4938f2.f32203b;
        C4938f<K, V> c4938f5 = c4938f2.f32204c;
        c4938f.f32203b = c4938f5;
        if (c4938f5 != null) {
            c4938f5.f32202a = c4938f;
        }
        m10518e(c4938f, c4938f2);
        c4938f2.f32204c = c4938f;
        c4938f.f32202a = c4938f2;
        int i10 = 0;
        int iMax = Math.max(c4938f3 != null ? c4938f3.f32210i : 0, c4938f5 != null ? c4938f5.f32210i : 0) + 1;
        c4938f.f32210i = iMax;
        if (c4938f4 != null) {
            i10 = c4938f4.f32210i;
        }
        c4938f2.f32210i = Math.max(iMax, i10) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        LinkedHashTreeMap<K, V>.C4936d c4936d = this.f32191h;
        if (c4936d != null) {
            return c4936d;
        }
        LinkedHashTreeMap<K, V>.C4936d c4936d2 = new C4936d();
        this.f32191h = c4936d2;
        return c4936d2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        C4938f<K, V> c4938fM10514a = m10514a(k10, true);
        V v11 = c4938fM10514a.f32209h;
        c4938fM10514a.f32209h = v10;
        return v11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        C4938f<K, V> c4938fM10514a;
        if (obj != 0) {
            try {
                c4938fM10514a = m10514a(obj, false);
            } catch (ClassCastException unused) {
                c4938fM10514a = null;
            }
        } else {
            c4938fM10514a = null;
        }
        if (c4938fM10514a != null) {
            m10517d(c4938fM10514a, true);
        }
        if (c4938fM10514a != null) {
            return c4938fM10514a.f32209h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f32187d;
    }
}
