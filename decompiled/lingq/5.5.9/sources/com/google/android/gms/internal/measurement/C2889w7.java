package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2889w7 {

    /* JADX INFO: renamed from: a */
    public static final Class f14495a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC2675g8 f14496b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC2675g8 f14497c;

    /* JADX INFO: renamed from: d */
    public static final C2703i8 f14498d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f14495a = cls;
        f14496b = m8375u(false);
        f14497c = m8375u(true);
        f14498d = new C2703i8();
    }

    /* JADX INFO: renamed from: A */
    public static int m8336A(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: renamed from: B */
    public static int m8337B(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC2887w5.m8334N1(i10 << 3) + 8) * size;
    }

    /* JADX INFO: renamed from: C */
    public static int m8338C(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: renamed from: D */
    public static int m8339D(int i10, List list, InterfaceC2876v7 interfaceC2876v7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM8331K1 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iM8331K1 += AbstractC2887w5.m8331K1(i10, (InterfaceC2730k7) list.get(i11), interfaceC2876v7);
        }
        return iM8331K1;
    }

    /* JADX INFO: renamed from: E */
    public static int m8340E(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC2887w5.m8334N1(i10 << 3) * size) + m8341F(list);
    }

    /* JADX INFO: renamed from: F */
    public static int m8341F(List list) {
        int iM8332L1;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2784o6) {
            C2784o6 c2784o6 = (C2784o6) list;
            iM8332L1 = 0;
            while (i10 < size) {
                c2784o6.m8148g(i10);
                iM8332L1 += AbstractC2887w5.m8332L1(c2784o6.f14364b[i10]);
                i10++;
            }
        } else {
            iM8332L1 = 0;
            while (i10 < size) {
                iM8332L1 += AbstractC2887w5.m8332L1(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iM8332L1;
    }

    /* JADX INFO: renamed from: G */
    public static int m8342G(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (AbstractC2887w5.m8334N1(i10 << 3) * list.size()) + m8343H(list);
    }

    /* JADX INFO: renamed from: H */
    public static int m8343H(List list) {
        int iM8335O1;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2590a7) {
            C2590a7 c2590a7 = (C2590a7) list;
            iM8335O1 = 0;
            while (i10 < size) {
                c2590a7.m7644g(i10);
                iM8335O1 += AbstractC2887w5.m8335O1(c2590a7.f14052b[i10]);
                i10++;
            }
        } else {
            iM8335O1 = 0;
            while (i10 < size) {
                iM8335O1 += AbstractC2887w5.m8335O1(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iM8335O1;
    }

    /* JADX INFO: renamed from: I */
    public static int m8344I(int i10, InterfaceC2876v7 interfaceC2876v7, Object obj) {
        int iM8334N1;
        int iM8334N2;
        int iMo7920b;
        if (obj instanceof C2862u6) {
            C2862u6 c2862u6 = (C2862u6) obj;
            int i11 = i10 << 3;
            Logger logger = AbstractC2887w5.f14492Q;
            if (c2862u6.f14452b != null) {
                iMo7920b = ((zzjx) c2862u6.f14452b).f14562c.length;
            } else {
                iMo7920b = c2862u6.f14451a != null ? c2862u6.f14451a.mo7920b() : 0;
            }
            iM8334N1 = AbstractC2887w5.m8334N1(iMo7920b) + iMo7920b;
            iM8334N2 = AbstractC2887w5.m8334N1(i11);
        } else {
            Logger logger2 = AbstractC2887w5.f14492Q;
            int iMo8065a = ((AbstractC2756m5) ((InterfaceC2730k7) obj)).mo8065a(interfaceC2876v7);
            iM8334N1 = AbstractC2887w5.m8334N1(iMo8065a) + iMo8065a;
            iM8334N2 = AbstractC2887w5.m8334N1(i10 << 3);
        }
        return iM8334N2 + iM8334N1;
    }

    /* JADX INFO: renamed from: J */
    public static int m8345J(int i10, List list, InterfaceC2876v7 interfaceC2876v7) {
        int iMo8065a;
        int iM8334N1;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM8334N2 = AbstractC2887w5.m8334N1(i10 << 3) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof C2862u6) {
                C2862u6 c2862u6 = (C2862u6) obj;
                iMo8065a = c2862u6.f14452b != null ? ((zzjx) c2862u6.f14452b).f14562c.length : c2862u6.f14451a != null ? c2862u6.f14451a.mo7920b() : 0;
                iM8334N1 = AbstractC2887w5.m8334N1(iMo8065a);
            } else {
                iMo8065a = ((AbstractC2756m5) ((InterfaceC2730k7) obj)).mo8065a(interfaceC2876v7);
                iM8334N1 = AbstractC2887w5.m8334N1(iMo8065a);
            }
            iM8334N2 = iM8334N1 + iMo8065a + iM8334N2;
        }
        return iM8334N2;
    }

    /* JADX INFO: renamed from: K */
    public static int m8346K(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC2887w5.m8334N1(i10 << 3) * size) + m8347L(list);
    }

    /* JADX INFO: renamed from: L */
    public static int m8347L(List list) {
        int iM8334N1;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2784o6) {
            C2784o6 c2784o6 = (C2784o6) list;
            iM8334N1 = 0;
            while (i10 < size) {
                c2784o6.m8148g(i10);
                int i11 = c2784o6.f14364b[i10];
                iM8334N1 += AbstractC2887w5.m8334N1((i11 >> 31) ^ (i11 + i11));
                i10++;
            }
        } else {
            iM8334N1 = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iM8334N1 += AbstractC2887w5.m8334N1((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
        }
        return iM8334N1;
    }

    /* JADX INFO: renamed from: M */
    public static int m8348M(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC2887w5.m8334N1(i10 << 3) * size) + m8349N(list);
    }

    /* JADX INFO: renamed from: N */
    public static int m8349N(List list) {
        int iM8335O1;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2590a7) {
            C2590a7 c2590a7 = (C2590a7) list;
            iM8335O1 = 0;
            while (i10 < size) {
                c2590a7.m7644g(i10);
                long j10 = c2590a7.f14052b[i10];
                iM8335O1 += AbstractC2887w5.m8335O1((j10 >> 63) ^ (j10 + j10));
                i10++;
            }
        } else {
            iM8335O1 = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iM8335O1 += AbstractC2887w5.m8335O1((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
        }
        return iM8335O1;
    }

    /* JADX INFO: renamed from: O */
    public static int m8350O(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        Logger logger = AbstractC2887w5.f14492Q;
        boolean z10 = list instanceof InterfaceC2888w6;
        int iM8334N1 = AbstractC2887w5.m8334N1(i10 << 3) * size;
        if (z10) {
            InterfaceC2888w6 interfaceC2888w6 = (InterfaceC2888w6) list;
            while (i11 < size) {
                Object objMo8050I = interfaceC2888w6.mo8050I(i11);
                if (objMo8050I instanceof zzka) {
                    int iMo8492q = ((zzka) objMo8050I).mo8492q();
                    iM8334N1 = AbstractC2887w5.m8334N1(iMo8492q) + iMo8492q + iM8334N1;
                } else {
                    iM8334N1 = AbstractC2887w5.m8333M1((String) objMo8050I) + iM8334N1;
                }
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof zzka) {
                    int iMo8492q2 = ((zzka) obj).mo8492q();
                    iM8334N1 = AbstractC2887w5.m8334N1(iMo8492q2) + iMo8492q2 + iM8334N1;
                } else {
                    iM8334N1 = AbstractC2887w5.m8333M1((String) obj) + iM8334N1;
                }
                i11++;
            }
        }
        return iM8334N1;
    }

    /* JADX INFO: renamed from: P */
    public static int m8351P(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC2887w5.m8334N1(i10 << 3) * size) + m8352Q(list);
    }

    /* JADX INFO: renamed from: Q */
    public static int m8352Q(List list) {
        int iM8334N1;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2784o6) {
            C2784o6 c2784o6 = (C2784o6) list;
            iM8334N1 = 0;
            while (i10 < size) {
                c2784o6.m8148g(i10);
                iM8334N1 += AbstractC2887w5.m8334N1(c2784o6.f14364b[i10]);
                i10++;
            }
        } else {
            iM8334N1 = 0;
            while (i10 < size) {
                iM8334N1 += AbstractC2887w5.m8334N1(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iM8334N1;
    }

    /* JADX INFO: renamed from: R */
    public static int m8353R(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC2887w5.m8334N1(i10 << 3) * size) + m8354S(list);
    }

    /* JADX INFO: renamed from: S */
    public static int m8354S(List list) {
        int iM8335O1;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2590a7) {
            C2590a7 c2590a7 = (C2590a7) list;
            iM8335O1 = 0;
            while (i10 < size) {
                c2590a7.m7644g(i10);
                iM8335O1 += AbstractC2887w5.m8335O1(c2590a7.f14052b[i10]);
                i10++;
            }
        } else {
            iM8335O1 = 0;
            while (i10 < size) {
                iM8335O1 += AbstractC2887w5.m8335O1(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iM8335O1;
    }

    /* JADX INFO: renamed from: a */
    public static Object m8355a(Object obj, int i10, int i11, Object obj2, AbstractC2675g8 abstractC2675g8) {
        if (obj2 == null) {
            obj2 = abstractC2675g8.mo7853c(obj);
        }
        abstractC2675g8.mo7856f(i10, i11, obj2);
        return obj2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    public static void m8356b(int i10, List list, C2900x5 c2900x5, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC2887w5 abstractC2887w5 = c2900x5.f14506a;
            int i11 = 0;
            if (z10) {
                abstractC2887w5.mo8313F1(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Boolean) list.get(i13)).booleanValue();
                    i12++;
                }
                abstractC2887w5.mo8315H1(i12);
                while (i11 < list.size()) {
                    abstractC2887w5.mo8320v1(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                    i11++;
                }
            } else {
                while (i11 < list.size()) {
                    abstractC2887w5.mo8321w1(i10, ((Boolean) list.get(i11)).booleanValue());
                    i11++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m8357c(int i10, List list, C2900x5 c2900x5) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2900x5.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                c2900x5.f14506a.mo8322x1(i10, (zzka) list.get(i11));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m8358d(int i10, List list, C2900x5 c2900x5, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC2887w5 abstractC2887w5 = c2900x5.f14506a;
            int i11 = 0;
            if (z10) {
                abstractC2887w5.mo8313F1(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Double) list.get(i13)).doubleValue();
                    i12 += 8;
                }
                abstractC2887w5.mo8315H1(i12);
                while (i11 < list.size()) {
                    abstractC2887w5.mo8309B1(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
            } else {
                while (i11 < list.size()) {
                    abstractC2887w5.mo8308A1(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m8359e(int i10, List list, C2900x5 c2900x5, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC2887w5 abstractC2887w5 = c2900x5.f14506a;
            int i11 = 0;
            if (z10) {
                abstractC2887w5.mo8313F1(i10, 2);
                int iM8332L1 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    iM8332L1 += AbstractC2887w5.m8332L1(((Integer) list.get(i12)).intValue());
                }
                abstractC2887w5.mo8315H1(iM8332L1);
                while (i11 < list.size()) {
                    abstractC2887w5.mo8311D1(((Integer) list.get(i11)).intValue());
                    i11++;
                }
            } else {
                while (i11 < list.size()) {
                    abstractC2887w5.mo8310C1(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m8360f(int i10, List list, C2900x5 c2900x5, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC2887w5 abstractC2887w5 = c2900x5.f14506a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                abstractC2887w5.mo8323y1(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        abstractC2887w5.mo8313F1(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).intValue();
            i12 += 4;
        }
        abstractC2887w5.mo8315H1(i12);
        while (i11 < list.size()) {
            abstractC2887w5.mo8324z1(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m8361g(int i10, List list, C2900x5 c2900x5, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC2887w5 abstractC2887w5 = c2900x5.f14506a;
            int i11 = 0;
            if (z10) {
                abstractC2887w5.mo8313F1(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).longValue();
                    i12 += 8;
                }
                abstractC2887w5.mo8315H1(i12);
                while (i11 < list.size()) {
                    abstractC2887w5.mo8309B1(((Long) list.get(i11)).longValue());
                    i11++;
                }
            } else {
                while (i11 < list.size()) {
                    abstractC2887w5.mo8308A1(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m8362h(int i10, List list, C2900x5 c2900x5, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC2887w5 abstractC2887w5 = c2900x5.f14506a;
            int i11 = 0;
            if (z10) {
                abstractC2887w5.mo8313F1(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Float) list.get(i13)).floatValue();
                    i12 += 4;
                }
                abstractC2887w5.mo8315H1(i12);
                while (i11 < list.size()) {
                    abstractC2887w5.mo8324z1(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
            } else {
                while (i11 < list.size()) {
                    abstractC2887w5.mo8323y1(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m8363i(int i10, List list, C2900x5 c2900x5, InterfaceC2876v7 interfaceC2876v7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            c2900x5.m8423l(i10, interfaceC2876v7, list.get(i11));
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m8364j(int i10, List list, C2900x5 c2900x5, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC2887w5 abstractC2887w5 = c2900x5.f14506a;
            int i11 = 0;
            if (z10) {
                abstractC2887w5.mo8313F1(i10, 2);
                int iM8332L1 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    iM8332L1 += AbstractC2887w5.m8332L1(((Integer) list.get(i12)).intValue());
                }
                abstractC2887w5.mo8315H1(iM8332L1);
                while (i11 < list.size()) {
                    abstractC2887w5.mo8311D1(((Integer) list.get(i11)).intValue());
                    i11++;
                }
            } else {
                while (i11 < list.size()) {
                    abstractC2887w5.mo8310C1(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m8365k(int i10, List list, C2900x5 c2900x5, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC2887w5 abstractC2887w5 = c2900x5.f14506a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                abstractC2887w5.mo8316I1(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        abstractC2887w5.mo8313F1(i10, 2);
        int iM8335O1 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM8335O1 += AbstractC2887w5.m8335O1(((Long) list.get(i12)).longValue());
        }
        abstractC2887w5.mo8315H1(iM8335O1);
        while (i11 < list.size()) {
            abstractC2887w5.mo8317J1(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m8366l(int i10, List list, C2900x5 c2900x5, InterfaceC2876v7 interfaceC2876v7) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                c2900x5.m8426o(i10, interfaceC2876v7, list.get(i11));
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m8367m(int i10, List list, C2900x5 c2900x5, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC2887w5 abstractC2887w5 = c2900x5.f14506a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                abstractC2887w5.mo8323y1(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        abstractC2887w5.mo8313F1(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).intValue();
            i12 += 4;
        }
        abstractC2887w5.mo8315H1(i12);
        while (i11 < list.size()) {
            abstractC2887w5.mo8324z1(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m8368n(int i10, List list, C2900x5 c2900x5, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC2887w5 abstractC2887w5 = c2900x5.f14506a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                abstractC2887w5.mo8308A1(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        abstractC2887w5.mo8313F1(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).longValue();
            i12 += 8;
        }
        abstractC2887w5.mo8315H1(i12);
        while (i11 < list.size()) {
            abstractC2887w5.mo8309B1(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m8369o(int i10, List list, C2900x5 c2900x5, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC2887w5 abstractC2887w5 = c2900x5.f14506a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                int iIntValue = ((Integer) list.get(i11)).intValue();
                abstractC2887w5.mo8314G1(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i11++;
            }
            return;
        }
        abstractC2887w5.mo8313F1(i10, 2);
        int iM8334N1 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int iIntValue2 = ((Integer) list.get(i12)).intValue();
            iM8334N1 += AbstractC2887w5.m8334N1((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        abstractC2887w5.mo8315H1(iM8334N1);
        while (i11 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i11)).intValue();
            abstractC2887w5.mo8315H1((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i11++;
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m8370p(int i10, List list, C2900x5 c2900x5, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC2887w5 abstractC2887w5 = c2900x5.f14506a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                long jLongValue = ((Long) list.get(i11)).longValue();
                abstractC2887w5.mo8316I1(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i11++;
            }
            return;
        }
        abstractC2887w5.mo8313F1(i10, 2);
        int iM8335O1 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = ((Long) list.get(i12)).longValue();
            iM8335O1 += AbstractC2887w5.m8335O1((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        abstractC2887w5.mo8315H1(iM8335O1);
        while (i11 < list.size()) {
            long jLongValue3 = ((Long) list.get(i11)).longValue();
            abstractC2887w5.mo8317J1((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i11++;
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m8371q(int i10, List list, C2900x5 c2900x5) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2900x5.getClass();
            boolean z10 = list instanceof InterfaceC2888w6;
            int i11 = 0;
            AbstractC2887w5 abstractC2887w5 = c2900x5.f14506a;
            if (z10) {
                InterfaceC2888w6 interfaceC2888w6 = (InterfaceC2888w6) list;
                while (i11 < list.size()) {
                    Object objMo8050I = interfaceC2888w6.mo8050I(i11);
                    if (objMo8050I instanceof String) {
                        abstractC2887w5.mo8312E1((String) objMo8050I, i10);
                    } else {
                        abstractC2887w5.mo8322x1(i10, (zzka) objMo8050I);
                    }
                    i11++;
                }
            } else {
                while (i11 < list.size()) {
                    abstractC2887w5.mo8312E1((String) list.get(i11), i10);
                    i11++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m8372r(int i10, List list, C2900x5 c2900x5, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC2887w5 abstractC2887w5 = c2900x5.f14506a;
            int i11 = 0;
            if (z10) {
                abstractC2887w5.mo8313F1(i10, 2);
                int iM8334N1 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    iM8334N1 += AbstractC2887w5.m8334N1(((Integer) list.get(i12)).intValue());
                }
                abstractC2887w5.mo8315H1(iM8334N1);
                while (i11 < list.size()) {
                    abstractC2887w5.mo8315H1(((Integer) list.get(i11)).intValue());
                    i11++;
                }
            } else {
                while (i11 < list.size()) {
                    abstractC2887w5.mo8314G1(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m8373s(int i10, List list, C2900x5 c2900x5, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC2887w5 abstractC2887w5 = c2900x5.f14506a;
            int i11 = 0;
            if (z10) {
                abstractC2887w5.mo8313F1(i10, 2);
                int iM8335O1 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    iM8335O1 += AbstractC2887w5.m8335O1(((Long) list.get(i12)).longValue());
                }
                abstractC2887w5.mo8315H1(iM8335O1);
                while (i11 < list.size()) {
                    abstractC2887w5.mo8317J1(((Long) list.get(i11)).longValue());
                    i11++;
                }
            } else {
                while (i11 < list.size()) {
                    abstractC2887w5.mo8316I1(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public static boolean m8374t(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    public static AbstractC2675g8 m8375u(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (AbstractC2675g8) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: v */
    public static int m8376v(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC2887w5.m8334N1(i10 << 3) + 1) * size;
    }

    /* JADX INFO: renamed from: w */
    public static int m8377w(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM8334N1 = AbstractC2887w5.m8334N1(i10 << 3) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int iMo8492q = ((zzka) list.get(i11)).mo8492q();
            iM8334N1 += AbstractC2887w5.m8334N1(iMo8492q) + iMo8492q;
        }
        return iM8334N1;
    }

    /* JADX INFO: renamed from: x */
    public static int m8378x(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC2887w5.m8334N1(i10 << 3) * size) + m8379y(list);
    }

    /* JADX INFO: renamed from: y */
    public static int m8379y(List list) {
        int iM8332L1;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2784o6) {
            C2784o6 c2784o6 = (C2784o6) list;
            iM8332L1 = 0;
            while (i10 < size) {
                c2784o6.m8148g(i10);
                iM8332L1 += AbstractC2887w5.m8332L1(c2784o6.f14364b[i10]);
                i10++;
            }
        } else {
            iM8332L1 = 0;
            while (i10 < size) {
                iM8332L1 += AbstractC2887w5.m8332L1(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iM8332L1;
    }

    /* JADX INFO: renamed from: z */
    public static int m8380z(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC2887w5.m8334N1(i10 << 3) + 4) * size;
    }
}
