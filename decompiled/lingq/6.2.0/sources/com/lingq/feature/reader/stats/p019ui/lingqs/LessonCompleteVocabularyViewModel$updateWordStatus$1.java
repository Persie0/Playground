package com.lingq.feature.reader.stats.p019ui.lingqs;

import com.lingq.core.data.repository.C1310z;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.s7b;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.ui.lingqs.LessonCompleteVocabularyViewModel$updateWordStatus$1", m4291f = "LessonCompleteVocabularyViewModel.kt", m4292l = {178}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteVocabularyViewModel$updateWordStatus$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31047a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2568b f31048b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f31049c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f31050d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteVocabularyViewModel$updateWordStatus$1(C2568b c2568b, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f31048b = c2568b;
        this.f31049c = str;
        this.f31050d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteVocabularyViewModel$updateWordStatus$1(this.f31048b, this.f31049c, this.f31050d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteVocabularyViewModel$updateWordStatus$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31047a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2568b c2568b = this.f31048b;
            s7b s7bVar = c2568b.f31060g;
            String strMo4589b2 = c2568b.f31056c.mo4589b2();
            int iIntValue = ((Number) ((C3244l) c2568b.f31067n.f9311a).getValue()).intValue();
            this.f31047a = 1;
            if (((C1310z) s7bVar).m7429h(iIntValue, strMo4589b2, this.f31049c, this.f31050d, "", this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
