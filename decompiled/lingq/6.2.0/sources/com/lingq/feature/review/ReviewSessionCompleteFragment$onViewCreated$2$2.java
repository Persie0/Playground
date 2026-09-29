package com.lingq.feature.review;

import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.le8;
import p000.oe8;
import p000.te8;
import p000.un1;
import p000.vz1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewSessionCompleteFragment$onViewCreated$2$2", m4291f = "ReviewSessionCompleteFragment.kt", m4292l = {122}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewSessionCompleteFragment$onViewCreated$2$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31776a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewSessionCompleteFragment f31777b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ te8 f31778c;

    /* JADX INFO: renamed from: com.lingq.feature.review.ReviewSessionCompleteFragment$onViewCreated$2$2$1 */
    @c32(m4290c = "com.lingq.feature.review.ReviewSessionCompleteFragment$onViewCreated$2$2$1", m4291f = "ReviewSessionCompleteFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26141 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f31779a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReviewSessionCompleteFragment f31780b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ te8 f31781c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26141(te8 te8Var, ReviewSessionCompleteFragment reviewSessionCompleteFragment, Continuation continuation) {
            super(2, continuation);
            this.f31780b = reviewSessionCompleteFragment;
            this.f31781c = te8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C26141 c26141 = new C26141(this.f31781c, this.f31780b, continuation);
            c26141.f31779a = obj;
            return c26141;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C26141 c26141 = (C26141) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c26141.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f31779a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ReviewSessionCompleteFragment reviewSessionCompleteFragment = this.f31780b;
            boolean zM23653w = vz1.m23653w(reviewSessionCompleteFragment);
            te8 te8Var = this.f31781c;
            if (zM23653w) {
                List list2 = list;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (!(((oe8) obj2) instanceof le8)) {
                        arrayList.add(obj2);
                    }
                }
                te8Var.m21309l(arrayList);
                te8 te8Var2 = reviewSessionCompleteFragment.f31757F0;
                if (te8Var2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list2) {
                        if (obj3 instanceof le8) {
                            arrayList2.add(obj3);
                        }
                    }
                    te8Var2.m21309l(arrayList2);
                }
            } else {
                te8Var.m21309l(list);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSessionCompleteFragment$onViewCreated$2$2(te8 te8Var, ReviewSessionCompleteFragment reviewSessionCompleteFragment, Continuation continuation) {
        super(2, continuation);
        this.f31777b = reviewSessionCompleteFragment;
        this.f31778c = te8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewSessionCompleteFragment$onViewCreated$2$2(this.f31778c, this.f31777b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewSessionCompleteFragment$onViewCreated$2$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31776a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReviewSessionCompleteFragment.f31753G0;
            ReviewSessionCompleteFragment reviewSessionCompleteFragment = this.f31777b;
            c18 c18Var = reviewSessionCompleteFragment.m9534S0().f32481k;
            C26141 c26141 = new C26141(this.f31778c, reviewSessionCompleteFragment, null);
            c18Var.getClass();
            this.f31776a = 1;
            if (AbstractC3224d.m15529h(c18Var, c26141, this) == coroutineSingletons) {
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
