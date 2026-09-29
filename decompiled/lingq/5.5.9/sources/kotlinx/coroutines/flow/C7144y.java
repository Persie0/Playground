package kotlinx.coroutines.flow;

import dm.C5207g;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.SafeCollector;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C7144y<T> implements InterfaceC7117d<T> {
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r1v1, types: [int, kotlinx.coroutines.flow.internal.SafeCollector] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final C9072e m14404a(InterfaceC9968c interfaceC9968c) throws Throwable {
        SubscribedFlowCollector$onSubscription$1 subscribedFlowCollector$onSubscription$1;
        if (interfaceC9968c instanceof SubscribedFlowCollector$onSubscription$1) {
            subscribedFlowCollector$onSubscription$1 = (SubscribedFlowCollector$onSubscription$1) interfaceC9968c;
            int i10 = subscribedFlowCollector$onSubscription$1.f40277h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                subscribedFlowCollector$onSubscription$1.f40277h = i10 - Integer.MIN_VALUE;
            } else {
                subscribedFlowCollector$onSubscription$1 = new SubscribedFlowCollector$onSubscription$1(this, interfaceC9968c);
            }
        } else {
            subscribedFlowCollector$onSubscription$1 = new SubscribedFlowCollector$onSubscription$1(this, interfaceC9968c);
        }
        Object obj = subscribedFlowCollector$onSubscription$1.f40275f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r10 = subscribedFlowCollector$onSubscription$1.f40277h;
        try {
            if (r10 == 0) {
                C7499b.m14977z0(obj);
                CoroutineContext coroutineContext = subscribedFlowCollector$onSubscription$1.f38105b;
                C5207g.m11108c(coroutineContext);
                SafeCollector safeCollector = new SafeCollector(null, coroutineContext);
                subscribedFlowCollector$onSubscription$1.f40273d = this;
                subscribedFlowCollector$onSubscription$1.f40274e = safeCollector;
                subscribedFlowCollector$onSubscription$1.f40277h = 1;
                throw null;
            }
            if (r10 == 1) {
                SafeCollector safeCollector2 = subscribedFlowCollector$onSubscription$1.f40274e;
                C7144y c7144y = subscribedFlowCollector$onSubscription$1.f40273d;
                C7499b.m14977z0(obj);
                safeCollector2.mo13475z();
                c7144y.getClass();
            } else {
                if (r10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        } catch (Throwable th2) {
            r10.mo13475z();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.flow.InterfaceC7117d
    /* JADX INFO: renamed from: r */
    public final Object mo1339r(T t10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        throw null;
    }
}
