package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class jk8 implements Continuation, vn1 {

    /* JADX INFO: renamed from: b */
    public static final AtomicReferenceFieldUpdater f45653b = AtomicReferenceFieldUpdater.newUpdater(jk8.class, Object.class, "result");

    /* JADX INFO: renamed from: a */
    public final Continuation f45654a;
    private volatile Object result;

    public jk8(Continuation continuation, CoroutineSingletons coroutineSingletons) {
        this.f45654a = continuation;
        this.result = coroutineSingletons;
    }

    /* JADX INFO: renamed from: a */
    public final Object m14527a() throws Throwable {
        Object obj = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
        if (obj == coroutineSingletons) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f45653b;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (e65.m10893y(atomicReferenceFieldUpdater, this, coroutineSingletons, coroutineSingletons2)) {
                return coroutineSingletons2;
            }
            obj = this.result;
        }
        if (obj == CoroutineSingletons.RESUMED) {
            return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).f47626a;
        }
        return obj;
    }

    @Override // p000.vn1
    public final vn1 getCallerFrame() {
        Continuation continuation = this.f45654a;
        if (continuation instanceof vn1) {
            return (vn1) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final kn1 getContext() {
        return this.f45654a.getContext();
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
            if (obj2 == coroutineSingletons) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f45653b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, coroutineSingletons, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != coroutineSingletons) {
                    }
                }
                return;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (obj2 != coroutineSingletons2) {
                C3386nv.m17633t("Already resumed");
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f45653b;
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.RESUMED;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, coroutineSingletons2, coroutineSingletons3)) {
                    this.f45654a.resumeWith(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == coroutineSingletons2);
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f45654a;
    }
}
