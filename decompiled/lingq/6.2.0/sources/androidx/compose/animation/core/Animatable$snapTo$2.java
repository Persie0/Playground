package androidx.compose.animation.core;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.vi3;
import p000.xc9;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.animation.core.Animatable$snapTo$2", m4291f = "Animatable.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
final class Animatable$snapTo$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0059a f1499a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1500b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$snapTo$2(C0059a c0059a, Object obj, Continuation continuation) {
        super(1, continuation);
        this.f1499a = c0059a;
        this.f1500b = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Animatable$snapTo$2(this.f1499a, this.f1500b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Throwable {
        Animatable$snapTo$2 animatable$snapTo$2 = (Animatable$snapTo$2) create((Continuation) obj);
        xfa xfaVar = xfa.f68157a;
        animatable$snapTo$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C0059a c0059a = this.f1499a;
        C0059a.m743b(c0059a);
        Object objM742a = C0059a.m742a(c0059a, this.f1500b);
        ((xc9) c0059a.f1540c.f8704b).setValue(objM742a);
        ((xc9) c0059a.f1542e).setValue(objM742a);
        return xfa.f68157a;
    }
}
