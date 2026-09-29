package kotlin.coroutines;

import cm.InterfaceC2056p;
import dm.C5207g;
import p464wl.InterfaceC9969d;

/* JADX INFO: loaded from: classes2.dex */
public interface CoroutineContext {

    public static final class DefaultImpls {
        /* JADX INFO: renamed from: a */
        public static CoroutineContext m13470a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
            C5207g.m11111f(coroutineContext2, "context");
            return coroutineContext2 == EmptyCoroutineContext.f38093a ? coroutineContext : (CoroutineContext) coroutineContext2.mo1475y0(coroutineContext, new InterfaceC2056p<CoroutineContext, InterfaceC6757a, CoroutineContext>() { // from class: kotlin.coroutines.CoroutineContext$plus$1
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final CoroutineContext mo1337m0(CoroutineContext coroutineContext3, CoroutineContext.InterfaceC6757a interfaceC6757a) {
                    CombinedContext combinedContext;
                    CoroutineContext coroutineContext4 = coroutineContext3;
                    CoroutineContext.InterfaceC6757a interfaceC6757a2 = interfaceC6757a;
                    C5207g.m11111f(coroutineContext4, "acc");
                    C5207g.m11111f(interfaceC6757a2, "element");
                    CoroutineContext coroutineContextMo1473m0 = coroutineContext4.mo1473m0(interfaceC6757a2.getKey());
                    EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f38093a;
                    if (coroutineContextMo1473m0 == emptyCoroutineContext) {
                        return interfaceC6757a2;
                    }
                    int i10 = InterfaceC9969d.f50691G;
                    InterfaceC9969d.a aVar = InterfaceC9969d.a.f50692a;
                    InterfaceC9969d interfaceC9969d = (InterfaceC9969d) coroutineContextMo1473m0.mo1474w(aVar);
                    if (interfaceC9969d == null) {
                        combinedContext = new CombinedContext(interfaceC6757a2, coroutineContextMo1473m0);
                    } else {
                        CoroutineContext coroutineContextMo1473m1 = coroutineContextMo1473m0.mo1473m0(aVar);
                        if (coroutineContextMo1473m1 == emptyCoroutineContext) {
                            return new CombinedContext(interfaceC9969d, interfaceC6757a2);
                        }
                        combinedContext = new CombinedContext(interfaceC9969d, new CombinedContext(interfaceC6757a2, coroutineContextMo1473m1));
                    }
                    return combinedContext;
                }
            });
        }
    }

    /* JADX INFO: renamed from: kotlin.coroutines.CoroutineContext$a */
    public interface InterfaceC6757a extends CoroutineContext {

        /* JADX INFO: renamed from: kotlin.coroutines.CoroutineContext$a$a */
        public static final class a {
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: a */
            public static <E extends InterfaceC6757a> E m13471a(InterfaceC6757a interfaceC6757a, InterfaceC6758b<E> interfaceC6758b) {
                C5207g.m11111f(interfaceC6758b, "key");
                if (C5207g.m11106a(interfaceC6757a.getKey(), interfaceC6758b)) {
                    return interfaceC6757a;
                }
                return null;
            }

            /* JADX INFO: renamed from: b */
            public static CoroutineContext m13472b(InterfaceC6757a interfaceC6757a, InterfaceC6758b<?> interfaceC6758b) {
                C5207g.m11111f(interfaceC6758b, "key");
                return C5207g.m11106a(interfaceC6757a.getKey(), interfaceC6758b) ? EmptyCoroutineContext.f38093a : interfaceC6757a;
            }
        }

        InterfaceC6758b<?> getKey();
    }

    /* JADX INFO: renamed from: kotlin.coroutines.CoroutineContext$b */
    public interface InterfaceC6758b<E extends InterfaceC6757a> {
    }

    /* JADX INFO: renamed from: C */
    CoroutineContext mo1471C(CoroutineContext coroutineContext);

    /* JADX INFO: renamed from: m0 */
    CoroutineContext mo1473m0(InterfaceC6758b<?> interfaceC6758b);

    /* JADX INFO: renamed from: w */
    <E extends InterfaceC6757a> E mo1474w(InterfaceC6758b<E> interfaceC6758b);

    /* JADX INFO: renamed from: y0 */
    <R> R mo1475y0(R r10, InterfaceC2056p<? super R, ? super InterfaceC6757a, ? extends R> interfaceC2056p);
}
