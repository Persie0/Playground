package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.List;
import p000.acc;
import p000.e41;
import p000.e65;
import p000.gw9;
import p000.h2c;
import p000.h5c;
import p000.ij6;
import p000.j7c;
import p000.j8c;
import p000.jjc;
import p000.w1c;
import p000.z3c;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1003n {

    /* JADX INFO: renamed from: a */
    public static final e41 f12199a;

    static {
        int i = w1c.f66234a;
        f12199a = new e41(29);
    }

    /* JADX INFO: renamed from: a */
    public static void m5579a(int i, List list, gw9 gw9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z3c z3cVar = (z3c) gw9Var.f41432b;
        if (list instanceof acc) {
            e65.m10884p(list);
            if (!z) {
                throw null;
            }
            z3cVar.m25444j(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                z3cVar.m25440f(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        z3cVar.m25444j(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        z3cVar.m25446l(i3);
        while (i2 < list.size()) {
            z3cVar.m25441g(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m5580b(int i, List list, gw9 gw9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z3c z3cVar = (z3c) gw9Var.f41432b;
        int i2 = 0;
        if (!(list instanceof j8c)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    z3cVar.m25445k(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            z3cVar.m25444j(i, 2);
            int iM25433o = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iM25433o += z3c.m25433o((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            z3cVar.m25446l(iM25433o);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                z3cVar.m25446l((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        j8c j8cVar = (j8c) list;
        if (!z) {
            while (i2 < j8cVar.size()) {
                int iM14339g = j8cVar.m14339g(i2);
                z3cVar.m25445k(i, (iM14339g >> 31) ^ (iM14339g + iM14339g));
                i2++;
            }
            return;
        }
        z3cVar.m25444j(i, 2);
        int iM25433o2 = 0;
        for (int i4 = 0; i4 < j8cVar.size(); i4++) {
            int iM14339g2 = j8cVar.m14339g(i4);
            iM25433o2 += z3c.m25433o((iM14339g2 >> 31) ^ (iM14339g2 + iM14339g2));
        }
        z3cVar.m25446l(iM25433o2);
        while (i2 < j8cVar.size()) {
            int iM14339g3 = j8cVar.m14339g(i2);
            z3cVar.m25446l((iM14339g3 >> 31) ^ (iM14339g3 + iM14339g3));
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m5581c(int i, List list, gw9 gw9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z3c z3cVar = (z3c) gw9Var.f41432b;
        if (list instanceof acc) {
            e65.m10884p(list);
            if (!z) {
                throw null;
            }
            z3cVar.m25444j(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                z3cVar.m25447m(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return;
        }
        z3cVar.m25444j(i, 2);
        int iM25434p = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iM25434p += z3c.m25434p((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        z3cVar.m25446l(iM25434p);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            z3cVar.m25448n((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i2++;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m5582d(int i, List list, gw9 gw9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z3c z3cVar = (z3c) gw9Var.f41432b;
        int i2 = 0;
        if (!(list instanceof j8c)) {
            if (!z) {
                while (i2 < list.size()) {
                    z3cVar.m25445k(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            z3cVar.m25444j(i, 2);
            int iM25433o = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM25433o += z3c.m25433o(((Integer) list.get(i3)).intValue());
            }
            z3cVar.m25446l(iM25433o);
            while (i2 < list.size()) {
                z3cVar.m25446l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        j8c j8cVar = (j8c) list;
        if (!z) {
            while (i2 < j8cVar.size()) {
                z3cVar.m25445k(i, j8cVar.m14339g(i2));
                i2++;
            }
            return;
        }
        z3cVar.m25444j(i, 2);
        int iM25433o2 = 0;
        for (int i4 = 0; i4 < j8cVar.size(); i4++) {
            iM25433o2 += z3c.m25433o(j8cVar.m14339g(i4));
        }
        z3cVar.m25446l(iM25433o2);
        while (i2 < j8cVar.size()) {
            z3cVar.m25446l(j8cVar.m14339g(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m5583e(int i, List list, gw9 gw9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z3c z3cVar = (z3c) gw9Var.f41432b;
        if (list instanceof acc) {
            e65.m10884p(list);
            if (!z) {
                throw null;
            }
            z3cVar.m25444j(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                z3cVar.m25447m(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        z3cVar.m25444j(i, 2);
        int iM25434p = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM25434p += z3c.m25434p(((Long) list.get(i3)).longValue());
        }
        z3cVar.m25446l(iM25434p);
        while (i2 < list.size()) {
            z3cVar.m25448n(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m5584f(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static int m5585g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j8c)) {
            int iM25434p = 0;
            while (i < size) {
                iM25434p += z3c.m25434p(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM25434p;
        }
        j8c j8cVar = (j8c) list;
        int iM25434p2 = 0;
        while (i < size) {
            iM25434p2 += z3c.m25434p(j8cVar.m14339g(i));
            i++;
        }
        return iM25434p2;
    }

    /* JADX INFO: renamed from: h */
    public static int m5586h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (z3c.m25433o(i << 3) + 4) * size;
    }

    /* JADX INFO: renamed from: i */
    public static int m5587i(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (z3c.m25433o(i << 3) + 8) * size;
    }

    /* JADX INFO: renamed from: j */
    public static int m5588j(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j8c)) {
            int iM25434p = 0;
            while (i < size) {
                iM25434p += z3c.m25434p(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM25434p;
        }
        j8c j8cVar = (j8c) list;
        int iM25434p2 = 0;
        while (i < size) {
            iM25434p2 += z3c.m25434p(j8cVar.m14339g(i));
            i++;
        }
        return iM25434p2;
    }

    /* JADX INFO: renamed from: k */
    public static int m5589k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof acc) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM25434p = 0;
        for (int i = 0; i < size; i++) {
            iM25434p += z3c.m25434p(((Long) list.get(i)).longValue());
        }
        return iM25434p;
    }

    /* JADX INFO: renamed from: l */
    public static int m5590l(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j8c)) {
            int iM25433o = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iM25433o += z3c.m25433o((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iM25433o;
        }
        j8c j8cVar = (j8c) list;
        int iM25433o2 = 0;
        while (i < size) {
            int iM14339g = j8cVar.m14339g(i);
            iM25433o2 += z3c.m25433o((iM14339g >> 31) ^ (iM14339g + iM14339g));
            i++;
        }
        return iM25433o2;
    }

    /* JADX INFO: renamed from: m */
    public static int m5591m(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof acc) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM25434p = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iM25434p += z3c.m25434p((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iM25434p;
    }

    /* JADX INFO: renamed from: n */
    public static int m5592n(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j8c)) {
            int iM25433o = 0;
            while (i < size) {
                iM25433o += z3c.m25433o(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM25433o;
        }
        j8c j8cVar = (j8c) list;
        int iM25433o2 = 0;
        while (i < size) {
            iM25433o2 += z3c.m25433o(j8cVar.m14339g(i));
            i++;
        }
        return iM25433o2;
    }

    /* JADX INFO: renamed from: o */
    public static int m5593o(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof acc) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM25434p = 0;
        for (int i = 0; i < size; i++) {
            iM25434p += z3c.m25434p(((Long) list.get(i)).longValue());
        }
        return iM25434p;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: p */
    public static void m5594p(Object obj, Object obj2) {
        AbstractC0998i abstractC0998i = (AbstractC0998i) obj;
        jjc jjcVar = abstractC0998i.zzc;
        jjc jjcVar2 = ((AbstractC0998i) obj2).zzc;
        jjc jjcVar3 = jjc.f45639f;
        if (!jjcVar3.equals(jjcVar2)) {
            if (jjcVar3.equals(jjcVar)) {
                int i = jjcVar.f45640a + jjcVar2.f45640a;
                int[] iArrCopyOf = Arrays.copyOf(jjcVar.f45641b, i);
                System.arraycopy(jjcVar2.f45641b, 0, iArrCopyOf, jjcVar.f45640a, jjcVar2.f45640a);
                Object[] objArrCopyOf = Arrays.copyOf(jjcVar.f45642c, i);
                System.arraycopy(jjcVar2.f45642c, 0, objArrCopyOf, jjcVar.f45640a, jjcVar2.f45640a);
                jjcVar = new jjc(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                jjcVar.getClass();
                if (!jjcVar2.equals(jjcVar3)) {
                    if (!jjcVar.f45644e) {
                        ij6.m13946b();
                        return;
                    }
                    int i2 = jjcVar.f45640a + jjcVar2.f45640a;
                    jjcVar.m14508e(i2);
                    System.arraycopy(jjcVar2.f45641b, 0, jjcVar.f45641b, jjcVar.f45640a, jjcVar2.f45640a);
                    System.arraycopy(jjcVar2.f45642c, 0, jjcVar.f45642c, jjcVar.f45640a, jjcVar2.f45640a);
                    jjcVar.f45640a = i2;
                }
            }
        }
        abstractC0998i.zzc = jjcVar;
    }

    /* JADX INFO: renamed from: q */
    public static void m5595q(int i, List list, gw9 gw9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z3c z3cVar = (z3c) gw9Var.f41432b;
        if (list instanceof h2c) {
            e65.m10884p(list);
            if (!z) {
                throw null;
            }
            z3cVar.m25444j(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                z3cVar.m25446l(i << 3);
                z3cVar.m25435a(zBooleanValue ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        z3cVar.m25444j(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        z3cVar.m25446l(i3);
        while (i2 < list.size()) {
            z3cVar.m25435a(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m5596r(int i, List list, gw9 gw9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z3c z3cVar = (z3c) gw9Var.f41432b;
        if (list instanceof h5c) {
            e65.m10884p(list);
            if (!z) {
                throw null;
            }
            z3cVar.m25444j(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                z3cVar.m25440f(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        z3cVar.m25444j(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        z3cVar.m25446l(i3);
        while (i2 < list.size()) {
            z3cVar.m25441g(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m5597s(int i, List list, gw9 gw9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z3c z3cVar = (z3c) gw9Var.f41432b;
        int i2 = 0;
        if (!(list instanceof j8c)) {
            if (!z) {
                while (i2 < list.size()) {
                    z3cVar.m25442h(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            z3cVar.m25444j(i, 2);
            int iM25434p = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM25434p += z3c.m25434p(((Integer) list.get(i3)).intValue());
            }
            z3cVar.m25446l(iM25434p);
            while (i2 < list.size()) {
                z3cVar.m25443i(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        j8c j8cVar = (j8c) list;
        if (!z) {
            while (i2 < j8cVar.size()) {
                z3cVar.m25442h(i, j8cVar.m14339g(i2));
                i2++;
            }
            return;
        }
        z3cVar.m25444j(i, 2);
        int iM25434p2 = 0;
        for (int i4 = 0; i4 < j8cVar.size(); i4++) {
            iM25434p2 += z3c.m25434p(j8cVar.m14339g(i4));
        }
        z3cVar.m25446l(iM25434p2);
        while (i2 < j8cVar.size()) {
            z3cVar.m25443i(j8cVar.m14339g(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m5598t(int i, List list, gw9 gw9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z3c z3cVar = (z3c) gw9Var.f41432b;
        int i2 = 0;
        if (!(list instanceof j8c)) {
            if (!z) {
                while (i2 < list.size()) {
                    z3cVar.m25438d(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            z3cVar.m25444j(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            z3cVar.m25446l(i3);
            while (i2 < list.size()) {
                z3cVar.m25439e(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        j8c j8cVar = (j8c) list;
        if (!z) {
            while (i2 < j8cVar.size()) {
                z3cVar.m25438d(i, j8cVar.m14339g(i2));
                i2++;
            }
            return;
        }
        z3cVar.m25444j(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < j8cVar.size(); i6++) {
            j8cVar.m14339g(i6);
            i5 += 4;
        }
        z3cVar.m25446l(i5);
        while (i2 < j8cVar.size()) {
            z3cVar.m25439e(j8cVar.m14339g(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m5599u(int i, List list, gw9 gw9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z3c z3cVar = (z3c) gw9Var.f41432b;
        if (list instanceof acc) {
            e65.m10884p(list);
            if (!z) {
                throw null;
            }
            z3cVar.m25444j(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                z3cVar.m25440f(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        z3cVar.m25444j(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        z3cVar.m25446l(i3);
        while (i2 < list.size()) {
            z3cVar.m25441g(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m5600v(int i, List list, gw9 gw9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z3c z3cVar = (z3c) gw9Var.f41432b;
        if (list instanceof j7c) {
            e65.m10884p(list);
            if (!z) {
                throw null;
            }
            z3cVar.m25444j(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                z3cVar.m25438d(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        z3cVar.m25444j(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        z3cVar.m25446l(i3);
        while (i2 < list.size()) {
            z3cVar.m25439e(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m5601w(int i, List list, gw9 gw9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z3c z3cVar = (z3c) gw9Var.f41432b;
        int i2 = 0;
        if (!(list instanceof j8c)) {
            if (!z) {
                while (i2 < list.size()) {
                    z3cVar.m25442h(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            z3cVar.m25444j(i, 2);
            int iM25434p = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM25434p += z3c.m25434p(((Integer) list.get(i3)).intValue());
            }
            z3cVar.m25446l(iM25434p);
            while (i2 < list.size()) {
                z3cVar.m25443i(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        j8c j8cVar = (j8c) list;
        if (!z) {
            while (i2 < j8cVar.size()) {
                z3cVar.m25442h(i, j8cVar.m14339g(i2));
                i2++;
            }
            return;
        }
        z3cVar.m25444j(i, 2);
        int iM25434p2 = 0;
        for (int i4 = 0; i4 < j8cVar.size(); i4++) {
            iM25434p2 += z3c.m25434p(j8cVar.m14339g(i4));
        }
        z3cVar.m25446l(iM25434p2);
        while (i2 < j8cVar.size()) {
            z3cVar.m25443i(j8cVar.m14339g(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m5602x(int i, List list, gw9 gw9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z3c z3cVar = (z3c) gw9Var.f41432b;
        if (list instanceof acc) {
            e65.m10884p(list);
            if (!z) {
                throw null;
            }
            z3cVar.m25444j(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                z3cVar.m25447m(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        z3cVar.m25444j(i, 2);
        int iM25434p = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM25434p += z3c.m25434p(((Long) list.get(i3)).longValue());
        }
        z3cVar.m25446l(iM25434p);
        while (i2 < list.size()) {
            z3cVar.m25448n(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m5603y(int i, List list, gw9 gw9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z3c z3cVar = (z3c) gw9Var.f41432b;
        int i2 = 0;
        if (!(list instanceof j8c)) {
            if (!z) {
                while (i2 < list.size()) {
                    z3cVar.m25438d(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            z3cVar.m25444j(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            z3cVar.m25446l(i3);
            while (i2 < list.size()) {
                z3cVar.m25439e(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        j8c j8cVar = (j8c) list;
        if (!z) {
            while (i2 < j8cVar.size()) {
                z3cVar.m25438d(i, j8cVar.m14339g(i2));
                i2++;
            }
            return;
        }
        z3cVar.m25444j(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < j8cVar.size(); i6++) {
            j8cVar.m14339g(i6);
            i5 += 4;
        }
        z3cVar.m25446l(i5);
        while (i2 < j8cVar.size()) {
            z3cVar.m25439e(j8cVar.m14339g(i2));
            i2++;
        }
    }
}
