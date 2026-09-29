package androidx.compose.material3;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.C3229i;
import p000.C3386nv;
import p000.C3602t8;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.ThumbNode$onAttach$1", m4291f = "Switch.kt", m4292l = {253}, m4293m = "invokeSuspend", m4294v = 1)
final class ThumbNode$onAttach$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3351a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0250j0 f3352b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThumbNode$onAttach$1(C0250j0 c0250j0, Continuation continuation) {
        super(2, continuation);
        this.f3352b = c0250j0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ThumbNode$onAttach$1(this.f3352b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ThumbNode$onAttach$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3351a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            C0250j0 c0250j0 = this.f3352b;
            C3229i c3229i = c0250j0.f3539J.f64886a;
            C3602t8 c3602t8 = new C3602t8(15, ref$IntRef, c0250j0);
            this.f3351a = 1;
            c3229i.getClass();
            if (C3229i.m15548j(c3229i, c3602t8, this) == coroutineSingletons) {
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
