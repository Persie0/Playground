package androidx.room;

import java.util.concurrent.RejectedExecutionException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.AbstractC3584sr;
import p000.by8;
import p000.c9a;
import p000.fa4;
import p000.nn1;
import p000.sm0;
import p000.vi3;
import p000.wfb;
import p000.wm0;

/* JADX INFO: renamed from: androidx.room.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0747e {
    /* JADX INFO: renamed from: a */
    public static final Object m2848a(vi3 vi3Var, AbstractC0746d abstractC0746d, Continuation continuation) {
        if ((!abstractC0746d.m2840m() || !abstractC0746d.m2843p() || !abstractC0746d.m2841n()) && continuation.getContext().get(wm0.f67042c) != null) {
            return m2850c(vi3Var, abstractC0746d, continuation);
        }
        return vi3Var.invoke(continuation);
    }

    /* JADX INFO: renamed from: b */
    public static final Object m2849b(AbstractC0746d abstractC0746d, vi3 vi3Var, ContinuationImpl continuationImpl) {
        return m2850c(new RoomDatabaseKt__RoomDatabase_androidKt$withTransaction$2(vi3Var, abstractC0746d, null), abstractC0746d, continuationImpl);
    }

    /* JADX INFO: renamed from: c */
    public static final Object m2850c(vi3 vi3Var, AbstractC0746d abstractC0746d, Continuation continuation) {
        C0733x2e53b6b3 c0733x2e53b6b3 = new C0733x2e53b6b3(vi3Var, null);
        c9a c9aVar = (c9a) continuation.getContext().get(c9a.f9771b);
        nn1 nn1Var = c9aVar != null ? c9aVar.f9772a : null;
        if (nn1Var != null) {
            return wfb.m23905G(c0733x2e53b6b3, nn1Var, continuation);
        }
        sm0 sm0Var = new sm0(1, AbstractC3584sr.m21600K(continuation));
        sm0Var.m21468u();
        try {
            by8 by8Var = abstractC0746d.f6957d;
            if (by8Var == null) {
                fa4.m11636J("internalTransactionExecutor");
                throw null;
            }
            by8Var.execute(new RunnableC0748f(sm0Var, abstractC0746d, c0733x2e53b6b3));
            Object objM21466r = sm0Var.m21466r();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return objM21466r;
        } catch (RejectedExecutionException e) {
            sm0Var.mo10141l(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
    }
}
