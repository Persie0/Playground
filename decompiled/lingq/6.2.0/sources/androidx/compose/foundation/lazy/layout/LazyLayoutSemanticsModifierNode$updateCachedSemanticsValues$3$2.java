package androidx.compose.foundation.lazy.layout;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.nu4;
import p000.su4;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2", m4291f = "LazyLayoutSemantics.kt", m4292l = {213}, m4293m = "invokeSuspend", m4294v = 1)
final class LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2533a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ su4 f2534b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f2535c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2(su4 su4Var, int i, Continuation continuation) {
        super(2, continuation);
        this.f2534b = su4Var;
        this.f2535c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2(this.f2534b, this.f2535c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2533a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            nu4 nu4Var = this.f2534b.f61411K;
            this.f2533a = 1;
            if (nu4Var.mo991e(this.f2535c, this) == coroutineSingletons) {
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
