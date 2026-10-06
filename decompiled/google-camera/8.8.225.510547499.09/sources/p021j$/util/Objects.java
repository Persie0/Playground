package p021j$.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class Objects {
    /* JADX INFO: renamed from: a */
    public static Object m12504a(Comparable comparable, Object obj) {
        if (comparable != null) {
            return comparable;
        }
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("defaultObj");
    }

    public static boolean equals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int hash(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static int hashCode(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }
}
