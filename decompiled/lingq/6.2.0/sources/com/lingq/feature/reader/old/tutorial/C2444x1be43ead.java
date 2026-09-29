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

/* JADX INFO: renamed from: com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1", m4291f = "LessonMoveKnownFragment.kt", m4292l = {153}, m4293m = "invokeSuspend", m4294v = 2)
public final class C2444x1be43ead extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29569a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonMoveKnownFragment f29570b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Lifecycle$State f29571c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ LessonMoveKnownFragment f29572d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ s05 f29573e;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, reason: invalid class name */
    @c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", m4291f = "LessonMoveKnownFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    public final class AnonymousClass1 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f29574a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LessonMoveKnownFragment f29575b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ s05 f29576c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(s05 s05Var, LessonMoveKnownFragment lessonMoveKnownFragment, Continuation continuation) {
            super(2, continuation);
            this.f29575b = lessonMoveKnownFragment;
            this.f29576c = s05Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f29576c, this.f29575b, continuation);
            anonymousClass1.f29574a = obj;
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
            un1 un1Var = (un1) this.f29574a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            s05 s05Var = this.f29576c;
            LessonMoveKnownFragment lessonMoveKnownFragment = this.f29575b;
            wfb.m23926u(un1Var, null, null, new LessonMoveKnownFragment$onViewCreated$5$1(s05Var, lessonMoveKnownFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new LessonMoveKnownFragment$onViewCreated$5$2(lessonMoveKnownFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new LessonMoveKnownFragment$onViewCreated$5$3(lessonMoveKnownFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new LessonMoveKnownFragment$onViewCreated$5$4(lessonMoveKnownFragment, null), 3);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2444x1be43ead(LessonMoveKnownFragment lessonMoveKnownFragment, Lifecycle$State lifecycle$State, Continuation continuation, LessonMoveKnownFragment lessonMoveKnownFragment2, s05 s05Var) {
        super(2, continuation);
        this.f29570b = lessonMoveKnownFragment;
        this.f29571c = lifecycle$State;
        this.f29572d = lessonMoveKnownFragment2;
        this.f29573e = s05Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C2444x1be43ead(this.f29570b, this.f29571c, continuation, this.f29572d, this.f29573e);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C2444x1be43ead) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29569a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            lg3 lg3VarM2112n = this.f29570b.m2112n();
            lg3VarM2112n.m16179b();
            wb5 wb5Var = lg3VarM2112n.f49626e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f29573e, this.f29572d, null);
            this.f29569a = 1;
            if (AbstractC0708b.m2509b(wb5Var, this.f29571c, anonymousClass1, this) == coroutineSingletons) {
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
