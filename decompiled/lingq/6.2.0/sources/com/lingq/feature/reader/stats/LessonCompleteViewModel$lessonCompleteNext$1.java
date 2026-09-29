package com.lingq.feature.reader.stats;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.u91;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$lessonCompleteNext$1", m4291f = "LessonCompleteViewModel.kt", m4292l = {257}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteViewModel$lessonCompleteNext$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f30580a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f30581b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ List f30582c;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LessonCompleteViewModel$lessonCompleteNext$1 lessonCompleteViewModel$lessonCompleteNext$1 = new LessonCompleteViewModel$lessonCompleteNext$1(3, (Continuation) obj3);
        lessonCompleteViewModel$lessonCompleteNext$1.f30581b = (e83) obj;
        lessonCompleteViewModel$lessonCompleteNext$1.f30582c = (List) obj2;
        return lessonCompleteViewModel$lessonCompleteNext$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f30581b;
        List list = this.f30582c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30580a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            Object objM22591I0 = u91.m22591I0(list);
            this.f30581b = null;
            this.f30582c = null;
            this.f30580a = 1;
            if (e83Var.emit(objM22591I0, this) == coroutineSingletons) {
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
