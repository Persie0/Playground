package com.lingq.feature.vocabulary.filter;

import com.lingq.core.data.repository.C1290f;
import com.lingq.core.domain.model.vocabulary.VocabularySearchQuery;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.e83;
import p000.iza;
import p000.m83;
import p000.un1;
import p000.xfa;
import p000.xo1;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.filter.VocabularyFilterSelectionViewModel$getCourseLessons$1", m4291f = "VocabularyFilterSelectionViewModel.kt", m4292l = {401}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyFilterSelectionViewModel$getCourseLessons$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33611a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2850b f33612b;

    /* JADX INFO: renamed from: com.lingq.feature.vocabulary.filter.VocabularyFilterSelectionViewModel$getCourseLessons$1$1 */
    @c32(m4290c = "com.lingq.feature.vocabulary.filter.VocabularyFilterSelectionViewModel$getCourseLessons$1$1", m4291f = "VocabularyFilterSelectionViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28361 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2850b f33613a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28361(C2850b c2850b, Continuation continuation) {
            super(2, continuation);
            this.f33613a = c2850b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C28361(this.f33613a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C28361 c28361 = (C28361) create((e83) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c28361.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f33613a.f33687l;
            Boolean bool = Boolean.TRUE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFilterSelectionViewModel$getCourseLessons$1(C2850b c2850b, Continuation continuation) {
        super(2, continuation);
        this.f33612b = c2850b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyFilterSelectionViewModel$getCourseLessons$1(this.f33612b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((VocabularyFilterSelectionViewModel$getCourseLessons$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Pair pair;
        Integer num;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33611a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2850b c2850b = this.f33612b;
            xo1 xo1Var = c2850b.f33679d;
            VocabularySearchQuery vocabularySearchQuery = (VocabularySearchQuery) c2850b.f33701z.getValue();
            int i2 = 0;
            m83 m83Var = new m83(((C1290f) xo1Var).m7182f((vocabularySearchQuery == null || (pair = vocabularySearchQuery.f19867i) == null || (num = (Integer) pair.f47624b) == null) ? 0 : num.intValue()), new C28361(c2850b, null));
            iza izaVar = new iza(c2850b, i2);
            this.f33611a = 1;
            if (m83Var.collect(izaVar, this) == coroutineSingletons) {
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
