package androidx.compose.material3;

import androidx.compose.animation.core.C0059a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.l43;
import p000.un1;
import p000.xfa;
import p000.xj2;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.TabIndicatorOffsetNode$measure$2", m4291f = "TabRow.kt", m4292l = {715}, m4293m = "invokeSuspend", m4294v = 1)
final class TabIndicatorOffsetNode$measure$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3337a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0059a f3338b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f3339c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0234h0 f3340d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabIndicatorOffsetNode$measure$2(C0059a c0059a, float f, C0234h0 c0234h0, Continuation continuation) {
        super(2, continuation);
        this.f3338b = c0059a;
        this.f3339c = f;
        this.f3340d = c0234h0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TabIndicatorOffsetNode$measure$2(this.f3338b, this.f3339c, this.f3340d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TabIndicatorOffsetNode$measure$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3337a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            xj2 xj2Var = new xj2(this.f3339c);
            l43 l43Var = this.f3340d.f3435M;
            this.f3337a = 1;
            if (C0059a.m744c(this.f3338b, xj2Var, l43Var, null, this, 12) == coroutineSingletons) {
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
