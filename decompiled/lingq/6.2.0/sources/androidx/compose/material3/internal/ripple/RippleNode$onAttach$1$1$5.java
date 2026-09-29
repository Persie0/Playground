package androidx.compose.material3.internal.ripple;

import androidx.compose.animation.core.C0059a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.internal.ripple.RippleNode$onAttach$1$1$5", m4291f = "Ripple.kt", m4292l = {297}, m4293m = "invokeSuspend", m4294v = 1)
final class RippleNode$onAttach$1$1$5 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3519a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0248b f3520b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleNode$onAttach$1$1$5(AbstractC0248b abstractC0248b, Continuation continuation) {
        super(2, continuation);
        this.f3520b = abstractC0248b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RippleNode$onAttach$1$1$5(this.f3520b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((RippleNode$onAttach$1$1$5) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3519a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0059a c0059a = this.f3520b.f3535V;
            Float f = new Float(0.0f);
            this.f3519a = 1;
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
