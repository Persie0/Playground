package com.lingq.feature.reader.old.tutorial;

import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.lg3;
import p000.s05;
import p000.un1;
import p000.wb5;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.reader.old.tutorial.LessonDealWithWordsFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonDealWithWordsFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1", m4291f = "LessonDealWithWordsFragment.kt", m4292l = {153}, m4293m = "invokeSuspend", m4294v = 2)
public final class C2422x8b9cc0f2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29495a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonDealWithWordsFragment f29496b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Lifecycle$State f29497c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ LessonDealWithWordsFragment f29498d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ s05 f29499e;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.tutorial.LessonDealWithWordsFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, reason: invalid class name */
    @c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonDealWithWordsFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", m4291f = "LessonDealWithWordsFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    public final class AnonymousClass1 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f29500a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LessonDealWithWordsFragment f29501b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ s05 f29502c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(s05 s05Var, LessonDealWithWordsFragment lessonDealWithWordsFragment, Continuation continuation) {
            super(2, continuation);
            this.f29501b = lessonDealWithWordsFragment;
            this.f29502c = s05Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f29502c, this.f29501b, continuation);
            anonymousClass1.f29500a = obj;
            return anonymousClass1;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((un1) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            anonymousClass1.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            un1 un1Var = (un1) this.f29500a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            s05 s05Var = this.f29502c;
            LessonDealWithWordsFragment lessonDealWithWordsFragment = this.f29501b;
            wfb.m23926u(un1Var, null, null, new LessonDealWithWordsFragment$onViewCreated$6$1(s05Var, lessonDealWithWordsFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new LessonDealWithWordsFragment$onViewCreated$6$2(lessonDealWithWordsFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new LessonDealWithWordsFragment$onViewCreated$6$3(lessonDealWithWordsFragment, null), 3);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2422x8b9cc0f2(LessonDealWithWordsFragment lessonDealWithWordsFragment, Lifecycle$State lifecycle$State, Continuation continuation, LessonDealWithWordsFragment lessonDealWithWordsFragment2, s05 s05Var) {
        super(2, continuation);
        this.f29496b = lessonDealWithWordsFragment;
        this.f29497c = lifecycle$State;
        this.f29498d = lessonDealWithWordsFragment2;
        this.f29499e = s05Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C2422x8b9cc0f2(this.f29496b, this.f29497c, continuation, this.f29498d, this.f29499e);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C2422x8b9cc0f2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29495a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            lg3 lg3VarM2112n = this.f29496b.m2112n();
            lg3VarM2112n.m16179b();
            wb5 wb5Var = lg3VarM2112n.f49626e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f29499e, this.f29498d, null);
            this.f29495a = 1;
            if (AbstractC0708b.m2509b(wb5Var, this.f29497c, anonymousClass1, this) == coroutineSingletons) {
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
