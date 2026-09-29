package p000;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class sz1 {

    /* JADX INFO: renamed from: b */
    public static final sz1 f61645b;

    /* JADX INFO: renamed from: a */
    public final HashMap f61646a;

    static {
        sz1 sz1Var = new sz1(new LinkedHashMap());
        jad.m14369d(sz1Var);
        f61645b = sz1Var;
    }

    public sz1(sz1 sz1Var) {
        sz1Var.getClass();
        this.f61646a = new HashMap(sz1Var.f61646a);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21783a(String str, boolean z) {
        Object objValueOf = Boolean.valueOf(z);
        Object obj = this.f61646a.get(str);
        if (obj instanceof Boolean) {
            objValueOf = obj;
        }
        return ((Boolean) objValueOf).booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public final double m21784b(String str) {
        Object objValueOf = Double.valueOf(0.0d);
        Object obj = this.f61646a.get(str);
        if (obj instanceof Double) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).doubleValue();
    }

    /* JADX INFO: renamed from: c */
    public final int m21785c(String str, int i) {
        Object objValueOf = Integer.valueOf(i);
        Object obj = this.f61646a.get(str);
        if (obj instanceof Integer) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).intValue();
    }

    /* JADX INFO: renamed from: d */
    public final int[] m21786d(String str) {
        Object obj = this.f61646a.get(str);
        if (!(obj instanceof Object[])) {
            return null;
        }
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj2 = objArr[i];
            if (obj2 == null) {
                C3386nv.m17635v("null cannot be cast to non-null type kotlin.Int");
                return null;
            }
            iArr[i] = ((Integer) obj2).intValue();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: e */
    public final String m21787e(String str) {
        Object obj = this.f61646a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && sz1.class.equals(obj.getClass())) {
                HashMap map = ((sz1) obj).f61646a;
                HashMap map2 = this.f61646a;
                Set<String> setKeySet = map2.keySet();
                if (fa4.m11650l(setKeySet, map.keySet())) {
                    for (String str : setKeySet) {
                        Object obj2 = map2.get(str);
                        Object obj3 = map.get(str);
                        if (obj2 == null || obj3 == null) {
                            zEquals = obj2 == obj3;
                        } else if (obj2 instanceof Object[]) {
                            Object[] objArr = (Object[]) obj2;
                            if (obj3 instanceof Object[]) {
                                zEquals = AbstractC3550rv.m20824R(objArr, (Object[]) obj3);
                            } else {
                                zEquals = obj2.equals(obj3);
                            }
                        } else {
                            zEquals = obj2.equals(obj3);
                        }
                        if (!zEquals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final String[] m21788f(String str) {
        Object obj = this.f61646a.get(str);
        if (!(obj instanceof Object[])) {
            return null;
        }
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            Object obj2 = objArr[i];
            if (obj2 == null) {
                C3386nv.m17635v("null cannot be cast to non-null type kotlin.String");
                return null;
            }
            strArr[i] = (String) obj2;
        }
        return strArr;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m21789g(String str) {
        Object obj = this.f61646a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.f61646a.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(new StringBuilder("Data {"), u91.m22596N0(this.f61646a.entrySet(), null, null, null, new ae1(16), 31), "}");
    }

    public sz1(LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        this.f61646a = new HashMap(linkedHashMap);
    }
}
