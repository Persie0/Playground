package p000;

import android.content.res.TypedArray;
import com.lingq.core.domain.model.language.LanguageStatValue;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C3213d;
import kotlinx.coroutines.channels.C3211a;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class hn1 implements em0 {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ boolean m13348A(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, gg1 gg1Var, Object obj, gg1 gg1Var2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(gg1Var, obj, gg1Var2)) {
            if (atomicReferenceFieldUpdater.get(gg1Var) != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ boolean m13349B(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C3213d c3213d, jr2 jr2Var, be4 be4Var) {
        while (!atomicReferenceFieldUpdater.compareAndSet(c3213d, jr2Var, be4Var)) {
            if (atomicReferenceFieldUpdater.get(c3213d) != jr2Var) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ boolean m13350C(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C3211a c3211a, au8 au8Var, ku0 ku0Var) {
        while (!atomicReferenceFieldUpdater.compareAndSet(c3211a, au8Var, ku0Var)) {
            if (atomicReferenceFieldUpdater.get(c3211a) != au8Var) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ boolean m13351D(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C3211a c3211a, au8 au8Var, au8 au8Var2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(c3211a, au8Var, au8Var2)) {
            if (atomicReferenceFieldUpdater.get(c3211a) != au8Var) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static int m13352a(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    /* JADX INFO: renamed from: b */
    public static int m13353b(LanguageStatValue languageStatValue, int i, int i2) {
        return (languageStatValue.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: d */
    public static String m13354d(int i, String str, String str2, String str3, String str4) {
        return str + i + str2 + str3 + str4;
    }

    /* JADX INFO: renamed from: e */
    public static String m13355e(String str, String str2, boolean z) {
        return str + z + str2;
    }

    /* JADX INFO: renamed from: f */
    public static String m13356f(StringBuilder sb, List list, String str) {
        sb.append(list);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: g */
    public static StringBuilder m13357g(String str, String str2, String str3, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(z);
        sb.append(str2);
        sb.append(z2);
        sb.append(str3);
        return sb;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Set m13358h(String str) {
        HashSet hashSet = new HashSet(1);
        Object obj = new Object[]{str}[0];
        Objects.requireNonNull(obj);
        if (hashSet.add(obj)) {
            return Collections.unmodifiableSet(hashSet);
        }
        C3386nv.m17626m(AbstractC3393o1.m17733h(obj, "duplicate element: "));
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static void m13359i(int i, int i2, int i3, int i4, int i5) {
        dhd.m10397a(i);
        dhd.m10397a(i2);
        dhd.m10397a(i3);
        dhd.m10397a(i4);
        dhd.m10397a(i5);
    }

    /* JADX INFO: renamed from: j */
    public static void m13360j(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    /* JADX INFO: renamed from: k */
    public static void m13361k(int i, String str, String str2, String str3, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    /* JADX INFO: renamed from: l */
    public static void m13362l(ik8 ik8Var, int i, int i2, int i3) {
        ik8Var.mo2880m(i);
        ik8Var.mo2880m(i2);
        ik8Var.mo2880m(i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m13363m(TypedArray typedArray) throws Exception {
        boolean zIsTerminated;
        if (typedArray instanceof AutoCloseable) {
            typedArray.close();
            return;
        }
        if (!(typedArray instanceof ExecutorService)) {
            typedArray.recycle();
            return;
        }
        ExecutorService executorService = (ExecutorService) typedArray;
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

    /* JADX INFO: renamed from: n */
    public static void m13364n(String str, int i, String str2) {
        ss5.m21707d0(str2, str + i);
    }

    /* JADX INFO: renamed from: o */
    public static void m13365o(String str, String str2, String str3) {
        ss5.m21707d0(str3, str + str2);
    }

    /* JADX INFO: renamed from: p */
    public static void m13366p(String str, String str2, String str3, StringBuilder sb, List list) {
        sb.append(str);
        sb.append(str2);
        sb.append(list);
        sb.append(str3);
    }

    /* JADX INFO: renamed from: q */
    public static void m13367q(String str, String str2, String str3, StringBuilder sb, boolean z) {
        sb.append(z);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    /* JADX INFO: renamed from: r */
    public static void m13368r(StringBuilder sb, int i, String str, boolean z, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(z);
        sb.append(str2);
    }

    /* JADX INFO: renamed from: s */
    public static void m13369s(StringBuilder sb, LanguageStatValue languageStatValue, String str, LanguageStatValue languageStatValue2, String str2) {
        sb.append(languageStatValue);
        sb.append(str);
        sb.append(languageStatValue2);
        sb.append(str2);
    }

    /* JADX INFO: renamed from: t */
    public static void m13370t(StringBuilder sb, String str, double d, String str2) {
        sb.append(str);
        sb.append(d);
        sb.append(str2);
    }

    /* JADX INFO: renamed from: u */
    public static void m13371u(StringBuilder sb, String str, String str2, Integer num, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(num);
        sb.append(str3);
    }

    /* JADX INFO: renamed from: v */
    public static void m13372v(StringBuilder sb, List list, String str, List list2, String str2) {
        sb.append(list);
        sb.append(str);
        sb.append(list2);
        sb.append(str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m13373w(StringBuilder sb, boolean z, String str, int i, String str2) {
        sb.append(z);
        sb.append(str);
        sb.append(i);
        sb.append(str2);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m13374x(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C3213d c3213d, jr2 jr2Var, e34 e34Var) {
        while (!atomicReferenceFieldUpdater.compareAndSet(c3213d, jr2Var, e34Var) && atomicReferenceFieldUpdater.get(c3213d) == jr2Var) {
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ boolean m13375y(AtomicReference atomicReference, k72 k72Var) {
        while (!atomicReference.compareAndSet(null, k72Var)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ boolean m13376z(AtomicReference atomicReference, pg9 pg9Var) {
        while (!atomicReference.compareAndSet(null, pg9Var)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }
}
