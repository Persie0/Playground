package com.lingq.feature.vocabulary.filter;

import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.navigation.fragment.NavHostFragment;
import com.lingq.core.settings.FilterType;
import com.lingq.feature.vocabulary.R$id;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.jfa;
import p000.sya;
import p000.t0b;
import p000.un1;
import p000.uya;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.filter.VocabularyParentFilterFragment$onViewCreated$2$1", m4291f = "VocabularyParentFilterFragment.kt", m4292l = {56}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyParentFilterFragment$onViewCreated$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33664a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ VocabularyParentFilterFragment f33665b;

    /* JADX INFO: renamed from: com.lingq.feature.vocabulary.filter.VocabularyParentFilterFragment$onViewCreated$2$1$1 */
    @c32(m4290c = "com.lingq.feature.vocabulary.filter.VocabularyParentFilterFragment$onViewCreated$2$1$1", m4291f = "VocabularyParentFilterFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28431 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f33666a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VocabularyParentFilterFragment f33667b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28431(VocabularyParentFilterFragment vocabularyParentFilterFragment, Continuation continuation) {
            super(2, continuation);
            this.f33667b = vocabularyParentFilterFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C28431 c28431 = new C28431(this.f33667b, continuation);
            c28431.f33666a = obj;
            return c28431;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C28431 c28431 = (C28431) create((FilterType) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c28431.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            FilterType filterType = (FilterType) this.f33666a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            uya.Companion.getClass();
            filterType.getClass();
            sya syaVar = new sya(filterType);
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635cM2136D = this.f33667b.m2106h().m2136D(R$id.nav_host_fragment_vocabulary);
            abstractComponentCallbacksC0635cM2136D.getClass();
            jfa.m14428k(((NavHostFragment) abstractComponentCallbacksC0635cM2136D).m2573c0(), syaVar, null);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyParentFilterFragment$onViewCreated$2$1(VocabularyParentFilterFragment vocabularyParentFilterFragment, Continuation continuation) {
        super(2, continuation);
        this.f33665b = vocabularyParentFilterFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyParentFilterFragment$onViewCreated$2$1(this.f33665b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((VocabularyParentFilterFragment$onViewCreated$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33664a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            VocabularyParentFilterFragment vocabularyParentFilterFragment = this.f33665b;
            c83 c83VarMo20215J1 = ((t0b) vocabularyParentFilterFragment.f33657R0.getValue()).f61727b.mo20215J1();
            C28431 c28431 = new C28431(vocabularyParentFilterFragment, null);
            this.f33664a = 1;
            if (AbstractC3224d.m15529h(c83VarMo20215J1, c28431, this) == coroutineSingletons) {
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
