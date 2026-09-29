package com.lingq.feature.reader.stats.p019ui.words;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.t66;
import p000.ud6;
import p000.un1;
import p000.wd6;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.ui.words.LessonCompleteDealBlueScreenKt$LessonCompleteDealBlueRoute$1$1", m4291f = "LessonCompleteDealBlueScreen.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteDealBlueScreenKt$LessonCompleteDealBlueRoute$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ t66 f31083a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f31084b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wd6 f31085c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ud6 f31086d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f31087e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteDealBlueScreenKt$LessonCompleteDealBlueRoute$1$1(t66 t66Var, t66 t66Var2, wd6 wd6Var, ud6 ud6Var, int i, Continuation continuation) {
        super(2, continuation);
        this.f31083a = t66Var;
        this.f31084b = t66Var2;
        this.f31085c = wd6Var;
        this.f31086d = ud6Var;
        this.f31087e = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteDealBlueScreenKt$LessonCompleteDealBlueRoute$1$1(this.f31083a, this.f31084b, this.f31085c, this.f31086d, this.f31087e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LessonCompleteDealBlueScreenKt$LessonCompleteDealBlueRoute$1$1 lessonCompleteDealBlueScreenKt$LessonCompleteDealBlueRoute$1$1 = (LessonCompleteDealBlueScreenKt$LessonCompleteDealBlueRoute$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        lessonCompleteDealBlueScreenKt$LessonCompleteDealBlueRoute$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        List list = (List) this.f31083a.getValue();
        if (list != null && list.isEmpty()) {
            t66 t66Var = this.f31084b;
            if (((Boolean) t66Var.getValue()) != null) {
                AbstractC2572b.m9485b(this.f31085c, this.f31086d, this.f31087e, t66Var, true);
            }
        }
        return xfa.f68157a;
    }
}
