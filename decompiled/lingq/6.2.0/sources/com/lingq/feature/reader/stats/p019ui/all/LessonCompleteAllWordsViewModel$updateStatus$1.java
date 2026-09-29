package com.lingq.feature.reader.stats.p019ui.all;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
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
@c32(m4290c = "com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsViewModel$updateStatus$1", m4291f = "LessonCompleteAllWordsViewModel.kt", m4292l = {ModuleDescriptor.MODULE_VERSION, 188, 190}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteAllWordsViewModel$updateStatus$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30942a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2556c f30943b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f30944c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f30945d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteAllWordsViewModel$updateStatus$1(C2556c c2556c, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.f30943b = c2556c;
        this.f30944c = str;
        this.f30945d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteAllWordsViewModel$updateStatus$1(this.f30943b, this.f30944c, this.f30945d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteAllWordsViewModel$updateStatus$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (((com.lingq.core.data.repository.C1287c) r1).m7113b(r4, r11, r9, r10) == r3) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (((com.lingq.core.data.repository.C1287c) r1).m7133w(r11, r10.f30944c, r10.f30945d, r8, r10) == r3) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2556c c2556c = this.f30943b;
        ao0 ao0Var = c2556c.f30958f;
        cma cmaVar = c2556c.f30955c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30942a;
        String str = this.f30944c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            String strMo4589b2 = cmaVar.mo4589b2();
            this.f30942a = 1;
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
        int i2 = this.f30945d;
        if (lessonCard != null) {
            if (i2 == CardStatus.Ignored.getValue()) {
                String strMo4589b3 = cmaVar.mo4589b2();
                this.f30942a = 2;
            } else {
                String strMo4589b4 = cmaVar.mo4589b2();
                Integer num = (Integer) ((C3244l) c2556c.f30966n.f9311a).getValue();
                this.f30942a = 3;
            }
        } else if (i2 == CardStatus.Ignored.getValue()) {
            wfb.m23926u(lda.m16103C(c2556c), null, null, new LessonCompleteAllWordsViewModel$updateWordStatus$1(c2556c, str, WordStatus.Ignored.getValue(), null), 3);
        } else if (i2 == CardStatus.Known.getValue()) {
            wfb.m23926u(lda.m16103C(c2556c), null, null, new LessonCompleteAllWordsViewModel$updateWordStatus$1(c2556c, str, WordStatus.Known.getValue(), null), 3);
        } else {
            str.getClass();
            wfb.m23926u(lda.m16103C(c2556c), null, null, new LessonCompleteAllWordsViewModel$onAddMeaning$1(c2556c, str, i2, null), 3);
        }
        return xfa.f68157a;
    }
}
