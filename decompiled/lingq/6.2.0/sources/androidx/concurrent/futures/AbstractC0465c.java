package androidx.concurrent.futures;

import java.util.concurrent.ExecutionException;
import kotlin.KotlinNullPointerException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.AbstractC3584sr;
import p000.AbstractC3632u1;
import p000.fa4;
import p000.fm0;
import p000.gm0;
import p000.kj3;
import p000.sm0;
import p000.vi3;
import p000.xfa;

/* JADX INFO: renamed from: androidx.concurrent.futures.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0465c {
    /* JADX INFO: renamed from: a */
    public static final Object m1910a(final gm0 gm0Var, ContinuationImpl continuationImpl) {
        fm0 fm0Var = gm0Var.f40990b;
        try {
            if (fm0Var.isDone()) {
                return AbstractC3632u1.m22386h(gm0Var);
            }
            sm0 sm0Var = new sm0(1, AbstractC3584sr.m21600K(continuationImpl));
            fm0Var.mo52a(new kj3(11, gm0Var, sm0Var), DirectExecutor.INSTANCE);
            sm0Var.m21470w(new vi3() { // from class: androidx.concurrent.futures.ListenableFutureKt$await$$inlined$suspendCancellableCoroutine$lambda$1
                {
                    super(1);
                }

                @Override // p000.vi3
                public final Object invoke(Object obj) {
                    gm0Var.cancel(false);
                    return xfa.f68157a;
                }
            });
            Object objM21466r = sm0Var.m21466r();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return objM21466r;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                throw cause;
            }
            KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
            fa4.m11634H(kotlinNullPointerException, fa4.class.getName());
            throw kotlinNullPointerException;
        }
    }
}
