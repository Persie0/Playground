package com.lingq.feature.reader.stats;

import com.lingq.core.datastore.C1369b;
import com.lingq.core.domain.model.lesson.LessonCompleteData;
import com.lingq.core.domain.model.lesson.LessonReference;
import com.lingq.core.domain.model.user.Profile;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.qm7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$showBuyPremiumLesson$1", m4291f = "LessonCompleteViewModel.kt", m4292l = {1058}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteViewModel$showBuyPremiumLesson$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public LessonReference f30644a;

    /* JADX INFO: renamed from: b */
    public int f30645b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2535j f30646c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$showBuyPremiumLesson$1(C2535j c2535j, Continuation continuation) {
        super(2, continuation);
        this.f30646c = c2535j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteViewModel$showBuyPremiumLesson$1(this.f30646c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteViewModel$showBuyPremiumLesson$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LessonReference lessonReference;
        LessonReference lessonReference2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30645b;
        C2535j c2535j = this.f30646c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            LessonReference lessonReference3 = (LessonReference) ((C3244l) c2535j.f30808R.f9311a).getValue();
            qm7 qm7Var = ((C1369b) c2535j.f30832i).f18480m;
            this.f30644a = lessonReference3;
            this.f30645b = 1;
            Object objM15541t = AbstractC3224d.m15541t(qm7Var, this);
            if (objM15541t == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = objM15541t;
            lessonReference = lessonReference3;
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lessonReference = this.f30644a;
            AbstractC3193b.m15359b(obj);
        }
        int i2 = ((Profile) obj).f19671t;
        LessonCompleteData lessonCompleteData = (LessonCompleteData) ((C3244l) c2535j.f30805O.f9311a).getValue();
        c2535j.mo9320G1(c2535j.f30818b.mo4589b2(), (lessonCompleteData == null || (lessonReference2 = lessonCompleteData.f19220q) == null) ? 0 : lessonReference2.f19242b, c2535j.f30818b.mo4580K1(), i2, lessonReference != null ? lessonReference.f19241a : 0);
        return xfa.f68157a;
    }
}
