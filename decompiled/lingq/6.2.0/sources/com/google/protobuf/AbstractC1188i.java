package com.google.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import p000.g9a;
import p000.gk5;
import p000.ij6;
import p000.jw4;
import p000.m58;
import p000.u74;
import p000.xm8;
import p000.zfa;

/* JADX INFO: renamed from: com.google.protobuf.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1188i {

    /* JADX INFO: renamed from: a */
    public static final Class f13953a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC1189j f13954b;

    /* JADX INFO: renamed from: c */
    public static final zfa f13955c;

    static {
        Class<?> cls;
        Class<?> cls2;
        AbstractC1189j abstractC1189j = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f13953a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                abstractC1189j = (AbstractC1189j) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f13954b = abstractC1189j;
        f13955c = new zfa();
    }

    /* JADX INFO: renamed from: A */
    public static void m6847A(int i, List list, m58 m58Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1181b c1181b = (C1181b) m58Var.f50618b;
        int i2 = 0;
        if (!(list instanceof jw4)) {
            while (i2 < list.size()) {
                String str = (String) list.get(i2);
                c1181b.m6806o(i, 2);
                c1181b.m6805n(str);
                i2++;
            }
            return;
        }
        jw4 jw4Var = (jw4) list;
        while (i2 < list.size()) {
            Object raw = jw4Var.getRaw(i2);
            if (raw instanceof String) {
                c1181b.m6806o(i, 2);
                c1181b.m6805n((String) raw);
            } else {
                c1181b.m6806o(i, 2);
                c1181b.m6799h((ByteString) raw);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m6848B(int i, List list, m58 m58Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1181b c1181b = (C1181b) m58Var.f50618b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c1181b.m6806o(i, 0);
                c1181b.m6807p(iIntValue);
            }
            return;
        }
        c1181b.m6806o(i, 2);
        int iM6795d = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM6795d += C1181b.m6795d(((Integer) list.get(i3)).intValue());
        }
        c1181b.m6807p(iM6795d);
        for (int i4 = 0; i4 < list.size(); i4++) {
            c1181b.m6807p(((Integer) list.get(i4)).intValue());
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m6849C(int i, List list, m58 m58Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1181b c1181b = (C1181b) m58Var.f50618b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c1181b.m6808q(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c1181b.m6806o(i, 2);
        int iM6796e = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM6796e += C1181b.m6796e(((Long) list.get(i3)).longValue());
        }
        c1181b.m6807p(iM6796e);
        while (i2 < list.size()) {
            c1181b.m6809r(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m6850a(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u74)) {
            int iM6792a = 0;
            while (i < size) {
                iM6792a += C1181b.m6792a(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM6792a;
        }
        u74 u74Var = (u74) list;
        int iM6792a2 = 0;
        while (i < size) {
            iM6792a2 += C1181b.m6792a(u74Var.getInt(i));
            i++;
        }
        return iM6792a2;
    }

    /* JADX INFO: renamed from: b */
    public static int m6851b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1181b.m6794c(i) + 4) * size;
    }

    /* JADX INFO: renamed from: c */
    public static int m6852c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1181b.m6794c(i) + 8) * size;
    }

    /* JADX INFO: renamed from: d */
    public static int m6853d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u74)) {
            int iM6792a = 0;
            while (i < size) {
                iM6792a += C1181b.m6792a(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM6792a;
        }
        u74 u74Var = (u74) list;
        int iM6792a2 = 0;
        while (i < size) {
            iM6792a2 += C1181b.m6792a(u74Var.getInt(i));
            i++;
        }
        return iM6792a2;
    }

    /* JADX INFO: renamed from: e */
    public static int m6854e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof gk5) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM6796e = 0;
        for (int i = 0; i < size; i++) {
            iM6796e += C1181b.m6796e(((Long) list.get(i)).longValue());
        }
        return iM6796e;
    }

    /* JADX INFO: renamed from: f */
    public static int m6855f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u74)) {
            int iM6795d = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iM6795d += C1181b.m6795d((iIntValue >> 31) ^ (iIntValue << 1));
                i++;
            }
            return iM6795d;
        }
        u74 u74Var = (u74) list;
        int iM6795d2 = 0;
        while (i < size) {
            int i2 = u74Var.getInt(i);
            iM6795d2 += C1181b.m6795d((i2 >> 31) ^ (i2 << 1));
            i++;
        }
        return iM6795d2;
    }

    /* JADX INFO: renamed from: g */
    public static int m6856g(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof gk5)) {
                int iM6796e = 0;
                for (int i = 0; i < size; i++) {
                    long jLongValue = ((Long) list.get(i)).longValue();
                    iM6796e += C1181b.m6796e((jLongValue >> 63) ^ (jLongValue << 1));
                }
                return iM6796e;
            }
            g9a.m12435l(list);
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public static int m6857h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u74)) {
            int iM6795d = 0;
            while (i < size) {
                iM6795d += C1181b.m6795d(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM6795d;
        }
        u74 u74Var = (u74) list;
        int iM6795d2 = 0;
        while (i < size) {
            iM6795d2 += C1181b.m6795d(u74Var.getInt(i));
            i++;
        }
        return iM6795d2;
    }

    /* JADX INFO: renamed from: i */
    public static int m6858i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof gk5) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM6796e = 0;
        for (int i = 0; i < size; i++) {
            iM6796e += C1181b.m6796e(((Long) list.get(i)).longValue());
        }
        return iM6796e;
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
    /* JADX INFO: renamed from: j */
    public static void m6859j(AbstractC1189j abstractC1189j, Object obj, Object obj2) {
        ((zfa) abstractC1189j).getClass();
        AbstractC1183d abstractC1183d = (AbstractC1183d) obj;
        C1190k c1190k = abstractC1183d.unknownFields;
        C1190k c1190k2 = ((AbstractC1183d) obj2).unknownFields;
        C1190k c1190k3 = C1190k.f13956f;
        if (!c1190k3.equals(c1190k2)) {
            if (c1190k3.equals(c1190k)) {
                int i = c1190k.f13957a + c1190k2.f13957a;
                int[] iArrCopyOf = Arrays.copyOf(c1190k.f13958b, i);
                System.arraycopy(c1190k2.f13958b, 0, iArrCopyOf, c1190k.f13957a, c1190k2.f13957a);
                Object[] objArrCopyOf = Arrays.copyOf(c1190k.f13959c, i);
                System.arraycopy(c1190k2.f13959c, 0, objArrCopyOf, c1190k.f13957a, c1190k2.f13957a);
                c1190k = new C1190k(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                c1190k.getClass();
                if (!c1190k2.equals(c1190k3)) {
                    if (!c1190k.f13961e) {
                        ij6.m13946b();
                        return;
                    }
                    int i2 = c1190k.f13957a;
                    int i3 = c1190k2.f13957a + i2;
                    int[] iArr = c1190k.f13958b;
                    if (i3 > iArr.length) {
                        int i4 = (i2 / 2) + i2;
                        if (i4 < i3) {
                            i4 = i3;
                        }
                        if (i4 < 8) {
                            i4 = 8;
                        }
                        c1190k.f13958b = Arrays.copyOf(iArr, i4);
                        c1190k.f13959c = Arrays.copyOf(c1190k.f13959c, i4);
                    }
                    System.arraycopy(c1190k2.f13958b, 0, c1190k.f13958b, c1190k.f13957a, c1190k2.f13957a);
                    System.arraycopy(c1190k2.f13959c, 0, c1190k.f13959c, c1190k.f13957a, c1190k2.f13957a);
                    c1190k.f13957a = i3;
                }
            }
        }
        abstractC1183d.unknownFields = c1190k;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m6860k(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static void m6861l(int i, List list, m58 m58Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1181b c1181b = (C1181b) m58Var.f50618b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                c1181b.m6806o(i, 0);
                c1181b.m6797f(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        c1181b.m6806o(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = C1181b.f13929e;
            i3++;
        }
        c1181b.m6807p(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            c1181b.m6797f(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m6862m(int i, List list, m58 m58Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m58Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C1181b c1181b = (C1181b) m58Var.f50618b;
            ByteString byteString = (ByteString) list.get(i2);
            c1181b.m6806o(i, 2);
            c1181b.m6799h(byteString);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m6863n(int i, List list, m58 m58Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1181b c1181b = (C1181b) m58Var.f50618b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                c1181b.getClass();
                c1181b.m6802k(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        c1181b.m6806o(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = C1181b.f13929e;
            i3 += 8;
        }
        c1181b.m6807p(i3);
        while (i2 < list.size()) {
            c1181b.m6803l(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m6864o(int i, List list, m58 m58Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1181b c1181b = (C1181b) m58Var.f50618b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c1181b.m6806o(i, 0);
                c1181b.m6804m(iIntValue);
            }
            return;
        }
        c1181b.m6806o(i, 2);
        int iM6792a = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM6792a += C1181b.m6792a(((Integer) list.get(i3)).intValue());
        }
        c1181b.m6807p(iM6792a);
        for (int i4 = 0; i4 < list.size(); i4++) {
            c1181b.m6804m(((Integer) list.get(i4)).intValue());
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m6865p(int i, List list, m58 m58Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1181b c1181b = (C1181b) m58Var.f50618b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c1181b.m6800i(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c1181b.m6806o(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = C1181b.f13929e;
            i3 += 4;
        }
        c1181b.m6807p(i3);
        while (i2 < list.size()) {
            c1181b.m6801j(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m6866q(int i, List list, m58 m58Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1181b c1181b = (C1181b) m58Var.f50618b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c1181b.m6802k(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c1181b.m6806o(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = C1181b.f13929e;
            i3 += 8;
        }
        c1181b.m6807p(i3);
        while (i2 < list.size()) {
            c1181b.m6803l(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m6867r(int i, List list, m58 m58Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1181b c1181b = (C1181b) m58Var.f50618b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                c1181b.getClass();
                c1181b.m6800i(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        c1181b.m6806o(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = C1181b.f13929e;
            i3 += 4;
        }
        c1181b.m6807p(i3);
        while (i2 < list.size()) {
            c1181b.m6801j(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m6868s(int i, List list, m58 m58Var, xm8 xm8Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m58Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            m58Var.m16650q(i, list.get(i2), xm8Var);
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m6869t(int i, List list, m58 m58Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1181b c1181b = (C1181b) m58Var.f50618b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c1181b.m6806o(i, 0);
                c1181b.m6804m(iIntValue);
            }
            return;
        }
        c1181b.m6806o(i, 2);
        int iM6792a = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM6792a += C1181b.m6792a(((Integer) list.get(i3)).intValue());
        }
        c1181b.m6807p(iM6792a);
        for (int i4 = 0; i4 < list.size(); i4++) {
            c1181b.m6804m(((Integer) list.get(i4)).intValue());
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m6870u(int i, List list, m58 m58Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1181b c1181b = (C1181b) m58Var.f50618b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c1181b.m6808q(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c1181b.m6806o(i, 2);
        int iM6796e = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM6796e += C1181b.m6796e(((Long) list.get(i3)).longValue());
        }
        c1181b.m6807p(iM6796e);
        while (i2 < list.size()) {
            c1181b.m6809r(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m6871v(int i, List list, m58 m58Var, xm8 xm8Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m58Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            m58Var.m16651r(i, list.get(i2), xm8Var);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m6872w(int i, List list, m58 m58Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1181b c1181b = (C1181b) m58Var.f50618b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c1181b.m6800i(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c1181b.m6806o(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = C1181b.f13929e;
            i3 += 4;
        }
        c1181b.m6807p(i3);
        while (i2 < list.size()) {
            c1181b.m6801j(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m6873x(int i, List list, m58 m58Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1181b c1181b = (C1181b) m58Var.f50618b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c1181b.m6802k(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c1181b.m6806o(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = C1181b.f13929e;
            i3 += 8;
        }
        c1181b.m6807p(i3);
        while (i2 < list.size()) {
            c1181b.m6803l(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m6874y(int i, List list, m58 m58Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1181b c1181b = (C1181b) m58Var.f50618b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c1181b.m6806o(i, 0);
                c1181b.m6807p((iIntValue >> 31) ^ (iIntValue << 1));
            }
            return;
        }
        c1181b.m6806o(i, 2);
        int iM6795d = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iM6795d += C1181b.m6795d((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c1181b.m6807p(iM6795d);
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue3 = ((Integer) list.get(i4)).intValue();
            c1181b.m6807p((iIntValue3 >> 31) ^ (iIntValue3 << 1));
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m6875z(int i, List list, m58 m58Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1181b c1181b = (C1181b) m58Var.f50618b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                c1181b.m6808q(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        c1181b.m6806o(i, 2);
        int iM6796e = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iM6796e += C1181b.m6796e((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c1181b.m6807p(iM6796e);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            c1181b.m6809r((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }
}
