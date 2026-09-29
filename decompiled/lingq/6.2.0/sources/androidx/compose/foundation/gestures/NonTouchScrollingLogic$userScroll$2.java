package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.NonTouchScrollingLogic$userScroll$2", m4291f = "NonTouchScrollingLogic.kt", m4292l = {55}, m4293m = "invokeSuspend", m4294v = 1)
final class NonTouchScrollingLogic$userScroll$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2015a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0107o f2016b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zi3 f2017c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonTouchScrollingLogic$userScroll$2(AbstractC0107o abstractC0107o, zi3 zi3Var, Continuation continuation) {
        super(2, continuation);
        this.f2016b = abstractC0107o;
        this.f2017c = zi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NonTouchScrollingLogic$userScroll$2(this.f2016b, this.f2017c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((NonTouchScrollingLogic$userScroll$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2015a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0116v c0116v = this.f2016b.f2296a;
            MutatePriority mutatePriority = MutatePriority.UserInput;
            this.f2015a = 1;
            if (c0116v.m934f(mutatePriority, this.f2017c, this) == coroutineSingletons) {
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
