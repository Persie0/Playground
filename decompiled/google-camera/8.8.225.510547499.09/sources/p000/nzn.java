package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nzn {

    /* JADX INFO: renamed from: a */
    public static final Class f45081a;

    /* JADX INFO: renamed from: b */
    public static final lij f45082b;

    /* JADX INFO: renamed from: c */
    public static final lij f45083c;

    /* JADX INFO: renamed from: d */
    public static final lij f45084d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable th) {
            cls = null;
        }
        f45081a = cls;
        f45082b = m18290W(false);
        f45083c = m18290W(true);
        f45084d = new lij((char[]) null);
    }

    /* JADX INFO: renamed from: A */
    static void m18268A(Object obj, Object obj2) {
        nxh nxhVarM17734t = ntw.m17734t(obj2);
        if (nxhVarM17734t.m18026h()) {
            return;
        }
        nxh nxhVarM17735u = ntw.m17735u(obj);
        for (int i = 0; i < nxhVarM17734t.f44911b.m18322a(); i++) {
            nxhVarM17735u.m18025f(nxhVarM17734t.f44911b.m18326f(i));
        }
        Iterator it = nxhVarM17734t.f44911b.m18323c().iterator();
        while (it.hasNext()) {
            nxhVarM17735u.m18025f((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: B */
    static void m18269B(Object obj, Object obj2) {
        nzy nzyVarM15423af = lij.m15423af(obj);
        nzy nzyVarM15423af2 = lij.m15423af(obj2);
        if (!nzy.f45105a.equals(nzyVarM15423af2)) {
            if (nzy.f45105a.equals(nzyVarM15423af)) {
                int i = nzyVarM15423af.f45106b + nzyVarM15423af2.f45106b;
                int[] iArrCopyOf = Arrays.copyOf(nzyVarM15423af.f45107c, i);
                System.arraycopy(nzyVarM15423af2.f45107c, 0, iArrCopyOf, nzyVarM15423af.f45106b, nzyVarM15423af2.f45106b);
                Object[] objArrCopyOf = Arrays.copyOf(nzyVarM15423af.f45108d, i);
                System.arraycopy(nzyVarM15423af2.f45108d, 0, objArrCopyOf, nzyVarM15423af.f45106b, nzyVarM15423af2.f45106b);
                nzyVarM15423af = new nzy(i, iArrCopyOf, objArrCopyOf, true);
            } else if (!nzyVarM15423af2.equals(nzy.f45105a)) {
                nzyVarM15423af.m18331c();
                int i2 = nzyVarM15423af.f45106b + nzyVarM15423af2.f45106b;
                nzyVarM15423af.m18332d(i2);
                System.arraycopy(nzyVarM15423af2.f45107c, 0, nzyVarM15423af.f45107c, nzyVarM15423af.f45106b, nzyVarM15423af2.f45106b);
                System.arraycopy(nzyVarM15423af2.f45108d, 0, nzyVarM15423af.f45108d, nzyVarM15423af.f45106b, nzyVarM15423af2.f45106b);
                nzyVarM15423af.f45106b = i2;
            }
        }
        lij.m15424ag(obj, nzyVarM15423af);
    }

    /* JADX INFO: renamed from: C */
    static Object m18270C(Object obj, int i, int i2, Object obj2) {
        if (obj2 == null) {
            obj2 = lij.m15425ah(obj);
        }
        lij.m15422ae(obj2, i, i2);
        return obj2;
    }

    /* JADX INFO: renamed from: D */
    public static void m18271D(int i, List list, liv livVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ((nxb) livVar.f38339a).mo17945l(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        ((nxb) livVar.f38339a).mo17929A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).booleanValue();
            i3++;
        }
        ((nxb) livVar.f38339a).mo17931C(i3);
        while (i2 < list.size()) {
            ((nxb) livVar.f38339a).mo17943j(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m18272E(int i, List list, liv livVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((nxb) livVar.f38339a).mo17946m(i, (nwr) list.get(i2));
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m18273F(int i, List list, liv livVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ((nxb) livVar.f38339a).m17999ak(i, ((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        ((nxb) livVar.f38339a).mo17929A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).doubleValue();
            i3 += 8;
        }
        ((nxb) livVar.f38339a).mo17931C(i3);
        while (i2 < list.size()) {
            ((nxb) livVar.f38339a).m18000al(((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m18274G(int i, List list, liv livVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ((nxb) livVar.f38339a).mo17952s(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ((nxb) livVar.f38339a).mo17929A(i, 2);
        int iM17967L = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM17967L += nxb.m17967L(((Integer) list.get(i3)).intValue());
        }
        ((nxb) livVar.f38339a).mo17931C(iM17967L);
        while (i2 < list.size()) {
            ((nxb) livVar.f38339a).mo17953t(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m18275H(int i, List list, liv livVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ((nxb) livVar.f38339a).mo17948o(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ((nxb) livVar.f38339a).mo17929A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        ((nxb) livVar.f38339a).mo17931C(i3);
        while (i2 < list.size()) {
            ((nxb) livVar.f38339a).mo17949p(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m18276I(int i, List list, liv livVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ((nxb) livVar.f38339a).mo17950q(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ((nxb) livVar.f38339a).mo17929A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        ((nxb) livVar.f38339a).mo17931C(i3);
        while (i2 < list.size()) {
            ((nxb) livVar.f38339a).mo17951r(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m18277J(int i, List list, liv livVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ((nxb) livVar.f38339a).m18001am(i, ((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        ((nxb) livVar.f38339a).mo17929A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).floatValue();
            i3 += 4;
        }
        ((nxb) livVar.f38339a).mo17931C(i3);
        while (i2 < list.size()) {
            ((nxb) livVar.f38339a).m18002an(((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: K */
    public static void m18278K(int i, List list, liv livVar, nzm nzmVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            livVar.m15494q(i, list.get(i2), nzmVar);
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m18279L(int i, List list, liv livVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ((nxb) livVar.f38339a).mo17952s(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ((nxb) livVar.f38339a).mo17929A(i, 2);
        int iM17967L = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM17967L += nxb.m17967L(((Integer) list.get(i3)).intValue());
        }
        ((nxb) livVar.f38339a).mo17931C(iM17967L);
        while (i2 < list.size()) {
            ((nxb) livVar.f38339a).mo17953t(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m18280M(int i, List list, liv livVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ((nxb) livVar.f38339a).mo17932D(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ((nxb) livVar.f38339a).mo17929A(i, 2);
        int iM17985ad = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM17985ad += nxb.m17985ad(((Long) list.get(i3)).longValue());
        }
        ((nxb) livVar.f38339a).mo17931C(iM17985ad);
        while (i2 < list.size()) {
            ((nxb) livVar.f38339a).mo17933E(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m18281N(int i, List list, liv livVar, nzm nzmVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            livVar.m15497t(i, list.get(i2), nzmVar);
        }
    }

    /* JADX INFO: renamed from: O */
    public static void m18282O(int i, List list, liv livVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ((nxb) livVar.f38339a).mo17948o(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ((nxb) livVar.f38339a).mo17929A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        ((nxb) livVar.f38339a).mo17931C(i3);
        while (i2 < list.size()) {
            ((nxb) livVar.f38339a).mo17949p(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: P */
    public static void m18283P(int i, List list, liv livVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ((nxb) livVar.f38339a).mo17950q(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ((nxb) livVar.f38339a).mo17929A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        ((nxb) livVar.f38339a).mo17931C(i3);
        while (i2 < list.size()) {
            ((nxb) livVar.f38339a).mo17951r(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: Q */
    public static void m18284Q(int i, List list, liv livVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ((nxb) livVar.f38339a).m18004ap(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ((nxb) livVar.f38339a).mo17929A(i, 2);
        int iM17976U = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM17976U += nxb.m17976U(((Integer) list.get(i3)).intValue());
        }
        ((nxb) livVar.f38339a).mo17931C(iM17976U);
        while (i2 < list.size()) {
            ((nxb) livVar.f38339a).m18005aq(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: R */
    public static void m18285R(int i, List list, liv livVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ((nxb) livVar.f38339a).m18006ar(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ((nxb) livVar.f38339a).mo17929A(i, 2);
        int iM17978W = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM17978W += nxb.m17978W(((Long) list.get(i3)).longValue());
        }
        ((nxb) livVar.f38339a).mo17931C(iM17978W);
        while (i2 < list.size()) {
            ((nxb) livVar.f38339a).m18007as(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: S */
    public static void m18286S(int i, List list, liv livVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof nyj)) {
            while (i2 < list.size()) {
                ((nxb) livVar.f38339a).mo17958y(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        nyj nyjVar = (nyj) list;
        while (i2 < list.size()) {
            Object objMo18175f = nyjVar.mo18175f(i2);
            if (objMo18175f instanceof String) {
                ((nxb) livVar.f38339a).mo17958y(i, (String) objMo18175f);
            } else {
                ((nxb) livVar.f38339a).mo17946m(i, (nwr) objMo18175f);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: T */
    public static void m18287T(int i, List list, liv livVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ((nxb) livVar.f38339a).mo17930B(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ((nxb) livVar.f38339a).mo17929A(i, 2);
        int iM17983ab = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM17983ab += nxb.m17983ab(((Integer) list.get(i3)).intValue());
        }
        ((nxb) livVar.f38339a).mo17931C(iM17983ab);
        while (i2 < list.size()) {
            ((nxb) livVar.f38339a).mo17931C(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: U */
    public static void m18288U(int i, List list, liv livVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ((nxb) livVar.f38339a).mo17932D(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ((nxb) livVar.f38339a).mo17929A(i, 2);
        int iM17985ad = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM17985ad += nxb.m17985ad(((Long) list.get(i3)).longValue());
        }
        ((nxb) livVar.f38339a).mo17931C(iM17985ad);
        while (i2 < list.size()) {
            ((nxb) livVar.f38339a).mo17933E(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: V */
    static Object m18289V(Object obj, int i, List list, nxu nxuVar, Object obj2, lij lijVar) {
        if (nxuVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int iIntValue = ((Integer) list.get(i3)).intValue();
                if (nxuVar.mo11803a(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(iIntValue));
                    }
                    i2++;
                } else {
                    obj2 = m18270C(obj, i, iIntValue, obj2);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!nxuVar.mo11803a(iIntValue2)) {
                    obj2 = m18270C(obj, i, iIntValue2, obj2);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: W */
    private static lij m18290W(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable th) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (lij) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable th2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    static int m18291a(List list) {
        return list.size();
    }

    /* JADX INFO: renamed from: b */
    static int m18292b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM17981Z = size * nxb.m17981Z(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            iM17981Z += nxb.m17963H((nwr) list.get(i2));
        }
        return iM17981Z;
    }

    /* JADX INFO: renamed from: c */
    static int m18293c(List list) {
        int iM17967L;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof nxr) {
            nxr nxrVar = (nxr) list;
            iM17967L = 0;
            while (i < size) {
                iM17967L += nxb.m17967L(nxrVar.mo18146d(i));
                i++;
            }
        } else {
            iM17967L = 0;
            while (i < size) {
                iM17967L += nxb.m17967L(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iM17967L;
    }

    /* JADX INFO: renamed from: d */
    static int m18294d(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: renamed from: e */
    static int m18295e(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: renamed from: f */
    static int m18296f(int i, List list, nzm nzmVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM17965J = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM17965J += nxb.m17965J(i, (nyw) list.get(i2), nzmVar);
        }
        return iM17965J;
    }

    /* JADX INFO: renamed from: g */
    static int m18297g(List list) {
        int iM17967L;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof nxr) {
            nxr nxrVar = (nxr) list;
            iM17967L = 0;
            while (i < size) {
                iM17967L += nxb.m17967L(nxrVar.mo18146d(i));
                i++;
            }
        } else {
            iM17967L = 0;
            while (i < size) {
                iM17967L += nxb.m17967L(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iM17967L;
    }

    /* JADX INFO: renamed from: h */
    static int m18298h(List list) {
        int iM17985ad;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof nyn) {
            nyn nynVar = (nyn) list;
            iM17985ad = 0;
            while (i < size) {
                iM17985ad += nxb.m17985ad(nynVar.mo18149a(i));
                i++;
            }
        } else {
            iM17985ad = 0;
            while (i < size) {
                iM17985ad += nxb.m17985ad(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iM17985ad;
    }

    /* JADX INFO: renamed from: i */
    static int m18299i(int i, Object obj, nzm nzmVar) {
        return obj instanceof nyh ? nxb.m17969N(i, (nyh) obj) : nxb.m17981Z(i) + nxb.m17973R((nyw) obj, nzmVar);
    }

    /* JADX INFO: renamed from: j */
    static int m18300j(int i, List list, nzm nzmVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM17981Z = nxb.m17981Z(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            iM17981Z += obj instanceof nyh ? nxb.m17970O((nyh) obj) : nxb.m17973R((nyw) obj, nzmVar);
        }
        return iM17981Z;
    }

    /* JADX INFO: renamed from: k */
    static int m18301k(List list) {
        int iM17976U;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof nxr) {
            nxr nxrVar = (nxr) list;
            iM17976U = 0;
            while (i < size) {
                iM17976U += nxb.m17976U(nxrVar.mo18146d(i));
                i++;
            }
        } else {
            iM17976U = 0;
            while (i < size) {
                iM17976U += nxb.m17976U(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iM17976U;
    }

    /* JADX INFO: renamed from: l */
    static int m18302l(List list) {
        int iM17978W;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof nyn) {
            nyn nynVar = (nyn) list;
            iM17978W = 0;
            while (i < size) {
                iM17978W += nxb.m17978W(nynVar.mo18149a(i));
                i++;
            }
        } else {
            iM17978W = 0;
            while (i < size) {
                iM17978W += nxb.m17978W(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iM17978W;
    }

    /* JADX INFO: renamed from: m */
    static int m18303m(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        boolean z = list instanceof nyj;
        int iM17981Z = nxb.m17981Z(i) * size;
        if (z) {
            nyj nyjVar = (nyj) list;
            while (i2 < size) {
                Object objMo18175f = nyjVar.mo18175f(i2);
                iM17981Z += objMo18175f instanceof nwr ? nxb.m17963H((nwr) objMo18175f) : nxb.m17980Y((String) objMo18175f);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                iM17981Z += obj instanceof nwr ? nxb.m17963H((nwr) obj) : nxb.m17980Y((String) obj);
                i2++;
            }
        }
        return iM17981Z;
    }

    /* JADX INFO: renamed from: n */
    static int m18304n(List list) {
        int iM17983ab;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof nxr) {
            nxr nxrVar = (nxr) list;
            iM17983ab = 0;
            while (i < size) {
                iM17983ab += nxb.m17983ab(nxrVar.mo18146d(i));
                i++;
            }
        } else {
            iM17983ab = 0;
            while (i < size) {
                iM17983ab += nxb.m17983ab(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iM17983ab;
    }

    /* JADX INFO: renamed from: o */
    static int m18305o(List list) {
        int iM17985ad;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof nyn) {
            nyn nynVar = (nyn) list;
            iM17985ad = 0;
            while (i < size) {
                iM17985ad += nxb.m17985ad(nynVar.mo18149a(i));
                i++;
            }
        } else {
            iM17985ad = 0;
            while (i < size) {
                iM17985ad += nxb.m17985ad(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iM17985ad;
    }

    /* JADX INFO: renamed from: p */
    static boolean m18306p(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    static int m18307q(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * nxb.m17990at(i);
    }

    /* JADX INFO: renamed from: r */
    static int m18308r(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m18293c(list) + (size * nxb.m17981Z(i));
    }

    /* JADX INFO: renamed from: s */
    static int m18309s(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * nxb.m17992av(i);
    }

    /* JADX INFO: renamed from: t */
    static int m18310t(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * nxb.m17993aw(i);
    }

    /* JADX INFO: renamed from: u */
    static int m18311u(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m18297g(list) + (size * nxb.m17981Z(i));
    }

    /* JADX INFO: renamed from: v */
    static int m18312v(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return m18298h(list) + (list.size() * nxb.m17981Z(i));
    }

    /* JADX INFO: renamed from: w */
    static int m18313w(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m18301k(list) + (size * nxb.m17981Z(i));
    }

    /* JADX INFO: renamed from: x */
    static int m18314x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m18302l(list) + (size * nxb.m17981Z(i));
    }

    /* JADX INFO: renamed from: y */
    static int m18315y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m18304n(list) + (size * nxb.m17981Z(i));
    }

    /* JADX INFO: renamed from: z */
    static int m18316z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m18305o(list) + (size * nxb.m17981Z(i));
    }
}
