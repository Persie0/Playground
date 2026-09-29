package com.lingq.feature.vocabulary.filter;

import com.lingq.core.data.repository.C1293i;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.lm4;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.filter.VocabularyFilterSelectionViewModel$networkLanguageTags$1", m4291f = "VocabularyFilterSelectionViewModel.kt", m4292l = {517}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyFilterSelectionViewModel$networkLanguageTags$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33629a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2850b f33630b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFilterSelectionViewModel$networkLanguageTags$1(C2850b c2850b, Continuation continuation) {
        super(2, continuation);
        this.f33630b = c2850b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyFilterSelectionViewModel$networkLanguageTags$1(this.f33630b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((VocabularyFilterSelectionViewModel$networkLanguageTags$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33629a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C2850b c2850b = this.f33630b;
                lm4 lm4Var = c2850b.f33681f;
                String strMo4589b2 = c2850b.f33677b.mo4589b2();
                this.f33629a = 1;
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
        } catch (Exception e) {
            e.printStackTrace();
        }
        return xfa.f68157a;
    }
}
