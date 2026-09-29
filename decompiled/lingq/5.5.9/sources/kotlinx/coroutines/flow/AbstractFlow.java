package kotlinx.coroutines.flow;

import dm.C5207g;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.SafeCollector;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractFlow<T> implements InterfaceC7116c<T> {
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlinx.coroutines.flow.InterfaceC7116c
    /* JADX INFO: renamed from: a */
    public final Object mo9539a(InterfaceC7117d<? super T> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        AbstractFlow$collect$1 abstractFlow$collect$1;
        Throwable th2;
        SafeCollector safeCollector;
        if (interfaceC9968c instanceof AbstractFlow$collect$1) {
            abstractFlow$collect$1 = (AbstractFlow$collect$1) interfaceC9968c;
            int i10 = abstractFlow$collect$1.f40039g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                abstractFlow$collect$1.f40039g = i10 - Integer.MIN_VALUE;
            } else {
                abstractFlow$collect$1 = new AbstractFlow$collect$1(this, interfaceC9968c);
            }
        } else {
            abstractFlow$collect$1 = new AbstractFlow$collect$1(this, interfaceC9968c);
        }
        Object obj = abstractFlow$collect$1.f40037e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = abstractFlow$collect$1.f40039g;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            safeCollector = abstractFlow$collect$1.f40036d;
            try {
                C7499b.m14977z0(obj);
                safeCollector.mo13475z();
                return C9072e.f47360a;
            } catch (Throwable th3) {
                th2 = th3;
                safeCollector.mo13475z();
                throw th2;
            }
        }
        C7499b.m14977z0(obj);
        CoroutineContext coroutineContext = abstractFlow$collect$1.f38105b;
        C5207g.m11108c(coroutineContext);
        SafeCollector safeCollector2 = new SafeCollector(interfaceC7117d, coroutineContext);
        try {
            abstractFlow$collect$1.f40036d = safeCollector2;
            abstractFlow$collect$1.f40039g = 1;
            Object objMo1337m0 = ((C7136q) this).f40371a.mo1337m0(safeCollector2, abstractFlow$collect$1);
            if (objMo1337m0 != coroutineSingletons) {
                objMo1337m0 = C9072e.f47360a;
            }
            if (objMo1337m0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            safeCollector = safeCollector2;
            safeCollector.mo13475z();
            return C9072e.f47360a;
        } catch (Throwable th4) {
            th2 = th4;
            safeCollector = safeCollector2;
            safeCollector.mo13475z();
            throw th2;
        }
    }
}
