package com.lingq.feature.reader.stats.p019ui.lingqs;

import com.lingq.core.analytics.data.LqAnalyticsValues$LingQCreatedLocation;
import com.lingq.core.data.repository.C1310z;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.token.TokenMeaning;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.ao0;
import p000.c32;
import p000.cma;
import p000.s7b;
import p000.u91;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.ui.lingqs.LessonCompleteVocabularyViewModel$onAddMeaning$1", m4291f = "LessonCompleteVocabularyViewModel.kt", m4292l = {189, 192}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteVocabularyViewModel$onAddMeaning$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31032a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2568b f31033b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f31034c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f31035d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteVocabularyViewModel$onAddMeaning$1(C2568b c2568b, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.f31033b = c2568b;
        this.f31034c = str;
        this.f31035d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteVocabularyViewModel$onAddMeaning$1(this.f31033b, this.f31034c, this.f31035d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteVocabularyViewModel$onAddMeaning$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        if (((com.lingq.core.data.repository.C1287c) r5).m7118h(r6, r7, r8, r9, r14.f31035d, "", r12, false, r14) == r2) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2568b c2568b = this.f31033b;
        cma cmaVar = c2568b.f31056c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31032a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        s7b s7bVar = c2568b.f31060g;
        String strMo4589b2 = cmaVar.mo4589b2();
        this.f31032a = 1;
        obj = ((C1310z) s7bVar).m7425d(strMo4589b2, this.f31034c, this);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
        LessonWord lessonWord = (LessonWord) obj;
        if (lessonWord != null && (r9 = (TokenMeaning) u91.m22591I0(lessonWord.f19319f)) != null) {
            ao0 ao0Var = c2568b.f31059f;
            int iIntValue = ((Number) ((C3244l) c2568b.f31067n.f9311a).getValue()).intValue();
            String strMo4589b3 = cmaVar.mo4589b2();
            String str = lessonWord.f19314a;
            String value = LqAnalyticsValues$LingQCreatedLocation.VocabImport.getValue();
            this.f31032a = 2;
        }
        return xfa.f68157a;
    }
}
