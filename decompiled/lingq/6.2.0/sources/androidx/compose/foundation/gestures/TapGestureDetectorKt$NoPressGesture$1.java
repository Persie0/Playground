package androidx.compose.foundation.gestures;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.gq6;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", m4291f = "TapGestureDetector.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
final class TapGestureDetectorKt$NoPressGesture$1 extends SuspendLambda implements aj3 {
    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        long j = ((gq6) obj2).f41189a;
        TapGestureDetectorKt$NoPressGesture$1 tapGestureDetectorKt$NoPressGesture$1 = new TapGestureDetectorKt$NoPressGesture$1(3, (Continuation) obj3);
        xfa xfaVar = xfa.f68157a;
        tapGestureDetectorKt$NoPressGesture$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return xfa.f68157a;
    }
}
