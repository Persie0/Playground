package androidx.compose.runtime;

import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import dm.C5207g;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import no.C7843k;
import no.InterfaceC7840j;
import p081e0.C5347y;
import p081e0.InterfaceC5297b0;
import p260m8.C7499b;
import p349qo.C8656b;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class PausableMonotonicFrameClock implements InterfaceC5297b0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5297b0 f3039a;

    /* JADX INFO: renamed from: b */
    public final C5347y f3040b = new C5347y();

    public PausableMonotonicFrameClock(InterfaceC5297b0 interfaceC5297b0) {
        this.f3039a = interfaceC5297b0;
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: C */
    public final CoroutineContext mo1471C(CoroutineContext coroutineContext) {
        C5207g.m11111f(coroutineContext, "context");
        return CoroutineContext.DefaultImpls.m13470a(this, coroutineContext);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p081e0.InterfaceC5297b0
    /* JADX INFO: renamed from: U */
    public final <R> Object mo1581U(InterfaceC2052l<? super Long, ? extends R> interfaceC2052l, InterfaceC9968c<? super R> interfaceC9968c) throws Throwable {
        PausableMonotonicFrameClock$withFrameNanos$1 pausableMonotonicFrameClock$withFrameNanos$1;
        boolean z10;
        Object objM15593p;
        PausableMonotonicFrameClock pausableMonotonicFrameClock;
        if (interfaceC9968c instanceof PausableMonotonicFrameClock$withFrameNanos$1) {
            pausableMonotonicFrameClock$withFrameNanos$1 = (PausableMonotonicFrameClock$withFrameNanos$1) interfaceC9968c;
            int i10 = pausableMonotonicFrameClock$withFrameNanos$1.f3045h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pausableMonotonicFrameClock$withFrameNanos$1.f3045h = i10 - Integer.MIN_VALUE;
            } else {
                pausableMonotonicFrameClock$withFrameNanos$1 = new PausableMonotonicFrameClock$withFrameNanos$1(this, interfaceC9968c);
            }
        } else {
            pausableMonotonicFrameClock$withFrameNanos$1 = new PausableMonotonicFrameClock$withFrameNanos$1(this, interfaceC9968c);
        }
        Object objMo1581U = pausableMonotonicFrameClock$withFrameNanos$1.f3043f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = pausableMonotonicFrameClock$withFrameNanos$1.f3045h;
        if (i11 != 0) {
            if (i11 == 1) {
                interfaceC2052l = pausableMonotonicFrameClock$withFrameNanos$1.f3042e;
                pausableMonotonicFrameClock = pausableMonotonicFrameClock$withFrameNanos$1.f3041d;
                C7499b.m14977z0(objMo1581U);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objMo1581U);
            }
        }
        C7499b.m14977z0(objMo1581U);
        final C5347y c5347y = this.f3040b;
        pausableMonotonicFrameClock$withFrameNanos$1.f3041d = this;
        pausableMonotonicFrameClock$withFrameNanos$1.f3042e = interfaceC2052l;
        pausableMonotonicFrameClock$withFrameNanos$1.f3045h = 1;
        synchronized (c5347y.f33644a) {
            z10 = c5347y.f33647d;
        }
        if (z10) {
            objM15593p = C9072e.f47360a;
        } else {
            final C7843k c7843k = new C7843k(1, C8656b.m16874A(pausableMonotonicFrameClock$withFrameNanos$1));
            c7843k.m15594r();
            synchronized (c5347y.f33644a) {
                try {
                    c5347y.f33645b.add(c7843k);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c7843k.mo15577R(new InterfaceC2052l<Throwable, C9072e>() { // from class: androidx.compose.runtime.Latch$await$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(Throwable th3) {
                    C5347y c5347y2 = c5347y;
                    Object obj = c5347y2.f33644a;
                    InterfaceC7840j<C9072e> interfaceC7840j = c7843k;
                    synchronized (obj) {
                        c5347y2.f33645b.remove(interfaceC7840j);
                    }
                    return C9072e.f47360a;
                }
            });
            objM15593p = c7843k.m15593p();
            if (objM15593p != coroutineSingletons) {
                objM15593p = C9072e.f47360a;
            }
        }
        if (objM15593p == coroutineSingletons) {
            return coroutineSingletons;
        }
        pausableMonotonicFrameClock = this;
        InterfaceC5297b0 interfaceC5297b0 = pausableMonotonicFrameClock.f3039a;
        pausableMonotonicFrameClock$withFrameNanos$1.f3041d = null;
        pausableMonotonicFrameClock$withFrameNanos$1.f3042e = null;
        pausableMonotonicFrameClock$withFrameNanos$1.f3045h = 2;
        objMo1581U = interfaceC5297b0.mo1581U(interfaceC2052l, pausableMonotonicFrameClock$withFrameNanos$1);
        return objMo1581U == coroutineSingletons ? coroutineSingletons : objMo1581U;
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: m0 */
    public final CoroutineContext mo1473m0(CoroutineContext.InterfaceC6758b<?> interfaceC6758b) {
        C5207g.m11111f(interfaceC6758b, "key");
        return CoroutineContext.InterfaceC6757a.a.m13472b(this, interfaceC6758b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: w */
    public final <E extends CoroutineContext.InterfaceC6757a> E mo1474w(CoroutineContext.InterfaceC6758b<E> interfaceC6758b) {
        C5207g.m11111f(interfaceC6758b, "key");
        return (E) CoroutineContext.InterfaceC6757a.a.m13471a(this, interfaceC6758b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: y0 */
    public final <R> R mo1475y0(R r10, InterfaceC2056p<? super R, ? super CoroutineContext.InterfaceC6757a, ? extends R> interfaceC2056p) {
        C5207g.m11111f(interfaceC2056p, "operation");
        return interfaceC2056p.mo1337m0(r10, this);
    }
}
