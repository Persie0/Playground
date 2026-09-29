package androidx.compose.material3.internal.ripple;

import androidx.compose.animation.core.C0059a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.InterfaceC0025an;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.internal.ripple.RippleNode$onAttach$1$1$3", m4291f = "Ripple.kt", m4292l = {276}, m4293m = "invokeSuspend", m4294v = 1)
final class RippleNode$onAttach$1$1$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3516a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0248b f3517b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0025an f3518c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleNode$onAttach$1$1$3(AbstractC0248b abstractC0248b, InterfaceC0025an interfaceC0025an, Continuation continuation) {
        super(2, continuation);
        this.f3517b = abstractC0248b;
        this.f3518c = interfaceC0025an;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RippleNode$onAttach$1$1$3(this.f3517b, this.f3518c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((RippleNode$onAttach$1$1$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3516a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0059a c0059a = this.f3517b.f3532S;
            Float f = new Float(0.0f);
            this.f3516a = 1;
            if (C0059a.m744c(c0059a, f, this.f3518c, null, this, 12) == coroutineSingletons) {
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
