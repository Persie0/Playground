package com.lingq.core.network.interceptors;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.datastore.C1369b;
import com.lingq.core.domain.model.user.Login;
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
@c32(m4290c = "com.lingq.core.network.interceptors.PostInterceptor$1", m4291f = "PostInterceptor.kt", m4292l = {DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER}, m4293m = "invokeSuspend", m4294v = 2)
final class PostInterceptor$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f21835a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1798a f21836b;

    /* JADX INFO: renamed from: com.lingq.core.network.interceptors.PostInterceptor$1$1 */
    @c32(m4290c = "com.lingq.core.network.interceptors.PostInterceptor$1$1", m4291f = "PostInterceptor.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C17951 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f21837a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1798a f21838b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17951(C1798a c1798a, Continuation continuation) {
            super(2, continuation);
            this.f21838b = c1798a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C17951 c17951 = new C17951(this.f21838b, continuation);
            c17951.f21837a = obj;
            return c17951;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C17951 c17951 = (C17951) create((Login) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c17951.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            Login login = (Login) this.f21837a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f21838b.f21852f;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, login));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostInterceptor$1(C1798a c1798a, Continuation continuation) {
        super(2, continuation);
        this.f21836b = c1798a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PostInterceptor$1(this.f21836b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PostInterceptor$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f21835a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1798a c1798a = this.f21836b;
            qm7 qm7Var = ((C1369b) c1798a.f21848b).f18482o;
            C17951 c17951 = new C17951(c1798a, null);
            this.f21835a = 1;
            if (AbstractC3224d.m15529h(qm7Var, c17951, this) == coroutineSingletons) {
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
