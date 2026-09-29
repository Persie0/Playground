package androidx.compose.material3;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.p73;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$1$1", m4291f = "FloatingActionButton.kt", m4292l = {1298}, m4293m = "invokeSuspend", m4294v = 1)
final class FloatingActionButtonElevation$animateElevation$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3183a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0256o f3184b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ p73 f3185c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonElevation$animateElevation$1$1(C0256o c0256o, p73 p73Var, Continuation continuation) {
        super(2, continuation);
        this.f3184b = c0256o;
        this.f3185c = p73Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FloatingActionButtonElevation$animateElevation$1$1(this.f3184b, this.f3185c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((FloatingActionButtonElevation$animateElevation$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3183a;
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
        p73 p73Var = this.f3185c;
        float f = p73Var.f55689a;
        float f2 = p73Var.f55690b;
        float f3 = p73Var.f55692d;
        float f4 = p73Var.f55691c;
        this.f3183a = 1;
        C0256o c0256o = this.f3184b;
        c0256o.f3561a = f;
        c0256o.f3562b = f2;
        c0256o.f3563c = f3;
        c0256o.f3564d = f4;
        Object objM1185b = c0256o.m1185b(this);
        if (objM1185b != coroutineSingletons) {
            objM1185b = xfaVar;
        }
        return objM1185b == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
