package com.lingq.feature.reader.stats.p019ui.all;

import com.lingq.core.analytics.data.LqAnalyticsValues$LingQCreatedLocation;
import com.lingq.core.data.repository.C1287c;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.domain.token.C1536d;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.ao0;
import p000.c32;
import p000.cma;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsViewModel$onAddMeaning$1", m4291f = "LessonCompleteAllWordsViewModel.kt", m4292l = {239, 241}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteAllWordsViewModel$onAddMeaning$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30931a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2556c f30932b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f30933c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f30934d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteAllWordsViewModel$onAddMeaning$1(C2556c c2556c, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.f30932b = c2556c;
        this.f30933c = str;
        this.f30934d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteAllWordsViewModel$onAddMeaning$1(this.f30932b, this.f30933c, this.f30934d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteAllWordsViewModel$onAddMeaning$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8220d;
        C2556c c2556c = this.f30932b;
        cma cmaVar = c2556c.f30955c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30931a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (!cmaVar.mo4595s1()) {
                c2556c.f30978z.mo4677k(xfaVar);
                return xfaVar;
            }
            C1536d c1536d = c2556c.f30964l;
            String strMo4589b2 = cmaVar.mo4589b2();
            String strMo4580K1 = cmaVar.mo4580K1();
            this.f30931a = 1;
            objM8220d = c1536d.m8220d(strMo4589b2, strMo4580K1, this.f30933c, this);
            if (objM8220d != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        objM8220d = obj;
        TokenMeaning tokenMeaning = (TokenMeaning) objM8220d;
        if (tokenMeaning != null) {
            ao0 ao0Var = c2556c.f30958f;
            int iIntValue = ((Number) ((C3244l) c2556c.f30966n.f9311a).getValue()).intValue();
            String strMo4589b3 = cmaVar.mo4589b2();
            String value = LqAnalyticsValues$LingQCreatedLocation.VocabImport.getValue();
            this.f30931a = 2;
            if (((C1287c) ao0Var).m7118h(iIntValue, strMo4589b3, this.f30933c, tokenMeaning, this.f30934d, "", value, false, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
    }
}
