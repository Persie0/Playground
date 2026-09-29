package com.lingq.feature.reader.stats.p019ui.lingqs;

import com.lingq.core.data.repository.C1287c;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.status.CardStatus;
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
import p000.lda;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.ui.lingqs.LessonCompleteVocabularyViewModel$updateStatus$1", m4291f = "LessonCompleteVocabularyViewModel.kt", m4292l = {141, 144, 146}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteVocabularyViewModel$updateStatus$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31043a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2568b f31044b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f31045c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f31046d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteVocabularyViewModel$updateStatus$1(C2568b c2568b, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.f31044b = c2568b;
        this.f31045c = str;
        this.f31046d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteVocabularyViewModel$updateStatus$1(this.f31044b, this.f31045c, this.f31046d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteVocabularyViewModel$updateStatus$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (((com.lingq.core.data.repository.C1287c) r1).m7113b(r8, r0, r2, r11) == r6) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (((com.lingq.core.data.repository.C1287c) r1).m7133w(r3, r2, r11.f31046d, r0, r11) == r6) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7116f;
        C2568b c2568b = this.f31044b;
        ao0 ao0Var = c2568b.f31059f;
        cma cmaVar = c2568b.f31056c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31043a;
        String str = this.f31045c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            String strMo4589b2 = cmaVar.mo4589b2();
            this.f31043a = 1;
            objM7116f = ((C1287c) ao0Var).m7116f(strMo4589b2, str, this);
            if (objM7116f != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
            objM7116f = obj;
        } else {
            if (i != 2 && i != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        LessonCard lessonCard = (LessonCard) objM7116f;
        int i2 = this.f31046d;
        if (lessonCard != null) {
            if (i2 == CardStatus.Ignored.getValue()) {
                String strMo4589b3 = cmaVar.mo4589b2();
                this.f31043a = 2;
            } else {
                String strMo4589b4 = cmaVar.mo4589b2();
                Integer num = (Integer) ((C3244l) c2568b.f31067n.f9311a).getValue();
                this.f31043a = 3;
            }
        } else if (i2 == CardStatus.Ignored.getValue()) {
            wfb.m23926u(lda.m16103C(c2568b), null, null, new LessonCompleteVocabularyViewModel$updateWordStatus$1(c2568b, str, WordStatus.Ignored.getValue(), null), 3);
        } else if (i2 == CardStatus.Known.getValue()) {
            wfb.m23926u(lda.m16103C(c2568b), null, null, new LessonCompleteVocabularyViewModel$updateWordStatus$1(c2568b, str, WordStatus.Known.getValue(), null), 3);
        } else {
            wfb.m23926u(lda.m16103C(c2568b), null, null, new LessonCompleteVocabularyViewModel$onAddMeaning$1(c2568b, str, i2, null), 3);
        }
        return xfa.f68157a;
    }
}
