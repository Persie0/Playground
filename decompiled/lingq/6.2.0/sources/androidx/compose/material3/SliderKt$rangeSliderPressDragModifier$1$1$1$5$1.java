package androidx.compose.material3;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.lj7;
import p000.mj7;
import p000.un1;
import p000.v56;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$5$1", m4291f = "Slider.kt", m4292l = {2855}, m4293m = "invokeSuspend", m4294v = 1)
final class SliderKt$rangeSliderPressDragModifier$1$1$1$5$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3294a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v56 f3295b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lj7 f3296c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$rangeSliderPressDragModifier$1$1$1$5$1(v56 v56Var, lj7 lj7Var, Continuation continuation) {
        super(2, continuation);
        this.f3295b = v56Var;
        this.f3296c = lj7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SliderKt$rangeSliderPressDragModifier$1$1$1$5$1(this.f3295b, this.f3296c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SliderKt$rangeSliderPressDragModifier$1$1$1$5$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3294a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            mj7 mj7Var = new mj7(this.f3296c);
            this.f3294a = 1;
            if (this.f3295b.m23125a(mj7Var, this) == coroutineSingletons) {
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
