package androidx.compose.foundation;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.sv3;
import p000.un1;
import p000.v56;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.AbstractClickableNode$emitHoverExit$1$1$1", m4291f = "Clickable.kt", m4292l = {2148}, m4293m = "invokeSuspend", m4294v = 1)
final class AbstractClickableNode$emitHoverExit$1$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f1601a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v56 f1602b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sv3 f1603c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$emitHoverExit$1$1$1(v56 v56Var, sv3 sv3Var, Continuation continuation) {
        super(2, continuation);
        this.f1602b = v56Var;
        this.f1603c = sv3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AbstractClickableNode$emitHoverExit$1$1$1(this.f1602b, this.f1603c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AbstractClickableNode$emitHoverExit$1$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1601a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f1601a = 1;
            if (this.f1602b.m23125a(this.f1603c, this) == coroutineSingletons) {
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
