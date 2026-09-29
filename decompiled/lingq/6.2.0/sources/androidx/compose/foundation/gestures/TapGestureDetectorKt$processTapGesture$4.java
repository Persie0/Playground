package androidx.compose.foundation.gestures;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$processTapGesture$4", m4291f = "TapGestureDetector.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
final class TapGestureDetectorKt$processTapGesture$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0108p f2172a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$processTapGesture$4(C0108p c0108p, Continuation continuation) {
        super(2, continuation);
        this.f2172a = c0108p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TapGestureDetectorKt$processTapGesture$4(this.f2172a, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        TapGestureDetectorKt$processTapGesture$4 tapGestureDetectorKt$processTapGesture$4 = (TapGestureDetectorKt$processTapGesture$4) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        tapGestureDetectorKt$processTapGesture$4.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f2172a.m908c();
        return xfa.f68157a;
    }
}
