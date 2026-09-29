package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p000.C3386nv;
import p000.ts3;
import p000.ucd;
import p000.vcd;

/* JADX INFO: loaded from: classes2.dex */
final class zzba extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: j */
    public static final Object f12071j = new Object();

    /* JADX INFO: renamed from: a */
    public transient Object f12072a;

    /* JADX INFO: renamed from: b */
    public transient int[] f12073b;

    /* JADX INFO: renamed from: c */
    public transient Object[] f12074c;

    /* JADX INFO: renamed from: d */
    public transient Object[] f12075d;

    /* JADX INFO: renamed from: e */
    public transient int f12076e = Math.min(Math.max(12, 1), 1073741823);

    /* JADX INFO: renamed from: f */
    public transient int f12077f;

    /* JADX INFO: renamed from: g */
    public transient C0977h f12078g;

    /* JADX INFO: renamed from: h */
    public transient C0977h f12079h;

    /* JADX INFO: renamed from: i */
    public transient C0979j f12080i;

    /* JADX INFO: renamed from: a */
    public final int[] m5482a() {
        int[] iArr = this.f12073b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    public final Object[] m5483b() {
        Object[] objArr = this.f12074c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: renamed from: c */
    public final Object[] m5484c() {
        Object[] objArr = this.f12075d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m5487f()) {
            return;
        }
        this.f12076e += 32;
        Map mapM5485d = m5485d();
        if (mapM5485d != null) {
            this.f12076e = Math.min(Math.max(size(), 3), 1073741823);
            mapM5485d.clear();
            this.f12072a = null;
            this.f12077f = 0;
            return;
        }
        Arrays.fill(m5483b(), 0, this.f12077f, (Object) null);
        Arrays.fill(m5484c(), 0, this.f12077f, (Object) null);
        Object obj = this.f12072a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(m5482a(), 0, this.f12077f, 0);
        this.f12077f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapM5485d = m5485d();
        if (mapM5485d != null) {
            return mapM5485d.containsKey(obj);
        }
        return m5489h(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapM5485d = m5485d();
        if (mapM5485d != null) {
            return mapM5485d.containsValue(obj);
        }
        for (int i = 0; i < this.f12077f; i++) {
            if (ts3.m22281b(obj, m5484c()[i])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final Map m5485d() {
        Object obj = this.f12072a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m5486e(int i, int i2) {
        Object obj = this.f12072a;
        Objects.requireNonNull(obj);
        int[] iArrM5482a = m5482a();
        Object[] objArrM5483b = m5483b();
        Object[] objArrM5484c = m5484c();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrM5483b[i] = null;
            objArrM5484c[i] = null;
            iArrM5482a[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj2 = objArrM5483b[i3];
        objArrM5483b[i] = obj2;
        objArrM5484c[i] = objArrM5484c[i3];
        objArrM5483b[i3] = null;
        objArrM5484c[i3] = null;
        iArrM5482a[i] = iArrM5482a[i3];
        iArrM5482a[i3] = 0;
        int iM23231b = vcd.m23231b(obj2) & i2;
        int iM22680d = ucd.m22680d(iM23231b, obj);
        if (iM22680d == size) {
            ucd.m22682f(iM23231b, obj, i4);
            return;
        }
        while (true) {
            int i5 = iM22680d - 1;
            int i6 = iArrM5482a[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                iArrM5482a[i5] = ((~i2) & i6) | (i4 & i2);
                return;
            }
            iM22680d = i7;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0977h c0977h = this.f12079h;
        if (c0977h != null) {
            return c0977h;
        }
        C0977h c0977h2 = new C0977h(this, 0);
        this.f12079h = c0977h2;
        return c0977h2;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m5487f() {
        return this.f12072a == null;
    }

    /* JADX INFO: renamed from: g */
    public final int m5488g() {
        return (1 << (this.f12076e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapM5485d = m5485d();
        if (mapM5485d != null) {
            return mapM5485d.get(obj);
        }
        int iM5489h = m5489h(obj);
        if (iM5489h == -1) {
            return null;
        }
        return m5484c()[iM5489h];
    }

    /* JADX INFO: renamed from: h */
    public final int m5489h(Object obj) {
        if (m5487f()) {
            return -1;
        }
        int iM23231b = vcd.m23231b(obj);
        int iM5488g = m5488g();
        Object obj2 = this.f12072a;
        Objects.requireNonNull(obj2);
        int iM22680d = ucd.m22680d(iM23231b & iM5488g, obj2);
        if (iM22680d != 0) {
            int i = ~iM5488g;
            int i2 = iM23231b & i;
            do {
                int i3 = iM22680d - 1;
                int i4 = m5482a()[i3];
                if ((i4 & i) == i2 && ts3.m22281b(obj, m5483b()[i3])) {
                    return i3;
                }
                iM22680d = i4 & iM5488g;
            } while (iM22680d != 0);
        }
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public final int m5490i(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objM22681e = ucd.m22681e(i2);
        if (i4 != 0) {
            ucd.m22682f(i3 & i5, objM22681e, i4 + 1);
        }
        Object obj = this.f12072a;
        Objects.requireNonNull(obj);
        int[] iArrM5482a = m5482a();
        for (int i6 = 0; i6 <= i; i6++) {
            int iM22680d = ucd.m22680d(i6, obj);
            while (iM22680d != 0) {
                int i7 = iM22680d - 1;
                int i8 = iArrM5482a[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iM22680d2 = ucd.m22680d(i10, objM22681e);
                ucd.m22682f(i10, objM22681e, iM22680d);
                iArrM5482a[i7] = ((~i5) & i9) | (iM22680d2 & i5);
                iM22680d = i8 & i;
            }
        }
        this.f12072a = objM22681e;
        this.f12076e = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.f12076e & (-32));
        return i5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    /* JADX INFO: renamed from: j */
    public final Object m5491j(Object obj) {
        if (!m5487f()) {
            int iM5488g = m5488g();
            Object obj2 = this.f12072a;
            Objects.requireNonNull(obj2);
            int iM22679c = ucd.m22679c(obj, null, iM5488g, obj2, m5482a(), m5483b(), null);
            if (iM22679c != -1) {
                Object obj3 = m5484c()[iM22679c];
                m5486e(iM22679c, iM5488g);
                this.f12077f--;
                this.f12076e += 32;
                return obj3;
            }
        }
        return f12071j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C0977h c0977h = this.f12078g;
        if (c0977h != null) {
            return c0977h;
        }
        C0977h c0977h2 = new C0977h(this, 1);
        this.f12078g = c0977h2;
        return c0977h2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        int i2 = 32;
        if (m5487f()) {
            if (!m5487f()) {
                C3386nv.m17633t("Arrays already allocated");
                return null;
            }
            int i3 = this.f12076e;
            int iMax = Math.max(i3 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f12072a = ucd.m22681e(iMax2);
            this.f12076e = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.f12076e & (-32));
            this.f12073b = new int[i3];
            this.f12074c = new Object[i3];
            this.f12075d = new Object[i3];
        }
        Map mapM5485d = m5485d();
        if (mapM5485d != null) {
            return mapM5485d.put(obj, obj2);
        }
        int[] iArrM5482a = m5482a();
        Object[] objArrM5483b = m5483b();
        Object[] objArrM5484c = m5484c();
        int i4 = this.f12077f;
        int i5 = i4 + 1;
        int iM23231b = vcd.m23231b(obj);
        int iM5488g = m5488g();
        int i6 = iM23231b & iM5488g;
        Object obj3 = this.f12072a;
        Objects.requireNonNull(obj3);
        int iM22680d = ucd.m22680d(i6, obj3);
        if (iM22680d == 0) {
            if (i5 > iM5488g) {
                iM5488g = m5490i(iM5488g, (iM5488g + 1) * (iM5488g < 32 ? 4 : 2), iM23231b, i4);
            } else {
                Object obj4 = this.f12072a;
                Objects.requireNonNull(obj4);
                ucd.m22682f(i6, obj4, i5);
            }
            i = 1;
        } else {
            int i7 = ~iM5488g;
            int i8 = iM23231b & i7;
            int i9 = 0;
            while (true) {
                int i10 = iM22680d - 1;
                int i11 = iArrM5482a[i10];
                i = 1;
                int i12 = i11 & i7;
                int i13 = i2;
                if (i12 == i8 && ts3.m22281b(obj, objArrM5483b[i10])) {
                    Object obj5 = objArrM5484c[i10];
                    objArrM5484c[i10] = obj2;
                    return obj5;
                }
                int i14 = i11 & iM5488g;
                int i15 = i9 + 1;
                if (i14 == 0) {
                    if (i15 < 9) {
                        if (i5 <= iM5488g) {
                            iArrM5482a[i10] = i12 | (i5 & iM5488g);
                            break;
                        }
                        iM5488g = m5490i(iM5488g, (iM5488g + 1) * (iM5488g < i13 ? 4 : 2), iM23231b, i4);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(m5488g() + 1, 1.0f);
                    int i16 = isEmpty() ? -1 : 0;
                    while (i16 >= 0) {
                        linkedHashMap.put(m5483b()[i16], m5484c()[i16]);
                        int i17 = i16 + 1;
                        i16 = i17 < this.f12077f ? i17 : -1;
                    }
                    this.f12072a = linkedHashMap;
                    this.f12073b = null;
                    this.f12074c = null;
                    this.f12075d = null;
                    this.f12076e += 32;
                    return linkedHashMap.put(obj, obj2);
                }
                iM22680d = i14;
                i9 = i15;
                i2 = i13;
            }
        }
        int length = m5482a().length;
        if (i5 > length) {
            int i18 = i;
            int iMin = Math.min(1073741823, (Math.max(i18, length >>> 1) + length) | i18);
            if (iMin != length) {
                this.f12073b = Arrays.copyOf(m5482a(), iMin);
                this.f12074c = Arrays.copyOf(m5483b(), iMin);
                this.f12075d = Arrays.copyOf(m5484c(), iMin);
            }
        }
        m5482a()[i4] = (~iM5488g) & iM23231b;
        m5483b()[i4] = obj;
        m5484c()[i4] = obj2;
        this.f12077f = i5;
        this.f12076e += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapM5485d = m5485d();
        if (mapM5485d != null) {
            return mapM5485d.remove(obj);
        }
        Object objM5491j = m5491j(obj);
        if (objM5491j == f12071j) {
            return null;
        }
        return objM5491j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapM5485d = m5485d();
        return mapM5485d != null ? mapM5485d.size() : this.f12077f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C0979j c0979j = this.f12080i;
        if (c0979j != null) {
            return c0979j;
        }
        C0979j c0979j2 = new C0979j(this);
        this.f12080i = c0979j2;
        return c0979j2;
    }
}
