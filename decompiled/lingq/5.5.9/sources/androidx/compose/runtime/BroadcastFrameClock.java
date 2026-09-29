package androidx.compose.runtime;

import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import no.C7843k;
import p081e0.InterfaceC5297b0;
import p260m8.C7499b;
import p349qo.C8656b;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class BroadcastFrameClock implements InterfaceC5297b0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2041a<C9072e> f2872a;

    /* JADX INFO: renamed from: c */
    public Throwable f2874c;

    /* JADX INFO: renamed from: b */
    public final Object f2873b = new Object();

    /* JADX INFO: renamed from: d */
    public List<C0464a<?>> f2875d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public List<C0464a<?>> f2876e = new ArrayList();

    /* JADX INFO: renamed from: androidx.compose.runtime.BroadcastFrameClock$a */
    public static final class C0464a<R> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC2052l<Long, R> f2877a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC9968c<R> f2878b;

        public C0464a(InterfaceC2052l interfaceC2052l, C7843k c7843k) {
            C5207g.m11111f(interfaceC2052l, "onFrame");
            this.f2877a = interfaceC2052l;
            this.f2878b = c7843k;
        }
    }

    public BroadcastFrameClock(InterfaceC2041a<C9072e> interfaceC2041a) {
        this.f2872a = interfaceC2041a;
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: C */
    public final CoroutineContext mo1471C(CoroutineContext coroutineContext) {
        C5207g.m11111f(coroutineContext, "context");
        return CoroutineContext.DefaultImpls.m13470a(this, coroutineContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, androidx.compose.runtime.BroadcastFrameClock$a] */
    @Override // p081e0.InterfaceC5297b0
    /* JADX INFO: renamed from: U */
    public final <R> Object mo1581U(InterfaceC2052l<? super Long, ? extends R> interfaceC2052l, InterfaceC9968c<? super R> interfaceC9968c) {
        InterfaceC2041a<C9072e> interfaceC2041a;
        C7843k c7843k = new C7843k(1, C8656b.m16874A(interfaceC9968c));
        c7843k.m15594r();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (this.f2873b) {
            Throwable th2 = this.f2874c;
            if (th2 != null) {
                c7843k.mo2031y(C7499b.m14967u(th2));
            } else {
                ref$ObjectRef.f38127a = new C0464a(interfaceC2052l, c7843k);
                boolean z10 = !this.f2875d.isEmpty();
                List<C0464a<?>> list = this.f2875d;
                T t10 = ref$ObjectRef.f38127a;
                if (t10 == 0) {
                    C5207g.m11117l("awaiter");
                    throw null;
                }
                list.add((C0464a) t10);
                boolean z11 = !z10;
                c7843k.mo15577R(new InterfaceC2052l<Throwable, C9072e>() { // from class: androidx.compose.runtime.BroadcastFrameClock$withFrameNanos$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(Throwable th3) {
                        BroadcastFrameClock broadcastFrameClock = this.f2879b;
                        Object obj = broadcastFrameClock.f2873b;
                        Ref$ObjectRef<BroadcastFrameClock.C0464a<R>> ref$ObjectRef2 = ref$ObjectRef;
                        synchronized (obj) {
                            List<BroadcastFrameClock.C0464a<?>> list2 = broadcastFrameClock.f2875d;
                            T t11 = ref$ObjectRef2.f38127a;
                            if (t11 == 0) {
                                C5207g.m11117l("awaiter");
                                throw null;
                            }
                            list2.remove((BroadcastFrameClock.C0464a) t11);
                        }
                        return C9072e.f47360a;
                    }
                });
                if (z11 && (interfaceC2041a = this.f2872a) != null) {
                    try {
                        interfaceC2041a.mo807E();
                    } catch (Throwable th3) {
                        synchronized (this.f2873b) {
                            try {
                                if (this.f2874c == null) {
                                    this.f2874c = th3;
                                    List<C0464a<?>> list2 = this.f2875d;
                                    int size = list2.size();
                                    for (int i10 = 0; i10 < size; i10++) {
                                        list2.get(i10).f2878b.mo2031y(C7499b.m14967u(th3));
                                    }
                                    this.f2875d.clear();
                                    C9072e c9072e = C9072e.f47360a;
                                }
                            } finally {
                            }
                        }
                    }
                }
            }
        }
        Object objM15593p = c7843k.m15593p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM15593p;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1582c() {
        boolean z10;
        synchronized (this.f2873b) {
            try {
                z10 = !this.f2875d.isEmpty();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: d */
    public final void m1583d(long j10) {
        Object objM14967u;
        synchronized (this.f2873b) {
            List<C0464a<?>> list = this.f2875d;
            this.f2875d = this.f2876e;
            this.f2876e = list;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                C0464a<?> c0464a = list.get(i10);
                c0464a.getClass();
                try {
                    objM14967u = c0464a.f2877a.mo528n(Long.valueOf(j10));
                } catch (Throwable th2) {
                    objM14967u = C7499b.m14967u(th2);
                }
                c0464a.f2878b.mo2031y(objM14967u);
            }
            list.clear();
            C9072e c9072e = C9072e.f47360a;
        }
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
