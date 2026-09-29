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
@c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonDealWithWordsFragment$onViewCreated$4", m4291f = "LessonDealWithWordsFragment.kt", m4292l = {177}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonDealWithWordsFragment$onViewCreated$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29503a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonDealWithWordsFragment f29504b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.tutorial.LessonDealWithWordsFragment$onViewCreated$4$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonDealWithWordsFragment$onViewCreated$4$1", m4291f = "LessonDealWithWordsFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C24231 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LessonDealWithWordsFragment f29505a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24231(LessonDealWithWordsFragment lessonDealWithWordsFragment, Continuation continuation) {
            super(2, continuation);
            this.f29505a = lessonDealWithWordsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C24231(this.f29505a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C24231 c24231 = (C24231) create((un1) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c24231.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = LessonDealWithWordsFragment.f29486Z0;
            this.f29505a.m9348B0().mo8768j0(false);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonDealWithWordsFragment$onViewCreated$4(LessonDealWithWordsFragment lessonDealWithWordsFragment, Continuation continuation) {
        super(2, continuation);
        this.f29504b = lessonDealWithWordsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonDealWithWordsFragment$onViewCreated$4(this.f29504b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonDealWithWordsFragment$onViewCreated$4) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29503a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            LessonDealWithWordsFragment lessonDealWithWordsFragment = this.f29504b;
            lg3 lg3VarM2112n = lessonDealWithWordsFragment.m2112n();
            Lifecycle$State lifecycle$State = Lifecycle$State.RESUMED;
            C24231 c24231 = new C24231(lessonDealWithWordsFragment, null);
            this.f29503a = 1;
            if (AbstractC0708b.m2510c(lg3VarM2112n, lifecycle$State, c24231, this) == coroutineSingletons) {
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
