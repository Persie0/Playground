package com.lingq.feature.collections;

import com.lingq.core.data.repository.C1286b;
import com.lingq.core.database.dao.C1314b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.C3750x8;
import p000.c32;
import p000.c61;
import p000.c83;
import p000.l91;
import p000.ld0;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeBlacklisted$1", m4291f = "CollectionViewModel.kt", m4292l = {1236}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$observeBlacklisted$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f25405a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2034d f25406b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l91 f25407c;

    /* JADX INFO: renamed from: com.lingq.feature.collections.CollectionViewModel$observeBlacklisted$1$1 */
    @c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeBlacklisted$1$1", m4291f = "CollectionViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20111 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ int f25408a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2034d f25409b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20111(C2034d c2034d, Continuation continuation) {
            super(2, continuation);
            this.f25409b = c2034d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C20111 c20111 = new C20111(this.f25409b, continuation);
            c20111.f25408a = ((Number) obj).intValue();
            return c20111;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20111 c20111 = (C20111) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20111.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            int i = this.f25408a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f25409b.f25559R;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, c61.m4341a((c61) value, null, null, null, null, false, false, false, false, false, false, false, false, false, false, i > 0, false, null, 114687)));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$observeBlacklisted$1(C2034d c2034d, l91 l91Var, Continuation continuation) {
        super(1, continuation);
        this.f25406b = c2034d;
        this.f25407c = l91Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CollectionViewModel$observeBlacklisted$1(this.f25406b, this.f25407c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((CollectionViewModel$observeBlacklisted$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25405a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2034d c2034d = this.f25406b;
            C3750x8 c3750x8 = c2034d.f25542A;
            int i2 = c2034d.f25567Z;
            String str = this.f25407c.f49324a;
            c3750x8.getClass();
            str.getClass();
            C1286b c1286b = c3750x8.f67911a;
            c1286b.getClass();
            C1314b c1314b = c1286b.f16449a;
            c1314b.getClass();
            c83 c83VarM15536o = AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1314b.f16998a, false, new String[]{"CourseBlacklistEntity"}, new ld0(str, i2, 0)));
            C20111 c20111 = new C20111(c2034d, null);
            this.f25405a = 1;
            if (AbstractC3224d.m15529h(c83VarM15536o, c20111, this) == coroutineSingletons) {
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
