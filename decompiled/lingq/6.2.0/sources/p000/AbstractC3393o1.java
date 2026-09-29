package p000;

import android.content.res.TypedArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinNothingValueException;

/* JADX INFO: renamed from: o1 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3393o1 {
    /* JADX INFO: renamed from: A */
    public static void m17723A(tj3 tj3Var, boolean z, boolean z2, boolean z3) {
        tj3Var.m22139q(z);
        tj3Var.m22139q(z2);
        tj3Var.m22139q(z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m17724B(ik8 ik8Var) throws Exception {
        boolean zIsTerminated;
        if (ik8Var instanceof AutoCloseable) {
            ik8Var.close();
            return;
        }
        if (!(ik8Var instanceof ExecutorService)) {
            if (ik8Var instanceof TypedArray) {
                ((TypedArray) ik8Var).recycle();
                return;
            } else {
                ij6.m13959q();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) ik8Var;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m17725C(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    /* JADX INFO: renamed from: a */
    public static float m17726a(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    /* JADX INFO: renamed from: b */
    public static a02 m17727b(long j, zf1 zf1Var) {
        return zf1Var.mo1265a(new aa1(j));
    }

    /* JADX INFO: renamed from: c */
    public static e16 m17728c(float f, e16 e16Var, boolean z) {
        return e16Var.mo3161g(new as4(f, z));
    }

    /* JADX INFO: renamed from: d */
    public static v56 m17729d(tj3 tj3Var) {
        v56 v56Var = new v56();
        tj3Var.m22131l0(v56Var);
        return v56Var;
    }

    /* JADX INFO: renamed from: e */
    public static f57 m17730e(float f, float f2) {
        f57 f57Var = new f57();
        f57Var.m11553h(f, f2);
        return f57Var;
    }

    /* JADX INFO: renamed from: f */
    public static Object m17731f(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    /* JADX INFO: renamed from: g */
    public static String m17732g(int i, String str) {
        return i + str;
    }

    /* JADX INFO: renamed from: h */
    public static String m17733h(Object obj, String str) {
        return str + obj;
    }

    /* JADX INFO: renamed from: i */
    public static String m17734i(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: j */
    public static String m17735j(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: k */
    public static String m17736k(String str, StringBuilder sb, ArrayList arrayList) {
        d32.m10005B(arrayList.size(), sb);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: l */
    public static String m17737l(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    /* JADX INFO: renamed from: m */
    public static String m17738m(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: n */
    public static String m17739n(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    /* JADX INFO: renamed from: o */
    public static String m17740o(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: p */
    public static StringBuilder m17741p(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(i);
        sb.append(str4);
        return sb;
    }

    /* JADX INFO: renamed from: q */
    public static StringBuilder m17742q(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    /* JADX INFO: renamed from: r */
    public static HashMap m17743r(Class cls, C3091hx c3091hx) {
        HashMap map = new HashMap();
        map.put(cls, c3091hx);
        return map;
    }

    /* JADX INFO: renamed from: s */
    public static Map m17744s(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    /* JADX INFO: renamed from: t */
    public static KotlinNothingValueException m17745t(String str) {
        i54.m13664c(str);
        return new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: u */
    public static void m17746u(int i, int i2, int i3, int i4, int i5) {
        uma.m22828w(i);
        uma.m22828w(i2);
        uma.m22828w(i3);
        uma.m22828w(i4);
        uma.m22828w(i5);
    }

    /* JADX INFO: renamed from: v */
    public static void m17747v(int i, tj3 tj3Var, zi3 zi3Var, tj3 tj3Var2, vi3 vi3Var) {
        oha.m18001g(tj3Var, zi3Var, Integer.valueOf(i));
        oha.m18000f(tj3Var2, vi3Var);
    }

    /* JADX INFO: renamed from: w */
    public static void m17748w(int i, String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(i);
        sb.append(str3);
    }

    /* JADX INFO: renamed from: x */
    public static void m17749x(int i, ArrayList arrayList) {
        arrayList.add(new Integer(i));
    }

    /* JADX INFO: renamed from: y */
    public static void m17750y(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: z */
    public static void m17751z(C3309ls c3309ls, long j) {
        c3309ls.m16515r().mo17024p();
        c3309ls.m16501U(j);
    }
}
