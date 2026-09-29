package androidx.compose.foundation;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.cd4;
import p000.f63;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.MarqueeModifierNode$restartAnimation$1", m4291f = "BasicMarquee.kt", m4292l = {390, 391}, m4293m = "invokeSuspend", m4294v = 1)
final class MarqueeModifierNode$restartAnimation$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f1690a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cd4 f1691b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0125l f1692c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarqueeModifierNode$restartAnimation$1(cd4 cd4Var, C0125l c0125l, Continuation continuation) {
        super(2, continuation);
        this.f1691b = cd4Var;
        this.f1692c = c0125l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MarqueeModifierNode$restartAnimation$1(this.f1691b, this.f1692c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((MarqueeModifierNode$restartAnimation$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1690a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            cd4 cd4Var = this.f1691b;
            if (cd4Var != null) {
                this.f1690a = 1;
                if (cd4Var.mo4539q(this) != coroutineSingletons) {
                }
            }
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        this.f1690a = 2;
        Object objM23905G = wfb.m23905G(new MarqueeModifierNode$runAnimation$2(this.f1692c, null), f63.f38513b, this);
        if (objM23905G != coroutineSingletons) {
            objM23905G = xfaVar;
        }
        return objM23905G == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
