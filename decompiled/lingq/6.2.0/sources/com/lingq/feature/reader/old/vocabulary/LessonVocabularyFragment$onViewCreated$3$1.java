package com.lingq.feature.reader.old.vocabulary;

import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.token.TokenControllerType;
import com.lingq.core.token.TokenPopupData;
import com.lingq.core.token.TokenViewState;
import com.lingq.feature.reader.vocabulary.C2610a;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.b34;
import p000.c32;
import p000.c75;
import p000.dd6;
import p000.du0;
import p000.ed6;
import p000.jfa;
import p000.un1;
import p000.vz1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.vocabulary.LessonVocabularyFragment$onViewCreated$3$1", m4291f = "LessonVocabularyFragment.kt", m4292l = {153}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonVocabularyFragment$onViewCreated$3$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29688a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonVocabularyFragment f29689b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.vocabulary.LessonVocabularyFragment$onViewCreated$3$1$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.vocabulary.LessonVocabularyFragment$onViewCreated$3$1$1", m4291f = "LessonVocabularyFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C24601 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f29690a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LessonVocabularyFragment f29691b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24601(LessonVocabularyFragment lessonVocabularyFragment, Continuation continuation) {
            super(2, continuation);
            this.f29691b = lessonVocabularyFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C24601 c24601 = new C24601(this.f29691b, continuation);
            c24601.f29690a = obj;
            return c24601;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C24601 c24601 = (C24601) create((Pair) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c24601.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Pair pair = (Pair) this.f29690a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            String str = (String) pair.f47623a;
            TokenType tokenType = (TokenType) pair.f47624b;
            LessonVocabularyFragment lessonVocabularyFragment = this.f29691b;
            boolean zM23653w = vz1.m23653w(lessonVocabularyFragment);
            TokenViewState.Expanded expanded = TokenViewState.Expanded.f23709a;
            if (zM23653w) {
                C2610a c2610aM9356S0 = lessonVocabularyFragment.m9356S0();
                c2610aM9356S0.f31656b.mo8738E1(new TokenPopupData(str, vz1.m23609O(str, lessonVocabularyFragment.m9356S0().f31657c.mo4589b2()), tokenType, 0, 0, null, expanded, TokenControllerType.Lesson, null, 0, null, false, 0, 0, null, 0, 0, 0, 0, false, null, null, false, 8388408, null));
            } else {
                jfa.m14428k(b34.m3244j(lessonVocabularyFragment), dd6.m10296a(ed6.Companion, new TokenPopupData(str, vz1.m23609O(str, lessonVocabularyFragment.m9356S0().f31657c.mo4589b2()), tokenType, 0, 0, null, expanded, TokenControllerType.Vocabulary, null, 0, null, false, 0, 0, null, 0, 0, 0, 0, false, null, null, false, 8388408, null), ((c75) lessonVocabularyFragment.f29678D0.getValue()).f9661a), null);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonVocabularyFragment$onViewCreated$3$1(LessonVocabularyFragment lessonVocabularyFragment, Continuation continuation) {
        super(2, continuation);
        this.f29689b = lessonVocabularyFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonVocabularyFragment$onViewCreated$3$1(this.f29689b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonVocabularyFragment$onViewCreated$3$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29688a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            LessonVocabularyFragment lessonVocabularyFragment = this.f29689b;
            du0 du0Var = lessonVocabularyFragment.m9356S0().f31679y;
            C24601 c24601 = new C24601(lessonVocabularyFragment, null);
            this.f29688a = 1;
            if (AbstractC3224d.m15529h(du0Var, c24601, this) == coroutineSingletons) {
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
