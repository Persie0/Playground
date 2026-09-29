package p000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C3229i;

/* JADX INFO: loaded from: classes.dex */
public final class v56 {

    /* JADX INFO: renamed from: a */
    public final C3229i f64886a = pb1.m19034d(1, BufferOverflow.DROP_OLDEST);

    /* JADX INFO: renamed from: a */
    public final Object m23125a(q84 q84Var, Continuation continuation) throws Throwable {
        Object objEmit = this.f64886a.emit(q84Var, continuation);
        return objEmit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEmit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m23126b(q84 q84Var) {
        return this.f64886a.m15558p(q84Var);
    }
}
