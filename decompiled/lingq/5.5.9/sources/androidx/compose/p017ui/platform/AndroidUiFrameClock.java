package androidx.compose.p017ui.platform;

import android.view.Choreographer;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import dm.C5207g;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import no.C7843k;
import no.InterfaceC7840j;
import p081e0.InterfaceC5297b0;
import p260m8.C7499b;
import p349qo.C8656b;
import p464wl.InterfaceC9968c;
import p464wl.InterfaceC9969d;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidUiFrameClock implements InterfaceC5297b0 {

    /* JADX INFO: renamed from: a */
    public final Choreographer f4120a;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidUiFrameClock$a */
    public static final class ChoreographerFrameCallbackC0586a implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC7840j<R> f4121a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC2052l<Long, R> f4122b;

        public ChoreographerFrameCallbackC0586a(C7843k c7843k, AndroidUiFrameClock androidUiFrameClock, InterfaceC2052l interfaceC2052l) {
            this.f4121a = c7843k;
            this.f4122b = interfaceC2052l;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            Object objM14967u;
            try {
                objM14967u = this.f4122b.mo528n(Long.valueOf(j10));
            } catch (Throwable th2) {
                objM14967u = C7499b.m14967u(th2);
            }
            this.f4121a.mo2031y(objM14967u);
        }
    }

    public AndroidUiFrameClock(Choreographer choreographer) {
        this.f4120a = choreographer;
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: C */
    public final CoroutineContext mo1471C(CoroutineContext coroutineContext) {
        C5207g.m11111f(coroutineContext, "context");
        return CoroutineContext.DefaultImpls.m13470a(this, coroutineContext);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p081e0.InterfaceC5297b0
    /* JADX INFO: renamed from: U */
    public final <R> Object mo1581U(InterfaceC2052l<? super Long, ? extends R> interfaceC2052l, InterfaceC9968c<? super R> interfaceC9968c) {
        CoroutineContext.InterfaceC6757a interfaceC6757aMo1474w = interfaceC9968c.mo2029e().mo1474w(InterfaceC9969d.a.f50692a);
        final AndroidUiDispatcher androidUiDispatcher = interfaceC6757aMo1474w instanceof AndroidUiDispatcher ? (AndroidUiDispatcher) interfaceC6757aMo1474w : null;
        C7843k c7843k = new C7843k(1, C8656b.m16874A(interfaceC9968c));
        c7843k.m15594r();
        final ChoreographerFrameCallbackC0586a choreographerFrameCallbackC0586a = new ChoreographerFrameCallbackC0586a(c7843k, this, interfaceC2052l);
        if (androidUiDispatcher == null || !C5207g.m11106a(androidUiDispatcher.f4108c, this.f4120a)) {
            this.f4120a.postFrameCallback(choreographerFrameCallbackC0586a);
            c7843k.mo15577R(new InterfaceC2052l<Throwable, C9072e>() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(Throwable th2) {
                    this.f4125b.f4120a.removeFrameCallback(choreographerFrameCallbackC0586a);
                    return C9072e.f47360a;
                }
            });
        } else {
            synchronized (androidUiDispatcher.f4110e) {
                androidUiDispatcher.f4112g.add(choreographerFrameCallbackC0586a);
                if (!androidUiDispatcher.f4115j) {
                    androidUiDispatcher.f4115j = true;
                    androidUiDispatcher.f4108c.postFrameCallback(androidUiDispatcher.f4116k);
                }
                C9072e c9072e = C9072e.f47360a;
            }
            c7843k.mo15577R(new InterfaceC2052l<Throwable, C9072e>() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(Throwable th2) {
                    AndroidUiDispatcher androidUiDispatcher2 = androidUiDispatcher;
                    Choreographer.FrameCallback frameCallback = choreographerFrameCallbackC0586a;
                    androidUiDispatcher2.getClass();
                    C5207g.m11111f(frameCallback, "callback");
                    synchronized (androidUiDispatcher2.f4110e) {
                        androidUiDispatcher2.f4112g.remove(frameCallback);
                    }
                    return C9072e.f47360a;
                }
            });
        }
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
