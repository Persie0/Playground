package com.lingq.feature.reader.old.tutorial;

import com.lingq.core.p012ui.UpgradeReason;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.du0;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment$onViewCreated$5$4", m4291f = "LessonMoveKnownFragment.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonMoveKnownFragment$onViewCreated$5$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29594a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonMoveKnownFragment f29595b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment$onViewCreated$5$4$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment$onViewCreated$5$4$1", m4291f = "LessonMoveKnownFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C24491 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LessonMoveKnownFragment f29596a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24491(LessonMoveKnownFragment lessonMoveKnownFragment, Continuation continuation) {
            super(2, continuation);
            this.f29596a = lessonMoveKnownFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C24491(this.f29596a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C24491 c24491 = (C24491) create((xfa) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c24491.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = LessonMoveKnownFragment.f29562H0;
            this.f29596a.m9352T0().mo3737M1(UpgradeReason.LIMIT_WORDS);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonMoveKnownFragment$onViewCreated$5$4(LessonMoveKnownFragment lessonMoveKnownFragment, Continuation continuation) {
        super(2, continuation);
        this.f29595b = lessonMoveKnownFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonMoveKnownFragment$onViewCreated$5$4(this.f29595b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonMoveKnownFragment$onViewCreated$5$4) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29594a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = LessonMoveKnownFragment.f29562H0;
            LessonMoveKnownFragment lessonMoveKnownFragment = this.f29595b;
            du0 du0Var = lessonMoveKnownFragment.m9352T0().f29675r;
            C24491 c24491 = new C24491(lessonMoveKnownFragment, null);
            this.f29594a = 1;
            if (AbstractC3224d.m15529h(du0Var, c24491, this) == coroutineSingletons) {
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
