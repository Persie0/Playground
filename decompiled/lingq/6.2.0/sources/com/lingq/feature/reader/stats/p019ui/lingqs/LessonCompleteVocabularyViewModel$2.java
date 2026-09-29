package com.lingq.feature.reader.stats.p019ui.lingqs;

import com.lingq.core.domain.model.lesson.LessonCard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.lda;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.ui.lingqs.LessonCompleteVocabularyViewModel$2", m4291f = "LessonCompleteVocabularyViewModel.kt", m4292l = {292}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteVocabularyViewModel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31002a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2568b f31003b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.stats.ui.lingqs.LessonCompleteVocabularyViewModel$2$1 */
    @c32(m4290c = "com.lingq.feature.reader.stats.ui.lingqs.LessonCompleteVocabularyViewModel$2$1", m4291f = "LessonCompleteVocabularyViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C25601 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f31004a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2568b f31005b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25601(C2568b c2568b, Continuation continuation) {
            super(2, continuation);
            this.f31005b = c2568b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C25601 c25601 = new C25601(this.f31005b, continuation);
            c25601.f31004a = obj;
            return c25601;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C25601 c25601 = (C25601) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c25601.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f31004a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((LessonCard) obj2).f19183f.isEmpty()) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = ((LessonCard) it.next()).f19178a;
                C2568b c2568b = this.f31005b;
                wfb.m23926u(lda.m16103C(c2568b), null, null, new LessonCompleteVocabularyViewModel$fetchPopularMeanings$1(c2568b, str, null), 3);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteVocabularyViewModel$2(C2568b c2568b, Continuation continuation) {
        super(2, continuation);
        this.f31003b = c2568b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteVocabularyViewModel$2(this.f31003b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteVocabularyViewModel$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31002a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2568b c2568b = this.f31003b;
            C3244l c3244l = c2568b.f31071r;
            C25601 c25601 = new C25601(c2568b, null);
            c3244l.getClass();
            this.f31002a = 1;
            if (AbstractC3224d.m15529h(c3244l, c25601, this) == coroutineSingletons) {
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
