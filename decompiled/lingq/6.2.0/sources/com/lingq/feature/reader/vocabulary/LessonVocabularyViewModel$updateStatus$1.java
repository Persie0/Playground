package com.lingq.feature.reader.vocabulary;

import com.lingq.core.data.repository.C1287c;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.status.TokenStatus;
import com.lingq.core.domain.model.status.WordStatus;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.ao0;
import p000.c32;
import p000.cma;
import p000.k75;
import p000.lda;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.y7d;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.vocabulary.LessonVocabularyViewModel$updateStatus$1", m4291f = "LessonVocabularyViewModel.kt", m4292l = {207, 210, 212}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonVocabularyViewModel$updateStatus$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31638a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2610a f31639b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f31640c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ TokenStatus f31641d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonVocabularyViewModel$updateStatus$1(C2610a c2610a, String str, TokenStatus tokenStatus, Continuation continuation) {
        super(2, continuation);
        this.f31639b = c2610a;
        this.f31640c = str;
        this.f31641d = tokenStatus;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonVocabularyViewModel$updateStatus$1(this.f31639b, this.f31640c, this.f31641d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonVocabularyViewModel$updateStatus$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (((com.lingq.core.data.repository.C1287c) r1).m7113b(r0, r11, r9, r10) == r3) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        if (((com.lingq.core.data.repository.C1287c) r1).m7133w(r5, r10.f31640c, r7, r8, r10) == r3) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2610a c2610a = this.f31639b;
        ao0 ao0Var = c2610a.f31658d;
        cma cmaVar = c2610a.f31657c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31638a;
        String str = this.f31640c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            String strMo4589b2 = cmaVar.mo4589b2();
            this.f31638a = 1;
            obj = ((C1287c) ao0Var).m7116f(strMo4589b2, str, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2 && i != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        LessonCard lessonCard = (LessonCard) obj;
        TokenStatus tokenStatus = this.f31641d;
        if (lessonCard == null) {
            int i2 = k75.f46813a[tokenStatus.ordinal()];
            if (i2 == 1) {
                wfb.m23926u(lda.m16103C(c2610a), null, null, new LessonVocabularyViewModel$updateWordStatus$1(c2610a, str, WordStatus.Ignored.getValue(), null), 3);
            } else if (i2 != 2) {
                c2610a.m9528V2(y7d.m24986e(tokenStatus), str);
            } else {
                wfb.m23926u(lda.m16103C(c2610a), null, null, new LessonVocabularyViewModel$updateWordStatus$1(c2610a, str, WordStatus.Known.getValue(), null), 3);
            }
        } else if (tokenStatus == TokenStatus.Ignored) {
            String strMo4589b3 = cmaVar.mo4589b2();
            int iM24986e = y7d.m24986e(tokenStatus);
            this.f31638a = 2;
        } else {
            String strMo4589b4 = cmaVar.mo4589b2();
            int iM24986e2 = y7d.m24986e(tokenStatus);
            Integer num = (Integer) ((C3244l) c2610a.f31667m.f9311a).getValue();
            this.f31638a = 3;
        }
        return xfa.f68157a;
    }
}
