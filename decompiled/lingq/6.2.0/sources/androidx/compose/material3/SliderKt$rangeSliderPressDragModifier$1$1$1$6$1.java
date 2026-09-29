package androidx.compose.material3;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.kj7;
import p000.lj7;
import p000.un1;
import p000.v56;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$6$1", m4291f = "Slider.kt", m4292l = {2871}, m4293m = "invokeSuspend", m4294v = 1)
final class SliderKt$rangeSliderPressDragModifier$1$1$1$6$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3297a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v56 f3298b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lj7 f3299c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$rangeSliderPressDragModifier$1$1$1$6$1(v56 v56Var, lj7 lj7Var, Continuation continuation) {
        super(2, continuation);
        this.f3298b = v56Var;
        this.f3299c = lj7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SliderKt$rangeSliderPressDragModifier$1$1$1$6$1(this.f3298b, this.f3299c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SliderKt$rangeSliderPressDragModifier$1$1$1$6$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3297a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            kj7 kj7Var = new kj7(this.f3299c);
            this.f3297a = 1;
            if (this.f3298b.m23125a(kj7Var, this) == coroutineSingletons) {
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
