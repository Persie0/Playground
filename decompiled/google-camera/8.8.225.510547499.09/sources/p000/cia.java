package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cia extends cib {

    /* JADX INFO: renamed from: a */
    public static final nbh f5777a = nbh.m17259h("com/google/android/apps/camera/app/silentfeedback/UncaughtExceptionForwarder");

    /* JADX INFO: renamed from: b */
    public final cie f5778b;

    /* JADX INFO: renamed from: c */
    private final jvd f5779c;

    public cia(cie cieVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        super(uncaughtExceptionHandler);
        this.f5779c = jvd.f34878b;
        this.f5778b = cieVar;
    }

    @Override // p000.cib
    /* JADX INFO: renamed from: a */
    protected final void mo3795a(Throwable th) {
        if (this.f5778b != null) {
            if (!jvd.m13540d()) {
                ((nbe) ((nbe) ((nbe) f5777a.m17251b()).mo17283h(th)).mo17276G((char) 183)).mo17290o("Uncaught exception in background thread");
            }
            this.f5779c.m13541c(new cgl(this, th, 7));
        }
    }
}
