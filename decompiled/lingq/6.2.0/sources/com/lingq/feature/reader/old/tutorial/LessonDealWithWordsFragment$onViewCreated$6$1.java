package com.lingq.feature.reader.old.tutorial;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.b34;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.s05;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonDealWithWordsFragment$onViewCreated$6$1", m4291f = "LessonDealWithWordsFragment.kt", m4292l = {229}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonDealWithWordsFragment$onViewCreated$6$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29506a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonDealWithWordsFragment f29507b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s05 f29508c;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.tutorial.LessonDealWithWordsFragment$onViewCreated$6$1$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonDealWithWordsFragment$onViewCreated$6$1$1", m4291f = "LessonDealWithWordsFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C24241 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f29509a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ s05 f29510b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ LessonDealWithWordsFragment f29511c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24241(s05 s05Var, LessonDealWithWordsFragment lessonDealWithWordsFragment, Continuation continuation) {
            super(2, continuation);
            this.f29510b = s05Var;
            this.f29511c = lessonDealWithWordsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C24241 c24241 = new C24241(this.f29510b, this.f29511c, continuation);
            c24241.f29509a = obj;
            return c24241;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C24241 c24241 = (C24241) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c24241.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f29509a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (list != null) {
                this.f29510b.m21309l(list);
                if (list.isEmpty()) {
                    LessonDealWithWordsFragment lessonDealWithWordsFragment = this.f29511c;
                    lessonDealWithWordsFragment.f29493Y0 = true;
                    b34.m3244j(lessonDealWithWordsFragment).m22689f();
                }
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonDealWithWordsFragment$onViewCreated$6$1(s05 s05Var, LessonDealWithWordsFragment lessonDealWithWordsFragment, Continuation continuation) {
        super(2, continuation);
        this.f29507b = lessonDealWithWordsFragment;
        this.f29508c = s05Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonDealWithWordsFragment$onViewCreated$6$1(this.f29508c, this.f29507b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonDealWithWordsFragment$onViewCreated$6$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29506a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = LessonDealWithWordsFragment.f29486Z0;
            LessonDealWithWordsFragment lessonDealWithWordsFragment = this.f29507b;
            c18 c18Var = lessonDealWithWordsFragment.m9348B0().f29656l;
            C24241 c24241 = new C24241(this.f29508c, lessonDealWithWordsFragment, null);
            c18Var.getClass();
            this.f29506a = 1;
            if (AbstractC3224d.m15529h(c18Var, c24241, this) == coroutineSingletons) {
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
