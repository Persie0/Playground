package kotlinx.coroutines;

import cm.InterfaceC2056p;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import no.C7823d0;
import no.C7863q1;
import no.C7866r1;
import no.InterfaceC7876w;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10223b;

/* JADX INFO: loaded from: classes2.dex */
public final class CoroutineContextKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public static final CoroutineContext m14307a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final boolean z10) {
        boolean zM14308b = m14308b(coroutineContext);
        boolean zM14308b2 = m14308b(coroutineContext2);
        if (!zM14308b && !zM14308b2) {
            return coroutineContext.mo1471C(coroutineContext2);
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f38127a = coroutineContext2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f38093a;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.mo1475y0(emptyCoroutineContext, new InterfaceC2056p<CoroutineContext, CoroutineContext.InterfaceC6757a, CoroutineContext>() { // from class: kotlinx.coroutines.CoroutineContextKt$foldCopies$folded$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Type inference failed for: r1v5, types: [T, kotlin.coroutines.CoroutineContext] */
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final CoroutineContext mo1337m0(CoroutineContext coroutineContext4, CoroutineContext.InterfaceC6757a interfaceC6757a) {
                CoroutineContext coroutineContext5 = coroutineContext4;
                CoroutineContext.InterfaceC6757a interfaceC6757a2 = interfaceC6757a;
                if (!(interfaceC6757a2 instanceof InterfaceC7876w)) {
                    return coroutineContext5.mo1471C(interfaceC6757a2);
                }
                Ref$ObjectRef<CoroutineContext> ref$ObjectRef2 = ref$ObjectRef;
                if (ref$ObjectRef2.f38127a.mo1474w(interfaceC6757a2.getKey()) != null) {
                    ref$ObjectRef2.f38127a = ref$ObjectRef2.f38127a.mo1473m0(interfaceC6757a2.getKey());
                    return coroutineContext5.mo1471C(((InterfaceC7876w) interfaceC6757a2).m15623l1());
                }
                InterfaceC7876w interfaceC7876wM15622I0 = (InterfaceC7876w) interfaceC6757a2;
                if (z10) {
                    interfaceC7876wM15622I0 = interfaceC7876wM15622I0.m15622I0();
                }
                return coroutineContext5.mo1471C(interfaceC7876wM15622I0);
            }
        });
        if (zM14308b2) {
            ref$ObjectRef.f38127a = ((CoroutineContext) ref$ObjectRef.f38127a).mo1475y0(emptyCoroutineContext, new InterfaceC2056p<CoroutineContext, CoroutineContext.InterfaceC6757a, CoroutineContext>() { // from class: kotlinx.coroutines.CoroutineContextKt$foldCopies$1
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final CoroutineContext mo1337m0(CoroutineContext coroutineContext4, CoroutineContext.InterfaceC6757a interfaceC6757a) {
                    CoroutineContext coroutineContext5 = coroutineContext4;
                    CoroutineContext.InterfaceC6757a interfaceC6757a2 = interfaceC6757a;
                    return interfaceC6757a2 instanceof InterfaceC7876w ? coroutineContext5.mo1471C(((InterfaceC7876w) interfaceC6757a2).m15622I0()) : coroutineContext5.mo1471C(interfaceC6757a2);
                }
            });
        }
        return coroutineContext3.mo1471C((CoroutineContext) ref$ObjectRef.f38127a);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m14308b(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.mo1475y0(Boolean.FALSE, new InterfaceC2056p<Boolean, CoroutineContext.InterfaceC6757a, Boolean>() { // from class: kotlinx.coroutines.CoroutineContextKt$hasCopyableElements$1
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Boolean mo1337m0(Boolean bool, CoroutineContext.InterfaceC6757a interfaceC6757a) {
                return Boolean.valueOf(bool.booleanValue() || (interfaceC6757a instanceof InterfaceC7876w));
            }
        })).booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public static final C7863q1<?> m14309c(InterfaceC9968c<?> interfaceC9968c, CoroutineContext coroutineContext, Object obj) {
        C7863q1<?> c7863q1 = null;
        if (!(interfaceC9968c instanceof InterfaceC10223b)) {
            return null;
        }
        if (!(coroutineContext.mo1474w(C7866r1.f42959a) != null)) {
            return null;
        }
        InterfaceC10223b interfaceC10223bMo13473d = (InterfaceC10223b) interfaceC9968c;
        while (!(interfaceC10223bMo13473d instanceof C7823d0) && (interfaceC10223bMo13473d = interfaceC10223bMo13473d.mo13473d()) != null) {
            if (interfaceC10223bMo13473d instanceof C7863q1) {
                c7863q1 = (C7863q1) interfaceC10223bMo13473d;
                break;
            }
        }
        if (c7863q1 != null) {
            c7863q1.f42957d.set(new Pair<>(coroutineContext, obj));
        }
        return c7863q1;
    }
}
