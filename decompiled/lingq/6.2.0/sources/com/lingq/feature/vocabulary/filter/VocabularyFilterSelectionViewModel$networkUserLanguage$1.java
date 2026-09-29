package com.lingq.feature.vocabulary.filter;

import com.lingq.core.data.repository.C1293i;
import com.lingq.core.domain.model.language.Language;
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
@c32(m4290c = "com.lingq.feature.vocabulary.filter.VocabularyFilterSelectionViewModel$networkUserLanguage$1", m4291f = "VocabularyFilterSelectionViewModel.kt", m4292l = {458}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyFilterSelectionViewModel$networkUserLanguage$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33631a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2850b f33632b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFilterSelectionViewModel$networkUserLanguage$1(C2850b c2850b, Continuation continuation) {
        super(2, continuation);
        this.f33632b = c2850b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyFilterSelectionViewModel$networkUserLanguage$1(this.f33632b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((VocabularyFilterSelectionViewModel$networkUserLanguage$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2850b c2850b = this.f33632b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33631a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                Language language = (Language) c2850b.f33677b.mo4572B0().getValue();
                if (language != null) {
                    int i2 = language.f19025b;
                    lm4 lm4Var = c2850b.f33681f;
                    this.f33631a = 1;
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
        } catch (Exception e) {
            e.printStackTrace();
        }
        return xfa.f68157a;
    }
}
