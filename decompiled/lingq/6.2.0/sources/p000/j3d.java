package p000;

import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j3d {
    /* JADX INFO: renamed from: a */
    public static void m14283a(zn9 zn9Var, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            if (obj == null) {
                zn9Var.mo3714m(i);
            } else if (obj instanceof byte[]) {
                zn9Var.mo3713k(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                zn9Var.mo3711g(i, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                zn9Var.mo3711g(i, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                zn9Var.mo3712j(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                zn9Var.mo3712j(i, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                zn9Var.mo3712j(i, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                zn9Var.mo3712j(i, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                zn9Var.mo3716t(i, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                zn9Var.mo3712j(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m14284b(Object[] objArr, Feature feature) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (x74.m24360q(objArr[i], feature)) {
                if (i >= 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
