package kotlinx.coroutines;

import android.support.v4.media.C0141b;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.sequences.C7073a;
import kotlin.sequences.SequencesKt__SequencesKt;
import no.InterfaceC7878x;
import p260m8.C7499b;
import p349qo.C8656b;
import p385sf.C9000b;
import sl.C9072e;

/* JADX INFO: renamed from: kotlinx.coroutines.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C7079a {

    /* JADX INFO: renamed from: a */
    public static final List<InterfaceC7878x> f40000a = C9000b.m17255u(C7073a.m14267b3(SequencesKt__SequencesKt.m14248I2(C0141b.m616l())));

    /* JADX INFO: renamed from: a */
    public static final void m14315a(CoroutineContext coroutineContext, Throwable th2) {
        Throwable runtimeException;
        Iterator<InterfaceC7878x> it = f40000a.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo2598p1(coroutineContext, th2);
            } catch (Throwable th3) {
                Thread threadCurrentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = threadCurrentThread.getUncaughtExceptionHandler();
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    C8656b.m16899g(runtimeException, th2);
                }
                uncaughtExceptionHandler.uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            C8656b.m16899g(th2, new DiagnosticCoroutineContextException(coroutineContext));
            C9072e c9072e = C9072e.f47360a;
        } catch (Throwable th4) {
            C7499b.m14967u(th4);
        }
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
    }
}
