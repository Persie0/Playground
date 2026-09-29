package com.lingq.feature.reader.old;

import com.lingq.core.analytics.data.LqAnalyticsValues$LingQCreatedLocation;
import com.lingq.core.data.repository.C1287c;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.domain.token.C1534b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.ao0;
import p000.c32;
import p000.cma;
import p000.sca;
import p000.u91;
import p000.un1;
import p000.vj6;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$onAddMeaning$1", m4291f = "ReaderPageViewModel.kt", m4292l = {1434, 1435, 1440}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageViewModel$onAddMeaning$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28663a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2411m f28664b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LessonWord f28665c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f28666d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f28667e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageViewModel$onAddMeaning$1(C2411m c2411m, LessonWord lessonWord, int i, String str, Continuation continuation) {
        super(2, continuation);
        this.f28664b = c2411m;
        this.f28665c = lessonWord;
        this.f28666d = i;
        this.f28667e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageViewModel$onAddMeaning$1(this.f28664b, this.f28665c, this.f28666d, this.f28667e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageViewModel$onAddMeaning$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0090  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r2 == r9) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8212a;
        Object objM23348x;
        TokenMeaning tokenMeaning;
        ao0 ao0Var;
        String strMo4589b2;
        String str;
        int value;
        String value2;
        C2411m c2411m = this.f28664b;
        cma cmaVar = c2411m.f29223b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28663a;
        xfa xfaVar = xfa.f68157a;
        LessonWord lessonWord = this.f28665c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1534b c1534b = c2411m.f29243l;
            this.f28663a = 1;
            objM8212a = c1534b.m8212a(true, this);
            if (objM8212a != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
            objM8212a = obj;
        } else {
            if (i != 2) {
                if (i == 3) {
                    AbstractC3193b.m15359b(obj);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            objM23348x = obj;
        }
        sca.m21224J0(c2411m.f29235h, (String) objM23348x, false, 12);
        if (cmaVar.mo4595s1()) {
            c2411m.f29236h0.mo4677k(xfaVar);
            return xfaVar;
        }
        tokenMeaning = (TokenMeaning) u91.m22591I0(lessonWord.f19319f);
        if (tokenMeaning != null) {
            ao0Var = c2411m.f29229e;
            strMo4589b2 = cmaVar.mo4589b2();
            str = lessonWord.f19314a;
            value = CardStatus.New.getValue();
            value2 = LqAnalyticsValues$LingQCreatedLocation.Sentence.getValue();
            this.f28663a = 3;
            if (((C1287c) ao0Var).m7118h(this.f28666d, strMo4589b2, str, tokenMeaning, value, this.f28667e, value2, false, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
        if (!((Boolean) objM8212a).booleanValue()) {
            if (cmaVar.mo4595s1()) {
                c2411m.f29236h0.mo4677k(xfaVar);
                return xfaVar;
            }
            tokenMeaning = (TokenMeaning) u91.m22591I0(lessonWord.f19319f);
            if (tokenMeaning != null) {
                ao0Var = c2411m.f29229e;
                strMo4589b2 = cmaVar.mo4589b2();
                str = lessonWord.f19314a;
                value = CardStatus.New.getValue();
                value2 = LqAnalyticsValues$LingQCreatedLocation.Sentence.getValue();
                this.f28663a = 3;
                if (((C1287c) ao0Var).m7118h(this.f28666d, strMo4589b2, str, tokenMeaning, value, this.f28667e, value2, false, this) == coroutineSingletons) {
                }
            }
            return xfaVar;
        }
        vj6 vj6Var = c2411m.f29246n;
        String strMo4589b3 = cmaVar.mo4589b2();
        this.f28663a = 2;
        objM23348x = vj6Var.m23348x(strMo4589b3, lessonWord);
        return coroutineSingletons;
    }
}
