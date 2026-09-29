package p000;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ff0 extends de6 {

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ int f38987r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ff0(int i, boolean z) {
        super(z);
        this.f38987r = i;
    }

    /* JADX INFO: renamed from: g */
    public static int[] m11801g(String str) {
        str.getClass();
        return new int[]{((Number) de6.f35501b.mo303d(str)).intValue()};
    }

    /* JADX INFO: renamed from: h */
    public static long[] m11802h(String str) {
        str.getClass();
        return new long[]{((Number) de6.f35505f.mo303d(str)).longValue()};
    }

    /* JADX INFO: renamed from: i */
    public static boolean[] m11803i(String str) {
        str.getClass();
        return new boolean[]{((Boolean) de6.f35511l.mo303d(str)).booleanValue()};
    }

    @Override // p000.de6
    /* JADX INFO: renamed from: a */
    public final Object mo301a(String str, Bundle bundle) {
        switch (this.f38987r) {
            case 0:
                bundle.getClass();
                if (!bundle.containsKey(str) || te1.m22011y(str, bundle)) {
                    return null;
                }
                boolean[] booleanArray = bundle.getBooleanArray(str);
                if (booleanArray != null) {
                    return booleanArray;
                }
                syc.m21782a(str);
                throw null;
            case 1:
                bundle.getClass();
                if (!bundle.containsKey(str) || te1.m22011y(str, bundle)) {
                    return null;
                }
                boolean[] booleanArray2 = bundle.getBooleanArray(str);
                if (booleanArray2 != null) {
                    return AbstractC3550rv.m20853u0(booleanArray2);
                }
                syc.m21782a(str);
                throw null;
            case 2:
                bundle.getClass();
                if (!bundle.containsKey(str) || te1.m22011y(str, bundle)) {
                    return null;
                }
                float[] floatArray = bundle.getFloatArray(str);
                if (floatArray != null) {
                    return floatArray;
                }
                syc.m21782a(str);
                throw null;
            case 3:
                bundle.getClass();
                if (!bundle.containsKey(str) || te1.m22011y(str, bundle)) {
                    return null;
                }
                float[] floatArray2 = bundle.getFloatArray(str);
                if (floatArray2 != null) {
                    return AbstractC3550rv.m20849q0(floatArray2);
                }
                syc.m21782a(str);
                throw null;
            case 4:
                bundle.getClass();
                if (!bundle.containsKey(str) || te1.m22011y(str, bundle)) {
                    return null;
                }
                int[] intArray = bundle.getIntArray(str);
                if (intArray != null) {
                    return intArray;
                }
                syc.m21782a(str);
                throw null;
            case 5:
                bundle.getClass();
                if (!bundle.containsKey(str) || te1.m22011y(str, bundle)) {
                    return null;
                }
                int[] intArray2 = bundle.getIntArray(str);
                if (intArray2 != null) {
                    return AbstractC3550rv.m20850r0(intArray2);
                }
                syc.m21782a(str);
                throw null;
            case 6:
                bundle.getClass();
                if (!bundle.containsKey(str) || te1.m22011y(str, bundle)) {
                    return null;
                }
                long[] longArray = bundle.getLongArray(str);
                if (longArray != null) {
                    return longArray;
                }
                syc.m21782a(str);
                throw null;
            case 7:
                bundle.getClass();
                if (!bundle.containsKey(str) || te1.m22011y(str, bundle)) {
                    return null;
                }
                long[] longArray2 = bundle.getLongArray(str);
                if (longArray2 != null) {
                    return AbstractC3550rv.m20851s0(longArray2);
                }
                syc.m21782a(str);
                throw null;
            case 8:
                bundle.getClass();
                if (!bundle.containsKey(str) || te1.m22011y(str, bundle)) {
                    return null;
                }
                String[] stringArray = bundle.getStringArray(str);
                if (stringArray != null) {
                    return stringArray;
                }
                syc.m21782a(str);
                throw null;
            default:
                bundle.getClass();
                if (!bundle.containsKey(str) || te1.m22011y(str, bundle)) {
                    return null;
                }
                String[] stringArray2 = bundle.getStringArray(str);
                if (stringArray2 != null) {
                    return AbstractC3550rv.m20852t0(stringArray2);
                }
                syc.m21782a(str);
                throw null;
        }
    }

    @Override // p000.de6
    /* JADX INFO: renamed from: b */
    public final String mo302b() {
        switch (this.f38987r) {
            case 0:
                return "boolean[]";
            case 1:
                return "List<Boolean>";
            case 2:
                return "float[]";
            case 3:
                return "List<Float>";
            case 4:
                return "integer[]";
            case 5:
                return "List<Int>";
            case 6:
                return "long[]";
            case 7:
                return "List<Long>";
            case 8:
                return "string[]";
            default:
                return "List<String>";
        }
    }

    @Override // p000.de6
    /* JADX INFO: renamed from: c */
    public final Object mo10313c(Object obj, String str) {
        switch (this.f38987r) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return m11803i(str);
                }
                boolean[] zArrM11803i = m11803i(str);
                int length = zArr.length;
                boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(zArrM11803i, 0, zArrCopyOf, length, 1);
                return zArrCopyOf;
            case 1:
                List list = (List) obj;
                gf0 gf0Var = de6.f35511l;
                return list != null ? u91.m22603U0(vz1.m23604J(gf0Var.mo303d(str)), list) : vz1.m23604J(gf0Var.mo303d(str));
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return new float[]{Float.parseFloat(str)};
                }
                float[] fArr2 = {Float.parseFloat(str)};
                int length2 = fArr.length;
                float[] fArrCopyOf = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(fArr2, 0, fArrCopyOf, length2, 1);
                return fArrCopyOf;
            case 3:
                List list2 = (List) obj;
                return list2 != null ? u91.m22603U0(vz1.m23604J(Float.valueOf(Float.parseFloat(str))), list2) : vz1.m23604J(Float.valueOf(Float.parseFloat(str)));
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return m11801g(str);
                }
                int[] iArrM11801g = m11801g(str);
                int length3 = iArr.length;
                int[] iArrCopyOf = Arrays.copyOf(iArr, length3 + 1);
                System.arraycopy(iArrM11801g, 0, iArrCopyOf, length3, 1);
                return iArrCopyOf;
            case 5:
                List list3 = (List) obj;
                gf0 gf0Var2 = de6.f35501b;
                return list3 != null ? u91.m22603U0(vz1.m23604J(gf0Var2.mo303d(str)), list3) : vz1.m23604J(gf0Var2.mo303d(str));
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return m11802h(str);
                }
                long[] jArrM11802h = m11802h(str);
                int length4 = jArr.length;
                long[] jArrCopyOf = Arrays.copyOf(jArr, length4 + 1);
                System.arraycopy(jArrM11802h, 0, jArrCopyOf, length4, 1);
                return jArrCopyOf;
            case 7:
                List list4 = (List) obj;
                gf0 gf0Var3 = de6.f35505f;
                return list4 != null ? u91.m22603U0(vz1.m23604J(gf0Var3.mo303d(str)), list4) : vz1.m23604J(gf0Var3.mo303d(str));
            case 8:
                String[] strArr = (String[]) obj;
                if (strArr == null) {
                    return new String[]{str};
                }
                String[] strArr2 = {str};
                int length5 = strArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(strArr, length5 + 1);
                System.arraycopy(strArr2, 0, objArrCopyOf, length5, 1);
                return (String[]) objArrCopyOf;
            default:
                List list5 = (List) obj;
                return list5 != null ? u91.m22603U0(vz1.m23604J(str), list5) : vz1.m23604J(str);
        }
    }

    @Override // p000.de6
    /* JADX INFO: renamed from: d */
    public final Object mo303d(String str) {
        switch (this.f38987r) {
            case 0:
                return m11803i(str);
            case 1:
                str.getClass();
                return vz1.m23604J(de6.f35511l.mo303d(str));
            case 2:
                str.getClass();
                return new float[]{Float.parseFloat(str)};
            case 3:
                str.getClass();
                return vz1.m23604J(Float.valueOf(Float.parseFloat(str)));
            case 4:
                return m11801g(str);
            case 5:
                str.getClass();
                return vz1.m23604J(de6.f35501b.mo303d(str));
            case 6:
                return m11802h(str);
            case 7:
                str.getClass();
                return vz1.m23604J(de6.f35505f.mo303d(str));
            case 8:
                str.getClass();
                return new String[]{str};
            default:
                str.getClass();
                return vz1.m23604J(str);
        }
    }

    @Override // p000.de6
    /* JADX INFO: renamed from: e */
    public final void mo304e(Bundle bundle, String str, Object obj) {
        switch (this.f38987r) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                str.getClass();
                if (zArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putBooleanArray(str, zArr);
                }
                break;
            case 1:
                List list = (List) obj;
                str.getClass();
                if (list == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putBooleanArray(str, u91.m22617i1(list));
                }
                break;
            case 2:
                float[] fArr = (float[]) obj;
                str.getClass();
                if (fArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putFloatArray(str, fArr);
                }
                break;
            case 3:
                List list2 = (List) obj;
                str.getClass();
                if (list2 == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putFloatArray(str, u91.m22619k1(list2));
                }
                break;
            case 4:
                int[] iArr = (int[]) obj;
                str.getClass();
                if (iArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putIntArray(str, iArr);
                }
                break;
            case 5:
                List list3 = (List) obj;
                str.getClass();
                if (list3 != null) {
                    bundle.putIntArray(str, u91.m22621m1(list3));
                }
                break;
            case 6:
                long[] jArr = (long[]) obj;
                str.getClass();
                if (jArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putLongArray(str, jArr);
                }
                break;
            case 7:
                List list4 = (List) obj;
                str.getClass();
                if (list4 == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putLongArray(str, u91.m22623o1(list4));
                }
                break;
            case 8:
                String[] strArr = (String[]) obj;
                str.getClass();
                if (strArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putStringArray(str, strArr);
                }
                break;
            default:
                List list5 = (List) obj;
                str.getClass();
                if (list5 == null) {
                    bundle.putString(str, null);
                } else {
                    String[] strArr2 = (String[]) list5.toArray(new String[0]);
                    strArr2.getClass();
                    bundle.putStringArray(str, strArr2);
                }
                break;
        }
    }
}
