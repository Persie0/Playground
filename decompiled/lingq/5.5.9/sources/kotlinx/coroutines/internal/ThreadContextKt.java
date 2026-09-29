package kotlinx.coroutines.internal;

import cm.InterfaceC2056p;
import dm.C5207g;
import kotlin.coroutines.CoroutineContext;
import no.InterfaceC7854n1;

/* JADX INFO: loaded from: classes2.dex */
public final class ThreadContextKt {

    /* JADX INFO: renamed from: a */
    public static final C7168r f40405a = new C7168r("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2056p<Object, CoroutineContext.InterfaceC6757a, Object> f40406b = new InterfaceC2056p<Object, CoroutineContext.InterfaceC6757a, Object>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$countAll$1
        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Object obj, CoroutineContext.InterfaceC6757a interfaceC6757a) {
            CoroutineContext.InterfaceC6757a interfaceC6757a2 = interfaceC6757a;
            if (interfaceC6757a2 instanceof InterfaceC7854n1) {
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                if (iIntValue == 0) {
                    return interfaceC6757a2;
                }
                obj = Integer.valueOf(iIntValue + 1);
            }
            return obj;
        }
    };

    /* JADX INFO: renamed from: c */
    public static final InterfaceC2056p<InterfaceC7854n1<?>, CoroutineContext.InterfaceC6757a, InterfaceC7854n1<?>> f40407c = new InterfaceC2056p<InterfaceC7854n1<?>, CoroutineContext.InterfaceC6757a, InterfaceC7854n1<?>>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$findOne$1
        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final InterfaceC7854n1<?> mo1337m0(InterfaceC7854n1<?> interfaceC7854n1, CoroutineContext.InterfaceC6757a interfaceC6757a) {
            InterfaceC7854n1<?> interfaceC7854n2 = interfaceC7854n1;
            CoroutineContext.InterfaceC6757a interfaceC6757a2 = interfaceC6757a;
            if (interfaceC7854n2 != null) {
                return interfaceC7854n2;
            }
            if (interfaceC6757a2 instanceof InterfaceC7854n1) {
                return (InterfaceC7854n1) interfaceC6757a2;
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: d */
    public static final InterfaceC2056p<C7174x, CoroutineContext.InterfaceC6757a, C7174x> f40408d = new InterfaceC2056p<C7174x, CoroutineContext.InterfaceC6757a, C7174x>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$updateState$1
        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final C7174x mo1337m0(C7174x c7174x, CoroutineContext.InterfaceC6757a interfaceC6757a) {
            C7174x c7174x2 = c7174x;
            CoroutineContext.InterfaceC6757a interfaceC6757a2 = interfaceC6757a;
            if (interfaceC6757a2 instanceof InterfaceC7854n1) {
                InterfaceC7854n1<Object> interfaceC7854n1 = (InterfaceC7854n1) interfaceC6757a2;
                Object objMo14469t1 = interfaceC7854n1.mo14469t1(c7174x2.f40449a);
                int i10 = c7174x2.f40452d;
                c7174x2.f40450b[i10] = objMo14469t1;
                c7174x2.f40452d = i10 + 1;
                c7174x2.f40451c[i10] = interfaceC7854n1;
            }
            return c7174x2;
        }
    };

    /* JADX INFO: renamed from: a */
    public static final void m14433a(CoroutineContext coroutineContext, Object obj) {
        if (obj == f40405a) {
            return;
        }
        if (obj instanceof C7174x) {
            C7174x c7174x = (C7174x) obj;
            InterfaceC7854n1<Object>[] interfaceC7854n1Arr = c7174x.f40451c;
            int length = interfaceC7854n1Arr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    InterfaceC7854n1<Object> interfaceC7854n1 = interfaceC7854n1Arr[length];
                    C5207g.m11108c(interfaceC7854n1);
                    interfaceC7854n1.mo14468W0(c7174x.f40450b[length]);
                    if (i10 < 0) {
                        return;
                    } else {
                        length = i10;
                    }
                }
            }
        } else {
            Object objMo1475y0 = coroutineContext.mo1475y0(null, f40407c);
            if (objMo1475y0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            }
            ((InterfaceC7854n1) objMo1475y0).mo14468W0(obj);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Object m14434b(CoroutineContext coroutineContext) {
        Object objMo1475y0 = coroutineContext.mo1475y0(0, f40406b);
        C5207g.m11108c(objMo1475y0);
        return objMo1475y0;
    }

    /* JADX INFO: renamed from: c */
    public static final Object m14435c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = m14434b(coroutineContext);
        }
        if (obj == 0) {
            return f40405a;
        }
        return obj instanceof Integer ? coroutineContext.mo1475y0(new C7174x(coroutineContext, ((Number) obj).intValue()), f40408d) : ((InterfaceC7854n1) obj).mo14469t1(coroutineContext);
    }
}
