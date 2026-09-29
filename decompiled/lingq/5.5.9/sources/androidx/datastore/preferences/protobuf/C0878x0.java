package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0878x0 {

    /* JADX INFO: renamed from: a */
    public static final Class<?> f5946a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC0829b1<?, ?> f5947b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC0829b1<?, ?> f5948c;

    /* JADX INFO: renamed from: d */
    public static final C0835d1 f5949d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f5946a = cls;
        f5947b = m3447A(false);
        f5948c = m3447A(true);
        f5949d = new C0835d1();
    }

    /* JADX INFO: renamed from: A */
    public static AbstractC0829b1<?, ?> m3447A(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (AbstractC0829b1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
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
    /* JADX INFO: renamed from: B */
    public static <T, FT extends C0863q.b<FT>> void m3448B(AbstractC0857n<FT> abstractC0857n, T t10, T t11) {
        C0882z0<T, Object> c0882z0;
        C0863q<T> c0863qMo3410c = abstractC0857n.mo3410c(t11);
        if (c0863qMo3410c.m3429h()) {
            return;
        }
        C0863q<T> c0863qMo3411d = abstractC0857n.mo3411d(t10);
        c0863qMo3411d.getClass();
        int i10 = 0;
        while (true) {
            c0882z0 = c0863qMo3410c.f5919a;
            if (i10 >= c0882z0.m3503d()) {
                break;
            }
            c0863qMo3411d.m3432l(c0882z0.m3502c(i10));
            i10++;
        }
        Iterator<T> it = c0882z0.m3504e().iterator();
        while (it.hasNext()) {
            c0863qMo3411d.m3432l((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: C */
    public static boolean m3449C(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: D */
    public static <UT, UB> UB m3450D(int i10, int i11, UB ub2, AbstractC0829b1<UT, UB> abstractC0829b1) {
        if (ub2 == null) {
            ub2 = (UB) abstractC0829b1.mo3185m();
        }
        abstractC0829b1.mo3177e(i10, i11, ub2);
        return ub2;
    }

    /* JADX INFO: renamed from: E */
    public static void m3451E(int i10, List list, C0849j c0849j, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = c0849j.f5881a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.mo3089A(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        codedOutputStream.mo3105Q(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).booleanValue();
            Logger logger = CodedOutputStream.f5797b;
            i12++;
        }
        codedOutputStream.mo3107S(i12);
        while (i11 < list.size()) {
            codedOutputStream.mo3111z(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m3452F(int i10, List list, C0849j c0849j) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0849j.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            c0849j.f5881a.mo3091C(i10, (ByteString) list.get(i11));
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m3453G(int i10, List list, C0849j c0849j, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = c0849j.f5881a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                double dDoubleValue = ((Double) list.get(i11)).doubleValue();
                codedOutputStream.getClass();
                codedOutputStream.mo3095G(i10, Double.doubleToRawLongBits(dDoubleValue));
                i11++;
            }
            return;
        }
        codedOutputStream.mo3105Q(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).doubleValue();
            Logger logger = CodedOutputStream.f5797b;
            i12 += 8;
        }
        codedOutputStream.mo3107S(i12);
        while (i11 < list.size()) {
            codedOutputStream.mo3096H(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m3454H(int i10, List list, C0849j c0849j, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = c0849j.f5881a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.mo3097I(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        codedOutputStream.mo3105Q(i10, 2);
        int iM3075k = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM3075k += CodedOutputStream.m3075k(((Integer) list.get(i12)).intValue());
        }
        codedOutputStream.mo3107S(iM3075k);
        while (i11 < list.size()) {
            codedOutputStream.mo3098J(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m3455I(int i10, List list, C0849j c0849j, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = c0849j.f5881a;
            int i11 = 0;
            if (z10) {
                codedOutputStream.mo3105Q(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).intValue();
                    Logger logger = CodedOutputStream.f5797b;
                    i12 += 4;
                }
                codedOutputStream.mo3107S(i12);
                while (i11 < list.size()) {
                    codedOutputStream.mo3094F(((Integer) list.get(i11)).intValue());
                    i11++;
                }
            } else {
                while (i11 < list.size()) {
                    codedOutputStream.mo3093E(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m3456J(int i10, List list, C0849j c0849j, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = c0849j.f5881a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.mo3095G(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        codedOutputStream.mo3105Q(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).longValue();
            Logger logger = CodedOutputStream.f5797b;
            i12 += 8;
        }
        codedOutputStream.mo3107S(i12);
        while (i11 < list.size()) {
            codedOutputStream.mo3096H(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: K */
    public static void m3457K(int i10, List list, C0849j c0849j, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = c0849j.f5881a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                float fFloatValue = ((Float) list.get(i11)).floatValue();
                codedOutputStream.getClass();
                codedOutputStream.mo3093E(i10, Float.floatToRawIntBits(fFloatValue));
                i11++;
            }
            return;
        }
        codedOutputStream.mo3105Q(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).floatValue();
            Logger logger = CodedOutputStream.f5797b;
            i12 += 4;
        }
        codedOutputStream.mo3107S(i12);
        while (i11 < list.size()) {
            codedOutputStream.mo3094F(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m3458L(int i10, List list, C0849j c0849j, InterfaceC0876w0 interfaceC0876w0) throws IOException {
        if (list != null && !list.isEmpty()) {
            c0849j.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                c0849j.m3351h(i10, interfaceC0876w0, list.get(i11));
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m3459M(int i10, List list, C0849j c0849j, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = c0849j.f5881a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.mo3097I(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        codedOutputStream.mo3105Q(i10, 2);
        int iM3075k = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM3075k += CodedOutputStream.m3075k(((Integer) list.get(i12)).intValue());
        }
        codedOutputStream.mo3107S(iM3075k);
        while (i11 < list.size()) {
            codedOutputStream.mo3098J(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m3460N(int i10, List list, C0849j c0849j, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = c0849j.f5881a;
            int i11 = 0;
            if (z10) {
                codedOutputStream.mo3105Q(i10, 2);
                int iM3088x = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    iM3088x += CodedOutputStream.m3088x(((Long) list.get(i12)).longValue());
                }
                codedOutputStream.mo3107S(iM3088x);
                while (i11 < list.size()) {
                    codedOutputStream.mo3109U(((Long) list.get(i11)).longValue());
                    i11++;
                }
            } else {
                while (i11 < list.size()) {
                    codedOutputStream.mo3108T(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public static void m3461O(int i10, List list, C0849j c0849j, InterfaceC0876w0 interfaceC0876w0) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0849j.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            c0849j.m3354k(i10, interfaceC0876w0, list.get(i11));
        }
    }

    /* JADX INFO: renamed from: P */
    public static void m3462P(int i10, List list, C0849j c0849j, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = c0849j.f5881a;
            int i11 = 0;
            if (z10) {
                codedOutputStream.mo3105Q(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).intValue();
                    Logger logger = CodedOutputStream.f5797b;
                    i12 += 4;
                }
                codedOutputStream.mo3107S(i12);
                while (i11 < list.size()) {
                    codedOutputStream.mo3094F(((Integer) list.get(i11)).intValue());
                    i11++;
                }
            } else {
                while (i11 < list.size()) {
                    codedOutputStream.mo3093E(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public static void m3463Q(int i10, List list, C0849j c0849j, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = c0849j.f5881a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.mo3095G(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        codedOutputStream.mo3105Q(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).longValue();
            Logger logger = CodedOutputStream.f5797b;
            i12 += 8;
        }
        codedOutputStream.mo3107S(i12);
        while (i11 < list.size()) {
            codedOutputStream.mo3096H(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: R */
    public static void m3464R(int i10, List list, C0849j c0849j, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = c0849j.f5881a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                int iIntValue = ((Integer) list.get(i11)).intValue();
                codedOutputStream.mo3106R(i10, (iIntValue >> 31) ^ (iIntValue << 1));
                i11++;
            }
            return;
        }
        codedOutputStream.mo3105Q(i10, 2);
        int iM3086v = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int iIntValue2 = ((Integer) list.get(i12)).intValue();
            iM3086v += CodedOutputStream.m3086v((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        codedOutputStream.mo3107S(iM3086v);
        while (i11 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i11)).intValue();
            codedOutputStream.mo3107S((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i11++;
        }
    }

    /* JADX INFO: renamed from: S */
    public static void m3465S(int i10, List list, C0849j c0849j, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = c0849j.f5881a;
            int i11 = 0;
            if (z10) {
                codedOutputStream.mo3105Q(i10, 2);
                int iM3088x = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    long jLongValue = ((Long) list.get(i12)).longValue();
                    iM3088x += CodedOutputStream.m3088x((jLongValue >> 63) ^ (jLongValue << 1));
                }
                codedOutputStream.mo3107S(iM3088x);
                while (i11 < list.size()) {
                    long jLongValue2 = ((Long) list.get(i11)).longValue();
                    codedOutputStream.mo3109U((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                    i11++;
                }
            } else {
                while (i11 < list.size()) {
                    long jLongValue3 = ((Long) list.get(i11)).longValue();
                    codedOutputStream.mo3108T(i10, (jLongValue3 >> 63) ^ (jLongValue3 << 1));
                    i11++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public static void m3466T(int i10, List list, C0849j c0849j) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0849j.getClass();
        boolean z10 = list instanceof InterfaceC0879y;
        CodedOutputStream codedOutputStream = c0849j.f5881a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.mo3103O((String) list.get(i11), i10);
                i11++;
            }
            return;
        }
        InterfaceC0879y interfaceC0879y = (InterfaceC0879y) list;
        while (i11 < list.size()) {
            Object objMo3212g0 = interfaceC0879y.mo3212g0(i11);
            if (objMo3212g0 instanceof String) {
                codedOutputStream.mo3103O((String) objMo3212g0, i10);
            } else {
                codedOutputStream.mo3091C(i10, (ByteString) objMo3212g0);
            }
            i11++;
        }
    }

    /* JADX INFO: renamed from: U */
    public static void m3467U(int i10, List list, C0849j c0849j, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = c0849j.f5881a;
            int i11 = 0;
            if (z10) {
                codedOutputStream.mo3105Q(i10, 2);
                int iM3086v = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    iM3086v += CodedOutputStream.m3086v(((Integer) list.get(i12)).intValue());
                }
                codedOutputStream.mo3107S(iM3086v);
                while (i11 < list.size()) {
                    codedOutputStream.mo3107S(((Integer) list.get(i11)).intValue());
                    i11++;
                }
            } else {
                while (i11 < list.size()) {
                    codedOutputStream.mo3106R(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public static void m3468V(int i10, List list, C0849j c0849j, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = c0849j.f5881a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.mo3108T(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        codedOutputStream.mo3105Q(i10, 2);
        int iM3088x = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM3088x += CodedOutputStream.m3088x(((Long) list.get(i12)).longValue());
        }
        codedOutputStream.mo3107S(iM3088x);
        while (i11 < list.size()) {
            codedOutputStream.mo3109U(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m3469a(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.m3066b(i10) * size;
    }

    /* JADX INFO: renamed from: b */
    public static int m3470b(List<?> list) {
        return list.size();
    }

    /* JADX INFO: renamed from: c */
    public static int m3471c(int i10, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM3084t = CodedOutputStream.m3084t(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int size2 = list.get(i11).size();
            iM3084t += CodedOutputStream.m3086v(size2) + size2;
        }
        return iM3084t;
    }

    /* JADX INFO: renamed from: d */
    public static int m3472d(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.m3084t(i10) * size) + m3473e(list);
    }

    /* JADX INFO: renamed from: e */
    public static int m3473e(List<Integer> list) {
        int iM3075k;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0869t) {
            C0869t c0869t = (C0869t) list;
            iM3075k = 0;
            while (i10 < size) {
                c0869t.m3438g(i10);
                iM3075k += CodedOutputStream.m3075k(c0869t.f5930b[i10]);
                i10++;
            }
        } else {
            iM3075k = 0;
            while (i10 < size) {
                iM3075k += CodedOutputStream.m3075k(list.get(i10).intValue());
                i10++;
            }
        }
        return iM3075k;
    }

    /* JADX INFO: renamed from: f */
    public static int m3474f(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.m3070f(i10) * size;
    }

    /* JADX INFO: renamed from: g */
    public static int m3475g(List<?> list) {
        return list.size() * 4;
    }

    /* JADX INFO: renamed from: h */
    public static int m3476h(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.m3071g(i10) * size;
    }

    /* JADX INFO: renamed from: i */
    public static int m3477i(List<?> list) {
        return list.size() * 8;
    }

    /* JADX INFO: renamed from: j */
    public static int m3478j(int i10, List<InterfaceC0848i0> list, InterfaceC0876w0 interfaceC0876w0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM3073i = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iM3073i += CodedOutputStream.m3073i(i10, list.get(i11), interfaceC0876w0);
        }
        return iM3073i;
    }

    /* JADX INFO: renamed from: k */
    public static int m3479k(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.m3084t(i10) * size) + m3480l(list);
    }

    /* JADX INFO: renamed from: l */
    public static int m3480l(List<Integer> list) {
        int iM3075k;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0869t) {
            C0869t c0869t = (C0869t) list;
            iM3075k = 0;
            while (i10 < size) {
                c0869t.m3438g(i10);
                iM3075k += CodedOutputStream.m3075k(c0869t.f5930b[i10]);
                i10++;
            }
        } else {
            iM3075k = 0;
            while (i10 < size) {
                iM3075k += CodedOutputStream.m3075k(list.get(i10).intValue());
                i10++;
            }
        }
        return iM3075k;
    }

    /* JADX INFO: renamed from: m */
    public static int m3481m(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (CodedOutputStream.m3084t(i10) * list.size()) + m3482n(list);
    }

    /* JADX INFO: renamed from: n */
    public static int m3482n(List<Long> list) {
        int iM3088x;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0825a0) {
            C0825a0 c0825a0 = (C0825a0) list;
            iM3088x = 0;
            while (i10 < size) {
                c0825a0.m3167g(i10);
                iM3088x += CodedOutputStream.m3088x(c0825a0.f5817b[i10]);
                i10++;
            }
        } else {
            iM3088x = 0;
            while (i10 < size) {
                iM3088x += CodedOutputStream.m3088x(list.get(i10).longValue());
                i10++;
            }
        }
        return iM3088x;
    }

    /* JADX INFO: renamed from: o */
    public static int m3483o(int i10, InterfaceC0876w0 interfaceC0876w0, Object obj) {
        if (obj instanceof C0875w) {
            return CodedOutputStream.m3077m((C0875w) obj) + CodedOutputStream.m3084t(i10);
        }
        int iM3084t = CodedOutputStream.m3084t(i10);
        int iM3164i = ((AbstractC0824a) ((InterfaceC0848i0) obj)).m3164i(interfaceC0876w0);
        return CodedOutputStream.m3086v(iM3164i) + iM3164i + iM3084t;
    }

    /* JADX INFO: renamed from: p */
    public static int m3484p(int i10, List<?> list, InterfaceC0876w0 interfaceC0876w0) {
        int iM3086v;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM3084t = CodedOutputStream.m3084t(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof C0875w) {
                iM3086v = CodedOutputStream.m3077m((C0875w) obj);
            } else {
                int iM3164i = ((AbstractC0824a) ((InterfaceC0848i0) obj)).m3164i(interfaceC0876w0);
                iM3086v = iM3164i + CodedOutputStream.m3086v(iM3164i);
            }
            iM3084t += iM3086v;
        }
        return iM3084t;
    }

    /* JADX INFO: renamed from: q */
    public static int m3485q(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.m3084t(i10) * size) + m3486r(list);
    }

    /* JADX INFO: renamed from: r */
    public static int m3486r(List<Integer> list) {
        int iM3086v;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0869t) {
            C0869t c0869t = (C0869t) list;
            iM3086v = 0;
            while (i10 < size) {
                c0869t.m3438g(i10);
                int i11 = c0869t.f5930b[i10];
                iM3086v += CodedOutputStream.m3086v((i11 >> 31) ^ (i11 << 1));
                i10++;
            }
        } else {
            iM3086v = 0;
            while (i10 < size) {
                int iIntValue = list.get(i10).intValue();
                iM3086v += CodedOutputStream.m3086v((iIntValue >> 31) ^ (iIntValue << 1));
                i10++;
            }
        }
        return iM3086v;
    }

    /* JADX INFO: renamed from: s */
    public static int m3487s(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.m3084t(i10) * size) + m3488t(list);
    }

    /* JADX INFO: renamed from: t */
    public static int m3488t(List<Long> list) {
        int iM3088x;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0825a0) {
            C0825a0 c0825a0 = (C0825a0) list;
            iM3088x = 0;
            while (i10 < size) {
                c0825a0.m3167g(i10);
                long j10 = c0825a0.f5817b[i10];
                iM3088x += CodedOutputStream.m3088x((j10 >> 63) ^ (j10 << 1));
                i10++;
            }
        } else {
            iM3088x = 0;
            while (i10 < size) {
                long jLongValue = list.get(i10).longValue();
                iM3088x += CodedOutputStream.m3088x((jLongValue >> 63) ^ (jLongValue << 1));
                i10++;
            }
        }
        return iM3088x;
    }

    /* JADX INFO: renamed from: u */
    public static int m3489u(int i10, List<?> list) {
        int iM3083s;
        int iM3083s2;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iM3084t = CodedOutputStream.m3084t(i10) * size;
        if (list instanceof InterfaceC0879y) {
            InterfaceC0879y interfaceC0879y = (InterfaceC0879y) list;
            while (i11 < size) {
                Object objMo3212g0 = interfaceC0879y.mo3212g0(i11);
                if (objMo3212g0 instanceof ByteString) {
                    int size2 = ((ByteString) objMo3212g0).size();
                    iM3083s2 = CodedOutputStream.m3086v(size2) + size2;
                } else {
                    iM3083s2 = CodedOutputStream.m3083s((String) objMo3212g0);
                }
                iM3084t += iM3083s2;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof ByteString) {
                    int size3 = ((ByteString) obj).size();
                    iM3083s = CodedOutputStream.m3086v(size3) + size3;
                } else {
                    iM3083s = CodedOutputStream.m3083s((String) obj);
                }
                iM3084t += iM3083s;
                i11++;
            }
        }
        return iM3084t;
    }

    /* JADX INFO: renamed from: v */
    public static int m3490v(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.m3084t(i10) * size) + m3491w(list);
    }

    /* JADX INFO: renamed from: w */
    public static int m3491w(List<Integer> list) {
        int iM3086v;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0869t) {
            C0869t c0869t = (C0869t) list;
            iM3086v = 0;
            while (i10 < size) {
                c0869t.m3438g(i10);
                iM3086v += CodedOutputStream.m3086v(c0869t.f5930b[i10]);
                i10++;
            }
        } else {
            iM3086v = 0;
            while (i10 < size) {
                iM3086v += CodedOutputStream.m3086v(list.get(i10).intValue());
                i10++;
            }
        }
        return iM3086v;
    }

    /* JADX INFO: renamed from: x */
    public static int m3492x(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.m3084t(i10) * size) + m3493y(list);
    }

    /* JADX INFO: renamed from: y */
    public static int m3493y(List<Long> list) {
        int iM3088x;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0825a0) {
            C0825a0 c0825a0 = (C0825a0) list;
            iM3088x = 0;
            while (i10 < size) {
                c0825a0.m3167g(i10);
                iM3088x += CodedOutputStream.m3088x(c0825a0.f5817b[i10]);
                i10++;
            }
        } else {
            iM3088x = 0;
            while (i10 < size) {
                iM3088x += CodedOutputStream.m3088x(list.get(i10).longValue());
                i10++;
            }
        }
        return iM3088x;
    }

    /* JADX INFO: renamed from: z */
    public static <UT, UB> UB m3494z(int i10, List<Integer> list, C0871u.b bVar, UB ub2, AbstractC0829b1<UT, UB> abstractC0829b1) {
        if (bVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int iIntValue = list.get(i12).intValue();
                if (bVar.m3442a()) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(iIntValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) m3450D(i10, iIntValue, ub2, abstractC0829b1);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
            return ub2;
        }
        Iterator<Integer> it = list.iterator();
        loop1: while (true) {
            while (true) {
                if (!it.hasNext()) {
                    break loop1;
                }
                int iIntValue2 = it.next().intValue();
                if (!bVar.m3442a()) {
                    ub2 = (UB) m3450D(i10, iIntValue2, ub2, abstractC0829b1);
                    it.remove();
                }
            }
        }
        return ub2;
    }
}
