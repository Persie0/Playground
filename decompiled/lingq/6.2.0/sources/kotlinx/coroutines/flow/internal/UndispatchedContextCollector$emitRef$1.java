package kotlinx.coroutines.flow.internal;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.e83;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", m4291f = "ChannelFlow.kt", m4292l = {208}, m4293m = "invokeSuspend", m4294v = 1)
final class UndispatchedContextCollector$emitRef$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f48130a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f48131b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ e83 f48132c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UndispatchedContextCollector$emitRef$1(e83 e83Var, Continuation continuation) {
        super(2, continuation);
        this.f48132c = e83Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UndispatchedContextCollector$emitRef$1 undispatchedContextCollector$emitRef$1 = new UndispatchedContextCollector$emitRef$1(this.f48132c, continuation);
        undispatchedContextCollector$emitRef$1.f48131b = obj;
        return undispatchedContextCollector$emitRef$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((UndispatchedContextCollector$emitRef$1) create(obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = this.f48131b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f48130a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f48131b = null;
            this.f48130a = 1;
            if (this.f48132c.emit(obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
