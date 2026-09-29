package com.lingq.feature.vocabulary.filter;

import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.navigation.fragment.NavHostFragment;
import com.lingq.feature.vocabulary.R$id;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.t0b;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.filter.VocabularyParentFilterFragment$onViewCreated$2$2", m4291f = "VocabularyParentFilterFragment.kt", m4292l = {69}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyParentFilterFragment$onViewCreated$2$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33668a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ VocabularyParentFilterFragment f33669b;

    /* JADX INFO: renamed from: com.lingq.feature.vocabulary.filter.VocabularyParentFilterFragment$onViewCreated$2$2$1 */
    @c32(m4290c = "com.lingq.feature.vocabulary.filter.VocabularyParentFilterFragment$onViewCreated$2$2$1", m4291f = "VocabularyParentFilterFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28441 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ boolean f33670a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VocabularyParentFilterFragment f33671b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28441(VocabularyParentFilterFragment vocabularyParentFilterFragment, Continuation continuation) {
            super(2, continuation);
            this.f33671b = vocabularyParentFilterFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C28441 c28441 = new C28441(this.f33671b, continuation);
            c28441.f33670a = ((Boolean) obj).booleanValue();
            return c28441;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            C28441 c28441 = (C28441) create(bool, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c28441.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z = this.f33670a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (z) {
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635cM2136D = this.f33671b.m2106h().m2136D(R$id.nav_host_fragment_vocabulary);
                abstractComponentCallbacksC0635cM2136D.getClass();
                ((NavHostFragment) abstractComponentCallbacksC0635cM2136D).m2573c0().m22689f();
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyParentFilterFragment$onViewCreated$2$2(VocabularyParentFilterFragment vocabularyParentFilterFragment, Continuation continuation) {
        super(2, continuation);
        this.f33669b = vocabularyParentFilterFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyParentFilterFragment$onViewCreated$2$2(this.f33669b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((VocabularyParentFilterFragment$onViewCreated$2$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33668a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            VocabularyParentFilterFragment vocabularyParentFilterFragment = this.f33669b;
            c83 c83VarMo20217N2 = ((t0b) vocabularyParentFilterFragment.f33657R0.getValue()).f61727b.mo20217N2();
            C28441 c28441 = new C28441(vocabularyParentFilterFragment, null);
            this.f33668a = 1;
            if (AbstractC3224d.m15529h(c83VarMo20217N2, c28441, this) == coroutineSingletons) {
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
