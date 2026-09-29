package com.lingq.feature.vocabulary;

import com.lingq.feature.vocabulary.data.VocabularyContentFilter;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.ff6;
import p000.hf6;
import p000.swa;
import p000.t66;
import p000.txa;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.VocabularyScreenKt$VocabularyRoute$5$1", m4291f = "VocabularyScreen.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyScreenKt$VocabularyRoute$5$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2824b f33507a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f33508b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyScreenKt$VocabularyRoute$5$1(C2824b c2824b, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f33507a = c2824b;
        this.f33508b = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyScreenKt$VocabularyRoute$5$1(this.f33507a, this.f33508b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        VocabularyScreenKt$VocabularyRoute$5$1 vocabularyScreenKt$VocabularyRoute$5$1 = (VocabularyScreenKt$VocabularyRoute$5$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        vocabularyScreenKt$VocabularyRoute$5$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        VocabularyContentFilter vocabularyContentFilter;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        hf6 hf6Var = (hf6) this.f33508b.getValue();
        ff6 ff6Var = hf6Var instanceof ff6 ? (ff6) hf6Var : null;
        xfa xfaVar = xfa.f68157a;
        if (ff6Var == null) {
            return xfaVar;
        }
        txa txaVar = VocabularyContentFilter.Companion;
        String str = ff6Var.f38999a;
        txaVar.getClass();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (lowerCase.equals("phrases")) {
            vocabularyContentFilter = VocabularyContentFilter.Phrases;
        } else {
            vocabularyContentFilter = lowerCase.equals("srs") ? VocabularyContentFilter.SrsDue : VocabularyContentFilter.All;
        }
        this.f33507a.m9744V2(new swa(vocabularyContentFilter));
        return xfaVar;
    }
}
