package com.lingq.feature.review.activities;

import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.feature.review.views.speaking.MatchPairView;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.cf3;
import p000.p08;
import p000.t7d;
import p000.u91;
import p000.un1;
import p000.v91;
import p000.vq5;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityMatchingFragment$onViewCreated$2$1", m4291f = "ReviewActivityMatchingFragment.kt", m4292l = {67}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityMatchingFragment$onViewCreated$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31982a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewActivityMatchingFragment f31983b;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityMatchingFragment$onViewCreated$2$1$2 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityMatchingFragment$onViewCreated$2$1$2", m4291f = "ReviewActivityMatchingFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26542 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f31984a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReviewActivityMatchingFragment f31985b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26542(ReviewActivityMatchingFragment reviewActivityMatchingFragment, Continuation continuation) {
            super(2, continuation);
            this.f31985b = reviewActivityMatchingFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C26542 c26542 = new C26542(this.f31985b, continuation);
            c26542.f31984a = obj;
            return c26542;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C26542 c26542 = (C26542) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c26542.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f31984a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ArrayList<LessonCard> arrayListM22624p1 = u91.m22624p1(list);
            while (arrayListM22624p1.size() < 3) {
                arrayListM22624p1.add(u91.m22589G0(arrayListM22624p1));
            }
            bh4[] bh4VarArr = ReviewActivityMatchingFragment.f31969F0;
            ReviewActivityMatchingFragment reviewActivityMatchingFragment = this.f31985b;
            MatchPairView matchPairView = ((cf3) reviewActivityMatchingFragment.f31970C0.getValue(reviewActivityMatchingFragment, ReviewActivityMatchingFragment.f31969F0[0])).f10000a;
            ArrayList arrayList = new ArrayList(v91.m23189q0(arrayListM22624p1, 10));
            for (LessonCard lessonCard : arrayListM22624p1) {
                String str = lessonCard.f19181d;
                String str2 = lessonCard.f19178a;
                List list2 = lessonCard.f19180c;
                if (list2.isEmpty()) {
                    list2 = lessonCard.f19179b;
                }
                arrayList.add(new vq5(AbstractC3352my.m17122h(str, str2, list2), t7d.m21897b(lessonCard.f19183f)));
            }
            matchPairView.setup(arrayList);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityMatchingFragment$onViewCreated$2$1(ReviewActivityMatchingFragment reviewActivityMatchingFragment, Continuation continuation) {
        super(2, continuation);
        this.f31983b = reviewActivityMatchingFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityMatchingFragment$onViewCreated$2$1(this.f31983b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivityMatchingFragment$onViewCreated$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31982a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ReviewActivityMatchingFragment reviewActivityMatchingFragment = this.f31983b;
            p08 p08Var = new p08(((C2747b) reviewActivityMatchingFragment.f31971D0.getValue()).f32326i, 6);
            C26542 c26542 = new C26542(reviewActivityMatchingFragment, null);
            this.f31982a = 1;
            if (AbstractC3224d.m15529h(p08Var, c26542, this) == coroutineSingletons) {
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
