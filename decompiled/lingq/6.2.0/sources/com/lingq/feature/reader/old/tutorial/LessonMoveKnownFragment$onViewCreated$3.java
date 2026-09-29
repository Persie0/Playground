package com.lingq.feature.reader.old.tutorial;

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
@c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment$onViewCreated$3", m4291f = "LessonMoveKnownFragment.kt", m4292l = {150}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonMoveKnownFragment$onViewCreated$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29577a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonMoveKnownFragment f29578b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment$onViewCreated$3$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment$onViewCreated$3$1", m4291f = "LessonMoveKnownFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C24451 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LessonMoveKnownFragment f29579a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24451(LessonMoveKnownFragment lessonMoveKnownFragment, Continuation continuation) {
            super(2, continuation);
            this.f29579a = lessonMoveKnownFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C24451(this.f29579a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C24451 c24451 = (C24451) create((un1) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c24451.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = LessonMoveKnownFragment.f29562H0;
            this.f29579a.m9352T0().mo8768j0(false);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonMoveKnownFragment$onViewCreated$3(LessonMoveKnownFragment lessonMoveKnownFragment, Continuation continuation) {
        super(2, continuation);
        this.f29578b = lessonMoveKnownFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonMoveKnownFragment$onViewCreated$3(this.f29578b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonMoveKnownFragment$onViewCreated$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29577a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            LessonMoveKnownFragment lessonMoveKnownFragment = this.f29578b;
            lg3 lg3VarM2112n = lessonMoveKnownFragment.m2112n();
            Lifecycle$State lifecycle$State = Lifecycle$State.RESUMED;
            C24451 c24451 = new C24451(lessonMoveKnownFragment, null);
            this.f29577a = 1;
            if (AbstractC0708b.m2510c(lg3VarM2112n, lifecycle$State, c24451, this) == coroutineSingletons) {
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
