package com.lingq.feature.reader.stats;

import com.lingq.core.common.util.AbstractC1263a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.gm5;
import p000.ic7;
import p000.lda;
import p000.sc9;
import p000.t66;
import p000.un1;
import p000.ux5;
import p000.xfa;
import p000.yc7;
import p000.zc7;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteRouteKt$LessonCompleteRoute$4$1", m4291f = "LessonCompleteRoute.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteRouteKt$LessonCompleteRoute$4$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2535j f30524a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f30525b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sc9 f30526c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t66 f30527d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ t66 f30528e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ t66 f30529f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteRouteKt$LessonCompleteRoute$4$1(C2535j c2535j, t66 t66Var, sc9 sc9Var, t66 t66Var2, t66 t66Var3, t66 t66Var4, Continuation continuation) {
        super(2, continuation);
        this.f30524a = c2535j;
        this.f30525b = t66Var;
        this.f30526c = sc9Var;
        this.f30527d = t66Var2;
        this.f30528e = t66Var3;
        this.f30529f = t66Var4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteRouteKt$LessonCompleteRoute$4$1(this.f30524a, this.f30525b, this.f30526c, this.f30527d, this.f30528e, this.f30529f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LessonCompleteRouteKt$LessonCompleteRoute$4$1 lessonCompleteRouteKt$LessonCompleteRoute$4$1 = (LessonCompleteRouteKt$LessonCompleteRoute$4$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        lessonCompleteRouteKt$LessonCompleteRoute$4$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2535j c2535j = this.f30524a;
        C3244l c3244l = c2535j.f30839l0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        zc7 zc7Var = (zc7) this.f30525b.getValue();
        boolean z = zc7Var instanceof ic7;
        t66 t66Var = this.f30529f;
        t66 t66Var2 = this.f30528e;
        t66 t66Var3 = this.f30527d;
        sc9 sc9Var = this.f30526c;
        if (z) {
            c3244l.m15571i(null);
            ic7 ic7Var = (ic7) zc7Var;
            sc9Var.m21223i(ic7Var.f43934a);
            t66Var3.setValue(ic7Var.f43935b);
            t66Var2.setValue(Boolean.FALSE);
            t66Var.setValue(Boolean.TRUE);
        } else if (zc7Var instanceof yc7) {
            c3244l.m15571i(null);
            yc7 yc7Var = (yc7) zc7Var;
            String str = yc7Var.f69635b;
            int i = yc7Var.f69634a;
            if (yc7Var.f69636c) {
                sc9Var.m21223i(i);
                t66Var3.setValue(str);
                Boolean bool = Boolean.TRUE;
                t66Var2.setValue(bool);
                t66Var.setValue(bool);
            } else {
                AbstractC1263a.m7047b(lda.m16103C(c2535j), c2535j.f30802L, ux5.m22988k(i, "removeLessonFromPlaylist "), new LessonCompleteViewModel$removeLessonFromPlaylist$1(c2535j, str, i, null));
            }
        } else if (zc7Var != null) {
            gm5.m12750e();
            return null;
        }
        return xfa.f68157a;
    }
}
