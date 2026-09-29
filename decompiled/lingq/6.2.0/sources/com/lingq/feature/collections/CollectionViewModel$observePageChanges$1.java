package com.lingq.feature.collections;

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
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observePageChanges$1", m4291f = "CollectionViewModel.kt", m4292l = {1328}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$observePageChanges$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25507a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2034d f25508b;

    /* JADX INFO: renamed from: com.lingq.feature.collections.CollectionViewModel$observePageChanges$1$1 */
    @c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observePageChanges$1$1", m4291f = "CollectionViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20291 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ int f25509a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2034d f25510b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20291(C2034d c2034d, Continuation continuation) {
            super(2, continuation);
            this.f25510b = c2034d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C20291 c20291 = new C20291(this.f25510b, continuation);
            c20291.f25509a = ((Number) obj).intValue();
            return c20291;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20291 c20291 = (C20291) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20291.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.f25509a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2034d c2034d = this.f25510b;
            int i2 = c2034d.f25567Z;
            xfa xfaVar = xfa.f68157a;
            if (i2 > 0 && c2034d.f25557P != null) {
                c2034d.m8949d3(i == 1);
                c2034d.m8944Y2();
            }
            return xfaVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$observePageChanges$1(C2034d c2034d, Continuation continuation) {
        super(2, continuation);
        this.f25508b = c2034d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CollectionViewModel$observePageChanges$1(this.f25508b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CollectionViewModel$observePageChanges$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25507a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2034d c2034d = this.f25508b;
            C3244l c3244l = c2034d.f25561T;
            C20291 c20291 = new C20291(c2034d, null);
            c3244l.getClass();
            this.f25507a = 1;
            if (AbstractC3224d.m15529h(c3244l, c20291, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17633t("SharedFlow never completes, this call should never return.");
        return null;
    }
}
