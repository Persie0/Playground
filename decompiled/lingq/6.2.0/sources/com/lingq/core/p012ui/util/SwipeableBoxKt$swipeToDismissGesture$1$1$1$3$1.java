package com.lingq.core.p012ui.util;

import androidx.compose.animation.core.C0059a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.gq6;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.ui.util.SwipeableBoxKt$swipeToDismissGesture$1$1$1$3$1", m4291f = "SwipeableBox.kt", m4292l = {73}, m4293m = "invokeSuspend", m4294v = 2)
final class SwipeableBoxKt$swipeToDismissGesture$1$1$1$3$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24166a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0059a f24167b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gq6 f24168c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableBoxKt$swipeToDismissGesture$1$1$1$3$1(C0059a c0059a, gq6 gq6Var, Continuation continuation) {
        super(2, continuation);
        this.f24167b = c0059a;
        this.f24168c = gq6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SwipeableBoxKt$swipeToDismissGesture$1$1$1$3$1(this.f24167b, this.f24168c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SwipeableBoxKt$swipeToDismissGesture$1$1$1$3$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24166a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0059a c0059a = this.f24167b;
            Float f = new Float(Float.intBitsToFloat((int) (this.f24168c.f41189a >> 32)) + ((Number) c0059a.m745d()).floatValue());
            this.f24166a = 1;
            if (c0059a.m747f(f, this) == coroutineSingletons) {
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
