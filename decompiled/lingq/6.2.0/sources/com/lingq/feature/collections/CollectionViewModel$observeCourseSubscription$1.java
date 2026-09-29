package com.lingq.feature.collections;

import com.lingq.core.data.repository.C1290f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.c61;
import p000.c83;
import p000.jj2;
import p000.l91;
import p000.vi3;
import p000.xfa;
import p000.zi3;
import p000.zl3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeCourseSubscription$1", m4291f = "CollectionViewModel.kt", m4292l = {1034}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$observeCourseSubscription$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f25447a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2034d f25448b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l91 f25449c;

    /* JADX INFO: renamed from: com.lingq.feature.collections.CollectionViewModel$observeCourseSubscription$1$1 */
    @c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeCourseSubscription$1$1", m4291f = "CollectionViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20201 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ boolean f25450a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2034d f25451b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20201(C2034d c2034d, Continuation continuation) {
            super(2, continuation);
            this.f25451b = c2034d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C20201 c20201 = new C20201(this.f25451b, continuation);
            c20201.f25450a = ((Boolean) obj).booleanValue();
            return c20201;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            C20201 c20201 = (C20201) create(bool, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20201.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z = this.f25450a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f25451b.f25559R;
            while (true) {
                Object value = c3244l.getValue();
                boolean z2 = z;
                if (c3244l.m15570h(value, c61.m4341a((c61) value, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, z2, null, 98303))) {
                    return xfa.f68157a;
                }
                z = z2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$observeCourseSubscription$1(C2034d c2034d, l91 l91Var, Continuation continuation) {
        super(1, continuation);
        this.f25448b = c2034d;
        this.f25449c = l91Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CollectionViewModel$observeCourseSubscription$1(this.f25448b, this.f25449c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((CollectionViewModel$observeCourseSubscription$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25447a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2034d c2034d = this.f25448b;
            zl3 zl3Var = c2034d.f25579i;
            int i2 = c2034d.f25567Z;
            String str = this.f25449c.f49324a;
            zl3Var.getClass();
            str.getClass();
            c83 c83VarM15536o = AbstractC3224d.m15536o(new jj2(((C1290f) zl3Var.f71694a).m7183g(str), i2, 1));
            C20201 c20201 = new C20201(c2034d, null);
            this.f25447a = 1;
            if (AbstractC3224d.m15529h(c83VarM15536o, c20201, this) == coroutineSingletons) {
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
