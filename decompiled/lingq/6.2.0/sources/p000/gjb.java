package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class gjb {

    /* JADX INFO: renamed from: a */
    public static final iy5 f40885a;

    static {
        int i = dhb.f35664a;
        f40885a = new iy5(6);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m12689a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
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
    /* JADX INFO: renamed from: b */
    public static void m12690b(Object obj, Object obj2) {
        whb whbVar = (whb) obj;
        ojb ojbVar = whbVar.zzc;
        ojb ojbVar2 = ((whb) obj2).zzc;
        ojb ojbVar3 = ojb.f54469f;
        if (!ojbVar3.equals(ojbVar2)) {
            if (ojbVar3.equals(ojbVar)) {
                int i = ojbVar.f54470a + ojbVar2.f54470a;
                int[] iArrCopyOf = Arrays.copyOf(ojbVar.f54471b, i);
                System.arraycopy(ojbVar2.f54471b, 0, iArrCopyOf, ojbVar.f54470a, ojbVar2.f54470a);
                Object[] objArrCopyOf = Arrays.copyOf(ojbVar.f54472c, i);
                System.arraycopy(ojbVar2.f54472c, 0, objArrCopyOf, ojbVar.f54470a, ojbVar2.f54470a);
                ojbVar = new ojb(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                ojbVar.getClass();
                if (!ojbVar2.equals(ojbVar3)) {
                    if (!ojbVar.f54474e) {
                        ij6.m13946b();
                        return;
                    }
                    int i2 = ojbVar.f54470a + ojbVar2.f54470a;
                    ojbVar.m18052e(i2);
                    System.arraycopy(ojbVar2.f54471b, 0, ojbVar.f54471b, ojbVar.f54470a, ojbVar2.f54470a);
                    System.arraycopy(ojbVar2.f54472c, 0, ojbVar.f54472c, ojbVar.f54470a, ojbVar2.f54470a);
                    ojbVar.f54470a = i2;
                }
            }
        }
        whbVar.zzc = ojbVar;
    }

    /* JADX INFO: renamed from: c */
    public static Object m12691c(Object obj, int i, mib mibVar, zhb zhbVar, Object obj2, iy5 iy5Var) {
        if (zhbVar == null) {
            return obj2;
        }
        if (mibVar == null) {
            Iterator it = mibVar.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zhbVar.mo22576a(iIntValue)) {
                    if (obj2 == null) {
                        iy5Var.getClass();
                        obj2 = iy5.m14201t(obj);
                    }
                    iy5Var.getClass();
                    ((ojb) obj2).m18051d(i << 3, Long.valueOf(iIntValue));
                    it.remove();
                }
            }
            return obj2;
        }
        int size = mibVar.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) mibVar.get(i3);
            int iIntValue2 = num.intValue();
            if (zhbVar.mo22576a(iIntValue2)) {
                if (i3 != i2) {
                    mibVar.set(i2, num);
                }
                i2++;
            } else {
                if (obj2 == null) {
                    iy5Var.getClass();
                    obj2 = iy5.m14201t(obj);
                }
                iy5Var.getClass();
                ((ojb) obj2).m18051d(i << 3, Long.valueOf(iIntValue2));
            }
        }
        if (i2 != size) {
            mibVar.subList(i2, size).clear();
        }
        return obj2;
    }

    /* JADX INFO: renamed from: d */
    public static void m12692d(int i, List list, gw9 gw9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nhb nhbVar = (nhb) gw9Var.f41432b;
        if (list instanceof ohb) {
            e65.m10884p(list);
            if (!z) {
                throw null;
            }
            nhbVar.mo13256d(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nhbVar.mo13261i(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        nhbVar.mo13256d(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        nhbVar.mo13270r(i3);
        while (i2 < list.size()) {
            nhbVar.mo13273u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m12693e(int i, List list, gw9 gw9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nhb nhbVar = (nhb) gw9Var.f41432b;
        if (list instanceof shb) {
            e65.m10884p(list);
            if (!z) {
                throw null;
            }
            nhbVar.mo13256d(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nhbVar.mo13259g(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        nhbVar.mo13256d(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        nhbVar.mo13270r(i3);
        while (i2 < list.size()) {
            nhbVar.mo13271s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m12694f(int i, List list, gw9 gw9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nhb nhbVar = (nhb) gw9Var.f41432b;
        int i2 = 0;
        if (!(list instanceof pib)) {
            if (!z) {
                while (i2 < list.size()) {
                    nhbVar.mo13260h(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            nhbVar.mo13256d(i, 2);
            int iM17435b = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM17435b += nhb.m17435b(((Long) list.get(i3)).longValue());
            }
            nhbVar.mo13270r(iM17435b);
            while (i2 < list.size()) {
                nhbVar.mo13272t(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        pib pibVar = (pib) list;
        if (!z) {
            while (i2 < pibVar.size()) {
                nhbVar.mo13260h(i, pibVar.m19182f(i2));
                i2++;
            }
            return;
        }
        nhbVar.mo13256d(i, 2);
        int iM17435b2 = 0;
        for (int i4 = 0; i4 < pibVar.size(); i4++) {
            iM17435b2 += nhb.m17435b(pibVar.m19182f(i4));
        }
        nhbVar.mo13270r(iM17435b2);
        while (i2 < pibVar.size()) {
            nhbVar.mo13272t(pibVar.m19182f(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m12695g(int i, List list, gw9 gw9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nhb nhbVar = (nhb) gw9Var.f41432b;
        int i2 = 0;
        if (!(list instanceof pib)) {
            if (!z) {
                while (i2 < list.size()) {
                    nhbVar.mo13260h(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            nhbVar.mo13256d(i, 2);
            int iM17435b = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM17435b += nhb.m17435b(((Long) list.get(i3)).longValue());
            }
            nhbVar.mo13270r(iM17435b);
            while (i2 < list.size()) {
                nhbVar.mo13272t(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        pib pibVar = (pib) list;
        if (!z) {
            while (i2 < pibVar.size()) {
                nhbVar.mo13260h(i, pibVar.m19182f(i2));
                i2++;
            }
            return;
        }
        nhbVar.mo13256d(i, 2);
        int iM17435b2 = 0;
        for (int i4 = 0; i4 < pibVar.size(); i4++) {
            iM17435b2 += nhb.m17435b(pibVar.m19182f(i4));
        }
        nhbVar.mo13270r(iM17435b2);
        while (i2 < pibVar.size()) {
            nhbVar.mo13272t(pibVar.m19182f(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m12696h(int i, List list, gw9 gw9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nhb nhbVar = (nhb) gw9Var.f41432b;
        int i2 = 0;
        if (!(list instanceof pib)) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    nhbVar.mo13260h(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            nhbVar.mo13256d(i, 2);
            int iM17435b = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iM17435b += nhb.m17435b((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            nhbVar.mo13270r(iM17435b);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                nhbVar.mo13272t((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        pib pibVar = (pib) list;
        if (!z) {
            while (i2 < pibVar.size()) {
                long jM19182f = pibVar.m19182f(i2);
                nhbVar.mo13260h(i, (jM19182f >> 63) ^ (jM19182f + jM19182f));
                i2++;
            }
            return;
        }
        nhbVar.mo13256d(i, 2);
        int iM17435b2 = 0;
        for (int i4 = 0; i4 < pibVar.size(); i4++) {
            long jM19182f2 = pibVar.m19182f(i4);
            iM17435b2 += nhb.m17435b((jM19182f2 >> 63) ^ (jM19182f2 + jM19182f2));
        }
        nhbVar.mo13270r(iM17435b2);
        while (i2 < pibVar.size()) {
            long jM19182f3 = pibVar.m19182f(i2);
            nhbVar.mo13272t((jM19182f3 >> 63) ^ (jM19182f3 + jM19182f3));
            i2++;
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m12697i(int i, List list, gw9 gw9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nhb nhbVar = (nhb) gw9Var.f41432b;
        int i2 = 0;
        if (!(list instanceof pib)) {
            if (!z) {
                while (i2 < list.size()) {
                    nhbVar.mo13261i(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            nhbVar.mo13256d(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            nhbVar.mo13270r(i3);
            while (i2 < list.size()) {
                nhbVar.mo13273u(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        pib pibVar = (pib) list;
        if (!z) {
            while (i2 < pibVar.size()) {
                nhbVar.mo13261i(i, pibVar.m19182f(i2));
                i2++;
            }
            return;
        }
        nhbVar.mo13256d(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < pibVar.size(); i6++) {
            pibVar.m19182f(i6);
            i5 += 8;
        }
        nhbVar.mo13270r(i5);
        while (i2 < pibVar.size()) {
            nhbVar.mo13273u(pibVar.m19182f(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m12698j(int i, List list, gw9 gw9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nhb nhbVar = (nhb) gw9Var.f41432b;
        int i2 = 0;
        if (!(list instanceof pib)) {
            if (!z) {
                while (i2 < list.size()) {
                    nhbVar.mo13261i(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            nhbVar.mo13256d(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            nhbVar.mo13270r(i3);
            while (i2 < list.size()) {
                nhbVar.mo13273u(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        pib pibVar = (pib) list;
        if (!z) {
            while (i2 < pibVar.size()) {
                nhbVar.mo13261i(i, pibVar.m19182f(i2));
                i2++;
            }
            return;
        }
        nhbVar.mo13256d(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < pibVar.size(); i6++) {
            pibVar.m19182f(i6);
            i5 += 8;
        }
        nhbVar.mo13270r(i5);
        while (i2 < pibVar.size()) {
            nhbVar.mo13273u(pibVar.m19182f(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m12699k(int i, List list, gw9 gw9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nhb nhbVar = (nhb) gw9Var.f41432b;
        int i2 = 0;
        if (!(list instanceof xhb)) {
            if (!z) {
                while (i2 < list.size()) {
                    nhbVar.mo13257e(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            nhbVar.mo13256d(i, 2);
            int iM17435b = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM17435b += nhb.m17435b(((Integer) list.get(i3)).intValue());
            }
            nhbVar.mo13270r(iM17435b);
            while (i2 < list.size()) {
                nhbVar.mo13269q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        xhb xhbVar = (xhb) list;
        if (!z) {
            while (i2 < xhbVar.f68227c) {
                nhbVar.mo13257e(i, xhbVar.m24522g(i2));
                i2++;
            }
            return;
        }
        nhbVar.mo13256d(i, 2);
        int iM17435b2 = 0;
        for (int i4 = 0; i4 < xhbVar.f68227c; i4++) {
            iM17435b2 += nhb.m17435b(xhbVar.m24522g(i4));
        }
        nhbVar.mo13270r(iM17435b2);
        while (i2 < xhbVar.f68227c) {
            nhbVar.mo13269q(xhbVar.m24522g(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m12700l(int i, List list, gw9 gw9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nhb nhbVar = (nhb) gw9Var.f41432b;
        int i2 = 0;
        if (!(list instanceof xhb)) {
            if (!z) {
                while (i2 < list.size()) {
                    nhbVar.mo13258f(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            nhbVar.mo13256d(i, 2);
            int iM17434a = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM17434a += nhb.m17434a(((Integer) list.get(i3)).intValue());
            }
            nhbVar.mo13270r(iM17434a);
            while (i2 < list.size()) {
                nhbVar.mo13270r(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        xhb xhbVar = (xhb) list;
        if (!z) {
            while (i2 < xhbVar.f68227c) {
                nhbVar.mo13258f(i, xhbVar.m24522g(i2));
                i2++;
            }
            return;
        }
        nhbVar.mo13256d(i, 2);
        int iM17434a2 = 0;
        for (int i4 = 0; i4 < xhbVar.f68227c; i4++) {
            iM17434a2 += nhb.m17434a(xhbVar.m24522g(i4));
        }
        nhbVar.mo13270r(iM17434a2);
        while (i2 < xhbVar.f68227c) {
            nhbVar.mo13270r(xhbVar.m24522g(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m12701m(int i, List list, gw9 gw9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nhb nhbVar = (nhb) gw9Var.f41432b;
        int i2 = 0;
        if (!(list instanceof xhb)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    nhbVar.mo13258f(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            nhbVar.mo13256d(i, 2);
            int iM17434a = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iM17434a += nhb.m17434a((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            nhbVar.mo13270r(iM17434a);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                nhbVar.mo13270r((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        xhb xhbVar = (xhb) list;
        if (!z) {
            while (i2 < xhbVar.f68227c) {
                int iM24522g = xhbVar.m24522g(i2);
                nhbVar.mo13258f(i, (iM24522g >> 31) ^ (iM24522g + iM24522g));
                i2++;
            }
            return;
        }
        nhbVar.mo13256d(i, 2);
        int iM17434a2 = 0;
        for (int i4 = 0; i4 < xhbVar.f68227c; i4++) {
            int iM24522g2 = xhbVar.m24522g(i4);
            iM17434a2 += nhb.m17434a((iM24522g2 >> 31) ^ (iM24522g2 + iM24522g2));
        }
        nhbVar.mo13270r(iM17434a2);
        while (i2 < xhbVar.f68227c) {
            int iM24522g3 = xhbVar.m24522g(i2);
            nhbVar.mo13270r((iM24522g3 >> 31) ^ (iM24522g3 + iM24522g3));
            i2++;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m12702n(int i, List list, gw9 gw9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nhb nhbVar = (nhb) gw9Var.f41432b;
        int i2 = 0;
        if (!(list instanceof xhb)) {
            if (!z) {
                while (i2 < list.size()) {
                    nhbVar.mo13259g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            nhbVar.mo13256d(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            nhbVar.mo13270r(i3);
            while (i2 < list.size()) {
                nhbVar.mo13271s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        xhb xhbVar = (xhb) list;
        if (!z) {
            while (i2 < xhbVar.f68227c) {
                nhbVar.mo13259g(i, xhbVar.m24522g(i2));
                i2++;
            }
            return;
        }
        nhbVar.mo13256d(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < xhbVar.f68227c; i6++) {
            xhbVar.m24522g(i6);
            i5 += 4;
        }
        nhbVar.mo13270r(i5);
        while (i2 < xhbVar.f68227c) {
            nhbVar.mo13271s(xhbVar.m24522g(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m12703o(int i, List list, gw9 gw9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nhb nhbVar = (nhb) gw9Var.f41432b;
        int i2 = 0;
        if (!(list instanceof xhb)) {
            if (!z) {
                while (i2 < list.size()) {
                    nhbVar.mo13259g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            nhbVar.mo13256d(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            nhbVar.mo13270r(i3);
            while (i2 < list.size()) {
                nhbVar.mo13271s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        xhb xhbVar = (xhb) list;
        if (!z) {
            while (i2 < xhbVar.f68227c) {
                nhbVar.mo13259g(i, xhbVar.m24522g(i2));
                i2++;
            }
            return;
        }
        nhbVar.mo13256d(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < xhbVar.f68227c; i6++) {
            xhbVar.m24522g(i6);
            i5 += 4;
        }
        nhbVar.mo13270r(i5);
        while (i2 < xhbVar.f68227c) {
            nhbVar.mo13271s(xhbVar.m24522g(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m12704p(int i, List list, gw9 gw9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nhb nhbVar = (nhb) gw9Var.f41432b;
        int i2 = 0;
        if (!(list instanceof xhb)) {
            if (!z) {
                while (i2 < list.size()) {
                    nhbVar.mo13257e(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            nhbVar.mo13256d(i, 2);
            int iM17435b = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM17435b += nhb.m17435b(((Integer) list.get(i3)).intValue());
            }
            nhbVar.mo13270r(iM17435b);
            while (i2 < list.size()) {
                nhbVar.mo13269q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        xhb xhbVar = (xhb) list;
        if (!z) {
            while (i2 < xhbVar.f68227c) {
                nhbVar.mo13257e(i, xhbVar.m24522g(i2));
                i2++;
            }
            return;
        }
        nhbVar.mo13256d(i, 2);
        int iM17435b2 = 0;
        for (int i4 = 0; i4 < xhbVar.f68227c; i4++) {
            iM17435b2 += nhb.m17435b(xhbVar.m24522g(i4));
        }
        nhbVar.mo13270r(iM17435b2);
        while (i2 < xhbVar.f68227c) {
            nhbVar.mo13269q(xhbVar.m24522g(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m12705q(int i, List list, gw9 gw9Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nhb nhbVar = (nhb) gw9Var.f41432b;
        if (list instanceof fhb) {
            e65.m10884p(list);
            if (!z) {
                throw null;
            }
            nhbVar.mo13256d(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nhbVar.mo13262j(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        nhbVar.mo13256d(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        nhbVar.mo13270r(i3);
        while (i2 < list.size()) {
            nhbVar.mo13268p(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    /* JADX INFO: renamed from: r */
    public static int m12706r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof pib)) {
            int iM17435b = 0;
            while (i < size) {
                iM17435b += nhb.m17435b(((Long) list.get(i)).longValue());
                i++;
            }
            return iM17435b;
        }
        pib pibVar = (pib) list;
        int iM17435b2 = 0;
        while (i < size) {
            iM17435b2 += nhb.m17435b(pibVar.m19182f(i));
            i++;
        }
        return iM17435b2;
    }

    /* JADX INFO: renamed from: s */
    public static int m12707s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof pib)) {
            int iM17435b = 0;
            while (i < size) {
                iM17435b += nhb.m17435b(((Long) list.get(i)).longValue());
                i++;
            }
            return iM17435b;
        }
        pib pibVar = (pib) list;
        int iM17435b2 = 0;
        while (i < size) {
            iM17435b2 += nhb.m17435b(pibVar.m19182f(i));
            i++;
        }
        return iM17435b2;
    }

    /* JADX INFO: renamed from: t */
    public static int m12708t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof pib)) {
            int iM17435b = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iM17435b += nhb.m17435b((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iM17435b;
        }
        pib pibVar = (pib) list;
        int iM17435b2 = 0;
        while (i < size) {
            long jM19182f = pibVar.m19182f(i);
            iM17435b2 += nhb.m17435b((jM19182f >> 63) ^ (jM19182f + jM19182f));
            i++;
        }
        return iM17435b2;
    }

    /* JADX INFO: renamed from: u */
    public static int m12709u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof xhb)) {
            int iM17435b = 0;
            while (i < size) {
                iM17435b += nhb.m17435b(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM17435b;
        }
        xhb xhbVar = (xhb) list;
        int iM17435b2 = 0;
        while (i < size) {
            iM17435b2 += nhb.m17435b(xhbVar.m24522g(i));
            i++;
        }
        return iM17435b2;
    }

    /* JADX INFO: renamed from: v */
    public static int m12710v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof xhb)) {
            int iM17435b = 0;
            while (i < size) {
                iM17435b += nhb.m17435b(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM17435b;
        }
        xhb xhbVar = (xhb) list;
        int iM17435b2 = 0;
        while (i < size) {
            iM17435b2 += nhb.m17435b(xhbVar.m24522g(i));
            i++;
        }
        return iM17435b2;
    }

    /* JADX INFO: renamed from: w */
    public static int m12711w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof xhb)) {
            int iM17434a = 0;
            while (i < size) {
                iM17434a += nhb.m17434a(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM17434a;
        }
        xhb xhbVar = (xhb) list;
        int iM17434a2 = 0;
        while (i < size) {
            iM17434a2 += nhb.m17434a(xhbVar.m24522g(i));
            i++;
        }
        return iM17434a2;
    }

    /* JADX INFO: renamed from: x */
    public static int m12712x(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof xhb)) {
            int iM17434a = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iM17434a += nhb.m17434a((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iM17434a;
        }
        xhb xhbVar = (xhb) list;
        int iM17434a2 = 0;
        while (i < size) {
            int iM24522g = xhbVar.m24522g(i);
            iM17434a2 += nhb.m17434a((iM24522g >> 31) ^ (iM24522g + iM24522g));
            i++;
        }
        return iM17434a2;
    }

    /* JADX INFO: renamed from: y */
    public static int m12713y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (nhb.m17434a(i << 3) + 4) * size;
    }

    /* JADX INFO: renamed from: z */
    public static int m12714z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (nhb.m17434a(i << 3) + 8) * size;
    }
}
