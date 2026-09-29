package androidx.compose.animation;

import androidx.compose.animation.core.AnimationEndReason;
import androidx.compose.animation.core.C0059a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.C3801ym;
import p000.InterfaceC0025an;
import p000.c32;
import p000.n84;
import p000.un1;
import p000.xfa;
import p000.z89;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1", m4291f = "AnimationModifier.kt", m4292l = {242}, m4293m = "invokeSuspend", m4294v = 1)
final class SizeAnimationModifierNode$animateTo$data$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f1478a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z89 f1479b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f1480c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0073l f1481d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeAnimationModifierNode$animateTo$data$1$1(z89 z89Var, long j, C0073l c0073l, Continuation continuation) {
        super(2, continuation);
        this.f1479b = z89Var;
        this.f1480c = j;
        this.f1481d = c0073l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SizeAnimationModifierNode$animateTo$data$1$1(this.f1479b, this.f1480c, this.f1481d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SizeAnimationModifierNode$animateTo$data$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1478a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0059a c0059a = this.f1479b.f71094a;
            n84 n84Var = new n84(this.f1480c);
            InterfaceC0025an interfaceC0025an = this.f1481d.f1593K;
            this.f1478a = 1;
            obj = C0059a.m744c(c0059a, n84Var, interfaceC0025an, null, this, 12);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        AnimationEndReason animationEndReason = ((C3801ym) obj).f70048b;
        AnimationEndReason animationEndReason2 = AnimationEndReason.BoundReached;
        return xfa.f68157a;
    }
}
