package com.lingq.feature.review;

import com.lingq.core.data.repository.C1287c;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewSessionCompleteViewModel$fetchCards$1", m4291f = "ReviewSessionCompleteViewModel.kt", m4292l = {94}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewSessionCompleteViewModel$fetchCards$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31797a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2757e f31798b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f31799c;

    /* JADX INFO: renamed from: com.lingq.feature.review.ReviewSessionCompleteViewModel$fetchCards$1$1 */
    @c32(m4290c = "com.lingq.feature.review.ReviewSessionCompleteViewModel$fetchCards$1$1", m4291f = "ReviewSessionCompleteViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26251 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f31800a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2757e f31801b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26251(C2757e c2757e, Continuation continuation) {
            super(2, continuation);
            this.f31801b = c2757e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C26251 c26251 = new C26251(this.f31801b, continuation);
            c26251.f31800a = obj;
            return c26251;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C26251 c26251 = (C26251) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c26251.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f31800a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f31801b.f32477g.m15571i(list);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSessionCompleteViewModel$fetchCards$1(C2757e c2757e, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f31798b = c2757e;
        this.f31799c = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewSessionCompleteViewModel$fetchCards$1(this.f31798b, this.f31799c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewSessionCompleteViewModel$fetchCards$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31797a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2757e c2757e = this.f31798b;
            c83 c83VarM7123m = ((C1287c) c2757e.f32473c).m7123m(c2757e.f32472b.mo4589b2(), this.f31799c);
            C26251 c26251 = new C26251(c2757e, null);
            this.f31797a = 1;
            if (AbstractC3224d.m15529h(c83VarM7123m, c26251, this) == coroutineSingletons) {
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
