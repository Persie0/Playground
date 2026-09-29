package androidx.compose.material3;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.SliderKt$SliderImpl$drag$1$1", m4291f = "Slider.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
final class SliderKt$SliderImpl$drag$1$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0228e0 f3261a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$SliderImpl$drag$1$1(C0228e0 c0228e0, Continuation continuation) {
        super(3, continuation);
        this.f3261a = c0228e0;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        ((Number) obj2).floatValue();
        SliderKt$SliderImpl$drag$1$1 sliderKt$SliderImpl$drag$1$1 = new SliderKt$SliderImpl$drag$1$1(this.f3261a, (Continuation) obj3);
        xfa xfaVar = xfa.f68157a;
        sliderKt$SliderImpl$drag$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f3261a.f3414o.mo0a();
        return xfa.f68157a;
    }
}
