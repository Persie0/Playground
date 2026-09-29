package com.lingq.feature.reader.vocabulary;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.feature.reader.vocabulary.model.VocabularyType;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import p000.C3386nv;
import p000.C3540rl;
import p000.aj3;
import p000.c32;
import p000.g41;
import p000.lda;
import p000.nn1;
import p000.un1;
import p000.ux5;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.vocabulary.LessonVocabularyViewModel$1", m4291f = "LessonVocabularyViewModel.kt", m4292l = {112}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonVocabularyViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31572a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2610a f31573b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.vocabulary.LessonVocabularyViewModel$1$1 */
    @c32(m4290c = "com.lingq.feature.reader.vocabulary.LessonVocabularyViewModel$1$1", m4291f = "LessonVocabularyViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C25981 extends SuspendLambda implements aj3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ int f31574a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ VocabularyType f31575b;

        @Override // p000.aj3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int iIntValue = ((Number) obj).intValue();
            C25981 c25981 = new C25981(3, (Continuation) obj3);
            c25981.f31574a = iIntValue;
            c25981.f31575b = (VocabularyType) obj2;
            return c25981.invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.f31574a;
            VocabularyType vocabularyType = this.f31575b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            return new Pair(new Integer(i), vocabularyType);
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.reader.vocabulary.LessonVocabularyViewModel$1$2 */
    @c32(m4290c = "com.lingq.feature.reader.vocabulary.LessonVocabularyViewModel$1$2", m4291f = "LessonVocabularyViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C25992 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f31576a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2610a f31577b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25992(C2610a c2610a, Continuation continuation) {
            super(2, continuation);
            this.f31577b = c2610a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C25992 c25992 = new C25992(this.f31577b, continuation);
            c25992.f31576a = obj;
            return c25992;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C25992 c25992 = (C25992) create((Pair) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c25992.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Pair pair = (Pair) this.f31576a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            int iIntValue = ((Number) pair.f47623a).intValue();
            VocabularyType vocabularyType = (VocabularyType) pair.f47624b;
            C2610a c2610a = this.f31577b;
            g41 g41VarM16103C = lda.m16103C(c2610a);
            nn1 nn1Var = c2610a.f31662h;
            AbstractC1263a.m7047b(g41VarM16103C, nn1Var, ux5.m22988k(iIntValue, "cards "), new LessonVocabularyViewModel$fetchCards$1(c2610a, iIntValue, null));
            if (vocabularyType != VocabularyType.Cards) {
                AbstractC1263a.m7047b(lda.m16103C(c2610a), nn1Var, ux5.m22988k(iIntValue, "words "), new LessonVocabularyViewModel$fetchWords$1(c2610a, iIntValue, null));
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonVocabularyViewModel$1(C2610a c2610a, Continuation continuation) {
        super(2, continuation);
        this.f31573b = c2610a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonVocabularyViewModel$1(this.f31573b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonVocabularyViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31572a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2610a c2610a = this.f31573b;
            C3228h c3228h = new C3228h(new C3540rl(c2610a.f31667m, 5), c2610a.f31676v, new C25981(3, null));
            C25992 c25992 = new C25992(c2610a, null);
            this.f31572a = 1;
            if (AbstractC3224d.m15529h(c3228h, c25992, this) == coroutineSingletons) {
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
