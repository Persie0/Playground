package com.lingq.feature.reader.stats.p019ui.lingqs;

import com.lingq.core.data.repository.C1306v;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.w3a;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.ui.lingqs.LessonCompleteVocabularyViewModel$updatePopularMeanings$1", m4291f = "LessonCompleteVocabularyViewModel.kt", m4292l = {277}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteVocabularyViewModel$updatePopularMeanings$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31039a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2568b f31040b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f31041c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f31042d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteVocabularyViewModel$updatePopularMeanings$1(C2568b c2568b, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f31040b = c2568b;
        this.f31041c = str;
        this.f31042d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteVocabularyViewModel$updatePopularMeanings$1(this.f31040b, this.f31041c, this.f31042d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteVocabularyViewModel$updatePopularMeanings$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31039a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C2568b c2568b = this.f31040b;
                w3a w3aVar = c2568b.f31061h;
                String str = this.f31041c;
                String str2 = this.f31042d;
                String strMo4580K1 = c2568b.f31056c.mo4580K1();
                this.f31039a = 1;
                if (((C1306v) w3aVar).m7377c(str, str2, strMo4580K1, this) == coroutineSingletons) {
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
