package androidx.compose.material3.pulltorefresh;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.mp7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPostScroll$1", m4291f = "PullToRefresh.kt", m4292l = {344}, m4293m = "invokeSuspend", m4294v = 1)
final class PullToRefreshModifierNode$onPostScroll$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3586a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0259b f3587b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshModifierNode$onPostScroll$1(C0259b c0259b, Continuation continuation) {
        super(2, continuation);
        this.f3587b = c0259b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PullToRefreshModifierNode$onPostScroll$1(this.f3587b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PullToRefreshModifierNode$onPostScroll$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3586a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0259b c0259b = this.f3587b;
            if (!c0259b.f3605O.f51704a.m746e()) {
                mp7 mp7Var = c0259b.f3605O;
                float fM19861h = c0259b.f3608R.m19861h() / c0259b.m1194f1();
                this.f3586a = 1;
                Object objM747f = mp7Var.f51704a.m747f(new Float(fM19861h), this);
                if (objM747f != coroutineSingletons) {
                    objM747f = xfaVar;
                }
                if (objM747f == coroutineSingletons) {
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
        return xfaVar;
    }
}
