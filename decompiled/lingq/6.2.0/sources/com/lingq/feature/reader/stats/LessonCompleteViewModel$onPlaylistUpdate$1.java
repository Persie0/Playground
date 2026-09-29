package com.lingq.feature.reader.stats;

import com.lingq.core.domain.model.lesson.LessonCompleteData;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c18;
import p000.c32;
import p000.ic7;
import p000.un1;
import p000.xfa;
import p000.yc7;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$onPlaylistUpdate$1", m4291f = "LessonCompleteViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteViewModel$onPlaylistUpdate$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2535j f30619a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$onPlaylistUpdate$1(C2535j c2535j, Continuation continuation) {
        super(2, continuation);
        this.f30619a = c2535j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteViewModel$onPlaylistUpdate$1(this.f30619a, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LessonCompleteViewModel$onPlaylistUpdate$1 lessonCompleteViewModel$onPlaylistUpdate$1 = (LessonCompleteViewModel$onPlaylistUpdate$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        lessonCompleteViewModel$onPlaylistUpdate$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2535j c2535j = this.f30619a;
        C3244l c3244l = c2535j.f30839l0;
        c18 c18Var = c2535j.f30849q0;
        int iIntValue = ((Number) ((C3244l) c18Var.f9311a).getValue()).intValue();
        c18 c18Var2 = c2535j.f30805O;
        if (iIntValue > 0) {
            LessonCompleteData lessonCompleteData = (LessonCompleteData) ((C3244l) c18Var2.f9311a).getValue();
            if (lessonCompleteData != null) {
                int i = lessonCompleteData.f19204a;
                String str = lessonCompleteData.f19214k;
                yc7 yc7Var = new yc7(str != null ? str : "", i, ((Number) ((C3244l) c18Var.f9311a).getValue()).intValue() > 1);
                c3244l.getClass();
                c3244l.m15572j(null, yc7Var);
            }
        } else {
            LessonCompleteData lessonCompleteData2 = (LessonCompleteData) ((C3244l) c18Var2.f9311a).getValue();
            if (lessonCompleteData2 != null) {
                int i2 = lessonCompleteData2.f19204a;
                String str2 = lessonCompleteData2.f19214k;
                ic7 ic7Var = new ic7(i2, str2 != null ? str2 : "");
                c3244l.getClass();
                c3244l.m15572j(null, ic7Var);
            }
        }
        return xfa.f68157a;
    }
}
