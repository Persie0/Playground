package com.lingq.feature.reader.stats;

import com.lingq.core.analytics.C1240a;
import com.lingq.core.domain.model.lesson.LessonReference;
import com.lingq.feature.reader.R$id;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.dh9;
import p000.t66;
import p000.ud6;
import p000.un1;
import p000.w41;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteRouteKt$LessonCompleteRoute$3$1", m4291f = "LessonCompleteRoute.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteRouteKt$LessonCompleteRoute$3$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2535j f30519a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ud6 f30520b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w41 f30521c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t66 f30522d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ dh9 f30523e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteRouteKt$LessonCompleteRoute$3$1(C2535j c2535j, ud6 ud6Var, w41 w41Var, t66 t66Var, dh9 dh9Var, Continuation continuation) {
        super(2, continuation);
        this.f30519a = c2535j;
        this.f30520b = ud6Var;
        this.f30521c = w41Var;
        this.f30522d = t66Var;
        this.f30523e = dh9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteRouteKt$LessonCompleteRoute$3$1(this.f30519a, this.f30520b, this.f30521c, this.f30522d, this.f30523e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LessonCompleteRouteKt$LessonCompleteRoute$3$1 lessonCompleteRouteKt$LessonCompleteRoute$3$1 = (LessonCompleteRouteKt$LessonCompleteRoute$3$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        lessonCompleteRouteKt$LessonCompleteRoute$3$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (((Boolean) this.f30522d.getValue()).booleanValue()) {
            C2535j c2535j = this.f30519a;
            C3244l c3244l = c2535j.f30835j0;
            Boolean bool = Boolean.FALSE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            LessonReference lessonReference = (LessonReference) this.f30523e.getValue();
            ud6 ud6Var = this.f30520b;
            if (lessonReference != null) {
                ((C1240a) c2535j.f30830h).m7025f("Next lesson button clicked", null);
                AbstractC2527c.m9456b(c2535j, false);
                ud6Var.m22690g(R$id.nav_graph_reader, true);
                AbstractC2527c.m9457c(lessonReference, this.f30521c);
            } else {
                AbstractC2527c.m9456b(c2535j, true);
                ud6Var.f63760b.m13133l(R$id.nav_graph_reader, true);
            }
        }
        return xfa.f68157a;
    }
}
