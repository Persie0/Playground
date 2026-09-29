package com.lingq;

import com.lingq.core.datastore.C1368a;
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
import p000.vi7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.BaseApplication$onCreate$1$langDeferred$1", m4291f = "BaseApplication.kt", m4292l = {53}, m4293m = "invokeSuspend", m4294v = 2)
final class BaseApplication$onCreate$1$langDeferred$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f14150a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractApplicationC1226a f14151b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseApplication$onCreate$1$langDeferred$1(AbstractApplicationC1226a abstractApplicationC1226a, Continuation continuation) {
        super(2, continuation);
        this.f14151b = abstractApplicationC1226a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseApplication$onCreate$1$langDeferred$1(this.f14151b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseApplication$onCreate$1$langDeferred$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f14150a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        si7 si7Var = this.f14151b.f14163d;
        if (si7Var == null) {
            fa4.m11636J("appStore");
            throw null;
        }
        vi7 vi7Var = ((C1368a) si7Var).f18356L0;
        this.f14150a = 1;
        Object objM15541t = AbstractC3224d.m15541t(vi7Var, this);
        return objM15541t == coroutineSingletons ? coroutineSingletons : objM15541t;
    }
}
