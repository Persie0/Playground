package androidx.glance.appwidget.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import p000.f73;
import p000.h94;
import p000.hk5;
import p000.ho7;
import p000.ij6;
import p000.jf0;
import p000.kw4;
import p000.n94;
import p000.v74;
import p000.vi2;
import p000.vj6;
import p000.ym8;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.m */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0679m {

    /* JADX INFO: renamed from: a */
    public static final Class f6097a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC0680n f6098b;

    /* JADX INFO: renamed from: c */
    public static final C0682p f6099c;

    static {
        Class<?> cls;
        Class<?> cls2;
        ho7 ho7Var = ho7.f42713c;
        AbstractC0680n abstractC0680n = null;
        try {
            cls = Class.forName("androidx.glance.appwidget.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f6097a = cls;
        try {
            ho7 ho7Var2 = ho7.f42713c;
            try {
                cls2 = Class.forName("androidx.glance.appwidget.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                abstractC0680n = (AbstractC0680n) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f6098b = abstractC0680n;
        f6099c = new C0682p();
    }

    /* JADX INFO: renamed from: A */
    public static void m2435A(int i, List list, vj6 vj6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof v74;
        AbstractC0673g abstractC0673g = (AbstractC0673g) vj6Var.f65506b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    abstractC0673g.mo2357v(i, (iIntValue >> 31) ^ (iIntValue << 1));
                    i2++;
                }
                return;
            }
            abstractC0673g.mo2356u(i, 2);
            int iM2371b = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM2371b += AbstractC0673g.m2371b(((Integer) list.get(i3)).intValue());
            }
            abstractC0673g.mo2358w(iM2371b);
            while (i2 < list.size()) {
                int iIntValue2 = ((Integer) list.get(i2)).intValue();
                abstractC0673g.mo2358w((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                i2++;
            }
            return;
        }
        v74 v74Var = (v74) list;
        if (!z) {
            while (i2 < v74Var.f64970c) {
                int i4 = v74Var.getInt(i2);
                abstractC0673g.mo2357v(i, (i4 >> 31) ^ (i4 << 1));
                i2++;
            }
            return;
        }
        abstractC0673g.mo2356u(i, 2);
        int iM2371b2 = 0;
        for (int i5 = 0; i5 < v74Var.f64970c; i5++) {
            iM2371b2 += AbstractC0673g.m2371b(v74Var.getInt(i5));
        }
        abstractC0673g.mo2358w(iM2371b2);
        while (i2 < v74Var.f64970c) {
            int i6 = v74Var.getInt(i2);
            abstractC0673g.mo2358w((i6 >> 31) ^ (i6 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m2436B(int i, List list, vj6 vj6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof hk5;
        AbstractC0673g abstractC0673g = (AbstractC0673g) vj6Var.f65506b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    abstractC0673g.mo2359x(i, (jLongValue >> 63) ^ (jLongValue << 1));
                    i2++;
                }
                return;
            }
            abstractC0673g.mo2356u(i, 2);
            int iM2372c = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM2372c += AbstractC0673g.m2372c(((Long) list.get(i3)).longValue());
            }
            abstractC0673g.mo2358w(iM2372c);
            while (i2 < list.size()) {
                long jLongValue2 = ((Long) list.get(i2)).longValue();
                abstractC0673g.mo2360y((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                i2++;
            }
            return;
        }
        hk5 hk5Var = (hk5) list;
        if (!z) {
            while (i2 < 0) {
                long j = hk5Var.getLong(i2);
                abstractC0673g.mo2359x(i, (j >> 63) ^ (j << 1));
                i2++;
            }
            return;
        }
        abstractC0673g.mo2356u(i, 2);
        int iM2372c2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iM2372c2 += AbstractC0673g.m2372c(hk5Var.getLong(i4));
        }
        abstractC0673g.mo2358w(iM2372c2);
        while (i2 < 0) {
            long j2 = hk5Var.getLong(i2);
            abstractC0673g.mo2360y((j2 >> 63) ^ (j2 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m2437C(int i, List list, vj6 vj6Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0673g abstractC0673g = (AbstractC0673g) vj6Var.f65506b;
        int i2 = 0;
        if (!(list instanceof kw4)) {
            while (i2 < list.size()) {
                abstractC0673g.mo2355t(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        kw4 kw4Var = (kw4) list;
        while (i2 < list.size()) {
            Object objM15709q = kw4Var.m15709q();
            if (objM15709q instanceof String) {
                abstractC0673g.mo2355t(i, (String) objM15709q);
            } else {
                abstractC0673g.mo2346k(i, (ByteString) objM15709q);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m2438D(int i, List list, vj6 vj6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof v74;
        AbstractC0673g abstractC0673g = (AbstractC0673g) vj6Var.f65506b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC0673g.mo2357v(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC0673g.mo2356u(i, 2);
            int iM2375f = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM2375f += AbstractC0673g.m2375f(((Integer) list.get(i3)).intValue());
            }
            abstractC0673g.mo2358w(iM2375f);
            while (i2 < list.size()) {
                abstractC0673g.mo2358w(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        v74 v74Var = (v74) list;
        if (!z) {
            while (i2 < v74Var.f64970c) {
                abstractC0673g.mo2357v(i, v74Var.getInt(i2));
                i2++;
            }
            return;
        }
        abstractC0673g.mo2356u(i, 2);
        int iM2375f2 = 0;
        for (int i4 = 0; i4 < v74Var.f64970c; i4++) {
            iM2375f2 += AbstractC0673g.m2375f(v74Var.getInt(i4));
        }
        abstractC0673g.mo2358w(iM2375f2);
        while (i2 < v74Var.f64970c) {
            abstractC0673g.mo2358w(v74Var.getInt(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m2439E(int i, List list, vj6 vj6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof hk5;
        AbstractC0673g abstractC0673g = (AbstractC0673g) vj6Var.f65506b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC0673g.mo2359x(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC0673g.mo2356u(i, 2);
            int iM2376g = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM2376g += AbstractC0673g.m2376g(((Long) list.get(i3)).longValue());
            }
            abstractC0673g.mo2358w(iM2376g);
            while (i2 < list.size()) {
                abstractC0673g.mo2360y(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        hk5 hk5Var = (hk5) list;
        if (!z) {
            while (i2 < 0) {
                abstractC0673g.mo2359x(i, hk5Var.getLong(i2));
                i2++;
            }
            return;
        }
        abstractC0673g.mo2356u(i, 2);
        int iM2376g2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iM2376g2 += AbstractC0673g.m2376g(hk5Var.getLong(i4));
        }
        abstractC0673g.mo2358w(iM2376g2);
        while (i2 < 0) {
            abstractC0673g.mo2360y(hk5Var.getLong(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m2440a(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof v74)) {
            int iM2376g = 0;
            while (i < size) {
                iM2376g += AbstractC0673g.m2376g(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM2376g;
        }
        v74 v74Var = (v74) list;
        int iM2376g2 = 0;
        while (i < size) {
            iM2376g2 += AbstractC0673g.m2376g(v74Var.getInt(i));
            i++;
        }
        return iM2376g2;
    }

    /* JADX INFO: renamed from: b */
    public static int m2441b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0673g.m2374e(i) + 4) * size;
    }

    /* JADX INFO: renamed from: c */
    public static int m2442c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0673g.m2374e(i) + 8) * size;
    }

    /* JADX INFO: renamed from: d */
    public static int m2443d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof v74)) {
            int iM2376g = 0;
            while (i < size) {
                iM2376g += AbstractC0673g.m2376g(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM2376g;
        }
        v74 v74Var = (v74) list;
        int iM2376g2 = 0;
        while (i < size) {
            iM2376g2 += AbstractC0673g.m2376g(v74Var.getInt(i));
            i++;
        }
        return iM2376g2;
    }

    /* JADX INFO: renamed from: e */
    public static int m2444e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof hk5)) {
            int iM2376g = 0;
            while (i < size) {
                iM2376g += AbstractC0673g.m2376g(((Long) list.get(i)).longValue());
                i++;
            }
            return iM2376g;
        }
        hk5 hk5Var = (hk5) list;
        int iM2376g2 = 0;
        while (i < size) {
            iM2376g2 += AbstractC0673g.m2376g(hk5Var.getLong(i));
            i++;
        }
        return iM2376g2;
    }

    /* JADX INFO: renamed from: f */
    public static int m2445f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof v74)) {
            int iM2371b = 0;
            while (i < size) {
                iM2371b += AbstractC0673g.m2371b(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM2371b;
        }
        v74 v74Var = (v74) list;
        int iM2371b2 = 0;
        while (i < size) {
            iM2371b2 += AbstractC0673g.m2371b(v74Var.getInt(i));
            i++;
        }
        return iM2371b2;
    }

    /* JADX INFO: renamed from: g */
    public static int m2446g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof hk5)) {
            int iM2372c = 0;
            while (i < size) {
                iM2372c += AbstractC0673g.m2372c(((Long) list.get(i)).longValue());
                i++;
            }
            return iM2372c;
        }
        hk5 hk5Var = (hk5) list;
        int iM2372c2 = 0;
        while (i < size) {
            iM2372c2 += AbstractC0673g.m2372c(hk5Var.getLong(i));
            i++;
        }
        return iM2372c2;
    }

    /* JADX INFO: renamed from: h */
    public static int m2447h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof v74)) {
            int iM2375f = 0;
            while (i < size) {
                iM2375f += AbstractC0673g.m2375f(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM2375f;
        }
        v74 v74Var = (v74) list;
        int iM2375f2 = 0;
        while (i < size) {
            iM2375f2 += AbstractC0673g.m2375f(v74Var.getInt(i));
            i++;
        }
        return iM2375f2;
    }

    /* JADX INFO: renamed from: i */
    public static int m2448i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof hk5)) {
            int iM2376g = 0;
            while (i < size) {
                iM2376g += AbstractC0673g.m2376g(((Long) list.get(i)).longValue());
                i++;
            }
            return iM2376g;
        }
        hk5 hk5Var = (hk5) list;
        int iM2376g2 = 0;
        while (i < size) {
            iM2376g2 += AbstractC0673g.m2376g(hk5Var.getLong(i));
            i++;
        }
        return iM2376g2;
    }

    /* JADX INFO: renamed from: j */
    public static Object m2449j(Object obj, int i, n94 n94Var, h94 h94Var, Object obj2, AbstractC0680n abstractC0680n) {
        if (h94Var == null) {
            return obj2;
        }
        if (n94Var == null) {
            Iterator it = n94Var.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!h94Var.isInRange(iIntValue)) {
                    obj2 = m2452m(obj, i, iIntValue, obj2, abstractC0680n);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = n94Var.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) n94Var.get(i3);
            int iIntValue2 = num.intValue();
            if (h94Var.isInRange(iIntValue2)) {
                if (i3 != i2) {
                    n94Var.set(i2, num);
                }
                i2++;
            } else {
                obj2 = m2452m(obj, i, iIntValue2, obj2, abstractC0680n);
            }
        }
        if (i2 != size) {
            n94Var.subList(i2, size).clear();
        }
        return obj2;
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
    /* JADX INFO: renamed from: k */
    public static void m2450k(AbstractC0680n abstractC0680n, Object obj, Object obj2) {
        ((C0682p) abstractC0680n).getClass();
        AbstractC0675i abstractC0675i = (AbstractC0675i) obj;
        C0681o c0681o = abstractC0675i.unknownFields;
        C0681o c0681o2 = ((AbstractC0675i) obj2).unknownFields;
        C0681o c0681o3 = C0681o.f6100f;
        if (!c0681o3.equals(c0681o2)) {
            if (c0681o3.equals(c0681o)) {
                int i = c0681o.f6101a + c0681o2.f6101a;
                int[] iArrCopyOf = Arrays.copyOf(c0681o.f6102b, i);
                System.arraycopy(c0681o2.f6102b, 0, iArrCopyOf, c0681o.f6101a, c0681o2.f6101a);
                Object[] objArrCopyOf = Arrays.copyOf(c0681o.f6103c, i);
                System.arraycopy(c0681o2.f6103c, 0, objArrCopyOf, c0681o.f6101a, c0681o2.f6101a);
                c0681o = new C0681o(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                c0681o.getClass();
                if (!c0681o2.equals(c0681o3)) {
                    if (!c0681o.f6105e) {
                        ij6.m13946b();
                        return;
                    }
                    int i2 = c0681o.f6101a + c0681o2.f6101a;
                    c0681o.m2469a(i2);
                    System.arraycopy(c0681o2.f6102b, 0, c0681o.f6102b, c0681o.f6101a, c0681o2.f6101a);
                    System.arraycopy(c0681o2.f6103c, 0, c0681o.f6103c, c0681o.f6101a, c0681o2.f6101a);
                    c0681o.f6101a = i2;
                }
            }
        }
        abstractC0675i.unknownFields = c0681o;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m2451l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public static Object m2452m(Object obj, int i, int i2, Object obj2, AbstractC0680n abstractC0680n) {
        if (obj2 == null) {
            obj2 = abstractC0680n.mo2466a(obj);
        }
        ((C0682p) abstractC0680n).getClass();
        ((C0681o) obj2).m2471d(i << 3, Long.valueOf(i2));
        return obj2;
    }

    /* JADX INFO: renamed from: n */
    public static void m2453n(int i, List list, vj6 vj6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof jf0;
        AbstractC0673g abstractC0673g = (AbstractC0673g) vj6Var.f65506b;
        int i2 = 0;
        if (z2) {
            if (z) {
                abstractC0673g.mo2356u(i, 2);
                abstractC0673g.mo2358w(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                abstractC0673g.mo2345j(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        abstractC0673g.mo2356u(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = AbstractC0673g.f6073b;
            i3++;
        }
        abstractC0673g.mo2358w(i3);
        while (i2 < list.size()) {
            abstractC0673g.mo2344i(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m2454o(int i, List list, vj6 vj6Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        vj6Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((AbstractC0673g) vj6Var.f65506b).mo2346k(i, (ByteString) list.get(i2));
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m2455p(int i, List list, vj6 vj6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof vi2;
        AbstractC0673g abstractC0673g = (AbstractC0673g) vj6Var.f65506b;
        int i2 = 0;
        if (z2) {
            if (z) {
                abstractC0673g.mo2356u(i, 2);
                abstractC0673g.mo2358w(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                abstractC0673g.getClass();
                abstractC0673g.mo2349n(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        abstractC0673g.mo2356u(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = AbstractC0673g.f6073b;
            i3 += 8;
        }
        abstractC0673g.mo2358w(i3);
        while (i2 < list.size()) {
            abstractC0673g.mo2350o(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m2456q(int i, List list, vj6 vj6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof v74;
        AbstractC0673g abstractC0673g = (AbstractC0673g) vj6Var.f65506b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC0673g.mo2351p(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC0673g.mo2356u(i, 2);
            int iM2376g = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM2376g += AbstractC0673g.m2376g(((Integer) list.get(i3)).intValue());
            }
            abstractC0673g.mo2358w(iM2376g);
            while (i2 < list.size()) {
                abstractC0673g.mo2352q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        v74 v74Var = (v74) list;
        if (!z) {
            while (i2 < v74Var.f64970c) {
                abstractC0673g.mo2351p(i, v74Var.getInt(i2));
                i2++;
            }
            return;
        }
        abstractC0673g.mo2356u(i, 2);
        int iM2376g2 = 0;
        for (int i4 = 0; i4 < v74Var.f64970c; i4++) {
            iM2376g2 += AbstractC0673g.m2376g(v74Var.getInt(i4));
        }
        abstractC0673g.mo2358w(iM2376g2);
        while (i2 < v74Var.f64970c) {
            abstractC0673g.mo2352q(v74Var.getInt(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m2457r(int i, List list, vj6 vj6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof v74;
        AbstractC0673g abstractC0673g = (AbstractC0673g) vj6Var.f65506b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC0673g.mo2347l(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC0673g.mo2356u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                Logger logger = AbstractC0673g.f6073b;
                i3 += 4;
            }
            abstractC0673g.mo2358w(i3);
            while (i2 < list.size()) {
                abstractC0673g.mo2348m(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        v74 v74Var = (v74) list;
        if (!z) {
            while (i2 < v74Var.f64970c) {
                abstractC0673g.mo2347l(i, v74Var.getInt(i2));
                i2++;
            }
            return;
        }
        abstractC0673g.mo2356u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < v74Var.f64970c; i6++) {
            v74Var.getInt(i6);
            Logger logger2 = AbstractC0673g.f6073b;
            i5 += 4;
        }
        abstractC0673g.mo2358w(i5);
        while (i2 < v74Var.f64970c) {
            abstractC0673g.mo2348m(v74Var.getInt(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m2458s(int i, List list, vj6 vj6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof hk5;
        AbstractC0673g abstractC0673g = (AbstractC0673g) vj6Var.f65506b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC0673g.mo2349n(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC0673g.mo2356u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                Logger logger = AbstractC0673g.f6073b;
                i3 += 8;
            }
            abstractC0673g.mo2358w(i3);
            while (i2 < list.size()) {
                abstractC0673g.mo2350o(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        hk5 hk5Var = (hk5) list;
        if (!z) {
            while (i2 < 0) {
                abstractC0673g.mo2349n(i, hk5Var.getLong(i2));
                i2++;
            }
            return;
        }
        abstractC0673g.mo2356u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            hk5Var.getLong(i6);
            Logger logger2 = AbstractC0673g.f6073b;
            i5 += 8;
        }
        abstractC0673g.mo2358w(i5);
        while (i2 < 0) {
            abstractC0673g.mo2350o(hk5Var.getLong(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m2459t(int i, List list, vj6 vj6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof f73;
        AbstractC0673g abstractC0673g = (AbstractC0673g) vj6Var.f65506b;
        int i2 = 0;
        if (z2) {
            if (z) {
                abstractC0673g.mo2356u(i, 2);
                abstractC0673g.mo2358w(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                abstractC0673g.getClass();
                abstractC0673g.mo2347l(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        abstractC0673g.mo2356u(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = AbstractC0673g.f6073b;
            i3 += 4;
        }
        abstractC0673g.mo2358w(i3);
        while (i2 < list.size()) {
            abstractC0673g.mo2348m(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m2460u(int i, List list, vj6 vj6Var, ym8 ym8Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        vj6Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            vj6Var.m23341C(i, list.get(i2), ym8Var);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m2461v(int i, List list, vj6 vj6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof v74;
        AbstractC0673g abstractC0673g = (AbstractC0673g) vj6Var.f65506b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC0673g.mo2351p(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC0673g.mo2356u(i, 2);
            int iM2376g = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM2376g += AbstractC0673g.m2376g(((Integer) list.get(i3)).intValue());
            }
            abstractC0673g.mo2358w(iM2376g);
            while (i2 < list.size()) {
                abstractC0673g.mo2352q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        v74 v74Var = (v74) list;
        if (!z) {
            while (i2 < v74Var.f64970c) {
                abstractC0673g.mo2351p(i, v74Var.getInt(i2));
                i2++;
            }
            return;
        }
        abstractC0673g.mo2356u(i, 2);
        int iM2376g2 = 0;
        for (int i4 = 0; i4 < v74Var.f64970c; i4++) {
            iM2376g2 += AbstractC0673g.m2376g(v74Var.getInt(i4));
        }
        abstractC0673g.mo2358w(iM2376g2);
        while (i2 < v74Var.f64970c) {
            abstractC0673g.mo2352q(v74Var.getInt(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m2462w(int i, List list, vj6 vj6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof hk5;
        AbstractC0673g abstractC0673g = (AbstractC0673g) vj6Var.f65506b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC0673g.mo2359x(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC0673g.mo2356u(i, 2);
            int iM2376g = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM2376g += AbstractC0673g.m2376g(((Long) list.get(i3)).longValue());
            }
            abstractC0673g.mo2358w(iM2376g);
            while (i2 < list.size()) {
                abstractC0673g.mo2360y(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        hk5 hk5Var = (hk5) list;
        if (!z) {
            while (i2 < 0) {
                abstractC0673g.mo2359x(i, hk5Var.getLong(i2));
                i2++;
            }
            return;
        }
        abstractC0673g.mo2356u(i, 2);
        int iM2376g2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iM2376g2 += AbstractC0673g.m2376g(hk5Var.getLong(i4));
        }
        abstractC0673g.mo2358w(iM2376g2);
        while (i2 < 0) {
            abstractC0673g.mo2360y(hk5Var.getLong(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m2463x(int i, List list, vj6 vj6Var, ym8 ym8Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        vj6Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((AbstractC0673g) vj6Var.f65506b).mo2354s(i, (AbstractC0667a) list.get(i2), ym8Var);
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m2464y(int i, List list, vj6 vj6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof v74;
        AbstractC0673g abstractC0673g = (AbstractC0673g) vj6Var.f65506b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC0673g.mo2347l(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC0673g.mo2356u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                Logger logger = AbstractC0673g.f6073b;
                i3 += 4;
            }
            abstractC0673g.mo2358w(i3);
            while (i2 < list.size()) {
                abstractC0673g.mo2348m(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        v74 v74Var = (v74) list;
        if (!z) {
            while (i2 < v74Var.f64970c) {
                abstractC0673g.mo2347l(i, v74Var.getInt(i2));
                i2++;
            }
            return;
        }
        abstractC0673g.mo2356u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < v74Var.f64970c; i6++) {
            v74Var.getInt(i6);
            Logger logger2 = AbstractC0673g.f6073b;
            i5 += 4;
        }
        abstractC0673g.mo2358w(i5);
        while (i2 < v74Var.f64970c) {
            abstractC0673g.mo2348m(v74Var.getInt(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m2465z(int i, List list, vj6 vj6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof hk5;
        AbstractC0673g abstractC0673g = (AbstractC0673g) vj6Var.f65506b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC0673g.mo2349n(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC0673g.mo2356u(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                Logger logger = AbstractC0673g.f6073b;
                i3 += 8;
            }
            abstractC0673g.mo2358w(i3);
            while (i2 < list.size()) {
                abstractC0673g.mo2350o(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        hk5 hk5Var = (hk5) list;
        if (!z) {
            while (i2 < 0) {
                abstractC0673g.mo2349n(i, hk5Var.getLong(i2));
                i2++;
            }
            return;
        }
        abstractC0673g.mo2356u(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            hk5Var.getLong(i6);
            Logger logger2 = AbstractC0673g.f6073b;
            i5 += 8;
        }
        abstractC0673g.mo2358w(i5);
        while (i2 < 0) {
            abstractC0673g.mo2350o(hk5Var.getLong(i2));
            i2++;
        }
    }
}
