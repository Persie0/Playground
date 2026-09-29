package androidx.compose.material3;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.v56;
import p000.wk2;
import p000.xfa;
import p000.xk2;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$7$1", m4291f = "Slider.kt", m4292l = {2881}, m4293m = "invokeSuspend", m4294v = 1)
final class SliderKt$rangeSliderPressDragModifier$1$1$1$7$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3300a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v56 f3301b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xk2 f3302c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$rangeSliderPressDragModifier$1$1$1$7$1(v56 v56Var, xk2 xk2Var, Continuation continuation) {
        super(2, continuation);
        this.f3301b = v56Var;
        this.f3302c = xk2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SliderKt$rangeSliderPressDragModifier$1$1$1$7$1(this.f3301b, this.f3302c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SliderKt$rangeSliderPressDragModifier$1$1$1$7$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3300a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            wk2 wk2Var = new wk2(this.f3302c);
            this.f3300a = 1;
            if (this.f3301b.m23125a(wk2Var, this) == coroutineSingletons) {
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
