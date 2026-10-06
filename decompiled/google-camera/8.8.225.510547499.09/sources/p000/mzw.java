package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mzw extends mwx {

    /* JADX INFO: renamed from: a */
    public static final mwx f41870a = new mzw(null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b */
    final transient Object[] f41871b;

    /* JADX INFO: renamed from: c */
    public final transient int f41872c;

    /* JADX INFO: renamed from: d */
    private final transient Object f41873d;

    private mzw(Object obj, Object[] objArr, int i) {
        this.f41873d = obj;
        this.f41871b = objArr;
        this.f41872c = i;
    }

    /* JADX INFO: renamed from: a */
    static mzw m17191a(int i, Object[] objArr) {
        return m17192h(i, objArr, null);
    }

    /* JADX INFO: renamed from: h */
    static mzw m17192h(int i, Object[] objArr, mwt mwtVar) {
        if (i == 0) {
            return (mzw) f41870a;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            Object obj2 = objArr[1];
            obj2.getClass();
            lku.m15653g(obj, obj2);
            return new mzw(null, objArr, 1);
        }
        lku.m15621P(i, objArr.length >> 1);
        Object objM17195u = m17195u(objArr, i, mxk.m17131B(i), 0);
        if (objM17195u instanceof Object[]) {
            Object[] objArr2 = (Object[]) objM17195u;
            C1058va c1058va = (C1058va) objArr2[2];
            if (mwtVar == null) {
                throw c1058va.m19465D();
            }
            mwtVar.f41742c = c1058va;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue + iIntValue);
            objM17195u = obj3;
            i = iIntValue;
        }
        return new mzw(objM17195u, objArr, i);
    }

    /* JADX INFO: renamed from: k */
    static Object m17193k(Object[] objArr, int i, int i2, int i3) {
        Object objM17195u = m17195u(objArr, i, i2, i3);
        if (objM17195u instanceof Object[]) {
            throw ((C1058va) ((Object[]) objM17195u)[2]).m19465D();
        }
        return objM17195u;
    }

    /* JADX INFO: renamed from: t */
    static Object m17194t(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            obj3.getClass();
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            obj4.getClass();
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iM16522ad = mkv.m16522ad(obj2.hashCode());
            while (true) {
                int i3 = iM16522ad & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                iM16522ad = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iM16522ad2 = mkv.m16522ad(obj2.hashCode());
            while (true) {
                int i5 = iM16522ad2 & length2;
                char c = (char) sArr[i5];
                if (c == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[c])) {
                    return objArr[c ^ 1];
                }
                iM16522ad2 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iM16522ad3 = mkv.m16522ad(obj2.hashCode());
            while (true) {
                int i6 = iM16522ad3 & length3;
                int i7 = iArr[i6];
                if (i7 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i7])) {
                    return objArr[i7 ^ 1];
                }
                iM16522ad3 = i6 + 1;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    private static Object m17195u(Object[] objArr, int i, int i2, int i3) {
        C1058va c1058va = null;
        if (i == 1) {
            Object obj = objArr[i3];
            obj.getClass();
            Object obj2 = objArr[i3 ^ 1];
            obj2.getClass();
            lku.m15653g(obj, obj2);
            return null;
        }
        int i4 = i2 - 1;
        int i5 = -1;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i6 = 0;
            for (int i7 = 0; i7 < i; i7++) {
                int i8 = i7 + i7 + i3;
                int i9 = i6 + i6 + i3;
                Object obj3 = objArr[i8];
                obj3.getClass();
                Object obj4 = objArr[i8 ^ 1];
                obj4.getClass();
                lku.m15653g(obj3, obj4);
                int iM16522ad = mkv.m16522ad(obj3.hashCode());
                while (true) {
                    int i10 = iM16522ad & i4;
                    int i11 = bArr[i10] & 255;
                    if (i11 == 255) {
                        bArr[i10] = (byte) i9;
                        if (i6 < i7) {
                            objArr[i9] = obj3;
                            objArr[i9 ^ 1] = obj4;
                        }
                        i6++;
                        break;
                    }
                    if (obj3.equals(objArr[i11])) {
                        int i12 = i11 ^ 1;
                        Object obj5 = objArr[i12];
                        obj5.getClass();
                        C1058va c1058va2 = new C1058va(obj3, obj4, obj5);
                        objArr[i12] = obj4;
                        c1058va = c1058va2;
                        break;
                    }
                    iM16522ad = i10 + 1;
                }
            }
            return i6 == i ? bArr : new Object[]{bArr, Integer.valueOf(i6), c1058va};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i13 = 0;
            for (int i14 = 0; i14 < i; i14++) {
                int i15 = i14 + i14 + i3;
                int i16 = i13 + i13 + i3;
                Object obj6 = objArr[i15];
                obj6.getClass();
                Object obj7 = objArr[i15 ^ 1];
                obj7.getClass();
                lku.m15653g(obj6, obj7);
                int iM16522ad2 = mkv.m16522ad(obj6.hashCode());
                while (true) {
                    int i17 = iM16522ad2 & i4;
                    char c = (char) sArr[i17];
                    if (c == 65535) {
                        sArr[i17] = (short) i16;
                        if (i13 < i14) {
                            objArr[i16] = obj6;
                            objArr[i16 ^ 1] = obj7;
                        }
                        i13++;
                        break;
                    }
                    if (obj6.equals(objArr[c])) {
                        int i18 = c ^ 1;
                        Object obj8 = objArr[i18];
                        obj8.getClass();
                        C1058va c1058va3 = new C1058va(obj6, obj7, obj8);
                        objArr[i18] = obj7;
                        c1058va = c1058va3;
                        break;
                    }
                    iM16522ad2 = i17 + 1;
                }
            }
            return i13 == i ? sArr : new Object[]{sArr, Integer.valueOf(i13), c1058va};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i19 = 0;
        int i20 = 0;
        while (i19 < i) {
            int i21 = i19 + i19 + i3;
            int i22 = i20 + i20 + i3;
            Object obj9 = objArr[i21];
            obj9.getClass();
            Object obj10 = objArr[i21 ^ 1];
            obj10.getClass();
            lku.m15653g(obj9, obj10);
            int iM16522ad3 = mkv.m16522ad(obj9.hashCode());
            while (true) {
                int i23 = iM16522ad3 & i4;
                int i24 = iArr[i23];
                if (i24 == i5) {
                    iArr[i23] = i22;
                    if (i20 < i19) {
                        objArr[i22] = obj9;
                        objArr[i22 ^ 1] = obj10;
                    }
                    i20++;
                    break;
                }
                if (obj9.equals(objArr[i24])) {
                    int i25 = i24 ^ 1;
                    Object obj11 = objArr[i25];
                    obj11.getClass();
                    C1058va c1058va4 = new C1058va(obj9, obj10, obj11);
                    objArr[i25] = obj10;
                    c1058va = c1058va4;
                    break;
                }
                iM16522ad3 = i23 + 1;
                i5 = -1;
            }
            i19++;
            i5 = -1;
        }
        return i20 == i ? iArr : new Object[]{iArr, Integer.valueOf(i20), c1058va};
    }

    @Override // p000.mwx
    /* JADX INFO: renamed from: ct */
    public final mxk mo17113ct() {
        return new mzt(this, this.f41871b, 0, this.f41872c);
    }

    @Override // p000.mwx
    /* JADX INFO: renamed from: cu */
    public final mxk mo17114cu() {
        return new mzu(this, new mzv(this.f41871b, 0, this.f41872c));
    }

    @Override // p000.mwx
    /* JADX INFO: renamed from: cw */
    public final boolean mo17080cw() {
        return false;
    }

    @Override // p000.mwx
    /* JADX INFO: renamed from: d */
    public final mwj mo17065d() {
        return new mzv(this.f41871b, 1, this.f41872c);
    }

    @Override // p000.mwx, java.util.Map
    public final Object get(Object obj) {
        Object objM17194t = m17194t(this.f41873d, this.f41871b, this.f41872c, 0, obj);
        if (objM17194t == null) {
            return null;
        }
        return objM17194t;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f41872c;
    }
}
