package com.lingq.feature.reader.vocabulary;

import com.lingq.core.domain.model.lesson.LessonWord;
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
@c32(m4290c = "com.lingq.feature.reader.vocabulary.LessonVocabularyViewModel$3", m4291f = "LessonVocabularyViewModel.kt", m4292l = {386}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonVocabularyViewModel$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31582a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2610a f31583b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.vocabulary.LessonVocabularyViewModel$3$1 */
    @c32(m4290c = "com.lingq.feature.reader.vocabulary.LessonVocabularyViewModel$3$1", m4291f = "LessonVocabularyViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26011 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f31584a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2610a f31585b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26011(C2610a c2610a, Continuation continuation) {
            super(2, continuation);
            this.f31585b = c2610a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C26011 c26011 = new C26011(this.f31585b, continuation);
            c26011.f31584a = obj;
            return c26011;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C26011 c26011 = (C26011) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c26011.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f31584a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((LessonWord) obj2).f19319f.isEmpty()) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = ((LessonWord) it.next()).f19314a;
                C2610a c2610a = this.f31585b;
                wfb.m23926u(lda.m16103C(c2610a), null, null, new LessonVocabularyViewModel$fetchTokenTranslation$1(c2610a, str, null), 3);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonVocabularyViewModel$3(C2610a c2610a, Continuation continuation) {
        super(2, continuation);
        this.f31583b = c2610a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonVocabularyViewModel$3(this.f31583b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonVocabularyViewModel$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31582a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2610a c2610a = this.f31583b;
            C3244l c3244l = c2610a.f31672r;
            C26011 c26011 = new C26011(c2610a, null);
            c3244l.getClass();
            this.f31582a = 1;
            if (AbstractC3224d.m15529h(c3244l, c26011, this) == coroutineSingletons) {
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
