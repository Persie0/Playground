package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class fm9 {

    /* JADX INFO: renamed from: a */
    public static final int[] f39299a;

    /* JADX INFO: renamed from: b */
    public static final long f39300b;

    /* JADX INFO: renamed from: c */
    public static final long f39301c;

    /* JADX INFO: renamed from: d */
    public static final long f39302d;

    /* JADX INFO: renamed from: e */
    public static final long f39303e;

    /* JADX INFO: renamed from: f */
    public static final long f39304f;

    /* JADX INFO: renamed from: g */
    public static final long f39305g;

    /* JADX INFO: renamed from: h */
    public static final int f39306h;

    /* JADX INFO: renamed from: i */
    public static final int f39307i;

    /* JADX INFO: renamed from: j */
    public static final int f39308j;

    /* JADX INFO: renamed from: k */
    public static final int f39309k;

    /* JADX INFO: renamed from: l */
    public static final int f39310l;

    /* JADX INFO: renamed from: m */
    public static final int f39311m;

    /* JADX INFO: renamed from: n */
    public static final em9 f39312n;

    static {
        int[] iArr = new int[61];
        f39299a = iArr;
        iArr[2] = iArr[2] | 1;
        iArr[3] = iArr[3] | 1;
        iArr[0] = iArr[0] | 1;
        iArr[1] = iArr[1] | 1;
        iArr[6] = iArr[6] | 8;
        iArr[7] = iArr[7] | 8;
        iArr[4] = iArr[4] | 8;
        iArr[5] = iArr[5] | 8;
        iArr[8] = 3 | iArr[8];
        iArr[35] = iArr[35] | 2;
        iArr[50] = iArr[50] | 2;
        iArr[9] = iArr[9] | 8;
        iArr[10] = iArr[10] | 8;
        iArr[11] = iArr[11] | 8;
        iArr[12] = iArr[12] | 8;
        iArr[13] = iArr[13] | 8;
        iArr[14] = iArr[14] | 8;
        iArr[15] = iArr[15] | 8;
        iArr[16] = iArr[16] | 8;
        iArr[17] = iArr[17] | 8;
        iArr[18] = iArr[18] | 8;
        iArr[19] = iArr[19] | 8;
        iArr[20] = iArr[20] | 8;
        iArr[21] = iArr[21] | 4;
        iArr[22] = iArr[22] | 4;
        iArr[23] = iArr[23] | 4;
        iArr[24] = iArr[24] | 4;
        iArr[25] = iArr[25] | 4;
        iArr[29] = iArr[29] | 4;
        iArr[30] = iArr[30] | 4;
        iArr[26] = iArr[26] | 4;
        iArr[27] = iArr[27] | 4;
        iArr[28] = iArr[28] | 4;
        iArr[32] = iArr[32] | 4;
        iArr[34] = iArr[34] | 2;
        iArr[51] = iArr[51] | 2;
        iArr[36] = iArr[36] | 2;
        iArr[52] = iArr[52] | 2;
        iArr[31] = iArr[31] | 4;
        iArr[53] = iArr[53] | 2;
        iArr[54] = iArr[54] | 4;
        iArr[55] = iArr[55] | 2;
        iArr[56] = iArr[56] | 2;
        iArr[37] = iArr[37] | 32;
        iArr[57] = iArr[57] | 32;
        iArr[58] = iArr[58] | 48;
        iArr[59] = iArr[59] | 48;
        iArr[60] = iArr[60] | 48;
        iArr[46] = iArr[46] | 48;
        iArr[47] = iArr[47] | 48;
        iArr[48] = iArr[48] | 48;
        iArr[43] = iArr[43] | 48;
        iArr[49] = iArr[49] | 48;
        iArr[39] = iArr[39] | 48;
        iArr[40] = iArr[40] | 48;
        iArr[41] = iArr[41] | 48;
        iArr[42] = iArr[42] | 48;
        iArr[44] = iArr[44] | 48;
        iArr[45] = iArr[45] | 48;
        iArr[38] = iArr[38] | 48;
        f39300b = m11941e(1);
        f39301c = m11941e(8);
        f39302d = m11941e(2);
        f39303e = m11941e(4);
        f39304f = m11941e(32);
        f39305g = m11941e(16);
        f39306h = m11939c(1);
        f39307i = m11939c(8);
        f39308j = m11939c(2);
        f39309k = m11939c(4);
        f39310l = m11939c(32);
        f39311m = m11939c(16);
        f39312n = new em9();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX INFO: renamed from: a */
    public static final vi0 m11937a(vi0 vi0Var, long j, vi0 vi0Var2, long j2, float f) {
        Object objMo11319a;
        if (vi0Var == null && vi0Var2 == null) {
            return null;
        }
        if (vi0Var == null) {
            vi0Var = new pd9(j);
        } else if (vi0Var2 == null) {
            vi0Var2 = new pd9(j2);
        }
        if (!vi0Var.equals(vi0Var2)) {
            objMo11319a = vi0Var instanceof w94 ? ((w94) vi0Var).mo11319a(vi0Var2, f) : null;
            if (objMo11319a == null && (vi0Var2 instanceof w94)) {
                objMo11319a = ((w94) vi0Var2).mo11319a(vi0Var, 1.0f - f);
            }
            if (objMo11319a == null) {
                if (f < 0.5f) {
                    objMo11319a = vi0Var;
                } else {
                    objMo11319a = vi0Var2;
                }
            }
        } else if (f < 0.5f) {
            objMo11319a = vi0Var;
        } else {
            objMo11319a = vi0Var2;
        }
        vi0 vi0Var3 = objMo11319a instanceof vi0 ? (vi0) objMo11319a : null;
        if (vi0Var3 == null) {
            return ((double) f) < 0.5d ? vi0Var : vi0Var2;
        }
        return vi0Var3;
    }

    /* JADX INFO: renamed from: b */
    public static final Object m11938b(float f, Object obj, Object obj2) {
        Object[] objArr;
        Object[] objArr2;
        if (obj == null && obj2 == null) {
            return null;
        }
        boolean z = obj instanceof Object[];
        boolean z2 = obj2 instanceof Object[];
        if (!z && !z2) {
            return null;
        }
        if (z) {
            objArr = (k39[]) obj;
        } else {
            obj.getClass();
            objArr = new k39[]{obj};
        }
        if (z2) {
            objArr2 = (k39[]) obj2;
        } else {
            obj2.getClass();
            objArr2 = new k39[]{obj2};
        }
        int iMax = Math.max(objArr.length, objArr2.length);
        k39[] k39VarArr = new k39[iMax];
        for (int i = 0; i < iMax; i++) {
            k39VarArr[i] = null;
        }
        for (int i2 = 0; i2 < iMax; i2++) {
            k39VarArr[i2] = null;
        }
        return k39VarArr;
    }

    /* JADX INFO: renamed from: c */
    public static final int m11939c(int i) {
        int i2 = 0;
        for (int i3 = 50; i3 < 61; i3++) {
            if ((f39299a[i3] & i) != 0) {
                i2 |= 1 << (i3 - 50);
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: d */
    public static final int m11940d(int i) {
        return ((f39306h & i) != 0 ? 1 : 0) | ((f39307i & i) != 0 ? 8 : 0) | ((f39308j & i) != 0 ? 2 : 0) | ((f39309k & i) != 0 ? 4 : 0) | ((f39310l & i) != 0 ? 32 : 0) | ((i & f39311m) != 0 ? 16 : 0);
    }

    /* JADX INFO: renamed from: e */
    public static final long m11941e(int i) {
        long j = 0;
        for (int i2 = 0; i2 < 50; i2++) {
            if ((f39299a[i2] & i) != 0) {
                j |= 1 << ((byte) i2);
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: f */
    public static final int m11942f(long j) {
        return ((f39300b & j) != 0 ? 1 : 0) | ((f39301c & j) != 0 ? 8 : 0) | ((f39302d & j) != 0 ? 2 : 0) | ((f39303e & j) != 0 ? 4 : 0) | ((f39304f & j) != 0 ? 32 : 0) | ((j & f39305g) != 0 ? 16 : 0);
    }
}
