package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import p000.bga;
import p000.bna;
import p000.f14;
import p000.omd;

/* JADX INFO: loaded from: classes.dex */
final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {

    /* JADX INFO: renamed from: g */
    public static final ImmutableMap f13419g = new RegularImmutableMap(0, null, new Object[0]);

    /* JADX INFO: renamed from: d */
    public final transient Object f13420d;

    /* JADX INFO: renamed from: e */
    public final transient Object[] f13421e;

    /* JADX INFO: renamed from: f */
    public final transient int f13422f;

    /* JADX INFO: loaded from: classes2.dex */
    public static class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: d */
        public final transient ImmutableMap f13423d;

        /* JADX INFO: renamed from: e */
        public final transient Object[] f13424e;

        /* JADX INFO: renamed from: f */
        public final transient int f13425f;

        public EntrySet(ImmutableMap immutableMap, Object[] objArr, int i) {
            this.f13423d = immutableMap;
            this.f13424e = objArr;
            this.f13425f = i;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.f13423d.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: f */
        public final int mo6274f(Object[] objArr, int i) {
            return mo6273d().mo6274f(objArr, i);
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: j */
        public final boolean mo6278j() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: k */
        public final bga iterator() {
            return mo6273d().listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableSet
        /* JADX INFO: renamed from: r */
        public final ImmutableList mo6313r() {
            return new ImmutableList<Map.Entry<Object, Object>>() { // from class: com.google.common.collect.RegularImmutableMap.EntrySet.1
                @Override // java.util.List
                public final Object get(int i) {
                    EntrySet entrySet = EntrySet.this;
                    bna.m3973s(i, entrySet.f13425f);
                    Object[] objArr = entrySet.f13424e;
                    int i2 = i * 2;
                    Object obj = objArr[i2];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArr[i2 + 1];
                    Objects.requireNonNull(obj2);
                    return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }

                @Override // com.google.common.collect.ImmutableCollection
                /* JADX INFO: renamed from: j */
                public final boolean mo6278j() {
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
                    return EntrySet.this.f13425f;
                }

                @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                public Object writeReplace() {
                    return super.writeReplace();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f13425f;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static final class KeySet<K> extends ImmutableSet<K> {

        /* JADX INFO: renamed from: d */
        public final transient ImmutableMap f13427d;

        /* JADX INFO: renamed from: e */
        public final transient ImmutableList f13428e;

        public KeySet(ImmutableMap immutableMap, ImmutableList immutableList) {
            this.f13427d = immutableMap;
            this.f13428e = immutableList;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return this.f13427d.get(obj) != null;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: d */
        public final ImmutableList mo6273d() {
            return this.f13428e;
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: f */
        public final int mo6274f(Object[] objArr, int i) {
            return this.f13428e.mo6274f(objArr, i);
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: j */
        public final boolean mo6278j() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: k */
        public final bga iterator() {
            return this.f13428e.listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f13427d.size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static final class KeysOrValuesAsList extends ImmutableList<Object> {

        /* JADX INFO: renamed from: c */
        public final transient Object[] f13429c;

        /* JADX INFO: renamed from: d */
        public final transient int f13430d;

        /* JADX INFO: renamed from: e */
        public final transient int f13431e;

        public KeysOrValuesAsList(Object[] objArr, int i, int i2) {
            this.f13429c = objArr;
            this.f13430d = i;
            this.f13431e = i2;
        }

        @Override // java.util.List
        public final Object get(int i) {
            bna.m3973s(i, this.f13431e);
            Object obj = this.f13429c[(i * 2) + this.f13430d];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: j */
        public final boolean mo6278j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f13431e;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public RegularImmutableMap(int i, Object obj, Object[] objArr) {
        this.f13420d = obj;
        this.f13421e = objArr;
        this.f13422f = i;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x019b  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /* JADX INFO: renamed from: l */
    public static RegularImmutableMap m6320l(int i, Object[] objArr, C1097m c1097m) {
        boolean z;
        int i2;
        char c;
        ?? r3;
        char c2;
        short[] sArr;
        boolean z2;
        int i3;
        ?? r16;
        boolean z3;
        ?? r4;
        Object[] objArr2;
        f14 f14Var;
        boolean z4;
        int i4 = i;
        Object[] objArrCopyOf = objArr;
        if (i4 == 0) {
            return (RegularImmutableMap) f13419g;
        }
        f14 f14Var2 = null;
        ?? r5 = 0;
        f14 f14Var3 = null;
        f14 f14Var4 = null;
        boolean z5 = false;
        int i5 = 1;
        if (i4 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            return new RegularImmutableMap(1, null, objArrCopyOf);
        }
        bna.m3981w(i4, objArrCopyOf.length >> 1);
        int iM6306l = ImmutableSet.m6306l(i4);
        char c3 = 2;
        if (i4 != 1) {
            int i6 = iM6306l - 1;
            if (iM6306l <= 128) {
                byte[] bArr = new byte[iM6306l];
                Arrays.fill(bArr, (byte) -1);
                int i7 = 0;
                int i8 = 0;
                while (i7 < i4) {
                    int i9 = i7 * 2;
                    int i10 = i8 * 2;
                    Object obj = objArrCopyOf[i9];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArrCopyOf[i9 ^ i5];
                    Objects.requireNonNull(obj2);
                    int iM18146e0 = omd.m18146e0(obj.hashCode());
                    while (true) {
                        int i11 = iM18146e0 & i6;
                        z2 = z5;
                        i3 = i5;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            bArr[i11] = (byte) i10;
                            if (i8 < i7) {
                                objArrCopyOf[i10] = obj;
                                objArrCopyOf[i10 ^ 1] = obj2;
                            }
                            i8++;
                            break;
                        }
                        if (obj.equals(objArrCopyOf[i12 == true ? 1 : 0])) {
                            int i13 = ~i12;
                            Object obj3 = objArrCopyOf[i13 == true ? 1 : 0];
                            Objects.requireNonNull(obj3);
                            f14Var3 = new f14(obj, obj2, obj3);
                            objArrCopyOf[i13 == true ? 1 : 0] = obj2;
                            break;
                        }
                        iM18146e0 = i11 + 1;
                        z5 = z2;
                        i5 = i3;
                    }
                    i7++;
                    z5 = z2;
                    i5 = i3;
                }
                z = z5;
                i2 = i5;
                if (i8 == i4) {
                    r5 = bArr;
                    z4 = z;
                } else {
                    sArr = new Object[3];
                    sArr[z ? 1 : 0] = bArr;
                    sArr[i2] = Integer.valueOf(i8);
                    sArr[2] = f14Var3;
                    r5 = sArr;
                    z4 = z;
                }
            } else {
                z = false;
                i2 = 1;
                if (iM6306l <= 32768) {
                    sArr = new short[iM6306l];
                    Arrays.fill(sArr, (short) -1);
                    int i14 = 0;
                    for (int i15 = 0; i15 < i4; i15++) {
                        int i16 = i15 * 2;
                        int i17 = i14 * 2;
                        Object obj4 = objArrCopyOf[i16];
                        Objects.requireNonNull(obj4);
                        Object obj5 = objArrCopyOf[i16 ^ 1];
                        Objects.requireNonNull(obj5);
                        int iM18146e1 = omd.m18146e0(obj4.hashCode());
                        while (true) {
                            int i18 = iM18146e1 & i6;
                            int i19 = sArr[i18] & 65535;
                            if (i19 == 65535) {
                                sArr[i18] = (short) i17;
                                if (i14 < i15) {
                                    objArrCopyOf[i17] = obj4;
                                    objArrCopyOf[i17 ^ 1] = obj5;
                                }
                                i14++;
                                break;
                            }
                            if (obj4.equals(objArrCopyOf[i19 == true ? 1 : 0])) {
                                int i20 = ~i19;
                                Object obj6 = objArrCopyOf[i20 == true ? 1 : 0];
                                Objects.requireNonNull(obj6);
                                f14Var4 = new f14(obj4, obj5, obj6);
                                objArrCopyOf[i20 == true ? 1 : 0] = obj5;
                                break;
                            }
                            iM18146e1 = i18 + 1;
                        }
                    }
                    if (i14 == i4) {
                        r5 = sArr;
                        z4 = z;
                    } else {
                        r5 = new Object[]{sArr, Integer.valueOf(i14), f14Var4};
                        z4 = z;
                    }
                } else {
                    int[] iArr = new int[iM6306l];
                    Arrays.fill(iArr, -1);
                    int i21 = 0;
                    int i22 = 0;
                    while (i21 < i4) {
                        int i23 = i21 * 2;
                        int i24 = i22 * 2;
                        Object obj7 = objArrCopyOf[i23];
                        Objects.requireNonNull(obj7);
                        Object obj8 = objArrCopyOf[i23 ^ 1];
                        Objects.requireNonNull(obj8);
                        int iM18146e2 = omd.m18146e0(obj7.hashCode());
                        while (true) {
                            int i25 = iM18146e2 & i6;
                            int i26 = iArr[i25];
                            if (i26 == -1) {
                                iArr[i25] = i24;
                                if (i22 < i21) {
                                    objArrCopyOf[i24] = obj7;
                                    objArrCopyOf[i24 ^ 1] = obj8;
                                }
                                i22++;
                                c2 = c3;
                                break;
                            }
                            c2 = c3;
                            if (obj7.equals(objArrCopyOf[i26])) {
                                int i27 = i26 ^ 1;
                                Object obj9 = objArrCopyOf[i27];
                                Objects.requireNonNull(obj9);
                                f14Var2 = new f14(obj7, obj8, obj9);
                                objArrCopyOf[i27] = obj8;
                                break;
                            }
                            iM18146e2 = i25 + 1;
                            c3 = c2;
                        }
                        i21++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i22 == i4) {
                        r3 = iArr;
                        r16 = z;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i22);
                        objArr3[c] = f14Var2;
                        r3 = objArr3;
                        r16 = z;
                    }
                }
            }
            z3 = r3 instanceof Object[];
            r4 = r3;
            if (z3) {
                objArr2 = (Object[]) r3;
                f14Var = (f14) objArr2[c];
                if (c1097m != null) {
                    throw f14Var.m11495a();
                }
                c1097m.f13475c = f14Var;
                Object obj10 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i2]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue * 2);
                r4 = obj10;
                i4 = iIntValue;
            }
            return new RegularImmutableMap(i4, r4, objArrCopyOf);
        }
        Objects.requireNonNull(objArrCopyOf[0]);
        Objects.requireNonNull(objArrCopyOf[1]);
        z4 = false;
        i2 = 1;
        c = 2;
        r3 = r5;
        r16 = z4;
        z3 = r3 instanceof Object[];
        r4 = r3;
        if (z3) {
            objArr2 = (Object[]) r3;
            f14Var = (f14) objArr2[c];
            if (c1097m != null) {
                throw f14Var.m11495a();
            }
            c1097m.f13475c = f14Var;
            Object obj11 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i2]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 * 2);
            r4 = obj11;
            i4 = iIntValue2;
        }
        return new RegularImmutableMap(i4, r4, objArrCopyOf);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.f13421e;
            if (this.f13422f == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f13420d;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iM18146e0 = omd.m18146e0(obj.hashCode());
                    while (true) {
                        int i = iM18146e0 & length;
                        int i2 = bArr[i] & 255;
                        if (i2 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i2])) {
                            obj2 = objArr[i2 ^ 1];
                        } else {
                            iM18146e0 = i + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iM18146e1 = omd.m18146e0(obj.hashCode());
                    while (true) {
                        int i3 = iM18146e1 & length2;
                        int i4 = sArr[i3] & 65535;
                        if (i4 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i4])) {
                            obj2 = objArr[i4 ^ 1];
                        } else {
                            iM18146e1 = i3 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iM18146e2 = omd.m18146e0(obj.hashCode());
                    while (true) {
                        int i5 = iM18146e2 & length3;
                        int i6 = iArr[i5];
                        if (i6 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i6])) {
                            obj2 = objArr[i6 ^ 1];
                        } else {
                            iM18146e2 = i5 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f13422f;
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return super.writeReplace();
    }
}
