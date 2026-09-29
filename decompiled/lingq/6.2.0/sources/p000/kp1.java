package p000;

import com.facebook.internal.instrument.InstrumentData$Type;

/* JADX INFO: loaded from: classes.dex */
public final class kp1 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: b */
    public static final gr7 f48273b = new gr7(9);

    /* JADX INFO: renamed from: c */
    public static kp1 f48274c;

    /* JADX INFO: renamed from: a */
    public final Thread.UncaughtExceptionHandler f48275a;

    public kp1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f48275a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        thread.getClass();
        th.getClass();
        Throwable th2 = null;
        loop0: for (Throwable cause = th; cause != null && cause != th2; cause = cause.getCause()) {
            StackTraceElement[] stackTrace = cause.getStackTrace();
            stackTrace.getClass();
            for (StackTraceElement stackTraceElement : stackTrace) {
                stackTraceElement.getClass();
                if (thb.m22064w(stackTraceElement)) {
                    pk9.m19374l(th);
                    egd.m11100b(th, InstrumentData$Type.CrashReport).m20433d();
                    break loop0;
                }
            }
            th2 = cause;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f48275a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
