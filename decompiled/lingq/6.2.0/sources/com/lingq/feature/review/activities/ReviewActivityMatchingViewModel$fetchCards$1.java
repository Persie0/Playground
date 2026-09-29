package com.lingq.feature.review.activities;

import com.lingq.core.data.repository.C1287c;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3550rv;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityMatchingViewModel$fetchCards$1", m4291f = "ReviewActivityMatchingViewModel.kt", m4292l = {71}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityMatchingViewModel$fetchCards$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32007a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2747b f32008b;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityMatchingViewModel$fetchCards$1$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityMatchingViewModel$fetchCards$1$1", m4291f = "ReviewActivityMatchingViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26671 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f32009a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2747b f32010b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26671(C2747b c2747b, Continuation continuation) {
            super(2, continuation);
            this.f32010b = c2747b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C26671 c26671 = new C26671(this.f32010b, continuation);
            c26671.f32009a = obj;
            return c26671;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C26671 c26671 = (C26671) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c26671.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f32009a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f32010b.f32325h.m15571i(list);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityMatchingViewModel$fetchCards$1(C2747b c2747b, Continuation continuation) {
        super(2, continuation);
        this.f32008b = c2747b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityMatchingViewModel$fetchCards$1(this.f32008b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivityMatchingViewModel$fetchCards$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32007a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2747b c2747b = this.f32008b;
            c83 c83VarM7123m = ((C1287c) c2747b.f32320c).m7123m(c2747b.f32319b.mo4589b2(), AbstractC3550rv.m20852t0(c2747b.f32324g));
            C26671 c26671 = new C26671(c2747b, null);
            this.f32007a = 1;
            if (AbstractC3224d.m15529h(c83VarM7123m, c26671, this) == coroutineSingletons) {
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
