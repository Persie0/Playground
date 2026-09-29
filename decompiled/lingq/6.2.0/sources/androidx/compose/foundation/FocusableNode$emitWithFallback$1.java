package androidx.compose.foundation;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.ci2;
import p000.q84;
import p000.un1;
import p000.v56;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.FocusableNode$emitWithFallback$1", m4291f = "Focusable.kt", m4292l = {322}, m4293m = "invokeSuspend", m4294v = 1)
final class FocusableNode$emitWithFallback$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f1671a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v56 f1672b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ q84 f1673c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ci2 f1674d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusableNode$emitWithFallback$1(v56 v56Var, q84 q84Var, ci2 ci2Var, Continuation continuation) {
        super(2, continuation);
        this.f1672b = v56Var;
        this.f1673c = q84Var;
        this.f1674d = ci2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FocusableNode$emitWithFallback$1(this.f1672b, this.f1673c, this.f1674d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((FocusableNode$emitWithFallback$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1671a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f1671a = 1;
            if (this.f1672b.m23125a(this.f1673c, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        ci2 ci2Var = this.f1674d;
        if (ci2Var != null) {
            ci2Var.mo125a();
        }
        return xfa.f68157a;
    }
}
