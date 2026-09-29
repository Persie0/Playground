package p000;

import java.util.Iterator;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k9d {
    /* JADX INFO: renamed from: a */
    public static byte m15027a(long j) {
        bna.m3963n(j, "out of range: %s", (j >> 8) == 0);
        return (byte) j;
    }

    /* JADX INFO: renamed from: b */
    public static final void m15028b(kn1 kn1Var, Throwable th) {
        Throwable runtimeException;
        Iterator it = on1.f54610a.iterator();
        while (it.hasNext()) {
            try {
                ((CoroutineExceptionHandler) it.next()).mo1248p(kn1Var, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    lda.m16117c(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            lda.m16117c(th, new DiagnosticCoroutineContextException(kn1Var));
        } catch (Throwable unused2) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
        } catch (Throwable unused3) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m15029c(byte b) {
        return b & 255;
    }
}
