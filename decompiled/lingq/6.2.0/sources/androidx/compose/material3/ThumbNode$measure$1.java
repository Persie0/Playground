package androidx.compose.material3;

import androidx.compose.animation.core.C0059a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.InterfaceC0025an;
import p000.ap9;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.ThumbNode$measure$1", m4291f = "Switch.kt", m4292l = {306}, m4293m = "invokeSuspend", m4294v = 1)
final class ThumbNode$measure$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3345a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0250j0 f3346b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f3347c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThumbNode$measure$1(C0250j0 c0250j0, float f, Continuation continuation) {
        super(2, continuation);
        this.f3346b = c0250j0;
        this.f3347c = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ThumbNode$measure$1(this.f3346b, this.f3347c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ThumbNode$measure$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3345a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0250j0 c0250j0 = this.f3346b;
            C0059a c0059a = c0250j0.f3544O;
            if (c0059a != null) {
                Float f = new Float(this.f3347c);
                InterfaceC0025an interfaceC0025an = c0250j0.f3542M ? ap9.f7337f : c0250j0.f3541L;
                this.f3345a = 1;
                obj = C0059a.m744c(c0059a, f, interfaceC0025an, null, this, 12);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return xfa.f68157a;
        }
        if (i != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        return xfa.f68157a;
    }
}
