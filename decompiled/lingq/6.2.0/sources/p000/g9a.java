package p000;

import android.content.res.TypedArray;
import android.os.Bundle;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class g9a {
    /* JADX INFO: renamed from: a */
    public static int m12424a(double d, int i, int i2) {
        return (Double.hashCode(d) + i) * i2;
    }

    /* JADX INFO: renamed from: b */
    public static int m12425b(int i, int i2, int i3) {
        return nhb.m17434a(i) + i2 + i3;
    }

    /* JADX INFO: renamed from: c */
    public static int m12426c(int i, int i2, int i3, int i4) {
        return nhb.m17434a(i) + i2 + i3 + i4;
    }

    /* JADX INFO: renamed from: d */
    public static int m12427d(int i, int i2, int i3, int i4, int i5) {
        return Math.max(((i * i2) / i3) + i4, i5);
    }

    /* JADX INFO: renamed from: e */
    public static int m12428e(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    /* JADX INFO: renamed from: f */
    public static Bundle m12429f(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    /* JADX INFO: renamed from: g */
    public static ClassCastException m12430g(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    /* JADX INFO: renamed from: h */
    public static String m12431h(String str, int i, String str2, String str3) {
        return str + i + str2 + str3;
    }

    /* JADX INFO: renamed from: i */
    public static mib m12432i(mib mibVar) {
        int size = mibVar.size();
        return mibVar.mo10419Y(size + size);
    }

    /* JADX INFO: renamed from: j */
    public static void m12433j(bk8 bk8Var, bk8 bk8Var2, String str, bk8 bk8Var3, String str2) {
        bk8Var.getClass();
        AbstractC3695vr.m23496g(bk8Var2, str);
        AbstractC3695vr.m23496g(bk8Var3, str2);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m12434k(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else {
                ij6.m13959q();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
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

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m12435l(Object obj) {
        if (obj == null) {
            return;
        }
        ho2.m13383c();
    }

    /* JADX INFO: renamed from: m */
    public static int m12436m(int i, int i2, int i3) {
        return z3c.m25433o(i) + i2 + i3;
    }

    /* JADX INFO: renamed from: n */
    public static int m12437n(int i, int i2, int i3, int i4) {
        return z3c.m25433o(i) + i2 + i3 + i4;
    }
}
