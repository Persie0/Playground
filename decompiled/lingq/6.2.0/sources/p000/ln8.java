package p000;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ln8 extends q80 {

    /* JADX INFO: renamed from: c */
    public long f49867c;

    /* JADX INFO: renamed from: d */
    public long[] f49868d;

    /* JADX INFO: renamed from: e */
    public long[] f49869e;

    /* JADX INFO: renamed from: i */
    public static Serializable m16394i(int i, k47 k47Var) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(k47Var.m14836t()));
        }
        if (i == 1) {
            return Boolean.valueOf(k47Var.m14842z() == 1);
        }
        if (i == 2) {
            return m16396k(k47Var);
        }
        if (i != 3) {
            if (i == 8) {
                return m16395j(k47Var);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(k47Var.m14836t()));
                k47Var.m14819N(2);
                return date;
            }
            int iM14809D = k47Var.m14809D();
            ArrayList arrayList = new ArrayList(iM14809D);
            for (int i2 = 0; i2 < iM14809D; i2++) {
                Serializable serializableM16394i = m16394i(k47Var.m14842z(), k47Var);
                if (serializableM16394i != null) {
                    arrayList.add(serializableM16394i);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strM16396k = m16396k(k47Var);
            int iM14842z = k47Var.m14842z();
            if (iM14842z == 9) {
                return map;
            }
            Serializable serializableM16394i2 = m16394i(iM14842z, k47Var);
            if (serializableM16394i2 != null) {
                map.put(strM16396k, serializableM16394i2);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static HashMap m16395j(k47 k47Var) {
        int iM14809D = k47Var.m14809D();
        HashMap map = new HashMap(iM14809D);
        for (int i = 0; i < iM14809D; i++) {
            String strM16396k = m16396k(k47Var);
            Serializable serializableM16394i = m16394i(k47Var.m14842z(), k47Var);
            if (serializableM16394i != null) {
                map.put(strM16396k, serializableM16394i);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: k */
    public static String m16396k(k47 k47Var) {
        int iM14812G = k47Var.m14812G();
        int i = k47Var.f46701b;
        k47Var.m14819N(iM14812G);
        return new String(k47Var.f46700a, i, iM14812G);
    }
}
