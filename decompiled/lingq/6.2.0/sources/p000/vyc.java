package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.builders.ListBuilder;
import okio.SegmentedByteString;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vyc {
    /* JADX INFO: renamed from: a */
    public static final List m23594a(ik8 ik8Var) {
        int iM14095i = AbstractC3122is.m14095i(ik8Var, "id");
        int iM14095i2 = AbstractC3122is.m14095i(ik8Var, "seq");
        int iM14095i3 = AbstractC3122is.m14095i(ik8Var, "from");
        int iM14095i4 = AbstractC3122is.m14095i(ik8Var, "to");
        ListBuilder listBuilderM23650t = vz1.m23650t();
        while (ik8Var.mo2876a0()) {
            listBuilderM23650t.add(new ic3(ik8Var.mo2875L(iM14095i3), (int) ik8Var.getLong(iM14095i), (int) ik8Var.getLong(iM14095i2), ik8Var.mo2875L(iM14095i4)));
        }
        return u91.m22613e1(vz1.m23635i(listBuilderM23650t));
    }

    /* JADX INFO: renamed from: b */
    public static final xq9 m23595b(bk8 bk8Var, String str, boolean z) throws Exception {
        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iM14095i = AbstractC3122is.m14095i(ik8VarMo2873e0, "seqno");
            int iM14095i2 = AbstractC3122is.m14095i(ik8VarMo2873e0, "cid");
            int iM14095i3 = AbstractC3122is.m14095i(ik8VarMo2873e0, "name");
            int iM14095i4 = AbstractC3122is.m14095i(ik8VarMo2873e0, "desc");
            if (iM14095i != -1 && iM14095i2 != -1 && iM14095i3 != -1 && iM14095i4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (ik8VarMo2873e0.mo2876a0()) {
                    if (((int) ik8VarMo2873e0.getLong(iM14095i2)) >= 0) {
                        int i = (int) ik8VarMo2873e0.getLong(iM14095i);
                        String strMo2875L = ik8VarMo2873e0.mo2875L(iM14095i3);
                        String str2 = ik8VarMo2873e0.getLong(iM14095i4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), strMo2875L);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List listM22614f1 = u91.m22614f1(linkedHashMap.entrySet(), new yd7(3));
                ArrayList arrayList = new ArrayList(v91.m23189q0(listM22614f1, 10));
                Iterator it = listM22614f1.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listM22622n1 = u91.m22622n1(arrayList);
                List listM22614f2 = u91.m22614f1(linkedHashMap2.entrySet(), new yd7(4));
                ArrayList arrayList2 = new ArrayList(v91.m23189q0(listM22614f2, 10));
                Iterator it2 = listM22614f2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                xq9 xq9Var = new xq9(str, z, listM22622n1, u91.m22622n1(arrayList2));
                AbstractC3352my.m17126j(ik8VarMo2873e0, null);
                return xq9Var;
            }
            AbstractC3352my.m17126j(ik8VarMo2873e0, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3352my.m17126j(ik8VarMo2873e0, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    /* JADX INFO: renamed from: c */
    public static final int m23596c(SegmentedByteString segmentedByteString, int i) {
        int i2;
        int[] iArr = segmentedByteString.f54518f;
        int i3 = i + 1;
        int length = segmentedByteString.f54517e.length;
        iArr.getClass();
        int i4 = length - 1;
        int i5 = 0;
        while (i5 <= i4) {
            i2 = (i5 + i4) >>> 1;
            int i6 = iArr[i2];
            if (i6 < i3) {
                i5 = i2 + 1;
            } else {
                if (i6 <= i3) {
                    if (i2 >= 0) {
                        return i2;
                    }
                    return ~i2;
                }
                i4 = i2 - 1;
            }
        }
        i2 = (-i5) - 1;
        if (i2 >= 0) {
            return i2;
        }
        return ~i2;
    }
}
