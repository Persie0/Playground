package com.lingq.feature.review;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.lda;
import p000.mxa;
import p000.u0b;
import p000.u91;
import p000.un1;
import p000.v91;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewViewModel$getCards$1", m4291f = "ReviewViewModel.kt", m4292l = {417, 418}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewViewModel$getCards$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31885a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2758f f31886b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f31887c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f31888d;

    /* JADX INFO: renamed from: com.lingq.feature.review.ReviewViewModel$getCards$1$1 */
    @c32(m4290c = "com.lingq.feature.review.ReviewViewModel$getCards$1$1", m4291f = "ReviewViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26351 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f31889a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2758f f31890b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f31891c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f31892d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26351(C2758f c2758f, boolean z, boolean z2, Continuation continuation) {
            super(2, continuation);
            this.f31890b = c2758f;
            this.f31891c = z;
            this.f31892d = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C26351 c26351 = new C26351(this.f31890b, this.f31891c, this.f31892d, continuation);
            c26351.f31889a = obj;
            return c26351;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C26351 c26351 = (C26351) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c26351.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f31889a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            boolean zIsEmpty = list.isEmpty();
            boolean z = this.f31892d;
            boolean z2 = this.f31891c;
            C2758f c2758f = this.f31890b;
            if (zIsEmpty) {
                lda.m16121g(C2758f.m9604X2(c2758f, EmptyList.f47638a, z2, z));
            } else {
                List list2 = list;
                ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((mxa) it.next()).f52004b);
                }
                C2758f.m9605Y2(c2758f, u91.m22627s1(arrayList), z2, z);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewViewModel$getCards$1(C2758f c2758f, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.f31886b = c2758f;
        this.f31887c = z;
        this.f31888d = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewViewModel$getCards$1(this.f31886b, this.f31887c, this.f31888d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewViewModel$getCards$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (kotlinx.coroutines.flow.AbstractC3224d.m15529h((p000.c83) r15, r14, r12) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ReviewViewModel$getCards$1 reviewViewModel$getCards$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31885a;
        C2758f c2758f = this.f31886b;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                reviewViewModel$getCards$1 = this;
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        u0b u0bVar = c2758f.f32509e;
        String strMo4589b2 = c2758f.f32506b.mo4589b2();
        this.f31885a = 1;
        reviewViewModel$getCards$1 = this;
        obj = u0b.m22379b(u0bVar, strMo4589b2, 1, null, false, false, null, reviewViewModel$getCards$1, 60);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
        C26351 c26351 = new C26351(c2758f, reviewViewModel$getCards$1.f31887c, reviewViewModel$getCards$1.f31888d, null);
        reviewViewModel$getCards$1.f31885a = 2;
    }
}
