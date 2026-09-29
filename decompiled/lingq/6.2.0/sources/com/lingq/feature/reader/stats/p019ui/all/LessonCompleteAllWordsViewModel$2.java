package com.lingq.feature.reader.stats.p019ui.all;

import com.lingq.core.domain.model.lesson.LessonWord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c18;
import p000.c32;
import p000.lda;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsViewModel$2", m4291f = "LessonCompleteAllWordsViewModel.kt", m4292l = {328}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteAllWordsViewModel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30889a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2556c f30890b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsViewModel$2$1 */
    @c32(m4290c = "com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsViewModel$2$1", m4291f = "LessonCompleteAllWordsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C25451 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f30891a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2556c f30892b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25451(C2556c c2556c, Continuation continuation) {
            super(2, continuation);
            this.f30892b = c2556c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C25451 c25451 = new C25451(this.f30892b, continuation);
            c25451.f30891a = obj;
            return c25451;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C25451 c25451 = (C25451) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c25451.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f30891a;
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
                C2556c c2556c = this.f30892b;
                wfb.m23926u(lda.m16103C(c2556c), null, null, new LessonCompleteAllWordsViewModel$fetchPopularMeanings$1(c2556c, str, null), 3);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteAllWordsViewModel$2(C2556c c2556c, Continuation continuation) {
        super(2, continuation);
        this.f30890b = c2556c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteAllWordsViewModel$2(this.f30890b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteAllWordsViewModel$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30889a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2556c c2556c = this.f30890b;
            c18 c18Var = c2556c.f30968p;
            C25451 c25451 = new C25451(c2556c, null);
            c18Var.getClass();
            this.f30889a = 1;
            if (AbstractC3224d.m15529h(c18Var, c25451, this) == coroutineSingletons) {
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
