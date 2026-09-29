package p000;

import androidx.work.DirectExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h9b {

    /* JADX INFO: renamed from: a */
    public static final String f42060a = oj5.m18041h("WorkerWrapper");

    /* JADX INFO: renamed from: a */
    public static final Object m13148a(ListenableFuture listenableFuture, pg5 pg5Var, SuspendLambda suspendLambda) {
        Object obj;
        try {
            if (!listenableFuture.isDone()) {
                sm0 sm0Var = new sm0(1, AbstractC3584sr.m21600K(suspendLambda));
                sm0Var.m21468u();
                listenableFuture.mo52a(new gvb(10, listenableFuture, sm0Var), DirectExecutor.INSTANCE);
                sm0Var.m21470w(new ue0(26, pg5Var, listenableFuture));
                Object objM21466r = sm0Var.m21466r();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                return objM21466r;
            }
            boolean z = false;
            while (true) {
                try {
                    obj = listenableFuture.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return obj;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        }
    }
}
