package p000;

/* JADX INFO: renamed from: gu */
/* JADX INFO: loaded from: classes.dex */
public final class C3051gu extends lda {

    /* JADX INFO: renamed from: t */
    public static volatile C3051gu f41316t;

    /* JADX INFO: renamed from: u */
    public static final ExecutorC3014fu f41317u = new ExecutorC3014fu(0);

    /* JADX INFO: renamed from: s */
    public final s82 f41318s = new s82();

    /* JADX INFO: renamed from: O */
    public static C3051gu m12863O() {
        if (f41316t != null) {
            return f41316t;
        }
        synchronized (C3051gu.class) {
            try {
                if (f41316t == null) {
                    f41316t = new C3051gu();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f41316t;
    }
}
