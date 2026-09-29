package androidx.compose.foundation;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.kj7;
import p000.lj7;
import p000.un1;
import p000.v56;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.AbstractClickableNode$onFocusChange$1$1", m4291f = "Clickable.kt", m4292l = {1845}, m4293m = "invokeSuspend", m4294v = 1)
final class AbstractClickableNode$onFocusChange$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f1630a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0075a f1631b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lj7 f1632c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$onFocusChange$1$1(AbstractC0075a abstractC0075a, lj7 lj7Var, Continuation continuation) {
        super(2, continuation);
        this.f1631b = abstractC0075a;
        this.f1632c = lj7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AbstractClickableNode$onFocusChange$1$1(this.f1631b, this.f1632c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AbstractClickableNode$onFocusChange$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1630a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            v56 v56Var = this.f1631b.f1717L;
            if (v56Var != null) {
                kj7 kj7Var = new kj7(this.f1632c);
                this.f1630a = 1;
                if (v56Var.m23125a(kj7Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
