package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;

/* JADX INFO: renamed from: rv */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3550rv extends AbstractC3184kh {
    /* JADX WARN: Code duplicated, block: B:10:0x0010 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0012 A[RETURN] */
    /* JADX INFO: renamed from: O */
    public static boolean m20821O(char[] cArr, char c) {
        int length = cArr.length;
        int i = 0;
        while (i < length) {
            if (c == cArr[i]) {
                if (i >= 0) {
                    return true;
                }
                return false;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: P */
    public static boolean m20822P(int[] iArr, int i) {
        iArr.getClass();
        return m20843k0(iArr, i) >= 0;
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m20823Q(Object[] objArr, Object obj) {
        objArr.getClass();
        return m20844l0(objArr, obj) >= 0;
    }

    /* JADX INFO: renamed from: R */
    public static boolean m20824R(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr != null && objArr2 != null && objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                Object obj2 = objArr2[i];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!m20824R((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if ((obj instanceof fea) && (obj2 instanceof fea)) {
                            if (!i9d.m13748c(((fea) obj).f38966a, ((fea) obj2).f38966a)) {
                            }
                        } else if ((obj instanceof wea) && (obj2 instanceof wea)) {
                            if (!i9d.m13746a(((wea) obj).f66738a, ((wea) obj2).f66738a)) {
                            }
                        } else if ((obj instanceof kea) && (obj2 instanceof kea)) {
                            if (!i9d.m13747b(((kea) obj).f47113a, ((kea) obj2).f47113a)) {
                            }
                        } else if ((obj instanceof pea) && (obj2 instanceof pea)) {
                            if (!i9d.m13749d(((pea) obj).f56017a, ((pea) obj2).f56017a)) {
                            }
                        } else if (!obj.equals(obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: S */
    public static void m20825S(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: T */
    public static void m20826T(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: U */
    public static void m20827U(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: V */
    public static void m20828V(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m20829W(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        m20825S(i, 0, i2, iArr, iArr2);
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m20830X(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        m20826T(0, i, i2, objArr, objArr2);
    }

    /* JADX INFO: renamed from: Y */
    public static byte[] m20831Y(byte[] bArr, int i, int i2) {
        bArr.getClass();
        AbstractC3184kh.m15215i(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        bArrCopyOfRange.getClass();
        return bArrCopyOfRange;
    }

    /* JADX INFO: renamed from: Z */
    public static Object[] m20832Z(Object[] objArr, int i, int i2) {
        objArr.getClass();
        AbstractC3184kh.m15215i(i2, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }

    /* JADX INFO: renamed from: a0 */
    public static void m20833a0(int i, int i2, Object obj, Object[] objArr) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }

    /* JADX INFO: renamed from: b0 */
    public static void m20834b0(int i, int i2, int i3, int[] iArr) {
        if ((i3 & 4) != 0) {
            i2 = iArr.length;
        }
        Arrays.fill(iArr, 0, i2, i);
    }

    /* JADX INFO: renamed from: c0 */
    public static void m20835c0(long[] jArr, long j) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j);
    }

    /* JADX INFO: renamed from: e0 */
    public static ArrayList m20837e0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f0 */
    public static Object m20838f0(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[0];
        }
        uk9.m22775i("Array is empty.");
        return null;
    }

    /* JADX INFO: renamed from: g0 */
    public static Float m20839g0(float[] fArr) {
        fArr.getClass();
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }

    /* JADX INFO: renamed from: h0 */
    public static i84 m20840h0(int[] iArr) {
        return new i84(0, iArr.length - 1, 1);
    }

    /* JADX INFO: renamed from: i0 */
    public static int m20841i0(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    /* JADX INFO: renamed from: j0 */
    public static Object m20842j0(Object[] objArr, int i) {
        objArr.getClass();
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    /* JADX INFO: renamed from: k0 */
    public static int m20843k0(int[] iArr, int i) {
        iArr.getClass();
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: l0 */
    public static int m20844l0(Object[] objArr, Object obj) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: m0 */
    public static Float m20845m0(float[] fArr) {
        fArr.getClass();
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    /* JADX INFO: renamed from: n0 */
    public static int m20846n0(int[] iArr) {
        if (iArr.length == 0) {
            uk9.m22784s();
            return 0;
        }
        int i = iArr[0];
        int i2 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i3 = iArr[i2];
                if (i < i3) {
                    i = i3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: o0 */
    public static char m20847o0(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            uk9.m22775i("Array is empty.");
            return (char) 0;
        }
        if (length == 1) {
            return cArr[0];
        }
        C3386nv.m17626m("Array has more than one element.");
        return (char) 0;
    }

    /* JADX INFO: renamed from: p0 */
    public static final void m20848p0(Object[] objArr, HashSet hashSet) {
        objArr.getClass();
        for (Object obj : objArr) {
            hashSet.add(obj);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static List m20849q0(float[] fArr) {
        fArr.getClass();
        int length = fArr.length;
        if (length == 0) {
            return EmptyList.f47638a;
        }
        if (length == 1) {
            return vz1.m23604J(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r0 */
    public static List m20850r0(int[] iArr) {
        iArr.getClass();
        int length = iArr.length;
        if (length == 0) {
            return EmptyList.f47638a;
        }
        if (length == 1) {
            return vz1.m23604J(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s0 */
    public static List m20851s0(long[] jArr) {
        jArr.getClass();
        int length = jArr.length;
        if (length == 0) {
            return EmptyList.f47638a;
        }
        if (length == 1) {
            return vz1.m23604J(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: t0 */
    public static List m20852t0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return EmptyList.f47638a;
        }
        if (length == 1) {
            return vz1.m23604J(objArr[0]);
        }
        List listAsList = Arrays.asList(Arrays.copyOf(objArr, objArr.length));
        listAsList.getClass();
        return listAsList;
    }

    /* JADX INFO: renamed from: u0 */
    public static List m20853u0(boolean[] zArr) {
        zArr.getClass();
        int length = zArr.length;
        if (length == 0) {
            return EmptyList.f47638a;
        }
        if (length == 1) {
            return vz1.m23604J(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: v0 */
    public static Set m20854v0(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return EmptySet.f47640a;
        }
        if (length == 1) {
            return AbstractC3489q9.m19766C(Integer.valueOf(iArr[0]));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC3194a.m15363P(iArr.length));
        for (int i : iArr) {
            linkedHashSet.add(Integer.valueOf(i));
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: w0 */
    public static Set m20855w0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return EmptySet.f47640a;
        }
        if (length == 1) {
            return AbstractC3489q9.m19766C(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC3194a.m15363P(objArr.length));
        m20848p0(objArr, linkedHashSet);
        return linkedHashSet;
    }
}
