package com.lingq.feature.reader.old.settings;

import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.lg3;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.settings.LessonReviewMenuFragment$onViewCreated$3", m4291f = "LessonReviewMenuFragment.kt", m4292l = {106}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonReviewMenuFragment$onViewCreated$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29440a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonReviewMenuFragment f29441b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.settings.LessonReviewMenuFragment$onViewCreated$3$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.settings.LessonReviewMenuFragment$onViewCreated$3$1", m4291f = "LessonReviewMenuFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C24141 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LessonReviewMenuFragment f29442a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24141(LessonReviewMenuFragment lessonReviewMenuFragment, Continuation continuation) {
            super(2, continuation);
            this.f29442a = lessonReviewMenuFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C24141(this.f29442a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C24141 c24141 = (C24141) create((un1) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c24141.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = LessonReviewMenuFragment.f29427G0;
            this.f29442a.m9345S0().mo8733A0(false);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonReviewMenuFragment$onViewCreated$3(LessonReviewMenuFragment lessonReviewMenuFragment, Continuation continuation) {
        super(2, continuation);
        this.f29441b = lessonReviewMenuFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonReviewMenuFragment$onViewCreated$3(this.f29441b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonReviewMenuFragment$onViewCreated$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29440a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            LessonReviewMenuFragment lessonReviewMenuFragment = this.f29441b;
            lg3 lg3VarM2112n = lessonReviewMenuFragment.m2112n();
            Lifecycle$State lifecycle$State = Lifecycle$State.CREATED;
            C24141 c24141 = new C24141(lessonReviewMenuFragment, null);
            this.f29440a = 1;
            if (AbstractC0708b.m2510c(lg3VarM2112n, lifecycle$State, c24141, this) == coroutineSingletons) {
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
