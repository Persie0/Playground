package androidx.compose.foundation;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.sync.C3248a;
import p000.a76;
import p000.vi3;
import p000.vz1;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.foundation.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0145m {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f2621a = new AtomicReference(null);

    /* JADX INFO: renamed from: b */
    public final C3248a f2622b = new C3248a();

    /* JADX INFO: renamed from: a */
    public static final void m1025a(C0145m c0145m, a76 a76Var) {
        AtomicReference atomicReference = c0145m.f2621a;
        while (true) {
            a76 a76Var2 = (a76) atomicReference.get();
            if (a76Var2 != null && a76Var.f321a.compareTo(a76Var2.f321a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            do {
                if (atomicReference.compareAndSet(a76Var2, a76Var)) {
                    if (a76Var2 != null) {
                        a76Var2.f322b.mo4537a(new MutationInterruptedException("Mutation interrupted"));
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == a76Var2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m1026b(MutatePriority mutatePriority, vi3 vi3Var, ContinuationImpl continuationImpl) {
        return vz1.m23649s(new MutatorMutex$mutate$2(mutatePriority, this, vi3Var, null), continuationImpl);
    }

    /* JADX INFO: renamed from: c */
    public final Object m1027c(Object obj, MutatePriority mutatePriority, zi3 zi3Var, SuspendLambda suspendLambda) {
        return vz1.m23649s(new MutatorMutex$mutateWith$2(mutatePriority, this, zi3Var, obj, null), suspendLambda);
    }
}
