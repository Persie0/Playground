package com.lingq.feature.vocabulary.state;

import com.lingq.core.data.repository.C1293i;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.vocabulary.VocabularySearchQuery;
import kotlin.AbstractC3193b;
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
import p000.xza;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.state.VocabularyFilterSheetStateHolder$loadSrsDateItems$1", m4291f = "VocabularyFilterSheetStateHolder.kt", m4292l = {371}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyFilterSheetStateHolder$loadSrsDateItems$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33727a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2860b f33728b;

    /* JADX INFO: renamed from: com.lingq.feature.vocabulary.state.VocabularyFilterSheetStateHolder$loadSrsDateItems$1$1 */
    @c32(m4290c = "com.lingq.feature.vocabulary.state.VocabularyFilterSheetStateHolder$loadSrsDateItems$1$1", m4291f = "VocabularyFilterSheetStateHolder.kt", m4292l = {364}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28551 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f33729a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2860b f33730b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28551(C2860b c2860b, Continuation continuation) {
            super(2, continuation);
            this.f33730b = c2860b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C28551(this.f33730b, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C28551) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C2860b c2860b = this.f33730b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f33729a;
            try {
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    Language language = (Language) c2860b.f33777f.mo4572B0().getValue();
                    if (language != null) {
                        int i2 = language.f19025b;
                        lm4 lm4Var = c2860b.f33775d;
                        this.f33729a = 1;
                        if (((C1293i) lm4Var).m7214k(i2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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

    /* JADX INFO: renamed from: com.lingq.feature.vocabulary.state.VocabularyFilterSheetStateHolder$loadSrsDateItems$1$2 */
    @c32(m4290c = "com.lingq.feature.vocabulary.state.VocabularyFilterSheetStateHolder$loadSrsDateItems$1$2", m4291f = "VocabularyFilterSheetStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28562 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2860b f33731a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28562(C2860b c2860b, Continuation continuation) {
            super(2, continuation);
            this.f33731a = c2860b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C28562(this.f33731a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C28562 c28562 = (C28562) create((e83) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c28562.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2860b.m9763b(this.f33731a, true);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFilterSheetStateHolder$loadSrsDateItems$1(C2860b c2860b, Continuation continuation) {
        super(2, continuation);
        this.f33728b = c2860b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyFilterSheetStateHolder$loadSrsDateItems$1(this.f33728b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((VocabularyFilterSheetStateHolder$loadSrsDateItems$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33727a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2860b c2860b = this.f33728b;
            wfb.m23926u(c2860b.f33779h, c2860b.f33778g, null, new C28551(c2860b, null), 2);
            C3244l c3244l = c2860b.f33790s;
            VocabularySearchQuery vocabularySearchQuery = c2860b.f33784m;
            if (vocabularySearchQuery == null || (str = vocabularySearchQuery.f19864f) == null) {
                str = "";
            }
            c3244l.getClass();
            c3244l.m15572j(null, str);
            m83 m83Var = new m83(((C1293i) c2860b.f33775d).m7215l(c2860b.f33777f.mo4589b2()), new C28562(c2860b, null));
            xza xzaVar = new xza(c2860b, 4);
            this.f33727a = 1;
            if (m83Var.collect(xzaVar, this) == coroutineSingletons) {
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
