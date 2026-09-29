package com.lingq;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.ah9;
import p000.c32;
import p000.ph2;
import p000.t62;
import p000.un1;
import p000.v72;
import p000.wfb;
import p000.xfa;
import p000.y92;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.BaseApplication$onCreate$1", m4291f = "BaseApplication.kt", m4292l = {54, 55}, m4293m = "invokeSuspend", m4294v = 2)
final class BaseApplication$onCreate$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public y92 f14145a;

    /* JADX INFO: renamed from: b */
    public ah9 f14146b;

    /* JADX INFO: renamed from: c */
    public int f14147c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f14148d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractApplicationC1226a f14149e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseApplication$onCreate$1(AbstractApplicationC1226a abstractApplicationC1226a, Continuation continuation) {
        super(2, continuation);
        this.f14149e = abstractApplicationC1226a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BaseApplication$onCreate$1 baseApplication$onCreate$1 = new BaseApplication$onCreate$1(this.f14149e, continuation);
        baseApplication$onCreate$1.f14148d = obj;
        return baseApplication$onCreate$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseApplication$onCreate$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ah9 ah9Var;
        y92 y92Var;
        ah9 ah9Var2;
        un1 un1Var = (un1) this.f14148d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f14147c;
        if (i != 0) {
            if (i == 1) {
                ah9Var = this.f14146b;
                y92Var = this.f14145a;
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ah9Var2 = this.f14146b;
                AbstractC3193b.m15359b(obj);
            }
            String str = (String) obj;
            ah9Var2.getClass();
            str.getClass();
            C3244l c3244l = ah9.f674c;
            c3244l.getClass();
            c3244l.m15572j(null, str);
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        v72 v72Var = ph2.f56212a;
        t62 t62Var = t62.f61909c;
        AbstractApplicationC1226a abstractApplicationC1226a = this.f14149e;
        y92 y92VarM23910e = wfb.m23910e(un1Var, t62Var, new BaseApplication$onCreate$1$urlDeferred$1(abstractApplicationC1226a, null), 2);
        y92 y92VarM23910e2 = wfb.m23910e(un1Var, t62Var, new BaseApplication$onCreate$1$langDeferred$1(abstractApplicationC1226a, null), 2);
        ah9Var = ah9.f672a;
        this.f14148d = null;
        this.f14145a = y92VarM23910e2;
        this.f14146b = ah9Var;
        this.f14147c = 1;
        Object objM15517w = y92VarM23910e.m15517w(this);
        if (objM15517w != coroutineSingletons) {
            y92Var = y92VarM23910e2;
            obj = objM15517w;
        }
        return coroutineSingletons;
        String str2 = (String) obj;
        ah9Var.getClass();
        str2.getClass();
        C3244l c3244l2 = ah9.f673b;
        c3244l2.getClass();
        c3244l2.m15572j(null, str2);
        ah9 ah9Var3 = ah9.f672a;
        this.f14148d = null;
        this.f14145a = null;
        this.f14146b = ah9Var3;
        this.f14147c = 2;
        Object objMo24416n = y92Var.mo24416n(this);
        if (objMo24416n != coroutineSingletons) {
            obj = objMo24416n;
            ah9Var2 = ah9Var3;
            String str3 = (String) obj;
            ah9Var2.getClass();
            str3.getClass();
            C3244l c3244l3 = ah9.f674c;
            c3244l3.getClass();
            c3244l3.m15572j(null, str3);
            return xfa.f68157a;
        }
        return coroutineSingletons;
    }
}
