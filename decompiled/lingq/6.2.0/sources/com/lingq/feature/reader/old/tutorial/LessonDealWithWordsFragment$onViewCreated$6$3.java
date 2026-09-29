package com.lingq.feature.reader.old.tutorial;

import com.lingq.core.analytics.data.LqAnalyticsValues$UpgradePopupSource;
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
@c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonDealWithWordsFragment$onViewCreated$6$3", m4291f = "LessonDealWithWordsFragment.kt", m4292l = {208}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonDealWithWordsFragment$onViewCreated$6$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29516a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonDealWithWordsFragment f29517b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.tutorial.LessonDealWithWordsFragment$onViewCreated$6$3$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonDealWithWordsFragment$onViewCreated$6$3$1", m4291f = "LessonDealWithWordsFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C24261 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LessonDealWithWordsFragment f29518a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24261(LessonDealWithWordsFragment lessonDealWithWordsFragment, Continuation continuation) {
            super(2, continuation);
            this.f29518a = lessonDealWithWordsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C24261(this.f29518a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C24261 c24261 = (C24261) create((xfa) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c24261.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = LessonDealWithWordsFragment.f29486Z0;
            this.f29518a.m9348B0().mo3741r0(LqAnalyticsValues$UpgradePopupSource.BlueWordClick.getValue(), false, null);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonDealWithWordsFragment$onViewCreated$6$3(LessonDealWithWordsFragment lessonDealWithWordsFragment, Continuation continuation) {
        super(2, continuation);
        this.f29517b = lessonDealWithWordsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonDealWithWordsFragment$onViewCreated$6$3(this.f29517b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonDealWithWordsFragment$onViewCreated$6$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29516a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = LessonDealWithWordsFragment.f29486Z0;
            LessonDealWithWordsFragment lessonDealWithWordsFragment = this.f29517b;
            du0 du0Var = lessonDealWithWordsFragment.m9348B0().f29658n;
            C24261 c24261 = new C24261(lessonDealWithWordsFragment, null);
            this.f29516a = 1;
            if (AbstractC3224d.m15529h(du0Var, c24261, this) == coroutineSingletons) {
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
