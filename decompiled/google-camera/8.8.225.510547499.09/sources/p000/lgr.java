package p000;

import androidx.wear.ambient.AmbientMode;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lgr {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f38224b = 0;

    /* JADX INFO: renamed from: c */
    private static final nbh f38225c = nbh.m17259h("com/google/android/libraries/performance/primes/Primes");

    /* JADX INFO: renamed from: d */
    private static final lgr f38226d;

    /* JADX INFO: renamed from: e */
    private static volatile boolean f38227e;

    /* JADX INFO: renamed from: f */
    private static volatile lgr f38228f;

    /* JADX INFO: renamed from: a */
    public final lgs f38229a;

    static {
        lgr lgrVar = new lgr(new lgq());
        f38226d = lgrVar;
        f38227e = true;
        f38228f = lgrVar;
    }

    public lgr(lgs lgsVar) {
        lgsVar.getClass();
        this.f38229a = lgsVar;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m15324a(AmbientMode.AmbientController ambientController) {
        if (f38228f == f38226d) {
            if (!lij.m15455y()) {
                ((nbe) ((nbe) f38225c.m17252c()).mo17276G((char) 4481)).mo17290o("Primes.initialize() should only be called from the main thread.");
            }
            f38228f = (lgr) ambientController.f1697a;
        }
    }
}
