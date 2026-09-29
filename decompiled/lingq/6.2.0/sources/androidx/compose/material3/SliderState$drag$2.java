package androidx.compose.material3;

import androidx.compose.foundation.C0145m;
import androidx.compose.foundation.MutatePriority;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.t66;
import p000.un1;
import p000.xa9;
import p000.xc9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.SliderState$drag$2", m4291f = "Slider.kt", m4292l = {3163}, m4293m = "invokeSuspend", m4294v = 1)
final class SliderState$drag$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3315a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0228e0 f3316b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MutatePriority f3317c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zi3 f3318d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderState$drag$2(C0228e0 c0228e0, MutatePriority mutatePriority, zi3 zi3Var, Continuation continuation) {
        super(2, continuation);
        this.f3316b = c0228e0;
        this.f3317c = mutatePriority;
        this.f3318d = zi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SliderState$drag$2(this.f3316b, this.f3317c, this.f3318d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SliderState$drag$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C0228e0 c0228e0 = this.f3316b;
        t66 t66Var = c0228e0.f3413n;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3315a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                ((xc9) t66Var).setValue(Boolean.TRUE);
                C0145m c0145m = c0228e0.f3418s;
                xa9 xa9Var = c0228e0.f3417r;
                MutatePriority mutatePriority = this.f3317c;
                zi3 zi3Var = this.f3318d;
                this.f3315a = 1;
                if (c0145m.m1027c(xa9Var, mutatePriority, zi3Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            t66Var = (xc9) t66Var;
            t66Var.setValue(Boolean.FALSE);
            return xfa.f68157a;
        } catch (Throwable th) {
            ((xc9) t66Var).setValue(Boolean.FALSE);
            throw th;
        }
    }
}
