package p000;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oqp {

    /* JADX INFO: renamed from: a */
    private static final List f46427a;

    static {
        Iterator it = ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator();
        it.getClass();
        f46427a = ooc.m18744j(new ooz(new opd(it, 2), 0));
    }

    /* JADX INFO: renamed from: a */
    public static final void m18917a(oly olyVar, Throwable th) {
        Iterator it = f46427a.iterator();
        while (it.hasNext()) {
            try {
                ((CoroutineExceptionHandler) it.next()).handleException(olyVar, th);
            } catch (Throwable th2) {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, oqv.m18927h(th, th2));
            }
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            lkm.m15595v(th, new oqz(olyVar));
        } catch (Throwable th3) {
        }
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }
}
