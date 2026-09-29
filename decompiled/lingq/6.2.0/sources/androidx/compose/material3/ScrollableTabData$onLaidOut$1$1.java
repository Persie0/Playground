package androidx.compose.material3;

import androidx.compose.foundation.gestures.AbstractC0095c;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.eo8;
import p000.l43;
import p000.un1;
import p000.xfa;
import p000.yn8;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.ScrollableTabData$onLaidOut$1$1", m4291f = "TabRow.kt", m4292l = {1158}, m4293m = "invokeSuspend", m4294v = 1)
final class ScrollableTabData$onLaidOut$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3230a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eo8 f3231b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f3232c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableTabData$onLaidOut$1$1(eo8 eo8Var, int i, Continuation continuation) {
        super(2, continuation);
        this.f3231b = eo8Var;
        this.f3232c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScrollableTabData$onLaidOut$1$1(this.f3231b, this.f3232c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollableTabData$onLaidOut$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3230a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        eo8 eo8Var = this.f3231b;
        yn8 yn8Var = eo8Var.f37619a;
        l43 l43Var = eo8Var.f37621c;
        this.f3230a = 1;
        Object objM831f = AbstractC0095c.m831f(yn8Var, this.f3232c - yn8Var.f70117a.m21222h(), l43Var, this);
        if (objM831f != coroutineSingletons) {
            objM831f = xfaVar;
        }
        return objM831f == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
