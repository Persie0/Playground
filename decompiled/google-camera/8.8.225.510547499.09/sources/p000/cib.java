package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class cib implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    private static final nbh f5780a = nbh.m17259h("com/google/android/apps/camera/app/silentfeedback/UncaughtExceptionHandlerBase");

    /* JADX INFO: renamed from: b */
    private final Thread.UncaughtExceptionHandler f5781b;

    /* JADX INFO: renamed from: c */
    private final jvd f5782c = jvd.f34878b;

    public cib(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f5781b = uncaughtExceptionHandler;
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo3795a(Throwable th);

    /* JADX INFO: renamed from: b */
    public final void m3796b(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f5781b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        mo3795a(th);
        if (jvd.m13540d()) {
            m3796b(thread, th);
        } else {
            ((nbe) ((nbe) ((nbe) f5780a.m17251b()).mo17283h(th)).mo17276G((char) 184)).mo17293r("Uncaught exception in background thread %s", thread);
            this.f5782c.execute(new bmj(this, thread, th, 7));
        }
    }
}
