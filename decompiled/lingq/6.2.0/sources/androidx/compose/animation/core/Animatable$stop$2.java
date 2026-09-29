package androidx.compose.animation.core;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.animation.core.Animatable$stop$2", m4291f = "Animatable.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
final class Animatable$stop$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0059a f1501a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$stop$2(C0059a c0059a, Continuation continuation) {
        super(1, continuation);
        this.f1501a = c0059a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Animatable$stop$2(this.f1501a, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Throwable {
        Animatable$stop$2 animatable$stop$2 = (Animatable$stop$2) create((Continuation) obj);
        xfa xfaVar = xfa.f68157a;
        animatable$stop$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C0059a.m743b(this.f1501a);
        return xfa.f68157a;
    }
}
