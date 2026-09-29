package com.lingq.feature.review;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3218xd7c321e8;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.c83;
import p000.cj3;
import p000.e83;
import p000.kk8;
import p000.lda;
import p000.un1;
import p000.v0b;
import p000.v91;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewSessionCompleteFragment$onViewCreated$2$1", m4291f = "ReviewSessionCompleteFragment.kt", m4292l = {101}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewSessionCompleteFragment$onViewCreated$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31767a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewSessionCompleteFragment f31768b;

    /* JADX INFO: renamed from: com.lingq.feature.review.ReviewSessionCompleteFragment$onViewCreated$2$1$1 */
    @c32(m4290c = "com.lingq.feature.review.ReviewSessionCompleteFragment$onViewCreated$2$1$1", m4291f = "ReviewSessionCompleteFragment.kt", m4292l = {100}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26121 extends SuspendLambda implements cj3 {

        /* JADX INFO: renamed from: a */
        public int f31769a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ e83 f31770b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ List f31771c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Map f31772d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Map f31773e;

        @Override // p000.cj3
        /* JADX INFO: renamed from: i */
        public final Object mo1291i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            C26121 c26121 = new C26121(5, (Continuation) obj5);
            c26121.f31770b = (e83) obj;
            c26121.f31771c = (List) obj2;
            c26121.f31772d = (Map) obj3;
            c26121.f31773e = (Map) obj4;
            return c26121.invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            e83 e83Var = this.f31770b;
            List list = this.f31771c;
            Map map = this.f31772d;
            Map map2 = this.f31773e;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f31769a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                Triple triple = new Triple(list, map, map2);
                this.f31770b = null;
                this.f31771c = null;
                this.f31772d = null;
                this.f31773e = null;
                this.f31769a = 1;
                if (e83Var.emit(triple, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.feature.review.ReviewSessionCompleteFragment$onViewCreated$2$1$2 */
    @c32(m4290c = "com.lingq.feature.review.ReviewSessionCompleteFragment$onViewCreated$2$1$2", m4291f = "ReviewSessionCompleteFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26132 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f31774a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReviewSessionCompleteFragment f31775b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26132(ReviewSessionCompleteFragment reviewSessionCompleteFragment, Continuation continuation) {
            super(2, continuation);
            this.f31775b = reviewSessionCompleteFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C26132 c26132 = new C26132(this.f31775b, continuation);
            c26132.f31774a = obj;
            return c26132;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C26132 c26132 = (C26132) create((Triple) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c26132.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Triple triple = (Triple) this.f31774a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            List list = (List) triple.f47633a;
            Map map = (Map) triple.f47634b;
            Map map2 = (Map) triple.f47635c;
            if (!list.isEmpty()) {
                bh4[] bh4VarArr = ReviewSessionCompleteFragment.f31753G0;
                C2757e c2757eM9534S0 = this.f31775b.m9534S0();
                List list2 = list;
                ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((v0b) it.next()).f64672b);
                }
                map.getClass();
                map2.getClass();
                C3244l c3244l = c2757eM9534S0.f32478h;
                c3244l.getClass();
                c3244l.m15572j(null, map);
                C3244l c3244l2 = c2757eM9534S0.f32479i;
                c3244l2.getClass();
                c3244l2.m15572j(null, map2);
                wfb.m23926u(lda.m16103C(c2757eM9534S0), null, null, new ReviewSessionCompleteViewModel$fetchCards$1(c2757eM9534S0, arrayList, null), 3);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSessionCompleteFragment$onViewCreated$2$1(ReviewSessionCompleteFragment reviewSessionCompleteFragment, Continuation continuation) {
        super(2, continuation);
        this.f31768b = reviewSessionCompleteFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewSessionCompleteFragment$onViewCreated$2$1(this.f31768b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewSessionCompleteFragment$onViewCreated$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31767a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReviewSessionCompleteFragment.f31753G0;
            ReviewSessionCompleteFragment reviewSessionCompleteFragment = this.f31768b;
            kk8 kk8Var = new kk8(new C3218xd7c321e8(new c83[]{reviewSessionCompleteFragment.m9533R0().f32520p, reviewSessionCompleteFragment.m9533R0().f32524t, reviewSessionCompleteFragment.m9533R0().f32525u}, null, new C26121(5, null)));
            C26132 c26132 = new C26132(reviewSessionCompleteFragment, null);
            this.f31767a = 1;
            if (AbstractC3224d.m15529h(kk8Var, c26132, this) == coroutineSingletons) {
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
