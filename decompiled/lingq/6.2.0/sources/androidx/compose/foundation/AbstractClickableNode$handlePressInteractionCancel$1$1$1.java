package androidx.compose.foundation;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.ci2;
import p000.kj7;
import p000.un1;
import p000.v56;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionCancel$1$1$1", m4291f = "Clickable.kt", m4292l = {2118}, m4293m = "invokeSuspend", m4294v = 1)
final class AbstractClickableNode$handlePressInteractionCancel$1$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f1604a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v56 f1605b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kj7 f1606c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ci2 f1607d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteractionCancel$1$1$1(v56 v56Var, kj7 kj7Var, ci2 ci2Var, Continuation continuation) {
        super(2, continuation);
        this.f1605b = v56Var;
        this.f1606c = kj7Var;
        this.f1607d = ci2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AbstractClickableNode$handlePressInteractionCancel$1$1$1(this.f1605b, this.f1606c, this.f1607d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AbstractClickableNode$handlePressInteractionCancel$1$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1604a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f1604a = 1;
            if (this.f1605b.m23125a(this.f1606c, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        ci2 ci2Var = this.f1607d;
        if (ci2Var != null) {
            ci2Var.mo125a();
        }
        return xfa.f68157a;
    }
}
