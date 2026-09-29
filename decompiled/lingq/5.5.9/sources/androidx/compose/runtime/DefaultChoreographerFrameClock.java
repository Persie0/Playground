package androidx.compose.runtime;

import android.view.Choreographer;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import dm.C5207g;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.internal.C7162l;
import kotlinx.coroutines.scheduling.C7178b;
import no.C7828f;
import no.C7832g0;
import no.C7843k;
import no.InterfaceC7840j;
import p081e0.InterfaceC5297b0;
import p260m8.C7499b;
import p349qo.C8656b;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultChoreographerFrameClock implements InterfaceC5297b0 {

    /* JADX INFO: renamed from: a */
    public static final DefaultChoreographerFrameClock f3022a = new DefaultChoreographerFrameClock();

    /* JADX INFO: renamed from: b */
    public static final Choreographer f3023b;

    /* JADX INFO: renamed from: androidx.compose.runtime.DefaultChoreographerFrameClock$a */
    public static final class ChoreographerFrameCallbackC0467a implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC7840j<R> f3024a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC2052l<Long, R> f3025b;

        public ChoreographerFrameCallbackC0467a(C7843k c7843k, InterfaceC2052l interfaceC2052l) {
            this.f3024a = c7843k;
            this.f3025b = interfaceC2052l;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            Object objM14967u;
            DefaultChoreographerFrameClock defaultChoreographerFrameClock = DefaultChoreographerFrameClock.f3022a;
            try {
                objM14967u = this.f3025b.mo528n(Long.valueOf(j10));
            } catch (Throwable th2) {
                objM14967u = C7499b.m14967u(th2);
            }
            this.f3024a.mo2031y(objM14967u);
        }
    }

    static {
        C7178b c7178b = C7832g0.f42930a;
        f3023b = (Choreographer) C7828f.m15572f(C7162l.f40438a.mo14316C1(), new DefaultChoreographerFrameClock$choreographer$1(null));
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: C */
    public final CoroutineContext mo1471C(CoroutineContext coroutineContext) {
        C5207g.m11111f(coroutineContext, "context");
        return CoroutineContext.DefaultImpls.m13470a(this, coroutineContext);
    }

    @Override // p081e0.InterfaceC5297b0
    /* JADX INFO: renamed from: U */
    public final <R> Object mo1581U(InterfaceC2052l<? super Long, ? extends R> interfaceC2052l, InterfaceC9968c<? super R> interfaceC9968c) {
        C7843k c7843k = new C7843k(1, C8656b.m16874A(interfaceC9968c));
        c7843k.m15594r();
        final ChoreographerFrameCallbackC0467a choreographerFrameCallbackC0467a = new ChoreographerFrameCallbackC0467a(c7843k, interfaceC2052l);
        f3023b.postFrameCallback(choreographerFrameCallbackC0467a);
        c7843k.mo15577R(new InterfaceC2052l<Throwable, C9072e>() { // from class: androidx.compose.runtime.DefaultChoreographerFrameClock$withFrameNanos$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(Throwable th2) {
                DefaultChoreographerFrameClock.f3023b.removeFrameCallback(choreographerFrameCallbackC0467a);
                return C9072e.f47360a;
            }
        });
        Object objM15593p = c7843k.m15593p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM15593p;
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
