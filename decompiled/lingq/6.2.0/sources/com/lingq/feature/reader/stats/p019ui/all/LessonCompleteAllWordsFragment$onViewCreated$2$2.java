package com.lingq.feature.reader.stats.p019ui.all;

import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import com.lingq.core.token.TokenPopupHostFragment;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.b34;
import p000.bh4;
import p000.c32;
import p000.c83;
import p000.jfa;
import p000.un1;
import p000.vz1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsFragment$onViewCreated$2$2", m4291f = "LessonCompleteAllWordsFragment.kt", m4292l = {139}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteAllWordsFragment$onViewCreated$2$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30876a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonCompleteAllWordsFragment f30877b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsFragment$onViewCreated$2$2$1 */
    @c32(m4290c = "com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsFragment$onViewCreated$2$2$1", m4291f = "LessonCompleteAllWordsFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C25381 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LessonCompleteAllWordsFragment f30878a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25381(LessonCompleteAllWordsFragment lessonCompleteAllWordsFragment, Continuation continuation) {
            super(2, continuation);
            this.f30878a = lessonCompleteAllWordsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C25381(this.f30878a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C25381 c25381 = (C25381) create((xfa) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c25381.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            LessonCompleteAllWordsFragment lessonCompleteAllWordsFragment = this.f30878a;
            if (vz1.m23653w(lessonCompleteAllWordsFragment)) {
                AbstractC0638f abstractC0638fM14427j = jfa.m14427j(lessonCompleteAllWordsFragment);
                if (abstractC0638fM14427j != null) {
                    AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635cM2137E = abstractC0638fM14427j.m2137E(TokenPopupHostFragment.class.getName());
                    if ((abstractComponentCallbacksC0635cM2137E instanceof TokenPopupHostFragment ? (TokenPopupHostFragment) abstractComponentCallbacksC0635cM2137E : null) != null) {
                        abstractC0638fM14427j.m2147T();
                    }
                }
            } else {
                b34.m3244j(lessonCompleteAllWordsFragment).m22689f();
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteAllWordsFragment$onViewCreated$2$2(LessonCompleteAllWordsFragment lessonCompleteAllWordsFragment, Continuation continuation) {
        super(2, continuation);
        this.f30877b = lessonCompleteAllWordsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteAllWordsFragment$onViewCreated$2$2(this.f30877b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteAllWordsFragment$onViewCreated$2$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30876a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = LessonCompleteAllWordsFragment.f30861F0;
            LessonCompleteAllWordsFragment lessonCompleteAllWordsFragment = this.f30877b;
            c83 c83VarMo8734A2 = lessonCompleteAllWordsFragment.m9466R0().f30954b.mo8734A2();
            C25381 c25381 = new C25381(lessonCompleteAllWordsFragment, null);
            this.f30876a = 1;
            if (AbstractC3224d.m15529h(c83VarMo8734A2, c25381, this) == coroutineSingletons) {
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
