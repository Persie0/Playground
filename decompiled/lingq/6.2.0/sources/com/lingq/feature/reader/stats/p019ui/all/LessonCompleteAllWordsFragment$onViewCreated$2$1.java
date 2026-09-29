package com.lingq.feature.reader.stats.p019ui.all;

import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.token.TokenControllerType;
import com.lingq.core.token.TokenPopupData;
import com.lingq.core.token.TokenViewState;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.b34;
import p000.bh4;
import p000.c32;
import p000.dd6;
import p000.du0;
import p000.ed6;
import p000.hy4;
import p000.jfa;
import p000.un1;
import p000.vz1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsFragment$onViewCreated$2$1", m4291f = "LessonCompleteAllWordsFragment.kt", m4292l = {123}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteAllWordsFragment$onViewCreated$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30872a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonCompleteAllWordsFragment f30873b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsFragment$onViewCreated$2$1$1 */
    @c32(m4290c = "com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsFragment$onViewCreated$2$1$1", m4291f = "LessonCompleteAllWordsFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C25371 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f30874a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LessonCompleteAllWordsFragment f30875b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25371(LessonCompleteAllWordsFragment lessonCompleteAllWordsFragment, Continuation continuation) {
            super(2, continuation);
            this.f30875b = lessonCompleteAllWordsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C25371 c25371 = new C25371(this.f30875b, continuation);
            c25371.f30874a = obj;
            return c25371;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C25371 c25371 = (C25371) create((Pair) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c25371.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Pair pair = (Pair) this.f30874a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            String str = (String) pair.f47623a;
            TokenType tokenType = (TokenType) pair.f47624b;
            dd6 dd6Var = ed6.Companion;
            bh4[] bh4VarArr = LessonCompleteAllWordsFragment.f30861F0;
            LessonCompleteAllWordsFragment lessonCompleteAllWordsFragment = this.f30875b;
            jfa.m14428k(b34.m3244j(lessonCompleteAllWordsFragment), dd6.m10296a(dd6Var, new TokenPopupData(str, vz1.m23609O(str, lessonCompleteAllWordsFragment.m9466R0().f30955c.mo4589b2()), tokenType, 0, 0, null, TokenViewState.Expanded.f23709a, TokenControllerType.Vocabulary, null, 0, null, false, 0, 0, null, 0, 0, 0, 0, false, null, null, false, 8388408, null), ((hy4) lessonCompleteAllWordsFragment.f30864E0.getValue()).f43203a), null);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteAllWordsFragment$onViewCreated$2$1(LessonCompleteAllWordsFragment lessonCompleteAllWordsFragment, Continuation continuation) {
        super(2, continuation);
        this.f30873b = lessonCompleteAllWordsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteAllWordsFragment$onViewCreated$2$1(this.f30873b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteAllWordsFragment$onViewCreated$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30872a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = LessonCompleteAllWordsFragment.f30861F0;
            LessonCompleteAllWordsFragment lessonCompleteAllWordsFragment = this.f30873b;
            du0 du0Var = lessonCompleteAllWordsFragment.m9466R0().f30977y;
            C25371 c25371 = new C25371(lessonCompleteAllWordsFragment, null);
            this.f30872a = 1;
            if (AbstractC3224d.m15529h(du0Var, c25371, this) == coroutineSingletons) {
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
