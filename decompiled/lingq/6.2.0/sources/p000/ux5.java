package p000;

import com.google.crypto.tink.shaded.protobuf.C1131f;
import java.lang.reflect.Proxy;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ux5 {
    /* JADX INFO: renamed from: A */
    public static void m22974A(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
    }

    /* JADX INFO: renamed from: B */
    public static void m22975B(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
    }

    /* JADX INFO: renamed from: C */
    public static void m22976C(String str, String str2, String str3, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(str2);
        sb.append(z);
        sb.append(str3);
    }

    /* JADX INFO: renamed from: D */
    public static void m22977D(boolean z, C3244l c3244l, Object obj) {
        Boolean boolValueOf = Boolean.valueOf(z);
        c3244l.getClass();
        c3244l.m15572j(obj, boolValueOf);
    }

    /* JADX INFO: renamed from: a */
    public static int m22978a(int i, int i2, int i3, int i4) {
        return C1131f.m6508i(i) + i2 + i3 + i4;
    }

    /* JADX INFO: renamed from: b */
    public static int m22979b(int i, int i2, List list) {
        return (list.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: c */
    public static int m22980c(int i, String str, int i2) {
        return (str.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: d */
    public static int m22981d(long j, int i, int i2) {
        return (Long.hashCode(j) + i) * i2;
    }

    /* JADX INFO: renamed from: e */
    public static int m22982e(vx9 vx9Var, int i, int i2) {
        return (vx9Var.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: f */
    public static sq5 m22983f(sj5 sj5Var, sj5 sj5Var2, String str, String str2) {
        sj5Var.getClass();
        return new sq5(21, sj5Var2, str2, str);
    }

    /* JADX INFO: renamed from: g */
    public static e16 m22984g(b16 b16Var, float f, tj3 tj3Var, b16 b16Var2, float f2) {
        thb.m22044c(tj3Var, c99.m4414g(b16Var, f));
        return c99.m4412e(b16Var2, f2);
    }

    /* JADX INFO: renamed from: h */
    public static Object m22985h(o98 o98Var, Class cls) {
        Object objNewProxyInstance;
        o98Var.getClass();
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                    sb.append(cls2.getName());
                    if (cls2 != cls) {
                        sb.append(" which is an interface of ");
                        sb.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new n98(o98Var, cls));
        } else {
            C3386nv.m17626m("API declarations must be interfaces.");
            objNewProxyInstance = null;
        }
        objNewProxyInstance.getClass();
        return objNewProxyInstance;
    }

    /* JADX INFO: renamed from: i */
    public static String m22986i(char c, String str, String str2) {
        return str + str2 + c;
    }

    /* JADX INFO: renamed from: j */
    public static String m22987j(int i, int i2, String str, String str2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    /* JADX INFO: renamed from: k */
    public static String m22988k(int i, String str) {
        return str + i;
    }

    /* JADX INFO: renamed from: l */
    public static String m22989l(String str, int i, String str2) {
        return str + i + str2;
    }

    /* JADX INFO: renamed from: m */
    public static String m22990m(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: n */
    public static String m22991n(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    /* JADX INFO: renamed from: o */
    public static String m22992o(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    /* JADX INFO: renamed from: p */
    public static String m22993p(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    /* JADX INFO: renamed from: q */
    public static StringBuilder m22994q(int i, int i2, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    /* JADX INFO: renamed from: r */
    public static StringBuilder m22995r(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    /* JADX INFO: renamed from: s */
    public static StringBuilder m22996s(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: t */
    public static StringBuilder m22997t(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    /* JADX INFO: renamed from: u */
    public static StringBuilder m22998u(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: v */
    public static StringBuilder m22999v(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: w */
    public static StringBuilder m23000w(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    /* JADX INFO: renamed from: x */
    public static NoWhenBranchMatchedException m23001x(tj3 tj3Var, int i, boolean z) {
        tj3Var.m22111b0(i);
        tj3Var.m22139q(z);
        return new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: y */
    public static void m23002y(long j, String str, StringBuilder sb) {
        sb.append((Object) aa1.m205i(j));
        sb.append(str);
    }

    /* JADX INFO: renamed from: z */
    public static void m23003z(b16 b16Var, float f, tj3 tj3Var, boolean z) {
        thb.m22044c(tj3Var, c99.m4414g(b16Var, f));
        tj3Var.m22139q(z);
    }
}
