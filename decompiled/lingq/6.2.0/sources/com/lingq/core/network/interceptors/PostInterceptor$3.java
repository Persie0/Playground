package com.lingq.core.network.interceptors;

import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.server.ServerEnvironment;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.yi7;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.network.interceptors.PostInterceptor$3", m4291f = "PostInterceptor.kt", m4292l = {52}, m4293m = "invokeSuspend", m4294v = 2)
final class PostInterceptor$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f21843a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1798a f21844b;

    /* JADX INFO: renamed from: com.lingq.core.network.interceptors.PostInterceptor$3$1 */
    @c32(m4290c = "com.lingq.core.network.interceptors.PostInterceptor$3$1", m4291f = "PostInterceptor.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C17971 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f21845a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1798a f21846b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17971(C1798a c1798a, Continuation continuation) {
            super(2, continuation);
            this.f21846b = c1798a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C17971 c17971 = new C17971(this.f21846b, continuation);
            c17971.f21845a = obj;
            return c17971;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C17971 c17971 = (C17971) create((ServerEnvironment) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c17971.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            ServerEnvironment serverEnvironment = (ServerEnvironment) this.f21845a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f21846b.f21854h;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, serverEnvironment.getBaseUrl()));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostInterceptor$3(C1798a c1798a, Continuation continuation) {
        super(2, continuation);
        this.f21844b = c1798a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PostInterceptor$3(this.f21844b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PostInterceptor$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f21843a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1798a c1798a = this.f21844b;
            yi7 yi7Var = ((C1368a) c1798a.f21849c).f18363N1;
            C17971 c17971 = new C17971(c1798a, null);
            this.f21843a = 1;
            if (AbstractC3224d.m15529h(yi7Var, c17971, this) == coroutineSingletons) {
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
