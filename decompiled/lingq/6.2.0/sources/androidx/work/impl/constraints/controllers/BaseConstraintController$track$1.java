package androidx.work.impl.constraints.controllers;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.AbstractC3212b;
import p000.C3386nv;
import p000.C3577sk;
import p000.c32;
import p000.ll7;
import p000.oj5;
import p000.ti0;
import p000.tj1;
import p000.u80;
import p000.xfa;
import p000.yb0;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.work.impl.constraints.controllers.BaseConstraintController$track$1", m4291f = "ContraintControllers.kt", m4292l = {62}, m4293m = "invokeSuspend")
final class BaseConstraintController$track$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f7236a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f7237b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0777a f7238c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseConstraintController$track$1(AbstractC0777a abstractC0777a, Continuation continuation) {
        super(2, continuation);
        this.f7238c = abstractC0777a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BaseConstraintController$track$1 baseConstraintController$track$1 = new BaseConstraintController$track$1(this.f7238c, continuation);
        baseConstraintController$track$1.f7237b = obj;
        return baseConstraintController$track$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseConstraintController$track$1) create((ll7) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f7236a;
        int i2 = 1;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ll7 ll7Var = (ll7) this.f7237b;
            AbstractC0777a abstractC0777a = this.f7238c;
            u80 u80Var = new u80(abstractC0777a, ll7Var);
            yb0 yb0Var = abstractC0777a.f7239a;
            yb0Var.getClass();
            synchronized (yb0Var.f69589c) {
                try {
                    if (yb0Var.f69590d.add(u80Var)) {
                        if (yb0Var.f69590d.size() == 1) {
                            yb0Var.f69591e = yb0Var.m25024b();
                            oj5.m18040f().m18042a(tj1.f62364a, yb0Var.getClass().getSimpleName() + ": initial state = " + yb0Var.f69591e);
                            oj5.m18040f().m18042a(ti0.f62334a, yb0Var.getClass().getSimpleName().concat(": registering receiver"));
                            yb0Var.f69588b.registerReceiver(yb0Var.f69592f, yb0Var.m25023a());
                        }
                        u80Var.m22531a(yb0Var.f69591e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            C3577sk c3577sk = new C3577sk(i2, this.f7238c, u80Var);
            this.f7236a = 1;
            if (AbstractC3212b.m15484a(ll7Var, c3577sk, this) == coroutineSingletons) {
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
