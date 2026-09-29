package androidx.compose.foundation;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.lj7;
import p000.mj7;
import p000.un1;
import p000.v56;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2", m4291f = "Clickable.kt", m4292l = {1949}, m4293m = "invokeSuspend", m4294v = 1)
final class AbstractClickableNode$onKeyEvent$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f1639a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0075a f1640b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lj7 f1641c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$onKeyEvent$2(AbstractC0075a abstractC0075a, lj7 lj7Var, Continuation continuation) {
        super(2, continuation);
        this.f1640b = abstractC0075a;
        this.f1641c = lj7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AbstractClickableNode$onKeyEvent$2(this.f1640b, this.f1641c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AbstractClickableNode$onKeyEvent$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1639a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            v56 v56Var = this.f1640b.f1717L;
            if (v56Var != null) {
                mj7 mj7Var = new mj7(this.f1641c);
                this.f1639a = 1;
                if (v56Var.m23125a(mj7Var, this) == coroutineSingletons) {
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
