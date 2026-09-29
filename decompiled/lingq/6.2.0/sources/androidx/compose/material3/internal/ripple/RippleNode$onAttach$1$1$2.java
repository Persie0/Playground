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
@c32(m4290c = "androidx.compose.material3.internal.ripple.RippleNode$onAttach$1$1$2", m4291f = "Ripple.kt", m4292l = {271}, m4293m = "invokeSuspend", m4294v = 1)
final class RippleNode$onAttach$1$1$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3512a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0248b f3513b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f3514c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC0025an f3515d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleNode$onAttach$1$1$2(AbstractC0248b abstractC0248b, float f, InterfaceC0025an interfaceC0025an, Continuation continuation) {
        super(2, continuation);
        this.f3513b = abstractC0248b;
        this.f3514c = f;
        this.f3515d = interfaceC0025an;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RippleNode$onAttach$1$1$2(this.f3513b, this.f3514c, this.f3515d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((RippleNode$onAttach$1$1$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3512a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0059a c0059a = this.f3513b.f3532S;
            Float f = new Float(this.f3514c);
            this.f3512a = 1;
            if (C0059a.m744c(c0059a, f, this.f3515d, null, this, 12) == coroutineSingletons) {
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
