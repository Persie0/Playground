package com.lingq.feature.reader.old.tutorial;

import com.lingq.feature.reader.R$plurals;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.s05;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment$onViewCreated$5$1", m4291f = "LessonMoveKnownFragment.kt", m4292l = {198}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonMoveKnownFragment$onViewCreated$5$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29580a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonMoveKnownFragment f29581b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s05 f29582c;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment$onViewCreated$5$1$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment$onViewCreated$5$1$1", m4291f = "LessonMoveKnownFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C24461 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f29583a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ s05 f29584b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ LessonMoveKnownFragment f29585c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24461(s05 s05Var, LessonMoveKnownFragment lessonMoveKnownFragment, Continuation continuation) {
            super(2, continuation);
            this.f29584b = s05Var;
            this.f29585c = lessonMoveKnownFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C24461 c24461 = new C24461(this.f29584b, this.f29585c, continuation);
            c24461.f29583a = obj;
            return c24461;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C24461 c24461 = (C24461) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c24461.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f29583a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f29584b.m21309l(list);
            bh4[] bh4VarArr = LessonMoveKnownFragment.f29562H0;
            LessonMoveKnownFragment lessonMoveKnownFragment = this.f29585c;
            lessonMoveKnownFragment.m9350R0().f68121b.setText(lessonMoveKnownFragment.m2110l().getQuantityString(R$plurals.paging_move_known_action_button, list.size(), new Integer(list.size())));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonMoveKnownFragment$onViewCreated$5$1(s05 s05Var, LessonMoveKnownFragment lessonMoveKnownFragment, Continuation continuation) {
        super(2, continuation);
        this.f29581b = lessonMoveKnownFragment;
        this.f29582c = s05Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonMoveKnownFragment$onViewCreated$5$1(this.f29582c, this.f29581b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonMoveKnownFragment$onViewCreated$5$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29580a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = LessonMoveKnownFragment.f29562H0;
            LessonMoveKnownFragment lessonMoveKnownFragment = this.f29581b;
            c18 c18Var = lessonMoveKnownFragment.m9352T0().f29672o;
            C24461 c24461 = new C24461(this.f29582c, lessonMoveKnownFragment, null);
            c18Var.getClass();
            this.f29580a = 1;
            if (AbstractC3224d.m15529h(c18Var, c24461, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17633t("SharedFlow never completes, this call should never return.");
        return null;
    }
}
