package p464wl;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p490xl.InterfaceC10223b;

/* JADX INFO: renamed from: wl.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C9970e<T> implements InterfaceC9968c<T>, InterfaceC10223b {

    /* JADX INFO: renamed from: b */
    public static final AtomicReferenceFieldUpdater<C9970e<?>, Object> f50693b = AtomicReferenceFieldUpdater.newUpdater(C9970e.class, Object.class, "result");

    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<T> f50694a;
    private volatile Object result;

    public C9970e(CoroutineSingletons coroutineSingletons, InterfaceC9968c interfaceC9968c) {
        this.f50694a = interfaceC9968c;
        this.result = coroutineSingletons;
    }

    @Override // p490xl.InterfaceC10223b
    /* JADX INFO: renamed from: d */
    public final InterfaceC10223b mo13473d() {
        InterfaceC9968c<T> interfaceC9968c = this.f50694a;
        if (interfaceC9968c instanceof InterfaceC10223b) {
            return (InterfaceC10223b) interfaceC9968c;
        }
        return null;
    }

    @Override // p464wl.InterfaceC9968c
    /* JADX INFO: renamed from: e */
    public final CoroutineContext mo2029e() {
        return this.f50694a.mo2029e();
    }

    public final String toString() {
        return "SafeContinuation for " + this.f50694a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p464wl.InterfaceC9968c
    /* JADX INFO: renamed from: y */
    public final void mo2031y(Object obj) {
        while (true) {
            Object obj2 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
            boolean z10 = false;
            if (obj2 == coroutineSingletons) {
                AtomicReferenceFieldUpdater<C9970e<?>, Object> atomicReferenceFieldUpdater = f50693b;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, coroutineSingletons, obj)) {
                        z10 = true;
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == coroutineSingletons);
                if (z10) {
                    return;
                }
            } else {
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (obj2 != coroutineSingletons2) {
                    throw new IllegalStateException("Already resumed");
                }
                AtomicReferenceFieldUpdater<C9970e<?>, Object> atomicReferenceFieldUpdater2 = f50693b;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.RESUMED;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, coroutineSingletons2, coroutineSingletons3)) {
                        z10 = true;
                        break;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == coroutineSingletons2);
                if (z10) {
                    this.f50694a.mo2031y(obj);
                    return;
                }
            }
        }
    }
}
