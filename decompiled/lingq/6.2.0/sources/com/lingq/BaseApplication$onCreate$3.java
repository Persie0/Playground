package com.lingq;

import com.lingq.core.datastore.C1368a;
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
import p000.vi7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.BaseApplication$onCreate$3", m4291f = "BaseApplication.kt", m4292l = {69}, m4293m = "invokeSuspend", m4294v = 2)
final class BaseApplication$onCreate$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f14157a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractApplicationC1226a f14158b;

    /* JADX INFO: renamed from: com.lingq.BaseApplication$onCreate$3$1 */
    @c32(m4290c = "com.lingq.BaseApplication$onCreate$3$1", m4291f = "BaseApplication.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C12251 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f14159a;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C12251 c12251 = new C12251(2, continuation);
            c12251.f14159a = obj;
            return c12251;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C12251 c12251 = (C12251) create((String) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c12251.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str = (String) this.f14159a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ah9 ah9Var = ah9.f672a;
            str.getClass();
            C3244l c3244l = ah9.f674c;
            c3244l.getClass();
            c3244l.m15572j(null, str);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseApplication$onCreate$3(AbstractApplicationC1226a abstractApplicationC1226a, Continuation continuation) {
        super(2, continuation);
        this.f14158b = abstractApplicationC1226a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseApplication$onCreate$3(this.f14158b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseApplication$onCreate$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f14157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            si7 si7Var = this.f14158b.f14163d;
            if (si7Var == null) {
                fa4.m11636J("appStore");
                throw null;
            }
            vi7 vi7Var = ((C1368a) si7Var).f18356L0;
            C12251 c12251 = new C12251(2, null);
            this.f14157a = 1;
            if (AbstractC3224d.m15529h(vi7Var, c12251, this) == coroutineSingletons) {
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
