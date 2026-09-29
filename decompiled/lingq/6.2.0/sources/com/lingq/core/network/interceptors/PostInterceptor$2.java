package com.lingq.core.network.interceptors;

import com.lingq.core.datastore.C1369b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.qm7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.network.interceptors.PostInterceptor$2", m4291f = "PostInterceptor.kt", m4292l = {46}, m4293m = "invokeSuspend", m4294v = 2)
final class PostInterceptor$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f21839a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1798a f21840b;

    /* JADX INFO: renamed from: com.lingq.core.network.interceptors.PostInterceptor$2$1 */
    @c32(m4290c = "com.lingq.core.network.interceptors.PostInterceptor$2$1", m4291f = "PostInterceptor.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C17961 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f21841a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1798a f21842b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17961(C1798a c1798a, Continuation continuation) {
            super(2, continuation);
            this.f21842b = c1798a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C17961 c17961 = new C17961(this.f21842b, continuation);
            c17961.f21841a = obj;
            return c17961;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C17961 c17961 = (C17961) create((String) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c17961.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            String str = (String) this.f21841a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f21842b.f21853g;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, str));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostInterceptor$2(C1798a c1798a, Continuation continuation) {
        super(2, continuation);
        this.f21840b = c1798a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PostInterceptor$2(this.f21840b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PostInterceptor$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f21839a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1798a c1798a = this.f21840b;
            qm7 qm7Var = ((C1369b) c1798a.f21848b).f18484q;
            C17961 c17961 = new C17961(c1798a, null);
            this.f21839a = 1;
            if (AbstractC3224d.m15529h(qm7Var, c17961, this) == coroutineSingletons) {
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
