package com.lingq.feature.reader.content;

import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.h0a;
import p000.rm5;
import p000.sm5;
import p000.u91;
import p000.xfa;
import p000.yz4;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.LessonContentStateHolder$loadLesson$3", m4291f = "LessonContentStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonContentStateHolder$loadLesson$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f27879a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2260a f27880b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonContentStateHolder$loadLesson$3(C2260a c2260a, Continuation continuation) {
        super(2, continuation);
        this.f27880b = c2260a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LessonContentStateHolder$loadLesson$3 lessonContentStateHolder$loadLesson$3 = new LessonContentStateHolder$loadLesson$3(this.f27880b, continuation);
        lessonContentStateHolder$loadLesson$3.f27879a = obj;
        return lessonContentStateHolder$loadLesson$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LessonContentStateHolder$loadLesson$3 lessonContentStateHolder$loadLesson$3 = (LessonContentStateHolder$loadLesson$3) create((Map) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        lessonContentStateHolder$loadLesson$3.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Map map = (Map) this.f27879a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        rm5 rm5Var = sm5.Companion;
        String str = "[SentenceTranslations] Flow emission: " + map.size() + " translations, indices=" + u91.m22613e1(map.keySet());
        rm5Var.getClass();
        h0a.f41641a.mo11431b(str, new Object[0]);
        C3244l c3244l = this.f27880b.f27949o;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, yz4.m25387a((yz4) value, null, null, null, null, null, null, false, map, false, false, null, null, null, 0, 0, false, null, null, false, false, null, 0, false, 8388479)));
        return xfa.f68157a;
    }
}
