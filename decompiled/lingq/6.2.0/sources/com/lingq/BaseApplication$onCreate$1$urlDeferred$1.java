package com.lingq;

import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.server.ServerEnvironment;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.fa4;
import p000.si7;
import p000.un1;
import p000.xfa;
import p000.yi7;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.BaseApplication$onCreate$1$urlDeferred$1", m4291f = "BaseApplication.kt", m4292l = {52}, m4293m = "invokeSuspend", m4294v = 2)
final class BaseApplication$onCreate$1$urlDeferred$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f14152a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractApplicationC1226a f14153b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseApplication$onCreate$1$urlDeferred$1(AbstractApplicationC1226a abstractApplicationC1226a, Continuation continuation) {
        super(2, continuation);
        this.f14153b = abstractApplicationC1226a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseApplication$onCreate$1$urlDeferred$1(this.f14153b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseApplication$onCreate$1$urlDeferred$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f14152a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            si7 si7Var = this.f14153b.f14163d;
            if (si7Var == null) {
                fa4.m11636J("appStore");
                throw null;
            }
            yi7 yi7Var = ((C1368a) si7Var).f18363N1;
            this.f14152a = 1;
            obj = AbstractC3224d.m15541t(yi7Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return ((ServerEnvironment) obj).getBaseUrl();
    }
}
