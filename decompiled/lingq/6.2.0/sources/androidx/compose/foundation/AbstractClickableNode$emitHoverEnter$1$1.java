package androidx.compose.foundation;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.rv3;
import p000.un1;
import p000.v56;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.AbstractClickableNode$emitHoverEnter$1$1", m4291f = "Clickable.kt", m4292l = {2138}, m4293m = "invokeSuspend", m4294v = 1)
final class AbstractClickableNode$emitHoverEnter$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f1598a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v56 f1599b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rv3 f1600c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$emitHoverEnter$1$1(v56 v56Var, rv3 rv3Var, Continuation continuation) {
        super(2, continuation);
        this.f1599b = v56Var;
        this.f1600c = rv3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AbstractClickableNode$emitHoverEnter$1$1(this.f1599b, this.f1600c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AbstractClickableNode$emitHoverEnter$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1598a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f1598a = 1;
            if (this.f1599b.m23125a(this.f1600c, this) == coroutineSingletons) {
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
