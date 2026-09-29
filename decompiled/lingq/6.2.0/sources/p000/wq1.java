package p000;

import androidx.compose.runtime.internal.C0282a;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import com.google.crypto.tink.shaded.protobuf.C1131f;
import com.google.firebase.perf.util.Timer;
import com.google.protobuf.C1181b;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class wq1 {
    /* JADX INFO: renamed from: A */
    public static void m24101A(StringBuilder sb, boolean z, String str, boolean z2, String str2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
    }

    /* JADX INFO: renamed from: B */
    public static int m24102B(int i, int i2, int i3) {
        return C1131f.m6507h(i) + i2 + i3;
    }

    /* JADX INFO: renamed from: C */
    public static int m24103C(int i, int i2, int i3, int i4) {
        return ((i / i2) * i3) + i4;
    }

    /* JADX INFO: renamed from: D */
    public static ro7 m24104D(ky1 ky1Var, int i) {
        return m89.m16683a(new jy1(ky1Var, i));
    }

    /* JADX INFO: renamed from: a */
    public static int m24105a(int i, float f, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    /* JADX INFO: renamed from: b */
    public static int m24106b(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    /* JADX INFO: renamed from: c */
    public static int m24107c(int i, int i2, int i3, int i4) {
        return C1181b.m6795d(i) + i2 + i3 + i4;
    }

    /* JADX INFO: renamed from: d */
    public static e16 m24108d(tj3 tj3Var, b16 b16Var, float f) {
        ge9.m12515a(tj3Var).getClass();
        return c99.m4422o(b16Var, f);
    }

    /* JADX INFO: renamed from: e */
    public static ro7 m24109e(ky1 ky1Var, int i) {
        return yi2.m25153a(new jy1(ky1Var, i));
    }

    /* JADX INFO: renamed from: f */
    public static ClassCastException m24110f(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    /* JADX INFO: renamed from: g */
    public static Object m24111g(tj3 tj3Var, int i, boolean z, faa faaVar) {
        tj3Var.m22111b0(i);
        tj3Var.m22139q(z);
        return faaVar.m11669c();
    }

    /* JADX INFO: renamed from: h */
    public static String m24112h(int i, String str, int i2) {
        return str.substring(i2, str.length() - i);
    }

    /* JADX INFO: renamed from: i */
    public static String m24113i(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: j */
    public static String m24114j(String str, int i, char c) {
        return str + i + c;
    }

    /* JADX INFO: renamed from: k */
    public static String m24115k(String str, int i, int i2, String str2) {
        return str + i + str2 + i2;
    }

    /* JADX INFO: renamed from: l */
    public static String m24116l(String str, long j) {
        return str + j;
    }

    /* JADX INFO: renamed from: m */
    public static String m24117m(String str, AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, String str2) {
        return str + abstractComponentCallbacksC0635c + str2;
    }

    /* JADX INFO: renamed from: n */
    public static String m24118n(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: o */
    public static String m24119o(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    /* JADX INFO: renamed from: p */
    public static String m24120p(String str, StringBuilder sb) {
        return str + ((Object) sb);
    }

    /* JADX INFO: renamed from: q */
    public static String m24121q(StringBuilder sb, float f, String str) {
        sb.append(f);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: r */
    public static String m24122r(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    /* JADX INFO: renamed from: s */
    public static String m24123s(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: t */
    public static String m24124t(StringBuilder sb, String str, int i) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public static String m24125u(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    /* JADX INFO: renamed from: v */
    public static KotlinNothingValueException m24126v(String str) {
        l54.m15815b(str);
        return new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: w */
    public static void m24127w(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
    }

    /* JADX INFO: renamed from: x */
    public static void m24128x(int i, C0282a c0282a, tj3 tj3Var, boolean z) {
        c0282a.invoke(tj3Var, Integer.valueOf(i));
        tj3Var.m22139q(z);
    }

    /* JADX INFO: renamed from: y */
    public static void m24129y(Timer timer, lk6 lk6Var, lk6 lk6Var2) {
        lk6Var.m16323i(timer.m6742a());
        mk6.m16868c(lk6Var2);
    }

    /* JADX INFO: renamed from: z */
    public static void m24130z(String str, String str2, String str3, StringBuilder sb, List list) {
        sb.append(list);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }
}
