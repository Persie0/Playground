package com.lingq.feature.review.activities;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.bj3;
import p000.c32;
import p000.e83;
import p000.kk8;
import p000.p08;
import p000.un1;
import p000.xe9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivitySpeakingViewModel$3", m4291f = "ReviewActivitySpeakingViewModel.kt", m4292l = {109}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivitySpeakingViewModel$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32178a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2748c f32179b;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivitySpeakingViewModel$3$3 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivitySpeakingViewModel$3$3", m4291f = "ReviewActivitySpeakingViewModel.kt", m4292l = {108}, m4293m = "invokeSuspend", m4294v = 2)
    final class C27143 extends SuspendLambda implements bj3 {

        /* JADX INFO: renamed from: a */
        public int f32180a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ e83 f32181b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ String f32182c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ List f32183d;

        @Override // p000.bj3
        /* JADX INFO: renamed from: e */
        public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
            C27143 c27143 = new C27143(4, (Continuation) obj4);
            c27143.f32181b = (e83) obj;
            c27143.f32182c = (String) obj2;
            c27143.f32183d = (List) obj3;
            return c27143.invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            e83 e83Var = this.f32181b;
            String str = this.f32182c;
            List list = this.f32183d;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f32180a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                Pair pair = new Pair(str, list);
                this.f32181b = null;
                this.f32182c = null;
                this.f32183d = null;
                this.f32180a = 1;
                if (e83Var.emit(pair, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivitySpeakingViewModel$3$4 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivitySpeakingViewModel$3$4", m4291f = "ReviewActivitySpeakingViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C27154 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f32184a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2748c f32185b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27154(C2748c c2748c, Continuation continuation) {
            super(2, continuation);
            this.f32185b = c2748c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C27154 c27154 = new C27154(this.f32185b, continuation);
            c27154.f32184a = obj;
            return c27154;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C27154 c27154 = (C27154) create((Pair) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c27154.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            Pair pair = (Pair) this.f32184a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            String str = (String) pair.f47623a;
            List list = (List) pair.f47624b;
            C3244l c3244l = this.f32185b.f32343p;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, xe9.m24478a((xe9) value, false, 0, str, null, null, null, list, 59)));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivitySpeakingViewModel$3(C2748c c2748c, Continuation continuation) {
        super(2, continuation);
        this.f32179b = c2748c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivitySpeakingViewModel$3(this.f32179b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivitySpeakingViewModel$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32178a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2748c c2748c = this.f32179b;
            kk8 kk8VarM15534m = AbstractC3224d.m15534m(new p08(c2748c.f32342o, 7), new p08(c2748c.f32341n, 8), new C27143(4, null));
            C27154 c27154 = new C27154(c2748c, null);
            this.f32178a = 1;
            if (AbstractC3224d.m15529h(kk8VarM15534m, c27154, this) == coroutineSingletons) {
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
