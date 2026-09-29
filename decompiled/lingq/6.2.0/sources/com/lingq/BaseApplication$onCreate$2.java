package com.lingq;

import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.server.ServerEnvironment;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.ah9;
import p000.c32;
import p000.fa4;
import p000.si7;
import p000.un1;
import p000.xfa;
import p000.yi7;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.BaseApplication$onCreate$2", m4291f = "BaseApplication.kt", m4292l = {63}, m4293m = "invokeSuspend", m4294v = 2)
final class BaseApplication$onCreate$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f14154a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractApplicationC1226a f14155b;

    /* JADX INFO: renamed from: com.lingq.BaseApplication$onCreate$2$1 */
    @c32(m4290c = "com.lingq.BaseApplication$onCreate$2$1", m4291f = "BaseApplication.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C12241 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f14156a;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C12241 c12241 = new C12241(2, continuation);
            c12241.f14156a = obj;
            return c12241;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C12241 c12241 = (C12241) create((ServerEnvironment) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c12241.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ServerEnvironment serverEnvironment = (ServerEnvironment) this.f14156a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ah9 ah9Var = ah9.f672a;
            String baseUrl = serverEnvironment.getBaseUrl();
            baseUrl.getClass();
            C3244l c3244l = ah9.f673b;
            c3244l.getClass();
            c3244l.m15572j(null, baseUrl);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseApplication$onCreate$2(AbstractApplicationC1226a abstractApplicationC1226a, Continuation continuation) {
        super(2, continuation);
        this.f14155b = abstractApplicationC1226a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseApplication$onCreate$2(this.f14155b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseApplication$onCreate$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f14154a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            si7 si7Var = this.f14155b.f14163d;
            if (si7Var == null) {
                fa4.m11636J("appStore");
                throw null;
            }
            yi7 yi7Var = ((C1368a) si7Var).f18363N1;
            C12241 c12241 = new C12241(2, null);
            this.f14154a = 1;
            if (AbstractC3224d.m15529h(yi7Var, c12241, this) == coroutineSingletons) {
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
