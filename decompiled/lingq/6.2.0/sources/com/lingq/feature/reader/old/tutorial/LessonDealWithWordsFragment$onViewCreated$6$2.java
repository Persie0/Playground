package com.lingq.feature.reader.old.tutorial;

import com.lingq.feature.reader.R$string;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.un1;
import p000.wd3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonDealWithWordsFragment$onViewCreated$6$2", m4291f = "LessonDealWithWordsFragment.kt", m4292l = {229}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonDealWithWordsFragment$onViewCreated$6$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29512a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonDealWithWordsFragment f29513b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.tutorial.LessonDealWithWordsFragment$onViewCreated$6$2$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonDealWithWordsFragment$onViewCreated$6$2$1", m4291f = "LessonDealWithWordsFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C24251 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f29514a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LessonDealWithWordsFragment f29515b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24251(LessonDealWithWordsFragment lessonDealWithWordsFragment, Continuation continuation) {
            super(2, continuation);
            this.f29515b = lessonDealWithWordsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C24251 c24251 = new C24251(this.f29515b, continuation);
            c24251.f29514a = obj;
            return c24251;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C24251 c24251 = (C24251) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c24251.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f29514a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = LessonDealWithWordsFragment.f29486Z0;
            LessonDealWithWordsFragment lessonDealWithWordsFragment = this.f29515b;
            if (lessonDealWithWordsFragment.m9348B0().f29652h == -1) {
                lessonDealWithWordsFragment.m9348B0().m9353V2(list);
            } else {
                ((wd3) lessonDealWithWordsFragment.f29487S0.getValue(lessonDealWithWordsFragment, LessonDealWithWordsFragment.f29486Z0[0])).f66642e.setText(R$string.lesson_page_move_known_title);
                lessonDealWithWordsFragment.m9348B0().m9353V2(EmptyList.f47638a);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonDealWithWordsFragment$onViewCreated$6$2(LessonDealWithWordsFragment lessonDealWithWordsFragment, Continuation continuation) {
        super(2, continuation);
        this.f29513b = lessonDealWithWordsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonDealWithWordsFragment$onViewCreated$6$2(this.f29513b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonDealWithWordsFragment$onViewCreated$6$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29512a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = LessonDealWithWordsFragment.f29486Z0;
            LessonDealWithWordsFragment lessonDealWithWordsFragment = this.f29513b;
            c18 c18Var = lessonDealWithWordsFragment.m9347A0().f29402r1;
            C24251 c24251 = new C24251(lessonDealWithWordsFragment, null);
            c18Var.getClass();
            this.f29512a = 1;
            if (AbstractC3224d.m15529h(c18Var, c24251, this) == coroutineSingletons) {
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
