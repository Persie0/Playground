package com.lingq.feature.vocabulary.state;

import com.lingq.core.data.repository.C1293i;
import com.lingq.core.domain.model.vocabulary.VocabularySearchQuery;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.e83;
import p000.lm4;
import p000.m83;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.state.VocabularyFilterSheetStateHolder$loadTagItems$1", m4291f = "VocabularyFilterSheetStateHolder.kt", m4292l = {318}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyFilterSheetStateHolder$loadTagItems$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33732a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2860b f33733b;

    /* JADX INFO: renamed from: com.lingq.feature.vocabulary.state.VocabularyFilterSheetStateHolder$loadTagItems$1$1 */
    @c32(m4290c = "com.lingq.feature.vocabulary.state.VocabularyFilterSheetStateHolder$loadTagItems$1$1", m4291f = "VocabularyFilterSheetStateHolder.kt", m4292l = {312}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28571 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f33734a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2860b f33735b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28571(C2860b c2860b, Continuation continuation) {
            super(2, continuation);
            this.f33735b = c2860b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C28571(this.f33735b, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C28571) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f33734a;
            try {
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    C2860b c2860b = this.f33735b;
                    lm4 lm4Var = c2860b.f33775d;
                    String strMo4589b2 = c2860b.f33777f.mo4589b2();
                    this.f33734a = 1;
                    if (((C1293i) lm4Var).m7210g(strMo4589b2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj);
                }
            } catch (Exception unused) {
            }
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.vocabulary.state.VocabularyFilterSheetStateHolder$loadTagItems$1$2 */
    @c32(m4290c = "com.lingq.feature.vocabulary.state.VocabularyFilterSheetStateHolder$loadTagItems$1$2", m4291f = "VocabularyFilterSheetStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28582 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2860b f33736a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28582(C2860b c2860b, Continuation continuation) {
            super(2, continuation);
            this.f33736a = c2860b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C28582(this.f33736a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C28582 c28582 = (C28582) create((e83) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c28582.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2860b.m9763b(this.f33736a, true);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFilterSheetStateHolder$loadTagItems$1(C2860b c2860b, Continuation continuation) {
        super(2, continuation);
        this.f33733b = c2860b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyFilterSheetStateHolder$loadTagItems$1(this.f33733b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((VocabularyFilterSheetStateHolder$loadTagItems$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33732a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2860b c2860b = this.f33733b;
            wfb.m23926u(c2860b.f33779h, c2860b.f33778g, null, new C28571(c2860b, null), 2);
            C3244l c3244l = c2860b.f33789r;
            VocabularySearchQuery vocabularySearchQuery = c2860b.f33784m;
            if (vocabularySearchQuery == null || (obj2 = vocabularySearchQuery.f19865g) == null) {
                obj2 = EmptyList.f47638a;
            }
            c3244l.getClass();
            c3244l.m15572j(null, obj2);
            m83 m83Var = new m83(((C1293i) c2860b.f33775d).m7206c(c2860b.f33777f.mo4589b2()), new C28582(c2860b, null));
            C2859a c2859a = new C2859a(c2860b);
            this.f33732a = 1;
            if (m83Var.collect(c2859a, this) == coroutineSingletons) {
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
